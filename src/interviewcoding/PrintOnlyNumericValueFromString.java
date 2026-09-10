package interviewcoding;

public class PrintOnlyNumericValueFromString {
    public static void main(String[] args){
        String input = "abc123xyz45";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : input.toCharArray()){
            //if(Character.isDigit(c) - this also we can use if not specified
            if(c>='0' && c<='9'){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
