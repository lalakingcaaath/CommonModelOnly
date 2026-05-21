package com.jimac.common_model.VehicleType;

import android.net.Uri;

public class AddVehicleTypeModel {
    public String name;
    public Uri imageUri;
    public String imageBase64;

    public AddVehicleTypeModel(String name, Uri imageUri, String imageBase64) {
        this.name = name;
        this.imageUri = imageUri;
        this.imageBase64 = imageBase64;
    }
}
