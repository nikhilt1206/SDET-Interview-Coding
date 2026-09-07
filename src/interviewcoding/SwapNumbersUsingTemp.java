package interviewcoding;

public class SwapNumbersUsingTemp {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int temp;
        System.out.println("Before swapping a : "+a);
        System.out.println("Before swapping b : "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping a : "+a);
        System.out.println("After swapping b : "+b);
    }
}
