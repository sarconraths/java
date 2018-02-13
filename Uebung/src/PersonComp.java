import java.util.Comparator;

public class PersonComp implements Comparator <Person>{

	@Override
	public int compare(Person arg0, Person arg1) {
		return new Integer(arg0.getAlter()).compareTo(arg1.getAlter()) *-1;
	}
}
