class copyArray{


public static void main(String args [] )
{
    char [] copyFrom = { 'j','a','v','a','i','s','f','u','n','i','t','s','o','k'};
    char [] copyTo   = new char [11];
    System.arraycopy(copyFrom,8,copyTo,0,6);
    System.out.println(copyTo);
}
}