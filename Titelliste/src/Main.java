import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		ArrayList<Songs> people = new ArrayList<Songs>();

		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\schs\\Documents\\Ausbildung\\IBA\\Jahr 1\\Programmierkurs Java\\Uebung_eins\\titeltest.txt"));
			String s;
			while ((s = br.readLine()) != null) {
				String[] arr = s.split("\\;");
				int id = Integer.parseInt(arr[0]);
				int age = Integer.parseInt(arr[2]);
				if (arr.length >= 3) {
					people.add(new Songs(id, arr[1], age));
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(Songs p : people) {
			System.out.println(p);
		}
	}
}
