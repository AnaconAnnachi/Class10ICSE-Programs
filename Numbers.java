/**
* A class Numbers contains the following data members and member functions to check for triangular numbers. [ A triangular number is formed by the addition of a consecutive sequence of integers starting from 1.]
* Eg.
* 1 + 2 = 3
* 1 + 2 + 3 =6
* 1+ 2 + 3 + 4 =10
* 1+ 2 + 3 + 4 + 5 = 15
* Therefore 3,6,10,15 are triangular numbers.
* Class name : Numbers
* Data members
* n : integer to be checked whether it is triangular or not.
* Member functions
* void getnum() 	: 	to accept integer n.
* int check(int) 	: 	to check if n is triangular.
* void dispnum() 	: 	to display message whether n is triangular or not.
* Specify the class Numbers giving details of the functions void getnum(), int check(int) and void dispnum(). The main function need not be written. 
*/

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
	

