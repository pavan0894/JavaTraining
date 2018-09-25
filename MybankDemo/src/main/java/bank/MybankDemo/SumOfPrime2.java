package bank.MybankDemo;

import java.util.Scanner;

public class SumOfPrime2
{
	private static Scanner input;
	
	public static void main(String[] args) 
	{
		int number, minimum_number, maximum_number, i, count; 
		input = new Scanner(System.in);
		
		System.out.print(" Please Enter the Minimum value : ");
		minimum_number = input.nextInt();	
		
		System.out.print(" Please Enter the Maximum value : ");
		maximum_number = input.nextInt();	
		
	
		System.out.println(" Prime Numbers from 1 to 100 are : ");	
		for(number = minimum_number; number <= maximum_number; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}
}