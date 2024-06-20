public class Find_the_Child_Who_Has_the_Ball_After_K_Seconds {
    public static int numberOfChild(int n, int k) {
        int position = 0;
        int direction = 1;

        for (int i = 0; i < k; i++) {
            position += direction;

            if (position == 0 || position == n - 1) {
                direction *= -1;
            }
        }

        return position;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 7;

        System.out.println(numberOfChild(n, k));
    }
}
