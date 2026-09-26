package logicbuildingrevision;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args){
        String input = "{(([]))}";
        System.out.println(checkValidParenthesis(input));
    }

    private static boolean checkValidParenthesis(String input) {
        char[] inputArray = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : inputArray){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char pop = stack.pop();
                    if((c==')')&&(pop!='(') ||(c=='}')&&(pop!='{') ||(c==']')&&(pop!='[')){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
