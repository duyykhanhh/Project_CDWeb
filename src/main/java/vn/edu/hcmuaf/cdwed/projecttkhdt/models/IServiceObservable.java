package vn.edu.hcmuaf.cdwed.projecttkhdt.models;

public interface IServiceObservable {
	public void registerServer(IServiceObserver service);
	public void removeServer(IServiceObserver service);
	public void nofity();
}
