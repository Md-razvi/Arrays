public class array_pr13 {
    public static void main(String[] args) {
       int a[]={34,56,12,9,78,45,79};
       int Largest=0;
       int Second_largest=0;
       for(int i=0;i<a.length;i++)
       {
           if(a[i]>Largest)
           {
               Second_largest=Largest;
               Largest=a[i];
           }
           else if(a[i]>Second_largest&&a[i]!=Largest)
           {
               Second_largest=a[i];
           }
       }
       
       System.out.println("\nThe second largest is "+Second_largest);
    }
}
