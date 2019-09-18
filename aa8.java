    import java.util.*;
     
    class aa8
    {
       public static void aa8()
       {
          System.out.println("enter the number to guess between 1-50");
         
          
          //System.out.println(num);
          while(true)
          {    Scanner s=new Scanner(System.in);
              int num=s.nextInt();
            
             if(num>45)
             {
                 System.out.println("more");
             }
             if(num<45)
             {
                 System.out.println("less");
             }
             if(num == 45)
             {
                 System.out.println("match");
                 break;
             }
          }
       }
    }