import java.util.*;

public class increment_sieve
{
	static void simpleSieve(int limit, Vector<Integer> prime)
	{

		boolean mark[] = new boolean[limit+1];
		
		for (int i = 0; i < mark.length; i++)
			mark[i] = true;
	
		for (int p=2; p*p<limit; p++)
		{
			// If p is not changed, then it is a prime
			if (mark[p] == true)
			{
				// Update all multiples of p
				for (int i=p*p; i<limit; i+=p)
					mark[i] = false;
			}
		}
	
		// Print all prime numbers and store them in prime
		for (int p=2; p<limit; p++)
		{
			if (mark[p] == true)
			{
				prime.add(p);
				System.out.print(p + " ");
			}
		}
	}
	
	// Prints all prime numbers smaller than 'n'
	static void segmentedSieve(int n)
	{
		// Compute all primes smaller than or equal
		// to square root of n using simple sieve
		int limit = (int) (Math.floor(Math.sqrt(n))+1);
		Vector<Integer> prime = new Vector<>();
		simpleSieve(limit, prime);
		int low = limit;
		int high = 2*limit;
		while (low < n)
		{
			if (high >= n)
				high = n;
			boolean mark[] = new boolean[limit+1];
			
			for (int i = 0; i < mark.length; i++)
				mark[i] = true;
			for (int i = 0; i < prime.size(); i++)
			{
				int loLim = (int)(Math.floor(low/prime.get(i)) * prime.get(i));
				if (loLim < low)
					loLim += prime.get(i);
				for (int j=loLim; j<high; j+=prime.get(i))
					mark[j-low] = false;
			}
	
			// Numbers which are not marked as false are prime
			for (int i = low; i<high; i++)
				if (mark[i - low] == true)
					System.out.print(i + " ");
	
			// Update low and high for next segment
			low = low + limit;
			high = high + limit;
		}
	}
	public static void main(String args[])
	{
		int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit:");
        n=in.nextInt();
		System.out.println("Primes numbers smaller than " + n + ":");
		segmentedSieve(n);
		in.close();
	}
}
