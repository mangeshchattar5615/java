public class ArraySorted {
    public static boolean isSorted(int a[])
    {
        if(a.length==1)
        {
            return false;
        }
     int smallArray[]=new int[a.length-1];
     for(int i=1;i<a.length;i++)
     {
        smallArray[i-1]=a[i];
     }
     boolean isSmallArraySorted=isSorted(smallArray);
     return isSmallArraySorted;
    }
    public static void main(String agrs [])
    {
        //int a[]={1,2,3,4,5};
       // System.out.println(isSorted a[]);
       //isSorted(a[]);
    }
}
