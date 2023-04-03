package vn.edu.hcmuaf.cdwed.projecttkhdt.models;

public interface IPriceStrategy {
	public double getPrice(double price);
	public int getPoint(double price);
}
