package mat.ned.mechanics.maps.placesMaps;

import mat.ned.mechanics.maps.worldMap.MapStageType;

import java.io.*;

public abstract class RandomRoadPlace extends Place {
    int TREE_CHANCE;
    int BUSH_CHANCE;
    int WATER_CHANCE;
    int SWAMP_CHANCE;

    private String matrix;


    private int numberOfFields;

    public RandomRoadPlace() throws IOException {
        numberOfFields = ROWS_NUMBER_FOR_RANDOM_PLACES * COLUMNS_NUMBER_FOR_RANDOM_PLACES;
        this.isAccessible = true;
        this.getPlaceType = MapStageType.FORREST;
        path = "src/main/resources/RandomPlace.map";
        saveRandomPlace();
        splitLoadedDataToMapArray(path);
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public boolean isAccessible() {
        return this.isAccessible;
    }

    @Override
    public void action() {

    }

    @Override
    public MapStageType getPlaceType() {
        return this.getPlaceType;
    }

    @Override
    public String getFileSign() {
        return null;
    }

    void saveRandomPlace() throws IOException {
        File file = new File(path);
        generateMatrix();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(matrix);
        writer.close();
    }

    private void generateMatrix() {
        StringBuilder temp = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < ROWS_NUMBER_FOR_RANDOM_PLACES; i++) {
            for (int j = 0; j < COLUMNS_NUMBER_FOR_RANDOM_PLACES; j++) {
                if(j>COLUMNS_NUMBER_FOR_RANDOM_PLACES/2-5 && j < COLUMNS_NUMBER_FOR_RANDOM_PLACES/2+5)
                    temp.append("*");
                else {
                    if (chanceShooter(TREE_CHANCE)) temp.append("P");
                    else if (chanceShooter(BUSH_CHANCE)) temp.append("x");
                    else if (chanceShooter(WATER_CHANCE)) temp.append("$");
                    else if (chanceShooter(SWAMP_CHANCE)) temp.append("%");
                    else temp.append("_");
                }
                counter++;
            }
            if (counter != numberOfFields) temp.append(System.getProperty("line.separator"));
        }
        matrix = temp.toString();

    }

    private boolean chanceShooter(int chance){
        int randomer = (int)(Math.random()*1000);
        return randomer < chance;
    }


}
