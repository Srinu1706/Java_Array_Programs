public class Second_Largest {
    public static void main(String[] args) {
        int arr[]= {10,20,20, 40 ,50};
        int max=arr[0];
//        for (int nums:arr){
//            if(nums>max){
//                max=nums;
//            }
//        }
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
//        System.out.println(max);
        int secondmax=Integer.MIN_VALUE;
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]!=max&&arr[i]>secondmax){
                secondmax=arr[i];
            }
        }
        if (secondmax==Integer.MIN_VALUE){
            System.out.println("No second element found");
        }
        else {
            System.out.println("Secound element found "+secondmax);
        }
    }
}
