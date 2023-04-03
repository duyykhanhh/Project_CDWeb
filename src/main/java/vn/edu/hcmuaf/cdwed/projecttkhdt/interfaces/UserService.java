package vn.edu.hcmuaf.cdwed.projecttkhdt.interfaces;

import vn.edu.hcmuaf.cdwed.projecttkhdt.models.Beverage;

import java.sql.SQLException;
import java.util.ArrayList;

public interface UserService {
ArrayList<Beverage> getPopularBeverage() throws SQLException;
}
