package logicbuildingrevision;

public class FibonacciSeries {
    public static void main(String[] args){
        int first = 0;
        int second = 1;
        int next = 0;
        int n = 10;
        if(n==1){
            System.out.println(first);
            return;
        }
        System.out.print(first+" "+second+" ");

        for(int i=2;i<n;i++){
            next = first + second;
            System.out.print(next+" ");
            first = second;
            second = next;
        }
    }
}
