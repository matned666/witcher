package mat.ned.mechanics.maps.placesMaps;

import mat.ned.mechanics.maps.placesMaps.fields.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class PlaceTest {
    private Place testPlace;

    //TODO Mockito tests


    @BeforeEach
    void setup() throws FileNotFoundException {
        testPlace = new ParametrizedMap("src/main/resources/test.map");
    }


    @Test
    void areAllFieldTypesOnBoard()  {

        for (int i =0;i < testPlace.matrix[0].length; i++)
            assertEquals(Road.class.getSimpleName() ,testPlace.matrix[0][i].getClass().getSimpleName());
        for (int i =0;i < testPlace.matrix[1].length; i++)
            assertEquals(House.class.getSimpleName() ,testPlace.matrix[1][i].getClass().getSimpleName());
        for (int i =0;i < testPlace.matrix[2].length; i++)
            assertEquals(GrainField.class.getSimpleName() ,testPlace.matrix[2][i].getClass().getSimpleName());
        for (int i =0;i < testPlace.matrix[3].length; i++)
            assertEquals(Fence.class.getSimpleName() ,testPlace.matrix[3][i].getClass().getSimpleName());

            assertEquals(Stone.class.getSimpleName() ,testPlace.matrix[4][3].getClass().getSimpleName());
            assertEquals(Grass.class.getSimpleName() ,testPlace.matrix[5][3].getClass().getSimpleName());
        for (int i =0;i < testPlace.matrix[6].length; i++)
            assertEquals(Wall.class.getSimpleName() ,testPlace.matrix[6][i].getClass().getSimpleName());
        for (int i =0;i < testPlace.matrix[7].length; i++)
            assertEquals(Water.class.getSimpleName() ,testPlace.matrix[7][i].getClass().getSimpleName());
        for (int i =0;i < testPlace.matrix[8].length; i++)
            assertEquals(Trees.class.getSimpleName() ,testPlace.matrix[8][i].getClass().getSimpleName());
        for (int i =0;i < testPlace.matrix[9].length; i++)
            assertEquals(Bushes.class.getSimpleName() ,testPlace.matrix[9][i].getClass().getSimpleName());
        for (int i =0;i < testPlace.matrix[10].length; i++)
            assertEquals(Swamp.class.getSimpleName() ,testPlace.matrix[10][i].getClass().getSimpleName());
        for (int i =0;i < testPlace.matrix[11].length; i++)
            assertEquals(Door.class.getSimpleName() ,testPlace.matrix[11][i].getClass().getSimpleName());
    }

    @Test
    void checkIfDoorCanBeOpenedAndClosed(){
        for(int i = 0; i < testPlace.matrix[11].length; i+=2)  testPlace.matrix[11][i].setOpen(true);

        for(int i = 0; i < testPlace.matrix[11].length; i+=2)
            assertTrue( testPlace.matrix[11][i].isOpen());
        for(int i = 1; i < testPlace.matrix[11].length; i+=2)
            assertFalse( testPlace.matrix[11][i].isOpen());
    }

}