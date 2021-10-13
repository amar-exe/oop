import java.util.Scanner;
import java.math.*;
import java.util.Random;

//Task1
/*
public class Main
{
	public static void main(String[] args) {
		System.out.println("Input password: ");
		Scanner sc = new Scanner(System.in);
		String pass = sc.nextLine();
		String p = "pw";
		
		while (!pass.equals(p)){
		    System.out.println("Wrong password, try again: ");
		    pass = sc.nextLine();
		}
		System.out.println("Secret message");
	}
}*/

//Task2
/*
public class Main
{
	public static void main(String[] args) {
		System.out.println("Input first num: ");
		Scanner reader = new Scanner(System.in);
		int sum=0;
		int read = reader.nextInt();
		sum+=read;
		
		System.out.println("Input second num: ");
		read = reader.nextInt();
		sum+=read;
		
		System.out.println("Input third num: ");
		read = reader.nextInt();
		System.out.println("The sum of your 3 numbers is: "+ (sum+read));
	}
}*/

//Task3
/*
public class Main
{
	public static void main(String[] args) {
		System.out.println("Input first num: ");
		Scanner sc = new Scanner(System.in);
		int sum=0;
		while(true){
		    int read = Integer.parseInt(sc.nextLine());
		    if (read == 0){
		        break;
		    }
		    else{
		    sum+=read;
		    System.out.println("Sum now: "+ sum);
		}
		}
		
		System.out.println("Sum in the end: "+ sum);
	}
	
}*/


	
//Task4
/*
public class Main
{
	public static void main(String[] args) {
		System.out.println("Input first num: ");
		Scanner sc = new Scanner(System.in);
		int fnum= sc.nextInt();
		System.out.println("Input last num: ");
		int lnum= sc.nextInt();
		
		while(fnum<lnum){
		    System.out.println(fnum);
		    fnum++;
		}
		if(fnum<lnum){
		    System.out.println(lnum);
		}
		
		}
		
	}*/

//Task5
/*
public class Main
{
	public static void main(String[] args) {
		System.out.println("Input n: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		for(int i=0; i<n+1; i++){
		    sum+=(int)Math.pow(2,i);
		}
		System.out.println("The result is: " + sum);
		
		}
		
	}*/
	
//Task6
/*
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input how many times the text should be printed: ");
		int n= sc.nextInt();
		for(int i=0;i<n;i++){
		    printText();
		}
		}
		
	public static void printText() {
	    System.out.println("In the beginning there were the swamp, the hoe and Java.\n");
	}
		
	}*/

//Task7
/*
public class Main
{
	public static void main(String[] args) {
		printStars(5);
		printStars(3);
		printStars(9);
		}
		
	public static void printStars(int amount) {
	    
	    for(int i=0;i<amount;i++){
	        System.out.print("*");
	    }
	    
	    System.out.println();
	}
		
	}*/

//Task8

public class Main
{
	public static void main(String[] args) {
		int n = drawNumber();
		int guess=0;
		int guessnum=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter guess: ");
		while(guess!=n){
		    guess=sc.nextInt();
		    if(guess>n){
		        System.out.println("The number is smaller");
		    }
		    else{
		        System.out.println("The number is bigger");
		    }
		    System.out.println("Number of guesses:"+(guessnum++));
		}
		System.out.println("You guessed correctly!\nIt took you"+guessnum+"tries");
		}
	
	public static int drawNumber(){
	    int num = (int)Math.floor(Math.random()*(100+1));
	    return num;
	}	
	}

