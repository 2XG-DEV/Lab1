package aufgabe1;

public  class Aufgabe4 {

	/**
	 * findet die biligste tastatur von ein array mit preise
	 * @param preise
	 * @return int mit die biligste preis
	 */
	public static int getBiligsteTastatur(int[] preise) {
		int min = preise[0];
		for(int i = 1 ; i < preise.length;i++) {
			if(preise[i] <  min) {
				min = preise[i];
			}
		}
		return min;
	}
	
	/**
	 * findet die teurste gegenstand von ein array mit preise
	 * @param tastaturPreise
	 * @param USBPreise
	 * @return die teurste gegenstand
	 */
	public static int getTeuersteGegenstand(int[] tastaturPreise,int[] USBPreise) {
		int maxPreis = tastaturPreise[0];
		for(int i = 1 ; i < tastaturPreise.length;i++) {
			if(tastaturPreise[i] >  maxPreis) {
				maxPreis = tastaturPreise[i];
			}
		}
		for(int i = 1 ; i < USBPreise.length;i++) {
			if(USBPreise[i] >  maxPreis) {
				maxPreis = USBPreise[i];
			}
		}
		return maxPreis;
	}
	
	/**
	 * findet die teurste USB von ein array mit preise die sich in ein budget befindet
	 * @param USBPreise
	 * @param budget
	 * @return int mit die teurste USB
	 */
	public static int findTeursteUSBinBudget(int[] USBPreise,int budget) {
		int max = USBPreise[0];
		for(int i = 1 ; i < USBPreise.length;i++) {
			if(USBPreise[i] >  max && USBPreise[i] <= budget) {
				max = USBPreise[i];
			}
		}
		return max;
	}
	/**
	 * findet die beste kombination von USB und tastatur die noch in budget ist
	 * @param tastaturen
	 * @param USB
	 * @param budget
	 * @return int mit die beste Geldbetrag
	 */
	public static int findMaxGeldBetrag(int[] tastaturen , int[] USB,int budget) {
		int best = -1;
		for(int i = 0 ; i < tastaturen.length;i++) {
			for(int j = 0 ; j < USB.length;j++) {
				int total = tastaturen[i] + USB[j];
				if(total < budget && total > best) {
					best = total;
				}
			}
		}
		return best;
	}
}
