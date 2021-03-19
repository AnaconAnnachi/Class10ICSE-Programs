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