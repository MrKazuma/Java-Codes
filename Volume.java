

public class Volume
{
     double l,b,h,v;
     Volume()
     {
         l=0.0;
         b=0.0;
         h=0.0;
     }
     Volume(double l1,double b1)
     {
         l=l1;
         b=b1;
         h=1.0;
     }
     Volume(double l2,double b2,double h2)
     {
         l=l2;
         b=b2;
         h=h2;
     }
     void calvolume()
     {
         v=l*b*h;
         System.out.println("Dimensions: "+l+" , "+b+" , "+h);
         System.out.println("Voulme: "+v);
     }
     public static void main(String args[])
     {
         Volume ob1=new Volume();
         Volume ob2=new Volume(15.0,10.0);
         Volume ob3=new Volume(25.0,20.0,10.0);
         ob1.calvolume();
         System.out.println();
         ob2.calvolume();
         System.out.println();
         ob3.calvolume();
     }
}
