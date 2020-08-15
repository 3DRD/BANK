import java.io.*;
public class order
{
public int order()throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int a;
System.out.println();
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println("=============================Ice-Cream ============================ (Code - 001)= |");
System.out.println("=============================Ice-Cream_mix====================== (Code - 002)= |");
System.out.println("=============================Ice-Cream Sundae =================== (Code - 003)= |");
System.out.println("=============================Milk Shake============================= (Code - 004)= |");
System.out.println("=============================Falooda =============================== (Code - 005)= |");
System.out.println("=============================Cake and pastries ======================== (Code - 006)= |");
System.out.println("=============================Juices ======================== (Code - 007)= |");
System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------|");
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println();
System.out.println(" ========================================== Enter the CODE of the thing you would like to have ================================================");
System.out.println();
a = Integer.parseInt(in.readLine());
return(a);
}
}

