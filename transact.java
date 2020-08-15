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
public interface transact {
    default void transaction(double balance)
    {
        Scanner in=new Scanner(System.in);
        int choice;
        System.out.println("\t Enter the Choice \n 1.Deposit \n 2.Withdrawal \n 3.Check Balance");
        choice=in.nextInt();
        if (choice==1)
        {
            double money;
            System.out.println("Enter the Amount to Deposit :");
            money=in.nextDouble();
            balance=balance+money;
            System.out.println("\t The  Current Balance = "+balance);
        }
        else if (choice==2)
        {
            
            double money;
            System.out.println("Enter the Amount to Withdrawal :");
            money=in.nextDouble();
            if(money>balance)
                System.out.println("Insufficient Balance");
            else
            {
                
            balance=balance-money;
            System.out.println("\t The  Current Balance = "+balance);
            }
        }
        else if (choice==3)
        {
            System.out.println("\t The Current Balance ="+balance);
        }
        else
        {
            System.out.println(" !!! Invalid Choice !!!");
        }
        
    }
}
