import java.util.Scanner;

public class CheckPrime {
    public static void main(String agrs[]) {
        int i, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        num = sc.nextInt();
        for (i = 2; i < num; i++) {
            if (num % i == 0)
                break;
            if (i == num)
                System.out.println(num + " is Prime");
            else
                System.out.println(num + "is not Prime");
        }
    }
}
