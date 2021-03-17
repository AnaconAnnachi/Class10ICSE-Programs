import java.util.Scanner;

class prime_twinprime
{
	private static Scanner input = new Scanner(System.in);
	private static int s = 2;
	private static int c;
	public static boolean isPrime(int n)
	{
		int x = 0;
		for(int i = 1; i<=n; i++)
		{
			if(n%i == 0)
				x++;
		}
		if(x == 2)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		prime_twinprime ptw = new prime_twinprime();
		System.out.println("Enter the upper limit for the twin prime : ");
		int c = input.nextInt();
		System.out.println("Twin Primes within given range : ");
		for(int i = s; i<=(c-2); i++)
		{
			if(prime_twinprime.isPrime(i) == true && prime_twinprime.isPrime(i+2) == true)
			{
				System.out.print("("+i+","+(i+2)+") ");
			}

		}
	}
}
