package logicbuildingrevision;

public class HollowPyramidPatternPrinting {
    public static void main(String[] args){
        /*
        1
        1 2
        1   3
        1     4
        1 2 3 4 5
        */
        int totalNumberOfLines = 5;
        for(int row=1;row<=totalNumberOfLines;row++){
            for(int col=1;col<=row;col++){
               if(col==1 || col==row ||row==totalNumberOfLines){
                   System.out.print(col);
               }
               else{
                   System.out.print(" ");
               }
            }
            System.out.println("");
        }
    }
}
