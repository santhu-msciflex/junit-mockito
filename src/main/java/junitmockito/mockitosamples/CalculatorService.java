package junitmockito.mockitosamples;

public class CalculatorService {
	
	public void sum(int i, int j) {
		int k = i + j;
		System.out.println("inside CalculatorService.sum() " + k);
	}
	
	public int minus(int i, int j) {
		int k = i - j;
		System.out.println("inside CalculatorService.minus() " + k);
		return k;
	}

}
