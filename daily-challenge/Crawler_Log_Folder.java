import java.util.Stack;

public class Crawler_Log_Folder {
    public static int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();

        for (String log : logs) {
            if (log.equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();   
                }
            } else {
                if (!log.equals("./")) {
                    stack.add(log);
                }
            }
        }

        return stack.size();
    }

    public static void main(String[] args) {
        String[] logs = { "d1/", "d2/", "../", "d21/", "./" };
        System.out.println(minOperations(logs));
    }
}
