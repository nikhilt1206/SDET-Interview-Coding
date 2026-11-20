package interviewcoding;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileHandlingQuestion {
    public static void main(String[] args) {
        File myFile = new File("application.log");
        if (!myFile.exists()) {
            System.out.println("File does not exist");
        } else if (!myFile.isFile()) {
            System.out.println("The given path is not a file");
        } else if (myFile.length() == 0) {
            System.out.println("File is empty");
        } else {
            String line;
            String[] words;
            HashMap<String,Integer> map = new HashMap<>();
            try(BufferedReader br = new BufferedReader(new FileReader(myFile))){
                while ((line = br.readLine()) != null) {
                    words = line.split("\\s+");
                    for(String word : words){
                        map.put(word, map.getOrDefault(word,0)+1);
                    }
                }
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if(entry.getValue()>1){
                        System.out.println(entry.getKey() + " = " + entry.getValue());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
