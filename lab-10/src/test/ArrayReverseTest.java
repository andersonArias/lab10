package test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import ArrayFlattener.reverse.ArrayReversor;
import ArrayFlattener.reverse.service.ArrayFlattenerService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayReverseTest {
	
	private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);
    private ArrayReversor arrayReversor;

    @Before
    public void setUp() throws Exception {
        this.arrayReversor = new ArrayReversor(arrayFlattenerService);
    }
    
    @Test
    public void test_reversed_array() {
    	int[][] arrayTwoDimension = new int[][]{{1,3}, {0}, {4,5,9}};
    	Mockito.when(arrayFlattenerService.flattenArray(arrayTwoDimension)).thenReturn(new int[]{1,3,0,4,5,9});
    	Integer[] result = arrayReversor.arrayFlattenerReverse(arrayTwoDimension);
    	Integer[] resultExpected = {9,5,4,0,3,1};
    	assertArrayEquals(resultExpected,result);
    }
    
    @Test
    public void test_null_value() {
    	int[][] arrayTwoDimension = null;
    	Mockito.when(arrayFlattenerService.flattenArray(arrayTwoDimension)).thenReturn(null);
    	Integer[] result = arrayReversor.arrayFlattenerReverse(arrayTwoDimension);
    	Integer[] resultExpected = null;
    	assertArrayEquals(resultExpected,result);
    }

}
