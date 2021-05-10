public class array_pr15 {
    public static void main(String[] args) {
        int smallest,largest,first=0;
        int a[]={1,2,5,9,4,6};
        smallest=a[first];
        largest=a[first];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                largest=a[i];
            }
            if(a[i]<smallest)
            {
                smallest=a[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
        System.out.println(largest-smallest);

    }
}
