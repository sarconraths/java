
public class Converting {

	public static void main(String[] args){
		String number = "10";
		
		//String to Integer
		//Method 1
		int n = Integer.parseInt(number);
		System.out.println(n);
		
		//Method 2
		Integer numberInteger = Integer.valueOf(number);
		System.out.println(numberInteger);
		
		
		
		//Integer to String
		
		
		// Method 1
		int valueTwo = 5; 
		String strTwo = Integer.toString(valueTwo);
		System.out.println(strTwo);
		
		
		//Method 2
		int value = 5; 
		
		String str = String.valueOf(value);
		System.out.println(str);		
	}
}
