package Assignment;

import java.util.Scanner;

public class Q4Voting {
	private String name;
	private int age;
	private String gender;
	
	Scanner sc=new Scanner(System.in);
	
	public void accept()
	{
		System.out.print("Enter name :");
		name=sc.next();
		System.out.print("Enter age :");
		age=sc.nextInt();
		System.out.print("Enter gender :");
		gender=sc.next();
		
		}
	public void eligibility()
	{
		if(age>18 && age<100)
			System.out.println(age +"Person is eligible to vote");
		else if(age!=18)
			System.out.println(age +" Person is noteligible to vote");
	}
	
	public void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Gender :"+gender);
	}
	

}
