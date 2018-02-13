import java.util.Scanner;

public class ScannerAge {
	public static void main(String[] args){
		int i; 
		Scanner s = new Scanner(System.in); 
		
		System.out.println("How old are you?");
		i = s.nextInt(); 
		
		if(i>=18){
			System.out.println("You are old enough");
		}else{
			System.out.println("You are not old enough");
		}
	}
}
