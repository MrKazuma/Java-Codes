import java.util.*;
public class swapNibbles 
{
    static int swapnibbles(int x)
    {
        return((x & 0x0F)<<4 | (x & 0x0F)>>4);

    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of X:");
        int x=in.nextInt();
        String binary=Integer.toBinaryString(x);
        System.out.println("Bit value of "+x+" is "+binary);
        System.out.println(swapnibbles(x));
        in.close();
    }
    
}
