
import java.util.Stack;
public class Brackets {
    private Stack<Character> stack;
    public boolean CorrectBrackets(String brackets)
    {
        if(brackets.startsWith(")") || brackets.endsWith("(")){
            return false;
        }
        stack=new Stack<Character>();
        stack.push(brackets.charAt(0));
        for(int i=1; i<brackets.length(); i++)
        {
            if(brackets.charAt(i)=='(')
            {
                stack.push(brackets.charAt(i));
            }
            if(brackets.charAt(i) == ')')
            {
                stack.pop();              
            }
        }
        return stack.isEmpty();
    }
}
