
import java.util.*;
public class stuinfo
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String regno,name,gen;
        int m1,m2,m3,m4,m5,total;
        double p;
        System.out.println("Enter the name of the student:");
        name=in.nextLine();
        System.out.println("Enter the registration number:");
        regno=in.nextLine();
        System.out.println("Enter the Gender:");
        gen=in.nextLine();
        System.out.println("Enter the marks in English:");
        m1=in.nextInt();
        System.out.println("Enter the marks in Maths:");
        m2=in.nextInt();
        System.out.println("Enter the marks in Physics:");
        m3=in.nextInt();
        System.out.println("Enter the marks in Chemistry:");
        m4=in.nextInt();
        System.out.println("Enter the marks in Computer:");
        m5=in.nextInt();
        total=m1+m2+m3+m4+m5;
        p=total/500.0*100.0;
        System.out.println();
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Registration Number: "+regno);
        System.out.println("Gender: "+gen);
        System.out.println("Total Marks: "+total);
        if(100>=p && p>=90)
            System.out.println("Grade: S");
        if(90>p && p>=80)
            System.out.println("Grade: A");
        if(80>p && p<=70)
            System.out.println("Grade: B");
        if(70>p && p>=60)
            System.out.println("Grade: C");
        if(60>p && p>=50)
            System.out.println("Grade: D");
        if(50>p && p>=40)
            System.out.println("Grade: E");
        if(40>p )
            System.out.println("Grade: F");
        in.close();
    }
}
