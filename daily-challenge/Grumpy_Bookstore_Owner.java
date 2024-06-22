public class Grumpy_Bookstore_Owner {
    
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int numberOfCustomers = 0;
        int res = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                numberOfCustomers += customers[i];
            }
        }

        for (int i = 0; i <= grumpy.length - minutes; i++) {
            int temp = numberOfCustomers;

            for (int j = 0; j < minutes; j++) {
                if (grumpy[i + j] == 1) {
                    temp += customers[i + j];
                }
            }

            res = Math.max(temp, res);
        }


        return res;
    }

    public static void main(String[] args) {
        
    }
}
