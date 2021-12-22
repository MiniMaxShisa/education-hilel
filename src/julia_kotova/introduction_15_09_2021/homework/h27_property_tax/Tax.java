package julia_kotova.introduction_15_09_2021.homework.h27_property_tax;

import java.util.ArrayList;
import java.util.List;

public class Tax {

    public static void main(String[] args) {

        List<Property> properties = new ArrayList<>();
        properties.add(new LiveProperty("Florida, Hollywood, 720 Pointe Lane", 25));
        properties.add(new RetailProperty("Virginia, Stanardsville, 3926 North Street", 56, 200));
        properties.add(new IndustrialProperty("Minnesota, Minneapolis, 1510 Oral Lake Road", 64));

        System.out.println("Object's TAX:");
        for (Property property : properties) {
            property.calculateTax();
        }
        Property.printCount();

    }

}
