class student 
{
    int rollNo;
String name;
float marks;
void setRollNo(int rn)
{
    rollNo=rn;
}
int getRollNo()
{
    return rollNo;
}
void setName(String nm)
{
    name=nm;
}

String getname()
{
return name;
}
void setmarks(float m)
{
    marks=m;
}
float getmarks()
{
    return marks;
}

String getGrade()
{
    if(marks<35)
    return "fail";
    return "Pass";
}
public static void main (String args [])
{
    student s;
    s = new student();
    s.setRollNo(101);
    s.setName("Mangesh");
s.setmarks(45);
System.out.println("RollNo:"+s.getRollNo());
System.out.println("Name:"+s.getname());
System.out.println("Marks:"+s.getmarks());
System.out.println("Grade:"+s.getGrade());
}
}


