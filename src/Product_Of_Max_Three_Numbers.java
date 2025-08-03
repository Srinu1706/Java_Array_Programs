import java.util.Arrays;

public class Product_Of_Max_Three_Numbers {
    public static void main(String[] args) {
        int arr []={10,0,6,3,2};
        int product=1;
        Arrays.sort(arr);
        for(int i=2;i<=arr.length-1;i++){
        product=product*arr[i];
        }
        System.out.println(product);
    }
}
