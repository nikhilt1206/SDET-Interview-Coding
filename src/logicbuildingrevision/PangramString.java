package logicbuildingrevision;

public class PangramString {
    public static void main(String[] args){
        String input = "The quick brown fox jumps over the lazy dog";
        input = input.toLowerCase();
        //All 26 English alphabets are present in this string - Pangram String
        //Minimum 26 letters - (length >= 26) and then check for all 26 letters
        //if indexOf gives -1 means that letter is not present in the given string
        boolean result = checkPangram(input);
        if(result){
            System.out.println("It is Pangram String");
        }
        else{
            System.out.println("It is not a Pangram String");
        }
    }

    private static boolean checkPangram(String input) {
        if(input.length()<26){
            return false;
        }
        for(char i='a';i<='z';i++){
            if(input.indexOf(i)<0){
                return false;
            }
        }
        return true;
    }
}
