import java.util.Arrays;

public class Problem4_Array_Partition {
      public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-1;i=i+2){
            sum +=nums[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int [] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }
}
