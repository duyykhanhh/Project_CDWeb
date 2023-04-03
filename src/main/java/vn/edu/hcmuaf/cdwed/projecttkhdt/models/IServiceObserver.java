package vn.edu.hcmuaf.cdwed.projecttkhdt.models;

import java.util.List;

public interface IServiceObserver {
	public void update(String cusId, List<Drink> drinks, String address);
}
