package aufgabe1;

public class Aufgabe2 {
	
	public static int max(int[] zahlen) {
		int max = 0;
		for(int i = 0 ; i < zahlen.length;i++) {
			if(zahlen[i]>max) {
				max = zahlen[i];
			}
		}
		return max;
	}
	
	public static int min(int[] zahlen) {
		int min = zahlen[0];
		for(int i = 1 ; i < zahlen.length;i++) {
			if(zahlen[i]<min) {
				min = zahlen[i];
			}
		}
		return min;
	}
	
	public static int maxSumN(int[] zahlen) {
		int sum = 0;
		for(int i = 0 ; i < zahlen.length;i++) {
			sum += zahlen[i];
		}
		return sum - min(zahlen);
	}
	
	public static int minSumN(int[] zahlen) {
		int sum = 0;
		for(int i = 0 ; i < zahlen.length;i++) {
			sum += zahlen[i];
		}
		return sum - max(zahlen);
	}

}
