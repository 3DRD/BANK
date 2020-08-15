import java.io.*;
public class icecream
{
public int icecream()throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int a,b =0;int c;
String str;
System.out.println();
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println(" ================================================ DO YOU WANT TO ORDER FROM ICE CREAM ? =================================================");
System.out.println(" ============================================================ Enter yes or no =================================================================");
System.out.println();
str = in.readLine();
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
while (str.equalsIgnoreCase("yes")==true)
{
System.out.println();
System.out.println();
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println("=====================ALPHONSO ICE CREAM====Rs 45<============ (Code - 1 )= |");
System.out.println("=====================STRAWBERRY ICE CREAM====Rs 45<============ (Code - 2 )= |");
System.out.println("=====================MALAI ICE CREAM====Rs 45<============ (Code - 3 )= |");
System.out.println("=====================BLUEBERRY ICE CREAM====Rs 45<============ (Code - 4 )= |");
System.out.println("=====================BLACKBERRY ICE CREAM====Rs 45<============ (Code - 5 )= |");
System.out.println("=====================BUTTER SCOTCH ICE CREAM====Rs 45<============ (Code - 6 )= |");
System.out.println("=====================VANILLA ICE CREAM====Rs 45<============ (Code - 7 )= |");
System.out.println("=====================ROSE ICE CREAM====Rs 45<============ (Code - 8 )= |");
System.out.println("=====================CHOCOLATE ICE CREAM====Rs 45<============ (Code - 9 )= |");
System.out.println("=====================KESAR PISTA ICE CREAM====Rs 45<============ (Code - 10)= |");
System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println();
System.out.println();
System.out.println(" ============================================== Enter the CODE of the thing you would like to have =============================================");
System.out.println();
a = Integer.parseInt(in.readLine());
if (a ==1)
{
System.out.println(" ========================================= Enter the QUANTITY ALPHONSO ICECREAM WOULD YOU HAVE ? =======================================");
c = Integer.parseInt(in.readLine());
b = b+45;
b = ((45*c)+b);
}
if (a==2)
{
System.out.println(" =================================== Enter the QUANTITY STRAWBERRY ICECREAM WOULD YOU HAVE ?======================================");
c = Integer.parseInt(in.readLine());
b = b+45;
b = ((45*c)+b);
}
if (a ==3)
{
System.out.println(" =================================== Enter the QUANTITY MALAI ICECREAM WOULD YOU HAVE ?===========================================");
c = Integer.parseInt(in.readLine());
b = b+45;
b = ((45*c)+b);
}
if (a==4)
{
System.out.println(" =============================== Enter the QUANTITY BLUEBERRY ICECREAM WOULD YOU HAVE ?=================================== ");
c = Integer.parseInt(in.readLine());
b = b+45;
b = ((45*c)+b);
}
if (a ==5)
{
System.out.println(" ======================================== Enter the QUANTITY BLACKBERRY ICECREAM WOULD YOU HAVE ?=========================================");
c = Integer.parseInt(in.readLine());
b = b+45;
b = ((45*c)+b);
}
if (a==6)
{
System.out.println(" ================================= Enter the QUANTITY BUTTERSCOTCH ICECREAM WOULD YOU HAVE ? =======================================");
c = Integer.parseInt(in.readLine());
b = b+45;
b = ((45*c)+b);
}
if (a ==7)
{
System.out.println(" ================================== Enter the QUANTITY VANILLA ICECREAM WOULD YOU HAVE ?==========================================");
c = Integer.parseInt(in.readLine());
b = b+45;
b = ((45*c)+b);
}
if (a==8)
{
System.out.println(" =================================== Enter the QUANTITY ROSE ICECREAM WOULD YOU HAVE ? ==========================================");
c = Integer.parseInt(in.readLine());
b = b+45;
b = ((45*c)+b);
}
if (a ==9)
{
System.out.println(" =================================== Enter the QUANTITY CHOCOLATE ICECREAM WOULD YOU HAVE ?=======================================");
c = Integer.parseInt(in.readLine());
b = b+45;
b = ((45*c)+b);
}
if (a==10)
{
System.out.println(" ======================================= Enter the QUANTITY KESAR PISTA =========================================");
c = Integer.parseInt(in.readLine());
b = b+45;
b = ((45*c)+b);
}
System.out.println();
System.out.println();
System.out.println("  ============================================= DO YOU WANT TO ORDER MORE FROM ICE-CREAM ? ========================================== ");
str = in.readLine();
}
return(b);
}
}

