package logicbuildingrevision;

public class ConvertIntgerToRoman {
    public static void main(String[] args){
        int number = 24;
        String[] symbols = {"L","XL","X","IX","V","IV","I"};
        int [] values = {50,40,10,9,5,4,1};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<values.length;i++){
            while(number>=values[i]){
                number = number-values[i];
                sb.append(symbols[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
