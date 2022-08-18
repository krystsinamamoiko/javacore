package lesson05;

public class Main {
    private static final String FILE_NAME = "appData.csv";
    private static final String CSV_SPLIT_BY = ";";


    public static void main(String[] args) {
        String[] testHeader = {"Val1", "Val2", "Val3", "Val4"};
        int[][] testData = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20},
            {21, 22, 23, 24}
        };
        // create using real data
        //AppData appData1 = new AppData(testHeader, testData);
        //appData1.print();
        //appData1.save();
        // create using ready csv file
        AppData appData2 = new AppData(FILE_NAME, CSV_SPLIT_BY);
        appData2.print();
    }
}
