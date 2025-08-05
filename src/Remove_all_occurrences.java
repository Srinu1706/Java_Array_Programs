public class Remove_all_occurrences {
    public static void main(String[] args) {
    int arr []={1, 4, 2, 4, 3, 4};
    int position=0;
    for (int number:arr){
        if (number!=4){
            arr[position]=number;
            position++;
        }
    }
    for (int i=0;i<position;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
