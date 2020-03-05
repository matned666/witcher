package mat.ned.mechanics.species;

class Stats {
    private int hp;
    private int strength;

    private int mana;
    private int dexterity;
    private int Learning;
    private int willpower;
    private int appearance;
    private int charisma;
    private int toughness;
    private int perception;

    private int fightingSkill;
    private int speed;

    private Stats(StatsBuilder statsBuilder) {
        this.hp = statsBuilder.hp;
        this.strength = statsBuilder.strength;
        this.mana = statsBuilder.mana;
        this.dexterity = statsBuilder.dexterity;
        this.Learning = statsBuilder.Learning;
        this.willpower = statsBuilder.willpower;
        this.appearance = statsBuilder.appearance;
        this.charisma = statsBuilder.charisma;
        this.toughness = statsBuilder.toughness;
        this.perception = statsBuilder.perception;
        this.fightingSkill = statsBuilder.fightingSkill;
        this.speed = statsBuilder.speed;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public void setLearning(int learning) {
        Learning = learning;
    }
    public void setWillpower(int willpower) {
        this.willpower = willpower;
    }
    public void setAppearance(int appearance) {
        this.appearance = appearance;
    }
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
    public void setToughness(int toughness) {
        this.toughness = toughness;
    }
    public void setPerception(int perception) {
        this.perception = perception;
    }
    public void setFightingSkill(int fightingSkill) {
        this.fightingSkill = fightingSkill;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }
    public int getStrength() {
        return strength;
    }
    public int getMana() {
        return mana;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int getLearning() {
        return Learning;
    }
    public int getWillpower() {
        return willpower;
    }
    public int getAppearance() {
        return appearance;
    }
    public int getCharisma() {
        return charisma;
    }
    public int getToughness() {
        return toughness;
    }
    public int getPerception() {
        return perception;
    }
    public int getFightingSkill() {
        return fightingSkill;
    }
    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "hp=" + hp +
                ", strength=" + strength +
                ", mana=" + mana +
                ", dexterity=" + dexterity +
                ", Learning=" + Learning +
                ", willpower=" + willpower +
                ", appearance=" + appearance +
                ", charisma=" + charisma +
                ", toughness=" + toughness +
                ", perception=" + perception +
                ", fightingSkill=" + fightingSkill +
                ", speed=" + speed +
                '}';
    }











    // >--------------BUILDER---------------<
    public static class StatsBuilder {

        private int hp;
        private int strength;

        private int mana;
        private int dexterity;
        private int Learning;
        private int willpower;
        private int appearance;
        private int charisma;
        private int toughness;
        private int perception;

        private int fightingSkill;
        private int speed;

        public StatsBuilder(int hp, int strength) {
            this.hp = hp;
            this.strength = strength;
        }

        StatsBuilder mana(int mana) {
            this.mana = mana;
            return this;
        }

        StatsBuilder dexterity(int dexterity) {
            this.dexterity = dexterity;
            return this;
        }

        StatsBuilder Learning(int Learning) {
            this.Learning = Learning;
            return this;
        }

        StatsBuilder willpower(int willpower) {
            this.willpower = willpower;
            return this;
        }

        StatsBuilder appearance(int appearance) {
            this.appearance = appearance;
            return this;
        }

        StatsBuilder charisma(int charisma) {
            this.charisma = charisma;
            return this;
        }

        StatsBuilder toughness(int toughness) {
            this.toughness = toughness;
            return this;
        }

        StatsBuilder perception(int perception) {
            this.perception = perception;
            return this;
        }

        StatsBuilder fightingSkill(int fightingSkill) {
            this.fightingSkill = fightingSkill;
            return this;
        }

        StatsBuilder speed(int speed) {
            this.speed = speed;
            return this;
        }

        Stats build(){
            return new Stats(this);
        }
    }

}
