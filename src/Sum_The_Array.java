import java.util.Arrays;

public class Sum_The_Array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 45, 30, 5};
//        int sum=0;
//        for (int i=0;i<=arr.length-1;i++){
//            sum=sum+arr[i];
//        }
//        System.out.println(sum);
//        for (int num:arr){
//           sum=sum+num;
//        }
//        System.out.println(sum);
        int sum= Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
