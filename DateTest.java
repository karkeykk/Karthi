package date;
public class DateTest {
    public static void main(String args[])
    {
        int a,b,c;
        Date d1=new Date(12,25,2005);
        Date d2=new Date();
        d2.setDay();
        d2.setMonth();
        d2.setYear();
        d1.displayDate();
        a=d2.getMonth();
        b=d2.getDay();
        c=d2.getYear();
        System.out.println("The date is "+a+"/"+b+"/"+c);
    }
}
