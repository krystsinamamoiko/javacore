package lesson02;

import lesson02.customException.MyArrayDataException;
import lesson02.customException.MyArraySizeException;

public class ArrayChecker {
    public static final int EXPECTED_ARRAY_SIZE = 4;
    private String[][] stringArray;

    public ArrayChecker(String[][] stringArray) {
        this.stringArray = stringArray;
    }

    /**
     * Check that the given array has correct size.
     */
    public void checkArraySize() {
        if(stringArray == null || stringArray.length != EXPECTED_ARRAY_SIZE || !isArrayRowSizeCorrect()) {
            throw new MyArraySizeException("Incorrect array size!");
        }
    }

    /**
     * Check that size of all array rows corresponds to the expected size.
     * @return true if size is as expected and false otherwise.
     */
    private boolean isArrayRowSizeCorrect() {
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length != EXPECTED_ARRAY_SIZE) {
                return false;
            }
        }
        return true;
    }

    /**
     * Convert and sum up all elements of the given String array.
     * @return calculated sum value.
     */
    public int sumArrayElements() {
        int sum = 0;
        if (stringArray != null) {
            for (int i = 0; i < stringArray.length; i++) {
                for (int j = 0; j < stringArray[i].length; j++) {
                    try {
                        sum += Integer.parseInt(stringArray[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Sum can not be calculated. Invalid array element '" +
                            stringArray[i][j] + "' with the following indexes [" + i + "][" + j + "]");
                    }
                }
            }
        }
        return sum;
    }
}
