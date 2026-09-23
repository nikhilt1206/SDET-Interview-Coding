package interviewcoding;

public class FindWordCountInString {
    public static void main(String[] args){
        String input = "my name is umesh";
        if(input==null || input.isEmpty()){
            System.out.println("Invalid input!!");
            return;
        }
        int wordCount=0;
        input=input.trim();
        boolean inWord=false;
        for(char c : input.toCharArray()){
            if(c==' '){
                inWord=false;
            }
           else if(c!=' ' && inWord==false){
                wordCount++;
                inWord=true;
            }
        }
        System.out.println("Word Count: "+(wordCount));
    }
}
