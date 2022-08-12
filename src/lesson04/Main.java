package lesson04;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // -------------------- Task 1
        // initiate a String array
        String[] strArray = {"один", "три", "три", "два", "три", "четыре", "четыре", "пять", "пять", "два", "четыре", "четыре", "пять", "пять", "пять"};
        // print only unique words in the given String array
        printUniqueStrings(strArray);
        // print info about duplicate words in the given String array
        printNumberDuplicateStrings(strArray);

        // -------------------- Task 2
        PhoneDirectory directory = new PhoneDirectory();
        // add records into the phone directory
        directory.add("Mamoiko","+375(29) 211-70-41");
        directory.add("Mamoiko","+375(29) 511-31-00");
        directory.add("Khadziayeva","+375(33) 521-12-41");
        // attempt to add phone duplicate for the existing in phone directory surname
        directory.add("Khadziayeva","+375(33) 521-12-41");
        // print phones for the given surnames (they exist in the phone directory)
        directory.printPhonesBySurname("Mamoiko");
        directory.printPhonesBySurname("Khadziayeva");
        // print the entire phone directory
        directory.printPhoneDirectory();
        // print phones for the given surnames (id does NOT exist in the phone directory)
        directory.printPhonesBySurname("Ivanov");
    }

    /**
     * Find and print a list of unique words in the given String array.
     * @param strArray is the given String array.
     */
    public static void printUniqueStrings(String[] strArray) {
        TreeSet<String> strHashSet = new TreeSet<>(Arrays.asList(strArray));
        System.out.println(strHashSet);
    }

    /**
     * Count duplicates in the given String array and print the relevant information.
     * @param strArray is the given String array.
     */
    public static void printNumberDuplicateStrings(String[] strArray) {
        ArrayList<String> arrayStrList = new ArrayList<>(Arrays.asList(strArray));
        Collections.sort(arrayStrList);
        System.out.println("Info about duplicates our the following array " + arrayStrList + ":");
        String checkingWord = "";
        for (String strElement: arrayStrList) {
            if (!checkingWord.equals(strElement)) {
                checkingWord = strElement;
                System.out.println(strElement + " is met " + Collections.frequency(arrayStrList, strElement) + " times");
            }
        }
    }
}
