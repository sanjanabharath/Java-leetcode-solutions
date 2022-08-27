package NewStart.Arrays;

import java.util.Arrays;

//The question can be found using the following link
//https://leetcode.com/problems/rotate-array/

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={-1,-100,3,99};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
         k=k% nums.length;
         reverse(nums,0, nums.length-1);
         reverse(nums,0,k-1);
         reverse(nums,k, nums.length-1);
        }

    static void reverse(int[] arr,int start,int end) {
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    }

