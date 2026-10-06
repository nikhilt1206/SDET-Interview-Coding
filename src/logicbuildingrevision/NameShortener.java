package logicbuildingrevision;

public class NameShortener {
    public static void main(String[] args){
        String fullName = "Vidya Bhushan Tiwari";
        String[] words = fullName.trim().split(" ");
        if(fullName.length()<2){
            System.out.println(fullName);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length-1;i++){
            sb.append(words[i].charAt(0)).append(". ");
        }
        sb.append(words[words.length-1]);
        System.out.println(sb.toString());
    }
}
