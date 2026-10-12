package logicbuildingrevision;

public class TransposeMatrix {
    public static void main(String[] args){
        //int[][] a = new int[3][2];
        int[][] a = {{1,2,3},{4,5,6}};
        if(a==null || a.length==0 || a[0].length==0){
            System.out.println("Invalid input!!..Transpose is not possible!");
        }
        else{
            for(int row=0;row<a.length;row++){
                for(int col=0;col<a[0].length;col++){
                    System.out.print(a[row][col]+" ");
                }
                System.out.println("");
            }
            int[][] result = new int[a[0].length][a.length];
            for(int row=0;row<a.length;row++){
                for(int col=0;col<a[0].length;col++){
                    result[col][row]=a[row][col];
                }
            }
            //Printing transposed array
            for(int row=0;row<result.length;row++){
                for(int col=0;col<result[0].length;col++){
                    System.out.print(result[row][col]+" ");
                }
                System.out.println("");
            }
        }
    }
}
