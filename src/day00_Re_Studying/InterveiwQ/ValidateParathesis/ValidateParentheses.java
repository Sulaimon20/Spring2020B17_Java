package day00_Re_Studying.InterveiwQ.ValidateParathesis;
import java.util.HashMap;
import java.util.Stack;


public class ValidateParentheses {
    public static void main(String[] args) {
        System.out.println(isValidate("{{((([])))}}"));
        System.out.println(isValidateWithStringMethods("{{((([)))}}"));
    }
//Method 1
    public static boolean isValidateWithStringMethods(String s){
        while (s.contains("()")||s.contains("[]")||s.contains("{}")){
            s = s.replaceAll("\\(\\)","").replaceAll("\\[\\]","").replaceAll("\\{\\}","");
        }
        return s.length()==0;
    }
//method 2

    public static boolean isValidate(String s) {
        HashMap<Character, Character> map = new HashMap();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.keySet().contains(ch)) {
                stack.push(ch);
            } else if (map.values().contains(ch)) {
                if (!stack.empty() && map.get(stack.peek()) == ch) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}