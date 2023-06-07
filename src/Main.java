import java.util.Scanner;

public class Main {





    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This is a binary converter. You can convert a decimal number less than 15 to 4-digit binary, or you can" +
                "convert a 4-digit binary value to its equivalent decimal number." +
                "Enter the command \"b\" to convert a decimal number to binary. THIS WILL RETURN A BINARY NUMBER." +
                "Enter the command \"d\" to convert binary to decimal. THIS WILL RETURN A DECIMAL NUMBER.");

        //Could also skip the command step and base whether it is binary or decimal based on the length of the input

        String command = scan.next();

        System.out.println("Enter the value you would like to convert.");

        String toConvert = scan.next();

        //Add exception handling

        if (command.equals("b")) {
            //b means binary is being returned
            System.out.println(toConvert + " converted to binary is equal to: " + BinaryConversion.numToBinary(Integer.valueOf((toConvert))));

        }
        if (command.equals("d")) {
            System.out.println(toConvert + " converted to decimal is equal to: " + BinaryConversion.binaryToNum(toConvert));
        }


    }
}