package logicbuildingrevision;

import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args){
        //Anagram - 2 String which have common characters.
        String s1 = "silent";
        String s2 = "listen";
        if(s1.length()==s2.length()){
            char[] charS1 = s1.toCharArray();
            char[] charS2 = s2.toCharArray();
            Arrays.sort(charS1);
            Arrays.sort(charS2);
            if(Arrays.equals(charS1,charS2)){
                System.out.println("Anagram String");
            }
        }
        else{
            System.out.println("Not an Anagram String");
        }
    }
}
