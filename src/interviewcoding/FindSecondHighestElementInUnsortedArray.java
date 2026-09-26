package interviewcoding;

public class FindSecondHighestElementInUnsortedArray {
    public static void main(String[] args){
        int[] array = {12, 35, 1, 10, 34, 1};
        if(array==null || array.length==0){
            System.out.println("Invalid input!!");
            return;
        }
        int highestElement = Integer.MIN_VALUE;
        int secondHighestElement = Integer.MIN_VALUE;
        for(int num : array){
            if(num>highestElement){
                secondHighestElement=highestElement;
                highestElement=num;
            }
            else if(num>secondHighestElement && num!=highestElement){
                secondHighestElement=num;
            }
        }
        System.out.println("Second Highest Element : "+secondHighestElement);
    }
}
