public class array_pr9
{
    private static int Duplicate(int a[])
    {
        int flag=0;
        for(int i=0;i<a.length;i++)
        {
            

           for(int j=i+1;j<a.length;j++)
           {
               if(a[i]==a[j])
               {
                   flag++;
               }
           }

        }
        if(flag==0)
        {
            System.out.println("No duplicate values");
        }
        else
        {
            System.out.println(flag+" Duplicate value");
        }
        return flag;
    }
    public static void main(String[] args) 
    {
        int a[]={1,2,7,12,7,1,98,90,98,30,30};
        Duplicate(a);
        
        
        

        
    }
}