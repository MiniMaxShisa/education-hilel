package julia_kotova.introduction_15_09_2021.classwork.l10_bitwiseoperators_recursion_stringapi;

public class Recursion {

    public static void main(String[] args) {

        recursion(0);

    }

    public static void recursion(int count) {

        System.out.println("Hello World! + COUNT: " + ++count);

        if (count >= 100){
            return;
        }

        recursion(count);

    }

}
