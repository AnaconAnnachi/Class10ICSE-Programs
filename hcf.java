/**
* Write a program to accept 2 numbers and find HCF of those two numbers
*/

import java.util.Scanner;

public class hcf {

   public static int findHCF(int x, int y){

      
      int hcf = 0;
      int i = 1;

      while(i<=x && i<=y) {
         if(x%i==0 && y%i==0)
            hcf = i;
            i++;
      }

      return hcf;
   }

   public static void main(String[] args) {

      
      int n1 = 0;
      int n2 = 0;
      int hcf = 0;

      
      Scanner input = new Scanner(System.in);

      
      System.out.print("Enter two integer numbers : ");
      n1 = input.nextInt();
      n2 = input.nextInt();

      
      hcf = findHCF(n1, n2);

      
      System.out.println("HCF" + n1 + "," + n2 + ") = " + hcf );


      input.close();
   }
}
