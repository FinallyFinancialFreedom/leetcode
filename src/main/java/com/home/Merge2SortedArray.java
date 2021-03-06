package com.home;

/**
 * Created by liyang on 10/2/17.
 * liyang27@le.com;
 * only in letv.
 */
public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] a= {1,3,15,17,19};
        int[] b= {2,4,6,8,10};
        final int[] ints = merge2SortedArray(a, b);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    private static int[] merge2SortedArray(int[] a, int[] b) {
        int aLength = a.length;
        int bLength = b.length;
        int[] merged = new int[aLength + bLength];
        int i=0,j=0;
        while (i < aLength || j < bLength) {
            if (a[i] <= b[j]) {
                merged[i + j] = a[i];
                i++;
            } else {
                merged[i + j] = b[j];
                j++;
            }
        }
        return merged;
    }
}
