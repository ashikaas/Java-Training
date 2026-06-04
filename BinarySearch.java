public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int target = 30;

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}