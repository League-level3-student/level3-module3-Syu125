package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double tax = (population*growthRate)+(.5*population);
		System.out.println(tax);
		return tax;
	}

}
