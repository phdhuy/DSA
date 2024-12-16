import java.util.Arrays;

public class Take_Gifts_From_the_Richest_Pile {
    public static long pickGifts(int[] gifts, int k) {
        long res = 0;

        for (int i = 0; i < k; i++) {
            Arrays.sort(gifts);
            gifts[gifts.length - 1] = (int) Math.sqrt(gifts[gifts.length - 1]);
        }

        for (Integer i : gifts) {
            res += i;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] gifts = { 1, 1, 1, 1};
        int k = 4;
        System.out.println(pickGifts(gifts, k));
    }
}
