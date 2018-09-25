package bank.MybankDemo;

import java.util.Scanner;

class SwapNumbers
{
   public static void main(String args[])
   {
      int a, b, temp;
      System.out.println("Enter a and b");
      Scanner in = new Scanner(System.in);
 
      a = in.nextInt();
      b = in.nextInt();
 
      System.out.println("Before Swapping\nx = "+a+"\ny = "+b);
 
      temp = a;
      a = b;
      b = temp;
 
      System.out.println("After Swapping\nx = "+a+"\ny = "+b);
   }
}
