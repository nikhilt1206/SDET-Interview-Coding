package logicbuildingrevision;

public class CalculateSumOfIntegersInString {
    public static void main(String[] args){
        String input = "This is 1000 and it should be 20 30 50 1050";
        String[] words = input.split("\\s+");
        int totalSum = 0;
        for(String word : words){
            try{
                int number = Integer.parseInt(word);
                totalSum = totalSum + number;
            }
            catch(NumberFormatException e){
                //e.printStackTrace();
            }
        }
        System.out.println("Total Sum is : "+totalSum);
    }
}
