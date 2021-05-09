
//11. Write a program to find the common values between two arrays
public class array_pr10 
{
    public static void main(String[] args) 
    {
        int a[]={1,2,45,6,7,8,34,56,76};
        int b[]={2,45,6,7,76};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.println(a[i]);

                }
            }
        }
    
    }
}

    

