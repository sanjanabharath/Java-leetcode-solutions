import java.util.ArrayList;
import java.util.List;

public class AllNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
       while (i< nums.length){
           int correct=nums[i];
           if (nums[i]!=nums[correct-1]){
               swap(i,nums[i]-1, nums);
           }else {
               i++;
           }
       }

        List<Integer> list=new ArrayList<>();
        for (i = 0; i < nums.length; i++) {
            int correctNumber=i+1;
            if (nums[i]!=correctNumber){
                list.add(correctNumber);
            }
        }

        return list;
    }
    
     public void swap(int num, int correctNumber,int[] arr) {
        int temp=arr[num];
        arr[num]=arr[correctNumber];
        arr[correctNumber]=temp;
    }
}
