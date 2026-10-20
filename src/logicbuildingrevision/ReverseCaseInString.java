package logicbuildingrevision;

public class ReverseCaseInString {
    public static void main(String[] args){
        String input = "Hello World";
        StringBuilder result = new StringBuilder();
        for(char c : input.toCharArray()){
            if(Character.isUpperCase(c)){
                result.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }
            else{
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}
