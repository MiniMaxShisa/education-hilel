package julia_kotova.introduction_15_09_2021.homework.h23_strings_password_generator;

import java.util.ArrayList;

public class Password {

    public static void main(String[] args) {

        ArrayList<String> passwords = new ArrayList<>();
        String oldPassword = "5OLZtpc0";
        passwords.add(oldPassword);

        String newPassword;
        newPassword = PasswordGenerator.generatePassword();
        checkArrayList(newPassword, passwords);
        passwords.add(newPassword);

    }

    public static void checkArrayList(String newPassword, ArrayList<String> arrayList) {

        for (String password : arrayList) {

            if (newPassword.equals(password)) {
                newPassword = PasswordGenerator.generatePassword();
                checkArrayList(newPassword, arrayList);
            } else {
                System.out.println("Password: " + newPassword);
            }

        }

    }

}
