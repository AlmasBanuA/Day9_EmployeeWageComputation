package day9Emp;

/*
 * Check Employee is Present or Absent
 */

// import random class
import java.util.Random;

class EmpWageComputation {
	Random rand = new Random();
	public int isPresent = 1;
	public int isAbsent = 2;
	public int wagePerHr = 20;
	public int fullDayHr = 8;
	int check = rand.nextInt(2) + 1;

	/*
	 * boolean method to return true or false
	 */
	public boolean present() {
		if (check == isAbsent) {
			System.out.println("Employee is absent.");
			return false;
		} else {
			System.out.println("Employee is present.");
			return true;
		}
	}

	/*
	 * Calculating Daily Employee Wage
	 */

	public void dailyWage() {
		if (present()) {
			int dailyWage = wagePerHr * fullDayHr;
			System.out.println("Wage of the day of employee is : " + dailyWage);
		}
	}
}

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation");
		EmpWageComputation empWage = new EmpWageComputation();
		empWage.present();
		empWage.dailyWage();
	}

}
