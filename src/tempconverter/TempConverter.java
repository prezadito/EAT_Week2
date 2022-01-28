package tempconverter;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        while (true) {

            // Welcome message
            System.out.println("-----------------------------------Welcome------------------------------------------\n" +
                    "-------------------Celsius-Fahrenheit/Fahrenheit-Celsius converter------------------");

            // Choose conversion mode
            int choice;
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose the conversion mode:\n" +
                    "[1] Celsius-Fahrenheit\n" +
                    "[2] Fahrenheit-Celsius");
            choice = sc.nextInt();

            // Declare temp variables
            int celsius;
            int fahrenheit;

            // Initialize and convert temp variables
            System.out.println("Enter the temperature to convert:");
            if (choice == 1) {
                celsius = sc.nextInt();
                fahrenheit = (celsius*9/5)+32;
                System.out.println(celsius + " degrees celsius ------------------> " + fahrenheit + " degrees fahrenheit\n");
            } else {
                fahrenheit = sc.nextInt();
                celsius = (fahrenheit-32)*5/9;
                System.out.println(fahrenheit + " degrees fahrenheit ------------------> " + celsius + " degrees celsius\n");
            }

            // Repeat?
            System.out.println("Do you want to convert other temperatures: Y/N\n" +
                               "[1] Yes\n" +
                               "[2] No");
            int answer = sc.nextInt();
            if (answer == 2) {
                break;
            } else {
                continue;
            }
        }

        // Exit message
        System.out.println("-------------------------------Good bye, see you soon---------------------------\n");

    }
}
