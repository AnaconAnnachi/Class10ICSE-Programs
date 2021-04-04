/**
* Write a program to compute and display the sum of the following series:-
* 1+2/1X2+1+2+3/1X2X3+1+2+3+4/1X2X3X4+1+2+3+4/1X2X3X4+ . ……  1+2+3+4+ ... n/1X2X3X4X .... n
* Use separate functions for denominator and numerator.
*/

import java.util.Scanner;

public class sumofSeries {
	double n;
	double sum;
	double x;
	double res;
	public sumofSeries()
	{
		n = 0;
		res = 0;
	}
	public void accpet()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n : ");
		n = input.nextDouble();
		input.close();
	}
	public void numeratoR()
	{
		sum = 0;
		for (int i = 1; i <=n; i++)
		{
			sum += i;
		}
		System.out.print("Sum of series : " + sum + " / ");
	}
	public void denominatoR()
	{
		x = 1;
		for (int i = 1; i <= n; i++)
		{
			x *= i;
		}
		System.out.print(x);
		System.out.println();
	}
	public void calculate()
	{
		res = sum/x;
		System.out.println("Answer : " + res);
	}
	public static void main(String[] args) {
		sumofSeries series = new sumofSeries();
		series.accpet();
		series.numeratoR();
		series.denominatoR();
		series.calculate();
	}

}
/**
Enter n : 
6
Sum : 21.0 / 720.0
Answer : 0.029166666666666667
*/
