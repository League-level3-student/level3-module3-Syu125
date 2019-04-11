package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double tax = 1000000+ (population*growthRate);
		System.out.println(tax);
		return tax;
	}
}
