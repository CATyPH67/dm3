package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int key = -1;

        while (key != 0) {
            System.out.println("print 1 to array in order, 2 to array in reverse order, 3 to random array: ");
            key = sc.nextInt();
            switch (key) {
                case (1):
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = i + 1;
                    }
                    break;

                case (2):
                    for (int i = 0, j = size; i < arr.length; i++, j--) {
                        arr[i] = j;
                    }
                    break;

                case (3):
                    Random r = new Random();
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = r.nextInt(size);
                    }
                    break;

                default:
                    break;
            }

            System.out.printf("array: %s%n%n", Arrays.toString(arr));
            ResultSort resultShell = sortShell(arr);
            System.out.printf("for Shell sort count = %d, sorted array = %s%n%n",
                    resultShell.getCount(), Arrays.toString(resultShell.getArr()));
            ResultSort resultBubble = sortBubble(arr);
            System.out.printf("for bubble sort count = %d, sorted array = %s%n%n",
                    resultBubble.getCount(), Arrays.toString(resultBubble.getArr()));
            System.out.println("--------------------------------------");
        }

    }

    public static ResultSort sortShell(int[] sortableArr) {
        int[] array = sortableArr.clone();
        int count = 0;
        int h = 1;
        while (h*3 < array.length)
            h = h * 3 + 1;

        while(h >= 1) {
            count += hSort(array, h);
            h = h/3;
        }
        return new ResultSort(array, count);
    }

    private static int hSort(int[] array, int h) {
        int count = 0;
        int length = array.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h]) {
                    swap(array, j, j - h);
                    count++;
                }
                else
                    break;
            }
        }
        return count;
    }

    private static void swap(int[] arr, int a, int b) {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }

    public static ResultSort sortBubble(int[] sortableArr) {
        int[] array = sortableArr.clone();
        int count = 0;
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    swap(array, i, i + 1);
                    count++;
                }
            }
        }
        return new ResultSort(array, count);
    }
}
