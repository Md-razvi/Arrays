public class array_pr11
{
    public static void main(String[] args) {
        {
            int a[]={23,23,45,78,24,89,89,100};
            int j=0;
            int temp[]=new int[a.length];
            for(int i=0;i<a.length-1;i++)
            {
                if(a[i]!=a[i+1])
                {
                    temp[j]=a[i];
                    j++;
                }

            }
            temp[j]=a[a.length-1];
            for (int i : temp) {
                if(i!=0)
                {
                System.out.print(i+" ");
                }
            }

        }
    }
}