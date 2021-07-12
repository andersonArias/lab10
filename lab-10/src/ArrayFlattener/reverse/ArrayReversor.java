package ArrayFlattener.reverse;

import ArrayFlattener.reverse.service.ArrayFlattenerService;

public class ArrayReversor {
	
	 private ArrayFlattenerService arrayFlattenerService;
	 
	 public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
		 this.arrayFlattenerService = arrayFlattenerService;
	 }
	
	public Integer[] arrayFlattenerReverse(int[][] arrayTwoDimension) {
		if (arrayTwoDimension == null) {
			return null;
		}
		int[] array = arrayFlattenerService.flattenArray(arrayTwoDimension);
		Integer[] reverseArray = new Integer[array.length];
		int cont = 0;
		for (int j = array.length - 1; j >= 0; j--) {
			reverseArray[cont] = array[j];
			cont += 1;
		}
		return reverseArray;
	}

}
