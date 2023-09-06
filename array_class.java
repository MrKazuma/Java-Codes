import java.util.*;
public class array_class
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n[] = new String[5];
        int m[] = new int[5];
        String rn[] = new String[5];
        System.out.println("Enter the Credentials:");
        System.out.println();
        System.out.println();
        for (int i=0;i<5; i++) {
            System.out.println("Enter the name of the student:");
            n[i] = in.nextLine();
            System.out.println("Enter the Registration number of the student:");
            rn[i] = in.nextLine();
            System.out.println("Enter the percentile:");
            m[i] = in.nextInt();
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Name                    Reg.No.                   Percentile");
        for (int i=0; i<5;i++)
        {
            System.out.println(n[i] + "               " + rn[i] + "                  " + m[i]);
        }
        in.close();
    }
}
