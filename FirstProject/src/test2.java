import java.util.Arrays;
import java.util.*;

public class test2 {
	public static void main(String args[]){
		Scanner points = new Scanner(System.in); 
		int score = points.nextInt(); 
		points.close(); 
		
		String erg; 
		
		switch(score){
		case 10:
			erg = "Sehr gut";
			break;
		case 9:
			erg = "Gut";
			break;
		case 8:
			erg = "Befriedigend";
			break;
		case 7:
			erg = "Ausreichend";
			break;
		default: 
			erg = "Leider nicht genuegend Punkte erreicht";
			break;
		}
		
		System.out.println("Ergebnis: " + erg);
		
	}
}
