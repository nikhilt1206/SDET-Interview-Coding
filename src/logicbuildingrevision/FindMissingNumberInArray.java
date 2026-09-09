package logicbuildingrevision;

public class FindMissingNumberInArray {
    public static void main(String[] args){
        int numbers[] = {1,2,4,5,6};
        int totalSumOfAllNumbers=0;
        int totalNumbers=6;
        totalSumOfAllNumbers = (totalNumbers*(totalNumbers+1))/2;

        int sumOfArray=0;
        for(int i=0;i<numbers.length;i++){
            sumOfArray+=numbers[i];
        }
        System.out.println("Missing number is : "+(totalSumOfAllNumbers-sumOfArray));
    }
}
