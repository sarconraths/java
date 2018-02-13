public class ParrotTrouble {
	public static void main(String[] args){
		int time = 2;
		boolean talking = true;
		
		if(talking && (time < 7 || time > 20)){
			System.out.println("trouble");
		}
	}
}