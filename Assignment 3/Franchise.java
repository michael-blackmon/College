public class Franchise {
    private Store stores[];

    public Franchise(int num) {
        stores = new Store[num];
    }

    public Store getStores(int i) {
        return stores[i];
    }

    public void setStores(Store stores, int i) {
        this.stores[i] = stores;
    }

    public int numberofstores() {
        return stores.length;
    }

    // Method to calculate total sales for each week for a specific store
    public float[] calculateTotalSalesPerWeek(int storeIndex) {
        Store store = stores[storeIndex];
        float[] totalSales = new float[5];
        for (int week = 0; week < 5; week++) {
            float total = 0;
            for (int day = 0; day < 7; day++) {
                total += store.getsaleforweekdayintersection(week, day);
            }
            totalSales[week] = total;
        }
        return totalSales;
    }

    // Method to calculate average daily sales for each week for a specific store
    public float[] calculateAverageDailySalesPerWeek(int storeIndex) {
        float[] totalSales = calculateTotalSalesPerWeek(storeIndex);
        float[] averageDailySales = new float[5];
        for (int week = 0; week < 5; week++) {
            averageDailySales[week] = totalSales[week] / 7;
        }
        return averageDailySales;
    }

    // Method to calculate the total sales for all the weeks for a specific store
    public float calculateTotalSalesForAllWeeks(int storeIndex) {
        float[] totalSales = calculateTotalSalesPerWeek(storeIndex);
        float total = 0;
        for (float sales : totalSales) {
            total += sales;
        }
        return total;
    }

    // Method to calculate the average weekly sales for a specific store
    public float calculateAverageWeeklySales(int storeIndex) {
        float totalSales = calculateTotalSalesForAllWeeks(storeIndex);
        return totalSales / 5;
    }

    // Method to find the week with the highest amount in sales for a specific store
    public int findWeekWithHighestSales(int storeIndex) {
        float[] totalSales = calculateTotalSalesPerWeek(storeIndex);
        float maxSales = totalSales[0];
        int maxWeek = 1;
        for (int week = 1; week < 5; week++) {
            if (totalSales[week] > maxSales) {
                maxSales = totalSales[week];
                maxWeek = week + 1;
            }
        }
        return maxWeek;
    }

    // Method to find the week with the lowest amount in sales for a specific store
    public int findWeekWithLowestSales(int storeIndex) {
        float[] totalSales = calculateTotalSalesPerWeek(storeIndex);
        float minSales = totalSales[0];
        int minWeek = 1;
        for (int week = 1; week < 5; week++) {
            if (totalSales[week] < minSales) {
                minSales = totalSales[week];
                minWeek = week + 1;
            }
        }
        return minWeek;
    }
}
