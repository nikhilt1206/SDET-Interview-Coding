package interviewcoding;

public class StringModification {
    public static void main(String[] args){
        String input = "NikhilTiwari";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length();i++){
            if(i%2!=0){
                sb.append("$");
            }
            else{
                sb.append(input.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
