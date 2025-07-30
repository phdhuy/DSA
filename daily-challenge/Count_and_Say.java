public class Count_and_Say {
    public static String countAndSay(int n) {
        String result = "1";

        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char prev = result.charAt(0);

            for (int j = 1; j < result.length(); j++) {
                char curr = result.charAt(j);
                if (curr == prev) {
                    count++;
                } else {
                    sb.append(count).append(prev);
                    prev = curr;
                    count = 1;
                }
            }
            sb.append(count).append(prev);

            result = sb.toString();
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(countAndSay(n));
    }
}
