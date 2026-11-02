package interviewcoding;

public class CheckPangramString {
    public static void main(String[] args){
        String input = "The quick brown fox jumps over the lazy dog";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input");
            return;
        }
        input=input.toLowerCase();
        boolean isPangram = true;
        int[] freq = new int[26];
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch>='a' && ch<='z'){
                int index = ch - 'a';
                freq[index]++;
            }
        }
        for(int num : freq){
            if(num==0){
                isPangram=false;
                System.out.println("String is not pangram");
                break;
            }
        }
        if (isPangram) {
            System.out.println("String is pangram");
        } else {
            System.out.println("String is not pangram");
        }
    }
}
