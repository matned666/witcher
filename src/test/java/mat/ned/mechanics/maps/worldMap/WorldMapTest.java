package mat.ned.mechanics.maps.worldMap;

import mat.ned.mechanics.maps.placesMaps.Direction;
import mat.ned.mechanics.species.Species;
import mat.ned.mechanics.species.humans.Witcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WorldMapTest {

    WorldMap map;
    Species geralt;

    @BeforeEach
    void setup() throws IOException {
        map = new ValleyOfAvalon();
        geralt = new Witcher("Geralt");
        map.add(geralt);
    }

    @Test
    void canWitcherWalkOnWorldMap(){
        geralt.moveMap(Direction.UP);
        geralt.moveMap(Direction.UP);
        geralt.moveMap(Direction.UP);
        geralt.moveMap(Direction.UP);

        assertEquals(geralt.getActualMap(), map.getMatrix()[24][11]);
    }

    @Test
    void canWitcherGoThroughInaccessiblePlaced(){
        geralt.moveMap(Direction.RIGHT);
        assertEquals(geralt.getActualMap(),map.getMatrix()[28][11]);
    }

    @Test
    void willWitcherGetToTheHutInTheForest(){
        for (int i = 0; i < 8; i++) {
            geralt.moveMap(Direction.UP);
        }
        for (int i = 0; i < 28; i++) {
            geralt.moveMap(Direction.RIGHT);
        }
        for (int i = 0; i < 10; i++) {
            geralt.moveMap(Direction.UP);
        }
        for (int i = 0; i < 9; i++) {
            geralt.moveMap(Direction.RIGHT);
        }
        geralt.moveMap(Direction.DOWN);
        geralt.moveMap(Direction.DOWN);
        geralt.moveMap(Direction.LEFT);
        geralt.moveMap(Direction.LEFT);
        geralt.moveMap(Direction.LEFT);

        assertEquals(geralt.getActualMap(),map.getMatrix()[14][45]);
    }

}