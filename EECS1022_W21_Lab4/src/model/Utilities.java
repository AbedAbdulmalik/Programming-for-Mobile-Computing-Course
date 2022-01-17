package model;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *  
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getMultiplesOf3(int[] numbers) {
		int[] result = null;
		int i2 = 0;
		int mo3s = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 0) {
				mo3s = mo3s + 1;
			}
		}
		
		int[] mo3 = new int[mo3s];
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 0) {
				mo3[i2]=numbers[i];
				i2++;
			}
		}
		result = mo3;
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		
		/* Your implementation ends here. */
		
		return result;
	}	
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 	- `n`		: an integer (which may or may not exist in `numbers`)
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getFilteredSeq(int[] numbers, int n) {
		int[] result = null;
		int arrsize = 0;
		int i2 = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != n) {
				arrsize = arrsize + 1;
			}
		}
		
		int[] filteredarr = new int[arrsize];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != n) {
				filteredarr[i2]=numbers[i];
				i2++;
			}
		}
		result = filteredarr;
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 
	 * Assumptions:
	 * 	- numbers.length >= 1
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String[] getAllPrefixes(int[] numbers) {
		String[] result = null;
		String[] arr = new String[numbers.length];
		
		
		for (int i = 0; i < numbers.length; i++) {
			arr[i] =  "[";
			for (int i2 = 0; i2 <= i; i2++) {
				if(i2 == i) {
				arr[i] += numbers[i2] + "";
				}
				else {
					arr[i] += numbers[i2] + ", ";
				}
			}
			arr[i] = arr[i] + "]";
		}
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		result = arr;
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getGroupedNumbers(int[] numbers) {
		int[] result = null;
		int[] arr = new int[numbers.length];
		int i2 = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			while (i < numbers.length) {
				if(numbers[i] % 3 == 0) {
					arr[i2] = numbers[i];
					i2++;
				}
			i++;
			}
		i = 0;
			while (i < numbers.length) {
				if(numbers[i] % 3 == 1) {
					arr[i2] = numbers[i];
					i2++;
				}
			i++;
			}
		i = 0;
			while (i < numbers.length) {
				if(numbers[i] % 3 == 2) {
					arr[i2] = numbers[i];
					i2++;
				}
			i++;
			}
		}
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		result = arr;
		
		
		/* Your implementation ends here. */
		
		return result;
	}
}
