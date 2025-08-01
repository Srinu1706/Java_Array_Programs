import java.util.Arrays;
import java.util.Scanner;

public class Search_Element
{
    public static void main(String[] args) {
        int [] arr = {10, 20, 45, 30, 5};
       Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter Element to search");
        int target=scanner.nextInt();
//        boolean found=false;
//        for(int nums:arr){
//            if (target==nums){
//                found=true;
//                break;
//            }
//        }
//        if (found){
//            System.out.println("element found");
//        }
//        else {
//            System.out.println("not found");
//        }

        boolean found= Arrays.stream(arr).anyMatch(n->n==target);
        System.out.println(found?"Element founded":"not founded");
    }
}
