
public class Determine_if_Two_Events_Have_Conflict {
    public static boolean haveConflict(String[] event1, String[] event2) {
        int endTime1StartTime2 = event2[0].compareTo(event1[1]);
        int startTime1EndTime2 = event2[1].compareTo(event1[0]);
        return (endTime1StartTime2 <= 0) && (startTime1EndTime2 >= 0);
    }
    
    public static void main(String[] args) {
        
    }
}
