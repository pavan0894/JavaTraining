package bank.MybankDemo;

import java.util.Scanner;

public class StringReverse {

	   
	    void reverse(String strg)
	    {
	        if ((strg==null)||(strg.length() <= 1))
	        	
	           System.out.println(strg);
	        
	        else
	        {
	        	
	            System.out.print(strg.charAt(strg.length()-1));
	            
	            reverse(strg.substring(0,strg.length()-1));
	        }
	    }
	     
	  
public static void main(String[] args) 

	   {
	    	System.out.println("\n Enter the String to Reverse : ");
			Scanner input = new Scanner(System.in);
			String str = input.nextLine();
	        StringReverse obj = new StringReverse();
	        obj.reverse(str);
	    }    
}
