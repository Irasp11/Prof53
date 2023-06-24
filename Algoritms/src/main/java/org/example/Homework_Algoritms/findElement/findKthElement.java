package org.example.Homework_Algoritms.findElement;

public class findKthElement {
    public static int findKthElement(int[] arr1, int[] arr2, int k) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArr = new int[n1 + n2];
        int i = 0, j = 0, index = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                mergedArr[index++] = arr1[i++];
            } else {
                mergedArr[index++] = arr2[j++];
            }
        }
        while (i < n1) {
            mergedArr[index++] = arr1[i++];
        }
        while (j < n2) {
            mergedArr[index++] = arr2[j++];
        }
        return mergedArr[k-1];

    }
}