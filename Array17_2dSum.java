import java.util.Scanner;
public class Array17_2dSum {
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
public static int largestCol(int [][]arr)
{
    int row=arr.length;
    int col=arr[0].length;
    int largest=Integer.MIN_VALUE;
    for(int j=0;j<col;j++)
    {
     int sum=0;
     for(int i=0;i<row;i++)
{
        
    sum=sum+arr[i][j];
}
if(sum>largest)
{
    largest=sum;
}
    }
    return largest;
}
public static void main(String [] agrs)
{
    int [][] arr=takeInput();
    int larColSum=largestCol(arr);
    System.out.println(larColSum);

}
}
