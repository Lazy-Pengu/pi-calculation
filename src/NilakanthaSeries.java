
public class NilakanthaSeries {
	
	public double calculate(int iterations) {
		double pi = 3.0;
		int numIterations = iterations;
		double switchSigns = 1.0;
		
		
		
		for(double i = 2.0; i<=numIterations+2; i+=2.0) {
			pi = pi + switchSigns * (4.0/( (i) * (i+1.0) * (i+2.0)));
			switchSigns = -switchSigns;
		}

	      return pi;
	}

}
