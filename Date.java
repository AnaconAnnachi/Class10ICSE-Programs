/**
* Define a class Date with the following data members and member methods

* Class Name : Date

Data Members:
* Int dd : integer value to store Day
* Int mm : integer value to store Month
* Int yy : integer value to store year (1900 <= yy <=2100)

* Member Methods:
* void input()	: Accept dd,mm and yy from the user
* void validate()	:Check weather the date is validv
		dd <= 31 when mm is 1,3,5,7,8,10,12
		dd  <=30 when mm is 4, 6,9,11
		dd  <= 28 when mm is 2 and yy is not divisible by 4
                        dd  <= 29 when mm is 2 and yy is divisible by 4
*/

package functions;
import java.util.Scanner;
public class Date {
	int yy;
	int dd;
	int mm;
	
	public void input()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER DATE : ");
		dd = input.nextInt();
		System.out.println("ENTER MONTH : ");
		mm = input.nextInt();
		System.out.println("ENTER YEAR : ");
		yy = input.nextInt();
		
	}
	public void validate()
	{
		if(yy < 1990 || yy > 2100)
		{
			System.out.println("INVALID YEAR!!! \n");
			System.exit(0);
		}
		if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12)
		{
			if(dd <= 31)
			{
				System.out.println("VALID!!! \n");
			}
		}
			else if (mm == 4 || mm == 6 || mm == 9 || mm == 11)
			{
				if(dd <= 30)
				{
					System.out.println("VALID!!! \n");
				}
			}
			else if (mm == 2 || (yy % 4) != 0)
			{
				if(dd <= 28)
				{
					System.out.println("VALID!!! \n");
				}
			}
			else if (mm == 2 || (yy / 4) == 0)
			{
				if(dd <= 29)
				{
					System.out.println("VALID!!! \n");
				}
			}
			else
			{
				System.out.println("INVALID!!! \n");
			}
	}

	public static void main(String[] args) {
		Date d = new Date();
		d.input();
		d.validate();
	}
}
/**
ENTER DATE : 
21
ENTER MONTH : 
3
ENTER YEAR : 
2008
VALID!!! 
*/
