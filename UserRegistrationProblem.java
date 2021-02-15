package uregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Email");
		
		Scanner sc = new Scanner(System.in);
		String email = sc.next();
		
		Pattern pattern = Pattern.compile("^[a-z]{1,}[.]([a-z]*)[@][a-z]{1,}[.]"
											+ "[a-z]{1,}[.]([a-z]*)");
		Matcher matcher = pattern.matcher(email);
		
		if (matcher.matches())
		{
			System.out.println("Valid Email");
		}
		else
		{
			System.out.println("Invalid Email");
		}
	}
}
