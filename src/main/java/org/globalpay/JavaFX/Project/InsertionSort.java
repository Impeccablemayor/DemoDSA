package org.globalpay.JavaFX.Project;

public class InsertionSort {
    static void main() {
        int[] arr = {7,6,2,8,4};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
