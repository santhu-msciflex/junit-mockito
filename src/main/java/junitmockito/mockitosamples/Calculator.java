package junitmockito.mockitosamples;

public class Calculator {
	
	CalculatorService service = null;
	
	public CalculatorService getService() {
		return service;
	}

	public void setService(CalculatorService service) {
		this.service = service;
	}

	public void add(int i, int j) {
		service.sum(i, j);
		System.out.println("inside service.sum()");
	}
	
	public int subtract(int i, int j) {
		int k = service.minus(i, j);
		System.out.println("inside service.subtract()");
		return k;
	}

}
