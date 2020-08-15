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
public interface loan extends loantypes
{
       default void loant(double salary)
 {
     System.out.println("\t!!! Welcome to loan Deapartment !!!\n");
     Scanner in=new Scanner(System.in);
     int choice;
     System.out.println("\t Today's loan rate :\nHome loan-8.3% \nCar loan-11.75% \nEducation Loan-6% ");
     System.out.println("Enter your Requirement \n 1.Home Loan \n 2.Car Loan \n 3.Education Loan");
     choice=in.nextInt();
     if(choice==1)
     {
         double amount;int t;
         System.out.println("\n Enter the Amount Required");
         amount=in.nextDouble();
         System.out.println("\n Enter the Time Required ");
         t=in.nextInt();
         homeloan(salary,t,amount);
     }
     else if(choice==2)
     {
         double amount;int t;
         System.out.println("\n Enter the Amount Required");
         amount=in.nextDouble();
         System.out.println("\n Enter the Time Required ");
         t=in.nextInt();
         carloan(salary,t,amount);
     }
     else if(choice==3)
     {
      double amount;int t;
         System.out.println("\n Enter the Amount Required");
         amount=in.nextDouble();
         System.out.println("\n Enter the Time Required ");
         t=in.nextInt();
         eduloan(salary,t,amount);
     
     }
     else
     {
         System.out.println("Invalid choice.EXIT");  
     }
 }
    
    }
    
