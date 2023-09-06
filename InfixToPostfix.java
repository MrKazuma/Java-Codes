
import java.util.*;

import java.io.IOException;

class Stackin_pos
{
    char ch[]=new char[50];
    int top=-1;
    void push(char c)
    {
        try
        {
            ch[++top]= c;
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Stack full, no room to push, size=100");
            System.exit(0);
        }
    }
    char pop()
    {
        return ch[top--];
    }
    boolean isEmpty()
    {
        return (top==-1)?true:false;
    }
    char peek()
    {
        return ch[top];
    }
}
public class InfixToPostfix
{
    static Stackin_pos operators = new Stackin_pos();
    public static void main(String argv[]) throws IOException
    {
        Scanner in=new Scanner(System.in);
        String infix;
        System.out.print("Enter the infix expression:");
        infix = in.nextLine();
        System.out.println("Postfix expression for the given infix expression is:" + toPostfix(infix));
        in.close();
    }
    private static String toPostfix(String infix)
    {
        char symbol;
        String postfix = "";
        for(int i=0;i<infix.length();++i)
        {
            symbol = infix.charAt(i);
            if (Character.isLetter(symbol))
                postfix = postfix + symbol;
            else if (symbol=='(')
            {
                operators.push(symbol);
            }
            else if (symbol==')')
            {
                while (operators.peek() != '(')
                {
                    postfix = postfix + operators.pop();
                }
                operators.pop();
            }
            else
            {
                while (!operators.isEmpty() && !(operators.peek()=='(') && prec(symbol) <= prec(operators.peek()))
                    postfix = postfix + operators.pop();
                operators.push(symbol);
            }
        }
        while (!operators.isEmpty())
            postfix = postfix + operators.pop();
        return postfix;
    }
    static int prec(char x)
    {
        if (x == '+' || x == '-')
            return 1;
        if (x == '*' || x == '/' || x == '%')
            return 2;
        return 0;
    }
}
