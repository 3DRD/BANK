import java.io.*;
public class milkshake
{
public int milkshake()throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int a,b =0;int c;
String str;
System.out.println();
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println(" =============================================== DO WANT TO ORDER FROM MILKSHAKES ? ==================================================");
System.out.println(" ============================================================ Enter yes or no =================================================================");
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println();
str = in.readLine();
while (str.equalsIgnoreCase("yes")==true)
{
System.out.println();
System.out.println();
System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println("====================MANGO MILKSHAKE+++++++===Rs 70<============= (Code - 1 )= |");
System.out.println("====================STRAWBERRY MILKSHAKE+++++++++===Rs 70<============= (Code - 2 )= |");
System.out.println("====================CHOCOLATE MILKSHAKE+++++++===Rs 70<============= (Code - 3 )= |");
System.out.println("====================MIXED FRUIT MIKSHAKE+++++++===Rs 70<============= (Code - 4 )= |");
System.out.println("====================SUPER CREAM MILKSHAKE+++++++===Rs 90<============= (Code - 5 )= |");
System.out.println("====================OREO WITH COFFEE MILKSHAKE+++++++===Rs 90<============= (Code - 6 )= |");
System.out.println("====================ICE CREAM WITH CHOCOLATE MILKSHAKE++++++===Rs 90<============= (Code - 7 )= |");
System.out.println("====================MIXED FRUIT WITH CREAM MILKSHAKE++++++===Rs 100<============= (Code - 8 )= |");
System.out.println("====================KIDS SPIDERMAN AND BARBIE MILKSHAKE++++++===75<============ (Code - 9 )= |");
System.out.println("====================ROYAL CREAM MILKSHAKE++++++++===Rs 150<============ (Code - 10)= |");
System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println();
System.out.println();
System.out.println(" ========================================= Enter the CODE of the thing you would like to have ===============================================");
System.out.println();
a = Integer.parseInt(in.readLine());
if (a ==1)
{
System.out.println(" ================================ENTER THE QUANTITY OF  MANGO  MILKSHAKE YOU WOULD HAVE ?=========================================");
c = Integer.parseInt(in.readLine());
b = b+70;
b = ((70*c)+b);
}
if (a==2)
{
System.out.println(" ================================ ENTER THE QUANTITY OF STRAWBERRY  MILKSHAKE YOU WOULD HAVE ? ======================================");
c = Integer.parseInt(in.readLine());
b = b+70;
b = ((70*c)+b);
}
if (a ==3)
{
System.out.println(" ====================================ENTER THE QUANTITY OF  CHOCOLATE  MILKSHAKE YOU WOULD HAVE ?  =========================================");
c = Integer.parseInt(in.readLine());
b = b+70;
b = ((70*c)+b);
}
if (a==4)
{
System.out.println(" ================================= ENTER THE QUANTITY OF  MIXED FRUIT  MILKSHAKE YOU WOULD HAVE ? ==================================== ");
c = Integer.parseInt(in.readLine());
b = b+70;
b = ((70*c)+b);
}
if (a ==5)
{
System.out.println(" ===================================== ENTER THE QUANTITY OF  SUPER CREAM  MILKSHAKE YOU WOULD HAVE ? ========================================");
c = Integer.parseInt(in.readLine());
b = b+90;
b = ((90*c)+b);
}
if (a==6)
{
System.out.println(" ================================= ENTER THE QUANTITY OF  OREO WITH COFFEE  MILKSHAKE YOU WOULD HAVE ? ==================================");
c = Integer.parseInt(in.readLine());
b = b+70;
b = ((70*c)+b);
}
if (a ==7)
{
System.out.println(" =================================== ENTER THE QUANTITY OF  ICE CREAM WITH CHOCOLATE  MILKSHAKE YOU WOULD HAVE ? ===================================");
c = Integer.parseInt(in.readLine());
b = b+90;
b = ((90*c)+b);
}
if (a==8)
{
System.out.println(" =================================== ENTER THE QUANTITY OF  MIXED FRUIT WITH CREAM  MILKSHAKE YOU WOULD HAVE ? ===================================");
c = Integer.parseInt(in.readLine());
b = b+100;
b = ((100*c)+b);
}
if (a ==9)
{
System.out.println(" ================================= ENTER THE QUANTITY OF KIDS SPIDERMAN AND BARBIE  MILKSHAKE YOU WOULD HAVE ? ====================================");
c = Integer.parseInt(in.readLine());
b = b+75;
b = ((75*c)+b);
}
if (a==10)
{
System.out.println(" ==================================== ENTER THE QUANTITY OF  ROYAL CREAM  MILKSHAKE YOU WOULD HAVE ? =======================================");
c = Integer.parseInt(in.readLine());
b = b+150;
b = ((150*c)+b);
}
System.out.println();
System.out.println();
System.out.println("  ======================================== DO YOU WANT TO ORDER MORE FROM MILK SHAKE ? ========================================== ");
str = in.readLine();
}
return(b);
}
}

