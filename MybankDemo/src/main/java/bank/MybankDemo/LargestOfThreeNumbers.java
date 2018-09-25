package bank.MybankDemo;

import java.util.Scanner;

class LargestOfThreeNumbers
{
   public static void main(String args[])
   {
      int num1, num2, num3;
      System.out.println("Enter three numbers");
      Scanner input = new Scanner(System.in);
 
      num1 = input.nextInt();
      num2 = input.nextInt();
      num3 = input.nextInt();
 
      if ( num1 > num2 && num1 > num3 )
         System.out.println("First number is largest:"+num1);
      
      else if ( num2 > num1 && num2 > num3 )
         System.out.println("Second number is largest:"+num2);
      
      else if ( num3 > num1 && num3 > num2 )
         System.out.println("Third number is largest:"+num3);
      
   }
}