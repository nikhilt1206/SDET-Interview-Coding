package logicbuildingrevision;

public class AlphabetPatternPrinting {
    public static void main(String[] args){
         /*Print
           a
           a b
           a b c
           a b c d
           a b c d e
        */
        int totalNumberOfLines = 5;
        for(int row=1;row<=totalNumberOfLines;row++){ //to print rows
            for(int col=1;col<=row;col++){ //to print columns
                System.out.print((char) ('a' + col-1) + " ");
            }
            System.out.println("");
        }
    }
}
