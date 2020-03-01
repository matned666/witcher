package mat.ned.mechanics.maps.placesMaps;

import mat.ned.mechanics.maps.placesMaps.fields.*;
import mat.ned.mechanics.maps.worldMap.MapStageType;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Place {

    protected int ROWS;
    protected int COLUMNS;
    protected boolean isAccessible;
    protected MapStageType getPlaceType;
    protected MapField[][] matrix;
    protected String path;

    public Place() throws NullPointerException {
    }

    public abstract boolean isAccessible();

    public abstract MapStageType getPlaceType();


    protected void splitLoadedDataToMapArray(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        ROWS = getNumberOfRows(scanner);
        scanner = new Scanner(file);
        String[] temp = new String[ROWS];
        int counter = 0;
        while (scanner.hasNextLine()) {
            temp[counter] = scanner.nextLine();
            counter++;
        }
        matrix = new MapField[ROWS][];
        for (int i = 0; i < ROWS; i++) {
            matrix[i] = getField1DArray(temp[i].split(""));
        }
    }

    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j].toString());
            }
            System.out.println();
        }
    }

    private MapField[] getField1DArray (String[] arr){
        MapField[] temp = new MapField[arr.length];
        for (int i = 0; i < arr.length; i++){
            temp[i] = getField(arr[i]);
        }
        return temp;
    }

    private int getNumberOfRows(Scanner sc){
        int counter = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            counter++;
        }
        return counter;
    }


    private MapField getField(String loadedString) {
        switch (loadedString) {
            case "*": return new Road();
            case "H": return new House();
            case "=": return new GrainField();
            case "[": return new Fence();
            case "-": return new Stone();
            case "_": return new Grass();
            case "#": return new Wall();
            case "$": return new Water();
            case "P": return new Trees();
            case "x": return new Bushes();
            case "%": return new Swamp();
            case "+": return new Door();
            default: return null;
        }
    }

}
