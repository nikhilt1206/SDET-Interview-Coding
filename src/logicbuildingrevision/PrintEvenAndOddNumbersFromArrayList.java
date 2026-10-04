package logicbuildingrevision;

import java.util.ArrayList;

public class PrintEvenAndOddNumbersFromArrayList {
    public static void main(String[] args){
        ArrayList al = new ArrayList<>();
        //Since there are no generics passed so we can pass any type of value to this ArrayList
        //Default generics : Object
        al.add("Java"); //string
        al.add(23); //integer
        al.add(null); //null
        al.add(24); //integer
        al.add(24.5); //double
        for(Object o : al){
            if(o instanceof Integer){ //tells that object belongs to a certain class or not (NPDT)
                if((Integer)((Integer) o).intValue()%2==0){
                    System.out.println("Even: "+o);
                }
                else{
                    System.out.println("Odd: "+o);
                }
            }
        }
    }
}
