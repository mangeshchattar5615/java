
public class FunDivide {
public static int DivideNumber(int num,int demo)
{
	if(demo==0)
	{
		return Integer.MIN_VALUE;
	}
	return num/demo;
}
public static void main(String agrs [])
{
	int num=5;
	int demo=0;
	int result=DivideNumber(num,demo);
	System.out.println(result);
}

}
