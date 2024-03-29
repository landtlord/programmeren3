package be.hogent.opdracht1.excercise4;

import java.util.Arrays;

public class IntArrayManipulator {

    public static int sum(int[] arrayToProcess) {
        return Arrays.stream(arrayToProcess).sum();
//        int sum = 0;
//        for (int value : arrayToProcess) {
//            sum += value;
//        }
//        return sum;
    }

    public static int indexOf(int[] arrayToProcess, int integerToCheck) {
        for (int index = 0; index < arrayToProcess.length; index++) {
            if (arrayToProcess[index] == integerToCheck) {
                return index;
            }
        }
        return -1;
    }

    public static int findGreatest(int[] arrayToProcess) {
        return Arrays.stream(arrayToProcess).max().getAsInt();
//        int greatestInt = arrayToProcess[0];
//        for (int value : arrayToProcess) {
//            if (value > greatestInt) {
//                greatestInt = value;
//            }
//        }
//        return greatestInt;
    }
}
