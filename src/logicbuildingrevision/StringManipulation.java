package logicbuildingrevision;

public class StringManipulation {
    public static void main(String[] args){
        //Find the total number of characters that don't have whitespaces before and after them
        String input = "  Hie  ";
        char[] dataArray = input.toCharArray();
        int count=0;
        for(int i=0;i<dataArray.length;i++){
            char data = dataArray[i];
            if(data==' '){
                continue; //meaning nothing will be done just go to next index/iteration
            }
            //check for whitespace after the character
            boolean afterCharSpace = (i<dataArray.length-1) && (dataArray[i+1]==' ');
            //check for whitespace before the character
            boolean beforeCharSpace = (i>0) && (dataArray[i-1]==' ');
            if(!beforeCharSpace && !afterCharSpace){
                count++;
            }
        }
        System.out.println("Count of character whcih don't have whitespace before and after them : "+count);
    }
}
