public class MissingNumber {
    public static void main(String[] args) {

        int[] arr={3,0,1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int index=0;
        while(index<nums.length){
            if(nums[index]<nums.length && nums[index]!=index){
                swap(index, nums[index], nums);
            }else{
                index++;
            }
        }

        index=0;
        while(index<nums.length){
            if(nums[index]!=index){
                return index;
            }

            else{
                index++;
            }
        }

        return nums.length;
    }

    static void swap(int first,int second,int[] arr){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


}
