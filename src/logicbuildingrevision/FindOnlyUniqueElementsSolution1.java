package logicbuildingrevision;
import java.util.HashSet;

public class FindOnlyUniqueElementsSolution1 {
    public static void main(String[] args){
        int[] a = {1,2,3,1,2};
        //Using collection - Hashed Set
        HashSet<Integer> seen = new HashSet<Integer>();
        HashSet<Integer> duplicates = new HashSet<Integer>();
        for(int num : a){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("Seen set : "+seen);
        System.out.println("Duplicate set : "+duplicates);
        seen.removeAll(duplicates);
        System.out.println("Unique : "+seen);
    }
}
