package org.example.Homework_Algoritms.countOccurrences;

public class countOccurrences {

    public static int countOccurrences(int arr[], int x) {
        int left = 0, right = arr.length - 1;
        int firstIndex = first(arr, left, right, x);
        int lastIndex = last(arr, left, right, x);
        if (firstIndex == -1) {
            return 0;
        } else {
            return lastIndex - firstIndex + 1;
        }
    }
    public static int first(int arr[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                return first(arr, (mid + 1), right, x);
            } else {
                return first(arr, left, (mid - 1), x);
            }
        }
        return -1;
    }

    public static int last(int arr[], int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if ((mid == arr.length - 1 || x < arr[mid + 1]) && arr[mid] == x) {
                return mid;
            } else if (x < arr[mid]) {
                return last(arr, left, (mid - 1), x);
            } else {
                return last(arr, (mid + 1), right, x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3};
        int x = 2;
        int count = countOccurrences(arr, x);
        System.out.println(count);
    }

}
