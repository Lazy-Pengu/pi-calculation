
public class WallisSeries {
	public double calculate(int iterations) {
		double pi = 1;
		int numIterations = iterations;
		
		for(double n = 1.0; n<=numIterations; n++) {
			pi = pi * (2*n/(2*n-1) * 2*n/(2*n+1));
		}
		
		pi = pi*2;

		return pi;
	}

}
