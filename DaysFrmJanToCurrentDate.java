/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_1;

import java.util.*;
import java.text.*;

public class DaysFrmJanToCurrentDate {
public static void main(String[] args) {

DaysCalculation dc=new DaysCalculation();
Scanner sc = new Scanner(System.in); 
DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
Date d = null; 
System.out.print("Enter Date for days calculation(Format mm/dd/yyyy) : "); 
try {

d=df.parse(sc.nextLine());

}
catch(ParseException e) {
System.out.println("Unable to parse " + sc.nextLine());}

String s3 = df.format(d);
dc.getMonthDays(s3);
//System.out.println("The entered date is: " + s3);

}
}      
        //SimpleDateFormat sdf=new SimpleDateFormat("mm/dd/yyyy HH:mm:ss");
    //    System.out.println("Current Date : "+sdf.format(curdate));


      //  }


        //String str;
        //System.err.println("Enter the Month for Days :");
       //Scanner myscanner=new Scanner(System.in);
         //                str=myscanner.next();
        //MonthDayCalculation mdc=new MonthDayCalculation();
        //mdc.getMonth(str);
    //}
//}


