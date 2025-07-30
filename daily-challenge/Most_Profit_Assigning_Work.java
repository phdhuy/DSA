public class Most_Profit_Assigning_Work {

  public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
    int res = 0;

    for (int i = 0; i < worker.length; i++) {
      int largerstProfit = 0;
      for (int j = 0; j < difficulty.length; j++) {
        if (worker[i] >= difficulty[j]) {
          if (profit[j] > largerstProfit) {
            largerstProfit = profit[j];
          }
        }
      }
      res += largerstProfit;
    }

    return res;
  }

  public static void main(String[] args) {}
}
