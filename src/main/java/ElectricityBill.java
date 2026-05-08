public class ElectricityBill {
	int unit=100;
	public double CalculateBill(int unit) {
		if(unit<=100) {
			return 1.5*unit;
		}
		else if((unit>100)&&(unit<=300)) {
			return 2.5*unit;
		}
		else {
			return 4*unit;
		}
	}
	
}
