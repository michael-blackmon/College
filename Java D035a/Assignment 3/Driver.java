/*
MICHAEL BLACKMON
CIS D035A 16Z
ASSIGNMENT 3
DUE 7/25/23
SUBMITTED 7/25/23
 */
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        FileIO fileIO = new FileIO("D:\\College\\2023SUM\\Java D035A\\Assignments\\Assignment_3Try2\\src\\Salesdat.txt");
        Franchise f = fileIO.readData();

        Scanner input = new Scanner(System.in);

        int numStores = f.numberofstores();
        System.out.println("Enter the store number (1 to " + numStores + ") you want to display data for:");
        int selectedStore = input.nextInt();

        if (selectedStore >= 1 && selectedStore <= numStores) {
            displayStoreStatistics(f, selectedStore - 1);
        } else {
            System.out.println("Invalid store number. Please enter a valid store number.");
        }

        input.close();
    }

    public static void displayStoreStatistics(Franchise f, int storeIndex) {
        System.out.println("Store #" + (storeIndex + 1) + " Statistics:");
        System.out.println("Total Sales for each week:");
        float[] totalSalesPerWeek = f.calculateTotalSalesPerWeek(storeIndex);
        printArray(totalSalesPerWeek);

        System.out.println("Average Daily Sales for each week:");
        float[] averageDailySalesPerWeek = f.calculateAverageDailySalesPerWeek(storeIndex);
        printArray(averageDailySalesPerWeek);

        System.out.println("Total Sales for all weeks: " + f.calculateTotalSalesForAllWeeks(storeIndex));
        System.out.println("Average Weekly Sales: " + f.calculateAverageWeeklySales(storeIndex));
        System.out.println("Week with the highest amount in sales: " + f.findWeekWithHighestSales(storeIndex));
        System.out.println("Week with the lowest amount in sales: " + f.findWeekWithLowestSales(storeIndex));
    }

    // Helper method to print an array of floats
    private static void printArray(float[] array) {
        for (float value : array) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
}
