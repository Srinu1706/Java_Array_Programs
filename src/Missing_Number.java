public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,5};
//        int[] arr = { 5,6,8};
        int expectedsum;
        int n=arr.length+1;
        expectedsum=n*(n+1)/2;
        int actualsum=0;
        for(int number:arr){
            actualsum=actualsum+number;
        }
        int missingnumber=expectedsum-actualsum;
        System.out.println(missingnumber);
    }
}
