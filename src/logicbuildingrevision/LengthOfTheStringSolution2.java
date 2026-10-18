package logicbuildingrevision;

public class LengthOfTheStringSolution2 {
    public static void main(String[] args){
        String input = "Hello Worldp";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        //Length of the string - total number of characters in string (should not use .length() method)
        int count =0;
        while(true){
            try{
                input.charAt(count);
                count++;
            }
            catch (StringIndexOutOfBoundsException e){
                System.out.println(count);
                break;
            }
        }
    }
}
