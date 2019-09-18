import java.util.Scanner;   

class menu 
{  
   public static void main(String args[])  
   {  
      int num,choice; 
            
      do{
      
            System.out.println("select one option"); 
            
            System.out.println("1. palindrome");
            System.out.println("2. conditional check");
            System.out.println("3. display vowel/error/consonant");
            System.out.println("4. pattern");
            System.out.println("5. to get sum of numbers");
            System.out.println("6. to  display type of letter");
            System.out.println("7. sorting");
            System.out.println("8. guess game");
            System.out.println("9. reverse of string");
            System.out.println("10. concate last part of string ");
            System.out.println("11. exit");
            
           Scanner inputScanner = new Scanner(System.in); 
           choice=inputScanner.nextInt();
      
          
     switch(choice)
     {
            case 1: 
                  
                  Palindrome.palindrome();
                  break; 
            case 2: 
                aa2.aa2();
                 break; 
            case 3: 
                aa3.aa3();  
            break; 
            case 4: 
                aa4.aa4();
            break; 
            case 5: 
                aa51.aa51();
            break; 
            case 6: 
                aa6.aa6();
            break; 
            case 7: 
                aa7.aa7();
            break; 
            case 8: 
                aa8.aa8();
            break; 
            case 9: 
                aa9.aa9();
            break; 
            case 10: 
                aa10.aa10();
            break; 
            case 11: 
            break; 
            
     }


      }while(choice!=11);

   }   
      
}  