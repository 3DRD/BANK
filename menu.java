
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
public class menu extends data
{
    menu()
    {
        System.out.println("\t !$! Welcome to BANK OF METEROPOLIS !$!");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        menu m=new menu();
        data d=new data();
       int choice=1;
           while(choice>0)
           {
               System.out.println("\n Choose Your option \n 1.LOGIN  \n 2.CREATE ACCOUNT  & any key to EXIT");
               choice=in.nextInt();
               if (choice==1)
               {
                   //menu
                   System.out.println("Enter Your Id");
                   long id=in.nextLong();
                   int ch=d.idcheck(id);
                   if (ch>=0)
                   {
                       int cho=0;
                       while(cho!=5)
                       {
                       System.out.println("\t Enter 1.transactions \n 2.Loan \n 3.FD \n 4.Account info \n 5.EXIT ");
                       cho=in.nextInt();
                       if(cho==1)
                       {
                        d.transaction(d.balance[ch]);
                       }
                       else if(cho==2)
                       {
                        d.loant(d.balance[ch]);
                       }
                       else if(cho==3)
                       {
                           d.fixedD();
                       }
                       else if(cho==4)
                       {
                           d.display(ch);
                       }
                       else if(cho==5)
                           break;
                       else
                           System.out.println("Invalid Choice");
                       }
                   }
                   
               }
               else if (choice==2)
               {
                   //create
                   d.createacc();
               }
               else
               {
                   choice=-1;
               }
        }
            
    }
    
}
