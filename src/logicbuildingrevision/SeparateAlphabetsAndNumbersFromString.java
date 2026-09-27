package logicbuildingrevision;

public class SeparateAlphabetsAndNumbersFromString {
    public static void main(String[] args){
        //Separate Alphabets and Numbers from a String
        String input = "Ra123j";
        StringBuilder numbers = new StringBuilder();
        StringBuilder alphabets = new StringBuilder();
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                numbers.append(c);
            }
            else if(Character.isAlphabetic(c)){
                alphabets.append(c);
            }
        }
        System.out.println(alphabets);
        System.out.println(numbers);
    }
}
