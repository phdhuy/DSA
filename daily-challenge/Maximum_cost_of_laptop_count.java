import java.util.ArrayList;
import java.util.List;

public class Maximum_cost_of_laptop_count {
    public static int maxCost(List<Integer> cost, List<String> labels, int dailyCount) {
        // Write your code here
        int res = 0;
        int laptopOfDay = 0;
        int currentCost = 0;

        for (int i = 0; i < cost.size(); i++) {
            currentCost += cost.get(i);
            if (labels.get(i).equals("legal")) {
                laptopOfDay++;
            }

            if (laptopOfDay == dailyCount) {
                res = Math.max(currentCost, res);
                laptopOfDay = 0;
                currentCost = 0;
            }
        }
        res = Math.max(currentCost, res);

        return res;
    }

    public static void main(String[] args) {
        List<Integer> costs = new ArrayList<>();
        List<String> labels = new ArrayList<>();

        costs.add(0);
        costs.add(3);
        costs.add(2);
        costs.add(3);
        costs.add(4);

        labels.add("legal");
        labels.add("legal");
        labels.add("illegal");
        labels.add("legal");
        labels.add("legal");

        System.out.println(maxCost(costs, labels, 1));
    }
}
