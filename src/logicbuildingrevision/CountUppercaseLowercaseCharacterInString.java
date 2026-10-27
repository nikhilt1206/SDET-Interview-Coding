package logicbuildingrevision;

public class CountUppercaseLowercaseCharacterInString {
    public static void main(String[] args){
        String input = "aAbBcD";
        int upperCaseCount=0;
        int lowerCaseCount=0;
        for(char c : input.toCharArray()){
            if(Character.isLowerCase(c)){
                lowerCaseCount++;
            }
            else if(Character.isUpperCase(c)){
                upperCaseCount++;
            }
        }
        System.out.println("Uppercase Count : "+upperCaseCount);
        System.out.println("Lowercase Count : "+lowerCaseCount);
    }
}
