package logicbuildingrevision;

public class FindFrequencyOfCharactersWithoutUsingHashmap {
    public static void main(String[] args){
        String input = "abccaa";
        //Should not use Hashmap
        //For all the characters will have some ASCII (Integer) value (all the chars in keyboard)
        //0-9 : 48-57, A-Z : 65-90, a-z : 97-122
        //ASCII - Total : 0-255 (256 characters)
        int[] frequency = new int[256];
        //Here, index will represent the ASCII value of each character
        for(char c : input.toCharArray()){
            frequency[c]++;
            //frequency['a']++ = frequency[97]+1 = 0+1 = 1 and so on
        }
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>0){
                System.out.println((char)i+"->"+frequency[i]);
            }
        }
    }
}
