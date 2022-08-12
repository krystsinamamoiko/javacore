package lesson04;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    TreeMap<String, HashSet<String>> directoryList = new TreeMap<>();  // HashSet allows avoiding phone duplicates

    public PhoneDirectory() {
        super();
    }

    public PhoneDirectory(TreeMap<String, HashSet<String>> directoryList) {
        this.directoryList = directoryList;
    }

    /**
     * Add a new record into the phone directory.
     * @param surname is the given surname.
     * @param phoneNumber is the given phone number.
     */
    public void add(String surname, String phoneNumber) {
        HashSet<String> phones = new HashSet<>();
        if (directoryList.containsKey(surname)) {
            phones = directoryList.get(surname);
        }
        phones.add(phoneNumber);
        directoryList.put(surname, phones);
    }

    /**
     * Get phones set for the given surname.
     * @param surname is the given surname.
     * @return all phones if the given surname exist in the phone directory or null otherwise.
     */
    public HashSet<String> get(String surname) {
        return directoryList.get(surname);
    }

    /**
     * Print the entire phone directory.
     */
    public void printPhoneDirectory() {
        System.out.println("---Printing entire phone directory...");
        for(Map.Entry<String, HashSet<String>> entry: directoryList.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
        System.out.println("--------------------------------------");
    }

    /**
     * Print phones for the given surname.
     * @param surname is the given surname.
     */
    public void printPhonesBySurname(String surname) {
        if (directoryList.containsKey(surname)) {
            System.out.println("Phones for surname '" + surname + "':" + get(surname)) ;
        } else {
            System.out.println("Unfortunately, this phone directory does not contain any information for surname '" + surname + "'");
        }
    }
}
