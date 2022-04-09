package com.interview.prep.sort;

public class MergeSort {

    static void mergeSort(int[] array) {
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length - 1);
    }

    static void mergeSort(int[] array, int[] helper, int low, int high) {
       // System.out.println(low);
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, helper, low, middle);

            for(int i:array)
            {
                System.out.println(i);
            }
            mergeSort(array, helper, middle + 1, high);

        }
    }

    static void merge(int[] array, int[] helper, int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }
        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }
        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }
    }

    static void display(int[]arr)
    {
        for(int i:arr)
            System.out.println(i);
    }

    public static void main(String[] args) {
        int arr[] = {6, 2, 3, 9, 1, 4, 5};
        mergeSort(arr);
        display(arr);


    }
}
