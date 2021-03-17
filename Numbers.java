import java.util.Scanner;

class Numbers 
{
	 int n;
	public void getNum()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N : ");
		n = input.nextInt();
	}
	public int check(int x)
	{
		int y = 0;

		int i = 1;
		if(x < 3)
			return 0;
		while(y < x)
		{
			y += i;
			i++;
		}
		if (y == x)
			return 1;
		return 0;
	}
	public void dispnum()
	{
		if(check(n) == 1)
			System.out.println(n + "is a triangular number");
		else
			System.out.println(n + "is not a triangular number");
	}
}	
	

