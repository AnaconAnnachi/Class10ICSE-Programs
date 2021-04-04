/**
* Write a program to print the even numbers from 1 to n. And their squares, where n is provided by the user
*/

import java.util.Scanner;
import java.lang.Math;
public class even_evensquared {
	double n;
	double sn;
	public even_evensquared()
	{
		n = 0;    
	}
	public void accept()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n : ");
		n = input.nextDouble();
		input.close();
	}
	public void eNum()
	{
		for (int i = 1; i <= n; i+= 2)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public void eNumSquare()
	{
		for (int i = 0; i <= n; i += 2)
		{
			sn = Math.pow(i, 2);
			System.out.println(sn + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		even_evensquared ees = new even_evensquared();
		ees.accept();
		ees.eNum();
		ees.eNumSquare();
	}

}
