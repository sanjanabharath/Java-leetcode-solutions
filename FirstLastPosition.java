//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class FirstLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};

        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);

        return ans;

    }

    int search(int[] nums,int target,boolean firstIndex){
        int ans=-1;
        int start=0;
        int end= nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==target){
                ans=mid;
                if (firstIndex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }

        return ans;
    }
}