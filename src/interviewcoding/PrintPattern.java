package interviewcoding;

public class PrintPattern {
    public static void main(String[] args){
        int number = 2;
        for(int row=1;row<=number;row++){
            for(int col=1;col<=4;col++){
                System.out.print(col);
            }
            System.out.println("");
        }
    }
}
