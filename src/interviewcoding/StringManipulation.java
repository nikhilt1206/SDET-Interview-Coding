package interviewcoding;

public class StringManipulation {
    public static void main(String[] args){
        //Convert HELLO -> hello
        String input = "HELLO";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid Input!!");
            return;
        }
        input = input.toLowerCase();
        System.out.println(input);
    }
}
