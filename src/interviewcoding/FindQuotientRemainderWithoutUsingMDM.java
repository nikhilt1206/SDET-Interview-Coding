package interviewcoding;

public class FindQuotientRemainderWithoutUsingMDM {
    public static void main(String[] args){
        int dividend = 17;
        int divisor = 5;
        if(divisor==0){
            System.out.println("Invalid Opernation!!");
            return;
        }
        int remainder;
        int quotient = 0;
        int count=0;
        while(dividend>=divisor){
            dividend=dividend-divisor;
            count++;
        }
        quotient=count;
        remainder=dividend;
    }
}
