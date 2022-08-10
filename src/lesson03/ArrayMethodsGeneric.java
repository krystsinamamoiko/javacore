package lesson03;

public class ArrayMethodsGeneric <T extends Object> {
    T[] array;

    public ArrayMethodsGeneric(T...array) {
        this.array = array;
    }

    public T[] swapArrayElements(int firstElementIndex, int secondElementIndex) {
        try {
            T temporal = array[firstElementIndex];
            array[firstElementIndex] = array[secondElementIndex];
            array[secondElementIndex] = temporal;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Incorrect element indexes. It is not possible to swap array elements.");
        }
        return array;
    }

    public void printArray() {
        for (T element: array) {
            System.out.print(element.toString() + " ");
        }
        System.out.println();
    }
}
