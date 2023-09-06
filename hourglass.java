import java.util.*;

public class hourglass //hourglass sum
{
static int findMaxSum(int [][]mat)
{
    int R=mat.length;
    int C=R;
	if (R < 3 || C < 3){
		System.out.println("Not possible");
		System.exit(0);
    }
	int max_sum = Integer.MIN_VALUE;
	for (int i = 0; i < R - 2; i++)
	{
		for (int j = 0; j < C - 2; j++)
		{
			int sum = (mat[i][j] + mat[i][j + 1] +mat[i][j + 2]) + (mat[i + 1][j + 1]) +(mat[i + 2][j] + mat[i + 2][j + 1] +mat[i + 2][j + 2]);
			max_sum = Math.max(max_sum, sum);
		}
	}
	return max_sum;
}
	static public void main (String[] args)
	{
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array:");
        n=in.nextInt();
		int mat[][] = new int[n][n];
        System.out.println("Enter the values of the array:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }
		int res = findMaxSum(mat);
		System.out.println("Maximum sum of hour glass = "+ res);
		in.close();
	}
	
}