public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int target = 30;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }

        System.out.println("Element not found");
    }
}