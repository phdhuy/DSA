

public class Equal_Row_and_Column_Pairs {
    public static int equalPairs(int[][] grid) {
        int res = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int k = 0; k < grid.length; k++) {
                boolean isEqual = true;
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] != grid[j][k]) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual)
                    res++;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int input[][] = { { 3, 1, 2, 2 }, { 1, 4, 4, 5 }, { 2, 4, 2, 2 }, { 2, 4, 2, 2 } };
        System.out.println(equalPairs(input));
    }
}
