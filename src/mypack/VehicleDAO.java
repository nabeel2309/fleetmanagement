package mypack;

import java.util.List;

public interface VehicleDAO
{
	public List<VehicleCategory> getVehicles();
	public VehicleCategory getVehicleCategory(int vehiclecategoryid);
}