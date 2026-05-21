package com.jimac.common_model.ParkerType;

public class ParkerModel {

    String parkerName;
    int parkerCount = 0;
    Double parkerIncome = (double) 0.0F;


    public String getParkerName() {
        return parkerName;
    }

    public void setParkerName(String parkerName) {
        this.parkerName = parkerName;
    }

    public int getParkerCount() {
        return parkerCount;
    }

    public void setParkerCount(int parkerCount) {
        this.parkerCount = parkerCount;
    }

    public Double getParkerIncome() {
        return parkerIncome;
    }

    public void setParkerIncome(Double parkerIncome) {
        this.parkerIncome = parkerIncome;
    }
}