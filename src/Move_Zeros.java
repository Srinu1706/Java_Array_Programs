import java.util.Arrays;

public class Move_Zeros {
    public static void main(String[] args) {
        int []nums = {1,0,2,0,3,0,4};//1,3,12,
        MovieZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void MovieZeros(int nums[]){
        int position=0;
        for (int number:nums){
            if(number!=0){
                nums[position]=number;
                position++;
            }
        }
        for(int i=position;i<=nums.length-1;i++){
            nums[i]=0;
        }

    }
}
