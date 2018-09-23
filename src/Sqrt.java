
public class Sqrt {

	public double inputNum(double num) {
		double sqrt = 1.0;
		double numSqrt = num;
		
		for(int i = 0; i<=10000; i++) {
			sqrt = (1.0/2.0) * (sqrt + (numSqrt/sqrt));
		}
		
		return sqrt;

	}
}
