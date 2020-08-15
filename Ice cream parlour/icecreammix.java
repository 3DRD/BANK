import java.io.*;
public class icecreammix
{
public int icecreammix()throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int a,b =0;int c;
String str;
System.out.println();
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println(" ========================================= DO YOU WANT TO ORDER FROM ICECREAM MIX ?==============================================");
System.out.println(" =========================================================== Enter yes or no ==================================================================");
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println();
str = in.readLine();
while (str.equalsIgnoreCase("yes")==true)
{
System.out.println();
System.out.println();
System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println("====================CHOC0LATE icecream mix==============================> Rs.100 <============= (Code - 1 )= |");
System.out.println("====================COOKIES icecream mix=========================> Rs.125 <============= (Code - 2 )= |");
System.out.println("====================KUFLI icecream mix=================================> Rs.150 <============= (Code - 3 )= |");
System.out.println("====================JELLY icecream mix=========================> Rs.200 <============= (Code - 4 )= |");
System.out.println("====================FRUIT icecream mix=================================> Rs.225 <============= (Code - 5 )= |");
System.out.println("====================DRY FRUIT icecream mix========================> Rs.300 <============ (Code - 6 )= |");
System.out.println("====================CREAM'N'CARAMEL icecream_mix============================> Rs.300 <============ (Code - 7 )= |");
System.out.println("====================ULTRA icecream mix=============================> Rs.300 <============ (Code - 8 )= |");
System.out.println("====================YUMMY SPECIAL icecream mix==========================> Rs.425 <============ (Code - 9 )= |");
System.out.println("====================ROYAL icecream mix================================> Rs.500 <============ (Code - 10)= |");
System.out.println("|-------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println();
System.out.println();
System.out.println(" =============================================== Enter the CODE of the thing you would like to have =========================================");
System.out.println();
a = Integer.parseInt(in.readLine());
if (a ==1)
{
System.out.println(" ================================= Enter the QUANTITY of CHOCOLATE icecream_mix you WOULD HAVE ?  ===============================");
c = Integer.parseInt(in.readLine());
b = b+50;
b = ((50*c)+b);
}
if (a==2)
{
System.out.println(" ============================== Enter the QUANTITY of COOKIES icecream_mix you WOULD HAVE ? ============================");
c = Integer.parseInt(in.readLine());
b = b+55;
b = ((55*c)+b);
}
if (a ==3)
{
System.out.println(" ================================== Enter the QUANTITY of KULFI icecream_mix you WOULD HAVE ? ================================");
c = Integer.parseInt(in.readLine());
b = b+50;
b = ((50*c)+b);
}
if (a==4)
{
System.out.println(" ============================= Enter the QUANTITY of JELLY icecream_mix you WOULD HAVE ?  ============================ ");
c = Integer.parseInt(in.readLine());
b = b+70;
b = ((70*c)+b);
}
if (a ==5)
{
System.out.println(" ================================ Enter the QUANTITY of FRUIT icecream_mix you WOULD HAVE ?  ==================================");
c = Integer.parseInt(in.readLine());
b = b+65;
b = ((65*c)+b);
}
if (a==6)
{
System.out.println(" ============================= Enter the QUANTITY of DRY FRUIT icecream_mix you WOULD HAVE ? ============================");
c = Integer.parseInt(in.readLine());
b = b+170;
b = ((170*c)+b);
}
if (a ==7)
{
System.out.println(" ================================ Enter the QUANTITY of CREAM'N'CARAMEL icecream_mix you WOULD HAVE ? =============================");
c = Integer.parseInt(in.readLine());
b = b+150;
b = ((150*c)+b);
}
if (a==8)
{
System.out.println(" =============================== Enter the QUANTITY of ULTRA icecream_mix you WOULD HAVE ? ================================");
c = Integer.parseInt(in.readLine());
b = b+275;
b = ((275*c)+b);
}
if (a ==9)
{
System.out.println(" ============================== Enter the QUANTITY of YUMMY SPECIAL icecream_mix you WOULD HAVE ? ==============================");
c = Integer.parseInt(in.readLine());
b = b+360;
b = ((360*c)+b);
}
if (a==10)
{
System.out.println(" ================================== Enter the QUANTITY of ROYAL icecream_mix you WOULD HAVE ? ================================");
c = Integer.parseInt(in.readLine());
b = b+480;
b = ((480*c)+b);
}
System.out.println();
System.out.println();
System.out.println("  ====================================== Do you want to order anything more FROM ICECREAM MIX? =================================== ");
str = in.readLine();
}
return(b);
}
}

