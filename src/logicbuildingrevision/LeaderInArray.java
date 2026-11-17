package logicbuildingrevision;

public class LeaderInArray {
    public static void main(String[] args){
        //All the numbers right to the leader should be less - largest number compare to all right numbers
        //Print how many leaders are there?
        //Last number will be always leader number - right side nothing is there i.e. 0
        int[] a = {16,17,4,3,5,2};
        int length=a.length;
        int maxRight=a[length-1];
        System.out.println(maxRight);
        for(int i=a.length-2;i>=0;i--){
            if(a[i]>maxRight){
                maxRight=a[i];
                System.out.println(maxRight);
            }
        }
    }
}
