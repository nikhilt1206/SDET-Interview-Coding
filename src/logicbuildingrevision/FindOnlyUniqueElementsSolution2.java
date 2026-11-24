package logicbuildingrevision;

public class FindOnlyUniqueElementsSolution2 {
    public static void main(String[] args){
        //Without using Set - if an element is unique element then it's count will be 1
        int[] a = {1,2,3,1,2};
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(a[i]);
            }
        }
    }
}
