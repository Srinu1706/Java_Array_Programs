public class Count_Pairs_with_a_Given_Difference {
    public static void main(String[] args) {
       int [] arr  = {1, 5, 3, 4, 2};
       int k = 2;
        findPairsWithDiffernce(arr,k);
    }
    public static  void findPairsWithDiffernce(int arr [],int k){
    for (int i = 0;i<=arr.length-1;i++){
    for (int j=i+1;j<=arr.length-1;j++){
        if(arr[i]-arr[j]==k){
            System.out.println(arr[i]+","+arr[j]);
        }
    }
    }
    }
}
