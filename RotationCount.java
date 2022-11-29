public class RotationCount {
    public static void main(String[] args) {
        int[] n={4,5,6,7,0,1,2,3};
        int count=pivot(n)+1;
        System.out.println(count);
    }

    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int mid=start+((end-start)/2);

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }

            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[mid]>arr[start]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return -1;
    }
}
