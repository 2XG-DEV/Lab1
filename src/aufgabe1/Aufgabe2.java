package aufgabe1;

public class Aufgabe2 {
	
	
	/**
	 * findet die grosste zahl in ein array
	 * @param zahlen
	 * @return int mit die grosste zahl
	 */
	public static int getMax(int[] zahlen) {
		int max = 0;
		for(int i = 0 ; i < zahlen.length;i++) {
			if(zahlen[i]>max) {
				max = zahlen[i];
			}
		}
		return max;
	}
	/**
	 * findet die kleinste zahl in die Array
	 * @param zahlen
	 * @return int mit die kleinste zahl
	 */
	public static int getMin(int[] zahlen) {
		int min = zahlen[0];
		for(int i = 1 ; i < zahlen.length;i++) {
			if(zahlen[i]<min) {
				min = zahlen[i];
			}
		}
		return min;
	}
	/**
	 * findet die grosste sume von n-1 zahlen in ein array bei die Entfernung der kleinste zahl
	 * @param zahlen
	 * @return int mit die grosste summe der n-1 zahlen
	 */
	public static int getMaxSumN(int[] zahlen) {
		int sum = 0;
		for(int i = 0 ; i < zahlen.length;i++) {
			sum += zahlen[i];
		}
		return sum - getMin(zahlen);
	}
	/**
	 * findet die kleinste summe von n-1 zahlen in ein array bei die entfernung der grosste zahl
	 * @param zahlen
	 * @return int mit die kleinste summe der n-1 zahlen
	 */
	public static int getMinSumN(int[] zahlen) {
		int sum = 0;
		for(int i = 0 ; i < zahlen.length;i++) {
			sum += zahlen[i];
		}
		return sum - getMax(zahlen);
	}

}
