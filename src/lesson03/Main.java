package lesson03;

import lesson03.fruit.Apple;
import lesson03.fruit.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        ArrayMethodsGeneric<Integer> gen1 = new ArrayMethodsGeneric<>(7, 10, 1, 4, 9);
        gen1.printArray();
        gen1.swapArrayElements(0, 4);
        gen1.printArray();

        ArrayMethodsGeneric<String> gen2 = new ArrayMethodsGeneric<>("string1", "string2", "string3", "string4", "string5");
        gen2.printArray();
        gen2.swapArrayElements(1, 2);
        gen2.printArray();

        // Task 2
        Box<Apple> appleBox = new Box<>(new ArrayList<>(Arrays.asList(new Apple(), new Apple(), new Apple(), new Apple())));
        Box<Orange> orangeBox = new Box<>(new ArrayList<>(Arrays.asList(new Orange(), new Orange(), new Orange())));
        System.out.println("Weight of a box with apples: " + appleBox.getWeight());
        System.out.println("Weight of a box with oranges: " + orangeBox.getWeight());
        System.out.println("Is weight of boxes with oranges and apples the same?: " + orangeBox.compare(appleBox));

        orangeBox.addFruit(new Orange());
        System.out.println("Weight of the box of oranges after one orange was added into it: " + orangeBox.getWeight());

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        System.out.println("Weight of the box of apples after two apples were added into it: " + appleBox.getWeight());
        System.out.println("Is weight of boxes with oranges and apples after all manipulations the same?: " + orangeBox.compare(appleBox));

        Box<Orange> anotherOrangeBox = new Box<>(new ArrayList<>(Arrays.asList(new Orange())));
        System.out.println("Weight of a new box with oranges: " + anotherOrangeBox.getWeight());
        orangeBox.pourAllFruits(anotherOrangeBox);
        System.out.println("Weight of the first box with oranges after pouring (it should be empty): " + orangeBox.getWeight());
        System.out.println("Weight of the second new box with oranges after pouring (its weight should get bigger): " + anotherOrangeBox.getWeight());
    }
}
