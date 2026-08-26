package logicbuildingrevision;

public class FindEvenOrOddNumberUsingBitManipulation {
    public static void main(String[] args){
        int number = 23;
        if((number & 1) == 1){
            System.out.println("Odd Number");
        }
        else{
            System.out.println("Even Number");
        }
    }
}
