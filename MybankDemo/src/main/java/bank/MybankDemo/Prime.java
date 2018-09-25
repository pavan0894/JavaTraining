package bank.MybankDemo;

import java.util.Scanner;

public class Prime
{
    public static void main(String [] args)
    {
        int number, i, count=0;
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        number = input.nextInt();
        
		if(number == 0)
		{
			System.out.println("0 is neither prime nor composite");
		}
		
        for(i=2; i<number; i++)
        {
            if(number%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
        }
    }
}