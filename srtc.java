/**
* Define a class with 3 void functions with the name area
* with 1 parameter which can calculate area of square
* with 2 integer parameters you calculate area of rectangle
* with one integer and double value (PI Value = 3.14) calculate the area of circle.
*/

import java.util.Scanner;
 class srtc
{
static void Area(int x,int y) 
{

    int a = x*y;
    System.out.println("Area of rectangle is "+a);

  }

  static void Area(int x) 
  {

  int a = x*x;
  System.out.println("Area of square is "+a);

}
static void Area(int x,double pi) 
{
    double a = x*x*pi;
    System.out.println("Area of circle is "+a);

  }
 
 public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter side the square :");
       int x = input.nextInt();
       Area(x);
       System.out.print("Enter length of the rectangle :");
       int l = input.nextInt();
       System.out.print("Enter breadth of the rectangle :");
       int b = input.nextInt();
       Area(l,b);
       System.out.print("Enter radius of circle : ");
       int r = input.nextInt();
       Area(r,3.14);
 }

}
