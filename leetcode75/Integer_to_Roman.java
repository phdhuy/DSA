import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Integer_to_Roman {
    public static String intToRoman(int num) {
        Map<String, Integer> symbol = new LinkedHashMap<>();
        symbol.put("M", 1000);
        symbol.put("CM", 900);
        symbol.put("D", 500);
        symbol.put("CD", 400);
        symbol.put("C", 100);
        symbol.put("XC", 90);
        symbol.put("L", 50);
        symbol.put("XL", 40);
        symbol.put("X", 10);
        symbol.put("IX", 9);
        symbol.put("V", 5);
        symbol.put("IV", 4);
        symbol.put("I", 1);

        StringBuilder sb = new StringBuilder();

        while(num != 0) {
            for(var entry : symbol.entrySet()) {
                if(num >= entry.getValue()) {
                    sb.append(entry.getKey());
                    num -= entry.getValue();
                    break;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 20;
        System.out.println(intToRoman(num));
    }
}
