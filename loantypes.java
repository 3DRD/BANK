/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBANK;

/**
 *
 * @author hp
 */
public interface loantypes 
{
    default void homeloan(double salary,int t,double amount)
    {
        double intrest,install,month;
        intrest=(amount*t*7.5)/100;
        amount=amount+intrest;
        install=(amount/t)/12;
        month=salary/12;
        if (install<month)
            System.out.println("\tHome loan can be sanctioned \n installment ="+install);
        else
            System.out.println("\tHome loan cannot be sanctioned due to amount exceeding Salary");
        
    }

    default void carloan(double salary,int t,double amount)
    {
        double intrest,install,month;
        intrest=(amount*t*9.75)/100;
        amount=amount+intrest;
        install=(amount/t)/12;
        month=salary/12;
        if (install<month)
            System.out.println("\tCar loan can be sanctioned \n installment ="+install);
        else
            System.out.println("\tCar loan cannot be sanctioned due to amount exceeding Salary");
        
    }
    default void eduloan(double salary,int t,double amount)
    {
        double intrest,install,month;
        intrest=(amount*t*6)/100;
        amount=amount+intrest;
        install=(amount/t)*12;
        month=salary/12;
        if (install<month)
            System.out.println("\tEducation loan can be sanctioned \n installment ="+install);
        else
            System.out.println("\tEducation loan cannot be sanctioned due to amount exceeding Salary");
        
    }
    
    }
    

