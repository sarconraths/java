
public class PlaygroundTwo {
	public static void main(String[] args){
		System.out.println(theEnd("xba"));		
	}	
	
	
	public static boolean theEnd(String str){
		if(str.length()<3){
			return false;
		}
		
		if((str.substring(0,3).equals("bad")) || (str.substring(1,3).equals("bad"))){
			return true;
		}
		return false; 
	}
}
