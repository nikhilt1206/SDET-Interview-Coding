package interviewcoding;

public class CountOfEvenAndOddNumbersFromArray {
    public static void main(String[] args){
        int[] arr = {10,15,20,25,30,35,40};
        int evenCount=0;
        int oddCount=0;
        if(arr == null || arr.length==0){
            System.out.println("Invalid input!!");
            return;
        }
        for(int num : arr){
            if(num%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Even count : "+evenCount+", Odd count : "+oddCount);
    }
}
