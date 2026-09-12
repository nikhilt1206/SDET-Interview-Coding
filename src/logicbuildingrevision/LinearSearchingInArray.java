package logicbuildingrevision;

public class LinearSearchingInArray {
    public static void main(String[] args){
        int[] input = {10,20,30,5,40};
        int key = 5;
        boolean isPresent = false;
        int position=-1;
        for(int index=0;index<input.length;index++){
            if(input[index]==key){
                isPresent=true;
                position=index;
                break;
            }
        }
        if(isPresent){
            System.out.println("Element found at : "+position);
        }
        else{
            System.out.println("Element not found!!");
        }
    }
}
