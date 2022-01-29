package com.sunny.challenges.arrays;

import java.util.Arrays;

public class ReverseArray {
//    public static void main(String[] args) {
//
//        int[] arr = {1,2,3,4,5,6,7};
//
//        reverse(arr);
//
//        System.out.println(Arrays.toString(arr));
//    }

    public static void reverse(int[] arr){
        int last = arr.length-1;
        int first = 0;

        while(last>first){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = last;

            first++;
            last--;
        }
    }
}
