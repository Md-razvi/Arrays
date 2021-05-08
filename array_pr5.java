//6. Write a function to copy an array to another array 
import java.util.Scanner;
public class array_pr5
{
    //private static int (int)
    public static void main(String[] args) 
    {   
      try(Scanner obj=new Scanner(System.in))
       {
        System.out.println("Enter the number of elements to be specified:");
        int b=obj.nextInt();
        int c[] =new int[b];
          for(int i=0;i<c.length;i++)
          {
              c[i]=obj.nextInt();
          }
          Copy(c);
      }
        
    }

    private static void Copy(int[] c) {
        int copy[]=c;
        System.out.println("---------The copy of array is---------");
          for(int j=0;j<copy.length;j++)
          {
              copy[j]=c[j];
              System.out.print(copy[j]+" ");
          }
    }
} 