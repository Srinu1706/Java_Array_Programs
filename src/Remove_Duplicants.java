import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicants {
    public static void main(String[] args) {
        int[] arr = {7, 13, 27, 15, 13, 27, 10, 05, 03};
//        Set<Integer> set= new LinkedHashSet<>();
//       for ( int num:arr){
//           set.add(num);
//       }
//        System.out.println(set);
//    }
        int [] unique=Arrays.stream(arr).distinct().toArray();
        System.out.println("removing after duplicants:"+Arrays.toString(unique));
    }
}
