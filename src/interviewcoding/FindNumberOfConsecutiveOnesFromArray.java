package interviewcoding;

public class FindNumberOfConsecutiveOnesFromArray {
    public static void main(String[] args){
        int[] input = {1,1,0,1,1,1,1,0,0,0,0,1,1,1};
        if(input==null || input.length==0){
            System.out.println("Invalid Input!!");
            return;
        }
        int currentCount=0;
        int maxCount=0;
        for(int i=0;i<input.length;i++){
            if(input[i]==1){
                currentCount++;
                if(currentCount>maxCount){
                    maxCount=currentCount;
                }
            }
            else if(input[i]==0){
                currentCount=0;
            }
        }
        System.out.println("Max Consecutive 1's : "+maxCount);
    }
}
