package Head_First_OO_Design.GuitarShop;

public class Guitar {
    private String serialNumber;
    private double price;

    private GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec){
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }

    @Override 
    public String toString(){
        return new String(serialNumber + " -- " + price + " -- " + guitarSpec);
    }

    public double getPrice(){
        return price;
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    public GuitarSpec getGuitarSpec(){
        return guitarSpec;
    }
}
