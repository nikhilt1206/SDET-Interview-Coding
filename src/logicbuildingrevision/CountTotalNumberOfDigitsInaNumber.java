package logicbuildingrevision;

public class CountTotalNumberOfDigitsInaNumber {
    public static void main(String[] args){
        int number = 1234;
        int lastDigit;
        int count = 0;
        while(number!=0){
            lastDigit=number%10;
            count++;
            number=number/10;
        }
        System.out.println(count);

        //Another solution would be converted int to String and use the .length() method
        int num = 12345;
        String s = Integer.toString(num);
        System.out.println(s.length());
    }
}
