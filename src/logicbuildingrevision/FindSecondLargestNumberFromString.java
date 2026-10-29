package logicbuildingrevision;

public class FindSecondLargestNumberFromString {
    public static void main(String[] args){
        String input = "abc321";
        findSecondLargest(input);
    }

    private static void findSecondLargest(String input) {
        int num;
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                //convert char to int, we have to subtract '0' from that character
                num = c -'0';
                if(num>first){
                    second=first;
                    first=num;
                }
                else if(num>second && num<first){
                    second=num;
                }
            }
        }
        System.out.println("Second largest number : "+second);
    }
}
