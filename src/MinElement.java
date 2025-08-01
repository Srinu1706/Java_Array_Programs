import java.util.Arrays;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 45, 30, 5};
        int min= Arrays.stream(arr).min().getAsInt();
            System.out.println(min);
//        int min=arr[0];
//        for(int nums:arr){
//            if(nums<min){
//                min=nums;
//            }
//        }
//        System.out.println(min);

//        for (int i=0;i<=arr.length-1;i++){
//            if (arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println(min);
        }
}
