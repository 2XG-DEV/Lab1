package aufgabe1;

public  class Aufgabe1 {
	
	
	// Ubung 1
	/**
	 * findet die nicht ausreichende noten in den gegebenen array
	 * @param noten
	 * @return int array mit die nicht ausreichende noten
	 */
	public static int[] getNichtAusreichendeNoten(int[] noten) {
		int[] nichtAusreichend = new int[noten.length];
		int current = 0;
		for(int i = 0 ; i < noten.length;i++) {
			if(noten[i] < 38) {
				nichtAusreichend[current] = noten[i];
				current++;
			}
		}
		int[] result = new int[current+1];
		for(int i = 0 ; i < current+1;i++) {
			result[i] = nichtAusreichend[i];
		}
		return result;
	}
	
	
	//Ubung 2
	/**
	 * berechnet die durchSchnitt note
	 * @param noten
	 * @return ein int mit die durschnit noten
	 */
	public static int getDurchSchnitt(int[] noten) {
		int sum = 0;
		for(int i = 0 ; i < noten.length;i++) {
				sum += noten[i];
		}
		return sum/noten.length;
	}
	
	//Ubung 3
	/**
	 * rundet die noten
	 * @param noten
	 * @return int array mit die rundete noten
	 */
	public static int[] getRundeteNoten(int[] noten) {
		
		int[] rund = new int[noten.length];
		for(int i = 0 ; i < noten.length;i++) {
			if(noten[i] % 5 < 3 && noten[i] >= 38) {
				rund[i] = noten[i] + (5 - noten[i] % 5);
			}
			
		}
		return rund;
	}
	
	//Ubung 4
	/**
	 * gibt die grosste note
	 * @param noten
	 * @return int mit die grosste note
	 */
	public static int getMxNote(int[] noten) {
		int[] rundNoten = getRundeteNoten(noten);
		int max = 0;
		for(int i = 0 ; i < rundNoten.length;i++) {
			if(rundNoten[i] > max) {
				max = rundNoten[i];
			}
		}
		return max;
	}
	
	
	
	
	
}
