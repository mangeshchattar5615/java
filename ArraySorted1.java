public class ArraySorted1 {
    public static boolean isSortedBetter(int a[],int si)
    {
        if (si==a.length-1)
        {
            return true;
        }
        if(a[si]>a[si+1])
        {
            return false;
        }
        boolean isSmallArraySorted=isSortedBetter(a,si+1);
        return isSmallArraySorted;
    }
    public static void main(String agrs [])
    {
        
    }

}
