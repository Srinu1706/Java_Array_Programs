public class Remove_element_at_a_given_index {
    //0/p {10, 20, 40}
    public static void main(String[] args) {
        int arr []={10, 20, 30, 40};
        int position=0;
        int target=30;
       for (int i=0;i<=arr.length-1;i++){
           if (arr[i]!=target){
               arr[position]=arr[i];
               position++;
           }
           }
        System.out.println("Updated Array");
        for (int i=0;i<position;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

