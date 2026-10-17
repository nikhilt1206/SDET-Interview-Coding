package logicbuildingrevision;

public class LengthOfTheStringWithoutUsingLengthMethod {
    public static void main(String[] args){
        String input = "Hello";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        //Length of the string - total number of characters in string (should not use .length() method)
        int count = 0;
        //char[] charArray = input.toCharArray();
        for(char c : input.toCharArray()){
            count++;
        }
        System.out.println("Length of the String: "+count);
    }
}
