package mat.ned;

import mat.ned.mechanics.maps.placesMaps.*;
import mat.ned.mechanics.maps.worldMap.ValleyOfAvalon;
import mat.ned.mechanics.maps.worldMap.WorldMap;
import mat.ned.mechanics.movement.Dies;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        WorldMap map = new ValleyOfAvalon();
        map.print();
        System.out.println("Maps results:");
        map.getMatrix()[21][11].print();
        map.getMatrix()[22][11].print();
        map.getMatrix()[23][11].print();
        map.getMatrix()[24][11].print();
        map.getMatrix()[25][11].print();
        map.getMatrix()[26][11].print();
        map.getMatrix()[27][11].print();
        map.getMatrix()[28][11].print();
        for (int i = 0; i < 30; i++) {
            System.out.println(Dies.trow(1,6));
        }



    }
}
