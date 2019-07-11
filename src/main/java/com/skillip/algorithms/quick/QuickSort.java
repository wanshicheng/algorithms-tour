package com.skillip.algorithms.quick;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[10000000];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 100);
        }
        long start = System.currentTimeMillis();
        quickSort(array, 0, array.length - 1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static int[] quickSort(int[] array, int left, int right) {
        int l = left;
        int r = right;
        int pivot = array[(left + right) / 2];
        int temp = 0;

        while (l < r) {
            while (array[l] < pivot) {
                l++;
            }
            while (array[r] > pivot) {
                r--;
            }

            if (l >= r) {
                break;
            }

            temp = array[l];
            array[l] = array[r];
            array[r] = temp;

            if (array[l] == pivot) {
                r--;
            }

            if (array[r] == pivot) {
                l++;
            }
        }
        // 如果 l == r，必须 l++, r--， 否则为出现栈溢出
        if(l == r) {
            l++;
            r--;
        }

        if (left < r) {
            quickSort(array, left, r);
        }
        if (right > l) {
            quickSort(array,l, right);
        }
        return array;
    }
}
