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