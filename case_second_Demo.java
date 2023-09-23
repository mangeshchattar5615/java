 class  CaseSecondDemo {
     public static void main(String [] args)
    {
     int day_of_week =7;
     switch(day_of_week)
     {
         case 1:
         case 2:
         case 3:
         case 4: 
         case 5:
         System.out.println("Today will be full working day");
         break;
         case 6:
         System.out.println("Today is half day");
         break;
         case 7:
         System.out.println("Today is funday");
         break;
         default:
         System.out.println("Invalid day of week");
     }
     }
    
}
