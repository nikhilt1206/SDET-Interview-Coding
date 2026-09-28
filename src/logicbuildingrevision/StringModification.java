package logicbuildingrevision;

public class StringModification {
    public static void main(String[] args){

        //Replace all vowels with character 'X' in the input string
        String input = "Name";
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for(char c : input.toCharArray()){
            if(vowels.indexOf(c)!=-1){
                sb.append('x');
            }
            else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
