public class Find_Missing_Number
{
    public static void main(String[] args) {
//        int arr []={70,71,73,74};
//        int arr []={5,6,8};
//        int arr []={3,0,1};
        int arr []={0,1,2,3,4,5,7,};
        int mini=0;
        int maxi=7;
//        int expecting=(maxi*(maxi+1)/2-mini*(mini-1)/2);
        int expecting = (maxi * (maxi + 1)) / 2 - ((mini - 1) * mini) / 2;
        int arraysum=0;

        for(int number:arr){
            arraysum+=number;
        }
        int missing_Number=expecting-arraysum;
        System.out.println(missing_Number);
    }

}
