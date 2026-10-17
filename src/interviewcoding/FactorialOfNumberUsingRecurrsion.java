package interviewcoding;

public class FactorialOfNumberUsingRecurrsion {
    public static void main(String[] args){
        int number = 5;
        if(number<0){
            System.out.println("Invalid input!!!");
            return;
        }
        int fact = factorial(number);
        System.out.println(fact);
    }

    private static int factorial(int num) {
        if(num==0 || num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
}
