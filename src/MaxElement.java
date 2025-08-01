import java.util.Arrays;

public class MaxElement {

    public static void main(String[] args) {
        int[] arr = {10, 20, 45, 30, 5};
//        int max=arr[0];

//        for ( int num:arr){
//        if(num>max){
//            max=num;
//        }
//        }
//        System.out.println(max);
//    }
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
//        for (int i=0;i<=arr.length-1;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
    }
}
