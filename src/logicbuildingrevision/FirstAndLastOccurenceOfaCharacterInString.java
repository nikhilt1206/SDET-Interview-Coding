package logicbuildingrevision;

public class FirstAndLastOccurenceOfaCharacterInString {
    public static void main(String[] args){
        String input = "Hello World";
        int firstIndex = -1;
        int lastIndex = -1;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='o'){
                firstIndex=i;
                break;
            }
        }
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)=='o'){
                lastIndex=i;
                break;
            }
        }
        if(firstIndex<0){
            System.out.println("Character is not present!!");
        }
        else{
            System.out.println(firstIndex);
            System.out.println(lastIndex);
        }
    }
}
