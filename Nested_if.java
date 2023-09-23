class NestedIfDemo

{
     public static void main(String [] args)
     {
         int marks=70;
         if(marks<40)
         System.out.println("You could not clear Exam");
         else
         {
         System.out.println("You cleared the exam");
         if(marks>70)
         System.out.println("With Distinction");
         else if(marks>60)
         System.out.println("With first class");
         else if(marks>50)
         System.out.println("With second class");
         else
         System.out.println("With Third class");
         }
     }
    
}
