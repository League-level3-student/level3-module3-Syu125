package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double tax = population*growthRate*(0.5*growthRate);
		System.out.println(tax);
		return tax;
	}
	
}
