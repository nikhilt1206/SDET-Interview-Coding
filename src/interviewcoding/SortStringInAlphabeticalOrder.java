package interviewcoding;

public class SortStringInAlphabeticalOrder {
    public static void main(String[] args){
        String input = "dcba";
        if(input == null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        StringBuilder sb = new StringBuilder(input);
        for(int i=0;i<input.length()-1;i++){
            for(int j=0;j<input.length()-1-i;j++){
                if(sb.charAt(j)>sb.charAt(j+1)){
                    char temp = sb.charAt(j);
                    sb.setCharAt(j,sb.charAt(j+1));
                    sb.setCharAt(j+1,temp);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
