import java.util.Scanner;

public class Main {





    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This is a binary converter. You can convert a decimal number between 0 and 255 to a binary value, or you can " +
                "convert a 4 - 8 digit binary value to its equivalent decimal number." +
                "Enter the command \"convert to binary\" to convert from a decimal number to binary." +
                "Enter the command \"convert to decimal\" to convert from binary to decimal.");


        String command = scan.next().toLowerCase();

        System.out.println("Enter the value you would like to convert.");

        String toConvert = scan.next();

        try {

            if (command.equals("convert to binary")) {
                System.out.println(toConvert + " converted to binary is equal to: " + BinaryConversion.numToBinary(Integer.valueOf((toConvert))));

            }
            else if (command.equals("convert to decimal")) {
                System.out.println(toConvert + " converted to decimal is equal to: " + BinaryConversion.binaryToNum(toConvert));
            }
            else {
                System.out.println("Invalid command. Please try again.");
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }


    }
}