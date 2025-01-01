package rookie;

import java.util.*;

public class Grade_Calculator {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int cases = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> map = new HashMap<>();

        for (int i=1; i<= cases; ++i) {
            double input = Double.parseDouble(scanner.nextLine());
            
            if (IsValidInput(input)) {
                String grade = CalculateGrade(input);
                System.out.println(
                        String.format("Case %d: %s", i, grade));
                if (map.containsKey(grade)) {
                    int temp = map.get(grade);
                    temp++;
                    map.put(grade, temp);
                } else {
                    map.put(grade, 1);
                }
            }
            else {
                System.out.println(
                        String.format("Case %d: Invalid input", i));

                if (map.containsKey("Invalid")) {
                    int temp = map.get("Invalid");
                    temp++;
                    map.put("Invalid", temp);
                } else {
                    map.put("Invalid", 1);
                } 
            }
        }

        // TODO: Count Grades and Print out summary
        StringBuilder sb = new StringBuilder();
        sb.append("Summary ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("-");
            sb.append(entry.getValue());
            sb.append(" ");
        }
        System.out.println(sb);
    }
    
    private static boolean IsValidInput(double input) {
        if (input > 0 && input < 100) {
            return true;
        }
        return false;
    }
    private static String CalculateGrade(double input) {
        if (input >= 90) {
            return "A";
        } else if (input >= 80 && input <= 89) {
            return "B";
        } else if(input >= 70 && input <= 79) {
            return "C";
        } else if(input >= 60 && input <= 69) {
            return "D";
        } else {
            return "F";
        }
    }
}
