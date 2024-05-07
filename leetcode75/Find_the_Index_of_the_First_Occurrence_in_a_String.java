public class Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static int strStr(String haystack, String needle) {
        int res = -1;
        int needleIndex = 0;
        boolean isStart = true;

        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();

        for(int i = 0; i < haystackArr.length; i++) {
            if(haystackArr[i] == needleArr[i]) {
                if(needleIndex == needleArr.length-1) {
                    break;
                }
                
                needleIndex++;
                if(isStart) {
                    res = i;
                    isStart = false;
                }
            } else {
                needleIndex = 0;
                isStart = true;
                if(needleIndex == needleArr.length-1) {
                    res = -1;
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";

        System.out.println(strStr(haystack, needle));
    }
}