package Cheese;
import java.util.Scanner;

public class ScannerCheese {
	public static void main(String[] args){
		String gb = " Say Goodbye to exit.";
		String s; 
		Scanner sc = new Scanner(System.in);		
		System.out.println("Do you like cheese?");
		s = sc.next();
		
		if(s.equals("Yes") || s.equals("yes") || s.equals("Yup")|| s.equals("yup")){
			System.out.println("You are awesome!" +gb);
		}else if(s.equals("No") || s.equals("no") || s.equals("Nope")|| s.equals("nope")){
			System.out.println("You weirdo!" +gb);
		}else{
			System.out.println("How could you??? You broke everything :/" +gb);
		}
				
		String bye;
		Scanner p = new Scanner(System.in);
		bye = p.next(); 
		
		if(bye.equals("Goodbye") || bye.equals("bye")|| bye.equals("goodbye")|| bye.equals("Bye")){
			System.out.println("Bye <3");
		}else{
			System.out.println("Didn't even matter, bye anyway");
		}
		
	}
}
