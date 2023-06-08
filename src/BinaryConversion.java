public class BinaryConversion {

    /**
     * This method takes a binary value and converts it to a decimal.
     * We will take the number at each index of the binary, either 0 or 1, and multiply that against the coinciding power of 2
     * for that iteration. After multiplying, we will add the value to our number.
     *
     * @param binary The binary value
     * @return The decimal number that the binary is equal to
     */
    public static long binaryToNum(String binary) {
        long num = 0;

        // The current iteration
        int c = binary.length() - 1;

        for (int i = binary.length(); i > 0; i--) {
            /*
             * The first iteration starts with 2 to the power of the length of binary - 1, this is saved under the variable c.
             * c decrements each iteration.
             * Example : If binary is equal to 1001000, it has the length of 7, so the first multiplier will be 2^6, which is equal to 64.
             * If the value at index 0 is 1, 64 will be added to our number. If it is 0, 0 will be added.
             * Our multiplier decreases each iteration from binary.length() - 1 , 6 in this case, to 0.
             * Our binary index will increase each iteration, from 0 to binary.length() - 1.
             */

            // 2 to the power of the current iteration.
            int currPow = (int)Math.pow(2, c);

            //The iteration decrements
            c--;

            // Get the 0 or 1 at the current index
            int currInt = Integer.parseInt(String.valueOf(binary.charAt(binary.length() -i)));

            num += (long) currInt * currPow;
        }

        return num;
    }

    /**
     * This method takes decimal and converts it to binary.
     * Each iteration of the while loop
     *
     *
     *
     * @param num The decimal number to be converted to binary
     * @return The binary value that the decimal number is equal to
     *
     */
    public static int numToBinary(int num) {
        // Remainder after dividing by 2
        int binaryRemain = 0;

        // Our binary value that we will be returning
        StringBuilder binary =  new StringBuilder();

        // The value of our number, divided by 2 each iteration
        int currentValue = num;

        while (currentValue > 0 || binary.length() < 4) {
            // The remainder of current value divided by 2 each iteration
            binaryRemain = currentValue % 2;

            // The current value becomes itself divided by 2 each iteration
            currentValue /= 2;

            binary.insert(0,String.valueOf(binaryRemain)); /*We want the remainder of the number divided by 2 at the beginning
            of the binary string */
        }

        //Return the number converted to binary
        return Integer.parseInt(String.valueOf(binary));
    }



}
