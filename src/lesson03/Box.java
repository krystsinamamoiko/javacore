package lesson03;

import lesson03.fruit.Fruit;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    /**
     * Get weight of the current box.
     * @return sum of all fruits weight.
     */
    public double getWeight() {
        double fullBoxWeight = 0;
        if (fruits != null && !fruits.isEmpty()) {
            for (T fruit : fruits) {
                fullBoxWeight += fruit.getWeight();
            }
        }
        return fullBoxWeight;
    }

    /**
     * Compare the current box with the given one.
     * @param another - the given another box
     * @return true if the given box has the same weight as the current one has.
     */
    public <Y extends Fruit> boolean compare(Box<Y> another) {
        return this.getWeight() == another.getWeight();
    }

    /**
     * Pour fruits from the current box to the given one (it is not possible to pour
     * fruits to the box with not the same type of fruits).
     * @param another - the given another box
     */
    public void pourAllFruits(Box<T> another) {
        for (T fruit : this.fruits) {
            another.addFruit(fruit);
        }
        this.fruits.clear();
    }

    /**
     * Add a new fruit into the current box.
     */
    public void addFruit(T newFruit) {
        fruits.add(newFruit);
    }
}
