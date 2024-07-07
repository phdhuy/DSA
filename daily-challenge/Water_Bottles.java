public class Water_Bottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;

        while (numBottles >= numExchange) {
            if (numBottles % numExchange == 0) {
                numBottles /= numExchange;
                res += numBottles;
            } else {
                int temp = numBottles;
                numBottles /= numExchange;
                res += numBottles;
                numBottles += temp % numExchange;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(9, 3));
    }
}
