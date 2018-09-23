
public class VieteSeries {

	public double calculate(int iterations) {
		double pi = 1.0;
		int numIterations = iterations;
		
		Sqrt sqrt = new Sqrt();
		double numerator = 0;
		
		for(int i = 0; i<numIterations; i++) {
			numerator = sqrt.inputNum(2.0 + numerator);
			pi *= numerator/2.0;
		}
		
		return pi = 1/(pi/2);
	}
}
