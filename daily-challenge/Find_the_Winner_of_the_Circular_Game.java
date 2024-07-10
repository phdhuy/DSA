import java.util.ArrayList;
import java.util.List;

public class Find_the_Winner_of_the_Circular_Game {
    public static int findTheWinner(int n, int k) {
        List<Integer> friends = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            friends.add(i);
        }
        int currentIndex = 0;

        while (friends.size() > 1) {
            currentIndex = (currentIndex + k - 1) % friends.size();
            friends.remove(currentIndex);
        }

        return friends.get(0);
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 2));
    }
}
