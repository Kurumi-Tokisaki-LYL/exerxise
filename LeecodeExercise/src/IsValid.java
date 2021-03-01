import java.util.Stack;

/**
 * Created by Kurumi Tokisaki on 2021-2-26.
 */
public class IsValid {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '[' || temp == '{')
                stack.push(temp);
            if (stack.isEmpty() && (temp == ')' || temp == ']' || temp == '}'))
                return false;
            if ((stack.peek() == '(' && (temp == ']' || temp == '}')) || (stack.peek() == '[' && (temp == ')' || temp == '}')) || (stack.peek() == '{' && (temp == ']' || temp == ')')))
                return false;
            if ((stack.peek() == '(' && temp == ')') || (stack.peek() == '[' && temp == ']') || (stack.peek() == '{' && temp == '}')) {
                stack.pop();
                continue;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "([}}])";
        IsValid isValid = new IsValid();
        System.out.print(isValid.isValid(str));
    }
}
