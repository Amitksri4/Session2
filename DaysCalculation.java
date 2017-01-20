
package assignment2_1;

import java.util.regex.Pattern;

public class DaysCalculation {

   String[] month={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    int[] day={31,28,31,30,31,30,31,31,30,31,30,31};
    String em;
    int nday=0;
public void getMonthDays(String str)
{
    Pattern pat=  Pattern.compile("/");
    String[] res=pat.split(str);
    int mm=Integer.parseInt(res[0]);
    for(int i=0;i<mm-1;i++)
    {
        nday=day[i]+nday;
    }
    nday=nday+Integer.parseInt(res[1]);
System.out.println("Total Days of Entered date from Jan is : "+nday);
    

}

}

