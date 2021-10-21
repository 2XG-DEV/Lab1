package aufgabe1;

public class Aufgabe3 {
	
	/**
	 * gibt ein array die representiert ein zahl wer ist die summe zweier anderen zahlen die als array representiert sind
	 * @param zahl1
	 * @param zahl2
	 * @return ein array die representiert ein zahl
	 */
	public static int[] getSummeZahlenArray(int[] zahl1,int[] zahl2) {
		
		int[] result = new int[zahl1.length+1];
		for(int i = zahl1.length-1 ; i >= 1;i--) {
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
	/**
	 * gibt ein array die representiert ein zahl wer ist die differenz zweier anderen zahlen die als array representiert sind
	 * @param zahl1
	 * @param zahl2
	 * @return ein array die representiert ein zahl
	 */
	public static int[] getDifferenzZahlenArray(int[] zahl1,int[] zahl2) {
		
		int[] result = new int[zahl1.length];
		for(int i = zahl1.length-1 ; i >= 1;i--) {
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
	
	/**
	 * gibt ein array die representiert ein zahl wer ist die multiplikation zweier anderen zahlen die eine als array representiert ist und die andere ist ein zahl
	 * @param zahl1
	 * @param zahl2
	 * @return ein array die representiert ein zahl
	 */
public static int[] getMultiplicationZahlenArray(int[] zahl1,int zahl2) {
		
		int[] result = new int[zahl1.length];
		for(int i = 0 ; i < zahl2;i++) {
			result = getSummeZahlenArray(result,zahl1);
		}
		return result;
	}

/**
 * gibt ein array die representiert ein zahl wer ist die division zweier anderen zahlen die eine als array representiert ist und die andere ist ein zahl
 * @param zahl1
 * @param zahl2
 * @return ein int mit die resultierende zahl
 */
public static int divisionZahlenArray(int[] zahl1,int zahl2) {
	
	int[] zahl2Array;
	zahl2Array = new int[zahl1.length];
	zahl2Array[zahl2Array.length-1] = zahl2;
	int count = 0;
	while(zahl1[zahl1.length-2] > 0 && zahl1[zahl1.length-1] > zahl2) {
		count++;
		zahl1 = getDifferenzZahlenArray(zahl1,zahl2Array);
	}
	
	return count;
}


	
	
}
