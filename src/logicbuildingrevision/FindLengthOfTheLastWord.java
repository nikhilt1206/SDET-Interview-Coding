package logicbuildingrevision;

public class FindLengthOfTheLastWord {
    public static void main(String[] args){
        String input = "Hello World";
        if(input==null|| input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        //Remove leading and trailing spaces so we can start from the last character
        //input = input.trim(); - since we are already checking (count>0) so trim() not required
        int count = 0;
        //Traverse from the last word
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)!=' '){
                count=count+1;
            }
            else{
                if(count>0){
                    System.out.println(count);
                    break;
                }
            }
        }
    }
}
