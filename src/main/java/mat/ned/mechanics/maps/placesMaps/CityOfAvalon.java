package mat.ned.mechanics.maps.placesMaps;

import mat.ned.mechanics.maps.placesMaps.fields.*;
import mat.ned.mechanics.maps.worldMap.MapStageType;

import java.util.LinkedList;
import java.util.List;

public class CityOfAvalon extends Place {




    public CityOfAvalon() {
        this.isAccessible = true;
        this.getPlaceType = MapStageType.CITY;
        initialize();
    }

    @Override
    public boolean isAccessible() {
        return this.isAccessible;
    }

    @Override
    public MapStageType getPlaceType() {
        return this.getPlaceType;
    }

    @Override
    public List<FieldType> getPossibleFieldTypesInTheArea() {
        return null;
    }

    @Override
    public MapField[][] getMatrix() {
        return matrix;
    }

     @Override
    public void print() {
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 System.out.print(matrix[i][j].toString());
             }
             System.out.println();
         }
    }

    private void initialize() {
        matrix = new MapField[ROWS][COLUMNS];
        listOfFieldTypes_INIT();
        matrix_INIT();
        generateMainRoads();
        generateCityWall();
        generateHouses1();
        generateHouses2();
        generateRoadToPalace();
        generateHouses3();
        generateHouses4();
        generateHouses5();
        generateHouses6();
        generateSanctuary();
        generateRoadToSanctuarySquare();
        generatePalace();
        addHousesAroundCity();
        GenerateTreesInTheCity();


    }

    private void GenerateTreesInTheCity() {
        matrix[2][2] = new Bushes();
        matrix[3][2] = new Bushes();
        matrix[4][2] = new Bushes();
        matrix[2][8] = new Trees();
        matrix[2][12] = new Trees();
        matrix[2][15] = new Trees();
        matrix[2][30] = new Trees();
        matrix[2][31] = new Trees();
        matrix[2][32] = new Water();
        matrix[2][33] = new Water();
        matrix[2][34] = new Water();
        matrix[2][35] = new Water();
        matrix[2][36] = new Water();
        matrix[2][37] = new Water();
        matrix[2][38] = new Trees();
        matrix[2][matrix[2].length-3] = new Trees();
        matrix[20][matrix[2].length-5] = new Trees();
        matrix[21][matrix[2].length-5] = new Trees();
        matrix[22][matrix[2].length-5] = new Trees();
        matrix[matrix.length-3][8] = new Trees();
        matrix[matrix.length-3][12] = new Trees();
    }

    private void addHousesAroundCity() {
        matrix[0][8] = new House();
        matrix[0][12] = new House();
        matrix[matrix.length-1][8] = new House();
        matrix[matrix.length-1][12] = new House();

    }

    private void generateHouses6() {
        for (int i = 2; i <= matrix.length-3; i++) {
            matrix[i][matrix[i].length-3] = new House();
        }
    }


    private void generatePalace() {
        for (int i = 3; i <= 27; i++) {
            for (int j = 32; j <= 44; j++) {
                matrix[i][j] = new Road();
            }
        }
        for (int i = 4; i <= 26; i++) {
            for (int j = 33; j <= 43; j++) {
                matrix[i][j] = new Wall();
            }
        }
        for (int i = 5; i <= 25; i++) {
            for (int j = 34; j <= 42; j++) {
                matrix[i][j] = new Stone();
            }
        }
        for (int i = 34; i <= 42; i++) {
            matrix[20][i] = new Wall();
        }
        matrix[14][33] = new Door();
        matrix[15][33] = new Door();
        matrix[20][38] = new Door();

    }

    private void generateSanctuary() {
        for (int i = 20; i <= 26; i++) {
            for (int j = 19; j <= 31; j++) {
                matrix[i][j] = new Wall();
            }
        }
        for (int i = 21; i <= 25; i++) {
            for (int j = 23; j <= 30; j++) {
                matrix[i][j] = new Stone();
            }
        }
        for (int i = 21; i <= 25; i++) {
            for (int j = 20; j <= 21; j++) {
                matrix[i][j] = new Stone();
            }
        }
        matrix[20][27] = new Door();
        matrix[20][28] = new Door();
        matrix[23][22] = new Door();

    }

    private void generateHouses5() {
        for (int i = 14; i <= 27; i++) {
            for (int j = 12; j <= 21; j++) {
                matrix[i][j] = new House();
            }
        }
        for (int i = 12; i <= 19; i++) {
            matrix[16][i] = new Grass();
        }
        for (int i = 20; i <= 27; i++) {
            for (int j = 16; j <= 21; j++) {
                matrix[i][j] = new Grass();
            }
        }
        matrix[21][12] = new Grass();
        matrix[21][13] = new Grass();
        matrix[21][14] = new Grass();

        matrix[19][18] = new Grass();
        for (int i = 17; i <= 27; i++) {
                matrix[i][15] = new Grass();
                matrix[i][19] = new Grass();
        }
        for (int i = 21; i <= 26; i++) {
            for (int j = 16; j <= 18; j++) {
                matrix[i][j] = new Fence();
            }
        }
        for (int i = 23; i <= 25; i++) {
            for (int j = 17; j <= 18; j++) {
                matrix[i][j] = new Grass();
            }
        }
        for (int i = 21; i <= 23; i++) {
            for (int j = 17; j <= 18; j++) {
                matrix[i][j] = new House();
            }
        }
        matrix[23][17] = new Grass();
    }

    private void generateRoadToSanctuarySquare() {
        for (int i = 12; i <= 13; i++) {
            for (int j = 11; j <= 31; j++) {
                matrix[i][j] = new Road();
            }
        }
        for (int i = 14; i <= 19; i++) {
            for (int j = 23; j <= 31; j++) {
                matrix[i][j] = new Road();
            }
        }
        for (int i = 15; i <= 16; i++) {
            for (int j = 25; j <= 27; j++) {
                matrix[i][j] = new Water();
            }
        }
        matrix[14][24] = new Trees();
        matrix[14][28] = new Trees();
        matrix[17][24] = new Trees();
        matrix[17][28] = new Trees();

    }

    private void generateHouses4() {
        for (int i = 3; i <= 4; i++) {
            for (int j = 13; j <= 30; j++) {
                matrix[i][j] = new House();
            }
        }
        matrix[3] [23]= new Grass();
        matrix[4] [23]= new Grass();


    }

    private void generateHouses3() {
        for (int i = 7; i <= 11; i++) {
            for (int j = 14; j <= 30; j++) {
                matrix[i][j] = new House();
            }
        }
    }

    private void generateRoadToPalace() {
        for (int j = 2; j < 33; j++) {
            matrix[5][j] = new Road();
            matrix[6][j] = new Road();
        }
        for (int j = 7; j < 12; j++) {
            matrix[j][30] = new Road();
            matrix[j][31] = new Road();
            matrix[j][32] = new Road();
        }

    }

    private void generateHouses2() {
        matrix[7][3] = new House();
        matrix[7][4] = new House();
        matrix[7][5] = new House();
        matrix[8][3] = new House();
        matrix[8][4] = new House();
        matrix[8][5] = new House();
        for (int i = 7; i < matrix.length-3; i++) {
            for (int j = 4; j < 9; j++) {
               matrix[i][j] = new House();
                if(i > 8) {
                    matrix[i][3]  =new Fence();
                    matrix[i][4]  =new GrainField();
                }
                matrix[matrix.length-4][4] = new Fence();

            }
        }
    }

    private void generateHouses1() {
        for (int i = 3; i < 8; i++) {
            matrix[2][i] = new House();
            matrix[3][i] = new House();
            matrix[4][i] = new House();
        }
    }

    private void generateCityWall() {
        for (int i = 1; i < matrix[0].length-1; i++) {
            matrix[1][i] = new Wall();
            matrix[matrix.length-2][i] = new Wall();
        }
        for (int i = 1; i < matrix.length-1; i++) {
            matrix[i][1] = new Wall();
            matrix[i][matrix[i].length-2] = new Wall();
        }
        matrix[1][9] = new Door();
        matrix[1][10] = new Door();
        matrix[1][11] = new Door();
        matrix[matrix.length-2][9] = new Door();
        matrix[matrix.length-2][10] = new Door();
        matrix[matrix.length-2][11] = new Door();
    }


    private void matrix_INIT() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Grass();
            }
        }
    }

    private void generateMainRoads(){
        for(int i =0; i < matrix.length; i++){
            matrix[i][9] = new Road();
            matrix[i][10] = new Road();
            matrix[i][11] = new Road();
        }

    }

    private void listOfFieldTypes_INIT(){
       this.listOfFieldTypes = new LinkedList<>();
        listOfFieldTypes.add(FieldType.GRASS);
        listOfFieldTypes.add(FieldType.ROAD);
        listOfFieldTypes.add(FieldType.HOUSE);
        listOfFieldTypes.add(FieldType.WALL);
        listOfFieldTypes.add(FieldType.STONE);
        listOfFieldTypes.add(FieldType.WATER);
        listOfFieldTypes.add(FieldType.TREES);
        listOfFieldTypes.add(FieldType.BUSHES);
        listOfFieldTypes.add(FieldType.GRAIN_FIELD);
        listOfFieldTypes.add(FieldType.FENCE);
        listOfFieldTypes.add(FieldType.DOOR);
    }
}
