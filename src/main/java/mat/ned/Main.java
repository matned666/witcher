package mat.ned;

import mat.ned.mechanics.maps.placesMaps.*;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Place forest1 = new Forest1();
        forest1.print();
        Place city = new CityOfAvalon();
        city.print();
        Place sanctuary = new Sanctuary();
        sanctuary.print();

    }
}
