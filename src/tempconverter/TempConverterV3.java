package tempconverter;

import java.util.Locale;
import java.util.Scanner;

public class TempConverterV3 {
    public static void main(String[] args) {
        // declare all variables
        int toConvert;
        int converted;
        String mode;
        String answer;

        // create scanner object to capture user inputs
        Scanner sc = new Scanner(System.in);

        // welcome message
        System.out.println("-----------------------------------Welcome------------------------------------------\n" +
                           "-------------------Celsius-Fahrenheit/Fahrenheit-Celsius converter------------------");

        // run the program once, and run again from the top only if the user chooses "Yes" at the end
        do {

            //ask user which mode of conversion they would like to use, and capture their answer
            System.out.println("Choose the conversion mode:\n" +
                               "[C]elsius-to-Fahrenheit\n" +
                               "[F]ahrenheit-to-Celsius");
            mode = String.valueOf(sc.nextLine().charAt(0)).toUpperCase(Locale.ROOT);

            // invalid choice logic
            while (!mode.equals("C") && !mode.equals("F")) {
                System.out.println("Please choose either [C] for Celsius or [F] for Fahrenheit");
                mode = String.valueOf(sc.nextLine().charAt(0)).toUpperCase(Locale.ROOT);
                if (mode.equals("C") || mode.equals("F")) {
                    break;
                }
            }

            // enter temperature msg
            System.out.println("Enter the temperature to convert:");

            // if the temp entered is a non-integer logic
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a whole number");
                sc.next();
            }

            // capture valid data
            toConvert = sc.nextInt();

            // use proper conversion mode based on user choice and display result
            if (mode.equals("C")) {
                converted = (toConvert*9/5)+32;
                System.out.println(toConvert + " degrees celsius ------------------> " + converted + " degrees fahrenheit\n");
            } else {
                converted = (toConvert-32)*5/9;
                System.out.println(toConvert + " degrees fahrenheit ------------------> " + converted + " degrees celsius\n");
            }

            // ask user to run program again or quit
            System.out.println("Do you want to convert other temperatures:\n" +
                               "[Y]es\n" +
                               "[N]o");

            // if user inputs anything other than y/Y/n/N
            while (!sc.hasNext("y") && !sc.hasNext("n") && !sc.hasNext("y") && !sc.hasNext("Y")) {
                System.out.println("Please type [Y]es if you would like to convert another temperature, or [N]o if you would like to quit the program");
                sc.next();
            }

            // free up and empty scanner object
            sc.nextLine();

            // capture valid user input (char), convert to string and capitalize it
            answer = String.valueOf(sc.nextLine().charAt(0)).toUpperCase(Locale.ROOT);

        } while (answer.equals("Y"));

        // if user chooses "No" display goodbye msg and quit program
        System.out.println("-------------------------------Good bye, see you soon---------------------------\n");

    }
}
