


import java.util.*;

public class Repeat
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String name = sc.nextLine();
        int l=name.length();
        String result="";
        for(int i=0;i<l;i++){
            if(name.indexOf(name.charAt(i))==i)
            {
                result+=name.charAt(i);
            }
        }
        System.out.println(result);
        sc.close();
    }
}