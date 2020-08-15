import java.io.*;
public class icecreamsundae
{
public int icecreamsundae()throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int a,b =0;int c;
String str;
System.out.println();
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println(" ============================================ DO YOU WANT TO ORDER FROM ICE CREAM SUNDAE ?===============================================");
System.out.println("  ========================================================== Enter yes or no ==================================================================");
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println();
str = in.readLine();
while (str.equalsIgnoreCase("yes")==true)
{
System.out.println();
System.out.println();
System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println("================MANGO ICE CREAM SUNDAE========Rs 100<============ (Code - 1 )= |");
System.out.println("================STRAWBERRY ICE CREAM SUNDAE========Rs 100<============ (Code - 2 )= |");
System.out.println("================CHOCOLATE ICE CREAM SUNDAE========Rs 100<============ (Code - 3 )= |");
System.out.println("================VANILLA ICE CREAM SUNDAE========Rs 100============ (Code - 4 )= |");
System.out.println("================ARCTIC ICE CREAM SUNDAE========Rs 150<============ (Code - 5 )= |");
System.out.println("================MOONSTONE ICE CREAM SUNDAE========Rs 200<============(Code - 6 )= |");
System.out.println("================KIDS ICE CREAM SUNDAE========Rs 100<============(Code - 7 )= |");
System.out.println("================COLA ICE CREAM SUNDAE========Rs 200<============ (Code - 8 )= |");
System.out.println("================BLACK BEAUTY ICE CREAM SUNDAE========Rs 250<============ (Code - 9 )= |");
System.out.println("================ROYAL CREAM ICE CREAM SUNDAE========Rs 300<============ (Code - 10)= |");
System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println();
System.out.println();
System.out.println(" ========================================== Enter the CODE of the thing you would like to have ================================================");
System.out.println();
a = Integer.parseInt(in.readLine());
if (a ==1)
{
System.out.println(" ================================ Enter the QUANTITY OF MANGO ICE CREAM SUNDAE YOU WOULD HAVE ? =====================================");
c = Integer.parseInt(in.readLine());
b = b+100;
b = ((100*c)+b);
}
if (a==2)
{
System.out.println(" ============================ Enter the QUANTITY OF STRAWBERRY  ICE CREAM SUNDAE YOU WOULD HAVE ? ====================================");
c = Integer.parseInt(in.readLine());
b = b+100;
b = ((100*c)+b);
}
if (a ==3)
{
System.out.println(" ================================= Enter the QUANTITY OF CHOCOLATE  ICE CREAM SUNDAE YOU WOULD HAVE ? =======================================");
c = Integer.parseInt(in.readLine());
b = b+100;
b = ((100*c)+b);
}
if (a==4)
{
System.out.println(" ============================= Enter the QUANTITY OF VANILLA  ICE CREAM SUNDAE YOU WOULD HAVE ? =================================== ");
c = Integer.parseInt(in.readLine());
b = b+100;
b = ((100*c)+b);
}
if (a ==5)
{
System.out.println(" ================================== Enter the QUANTITY OF ARCTIC ICE ICE CREAM SUNDAE YOU WOULD HAVE ? ======================================");
c = Integer.parseInt(in.readLine());
b = b+150;
b = ((150*c)+b);
}
if (a==6)
{
System.out.println(" ============================= Enter the QUANTITY OF  MOONSTONE ICE CREAM SUNDAE YOU WOULD HAVE ? =================================");
c = Integer.parseInt(in.readLine());
b = b+200;
b = ((200*c)+b);
}
if (a ==7)
{
System.out.println(" ================================ Enter the QUANTITY OF  KIDS ICE CREAM SUNDAE YOU WOULD HAVE ? ==================================");
c = Integer.parseInt(in.readLine());
b = b+100;
b = ((100*c)+b);
}
if (a==8)
{
System.out.println(" ================================ Enter the QUANTITY OF  COLA ICE CREAM SUNDAE YOU WOULD HAVE ? ===================================");
c = Integer.parseInt(in.readLine());
b = b+200;
b = ((200*c)+b);
}
if (a ==9)
{
System.out.println(" =============================== Enter the QUANTITY OF BLACK BEAUTY  ICE CREAM SUNDAE YOU WOULD HAVE ? =================================");
c = Integer.parseInt(in.readLine());
b = b+250;
b = ((250*c)+b);
}
if (a==10)
{
System.out.println(" =================================== Enter the QUANTITY OF  ROYAL CREAM ICE CREAM SUNDAE YOU WOULD HAVE ? ===================================");
c = Integer.parseInt(in.readLine());
b = b+300;
b = ((300*c)+b);
}
System.out.println();
System.out.println();
System.out.println("  ======================================= DO YOU WANT TO ORDER MORE FROM ICE-CREAM SUNDAE ? ====================================== ");
str = in.readLine();
}
return(b);
}
}

