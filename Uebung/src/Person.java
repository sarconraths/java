public class Person implements Comparable<Person> {
	
	public String Vorname; 
	public String Nachname; 
	public int Alter;
	
	public Person (){
	}

	public Person (String nn, String vn, int alter){
		setNachname(nn);
		setVorname(vn);
		setAlter(alter);
	}
	
	
	public String getVorname() {
		return Vorname;
	}
	public void setVorname(String vorname) {
		Vorname = vorname;
	}
	public String getNachname() {
		return Nachname;
	}
	public void setNachname(String nachname) {
		Nachname = nachname;
	}
	public int getAlter() {
		return Alter;
	}
	public void setAlter(int alter) {
		Alter = alter;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Vorname + " " + this.Nachname + ", " + this.Alter;
	}


	
}
