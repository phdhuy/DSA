import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Password_Decryption {
    public static String decryptPassword(String s) {
        char[] arr = s.toCharArray();
        Stack<Integer> nums = new Stack<>();
        List<Character> characters = new ArrayList<>();
        StringBuilder res = new StringBuilder();
    
        for (Character c : arr) {
            if (Character.isDigit(c) && c != '0') {
                nums.push(Integer.parseInt(c.toString()));
            } else {
                characters.add(c);
            }
        }
    
        for (int i = 0; i < characters.size(); i++) {
            if (i < characters.size() - 1 && i < characters.size() - 2) {
                if (Character.isUpperCase(characters.get(i))
                        && Character.isLowerCase(characters.get(i + 1))
                        && characters.get(i + 2) == '*') {
                    res.append(characters.get(i + 1));
                    res.append(characters.get(i));
                    i += 2;
                } else if (Character.isLowerCase(characters.get(i))
                        && Character.isUpperCase(characters.get(i + 1))
                        && characters.get(i + 2) == '*') {
                    res.append(characters.get(i));
                    res.append(characters.get(i + 1));
                    i += 2;
                } else if (characters.get(i) == '0') {
                    res.append(nums.pop());
                } else if (!characters.get(i).equals('*')) {
                    res.append(characters.get(i));
                }
            } else {
                if(characters.get(i) == '0') {
                    res.append(nums.pop());
                } 
                else if (!characters.get(i).equals('*')) {
                    res.append(characters.get(i));
                }
            }
        }
    
        return res.toString();
    }
    

    public static void main(String[] args) {
        String encryptedPassword = "1Bl*Kg*u0";
        String decryptedPassword = decryptPassword(encryptedPassword);
        System.out.println(decryptedPassword);
    }
}
