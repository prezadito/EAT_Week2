package tempconverter;

import java.util.Scanner;

public class TempConverterAnswer {
    public static void main(String[] args) {
        int toConvert;
        int converted;
        int mode;
        char answer = ' ';

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------Welcome------------------------------------------\n" +
                           "-------------------Celsius-Fahrenheit/Fahrenheit-Celsius converter------------------");

        // main loop always running
        do {
            System.out.println("Choose the conversion mode:\n" +
                               "[1] Celsius-Fahrenheit\n" +
                               "[2] Fahrenheit-Celsius");
            // secondary loop always running, but stops second time if mode is 1 or 2
            mode = sc.nextInt();
            while (mode !=1 && mode != 2) {
                System.out.println("Invalid entry. Please enter 1 or 2");
                mode = sc.nextInt();
                if (mode == 1 || mode == 2) {
                    break;
                }
            }

            System.out.println("Enter the temperature to convert:");
            toConvert = sc.nextInt();

            if (mode == 1) {
                converted = (toConvert*9/5)+32;
                System.out.println(toConvert + " degrees celsius ------------------> " + converted + " degrees fahrenheit\n");
            } else {
                converted = (toConvert-32)*5/9;
                System.out.println(toConvert + " degrees fahrenheit ------------------> " + converted + " degrees celsius\n");
            }

            // free the scanner object, empty it
            sc.nextLine();

            // asking if user wants to run loop again
            do {
                System.out.println("Do you want to convert other temperatures: Y/N\n" +
                                   "[y] Yes\n" +
                                   "[n] No");
                answer = sc.nextLine().charAt(0);
            } while (answer != 'y' && answer != 'n');
        } while (answer == 'y');

        System.out.println("-------------------------------Good bye, see you soon---------------------------\n");

    }
}
