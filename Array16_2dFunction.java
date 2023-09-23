import java.util.Scanner;
public class Array16_2dFunction {
    public static void print2darray(int [][] arr)
    {
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++)
        {
          for(int j=0;j<col;j++)
          {
              System.out.print(arr[i][j] +" ");
          }  
          System.out.println();
        }
      }
    
    public static int[][] takeInput()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int row =sc.nextInt();
        System.out.println("Enter the no of colums");
        int col=sc.nextInt();
      int arr[][]=new int [row][col];

      for(int i=0;i<row;i++)
      {
        for(int j=0;j<col;j++)
        {
                System.out.println("Enter the element at :" + i + " row " + j + " : column ");
                arr[i][j]=sc.nextInt();
        }
    }
    return arr;
}
public static void main(String agrs [])
{
int [] [] input=takeInput();
print2darray(input);
}
}
