    package interviewcoding;

    import java.util.Arrays;

    public class StringArrayListFilteration {
        public static void main(String[] args){
            String[] airlines = {"PK12", "EK606", "TK09", "TK08", "MK858", "PK419"};
            int matchCount=0;
            for(String s : airlines){
                if(s.startsWith("PK")){
                    matchCount++;
                }
            }
            String[] result = new String[matchCount];
            int resultIndex=0;
            for(int i=0;i<airlines.length;i++){
                if(airlines[i].startsWith("PK")){
                    result[resultIndex]=airlines[i];
                    resultIndex++;
                }
            }
            System.out.println(Arrays.toString(result));
        }
    }
