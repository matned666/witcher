package mat.ned.mechanics;

import mat.ned.mechanics.magic.Magic;
import mat.ned.mechanics.maps.placesMaps.Direction;
import mat.ned.mechanics.maps.placesMaps.Place;
import mat.ned.mechanics.maps.placesMaps.fields.MapField;
import mat.ned.mechanics.maps.placesMaps.fields.Water;

public abstract class Species {

    protected int hp;
    protected int weakenAmount;
    protected int mana;
    protected int rowPosition;
    protected int columnPosition;
    protected Place actualMap;
    protected MapField actualField;
    protected boolean isWaterBreathing;
    protected String name;
    int rowMove;
    int columnMove;


    public abstract String typeOfSpecies();

    public abstract String toString();


    public boolean isAlive() {
        return this.hp > 0;
    }

    public void wasHit(int hp) {
        if(isAlive())this.hp -= hp;
    }

    public void attack(Species character, int hp) {
        character.wasHit(hp-weakenAmount);
    }

    public int getHitPoints() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public int getWeaknessLevel() {
        return weakenAmount;
    }

    public void weaken(int amount) {
        weakenAmount += amount;
    }

    public void magicCast(Magic magic, Species species) {
        if(mana - magic.getCastCost() >= 0 ) {
            magic.cast(species);
            magic.castEffects(this);
            mana = mana - magic.getCastCost();
        }else{
            System.out.println("Impossible move.");
        }
    }
    public void setActualField(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
        actualField = actualMap.getMatrix()[rowPosition][columnPosition];
        actualField.setAccessible(false);
    }

    public void setActualMap(Place actualMap) {
        this.actualMap = actualMap;
    }


    public void moveDirection(Direction direction) {
        switch (direction){
            case LEFT:
                rowMove = 0;
                columnMove = -1;
                break;
            case RIGHT:
                rowMove = 0;
                columnMove = 1;
                break;
            case UP:
                rowMove = -1;
                columnMove = 0;
                break;
            case DOWN:
                rowMove = 1;
                columnMove = 0;
                break;
            default:
        }
    }

    public void move(Direction direction){
        moveDirection(direction);
        try{
            if(actualMap.getMatrix()[rowPosition+rowMove][columnPosition+columnMove].isAccessible()) {
                actualField.setAccessible(true);
                setActualField(rowPosition + rowMove, columnPosition + columnMove);
                actualField.setAccessible(false);
                getEffect(this);
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Koniec planszy");
            setActualField(rowPosition,columnPosition);
        }
    }

    private void getEffect(Species species){
        if (actualField.getClass().getSimpleName().equals(Water.class.getSimpleName()) && !isWaterBreathing && this.isAlive())
            if(species.getWeaknessLevel() < species.getHitPoints())  species.weaken(1);
            else species.wasHit(1);
    }


    public MapField getActualPositionField(){
        return actualField;
    }


    public String getName() {
        return name;
    }

    public void action(Direction direction){
        moveDirection(direction);
        try{
            actualMap.getMatrix()[rowPosition+rowMove][columnPosition+columnMove].action(this);
        }catch(Exception ex){

        }
    }
}
