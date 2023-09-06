
import java.util.*;
public class Overload
{
    static double v;
    static double volume(double r)
    {
        v=(4.0/3.0)*(22.0/7.0)*Math.pow(r,3);
        return v;
    }
    static double volume(double h,double r)
    {
        v=(22.0/7.0)*Math.pow(r,2)*h;
        return v;
    }
    static double volume(double l,double b,double h)
    {
        v=l*b*h;
        return v;
    }
    public static void main(String args[])
    {
        double r1,r2,h1,h2,l,b;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of the sphere:");
        r1=in.nextDouble();
        System.out.println("Volume of sphere: "+volume(r1));
        System.out.println();
        System.out.println();
        System.out.println("Enter the radius of Cylinder:");
        r2=in.nextDouble();
        System.out.println("Enter the height of cylinder:");
        h1=in.nextDouble();
        System.out.println("Volume of the Cylinder: "+volume(h1,r2));
        System.out.println();
        System.out.println();
        System.out.println("Enter the length of the cuboid:");
        l=in.nextDouble();
        System.out.println("Enter the breadth of the cuboid:");
        b=in.nextDouble();
        System.out.println("Enter the height of the cuboid:");
        h2=in.nextDouble();
        System.out.println("Volume of the cuboid: "+volume(l,b,h2));
        in.close();
    }
}
