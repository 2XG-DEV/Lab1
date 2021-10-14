package aufgabe1;

public class Aufgabe3 {
	
	public static int[] summeZahlenArray(int[] zahl1,int[] zahl2) {
		
		int[] result = new int[zahl1.length+1];
		for(int i = zahl1.length ; i >= 0;i--) {
			result[i] = (zahl1[i]+zahl2[i])%10;
			result[i-1]= (zahl1[i]+zahl2[i])/10;
		}
		if(result[0]==0) {
			int[] newRes = new int[result.length-1];
			for(int i = 1; i < result.length;i++) {
				newRes[i-1] = result[i];
			}
			return newRes;
		}
		
		return result;
	}
	
	public static int[] differenzZahlenArray(int[] zahl1,int[] zahl2) {
		
		int[] result = new int[zahl1.length];
		for(int i = zahl1.length ; i >= 1;i--) {
			if(zahl1[i]-zahl2[i] < 0) {
				zahl1[i+1]--;
				result[i] = 10-zahl2[i]+zahl1[i];
			}else {
				result[i] = zahl1[i]-zahl2[i];
			}
		}
		if(result[0]==0) {
			int[] newRes = new int[result.length-1];
			for(int i = 1; i < result.length;i++) {
				newRes[i-1] = result[i];
			}
			return newRes;
		}
		
		return result;
	}
	
public static int[] multiplicationZahlenArray(int[] zahl1,int zahl2) {
		
		int[] result = new int[zahl1.length];
		
		for(int i = 0 ; i < zahl2;i++) {
			result = summeZahlenArray(result,zahl1);
		}
		
		
		return result;
	}

public static int[] divisionZahlenArray(int[] zahl1,int zahl2) {
	
	int[] result = new int[zahl1.length];
	
	
	
	return result;
}


	
	
}
