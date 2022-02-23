package day9Emp;

/*
* Calculate Daily Employee Wage
*/
public class EmpWageComputation
	
public static final int EMP_WAGE_PER_HOUR = 20;
public static void main(String[] args)
    {
        int empHours;
        int empCheck = (int) (Math.floor(Math.random()*10)%2);
        if ( empCheck == 1 ){
            empHours = 8;
            System.out.println("Employee is Present");
        }
        else {
            empHours = 0;
            System.out.println("Employee is Absent");
        }
        int empWage = (EMP_WAGE_PER_HOUR * empHours);
        System.out.println("Employee Daily Wage : " + empWage);
    }
}
