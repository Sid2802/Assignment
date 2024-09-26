package Assignment;

import java.util.Scanner;

public class Q2Examgrade {
	private String name;
	private int sub1,sub2,sub3;
	private float average;
	private int  totalmarks;
     Scanner sc=new Scanner(System.in);
     
     public void accept()
     {
    	System.out.println("Enter name:");
    	name=sc.next();
    	System.out.println("Enter Sub1:");
    	sub1=sc.nextInt();
    	System.out.println("Enter Sub2:");
    	sub2=sc.nextInt();
    	System.out.println("Enter Sub3:");
    	sub3=sc.nextInt();
    	totalmarks=sub1+sub2+sub3;
   	   average=totalmarks/3;
    	
     }
     
     public void studentPass()
     {
    	 if(sub1>=40 && sub2>=40 &&sub3>=40 && average>=60 )
    	 {
    		 System.out.println("Average is valid");
    	 }
    	 else
    	 {
    		 System.out.println(" Average is invalid");
    	 }
     }
     public void display()
     {
    	 System.out.println("Name"+name);
    	 System.out.println("Sub1 :"+sub1);
    	 System.out.println("Sub2 :"+sub2);
    	 System.out.println("Sub3 :"+sub3);
    	 System.out.println("Average :" +average );
     }


}
