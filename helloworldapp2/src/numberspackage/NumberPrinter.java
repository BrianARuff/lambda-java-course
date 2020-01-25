package numberspackage;

import java.util.Arrays;

public class NumberPrinter {
    public static String printNumbers() {
        int[] numbersArray = new int[10];
        for(int i = 1; i < 11; i++) {
            numbersArray[i-1] = i; 
        }
        return Arrays.toString(numbersArray);
    }
}