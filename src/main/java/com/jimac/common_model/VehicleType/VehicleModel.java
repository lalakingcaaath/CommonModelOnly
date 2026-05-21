package com.jimac.common_model.VehicleType;

public class VehicleModel {
<<<<<<< HEAD
    String vehicleName;
    int vehicleCount = 0;
    Double vehicleIncome = (double) 0.0F;
=======
    private String vehicleName;
    private int vehicleCount;
    private double vehicleIncome;
>>>>>>> 1d57658f5d46a7a0dcd286bd6bd140656e814cb4

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

<<<<<<< HEAD
    public Double getVehicleIncome() {
        return vehicleIncome;
    }

    public void setVehicleIncome(Double vehicleIncome) {
=======
    public double getVehicleIncome() {
        return vehicleIncome;
    }

    public void setVehicleIncome(double vehicleIncome) {
>>>>>>> 1d57658f5d46a7a0dcd286bd6bd140656e814cb4
        this.vehicleIncome = vehicleIncome;
    }
}
