package main;
import aufgabe1.*;


public class Main {
	
	public static void printArray(int [] toPrint) {
		for(int i = 0 ; i < toPrint.length;i++) {
			System.out.print(toPrint[i] + " ");
		}
	System.out.println(" ");
	}

	public static void main(String[] args) {
		int[] noten = {25,50,66,29,19,20,55,44,98,76,90,32,75};
		int[] array1 = {10,24,27,18,19,28,40};
		int[] zahl1 = {1,8,3,6,7,8,9,2,2};
		int[] zahl2 = {2,6,7,8,3,5,7,9,2};
		int zahl3 = 2;
		int[] tastaturPreise = {10,15,30,60,90,22,11,14};
		int[] USBPreise = {14,28,11,15,18,19,30,40};
		int budget = 60;
		
		System.out.println(Aufgabe1.getDurchSchnitt(noten));
		System.out.println(Aufgabe1.getMxNote(noten));
		printArray(Aufgabe1.getNichtAusreichendeNoten(noten));
		
		printArray(Aufgabe1.getRundeteNoten(noten));
		
		System.out.println(Aufgabe2.getMax(array1));
		System.out.println(Aufgabe2.getMin(array1));
		System.out.println(Aufgabe2.getMaxSumN(array1));
		System.out.println(Aufgabe2.getMinSumN(array1));
		
		printArray(Aufgabe3.getDifferenzZahlenArray(zahl1, zahl2));
		printArray(Aufgabe3.getSummeZahlenArray(zahl1, zahl2));
		printArray(Aufgabe3.getMultiplicationZahlenArray(zahl1, zahl3));
		System.out.println(Aufgabe3.divisionZahlenArray(zahl1, zahl3));
		
		System.out.println(Aufgabe4.findMaxGeldBetrag(tastaturPreise, USBPreise, budget));
		System.out.println(Aufgabe4.findTeursteUSBinBudget(tastaturPreise, budget));
		System.out.println(Aufgabe4.getBiligsteTastatur(tastaturPreise));
		System.out.println(Aufgabe4.getTeuersteGegenstand(tastaturPreise, USBPreise));
	}

}
