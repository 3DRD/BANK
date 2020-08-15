import java.io.*;
public class falooda
{
public int falooda()throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int a,b =0;int c;
String str;
System.out.println();
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println(" ============================================= DO YOU WANT TO ORDER FROM FALOODA ? =======================================================");
System.out.println(" ========================================================== Enter yes or no ===================================================================");
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println();
str = in.readLine();
while (str.equalsIgnoreCase("yes")==true)
{
System.out.println();
System.out.println();
System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println("ICE CREAM FALOODA======Rs 50<============= (Code - 1 )= |");
System.out.println("KULFI FALOODA======Rs 50<============= (Code - 2 )= |");
System.out.println("ICE CREAM KULFI FALOODA======Rs 75<============= (Code - 3 )= |");
System.out.println("ICE CREAM JELLY FALOODA======Rs 90<============ (Code - 4 )= |");
System.out.println("KULFI JELLY FALOODA======Rs 90<============= (Code - 5 )= |");
System.out.println("MIXED FALOODA======Rs 100<============= (Code - 6 )= |");
System.out.println("FRUIT FALOODA======Rs 150<============ (Code - 7 )= |");
System.out.println("CHOCOLATE FALOODA======Rs 125<============ (Code - 8 )= |");
System.out.println("BROWNIE FALOODA======Rs 150<============ (Code - 9 )= |");
System.out.println("ROYAL FALOODA======Rs 200<============ (Code - 10)= |");
System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println();
System.out.println();
System.out.println(" ============================================ Enter the CODE of the thing you would like to have ============================================");
System.out.println();
a = Integer.parseInt(in.readLine());
if (a ==1)
{
System.out.println(" ==================================== Enter the QUANTITY OF  ICE CREAM  FALOODA WOULD YOU HAVE ? =======================================");
c = Integer.parseInt(in.readLine());
b = b+50;
b = ((50*c)+b);
}
if (a==2)
{
System.out.println(" ================================= Enter the QUANTITY OF  KULFI  FALOODA WOULD YOU HAVE ? ====================================");
c = Integer.parseInt(in.readLine());
b = b+50;
b = ((50*c)+b);
}
if (a ==3)
{
System.out.println(" ==================================== Enter the QUANTITY OF  ICE CREAM KULFI FALOODA WOULD YOU HAVE ? =========================================");
c = Integer.parseInt(in.readLine());
b = b+75;
b = ((75*c)+b);
}
if (a==4)
{
System.out.println(" =============================== Enter the QUANTITY OF  ICE CREAM JELLY  FALOODA WOULD YOU HAVE ? ====================================== ");
c = Integer.parseInt(in.readLine());
b = b+90;
b = ((90*c)+b);
}
if (a ==5)
{
System.out.println(" ==================================== Enter the QUANTITY OF  KULFI JELLY  FALOODA WOULD YOU HAVE ? =========================================");
c = Integer.parseInt(in.readLine());
b = b+90;
b = ((90*c)+b);
}
if (a==6)
{
System.out.println(" =============================== Enter the QUANTITY OF  MIXED  FALOODA WOULD YOU HAVE ? ====================================");
c = Integer.parseInt(in.readLine());
b = b+100;
b = ((100*c)+b);
}
if (a ==7)
{
System.out.println(" =================================== Enter the QUANTITY OF  FRUIT  FALOODA WOULD YOU HAVE ? ====================================");
c = Integer.parseInt(in.readLine());
b = b+150;
b = ((150*c)+b);
}
if (a==8)
{
System.out.println(" =================================== Enter the QUANTITY OF  CHOCOLATE  FALOODA WOULD YOU HAVE ? =====================================");
c = Integer.parseInt(in.readLine());
b = b+125;
b = ((125*c)+b);
}
if (a ==9)
{
System.out.println(" ================================ Enter the QUANTITY OF  BROWNIE  FALOODA WOULD YOU HAVE ? =====================================");
c = Integer.parseInt(in.readLine());
b = b+150;
b = ((150*c)+b);
}
if (a==10)
{
System.out.println(" ================================== Enter the QUANTITY OF  ROYAL  FALOODA WOULD YOU HAVE ? ============================================");
c = Integer.parseInt(in.readLine());
b = b+200;
b = ((200*c)+b);
}
System.out.println();
System.out.println();
System.out.println("  ====================================== DO YOU TO ORDER MORE FROM FALOODA ? =============================================== ");
str = in.readLine();
}
return(b);
}
}

