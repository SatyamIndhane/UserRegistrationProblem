package uregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter First name");
		
		Scanner sc = new Scanner(System.in);
		String fname = sc.next();
		
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,30}$");
		Matcher matcher = pattern.matcher(fname);
		
		if (matcher.matches())
		{
			System.out.println("Valid First Name");
		}
		else
		{
			System.out.println("Invalid First Name");
		}
	}
}
