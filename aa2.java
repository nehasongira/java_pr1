    import java.util.*;   
    class aa2  
    {  
       public static void aa2()  
       {  
          int num;
          System.out.println("enter the input");
          Scanner in = new Scanner(System.in);     
          num = in.nextInt();   
          if(num>20 && num<30)
          {
              if(num%2==0)
              {
                  System.out.println("jerry");
              }
              else
              {
                System.out.println("tom");  
              }
          }
          else
          {
              System.out.println("outside range of our program ");
          }
    }  

    }