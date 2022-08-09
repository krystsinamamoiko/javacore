package lesson02;

import lesson02.customException.MyArrayDataException;
import lesson02.customException.MyArraySizeException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // input array
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arraySize = scan.nextInt();
        String[][] strArray = new String[arraySize][arraySize];
        for(int i = 0; i < arraySize; i++) {
            for(int j = 0; j < arraySize; j++) {
                System.out.print("Enter array element[" + i + "][" + j + "]: ");
                strArray[i][j] = scan.next();
            }
        }

        ArrayChecker checker = new ArrayChecker(strArray);
        try {
            checker.checkArraySize();
            System.out.println("Sum of array elements = " + checker.sumArrayElements());
        } catch(MyArraySizeException|MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("Sum of array elements can not be calculated");
        }
    }
}
