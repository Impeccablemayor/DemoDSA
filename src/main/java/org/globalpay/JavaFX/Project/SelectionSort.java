package org.globalpay.JavaFX.Project;

public class SelectionSort {

    static void main() {
        int[] arr = {6,5,2,8,3,7};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
