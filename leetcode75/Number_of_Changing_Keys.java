public class Number_of_Changing_Keys {
    public static int countKeyChanges(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((int) arr[i] != (int) arr[i + 1] && (int) arr[i] != (int) arr[i + 1] + 32
                    && (int) arr[i] != (int) arr[i + 1] - 32) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "aAbBcC";
        System.out.println(countKeyChanges(s));
    }
}
