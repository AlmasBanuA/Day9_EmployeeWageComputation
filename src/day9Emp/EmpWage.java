package day9Emp;

import java.util.Random;

/*
    Program solving Using Switch case statement
*/

class EmpWageComputation {
	Random rand = new Random();
	public final int isPresent = 1;
	public final int isAbsent = 2;
	public final int isPartTime = 3;
	public int wagePerHr = 20;
	public int fullDayHr = 8;
	public int partTimeHr = 4;
	public int dailyWage;

	public void present() {
		int check = rand.nextInt(3) + 1;
		switch (check) {
		case isPresent: {
			System.out.println("Employee is present.");
			dailyWage = wagePerHr * fullDayHr; // condition 1
			System.out.println("Daily wage is : " + dailyWage);
		}

		case isPartTime: {
			System.out.println("Employee is present part time."); // condition 2
			dailyWage = wagePerHr * partTimeHr;
			System.out.println("Daily wage is : " + dailyWage);
		}

		case isAbsent:
			System.out.println("Employee is absent."); // default statement
		}
	}
}

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation");
		EmpWageComputation empWage = new EmpWageComputation(); // create object for EmpWageComputation class
		empWage.present();
	}

}
