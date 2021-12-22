package julia_kotova.introduction_15_09_2021.classwork.l10_bitwiseoperators_recursion_stringapi;

public class StringBuilderTest {

    public static void main(String[] args) {

        String str = "test";

        System.out.println(str + " 1" + " 2");

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder
                .append(" 1")
                .append(" 2");
        // stringBuilder.append(" 1");
        System.out.println(stringBuilder);

        String newString = stringBuilder.toString();

    }

}
