package grade_calculator_application;
import java.util.Scanner;


	public class StudentGradeCalculator {
		private static Scanner sc;
	    public static void main(String[] args) {
	    	
	    	
	    	int English, Chemistry, Physics, Maths, Arts; 
	    	float total, Percentage , average;
	    	
			sc = new Scanner(System.in);
			
			 System.out.println("Welcome to my Student Grade calculator !!! ");
			 System.out.println("Enter student " + " name :");
			    String studentname = sc.next();
			    

while(!studentname.matches("[a-zA-Z]+")){
			        System.out.println("Please enter a valid name!");
			        studentname = sc.nextLine();
			    }
 
			System.out.print(" Please Enter  all the Subjects Marks as folllows");
			
			System.out.println(" Please Enter  your score for English : ");
			English = sc.nextInt();	
			
			System.out.println(" Please Enter  your score for Chemistry");
			Chemistry = sc.nextInt();	
			
			System.out.println(" Please Enter  your score for Physics");
			Physics = sc.nextInt();	
			
			System.out.println(" Please Enter  your score for Maths");
			Maths = sc.nextInt();	
			
			System.out.println(" Please Enter  your score for Arts");
			Arts = sc.nextInt();
		
			total = English + Chemistry + Physics + Maths +  Arts;
		    Percentage = (total / 500) * 100;
		    average = (total/5);
		 
		    System.out.println(" Total Marks =  " + total);
		    System.out.println(" Marks Percentage =  " + Percentage);
		    System.out.println("Marks Average = " + average);
	       	
	  if (average <= 100 && average >= 90) {
			       System.out.println("Letter grade: A");
			       System.out.println(studentname + " gets 4 stars! ****");
			       System.out.println("Excellent!");
			       
			      } if (average <= 89 && average >= 80) {
			       System.out.println("Letter grade: B");
			       System.out.println(studentname + " gets 3 stars! ***");
			       System.out.println("Well done");
			       
			      } if (average <= 79 && average >= 70) {
			       System.out.println("Letter grade: C");
			       System.out.println(studentname + " gets 2 stars! **");
			       System.out.println("You passed");
			       
			      } if (average <= 69 && average >= 60) {
			       System.out.println("Letter grade: D");
			       System.out.println(studentname + " gets 1 star! *");
			       System.out.println("You passed");
			       
			      } if (average <= 59) {
			       System.out.println("Letter grade: F");
			       System.out.println(studentname + " gets 0 stars!");
			       System.out.println("You Failed the Course");
			       
			      } if (average > 100) {
				    	System.out.println("Invalid exam scores, please re-enter your scores.");
			      
	    }
	}
	}
	    
			 
	
	

