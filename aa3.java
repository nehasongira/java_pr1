    import java.util.*;   
    class aa3 
    {  
       public static void aa3()  
       {  
          String original;
          Scanner in = new Scanner(System.in);   
          System.out.println("Enter a string to check if it is a palindrome");  
          original = in.nextLine();   
          int length=original.length();
          for(int i=0;i<length;i++)
          {   
              if(Character.isLetter(original.charAt(i)))
              {
                  if(original.charAt(i)=='a' || original.charAt(i)=='u' || original.charAt(i)=='e' || original.charAt(i)=='i' || original.charAt(i)=='0')
                  {
                      System.out.println("vowel");
                  }
                  else
                  {
                     System.out.println("consonant"); 
                  }
              }
              else
              {
                  System.out.println("error");
              }
          } 
       }  
    }  