package org.globalpay.JavaFX.Project;

import java.util.Scanner;

public class BubbleSort {

    static void main(String args[]) {
        int[] nums = {6,5,2,8,9,4};
        int size = nums.length;
        int temp = 0;

        for(int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j+ 1] = temp;
                }
            }
            for(int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
