/**
 * Time_Needed_to_Buy_Tickets
 */
public class Time_Needed_to_Buy_Tickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int res = 0;
        int index = 0;

        while (tickets[k] != 0) {
            if (tickets[index] == 0) {
                if (index == tickets.length - 1) {
                    index = 0;
                } else {
                    index++;
                }
            } else {
                tickets[index] -= 1;
                res++;

                if (index == tickets.length - 1) {
                    index = 0;
                } else {
                    index++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 1, 1 };
        int k = 0;
        System.out.println("Hello World");
        System.out.println(timeRequiredToBuy(arr, k));
    }
}