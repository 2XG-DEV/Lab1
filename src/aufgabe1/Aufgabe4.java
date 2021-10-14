package aufgabe1;

public  class Aufgabe4 {

	int biligsteTastatur(int[] preise) {
		int min = preise[0];
		for(int i = 1 ; i < preise.length;i++) {
			if(preise[i] <  min) {
				min = preise[i];
			}
		}
		return min;
	}
	
	int teuersteGegenstand(int[] tastaturPreise,int[] USBPreise) {
		int min = tastaturPreise[0];
		for(int i = 1 ; i < tastaturPreise.length;i++) {
			if(tastaturPreise[i] >  min) {
				min = tastaturPreise[i];
			}
		}
		for(int i = 1 ; i < USBPreise.length;i++) {
			if(USBPreise[i] >  min) {
				min = USBPreise[i];
			}
		}
		return min;
	}
	
	int teursteUSBinBudget(int[] USBPreise,int budget) {
		int min = USBPreise[0];
		for(int i = 1 ; i < USBPreise.length;i++) {
			if(USBPreise[i] >  min && USBPreise[i] <= budget) {
				min = USBPreise[i];
			}
		}
		return min;
	}
	
	int maxGeldBetrag(int[] tastaturen , int[] USB,int b) {
		int best = -1;
		for(int i = 0 ; i < tastaturen.length;i++) {
			for(int j = 0 ; j < USB.length;j++) {
				int total = tastaturen[i] + USB[i];
				if(total < b && total > best) {
					best = total;
				}
			}
		}
		return best;
	}
}
