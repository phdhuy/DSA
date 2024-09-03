public class Find_the_Student_that_Will_Replace_the_Chalk {
    public static int chalkReplacer(int[] chalk, int k) {
        int res = 0;
        int index = 0;
        while (true) {
            if (chalk[index] > k) {
                res = index;
                break;
            } else {
                k -= chalk[index];
                if (chalk.length - index == 1) {
                    index = 0;
                } else {
                    index++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
