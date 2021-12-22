package julia_kotova.introduction_15_09_2021.homework.h27_property_tax;

public abstract class Property {

    protected static int COUNT;
    protected static double METER_TAX = 1.5;

    protected String address;
    protected int square;

    public Property(String address, int square) {
        this.address = address;
        this.square = square;
        COUNT++;
    }

    public String getAddress() {
        return address;
    }

    public int getSquare() {
        return square;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Address: " + address;
    }

    public void calculateTax() {
        double tax = this.square * METER_TAX;
        System.out.println(this.address + " TAX: " + tax + ".");
    }

    public static void printCount() {
        System.out.println("Amount of objects: " + Property.COUNT);
    }

}
