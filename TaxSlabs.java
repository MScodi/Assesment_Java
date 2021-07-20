package question;

import java.util.Scanner;

public class TaxSlabs {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Salary");
			int salary = sc.nextInt();
			System.out.println("Enter  a Gender");
			String Gender = sc.next();
			
			if(Gender !="Women") {
				generalTax(salary);
			}
			else {
				womenTax(salary);
			}
		}

		private static void womenTax(int salary) {
			int tax =0;
			if(0< salary && salary <190000) {
				tax=0;
				System.out.println("tax is " + tax );
			}
			else if(190001<salary && salary<500000){
				tax=salary/10;
				System.out.println("tax is " + tax );
			}
			else if(500001<salary && salary<800000){
				tax=salary/5;
				System.out.println("tax is " + tax );
			}
			else if( salary>800000){
				tax=(salary/10)*3;
				System.out.println("tax is " + tax );
			}
			
		}

		private static void generalTax(int salary) {
			int tax =0;
			if(0< salary && salary <180000) {
				tax=0;
				System.out.println("tax is " + tax );
			}
			else if(180001<salary && salary<500000){
				tax=salary/10;
				System.out.println("tax is " + tax );
			}
			else if(500001<salary && salary<800000){
				tax=salary/5;
				System.out.println("tax is " + tax );
			}
			else if( salary>80000){
				tax=(salary/10)*3;
				System.out.println("tax is " + tax );
			}
		}

		
}
