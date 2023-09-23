
class functionoverloadingDemo{
    public static void main(String args [])
    {
        int radius =5;
        int length =6,width=7;
        int a=8,b=9;

        System.out.println("The are of circle is:"+area(radius));
        System.out.println("The are of ractangle is:"+area(length,width));
        System.out.println("The are of Triangle is:"+area(a,b));

    }
    static float area(int r)
    {
return 22/7 *r *r;
    }
    static float area(int l,int w)
    {
        return l*w;
    }
    static float area(int a,int b,int c)
    {
        return 1/2*(a*b);
    }
}