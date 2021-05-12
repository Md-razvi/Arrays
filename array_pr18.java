public class array_pr18
{
    public static void main(String[] args) {
        int a[]=new int[100];
        int AnyNumber=14;
        int j=0,sum=0;
        int m=100,Total=(m*(m+1))/2;
        for(int i=1;i<=100;i++)
        {

            if(j==13)
            {
                System.out.println("yes");
                j++;
                continue;
               // a[j]=0;
               // System.out.println("yes");

                
            }
            else{
              //  System.out.println(i);
                a[j]=i;
               
            }
            j++;
            
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
        for(int i=0;i<100;i++)
        {
            sum+=a[i];
        }
        //System.out.println("// "+sum);
        if(Total!=sum)
        {
            System.out.println("\n"+(Total-sum)+" is missing");
        }

    }
}