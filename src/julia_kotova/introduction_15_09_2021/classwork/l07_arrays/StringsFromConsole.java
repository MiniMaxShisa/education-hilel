package julia_kotova.introduction_15_09_2021.classwork.l07_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringsFromConsole {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("input array size: ");
        int size = Integer.parseInt(reader.readLine());
        String[] strings = new String[size];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
        }

        //prev strings[i + 1]
        //next strings[i - 1]

        System.out.println("array contents: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }

}
