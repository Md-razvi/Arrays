

//Write a function to find the minimum and maximum value of an array 
public class array_pr7 {
    private static int LArgestAndSmallest(int MainArray[])
    {
        int m=MainArray.length-1;
        int largest=MainArray[0],Smallest=MainArray[0];
        for(int i=0;i<m;i++)
        {
            if(MainArray[i]>largest)
            {
                largest=MainArray[i];

            }
            else if(MainArray[i]<Smallest)
            {
                Smallest=MainArray[i];
            }
        }
        System.out.println(largest);
        System.out.println(Smallest);
        return 0;
    }
    public static void main(String[] args) 
    {
        int a[]={23,45,64,75,12,9,18,1};
        LArgestAndSmallest(a);
        
    }
    
}
