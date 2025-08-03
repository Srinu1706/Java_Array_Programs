public class Find_Missing_Number
{
    public static void main(String[] args) {
        int arr []={70,71,73,74};
        int mini=70;
        int maxi=74;
        int expecting=(maxi*(maxi+1)/2-mini*(mini-1)/2);
        int arraysum=0;

        for(int number:arr){
            arraysum+=number;
        }
        int missing_Number=expecting-arraysum;
        System.out.println(missing_Number);
    }

}
