package mat.ned.mechanics.movement;

public class Dies {

    public static final int DIE_TEST = 1000;

    public static int trow(int numberOfDies, int dieSize){
        int result = 0;
        for (int i = 1; i <= numberOfDies; i++) {
            result += die(dieSize);
        }
        return result;
    }


    private static int die(int dieSize) {
        int trow = (int) (Math.random()*(dieSize*DIE_TEST));
        for (int i = 1; i <= dieSize ; i++) {
            if(trow > (i-1)*DIE_TEST && trow < i*DIE_TEST ) return i;
        }
        return die(dieSize);
    }


}
