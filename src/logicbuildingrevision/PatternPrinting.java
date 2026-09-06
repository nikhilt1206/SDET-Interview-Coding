package logicbuildingrevision;

public class PatternPrinting {
    public static void main(String[] args){
        /*Print
           1
           1 2
           1 2 3
           1 2 3 4
           1 2 3 4 5
        */
        int totalNumberOfLines = 5;
        for(int row=1;row<=totalNumberOfLines;row++){ //to print rows
            for(int col=1;col<=row;col++){ //to print columns
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }
}
