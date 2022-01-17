package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `status` is the filing status (which should be 1 for Single Filing or 2 for Married Filing)
	 *  - `income` is the tax payer's income (an integer value)
	 *  
	 * Assumptions:
	 * 	- `income` passed by user is always positive (> 0)
	 *  
	 * Refer to you lab instructions for what the method should return.
	 * 
	 * See this short tutorial video illustrating how to compute tax:
	 * https://www.youtube.com/watch?v=q2NT5x77hdg&list=PL5dxAmCmjv_7YgI2LgcwjWTHiNZSR-aQX&index=1 
	 */
	public static String getTaxReport(int status, int income) {
		double tax_total = 0.0;
		String parts = "";
		String filing = "";
		String tax_totals = "";
		String tax3s = "";
		String detailed_taxes = "";
		
		if (status == 1) {
			if (income <= 8350) {
				tax_total = income * 0.10;
				tax3s = String.format("%.2f", (income * 0.10));
				parts = " (Part I: $" + tax3s + ")";
			}
			else if (income > 8350 && income <= 33950.00) {
				tax_total = 835.00 + ((income - 8350.00) * 0.15);
				tax3s = String.format("%.2f", ((income - 8350.00) * 0.15));
				parts = " (Part I: $835.00, Part II: $" + tax3s + ")";
			}
			else {
				tax_total = 4675.00 + ((income - 33950.00) * 0.25);
				tax3s = String.format("%.2f", ((income - 33950.00) * 0.25));
				parts = " (Part I: $835.00, Part II: $3840.00, Part III: $" + tax3s + ")";
				
			}
		}
		
		if (status == 2) {
			if (income <= 16700) {
				tax_total = income * 0.10;
				tax3s = String.format("%.2f", (income * 0.10));
				parts = " (Part I: $" + tax3s + ")";
			}
			else if (income > 16700 && income <= 67900.00) {
				tax_total = 1670.00 + ((income - 16700.00) * 0.15);
				tax3s = String.format("%.2f", ((income - 16700.00) * 0.15));
				parts = " (Part I: $1670.00, Part II: $" + tax3s + ")";
			}
			else {
				tax_total = 9350 + ((income - 67900.00) * 0.25);
				tax3s = String.format("%.2f", ((income - 67900.00) * 0.25));
				parts = " (Part I: $1670.00, Part II: $7680.00, Part III: $" + tax3s + ")";
				
			}
		}
		
		
		
		tax_totals = "$" + String.format("%.2f", tax_total);	
		if (status == 1)  {
			filing = "Single Filing: ";
			detailed_taxes = tax_totals + parts;
			
		}
		else if (status == 2) {
			filing = "Married Filing: ";
			detailed_taxes = tax_totals + parts;
		}
		else {
			filing = "Illegal Status: " + status;
		}
		String result = filing + detailed_taxes;

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
	 * 	- `p1` is the name of player 1
	 *  - `p2` is the name of player 2
	 *  - `p1r1` is what player 1 plays in round 1 ('R', 'P', or 'S')
	 *  - `p2r1` is what player 2 plays in round 1 ('R', 'P', or 'S')
	 *  - `p1r2` is what player 1 plays in round 2 ('R', 'P', or 'S')
	 *  - `p2r2` is what player 2 plays in round 2 ('R', 'P', or 'S')
	 *  
	 * Assumptions:
	 * 	- `p1r1`, `p2r1`, `p1r2`, or `p2r2` is one of the following characters:
	 *     'R' for rock, 'P' for paper, and 'S' scissors (case-sensitive)
	 *     
	 * Hints:
	 *  - Compare character values using the relational operator ==.
	 *  - Study the 9 test cases in TestUtilites: they are arranged in a systematic (yet not exhaustive) way.
	 *    Q. In order to exhaustively test this game, considering how two players may play in two rounds,
	 *    	 how many tests do we need? (Optionally, you may write extra test yourself as an exercise.)
	 *    
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getRPSGameReport(String p1, String p2, char p1r1, char p2r1, char p1r2, char p2r2) {
		int p1_points = 0;
		int p2_points = 0;
		String r1 = "";
		String r2 = "";
		String rounds_total = "";
		if (p1r1 == 'R') {
			if (p2r1 == 'R') {
				r1 = "Tie (R vs. R)";
			}
			else if (p2r1 == 'P') {
				r1 = p2 + " wins (P vs. R)";
				p2_points = p2_points + 1;
			}
			else if (p2r1 == 'S') {
				r1 = p1 + " wins (R vs. S)";
				p1_points = p1_points + 1;
			}
		}
		else if (p1r1 == 'P') {
			if (p2r1 == 'R') {
				r1 = p1 + " wins (P vs. R)";
				p1_points = p1_points + 1;
			}
			else if (p2r1 == 'P') {
				r1 = "Tie (P vs. P)";
			}
			else if (p2r1 == 'S') {
				r1 = p2 + " wins (S vs. P)";
				p2_points = p2_points + 1;
			}
		}
		else if (p1r1 == 'S') {
			if (p2r1 == 'R') {
				r1 = p2 + " wins (R vs. S)";
				p2_points = p2_points + 1;
			}
			else if (p2r1 == 'P') {
				r1 = p1 + " wins (S vs. P)";
				p1_points = p1_points + 1;
			}
			else if (p2r1 == 'S') {
				r1 = "Tie (S vs. S)";
			}
		}
		
		
		if (p1r2 == 'R') {
			if (p2r2 == 'R') {
				r2 = "Tie (R vs. R)";
			}
			else if (p2r2 == 'P') {
				r2 = p2 + " wins (P vs. R)";
				p2_points = p2_points + 1;
			}
			else if (p2r2 == 'S') {
				r2 = p1 + " wins (R vs. S)";
				p1_points = p1_points + 1;
			}
		}
		else if (p1r2 == 'P') {
			if (p2r2 == 'R') {
				r2 = p1 + " wins (P vs. R)";
				p1_points = p1_points + 1;
			}
			else if (p2r2 == 'P') {
				r2 = "Tie (P vs. P)";
			}
			else if (p2r2 == 'S') {
				r2 = p2 + " wins (S vs. P)";
				p2_points = p2_points + 1;
			}
		}
		else if (p1r2 == 'S') {
			if (p2r2 == 'R') {
				r2 = p2 + " wins (R vs. S)";
				p2_points = p2_points + 1;
			}
			else if (p2r2 == 'P') {
				r2 = p1 + " wins (S vs. P)";
				p1_points = p1_points + 1;
			}
			else if (p2r2 == 'S') {
				r2 = "Tie (S vs. S)";
			}
		}
		
		if (p1_points > p2_points) {
			rounds_total = p1 + " wins!";
		}
		else if (p1_points < p2_points) {
			rounds_total = p2 + " wins!";
		}
		else {
			rounds_total = "Tie!";
		}
		String result = "Game over: " + rounds_total + " [Round 1: " + r1 + " ; " + "Round 2: " + r2 + "]";
		
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
}
