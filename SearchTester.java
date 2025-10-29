package Head_First_OO_Design.GuitarShop;

import java.util.ArrayList;

public class SearchTester {
    static ArrayList<GuitarSpec> guitarSpecList = new ArrayList<>();

    public static void main(String[] args) {
        guitarSpecList.add(new GuitarSpec(Builder.FENDER, Wood.ALDER, Wood.ALDER, Type.ELECTRIC ,"Stratocastor"));

        Inventory inventory = new Inventory();
        inventory.addGuitar(new Guitar("s1", 1500, guitarSpecList.get(0))); 
        inventory.addGuitar(new Guitar("s2", 1600, guitarSpecList.get(0))); 


        GuitarSpec guitarSpecRequest = new GuitarSpec(Builder.FENDER, Wood.ALDER, Wood.ALDER, Type.ELECTRIC, "Stratocastor");


        ArrayList<Guitar> matchingGuitars = inventory.search(guitarSpecRequest);

        // inventory.printGuitarList();

        if(!matchingGuitars.isEmpty()){
            System.out.println("Here is a list of guitars you will like : ");
            for (Guitar guitar : matchingGuitars) {
                System.out.println(guitar);
            }
        } else {
            System.out.println("Sorry, we could not find any guitars for you !!");
        }

    }
}
