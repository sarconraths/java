import java.util.*; 


public class Demo {
	public static void main(String[] args) {
		int b = scan(); 
		int finalResult = summation(b); 		
		System.out.print(finalResult);
	}
	
	public static int scan(){
		Scanner a = new Scanner(System.in); 
		int b = a.nextInt(); 
		a.close();		
		return b;
	}
	
	public static int summation(int n) {
		int result = (n * (n + 1)) / 2; 		
		return result; 
	}			
}
