package julia_kotova.introduction_15_09_2021.homework.h27_property_tax;

public class LiveProperty extends Property {

    public LiveProperty(String address, int square) {
        super(address, square);
    }

    public void calculateTax() {
        double tax = (this.square * METER_TAX) * 0.95;
        System.out.println(this.address + " TAX: " + tax + ".");
    }

}
