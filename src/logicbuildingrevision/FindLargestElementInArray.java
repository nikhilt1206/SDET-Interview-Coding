package logicbuildingrevision;

public class FindLargestElementInArray {
    public static void main(String[] args){
        int[] input = {10,20,30,40,60,50};
        int largestElement=input[0];
        for(int i=1;i<input.length;i++){
            if(input[i]>largestElement){
                largestElement=input[i];
            }
        }
        System.out.println("Largest element: "+largestElement);
    }
}
