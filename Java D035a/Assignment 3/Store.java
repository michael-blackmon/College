public class Store {
    private float salesbyweek[][];

    Store() {
        salesbyweek = new float[5][7];
    }

    public void setsaleforweekdayintersection(int week, int day, float sale) {
        salesbyweek[week][day] = sale;
    }

    public float getsaleforweekdayintersection(int week, int day) {
        return salesbyweek[week][day];
    }

    public void printdata() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(salesbyweek[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
