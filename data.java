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
public class data implements loan,transact,FD
{
    
    long[] id=new long[10];//Stored as id;
    double[]balance =new double[10];
    double[]salary =new double[10];
    String[][] dbs=new String[10][2];//Name , Address
    int[][] dbi=new int[10][3];//gender ,account type,age
    
   data()
   {//Sample Pre-stored account 196000001

       id[0]=196000001;balance[0]=100000;salary[0]=850000;
       dbs[0][0]="GM BABURAO ";dbs[0][1]="Kurla";
       dbi[0][0]=1;dbi[0][1]=1;dbi[0][2]=45;        
       
       
       id[1]=196000006;balance[1]=1000000;salary[1]=5600000;
       dbs[1][0]="GM MOTORS ";dbs[1][1]="CST";
       dbi[1][0]=3;dbi[1][1]=2;dbi[1][2]=30;        
    }
   int idcheck(long idg)
   {
       int count=-1;
       for(int i=0;i<3;i++)
       {
           if(id[i]==idg)
           count=i;
       }
       if (count>=0)
           return(count);
       else
           return(-1);
   }
   void createacc()
   {
       String name,address;
       double sal,inbal;
       int gen,acct,age;
       Scanner in =new Scanner(System.in);
       System.out.println("\n \t kindly Enter your Details for New Account Registration ");
       System.out.println("\t Enter your Name ");
       name=in.nextLine();
       dbs[2][0]=name;
       System.out.println("\t Enter your Address ");
       address=in.nextLine();
       dbs[2][1]=address;
       System.out.println("\t Enter your Gender \n 1. for Male \n 2. F for Female \n 3. for others: \n");
       gen=in.nextInt();
       dbi[2][0]=gen;
       System.out.println("\t Enter your choice of account \n 1.for Savings \n 2.Current \n ");
       acct=in.nextInt();
       dbi[2][1]=acct;
       System.out.println("\t Enter your age :");
       age=in.nextInt();
       dbi[2][2]=age;
       System.out.println("\t Enter your Annual Salary :");
       sal=in.nextDouble();
       salary[2]=sal;
       System.out.println("\t Enter intial balance to credit in account ");
       inbal=in.nextDouble();
       balance[2]=inbal;
        int l;
       l=name.length();
       long id1=196000000+(100*gen)+(1000*acct)+l;
       id[2]=id1;
       System.out.println("\n \t Your account number generated is :- "+id1);
   }
   void display(int ch )
   {
    //int i;
       System.out.println("Customer name :-"+dbs[ch][0]);
       System.out.println("\n Address :-"+dbs[ch][1]);
       if(dbi[ch][0]==1)
       {
       System.out.println("\n Gender :- MALE");
       }
       if(dbi[ch][0]==1)
       {
       System.out.println("\n Gender :- FEMALE");
       }
       if(dbi[ch][0]==2)
       {
       System.out.println("\n Gender :- OTHERS");
       }
       System.out.println("\n AGE :-"+dbi[ch][2]);
       if(dbi[ch][1]==1)
       {
       System.out.println("\n ACCOUNT TYPE :-SAVINGS");
       }
       if(dbi[ch][1]==2)
       {
       System.out.println("\n ACCOUNT TYPE :-CURRENT");
       }
       System.out.println("\n BALANCE :- "+balance[ch]);
       System.out.println("\n Account Id :-"+id[ch]);
     
   }
 }
          
