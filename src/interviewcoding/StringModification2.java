    package interviewcoding;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;

    public class StringModification2 {
        public static void main(String[] args){
            String[] input = {"Anindita", "is", "in", "the", "interview"};
            if(input==null || input.length==0){
                System.out.println("Invalid input!!");
                return;
            }
            ArrayList<String> list = new ArrayList<>();
            for(int i=0;i<input.length;i++){
                if(i%2!=0){
                    list.add(input[i]);
                }
            }
            Collections.reverse(list);
            int j=0;
            for(int i=1;i< input.length;i=i+2){
               input[i]=list.get(j);
               j++;
            }
            System.out.println(Arrays.toString(input));
        }
    }
