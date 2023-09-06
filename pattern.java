

public class pattern
{
   public static void main(String args[])
   {
       char c[]={'A','B','C','D','E','F','G','H','I','J'};
       int f=0;
       for(int i=5;i>0;i--)
       {
           for(int j=i;j>1;j--)
           {
               System.out.print(c[f]+" ");
               f++;
           }
           System.out.println();
       }
   }
}
