package logicbuildingrevision;

public class RemoveAllWhiteSpacesFromString {
    public static void main(String[] args){
        String input = "     Hello      World   ";
        //Remove all white spaces from starting and ending of the string
        input = input.trim();
        // [//s] -> single white space and [//s+] - multiple white spaces
        input = input.replaceAll("\\s+", " ");
        System.out.println(input);
    }
}
