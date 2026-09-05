package logicbuildingrevision;

import java.util.HashSet;
import java.util.Set;

public class PangramStringUsingCollection {
    public static void main(String[] args){
        String input = "The quick brown fox jumps over the lazy dog";
        input = input.toLowerCase();
        boolean result = checkPangramString(input);
        if(result){
            System.out.println("Pangram String");
        }
        else{
            System.out.println("Not a Pangram String");
        }
    }

    private static boolean checkPangramString(String input) {
        //HashSet - no duplicate elements/characters cannot be stored
        Set<Character> characterSet = new HashSet<>();
        for(char c : input.toCharArray()){
            if(Character.isLetter(c)){
                characterSet.add(c);
            }
        }
        if(characterSet.size()==26){
            return true;
        }
        return false;
    }
}
