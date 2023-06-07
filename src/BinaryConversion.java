public class BinaryConversion {

    /**
     * This method takes 4-digit binary and converts it to decimal. If there is a 1 in each position that
     *  lets us know that the on switch is there for that multiplier of 2, we can add that multiplier of 2
     *  to our number. If the number at that position is 0, we do not need to add anything
     *
     * @param binary The 4-digit binary value
     * @return the decimal number that the binary is equal to
     */
    public static int binaryToNum(String binary) {
        int num = 0;

        if (binary.charAt(0) == '1') {
            num+=8;
        }
        if (binary.charAt(1) == '1') {
            num+=4;
        }
        if (binary.charAt(2) == '1') {
            num+=2;
        }
        if (binary.charAt(3) == '1') {
            num+=1;
        }

        return num;
    }
    
    /**
     * This method takes decimal and converts it to 4-digit binary.
     *
     * @param num The decimal number to be converted to binary
     * @return
     */
    public static int numToBinary(int num) {
        int binaryRemain = 0; //Remainder after dividing by 2
        StringBuilder binary =  new StringBuilder(); //This is where we will save our binary
        int currentValue = num; //This value will hold our number as we divide it by 2 each iteration

        while (currentValue > 0 || binary.length() < 4) {
            binaryRemain = currentValue % 2; //Getting the remainder of current value divided by 2
            currentValue /= 2; //Current value becomes the number divided by 2
            binary.insert(0,String.valueOf(binaryRemain)); /*We want the remainder of the number divided by 2 at the beginning
            of the binary string */
        }

        //Return the number converted to binary
        return Integer.parseInt(String.valueOf(binary));
    }



}
