package interviewcoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class FindSecondHighestSalaryOfEmployee {
    public static void main(String[] args){
        int[] salaries = {50000, 80000, 60000, 90000, 70000, 90000, 85000};
        if(salaries==null || salaries.length==0){
            System.out.println("Invalid input!!");
            return;
        }
        Optional<Integer> secondHighest = Arrays.stream(salaries)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        if (secondHighest.isPresent()) {
            System.out.println(secondHighest.get());
        } else {
            System.out.println("no second-highest distinct salary");
        }
    }
}
