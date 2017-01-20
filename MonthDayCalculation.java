package assignment2_1;

public class MonthDayCalculation {
    
    String[] month={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    int[] day={31,28,31,30,31,30,31,31,30,31,30,31};
    String em;
    int k=0;
public void getMonth(String str)
{
    for(int i=0;i<10;i++)
		{
			if(str.equals(month[i]))
                            
                        {
			k=i;
                     	break;
                        }
                        	
		}	
	
	   System.out.println("Days of Entered Month is : "+day[k]);	
           	
}

}
