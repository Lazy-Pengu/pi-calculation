/*
 * This program calculates the value of PI mathematically through use of several infinite series.
 * The precision of each estimate depends on how many times the user wishes to iterate through 
 * each function.
 * 
 * Use of BigDecimal to increase amount of digits outputted to console to 50
 */

//imports for use of Math and Scanner objects
import java.math.*;
import java.util.*;


public class CalculatingPi {

	public static void main(String[] args) {
		//initialize actual value of PI for comparison later
		final double ACTUAL_PI = Math.PI;
		
		//initialize variables for later use
		Scanner userAnswer = new Scanner(System.in);
		double piHolder = 0;
		int holdSelection;
		int numIterations;
		int decimalPlaces;
		
		//selection of which series to be used to calculate PI and hold answer using Scanner object
		System.out.println("Which series would you like to calculate PI with:\n"
				+ "(1) Nilakantha Series\n"
				+ "(2) Leibniz Series\n"
				+ "(3) Wallis Series\n"
				+ "(4) VieteSeries\n"
				+ "(5) ALL");
		
		holdSelection = userAnswer.nextInt();
		
		//request and hold number of iterations desired and number of decimal values
		System.out.print("How many iterations would you like: ");
		numIterations = userAnswer.nextInt();
		
		System.out.print("How many decimal places would you like (maximum of 48): ");
		decimalPlaces = userAnswer.nextInt();
		System.out.println();
		
		userAnswer.close();
		
		// outputs calculation of Nilakantha Series
		if(holdSelection == 1) {
			
			//create NilakanthaSeries object
			NilakanthaSeries computePi = new NilakanthaSeries();
	
			//calls calculate method of NilakanthaSeries with input value of numIterations
			piHolder = computePi.calculate(numIterations);
			
			
			BigDecimal decimalPi = new BigDecimal(piHolder).setScale(decimalPlaces, RoundingMode.HALF_EVEN);
		    BigDecimal PI_ACTUAL = new BigDecimal(ACTUAL_PI).setScale(48, RoundingMode.UNNECESSARY);

		    System.out.println("Acutal value of PI (to the 48th digit) is: " + PI_ACTUAL.toString());
		    System.out.println("Estimated PI value:                        " + decimalPi.toString() + "\n"
   		         + "-----------------------------------------------------------------------------------------------");
		    
		    BigDecimal difference = new BigDecimal(ACTUAL_PI - piHolder);
		    
		    System.out.println("A difference of :                          " + difference.toString());
		    		
		}
		
		//outputs calculation of Leibniz Series
		else if(holdSelection == 2) {
			LeibnizSeries computePi = new LeibnizSeries();
			
			piHolder = computePi.calculate(numIterations);
			
			BigDecimal decimalPi = new BigDecimal(piHolder).setScale(decimalPlaces, RoundingMode.HALF_EVEN);
		    BigDecimal PI_ACTUAL = new BigDecimal(ACTUAL_PI).setScale(48, RoundingMode.UNNECESSARY);

		    System.out.println("Acutal value of PI (to the 48th digit) is: " + PI_ACTUAL.toString());
		    System.out.println("Estimated PI value:                        " + decimalPi.toString() + "\n"
   		         + "-----------------------------------------------------------------------------------------------");
		    
		    BigDecimal difference = new BigDecimal(ACTUAL_PI - piHolder);
		    
		    System.out.println("A difference of :                          " + difference.toString());   
		    
		}
		
		//output calculation of Wallis Series
		else if(holdSelection == 3) {
			WallisSeries computePi = new WallisSeries();
			
			piHolder = computePi.calculate(numIterations);
			
			BigDecimal decimalPi = new BigDecimal(piHolder).setScale(decimalPlaces, RoundingMode.HALF_EVEN);
		    BigDecimal PI_ACTUAL = new BigDecimal(ACTUAL_PI).setScale(48, RoundingMode.UNNECESSARY);

		    System.out.println("Acutal value of PI (to the 48th digit) is: " + PI_ACTUAL.toString());
		    System.out.println("Estimated PI value:                        " + decimalPi.toString() + "\n"
   		         + "-----------------------------------------------------------------------------------------------");
		    
		    BigDecimal difference = new BigDecimal(ACTUAL_PI - piHolder);
		    
		    System.out.println("A difference of :                          " + difference.toString());
			
		}
		//outputs calculation of Viete Series
		else if(holdSelection == 4) {
			
		    if(numIterations >=10000) {
		    	System.out.println("This may take a few seconds.....");
		    }
			
			VieteSeries computePi = new VieteSeries();
			
			piHolder = computePi.calculate(numIterations);
			
			BigDecimal decimalPi = new BigDecimal(piHolder).setScale(decimalPlaces, RoundingMode.HALF_EVEN);
		    BigDecimal PI_ACTUAL = new BigDecimal(ACTUAL_PI).setScale(48, RoundingMode.UNNECESSARY);
		    
		    System.out.println("Acutal value of PI (to the 48th digit) is: " + PI_ACTUAL.toString());
		    System.out.println("Estimated PI value:                        " + decimalPi.toString() + "\n"
		    		         + "-----------------------------------------------------------------------------------------------");
		    
		    BigDecimal difference = new BigDecimal(ACTUAL_PI - piHolder);
		    
		    System.out.println("A difference of :                          " + difference);
			
		}
		
		//outputs calculations of all series
		else if(holdSelection == 5) {
			NilakanthaSeries computePiN = new NilakanthaSeries();
			LeibnizSeries computePiL = new LeibnizSeries();
			WallisSeries computePiW = new WallisSeries();
			VieteSeries computePiV = new VieteSeries();
			
			BigDecimal PI_ACTUAL = new BigDecimal(ACTUAL_PI).setScale(48, RoundingMode.UNNECESSARY);
			System.out.println("Acutal value of PI (to the 48th digit) is:                     " + PI_ACTUAL.toString() + "\n");
			
			piHolder = computePiN.calculate(numIterations);
			BigDecimal decimalPiN = new BigDecimal(piHolder).setScale(decimalPlaces, RoundingMode.HALF_EVEN);
			System.out.println("Estimated Nilakantha's Series PI value:                        " + decimalPiN + "\n");
			    

			piHolder = computePiL.calculate(numIterations);
			BigDecimal decimalPiL = new BigDecimal(piHolder).setScale(decimalPlaces, RoundingMode.HALF_EVEN);
			System.out.println("Estimated Leibniz's Series PI value:                           " + decimalPiL + "\n");
			    
			
			piHolder = computePiW.calculate(numIterations);
			BigDecimal decimalPiW = new BigDecimal(piHolder).setScale(decimalPlaces, RoundingMode.HALF_EVEN);
			System.out.println("Estimated Wallis' Series PI value:                             " + decimalPiW + "\n");
			    
			
			piHolder = computePiV.calculate(numIterations);
			BigDecimal decimalPiV = new BigDecimal(piHolder).setScale(decimalPlaces, RoundingMode.HALF_EVEN);
			System.out.println("Estimated Viete's Series PI value:                             " + decimalPiV + "\n");
			    
		}

	}	
	
}
