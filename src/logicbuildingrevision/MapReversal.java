package logicbuildingrevision;

import java.util.HashMap;
import java.util.Map;

public class MapReversal {
    public static void main(String[] args){
        Map<String,Integer> ogMap = new HashMap<String,Integer>();
        ogMap.put("A",1);
        ogMap.put("B",2);
        ogMap.put("C",3);
        System.out.println(ogMap);
        //Reverse map means positions of Key and values will be changed (Value - String and Key - Integer)
        Map<Integer,String> reverseMap = new HashMap<Integer, String>();
        for(Map.Entry<String,Integer> data : ogMap.entrySet()){
            reverseMap.put(data.getValue(),data.getKey());
        }
        System.out.println(reverseMap);
    }
}
