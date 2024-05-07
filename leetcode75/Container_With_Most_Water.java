public class Container_With_Most_Water {
    public static int maxArea(int[] height) {
        int max = 0;
        int leftPtr = 0;
        int rightPtr = height.length - 1;

        while (leftPtr < rightPtr) {
            int h = Math.min(height[leftPtr], height[rightPtr]);
            int width = rightPtr - leftPtr;
            int temp = h * width;
            max = Math.max(max, temp);

            if (height[leftPtr] < height[rightPtr]) {
                leftPtr++;
            } else {
                rightPtr--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }
}
