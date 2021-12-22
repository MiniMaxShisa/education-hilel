package julia_kotova.introduction_15_09_2021.classwork.l10_bitwiseoperators_recursion_stringapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TernaryOperator {

    public static void main(String[] args) throws IOException  {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input number:");
        int number = Integer.parseInt(reader.readLine());

        int result = number > 0 ? 500 / number : 0;

        System.out.println(result);

        /*
        if (number > 0) {
            result = 500 / number;
        } else {
            result = 0;
        }
         **/

    }

}
