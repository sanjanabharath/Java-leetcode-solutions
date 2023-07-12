//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {11,13,15,17};
        int pivot = pivot(arr);
        System.out.println(searchMin(arr, pivot));
    }

    static int searchMin(int[] nums, int pivot){
        if (pivot == -1){
            return nums[0];
        }

        return nums[pivot+1];
    }

    static int pivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        int pivot = -1;

        while(start <= end){
            int mid = start + (end - start);

            if (mid < end && nums[mid] > nums[mid+1]){
                pivot = mid;
            }
            if (mid > start && nums[mid] < nums[mid-1]){
                pivot = mid-1;
            }
            if (nums[start] >= nums[mid]){
                end = mid-1;
            }
            if (nums[start] < nums[mid]){
                start = mid+1;
            }
        }

        return pivot;
    }
}