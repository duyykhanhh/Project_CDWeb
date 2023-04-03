package vn.edu.hcmuaf.cdwed.projecttkhdt.models;

public class SpecialOccasionPrice implements IPriceStrategy{
	//gán số điểm muốn đổi

	
	

	@Override
	public int getPoint(double price) {
		// TODO Auto-generated method stub
		return Price.getPoint(this,price);
	}

	@Override
	public double getPrice(double price) {
		// TODO Auto-generated method stub
		return Price.getPrice(this,price);
	}
	

}
