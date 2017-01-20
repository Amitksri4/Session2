
package assignment2_1;
import java.util.Scanner;
public class PrimeRevCalculation {
    int ar1[];
int ar2[];

	public void calculate()
	{
		ar1=new int[10];
		ar2=new int[10];
		int out,j=9;
		System.out.println("Enter ten Prime Number :");

		for(int i=0;i<10;i++)
		{
		System.out.print("Enter Prime Number "+(i+1)+":");
		Scanner scan=new Scanner(System.in);
                 out=scan.nextInt();
              //  ar1[i]=Integer.parseInt(System.console().readLine());
		ar2[j]=out;
		j=j-1;

		}	
	

	}

	public void display()
	{
	
	System.out.println("Reverse of Entered Prime No is: ");
		for(int k=0;k<10;k++)
		{
		System.out.print(ar2[k]+",");
		}
	}
    
}
