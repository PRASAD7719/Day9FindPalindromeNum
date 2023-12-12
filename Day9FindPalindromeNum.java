/* I/P: 123
 * O/P: No Is Palindrome
 * 
 */

package main1;

import java.util.Scanner;

public class Day9FindPalindromeNum {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Num: ");
		int num=sc.nextInt();
		
		int rem,sum=0;
		int temp=num;
		
		while(num>0) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		
		if(temp==sum) 
			System.out.println("Your Num is Palindrome");
		else
			System.out.println("Your Num is not palindrome");
			
		
		
	}

}
