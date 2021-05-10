import java.util.HashSet;
public class array_pr12
{
    public static void main(String[] args)
     {
        int a[]={12,34,45,12,92,76,89,45};
        HashSet <Integer> hs=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            hs.add(a[i]);
            //System.out.println();
        }
        for (Integer j : hs) {

            System.out.println(j);
        }
    }
}