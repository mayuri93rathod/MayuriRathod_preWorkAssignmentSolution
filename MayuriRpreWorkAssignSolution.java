package AssignmentSolutions;

import java.util.Scanner;

public class MayuriRpreWorkAssignSolution {
	
	void palindromeCheck(int number) {
		
		//first reverse the number then check equality with original number
		int original_num =number;
		int revrse_num = 0;
		int remainder;
		
		while(number>0) {
			
			remainder = number%10;
			revrse_num = revrse_num * 10 + remainder;
			
			number = number/10;
		}
		//check reverse number equal to original number
		if(original_num == revrse_num) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}
	
	
	void starPrint(int number) {
		
		for(int i=number; i>0; i--) {//new line
			for(int j=1;j<=i;j++) {//printing star
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	int primeNum(int number) {
		
		if(number == 0 || number == 1) {
			//System.out.println("Number is not prime");
			return 0;
			//not prime number
		}
		else {
			for(int i=2; i<=number/2 ;i++) {
				if(number%i == 0) {
					return 0;
					//not prime number
				}
			}
			
		}
		return 1;
		//number is prime
		
		
	}
	
	void fibinacciSeries(int number) {
		int first = 0;
		int second =1;
		int next;
		
		System.out.print(first+" "+second);
		//already first two numbers are displayed above 
		
		for(int index=2; index <=number; index++) {
			//calculating next number
			next = first + second;
			
			System.out.print(" "+next);
			
			first = second;
			second = next;
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Write a program that performs multiple operations: 

			1.check for palindrome number
			2.prints the pattern of stars in decreasing order based on the input
			3.check whether the input number is a prime number
			4.print Fibonacci series of size n with first two numbers as 0, 1
			 
			
			Using Switch case and do-While loop provide all the above functionality, such that 
			user can select the functions that he/she needs to perform and 
			exit the program based on the input.
		 */
		//creating object

		MayuriRpreWorkAssignSolution mrobj = new MayuriRpreWorkAssignSolution();
		
		Scanner sc = new Scanner(System.in);
		int option;
		int num;
		
		do {
			
			System.out.print("1.check for palindrome number\n2.Print pattern of stars in decresing oreder\n");
			System.out.print("3.Prime number\n4.Display Fibonacci Series\n5.Exit\n Please select one of the above options: ");
			
			option = sc.nextInt();
			
			switch(option) {
			case 1: System.out.println("Enter number to check palindrome: ");
			num = sc.nextInt();
			mrobj.palindromeCheck(num);
			break;
			
			case 2: System.out.println("Enter number for printing stars in decreasing order: ");
			num = sc.nextInt();
			mrobj.starPrint(num);
			break;
			
			case 3:System.out.println("Enter the number to check whether it is prime number: ");
			num = sc.nextInt();
			int check = mrobj.primeNum(num);
			if(check==0) {
				System.out.println("Not prime number");
			}
			else {
				System.out.println("Prime number");
			}
			break;
			
			case 4:System.out.println("Enter upto how many numbers to display fibonacci series: ");
			num = sc.nextInt();
			mrobj.fibinacciSeries(num);
			break;
			
			case 5: break;
			
			default: System.out.println("please enter correct option ");
			break;
			}
			
						
		}while(option!=5);
		
		
		

	}

}
