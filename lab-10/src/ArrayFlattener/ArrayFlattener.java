package ArrayFlattener;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {
	
	public Integer[] flattenArray(int[][] array) {
		if (array == null) {
			return null;
		}
		List<Integer> arrayList = new ArrayList<Integer>();
		for(int[] nestedArray : array) {
			for(int position : nestedArray) {
				arrayList.add(position);
			}
		}
		return (Integer[])arrayList.toArray(new Integer[arrayList.size()]);
	}

}
