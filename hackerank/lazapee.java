package hackerank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lazapee {
    public static int maxDiscount(int amount, int n, int k, List<Integer> types, List<Integer> discounts,
            List<Integer> minSpends) {
        int res = 0;
        int check = k;

        List<Integer> valueValidCoupon = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (amount >= minSpends.get(i)) {
                if (types.get(i) == 0) {
                    int value = amount * (discounts.get(i) / 100);
                    valueValidCoupon.add(value);
                } else {
                    valueValidCoupon.add(discounts.get(i));
                }
            }
        }

        Collections.sort(valueValidCoupon);

        if (check > valueValidCoupon.size()) {
            for (Integer i : valueValidCoupon) {
                res += i;
            }
        } else {
            for (int i = 0; i < check; i++) {
                res += valueValidCoupon.get(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
