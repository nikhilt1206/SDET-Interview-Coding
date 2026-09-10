package logicbuildingrevision;

public class SumOfArrayElements {
    public static void main(String[] args){
        int[] nums = {1,24,33,44};
        int sum=0;
        //for(int index=0;index<nums.length;index++){
        //    sum = sum + nums[index];
        //}
        //Using for Each loop (Enhanced loop)
        for(int num : nums){
            sum+=num;
        }
        System.out.println("Sum of array elements : "+sum);
    }
}
