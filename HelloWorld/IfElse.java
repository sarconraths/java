
public class IfElse {
	public static void main(String[] args){
		int temperatur; 
		temperatur = 1; 
		
		if (temperatur < 7){
			System.out.println("Ja bitte");
		}
		
		else if (temperatur == 7) {
			System.out.println("puhh ne nich wirklich");
		}
		
		else {
			System.out.println("igitt.");
		}
		
		
		switch(temperatur){
		case 0: System.out.println("eiskalt"); break;
		case 1: System.out.println("sehr kalt"); break;
		default: System.out.println("yo"); break;
		}
	}
}
