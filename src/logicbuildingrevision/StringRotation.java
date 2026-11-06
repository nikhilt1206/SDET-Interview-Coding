package logicbuildingrevision;

public class StringRotation {
    public static void main(String[] args){
        String s1 = "INTERVIEW";
        String s2 = "VIEWINTER";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        //if concatenation of s1 + s1 contains a substring which is s2 then they are rotation of each other
        if(s1.length()==s2.length() && (s1+s1).contains(s2)){
            System.out.println("2 Strings are rotation of each other");
        }
        else{
            System.out.println("2 Strings are not rotation of each other");
        }
    }
}
