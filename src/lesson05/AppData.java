package lesson05;

import java.io.*;
import java.util.ArrayList;

public class AppData {
    private String[] header;
    private int[][] data;
    private String fileName = "appData.csv";
    private String cvsSplitBy = ";";

    /**
     * Create appData object with the given header and data.
     * @param newHeader is the given header.
     * @param newData is the given data.
     */
    public AppData(String[] newHeader, int[][] newData) {
        if (validateValuesNumber(newData, newHeader.length)) {
            this.header = newHeader;
            this.data = newData;
        } else {
            throw new IllegalArgumentException("Mismatch between header and data length!");
        }
    }

    /**
     * Create appData object using data from the given csv file and the given splitter.
     * @param fileName is the given csv file path.
     * @param cvsSplitBy is the given splitter.
     */
    public AppData(String fileName, String cvsSplitBy) {
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            header = br.readLine().split(cvsSplitBy);
            String line = "";
            ArrayList<String> lines = new ArrayList<>();
            while((line = br.readLine()) != null) {
                lines.add(line);
            }
            data = new int[lines.size()][header.length];
            for(int i = 0; i < lines.size(); i++) {
                data[i] = stringIntoIntArray(lines.get(i), cvsSplitBy);
                if (data[i].length != header.length) {
                    throw new IllegalArgumentException("Mismatch between header and data length!");
                }
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Check that all rows of the given int array have the expected length.
     * @param validatedData is the given int array.
     * @param expectedNumber is the expected length value.
     * @return
     */
    private boolean validateValuesNumber(int[][] validatedData, int expectedNumber) {
        for (int i = 0; i < validatedData.length; i++) {
            if (validatedData[i].length != expectedNumber) {
                return false;
            }
        }
        return true;
    }

    /**
     * Convert the given string into int array (using the given separator).
     * @param strToConvert is the given string.
     * @param cvsSplitBy is the given separator.
     * @return
     */
    private int[] stringIntoIntArray(String strToConvert, String cvsSplitBy) {
        String[] strArray = strToConvert.split(cvsSplitBy);
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            try {
                intArray[i] = Integer.parseInt(strArray[i]);
            } catch(NumberFormatException e) {
                System.out.println("Incorrect format. String '" + intArray[i] + "' can not be converted to int!");
            }
        }
        return intArray;
    }

    /**
     * Save appData into csv file
     */
    public void save() {
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {
            pw.println(String.join(cvsSplitBy, header));
            for (int i = 0; i < data.length; i++) {
                String str = "";
                for (int j = 0; j < data[i].length; j++) {
                    str = str + data[i][j];
                    if (j != data[i].length - 1) {
                       str += cvsSplitBy;
                    }
                }
                pw.println(str);
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Print appData into console
     */
    public void print() {
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(header[j] + ":" + data[i][j]);
                if (j < data[i].length - 1) {
                    System.out.print(cvsSplitBy + " ");
                }
            }
            System.out.println();
        }
    }
}
