public class CopyArray {
    public static void main(String[] args) {
        int [] OriginalArray = {10, 20, 45, 30, 5};
        int copy []=new int[OriginalArray.length];
        for (int i=0;i<=OriginalArray.length-1;i++){
             copy[i] =OriginalArray[i];
//            System.out.println(OriginalArray);
        }
        System.out.println("copied Array");
        for (int nums:copy){
            System.out.println( nums);
        }
        System.out.println("orginal Array");
        for (int numbers:OriginalArray){
            System.out.println(numbers);
        }
    }
}
