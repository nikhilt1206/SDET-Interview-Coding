package logicbuildingrevision;

public class StarPatternPrinting {
    public static void main(String[] args){
         /*Print
           *
           * *
           * * *
           * * * *
           * * * * *
        */
        int totalNumberOfLines = 5;
        for(int row=1;row<=totalNumberOfLines;row++){ //to print rows
            for(int col=1;col<=row;col++){ //to print columns
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
}
