package logicbuildingrevision;

public class StringInJava {
    public static void main(String[] args){
        String str = "a"; //String Literal - will be stored in String Intern Pool
        //If we modify existing string - everytime it will create a new string - Strings are immutable
        str = "a" + 1; //new string "a1" gets created in the String Intern Pool
        str = str + "2"; //new string "a12" gets created in the String Intern Pool
        System.out.println(str);
        String y = "a12"; //It will first search in the SIP if there is already "a12" - if yes - y will point to it
        //intern = unique values only

        String name = new String("Java");
        //new keyword - this string is getting created/stored in a Heap Memory and name is reference
        String n = "Java"; //created in Intern Pool and n will point to it (before creating it will search)
        System.out.println(name == n);//Even through both variables contains same content "Java" but since they are created in different memory locations - output will be false
        String n1 = "Java"; //Already created in SIP and n is pointing to it
        System.out.println(n1 == n); //Both are pointing to same value/memory location - therefore it's true

        //Move String from Heap to Intern pool
        String surname = new String("Tiwari");
        String s = surname.intern(); //it will create "Tiwari" in the intern pool (if not present) and s will point to it
        //intern() method - creates a copy of string from Heap memory to String Intern Pool (if value not present)
        //We don't use string class for modification because strings are immutable (everytime new string gets created) - memory inefficient
        //In order to use memory efficiently - we use StringBuilder class (mutable)
        StringBuilder s1 = new StringBuilder();
        //Created in Heap memory - same string gets modified (no new string gets created even after multiple modifications)
    }
}
