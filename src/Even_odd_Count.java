import java.util.Arrays;

public class Even_odd_Count {
    public static void main(String[] args) {
        int [] arr = {10, 20, 45, 30, 5};
//        Integer even=0;
//        Integer odd=0;
//        for (Integer nums:arr){
//            if (nums%2==0){
//               even++;
//            }
//            else {
//                odd++;
//            }
//        }
//        System.out.println("even count " + even);
//        System.out.println("odd count " + odd);
        long even= Arrays.stream(arr).filter(n->n%2==0).count();
        long odd= Arrays.stream(arr).filter(n->n%2!=0).count();
        System.out.println("even count : "+even);
        System.out.println("odd count : "+odd);



    }
}
