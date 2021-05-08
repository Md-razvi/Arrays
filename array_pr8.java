
public class array_pr8 {
    private static int[]  Revers(int b[])
    {
        int Array1[]=new int[b.length];
        int j=0;
        for(int i=b.length-1;i>=0;i--)
        {
            Array1[j]=b[i];
            j++;
        }
        return Array1;

    }
       
public static void main(String[] args) 
{
    int a[]={34,45,67,89,12};
    int b[]=Revers(a);
    for (int item : b) {
        System.out.print(item+" ");
    }
}    
}
