package tasks;

import com.sun.jdi.Value;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static boolean isValid(String s)
    {

        Map<Character, Character> values = new HashMap<>();
        values.put(')', '(');
        values.put(']', '[');
        values.put('}','{');
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()){
            if (values.containsValue(c)){
                stack.push(c);
            } else if (values.containsKey(c)){
                if(stack.isEmpty() || stack.pop() != values.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
