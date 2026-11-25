package logicbuildingrevision;

import java.util.HashMap;
import java.util.Map;

public class FindMaxQuantity {
    public static void main(String[] args){
        String[] a = {"xyz 9","abc 20","xyz 21"};
        //xyz, abc - name of the product
        // 9,20,21 - quantity
        HashMap<String,Integer> hmap = new HashMap<>();
        for(String s : a){
            String[] data = s.split(" ");
            String name = data[0];
            int value = Integer.parseInt(data[1]);
            hmap.put(name,hmap.getOrDefault(name,0)+value);
        }
        int max=0;
        String result="";
        for(Map.Entry<String,Integer> entry : hmap.entrySet()){
            if(entry.getValue()>max){
                max= entry.getValue();
                result= entry.getKey();
            }
        }
        System.out.println(result+"-"+max);
    }
}
