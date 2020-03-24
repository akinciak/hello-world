package practiceExercises;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		//Code to read input
		Scanner in = new Scanner(System.in);   
		
		System.out.println("input the 1st number: ");
		int num1 = in.nextInt(); //reads input
		
		System.out.println("input the 2nd number: ");
		int num2 = in.nextInt();
		
		System.out.println("input the 3rd number: ");
		int num3 = in.nextInt();
		
		if ((num1>num2)&&(num1>num3))
		//if (num1>num3)
		System.out.println("The greatest number is: " + num1);
		
		if (num2>num1)
		if (num2>num3)
		System.out.println("The greatest number is: " + num2);
		
		if (num3>num1)
		if (num3>num2)
		System.out.println("The greatest number is: " + num3);
		
		if ((num1<num2)&&(num1<num3))
			System.out.println("The smallest number is: " + num1);
		
		else if ((num2<num1)&&(num2<num3))
			System.out.println("The smallest number is: " + num2);
		
		else
			System.out.println("The smallest number is: " + num3);
		
		
		
		in.close();
	}

}
