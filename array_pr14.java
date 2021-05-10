public class array_pr14 {
    public static void main(String[] args) {
        int even=0,odd=0,m[],n[];
        int j=0,e=0,o=0;
        int a[]={1,3,4,5,6,90,50,45,67};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        m=new int[a.length-odd];
        n=new int[a.length-even];
        while(j<a.length)
        {
            if(a[j]%2==0)
            {
                m[e]=a[j];
                e++;
            }
            else
            {
                n[o]=a[j];
                o++; 
            }
            j++;

        }
        System.out.println("Even");
        for(int item: m)
        {
            System.out.print(item+" ");
        }
        System.out.println(" ");
        System.out.println("Odd");
        for(int item: n)
        {
            System.out.print(item+" ");
        }

    }
}
