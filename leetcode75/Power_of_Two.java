public class Power_of_Two {
    public static  boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else if (n == 1) { 
            return true;
        }
        
        return (n % 2 == 0) && isPowerOfTwo(n / 2);
    }

    public static void main(String[] args)  {
        isPowerOfTwo(16);
    }
}
