package stringalteration;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringAlteration {
    public static void main(String[] args) {
        // declare and initialize string
        String str = "Quality Assurance";
        System.out.println("Original: " + str);

        // alteration 1 - lowercase
        String str1 = str.toLowerCase();
        System.out.println("1. " + str1);

        // alteration 2 - uppercase
        String str2 = str.toUpperCase();
        System.out.println("2. " + str2);

        // alteration 3 - concat
        String str3 = str.concat(" Engineer");
        System.out.println("3. " + str3);

        // alteration 4 - replace
        String str4 = str.replace("u", "i");
        System.out.println("4. " + str4);

        // alteration 5 - intern
        String str5 = new String("Software Development Engineer in Test").intern();
        System.out.println("5. " + "str==str5: " + (str.equals(str5)));

        // alteration 6 - getBytes
        byte[] bt6 = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("6. " + bt6);

        // alteration 7 - split (IMPORTANT)
        String[] array = str.split(" ");
        System.out.println("7. " + array[1]);

        // alteration 8 - charAt
        char q = str.charAt(0);
        System.out.println("8. " + q);

        // alteration 9 - contains
        boolean bool = str.contains("g");
        System.out.println("9. " + bool);

        // alteration 10 - indexOf
        int num = str.indexOf("A");
        System.out.println("10. " + num);

        // alteration 11 - compareTo
        int num2 = str.compareTo("SDET");
        System.out.println("11. " + num2);

        // alteration 12 - endsWith
        boolean bool12 = str.endsWith("ance");
        System.out.println("12. " + bool12);

        // alteration 13 - toCharArray
        char[] let = str.toCharArray();
        System.out.println("13. " + let);

        // alteration 14 - length
        int len = str.length();
        System.out.println("14. " + len);

        // alteration 15 - substring
        String str15 = str.substring(0,7);
        System.out.println("15. " + str15);

        String str16 = "    Adi   ";
        System.out.println("16. " + str16);
        System.out.println(str16.trim());

    }
}
