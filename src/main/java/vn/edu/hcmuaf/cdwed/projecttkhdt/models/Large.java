package vn.edu.hcmuaf.cdwed.projecttkhdt.models;

public class Large implements ISizeStrategy{


	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return Size.getDescription(this);
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return Size.getPrice(this);
	}

}
