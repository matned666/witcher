package mat.ned.mechanics.maps.worldMap;

import mat.ned.mechanics.maps.placesMaps.*;
import mat.ned.mechanics.species.Species;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public abstract class WorldMap {



    private int ROWS;
    protected boolean isAccessible;
    private Place[][] matrix;
    protected String path;

    public WorldMap() {
    }


    public abstract int getDefaultStartRow();
    public abstract int getDefaultStartColumn();
    public abstract boolean isAccessible();

    void splitLoadedDataToWorldMapArray(String path) throws IOException {
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
        matrix = new Place[ROWS][];
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

    private Place[] getField1DArray (String[] arr) throws IOException {
        Place[] temp = new Place[arr.length];
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

    private Place getField(String loadedString) throws IOException {
        switch (loadedString) {
            case "F": return new RandomDeepForest();
            case "f": return new RandomForest();
            case "%": return new RandomSwamp();
            case "_": return new RandomField();
            case "-": return new RandomFieldRoad();
            case ",": return new RandomForestRoad();
            case ".": return new RandomDeepForestRoad();
            case "\"": return new RandomSwampRoad();
            case "T": return new TowerOfMages();
            case "H": return new ForestHut();
            case "C": return new CityOfAvalon();
            case "^": return new InAccessibleMountains();
            case "S": return new Sanctuary();
            case "=": return new WaterPlace();
            default: return null;
        }
    }

    public Place[][] getMatrix() {
        return matrix;
    }

    public void add(Species species) {
        species.setCurrentWorldMap(this);
    }
}
