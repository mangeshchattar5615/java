public class FunctionOverloading {
    public static int sum(int a,int b)
    {
        int result=a+b;
        return result;
    }
    public static double sum(double a,double b)
    {
        double result=a+b;
        return result;
    }
    public static int sum(int a)
    {
       return a+1;
    }

    public static void main(String agrs [])

    {
       int a=10;
       int b=20;
       System.out.println(sum(a,b));
       System.out.println(sum(a));
       System.out.println(sum(1.5,5.6));
    }
}
