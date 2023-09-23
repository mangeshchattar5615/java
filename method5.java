 class method5 {
 static int method(int x,int y)
{
    return x+y;
}
  static double method(double x, double y)
{
    return x+y;
}
public static void main(String [] args)
{
    int myNum1=method(3,5);
    double myNum2=method(4.5,2.5);
    System.out.println("int:"+myNum1);
    System.out.println("double:"+myNum2);

}
}
 