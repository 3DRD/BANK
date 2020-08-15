/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBANK;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public interface FD {
    default void fixedD()
   {
       double amount,net,intrest,rate;
       int t;
       Scanner in =new Scanner(System.in);
       System.out.println("\t Enter the Amount to be Fixed Deposit (not less than 5000)");
       while(true)
       {
       amount=in.nextDouble();
       if (amount<5000)
       {
           System.out.println("\t Amount less than minimum.Increase");
       }
       else
           break;
        }
       System.out.println("\t Enter the Time in months(not less than 6 months)");
       while(true)
       {
       t=in.nextInt();
       if (t<6)
       {
           System.out.println("\t Time less than 6 Months.Increase");
       }
       else
           break;
        }
       rate=3+(0.5*(t/12));
       intrest=(amount*rate*(t/12))/100;
       net=amount+intrest;
       System.out.println("\t !!! The value after Maturity = "+net);
       
   }   
}
