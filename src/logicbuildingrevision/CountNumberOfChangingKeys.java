package logicbuildingrevision;

public class CountNumberOfChangingKeys {
    public static void main(String[] args){
        String input = "abBc";
        //How many characters are getting changed in the string (lowercase -> Uppercase : No Change)
        int changeCount=0;
        char lastKey=input.charAt(0);
        lastKey = Character.toLowerCase(lastKey);
        for(int i=1;i<=input.length()-1;i++){
            char currentKey = input.charAt(i);
            currentKey = Character.toLowerCase(currentKey);
            if(currentKey!=lastKey){
                changeCount++;
            }
            lastKey=currentKey;
        }
        System.out.println("Changing Keys Count: "+changeCount);
    }
}
