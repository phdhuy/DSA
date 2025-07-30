import java.util.Arrays;

public class Successful_Pairs_of_Spells_and_Potions {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];

        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            int count = 0;
            int mid = potions.length / 2;
            int left = 0;
            int right = potions.length;

            while (left < right) {
                if ((long) spells[i] * potions[mid] >= success) {
                    count += right - mid;
                    right = mid;
                    mid = (left + right) / 2;
                } else {
                    left = mid + 1;
                    mid = (left + right) / 2;
                }
            }

            res[i] = count;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] spells = { 1, 2, 3, 4, 5, 6, 7 };
        int[] potions = { 1, 2, 3, 4, 5, 6, 7 };
        int success = 25;

        successfulPairs(spells, potions, success);
    }
}
