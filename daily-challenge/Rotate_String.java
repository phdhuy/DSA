
public class Rotate_String {
    public static boolean rotateString(String s, String goal) {
        if(s.length() > goal.length()) {
            return false;
        }

        return (s + s).contains(goal);
    }
    

    public static void main(String[] args) {
        String s = "defdefdefabcabc";
        String goal = "defdefabcabcdef";
        System.out.println(rotateString(s, goal));
    }
}
