package question;

import java.util.Scanner;

public class EggCalculate {
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Eggs ");
		int total = sc.nextInt();
		int gross = total/144;
		int dozen = (total%144)/12;
		int rem = (total%144)%12;
		System.out.println("Your number of eggs is "+ gross+" gross " +dozen +" dozen " + " and "+ rem);
	}
		
}
