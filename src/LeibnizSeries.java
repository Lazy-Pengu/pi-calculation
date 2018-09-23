
public class LeibnizSeries {

	public double calculate(int iterations) {
		double pi = 0; 
		int numIterations = iterations;
		int switchNum = 1;
		
		for(double n = 0.0;n<=numIterations; n++) {
			pi = pi + switchNum * (4/(2*n +1));
			switchNum = -switchNum;
		}
		
		return pi;
	}
}
