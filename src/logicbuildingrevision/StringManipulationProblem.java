package logicbuildingrevision;

public class StringManipulationProblem {
    public static void main(String[] args){
        double number = 123.3434356;
        //Converting double into String - String.valueOf() - anything into String
        String input = String.valueOf(number);
        System.out.println(input);
        int indexOfDecimal = input.indexOf(".");
        System.out.println(indexOfDecimal);
        System.out.println("Digits after decimal : "+(input.length()-indexOfDecimal-1));
    }
}
