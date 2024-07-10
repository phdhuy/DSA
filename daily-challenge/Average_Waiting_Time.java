public class Average_Waiting_Time {
    public static double averageWaitingTime(int[][] customers) {
        double waitingTime = 0;
        int currentTime = 0;

        for (int i = 0; i < customers.length; i++) {
            int arrival = customers[i][0];
            int service = customers[i][1];
            if (currentTime < arrival) {
                currentTime = arrival;
            }
            int currentWaitingTime = currentTime - arrival + service;
            waitingTime += currentWaitingTime;
            currentTime += service;
        }

        return waitingTime / customers.length;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 2, 5 }, { 4, 3 } };
        System.out.println(averageWaitingTime(arr));
    }
}
