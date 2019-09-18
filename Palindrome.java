import java.util.Scanner;   

class Palindrome  
{  
   public static void palindrome()  
   {  
      String original, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i); 
         int sum=0; 
      if (original.equals(reverse)) 
      {
         for(int i=0;i<length;i++)
         {
            if(original.charAt(i)%2==0)
            {   
                char ch=original.charAt(i);
               int result = Character.getNumericValue(ch);
              // System.out.println(result);		
               sum=sum+result;
            }
            
         }
         //System.out.println(sum); 
         if(sum>25)
         {
            System.out.println(" palindrome and more than 25"); 
         }
         else
         {
            System.out.println(" palindrome and less than 25"); 
         }
      } 

      else  
         System.out.println("not a palindrome.");   
   } 
    
}  