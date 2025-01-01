package rookie;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_Character_In_String {

    static void parseText(String data) {
        if (data.isEmpty()) {
            System.out.println("empty");
        }
        Map<Character, Integer> hashMap = new HashMap<>();
        char[] arr = data.toCharArray();

        for (Character c : data.toCharArray()) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, 1);
            } else {
                int temp = hashMap.get(c);
                temp++;
                hashMap.put(c, temp);
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                if (arr[i] == ' ') {
                    sb.append("space");   
                } else {
                    sb.append(arr[i]);
                }
                int count = hashMap.get(arr[i]);
                hashMap.remove(arr[i]);
                sb.append(" ");
                sb.append(count);

                if (!hashMap.isEmpty()) {
                    sb.append(",");
                }
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String input;
        Integer count = 0;

        while (myObj.hasNextLine()) {
            count++;
            input = myObj.nextLine();
            parseText(input);
        }
    }
}
