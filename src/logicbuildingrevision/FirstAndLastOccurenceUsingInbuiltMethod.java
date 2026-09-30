package logicbuildingrevision;

public class FirstAndLastOccurenceUsingInbuiltMethod {
    public static void main(String[] args){
        String input = "Hello World";
        int firstOccurence = -1;
        int lastOccurence = -1;
        for(char c : input.toCharArray()){
            firstOccurence = input.indexOf('o');
            lastOccurence = input.lastIndexOf('o');
        }
        System.out.println("["+firstOccurence+","+lastOccurence+"]");
    }
}
