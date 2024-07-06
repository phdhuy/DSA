public class Pass_the_Pillow {
    
    public static int passThePillow(int n, int time) {
        int direction = -1;
        int index = 1;
        
        while (time != 0) {
            if (index == n || index == 1) {
                direction *= -1;
                index += direction;
            } else {
                index += direction;
            }
            time--;
        }
        
        return index;
    }
    

    public static void main(String[] args) {
        int n = 4;
        int time = 5;
        System.out.println(passThePillow(n, time));
    }
}
