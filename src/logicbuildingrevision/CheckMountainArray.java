package logicbuildingrevision;

public class CheckMountainArray {
    public static void main(String[] args){
        //Mountain array - Element must be strictly Increasing and strictly Decreasing order
        //Length of the array must be greater than 2
        int[] a = {1,2,4,6,3,1,0};
        System.out.println(mountainArrayCheck(a));
    }

    private static boolean mountainArrayCheck(int[] a) {
        if(a.length<3){
            return false;
        }
        int i=0;
        if(i==0 || i == a.length-1){ return false; }
        while(i+1<a.length && a[i]<a[i+1]){
            i++;
        }
        while(i+1<a.length && a[i]>a[i+1]){
            i++;
        }
        if(a.length-1==i){
            return true;
        }
        return false;
    }
}
