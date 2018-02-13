import java.util.Arrays;
import java.util.*;


public class test {
	public static void main(String args[]){
	
		Scanner point = new Scanner(System.in);
		int points = point.nextInt(); 
		point.close();
		
		if( points >= 7 && points <= 10){
			System.out.println("Der Test ist bestanden!");
		}else if(points >= 0 && points <= 7){
			System.out.println("Der Test ist leider nicht bestanden!");
		}else{
			System.out.println("FEHLER: Ungueltige Punktzahl");
		}
		
	}
}
