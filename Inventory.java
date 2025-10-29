package Head_First_OO_Design.GuitarShop;

import java.util.ArrayList;
import java.util.Objects;

public class Inventory {
    private static ArrayList<Guitar> guitars = new ArrayList<>();

    public void addGuitar(Guitar guitar){
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for (Guitar guitar : guitars) {
            if(guitar.getSerialNumber() == serialNumber){
                return guitar;
            }
        }

        return null;
    }

    public ArrayList<Guitar> search(GuitarSpec guitarSpec){
        ArrayList<Guitar> matchingGuitars = new ArrayList<>();
        for (Guitar guitar : guitars) {
            
            // System.out.println(guitar.getGuitarSpec() + " --- " + guitarSpec);

            if(Objects.equals(guitar.getGuitarSpec(), guitarSpec)){
                matchingGuitars.add(guitar);
            }
        }

        return matchingGuitars;
    }

    public void printGuitarList(){
        for (Guitar guitar : guitars) {
            System.out.println(guitar);
        }
    }
}
