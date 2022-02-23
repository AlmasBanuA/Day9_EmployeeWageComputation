package day9Emp;

/*
 * checking employee is present or not
 */
public class Employee_wage {
	    public static void main(String[] args)
	    {
	        int empCheck = (int)(Math.floor(Math.random()*10)%2);
	        if ( empCheck == 1 ){
	            System.out.println("Employee is Present");
	        }
	        else{
	            System.out.println("Employee is Absent");
	        }
  }
}
