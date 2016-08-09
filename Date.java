package date;
import java.util.Scanner;
public class Date {
    private int day;
    private int month;
    private int year;
    Scanner input=new Scanner(System.in);
    Date()
    {
        day=0;
        month=0;
        year=0;
    }
    Date(int a,int b,int c)
    {
        month=a;
        day=b;
        year=c;
    }  
    public void setMonth()
    {
        System.out.println("Enter month:");
        month=input.nextInt();
    }
    public void setDay()
    {
        System.out.println("Enter day:");
        day=input.nextInt();
        
    }
    public void setYear()
    {
        System.out.println("Enter year");
        year=input.nextInt();
    }
    public int getMonth()
    {
        return month;
    }
    public int getDay()
    {
        return day;
    }
    public int getYear()
    {
        return year;
    }
    public void displayDate()
    {
        System.out.println("The date is "+month+"/"+day+"/"+year);
    }
}
