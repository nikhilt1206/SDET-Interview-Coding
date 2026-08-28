package interviewcoding;

public class CompareIntgerWithString {
    public static void main(String[] args){
        String str = "12345";
        int number = 12345;
        int convertedNum = Integer.parseInt(str);

        if(convertedNum == number){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
