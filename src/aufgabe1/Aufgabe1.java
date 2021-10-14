package aufgabe1;

public  class Aufgabe1 {
	
	
	// Ubung 1
	public static int[] nichtAusreichendeNoten(int[] noten) {
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
	public static int durchSchnitt(int[] noten) {
		int sum = 0;
		for(int i = 0 ; i < noten.length;i++) {
				sum += noten[i];
		}
		return sum/noten.length;
	}
	
	//Ubung 3
	public static int[] runden(int[] noten) {
		
		int[] rund = new int[noten.length];
		for(int i = 0 ; i < noten.length;i++) {
			if(noten[i] % 5 < 3 && noten[i] >= 38) {
				rund[i] = noten[i] + (5 - noten[i] % 5);
			}
			
		}
		return rund;
	}
	
	//Ubung 4
	public static int maxNote(int[] noten) {
		int[] rund_noten = runden(noten);
		int max = 0;
		for(int i = 0 ; i < rund_noten.length;i++) {
			if(rund_noten[i] > max) {
				max = rund_noten[i];
			}
		}
		return max;
	}
	
	
	
	
	
}
