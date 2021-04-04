/**
* Design a class CabService with the following
* Member variables / data members
* String car_Type  : To store the type of car (AC or NON AC)
* double km    : to store the kilometer travelled
* double bill   : to calculate and store the bill amount

* Member methods:
* CabService ()  - Default constructor to initialize data members string data members to “” and double data members to  0.0
* void accept () - to accept car_type and km (Using Scanner class only)
* void calculate () - to calculate the bill as per the rules given.
* void display () - display the bill format
*	CAR TYPE  :
*	KILOMETER TRAVELLED : 
*	TOTAL BILL :
			AC			NON AC
* UPTO 5 KM		Rs. 150/-		Rs.120/-
* Beyond 5 KM		Rs.10/- Per KM	Rs. 8/- Per KM

* Create a main method and invoke the member functions.
*/

import java.util.Scanner;

public class CabService
{
    String car_Type;
    double km;
    double bill;
    
    public CabService() {
        car_Type = "";
        km = 0.0;
        bill = 0.0;
    }
    
    public void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter car type: ");
        car_Type = in.nextLine();
        System.out.print("Enter kilometer: ");
        km = in.nextDouble();
    }
    
    public void calculate() {
        if (km <= 5) {
            if (car_Type.equals("AC"))
                bill = 150;
            else
                bill = 120;
        }
        else {
            if (car_Type.equals("AC"))
                bill = 150 + 10 * (km - 5);
            else
                bill = 120 + 8 * (km - 5);
        }
    }
    
    public void display() {
        System.out.println("CAR TYPE : " + car_Type);
        System.out.println("KILOMETER TRAVELLED : " + km);
        System.out.println("TOTAL BILL : " + bill);
    }
    
    public static void main(String args[]) {
        CabService obj = new CabService();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}
