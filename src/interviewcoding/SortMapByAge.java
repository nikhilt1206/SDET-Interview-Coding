package interviewcoding;

import java.util.*;

public class SortMapByAge {
    public static void main(String[] args){
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("Robin",27);
        map.put("John",34);
        map.put("Nikhil",10);
        map.put("Rola",16);
        map.put("Simmi",20);
        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Comparator.comparingInt(entry->entry.getValue()));
        LinkedHashMap<String,Integer> linkedHashMap= new LinkedHashMap<>();
        for(Map.Entry<String,Integer> data : entries){
            linkedHashMap.put(data.getKey(), data.getValue());
            System.out.println(data.getKey()+"->"+data.getValue());
        }
    }
}
