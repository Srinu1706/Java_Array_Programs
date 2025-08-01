import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Array_Reverse {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 45, 30, 5};
        List<Integer> list=Arrays.asList(arr);
        ListIterator<Integer> iterator=list.listIterator(list.size());
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
//        int reverse=0;
//        for(int i=arr.length-1;i>=0;i--){
//            System.out.println(arr[i]+" ");
//        }

    }
}
