import java.io.*;
public class juices
{
public int juices()throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int a,b =0;
int c=0;
String str;
System.out.println();
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println(" ============================================== DO YOU WANT FROM JUICES? ==========================================================");
System.out.println("  ======================================================= Enter yes or no =====================================================================");
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
str = in.readLine();
while (str.equalsIgnoreCase("yes")==true)
{
System.out.println();
System.out.println();
System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println("==================MANGO JUICE+++++++++++=====Rs 50 <============= (Code - 1 )=|");
System.out.println("==================STRAWBERRY JUICE++++++++++++====Rs 50 <============= (Code - 2 )=|");
System.out.println("==================WATERMELON JUICE+++++++++++++====Rs 50<============= (Code - 3 )=|");
System.out.println("==================ORANGE JUICE++++++++++++====Rs 50<============= (Code - 4 )=|");
System.out.println("==================APPLE JUICE+++++++++++====Rs 75 <============= (Code - 5 )=|");
System.out.println("==================MIXED FRUIT JUICE+++++++++++===Rs 75<============= (Code - 6 )=|");
System.out.println("==================CARROT BEETROOT JUICE+++++++++++====Rs 75<============= (Code - 7 )=|");
System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println();
System.out.println();
System.out.println(" ========================================= Enter the CODE of the thing you would like to have =================================================");
System.out.println();
a = Integer.parseInt(in.readLine());
if (a ==1)
{
System.out.println("============ENTER THE QUANTITY OF MANGO JUICE ?===========");
c = Integer.parseInt(in.readLine());    
b = b+50;
b = ((50*c)+b);
}
if (a==2)
{
System.out.println("============ENTER THE QUANTITY OF STRAWBERRY JUICE ?===========");    
c = Integer.parseInt(in.readLine());      
b = b+50;
b = ((50*c)+b);
}
if (a ==3)
{
System.out.println("============ENTER THE QUANTITY OF WATERMELON JUICE ?===========");    
c = Integer.parseInt(in.readLine());
b = b+50;
b = ((50*c)+b);
}
if (a==4)
{
System.out.println("============ENTER THE QUANTITY OF ORANGE JUICE ?===========");    
c = Integer.parseInt(in.readLine());       
b = b+50;
b = ((50*c)+b);
}
if (a ==5)
{
System.out.println("============ENTER THE QUANTITY OF APPLE JUICE ?===========");    
c = Integer.parseInt(in.readLine());   
b = b+75;
b = ((75*c)+b);
}
if (a==6)
{
System.out.println("============ENTER THE QUANTITY OF MIXED FRUIT JUICE ?===========");    
c = Integer.parseInt(in.readLine());    
b = b+75;
b = ((75*c)+b);
}
if (a ==7)
{
System.out.println("============ENTER THE QUANTITY OF CARROT BEETROOT JUICE ?===========");
c = Integer.parseInt(in.readLine());    
b = b+75;
b = ((75*c)+b);
}
System.out.println();
System.out.println();
System.out.println("  ======================================= Do you want to order anything more FROM JUICES ? ========================================== ");
str = in.readLine();
}
return(b);
}
}

