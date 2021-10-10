import java.util.*;

public class TasksWeek1 {

	
	public static void main(String[] args) {
		//Task1
		System.out.println("Amar Fazlic");

		//Task2
		System.out.println("Hello World!\n(And all the people of the world)");
		
		//Task3
		System.out.println("There are "+ 365*24*60*60 + " seconds in a year");
		
		//Task4
		Scanner sc = new Scanner(System.in);
		
		int num1=sc.nextInt();
		
		int num2=sc.nextInt();
		System.out.println("Sum of your two numbers is: " + (num1+num2));
		
		//Task5
		int num=sc.nextInt();
		
		if (num>0){
			System.out.println("Your number is positive");
		} else if(num==0) {
			System.out.println("Your number is a 0");
		} else {
			System.out.println("Your number is negative");
		}
		
		//Task6
		int a=sc.nextInt();
		
		int b=sc.nextInt();
		if (a>b){
			System.out.println(a + " is bigger than "+ b);
		} else if(a==b) {
			System.out.println("You typed in the same number twice");
		} else {
			System.out.println(b + " is bigger than "+ a);
		}
	}
	
	
	

}
