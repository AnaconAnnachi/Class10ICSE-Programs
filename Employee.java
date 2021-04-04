
/**
* Define a class Employee with the following details
* Data Members
* String Name : To store Name.
* String eno : To store employee number.
* double basic : To store basic salary.
* double hra : to store house rent allowance.
* double da : to store dearness allowance.
* double pf : to store Provident fund.
* double grosspay : to store gross salary.
*
* Member methods
* Employee() : a constructor to initialize the data members.
* Employee(parameter) : a parameterized constructor to initialize
* name, Eno, basic with the parameters and initialize all
* the other data members with 0.0.
* void calc() : to calculate the grosspay = basic + hra + da - pf
* hra = 10 % basic
* da = 20 % basic
* pf = 12 % basic
* void display() : Display the Employee no, Name and Gross Pay
*
* Write a main method to create an object for the given class and call the methods in
* the proper order.
*/
import java.util.Scanner;
public class Employee {
    String name;
    String eno;
	double basic;
	double hra;
	double da;
	double pf;
	double grosspay;
	public Employee()
	{
		name = "";
		eno = "";
		basic = 0.0;
		hra = 0.0;
		da = 0.0;
		pf = 0.0;
		grosspay = 0.0;
	}
	public Employee(String name,String eno,double basic)
	{
		this.name = name;
		this.eno = eno;
		this.basic = basic;
	}
	public void calc()
	{
		da = basic * 20.0/100;
		pf = basic * 12.0/100;
		hra = basic * 10.0/100;
		grosspay = basic + hra + da - pf;
	}
	public void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Employee number : " + eno);
		System.out.println("Grosspay : " + grosspay);
	}
	public static void main(String[] args) {
		String N = "";
		String ENO = "";
		double B = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name : ");
		N = input.next();
		System.out.println("Enter employee number : ");
		ENO = input.next();
		System.out.println("Enter basic pay : ");
		B = input.nextDouble();
		Employee emp = new Employee(N,ENO,B);
		emp.calc();
		emp.display();
	}
}

