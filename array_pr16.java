public class array_pr16 {
    public static void main(String[] args) {
        int flag=0; 
        int a[]={2,4,5,6,7,12,56,23};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==12||a[i]==23)
            {
                flag++;
            }
        }
        if(flag==2)
            System.out.println("Array Contains both 12 and 23");
        else if (flag==1)
            System.out.println("Array Contains either  12 or 23");
        else if (flag==0)
            System.out.println("Array Contains neither  12 or 23");

    }
}
