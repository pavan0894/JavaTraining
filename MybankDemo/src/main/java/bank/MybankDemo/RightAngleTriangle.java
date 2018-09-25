package bank.MybankDemo;

import java.util.Scanner;
public class RightAngleTriangle 
{
	public static void main(String[] args)

	{
	   int i,j,num;
	   System.out.print("Input number of rows : ");
	   Scanner input = new Scanner(System.in);
	   num = input.nextInt();			
	   for(i=1;i<=num;i++)
	   {
		   for(j=1;j<=i;j++)
		   System.out.print(j);
		   System.out.println("");
	    }
	}
}

