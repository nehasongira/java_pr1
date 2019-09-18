import java.util.*;  
class aa4{
    public static void aa4()
    {
        
        System.out.println("enter the number");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        for(int i=1;i<=num;i++)
        { 
           for(int j=0;j<i;j++)
           {
               System.out.print(i);
           }
        }
        
    }
}