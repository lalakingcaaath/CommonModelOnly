package com.jimac.common_model.VehicleType;

public class VehicleModel {
    String vehicleName;
    int vehicleCount = 0;
    Double vehicleIncome = (double) 0.0F;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public Double getVehicleIncome() {
        return vehicleIncome;
    }

    public void setVehicleIncome(Double vehicleIncome) {
        this.vehicleIncome = vehicleIncome;
    }
}
