package logicbuildingrevision;

public class MonotonicArray {
    public static void main(String[] args){
        //Monotonic Arrays - if all the elements in the array are either increasing or decreasing
        int[] array = {1,2,3,4,5};
        boolean increasing=true;
        boolean decreasing=true;
        for(int i=1;i<=array.length-1;i++){
            if(array[i-1]<array[i]){
                decreasing=false; //increasing
            }
            else if(array[i-1]>array[i]){
                increasing=false; //decreasing
            }
        }
        if(increasing||decreasing){
            System.out.println("The given array is Monotonic Array");
        }
        else{
            System.out.println("The given array is not Monotonic Array");
        }
    }
}
