public class BinaryConversion {

    /**
     * This method takes a binary value and converts it to a decimal.
     * We will take the number at each index of the binary, either 0 or 1, and multiply that against the coinciding power of 2
     * for that iteration. After multiplying, we will add the value to our number.
     *
     * @param binary The binary value
     * @return the decimal number that the binary is equal to
     */
    public static long binaryToNum(String binary) {
        long num = 0;
        int c = binary.length() - 1;  //The current iteration

        for (int i = binary.length(); i > 0; i--) {

            /*
             * The iteration starts equal to the length of binary - 1 and decrements.
             * Example : If binary has a length of 7, 1001000, the first multiplier will be 2^6, which is equal to 64.
             * If the value at index 0 is 1, 64 will be added to our number. If it is 0, 0 will be added.
             * Our multiplier decreases each iteration from binary.length() - 1 , 6 in this case, to 0.
             * Our binary index will increase each iteration, from 0 to binary.length() - 1.
             */

            //2 to the power of the current iteration.
            int currPow = (int)Math.pow(2, c);

            //The  0 or 1 at the current index
            int currInt = Integer.parseInt(String.valueOf(binary.charAt(binary.length() -i)));

            num += (long) currInt * currPow;

            c--;
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
