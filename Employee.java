package employee;

import java.util.Scanner;
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    Scanner input=new Scanner(System.in);
    public Employee()
    {
        firstName=null;
        lastName=null;
        salary=0.0;
    }
    public Employee(String a,String b,double c)
    {
        firstName=a;
        lastName=b;
        if(c>0)
        salary=c;
    }
    public void setFirstName()
    {
        System.out.println("Enter first name:");
        firstName=input.next();       
    }
    public void setLastName()
    {
        System.out.println("Enter last name:");
        lastName=input.next();
    }
    public void setSalary()
    {
        double x;
        System.out.println("Enter monthly salary:");
        x=input.nextDouble();
        if(x>0)
            salary=x;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public double getSalary()
    {
        return salary;
    }
    public void display()
    {
        System.out.println("Name and Salary of the Employee is "+firstName+lastName+" "+salary);
    }
    public void salaryRaise()
    {
        salary=salary+(10*salary)/100.00;
    }
    public void disp()
    {
        double yearlySalary;
        yearlySalary=salary*12;
        System.out.println("Yearly salary is "+yearlySalary);
    }
}