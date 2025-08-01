import java.util.Arrays;

public class Avg_array {
    public static void main(String[] args) {
        int [] arr = {10, 20, 45, 30, 5};
//        int sum=0;
//        for (int num:arr){
//          sum=sum+num;
//       }
//        double Avg= (double)sum/arr.length;
//        System.out.println(Avg);
        double Avg= Arrays.stream(arr).average().orElse(0);
        System.out.println("Avg of number : "+Avg);
    }
}
