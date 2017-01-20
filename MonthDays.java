/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_1;

import java.util.*;
public class MonthDays {
    
    public static void main(String[] args) {
        String str;
        System.err.println("Enter the Month for Days :");
       Scanner myscanner=new Scanner(System.in);
                         str=myscanner.next();
        MonthDayCalculation mdc=new MonthDayCalculation();
        mdc.getMonth(str);
    }
}
