

import java.util.*;
public class Palindrome
 {
	
	public static void main(String[] args) {
		// Write your code here
System.out.println("Enter a number");
int palindrome=new Scanner(System.in).nextInt();
if(isPalindrome(palindrome))
{
	System.out.println("true");
}
	else
	{
		System.out.println("false");
	}
}
public static boolean isPalindrome(int number)
{
	int palindrome=number;
	int reverse=0;
	while(palindrome!=0)
	{
		int remainder=palindrome%10;
		reverse=reverse*10+remainder;
		palindrome=palindrome/10;
	}
	if(number==reverse)
	{
		return true;
	}
	return false;
}
	
}
