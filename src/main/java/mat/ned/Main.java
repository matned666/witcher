package mat.ned;

import mat.ned.mechanics.maps.placesMaps.CityOfAvalon;
import mat.ned.mechanics.maps.placesMaps.Place;
import mat.ned.mechanics.maps.placesMaps.Forest1;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Place forest1 = new Forest1();
        forest1.print();
        Place city = new CityOfAvalon();
        city.print();


    }
}
