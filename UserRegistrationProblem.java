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
		
		Pattern pattern = Pattern.compile("(?=[^#?!@$%^&*-]*[#?!@$%^&*-][^#?!@$%^&*-]*$)(?=.*[A-Z])(?=.*[0-9]).{8,}");
		Matcher matcher = pattern.matcher(pwd);
		
		if (matcher.matches())
		{
			System.out.println("Valid According to Rule 1 & 2 & 3 & 4");
			System.out.println("1 : Must have 8 characters"
					+ "\n2 : Must have atleast one UpperCase"
					+ "\n3 : Must have atleast one Numeric"
					+ "\n4 : Must have exactly one Special Character");
		}
		else
		{
			System.out.println("Invalid According to Rule 1 & 2 & 3 & 4");
			System.out.println("1 : Must have 8 characters"
					+ "\n2 : Must have atleast one UpperCase"
					+ "\n3 : Must have atleast one Numeric"
					+ "\n4 : Must have exactly one Special Character");
		}
	}
}
