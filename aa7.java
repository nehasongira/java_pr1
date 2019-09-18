    import java.util.*;
     
    class aa7
    {
       public static void aa7()
       {
          System.out.println("enter the number");
          Scanner s=new Scanner(System.in);
          int num=s.nextInt();
          int i=0;
          int len=String.valueOf(num).length();
          int[] a=new int[len]; 
          //System.out.println(len);
          for(int j=0;j<len; j++)
          {
                int n=0;
                n=num%10;
                    a[j] = n;
                    num=num/10;

         }
         Arrays.sort(a); 
         for(int k=len-1;k>=0;k--)
         {
             System.out.print(a[k]);
         }
         int se=0;
         for(i=0;i<len-1;i++)
         {
             if(a[i]%2==0)
             {
                 se=se+a[i];
             }
         } 
         if(se>15)
         {
             System.out.println("sum is"+ se);
             System.out.println("more than 15");
         }
         else
         {
              System.out.println("sum is"+ se);
               System.out.println("less than 15");
         }

       }
    }