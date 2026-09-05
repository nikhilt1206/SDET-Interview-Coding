package interviewcoding;

public class StringModification1 {
    public static void main(String[] args){
        String amount = "$666.77";
        if(amount==null || amount.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : amount.toCharArray()){
            if(c == '.'){
                break;
            }
            else{
                if(Character.isDigit(c)){
                    sb.append(c);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
