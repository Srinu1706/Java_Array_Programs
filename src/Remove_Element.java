public class Remove_Element {
    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6,};
        int target=4;
        int index=-1;
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]==target){
                index=i;
            }
        }
        if (index==-1){
            System.out.println("No Element Found");
        }
        else {
            for (int i=index;i< arr.length-1;i++){
                arr[i]=arr[i+1];
        }
            System.out.println("After Removal:");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
