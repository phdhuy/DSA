public class Adding_Spaces_to_a_String {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        char[] sArr = s.toCharArray();
        int index = 0;

        for (int i = 0; i < sArr.length;) {
            if (index <= spaces.length - 1 && i == spaces[index]) {
                sb.append(' ');
                index++;
            } else {
                sb.append(sArr[i]);
                i++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "icodeinpython";
        int[] spaces = {1, 5, 7, 9 };

        System.out.println(addSpaces(s, spaces));
    }
}
