package interviewcoding;

public class ReverseString {
    public static void main(String[] args){
        String input = "Java";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            sb.append(input.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
