package org.globalpay.JavaFX.Project;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main() {
        int[] nums = {5,7,9,11,13};
        int target = 11;
        int left = 0;
        int right = nums.length-1;

        int result = linearSearch(nums, target);
        int binarySearch = binarySearch(nums, target);
        int recursiveBinarySearch = recursiveBinarySearch(nums, target, left, right);

        System.out.println("Element was found at 'Recursive'" + recursiveBinarySearch);

        System.out.println("Element found at index " + binarySearch);


        if (result != -1) {
            System.out.println("Element found at index " + result);
        }else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left < right) {
            int mid = (right + left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else  {
                right = mid -1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] nums, int target,int left,int right ) {

        int mid = (right + left) / 2;
        if (left <= right)
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                recursiveBinarySearch(nums, target, nums[mid] + 1, right);
            } else {
                recursiveBinarySearch(nums, target, left, nums[mid] - 1);
            }

        return -1;
    }
}
