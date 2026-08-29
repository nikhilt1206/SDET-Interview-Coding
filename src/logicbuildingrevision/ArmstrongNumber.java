package logicbuildingrevision;

public class ArmstrongNumber {
    public static void main(String[] args){
        //Armstrong Number : Cube of all the digits when added gives the same number
        // 153 = (1*1*1) + (5*5*5) + (3*3*3)

        int number = 153;
        int lastDigit;
        int armStrong = 0;
        int originalNum = number;

        while(number !=0){
            lastDigit = number % 10;
            number = number / 10;
            armStrong = armStrong + (lastDigit*lastDigit*lastDigit);
        }
        if(originalNum == armStrong){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
