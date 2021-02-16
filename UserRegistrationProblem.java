package uregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Password");
		
		Scanner sc = new Scanner(System.in);
		String pwd = sc.nextLine();
		
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]{8,}");
		Matcher matcher = pattern.matcher(pwd);
		
		if (matcher.matches())
		{
			System.out.println("Valid According to Rule 1");
		}
		else
		{
			System.out.println("Invalid According to Rule 1");
		}
	}
}
