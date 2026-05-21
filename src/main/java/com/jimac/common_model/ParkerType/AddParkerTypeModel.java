package com.jimac.common_model.ParkerType;

import android.net.Uri;

public class AddParkerTypeModel {
    public String name;
    public Uri imageUri;

    public String imageBase64;

    public AddParkerTypeModel(String name, Uri imageUri, String imageBase64) {
        this.name = name;
        this.imageUri = imageUri;
        this.imageBase64 = imageBase64;
    }
}