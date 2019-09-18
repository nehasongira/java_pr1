    import java.util.*;   
    class aa10  
    {  
       public static void aa10()  
       {  
          int num;
          String str,str1,laststr;
          System.out.println("enter the string");
          Scanner s=new Scanner(System.in);
          str=s.nextLine();
          System.out.println("enter the int");
           num=s.nextInt();
              if (str.length() > num)
              {
                  laststr = str.substring(str.length() - num);
              }
              else
              {
                  laststr = str;
              }
               str1=str+laststr;
              for(int i=0;i<num-1;i++)
              {
                str1=str1+laststr;
              }
          
           System.out.println(str1);
          }
    }  


    