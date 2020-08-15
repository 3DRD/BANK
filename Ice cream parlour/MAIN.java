import java.io.*;
public class MAIN
{
public static void main(String args[])throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("+!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=== WELCOME TO YUMMY ICE-CREAM PARLOUR ===!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!=!+");
System.out.println("===============================================================================================================================================");
System.out.println("+                                                                                                                                             +");
System.out.println("********************************************* WOULD YOU LIKE TO PLACE AN ORDER ? ? ********************************************************+");
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++ Enter yes or no ++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println();
String str;int a,b,c;
int t,t1,t2,t3,t4,t5,t6;
t =0;t1 =0;t2=0;t3 =0; t4=0;t5=0;t6=0;
str = in.readLine();
System.out.println("===============================================================================================================================================");
if ((str.equalsIgnoreCase("yes")==true))
{
while ((str.equalsIgnoreCase("yes")==true))
{
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("+ =========================================================== MENU ======================================================================+");
System.out.println("+ ===================================================== WHAT WOULD YOU HAVE ? ================================================================+");
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
order ob = new order();
a = ob.order();
if (a ==001)
{
icecream ob1 = new icecream();
c = ob1.icecream();
t = t + c;
}
if (a ==002)
{
icecreammix ob2 = new icecreammix();
c = ob2.icecreammix();
t1 = t1 + c;
}
if (a ==003)
{
icecreamsundae ob3 = new icecreamsundae();
c = ob3.icecreamsundae();
t2 = t2 + c;
}
if (a ==004)
{
milkshake ob4 = new milkshake();
c = ob4.milkshake();
t3 = t3 + c;
}
if (a ==005)
{
falooda ob5 = new falooda();
c = ob5.falooda();
t4 = t4 + c;
}
if (a ==006)
{
cake_and_pastries ob6 = new cake_and_pastries();
c = ob6.cake_and_pastries();
t5 = t5 + c;
}
if (a ==007)
{
juices ob7 = new juices ();
c = ob7.juices();
t6 = t6 + c;
}
System.out.println();
System.out.println();
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println(" ======================================= DO YOU WANT TO ORDER ANYTHING FROM YUMMY ICE-CREAM PARLOUR ?? ===================================== ");
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
str = in.readLine();
}
}
if ((str.equalsIgnoreCase("yes")==false))
{
bill ob8 = new bill();
ob8.bill(t,t1,t2,t3,t4,t5,t6);
System.out.println(" ======================================================                                 ===========================================================");
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++THANK YOU.VISIT AGAIN+++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println(" ======================================================                                 ===========================================================");
}
}
}

