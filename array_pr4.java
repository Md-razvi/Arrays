package Arrays;
//import java.util.Scanner;
public class array_pr4 {
    private static int[] RemoveElement(int arr[],int index)
    {
       int i=0,k=0;
        if(index<0||index>=arr.length)
       {
            return arr;
       }

       int m=arr.length-1; 
       int newArray[]=new int[m];
       while(i<arr.length)
       {
           if(i==index)
            {
                continue;
            }
            newArray[k]=arr[i];
            i++;
            k++;
       }
       System.out.println("yes");
       return newArray;
    

    }
    public static void main(String[] args) 
    {

        int a[]={23,45,67,87,90,56};
        //RemoveElement(a, 7);
       int element[]=RemoveElement(a, 4);
        for(int b=0;b<element.length;b++)
        {
            System.out.println(element[b]);
        }
    }
}
