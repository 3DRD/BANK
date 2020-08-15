import java.io.*;
public class cake_and_pastries
{
public int cake_and_pastries()throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int a,b =0;int c;
String str;
System.out.println();
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println(" ================================================= DO YOU WANT TO ORDER FROM VAKES AND PASTRIES ? ======================================================");
System.out.println("  ============================================================ Enter yes or no ================================================================");
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println();
str = in.readLine();
while (str.equalsIgnoreCase("yes")==true)
{
System.out.println();
System.out.println();
System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println("================MANGO Cake ==============================> Rs.250 <============= (Code - 1 )=|");
System.out.println("================STRAWBERRY Cake =========================> Rs.250 <============= (Code - 2 )=|");
System.out.println("================ICECREAM  Cake =================================> Rs350 <============= (Code - 3 )=|");
System.out.println("================KID Cake =========================> Rs.300 <============= (Code - 4 )=|");
System.out.println("================WEDDING Cake =================================> Rs.1500 <============= (Code - 5 )=|");
System.out.println("================BIRTHDAY Cake ========================> Rs.700 <============= (Code - 6 )=|");
System.out.println("================JELLY Cake ============================> Rs.400 <============= (Code - 7 )=|");
System.out.println("================MIXED FRUIT Cake =============================> Rs.450 <============= (Code - 8 )=|");
System.out.println("================YUMMY'S SPECIAL Cake ==========================> Rs.500 <============= (Code - 9 )=|");
System.out.println("================KING Cake ===============================> Rs.2000 <============= (Code - 10)=|");
System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println();
System.out.println();
System.out.println(" =========================================== Enter the CODE of the thing you would like to have ============================================");
System.out.println();
a = Integer.parseInt(in.readLine());
if (a ==1)
{
System.out.println(" ===================================== Enter the QUANTITY of MANGO Cake you WOULD HAVE ?  ==========================================");
c = Integer.parseInt(in.readLine());
b = b+250;
b = ((250*c)+b);
}
if (a==2)
{
System.out.println(" ================================== Enter the QUANTITY of STRAWBERRY CAKE you WOULD HAVE ? ========================================");
c = Integer.parseInt(in.readLine());
b = b+250;
b = ((250*c)+b);
}
if (a ==3)
{
System.out.println(" ====================================== Enter the QUANTITY of ICE CREAM CAKE you WOULD HAVE ? ============================================");
c = Integer.parseInt(in.readLine());
b = b+450;
b = ((350*c)+b);
}
if (a==4)
{
System.out.println(" =================================== Enter the QUANTITY of KID CAKE you WOULD HAVE ? ======================================= ");
c = Integer.parseInt(in.readLine());
b = b+300;
b = ((300*c)+b);
}
if (a ==5)
{
System.out.println(" ===================================== Enter the QUANTITY of WEDDING CAKE you WOULD HAVE ? =============================================");
c = Integer.parseInt(in.readLine());
b = b+1500;
b = ((1500*c)+b);
}
if (a==6)
{
System.out.println(" =============================== Enter the QUANTITY of BIRTHDAY CAKE you WOULD HAVE ? ==========================================");
c = Integer.parseInt(in.readLine());
b = b+700;
b = ((700*c)+b);
}
if (a ==7)
{
System.out.println(" ================================== Enter the QUANTITY of JELLY CAKE you WOULD HAVE ? ==========================================");
c = Integer.parseInt(in.readLine());
b = b+400;
b = ((400*c)+b);
}
if (a==8)
{
System.out.println(" ================================ Enter the QUANTITY of  MIXED FRUIT CAKE you WOULD HAVE ? =============================================");
c = Integer.parseInt(in.readLine());
b = b+450;
b = ((450*c)+b);
}
if (a ==9)
{
System.out.println(" =============================== Enter the QUANTITY of YUMMY'S SPECIAL CAKE you WOULD HAVE ? ===========================================");
c = Integer.parseInt(in.readLine());
b = b+500;
b = ((500*c)+b);
}
if (a==10)
{
System.out.println(" ================================= Enter the QUANTITY of KING CAKE you WOULD HAVE ? ==============================================");
c = Integer.parseInt(in.readLine());
b = b+2000;
b = ((2000*c)+b);
}
System.out.println();
System.out.println();
System.out.println("  ========================================= Do you want to order anything more FROM CAKES_AND_PASTRIES? =============================================== ");
str = in.readLine();
}
return(b);
}
}

