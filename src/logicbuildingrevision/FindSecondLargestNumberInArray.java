package logicbuildingrevision;

public class FindSecondLargestNumberInArray {
    public static void main(String[] args){
        //Brute Force - Sort the array and take the second last element - Sorting is very expensive process
        //Big data set perspective, sorting is not preferred (swapping,traversing) - not optimized solution
        //One Pass Solution

        int[] array = {1,3,2,7,5};
        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;
        for(int num : array){
            if(num>largestNumber){
                secondLargestNumber = largestNumber;
                largestNumber = num;
            }
            else if(num>secondLargestNumber && num!=largestNumber){
                secondLargestNumber = num;
            }
        }
        System.out.println("Second Largest Number : "+secondLargestNumber);
    }
}
