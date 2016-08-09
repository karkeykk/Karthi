package employee;

public class EmployeeTest {
    
    public static void main(String args[])
    {   
        String a,b;
        double c;
        Employee one=new Employee("David","Miller",9800.00);      
        Employee two=new Employee();
        two.setFirstName();
        two.setLastName();
        two.setSalary();
        one.display();
        a=two.getFirstName();
        b=two.getLastName();
        c=two.getSalary();
        System.out.println("Name and Salary of the Employee is "+a+b+" "+c);
        one.disp();
        two.disp();
        System.out.println("Raising salary by 10%");
        one.salaryRaise();
        two.salaryRaise();
        one.disp();
        two.disp();
    }
    
}
