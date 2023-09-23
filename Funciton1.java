public class Funciton1 {

    public static boolean isPrime(int num)
    {
        int div=2;
        while(div<=num/2)

        {
            if(num%div==0)
            {
                return false;
            }
            div=div+1;
        }
        return true;
    }
    public static void main(String args [])
    {
System.out.println(isPrime(23));
    }
    
        
    
}
