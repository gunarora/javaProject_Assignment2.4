/*Write a program TestDemo.java, which accepts the number as argument and print “You
Have Entered Zero” if the value is equal to 0 along with the ASCII value of the number.
It should print “You Have Entered Positive Value” if the value is greater than 0 along with
the ASCII value.
It should print “You Have Entered Negative Value” if the value is less than 0 along with the
ASCII value.

• A student has A grade if marks are more than 70, B grade if marks are between 61 and 70
and C grade if marks are less than 61 ) Write a program to print the grade for
the given marks.
• Take three subjects like PCM and calculate the average and the above grading system will
work on the average.
• Take marks of the subject from the user.
*/

package javaProject_Assignment2;
import java.text.DecimalFormat;
import java.util.Scanner;


public class TestDemo {
	//Variable for get input value from user
	 int i;
	 //variables for input marks from user
	 int PMarks;
	 int CMarks;
	 int MMarks;
	static Scanner sc = new Scanner(System.in);
	//Main method started
	public static void main(String[] args) {
		//create an object of class
		TestDemo Td = new TestDemo();
		//Method to get value type and ASCII value of entered number.
		Td.TypeofValue();
		//Method to get grade and average of entered marks
		Td.grade();		
		sc.close();		
	}
	
	//Type of Value: Positive type, Negative Type or zero
	public void TypeofValue()
	{
		//taking input from user
		System.out.println("Please Enter Some Value : ");
		i = sc.nextInt();
			//ASCCI value of user input
			char ch = (char) i; 
			if(i == 0 )
			{
				//ASCCI value of 0 is " " space 
				System.out.println("You Have Entered Zero. ASCII Value is " + ch +".");
			}
			else if(i > 0)
			{
			
				System.out.println("You Have Entered Positive Value. ASCII Value is " + ch);
			}
			else
			{
				System.out.println("You Have Entered Negative Value. ASCII Value is " + ch);
			}
		
			
	}

	public void grade()
	{
		System.out.println("Please Enter Marks of Physics : ");
		PMarks = sc.nextInt();
		System.out.println("Please Enter Marks of Chem : ");
		CMarks = sc.nextInt();
		System.out.println("Please Enter Marks of Math : ");
		MMarks = sc.nextInt();
		//Sum of Marks
		 int sum =  (PMarks+CMarks+MMarks);
			System.out.println("Sum of physics, chemistry and maths marks is " + sum); 
			//Calling method to get grade as per marks entered
			Getgrade(sum);
			//Average of Marks
			double  avg = (double) ((double )sum/3);
			//rounding off average upto two places
			avg = roundTwoDecimals(avg);
			System.out.println("Average is " + avg); 
			//Calling method to get grade as per average 
			Getgrade(avg);
		 
			
	}
	
	//Method to calculate grade
	public void Getgrade(double x)
	{
		if(x >70)
		{
			System.out.println("Grade is A");
		}
		else if(x >= 61 && x <= 70)
		{
			System.out.println("Grade is B");
		}
		else
		{
			System.out.println("Grade is C");
		}
	}
	
	//round off decimal value upto two places
	public double roundTwoDecimals(double d) {
	    DecimalFormat twoDForm = new DecimalFormat("#.##");
	    return Double.valueOf(twoDForm.format(d));
	}
	
		

}
