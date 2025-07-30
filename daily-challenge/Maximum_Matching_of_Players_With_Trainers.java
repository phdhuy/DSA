import java.util.Arrays;

public class Maximum_Matching_of_Players_With_Trainers {
  public int matchPlayersAndTrainers(int[] players, int[] trainers) {
    int res = 0;
    int i = 0;
    int j = 0;

    Arrays.sort(players);
    Arrays.sort(trainers);

    while (i < players.length && j < trainers.length) {
      if (players[i] <= trainers[j]) {
        res++;
        i++;
        j++;
      } else {
        j++;
      }
    }

    return res;
  }

  public static void main(String[] args) {}
}
