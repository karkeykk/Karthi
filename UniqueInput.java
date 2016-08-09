package uniqueinput;
import java.util.Scanner;
public class UniqueInput {    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []arr=new int[5];
        int i,j,n;
        n=arr.length;
        System.out.println("Enter array values:");
        for(i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }             
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {                  
                    int l=j;
                    for(int k=j+1;k<n;k++,l++)
                    {
                       arr[l]=arr[k];
                    }
                    n--;
                    j--;
                }
            }
        }
        System.out.println("The unique array is ");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}