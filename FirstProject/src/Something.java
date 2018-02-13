import java.util.Arrays;
import java.util.*;

public class Something {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Yeses = {"Yes", "yes", "Yup", "Yup", "Ja", "ja"};
		String[] Noes = {"No", "no", "Nope", "nope", "Nay", "nay"};
		System.out.println("Do you like rain?");
		
		Scanner sc = new Scanner(System.in);
		String answ = sc.next(); 
		sc.close(); 
		
			if(Arrays.asList(Noes).contains(answ)){
				System.out.println("You do not like rain");
			}else if(Arrays.asList(Yeses).contains(answ)){ 
				System.out.println("You like rain");
			}else{
				System.out.println("Please answer with yes or no");
			}
	}
}
