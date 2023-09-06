
public class shopping_bill
{
    public static void main(String args[])
    {
        int s=899,t=980,b=600,amt;
        double s1,t1,b1,a;
        s1=s-(12.0/100.0*s);
        t1=t-(15.0/100.0*t);
        b1=b-(18.0/100.0*b);
        a=(s1*3)+(t1*2)+b1;
        amt= (int) Math.round(a);
        System.out.println("******************BILL******************");
        System.out.println("Product          Rate          Quantity          Price(After Discount)");
        System.out.println("Shirts           899             3                 "+s1);
        System.out.println("Trousers         980             2                 "+t1);
        System.out.println("Book             600             1                 "+b1);
        System.out.println();
        System.out.println("Total Amount: Rs"+a);
        System.out.println("Total Amount to be paid after rounding off: Rs"+amt);
    }
}
