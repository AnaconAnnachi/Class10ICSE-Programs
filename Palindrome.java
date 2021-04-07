/**
 * Write a function that takes a number as parameter and returns the reversed number
 * Write another function that takes an number as a parameter and check whether palindrome or not by calling the previous parameter
 */

import java.util.Scanner;
public class Palindrome {
	int x;
	public int ReN(int l)
	{
		int z;
		while(l != 0)
		{
			z = l % 10;
			x = x*10+z;
			l /= 10;
		}
		return x;
	}
	public void Pal(int x, int l)
	{
		if(x == l)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int l = 0;
		System.out.println("Enter Number : ");
		l = input.nextInt();
		Palindrome ple = new Palindrome();
		ple.Pal(ple.ReN(l),l);
	}
}
/**
 * Output :-
 * Enter Number : 
 * 121
 * Palindrome
*/
