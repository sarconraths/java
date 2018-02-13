import java.util.Scanner;

public class loesung {
	public static void main(String[] args){
		String i; 
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bis wohin sollen wir zählen?");
		i = s.next();
		
		for(int j = 1; j<=10; j++){
			System.out.println(i);
		}
	}
}
