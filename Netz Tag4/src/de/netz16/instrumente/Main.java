package de.netz16.instrumente;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// Beim Kompilieren entsteht eine neue anonyme Klasse Main$n, die die Klasse Gitarre erweitert
		Gitarre g = new Gitarre() {
			
			@Override
			public void tune() {
				// TODO Auto-generated method stub
				
			}
		}; 
		
		// Beim Kompilieren entsteht eine neue anonyme Klasse Main$n, die das Interface ITunable implementiert		
		Posaune p = new Posaune() {
			
			@Override 
			public void ton(){
				System.out.println("hallo");
			}
		}; 
		
		HashSet<Gitarre> hs = new HashSet<Gitarre>(); 
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Heﬂ");
		names.add("Conraths");
		names.add("Schatz");
		names.add("Kepper");
		
		for(String s : names) {
			System.out.println(s);
			
			
			
		names.sort(String::compareToIgnoreCase);
		
		Collections.sort(names, String.CASE_INSENSITIVE_ORDER);	
		}
	}
}
