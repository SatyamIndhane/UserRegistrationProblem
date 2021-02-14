package uregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Last name");
		
		Scanner sc = new Scanner(System.in);
		String lname = sc.next();
		
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,30}$");
		Matcher matcher = pattern.matcher(lname);
		
		if (matcher.matches())
		{
			System.out.println("Valid Last Name");
		}
		else
		{
			System.out.println("Invalid Last Name");
		}
	}
}
