package assignment2_1;
import java.util.Scanner;
public class EvenCheck {
    public static void main(String[] arg)
	{
	Declaration d=new Declaration();
	d.eveNumber();
        d.display();
	}
}
class Declaration
{
int number[]=new int[10];
int j,k,num;

	public void eveNumber()
	{
	j=0;
		System.out.println("Enter Ten Numbers :");
		for(int i=0;i<10;i++)

		{
			System.out.print("Enter  Numbers "+(i+1)+" :");
                        Scanner myscanner=new Scanner(System.in);
                         num=myscanner.nextInt();
                        if(num%2==0)
                        {
				
				number[j]=num;
				j++;
			}
    //int no=Integer.parseInt(System.console().readLine());
                }
	}
	
public void display()
	{
		System.out.println("Even Number is :");
		for(int k=0;k<j;k++)
		{
		System.out.print(number[k]+",");
		}
	
	}	
	
}