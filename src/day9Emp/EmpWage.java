package day9Emp;

/*
 * checking employee is present or not
 */
import java.util.Random; //creating a random class

class EmpWageComputation {
	Random rand = new Random();
	public int isPresent = 1;
	public int isAbsent = 2;

	public void present() {
		int check = rand.nextInt(2) + 1;
		if (check == isAbsent) {
			System.out.println("Employee is absent.");
		} else {
			System.out.println("Employee is present.");
		}
	}
}

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation");

		/*
		 * creating empWage object
		 */
		EmpWageComputation empWage = new EmpWageComputation();
		empWage.present();
	}

}
