//https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int majorityElement(int[] nums) {
        int current = 0;
        int count = 0;


        for(int num : nums){
            if(count == 0){
                current = num;
            }

            if (current == num){
                count++;
            }else {
                count--;
            }
        }

        return current;

    }
}
