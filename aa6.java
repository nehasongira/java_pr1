    import java.util.*;   
    class aa6  
    {  
       public static void aa6()  
       {  
          char num;
          String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
          System.out.println("enter the input");
          Scanner in = new Scanner(System.in);     
          num = in.next().charAt(0); 
          if(Character.isDigit(num))System.out.println("digit");
          if(Character.isUpperCase(num))System.out.println("Capital");
          if(Character.isLowerCase(num))System.out.println("small");
          if(specialChars.contains(String.valueOf(num)))
            System.out.println("special");



           
          }
    }  


    