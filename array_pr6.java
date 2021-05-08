
public class array_pr6 {
    private static int[] InsertArray(int MainArr[],int position,int number)
    {
        // When you insert an element value of array increases
        int index1=MainArr.length+1;
        int Array2[]=new int[index1];
        // Now the insertion of an element
        //  Since position in array start with zero 
        //  it is always less than one actaul position
        int m=position-1;
        for(int i=0;i<index1;i++)
        {
            if(i<m)
            {
               Array2[i]=MainArr[i];
            }
            else if(i==m)
            {
               // System.out.println("--");
                Array2[i]=number;
            }
            else
            {
                Array2[i]=MainArr[i-1];
            }

        }
        return Array2; 
    } 
    public static void main(String[] args) {

        int a[]={1,2,3,4,5};
        int b[]=InsertArray(a,3,6);
        for(int item: b)
        {
            System.out.println(item);
        }
    }
    
}
