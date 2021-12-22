package julia_kotova.introduction_15_09_2021.homework.h07_phone_book;

public class Person {

    public static void main(String[] args) {

       String personInfo1 = personInfo("Will", "Smith", "New York", "2936729462846");
       String personInfo2 = personInfo("Jackie", "Chan", "Shanghai", "12312412412");
       String personInfo3 = personInfo("Sherlock", "Holmes", "London", "37742123513");

    }

    public static String personInfo(String name, String surname, String city, String number) {
        System.out.println("Позвонить гражданину " + name + " " + surname + " из города " + city + " можно по номеру " + number + ".");
        return "String";
    }

}
