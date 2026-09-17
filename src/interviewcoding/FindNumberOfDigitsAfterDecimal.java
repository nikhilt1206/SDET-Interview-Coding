package interviewcoding;

public class FindNumberOfDigitsAfterDecimal {
    public static void main(String[] args){
        String input = "123.4562321312";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid Input!!");
            return;
        }
        if (!input.contains(".")) {
            System.out.println("No decimal part");
            return;
        }
        String[] str = input.split("\\.",-1);
        if (str[1].isEmpty()) {
            System.out.println("No digits after decimal");
            return;
        }
        System.out.println("Number of digits after decimal: " + str[1].length());
    }
}
