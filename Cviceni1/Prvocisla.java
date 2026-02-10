import java.util.Scanner; 
public class Prvocisla { 
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in); 
System.out.println("Zadejte cislo k testovani: "); 
if (!sc.hasNextInt()) { 
System.out.println("Nezadali jste cele cislo"); 
return; 
} 
int cislo=sc.nextInt(); 
// Zde piste vlastni kod 
boolean prvocislo = cislo >1;
 {
	for (int i = 2; i<=cislo; i++) {
		if (cislo % i ==0 ){
			prvocislo = false;
			break;
		}
	}
}
if (prvocislo)
	System.out.println("vaše číslo "+ cislo +" je prvočíslo");
else
	System.out.println("Vaše číslo " + cislo + " není prvočíslo");
	

	sc.close();

} 
}