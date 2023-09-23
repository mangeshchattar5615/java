public class Opps1Constuctor {
    public String name;
    private int rollNumber;
    public Opps1Constuctor(String n,int num)
    {
         name=n;
         rollNumber=num;
    }
    public Opps1Constuctor(String n)
    {
        name=n;
    }
    public Opps1Constuctor()
    {
        name = "abc";
        rollNumber=10;
    }
    public int getrollNumber()
    {
        return this.rollNumber;
    }
    public  void print()
    {
        System.out.println(name+" "+rollNumber);
    }
    public static void main(String agrs [])
    {
        Opps1Constuctor s=new Opps1Constuctor("Mangesh",1); 
        s.print();
       
        Opps1Constuctor s1=new Opps1Constuctor("Yogesh",2);
        s1.print(); 
    
        Opps1Constuctor s3=new Opps1Constuctor("....."); 
        s3.print();

        System.out.println(s1.getrollNumber());
        Opps1Constuctor s4=new Opps1Constuctor();
    }
}
