package sales;
import java.util.Scanner;
public class Sales {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        int j,k,n,n1,n2;
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;

        System.out.println("Enter no.of salesperson:");
        n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter gross sales of the salesperson:");
        for(j=0;j<n;j++)
        {
            arr[j]=input.nextInt();
            arr[j]=200+(9*arr[j])/100;
        }
        for(k=0;k<n;k++)
        {
            if(arr[k]>1000)
                i++;
            else if(arr[k]>900)
                h++;
            else if(arr[k]>800)
                g++;
            else if(arr[k]>700)
                f++;
            else if(arr[k]>600)
                e++;
            else if(arr[k]>500)
                d++;
            else if(arr[k]>400)
                c++;
            else if(arr[k]>300)
                b++;
            else if(arr[k]>200)
                a++;
        }
        int arr1[]={a,b,c,d,e,f,g,h,i};
        n1=100;
        n2=199;        
        System.out.println("Range\tNo of salesperson");
        for(j=0;j<8;j++)
        {
            n1+=100;
            n2+=100;
            System.out.println("$"+n1+"-"+n2+"\t"+arr1[j]);
        }
        System.out.println("$1000 and over"+"\t"+arr1[8]);
    }    
}
