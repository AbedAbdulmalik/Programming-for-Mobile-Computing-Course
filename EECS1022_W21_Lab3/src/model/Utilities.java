package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `lower` is the lower bound
	 *  - `upper` is the upper bound
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.   
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getNumbers(int lower, int upper) {
		int difference = (upper - lower) + 1;
		String info = "";
		String report = "";
		String number = "";
		
		
		if (lower < 0 || upper < 0) {
			info = "Error: both bounds must be non-negative";
		}
		
		
		
		else if (lower > upper) {
			info = "Error: lower bound " + lower + " is not less than or equal to upper bound " + upper;
		}
		
		
		
		else if (lower <= upper) {
			if (upper - lower == 0) {
				number = "number";
			}
			else {
				number = "numbers";
			}
			
			for(int i=lower;i<=upper;i++){
				if (i < upper) {
					if (i % 3 == 0) {
						report = report + ("("+i+")" +", ");
					}
					else if ( (i - 1) % 3 == 0) {
						report = report + ("["+i+"]" +", ");
					}
					else if ( (i - 2) % 3 == 0) {
						report = report + ("{"+i+"}" +", ");
					}
				}
				else if (i == upper) {
					if (i % 3 == 0) {
						report = report + ("("+i+")" +"");
					}
					else if ( (i - 1) % 3 == 0) {
						report = report + ("["+i+"]" +"");
					}
					else if ( (i - 2) % 3 == 0) {
						report = report + ("{"+i+"}" +"");
					}
				}
            
			}
			info = difference + " " + number + " between " + lower + " and " + upper + ": <" + report + ">";
		}
		String result = info;
		
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
	 * 	- `ft`, `d`, `n` are the first term, common difference, and size of an arithmetic sequence.
	 * 
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only. 
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getIntermediateStats(int ft, int d, int n) {
		String result = "";
		int sum = 0;
		double avg = 0;
		String avgS = "";
		int currentnum = ft;
		String currentnumR = "";
		String result2 = "";
		int i = 0;
		int i2 = n-1;

		
		if (n > 1) {
			for (; i < i2;) {
				sum = sum + (currentnum + i * d);
				avg = ((double)sum / ( i + 1));
				avgS = String.format("%.2f", avg);
				currentnumR = currentnumR + (currentnum + d * i);
				result2 += "[sum of <" + currentnumR + ">: " + sum + " ; avg of <" + currentnumR + ">: " + avgS + "], ";
				currentnumR += ", ";
				i++;
				
			}
		}
		
//		int currentnum3 = currentnum + currentnum2;
		int currentnum2 = i2 * d;
		if (n > 0) {
			sum += currentnum + currentnum2;
			avg = ((double)sum / (i2 + 1));
			avgS = String.format("%.2f", avg);
			currentnumR += currentnum + currentnum2;
			result2 += "[sum of <" + currentnumR + ">: " + sum + " ; avg of <" + currentnumR + ">: " + avgS + "]";
		}
		
		result = "{" + result2 + "}";
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
	 * 	- `ft1`, `d1`, `n1` are the first term, common difference, and size of the first arithmetic sequence.
	 *  - `ft2`, `d2`, `n2` are the second term, common difference, and size of the second arithmetic sequence.
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.  
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getInterlevaings(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String result = "";
		
		while (n1 > 0 || n2 > 0) {
			if ((n1 == 0 && n2 == 1)||(n1 == 1 && n2 == 0)) {
					if (n1 != 0) {
						result += "(" + ft1 + ")";
						n1 = n1 - 1;
						ft1 = ft1 +d1;
					} 
					
					if (n2 != 0) {
						result += "[" + ft2 + "]";
						n2 = n2 - 1;
						ft2 = ft2 +d2;
						} 
			}
			else if (n1 == 1 && n2 == 1) {
					if (n1 != 0) {
						result += "(" + ft1 + "), ";
						n1 = n1 - 1;
						ft1 = ft1 +d1;
					} 
					
					if (n2 != 0) {
						result += "[" + ft2 + "]";
						n2 = n2 - 1;
						ft2 = ft2 +d2;
						} 
			}
			else {
					if (n1 != 0) {
						result += "(" + ft1 + "), ";
						n1 = n1 - 1;
						ft1 = ft1 +d1;
					} 
					
					if (n2 != 0) {
						result += "[" + ft2 + "], ";
						n2 = n2 - 1;
						ft2 = ft2 +d2;
						} 
					}
			}
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		result = "<"+ result + ">";
		/* Your implementation ends here. */
		return result;
	}	
}
