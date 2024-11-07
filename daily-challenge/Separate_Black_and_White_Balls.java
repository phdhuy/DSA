public class Separate_Black_and_White_Balls {
    public static long minimumSteps(String s) {
        int l = 0;
        int r = 1;
        int steps = 0;
        char[] arr = s.toCharArray();

        while (r <= s.length() - 1) {
            if (arr[r] != arr[l]) {
                if (arr[l] == '1') {
                    char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    
                    steps += 1;
                    
                    r++;
                    l++;
                } else {
                    r++;
                }
            } else {
                r++;
            }
        }

        return steps;
    }


    public static void main(String[] args) {
        String s = "0111";
        System.out.println(minimumSteps(s));
    }
}
