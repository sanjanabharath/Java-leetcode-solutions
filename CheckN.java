//https://leetcode.com/problems/check-if-n-and-its-double-exist/

public class CheckN{
    public static void main(String[] args) {
        int[] nums={3,1,7,11};
        System.out.println(checkIfExist(nums));
    }

    public static boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == 2 * arr[j]){
                    return true;
                }
            }
        }

        return false;
    }
}