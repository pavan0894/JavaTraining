package bank.MybankDemo;
import java.util.Scanner;

public class MultiplicationTable {
	
		 
	 public static void main(String[] args)
	 {
	  Scanner input = new Scanner(System.in);
	   
	  System.out.print("Enter a number you wish to get the multiplication table of:");
	  int num1 = input.nextInt();
	   
	  for (int i=0; i< 10; i++)
		  
	  {
	   System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));
	  }
	  
	 }
	 
	}
