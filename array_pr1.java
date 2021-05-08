//Write a function to add integer values of an array
package Arrays;
import java.util.Scanner;
public class array_pr1 {
    private static void func1()
    {
        int sum=0;
        try(Scanner obj1=new Scanner(System.in))
        {
            System.out.println("Enter the number of items you want for");
            int n=obj1.nextInt();
            System.out.println("Now Enter Array Items");
            int array1[]=new int[n];
            
            for (int i=0;i<array1.length;i++)
            {
                array1[i]=obj1.nextInt();
            }
            for (int item : array1) {
                sum+=item;
            }

            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        func1();        
         
        //System.out.println(a);
    }
}
