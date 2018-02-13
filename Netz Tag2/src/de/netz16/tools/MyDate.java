package de.netz16.tools;


public class MyDate {

		public static int greg2jul(int t, int m, int j) {

			int mtage[] = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
			if(isLeap(j)){
				mtage[1]++;
			}
			
			int retval = t; 
			
			for(int i = 0; i < m-1; i++) {
				retval += mtage[i];
			}
			
			
			return retval; 
		}
		
		
		public static boolean isLeap(int j){
			boolean retval; 
			if(j%4==0 && j%100!=0 || j%400==0 && j%3600!=0){
				retval = true;
			}else{
				retval = false; 
			}
			
			return retval;
		}
		
}
