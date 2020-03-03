package mat.ned.mechanics.movement;

import mat.ned.mechanics.maps.placesMaps.ParametrizedMap;
import mat.ned.mechanics.maps.placesMaps.Place;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class GameFactoryTest {

    @BeforeEach
    void setup() throws FileNotFoundException {
        Place testPalace = new ParametrizedMap("");
    }

    @Test
    void isRandomPositionOfSpeciesCorrect(){

    }

    @Test
    void notTestAtAll_ShowsMaps() throws FileNotFoundException {
        new ParametrizedMap("CavernsUnderTowerOfMAges.map").print();
        System.out.println();
        new ParametrizedMap("TowerOfMAgesLvl1.map").print();
        System.out.println();
        new ParametrizedMap("TowerOfMAgesLvl2.map").print();
        System.out.println();
        new ParametrizedMap("TowerOfMAgesLvl3.map").print();
        System.out.println();
        new ParametrizedMap("TowerOfMAgesLvl4.map").print();
        System.out.println();
        new ParametrizedMap("TowerOfMAgesLvl5.map").print();
        System.out.println();
        new ParametrizedMap("TowerOfMAgesLvl6.map").print();
    }

}