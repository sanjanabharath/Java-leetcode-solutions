public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,3};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int n=nums.length;
        int index=0;

        while(index<n){
            if(nums[index]!=index+1){
                if(nums[index]!=nums[nums[index]-1]){
                    swap(index,nums[index]-1,nums);
                }else{
                    return nums[index];
                }
                
            }else{
                index++;
            }
        }

        return -1;
    }

    public static void swap(int num, int correctNumber,int[] arr) {
        int temp=arr[num];
        arr[num]=arr[correctNumber];
        arr[correctNumber]=temp;
    }
}
