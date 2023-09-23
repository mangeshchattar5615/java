import java.util.Scanner;
public class Array14_2d_userInput {
    public static void main(String agrs[])
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
                System.out.println("Enter the element at" + i + " row " + j + "column");
                arr[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<col;j++)
        {
            System.out.print(arr[i][j] +" ");
        }  
        System.out.println();
      }
    }
}
