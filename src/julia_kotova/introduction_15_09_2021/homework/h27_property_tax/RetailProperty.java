package julia_kotova.introduction_15_09_2021.homework.h27_property_tax;

public class RetailProperty extends Property {

    private int proceeds;

    public RetailProperty(String address, int square, int proceeds) {
        super(address, square);
        this.proceeds = proceeds;
    }

    public int getProceeds() {
        return proceeds;
    }

    public void setProceeds(int proceeds) {
        this.proceeds = proceeds;
    }

    public void calculateTax() {

        if (proceeds > 100) {
            super.calculateTax();
        } else {
            System.out.println(this.address + " TAX: revenue less than 100 - tax is not charged.");
        }

    }

}
