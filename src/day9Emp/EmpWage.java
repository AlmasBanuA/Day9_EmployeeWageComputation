package day9Emp;

/*
* Solving using Switch Case Statement
*/
public class EmpWageComputation {
public static final int EMP_FULL_TIME_HOUR = 1;
public static final int EMP_PART_TIME_HOUR = 2;
public static final int EMP_WAGE_PER_HOUR = 20;
public static void main(String[] args)
    {
        int empHours;
        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
        switch (empCheck) {
        case EMP_FULL_TIME_HOUR -> {
        empHours = 8;
        System.out.println("Employee is present for full time");
        }
        case EMP_PART_TIME_HOUR -> {
         empHours = 4;
         System.out.println("Employee is present for half time");
        }
        default -> {
         empHours = 0;
    	 System.out.println("Employee is absent");
         }
      }
        int empWage = (EMP_WAGE_PER_HOUR * empHours);
        System.out.println("Employee Wage = " + empWage);
    }     
}
