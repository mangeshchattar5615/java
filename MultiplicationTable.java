 class MultiplicationTable {
    public static void main(String agrs[])
    {
        int num,mult;
        for(mult=1;mult<=10;mult++)
        {
                for( num=2;num<=9;num++)
                {
                    System.out.print(num +"X"+mult+"="+(num*mult)+"\t");
                    System.out.println();
                }
        }
    }
}
