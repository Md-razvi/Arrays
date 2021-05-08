package Arrays;
//3. Write a program to find the index of an array element 
//4. Write a function to test if array contains a specific value
// Solution of 3rd problem and 4th problem are similar 
public class array_pr3 {
    private static void find(int a[],int element)
    {
        int i=0,flag=0;
        while (i<a.length)
        {
            if(a[i]==element)
            {
                flag=1;
                System.out.println(i+"th position");
                break;
            }
            i++;

        }
        if(flag==0)
        {
            System.out.println("No Element founded");
        }

    }
    public static void main(String[] args) {
    int array[]={2,4,5,6,89,92};
    find(array,92);
    }
    
}
