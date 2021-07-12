package test;

import org.junit.Before;
import org.junit.Test;

import ArrayFlattener.ArrayFlattener;
import static org.junit.Assert.*;

import java.util.Arrays;

public class ArrayFlattenerTest {
	
	private int [][] array = {{1,3},{0},{4,5,9}};;
	private ArrayFlattener arrayFlattener;
	
	@Before
    public void setUp() throws Exception {
		arrayFlattener = new ArrayFlattener();
    }
	
	@Test
	public void test_nested_array() {
		Integer[] result = arrayFlattener.flattenArray(array);
		Integer[] expectedResult = {1,3,0,4,5,9};
		  boolean checkArrays = Arrays.equals(expectedResult,result);
		  assertTrue(checkArrays);
	}
	
	@Test
	public void test_nested_array_null() {
		array = null;
		Integer[] result = arrayFlattener.flattenArray(array);
		assertEquals(result,null);
	}

}
