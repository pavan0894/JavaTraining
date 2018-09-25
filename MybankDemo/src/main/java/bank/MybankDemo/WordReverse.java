package bank.MybankDemo;

public class WordReverse
{
   public void reverseWordInMyString(String str)
   {

	String[] words = str.split(" "); //splitting by delimiter
	
	String reversed_str = "";
	
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverse_wrd = "";
           
           for (int j = word.length()-1; j >= 0; j--) 
	   {
        	   
		reverse_wrd = reverse_wrd + word.charAt(j);
	   }
           
	   reversed_str = reversed_str + reverse_wrd + " ";
	}
	
	System.out.println("Input: "+str);
	System.out.println("Output: "+reversed_str);
   }
   public static void main(String[] args) 
   {
	WordReverse obj = new WordReverse();
	obj.reverseWordInMyString("Hi how are you");
   }
}