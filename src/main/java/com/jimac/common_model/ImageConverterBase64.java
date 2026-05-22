package com.jimac.common_model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Base64;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ImageConverterBase64 {

    public static String convertUriToBase64(Context context, Uri uri) {
        try {
            Bitmap original = getBitmapFromUri(context, uri);
            if (original == null) return null;

            Bitmap resized = resizeBitmap(original, 100);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            resized.compress(Bitmap.CompressFormat.JPEG, 60, baos);
            byte[] byteArray = baos.toByteArray();

            return Base64.encodeToString(byteArray, Base64.NO_WRAP);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap base64ToBitmap(String base64) {
        if (base64 == null || base64.isEmpty()) return null;
        try {
            byte[] decodedBytes = Base64.decode(base64.trim(), Base64.NO_WRAP);
            Bitmap bitmap = BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);
            if (bitmap == null) return null;

            int targetWidth = 500;
            float scale = (float) targetWidth / bitmap.getWidth();
            int targetHeight = (int) (bitmap.getHeight() * scale);
            return Bitmap.createScaledBitmap(bitmap, targetWidth, targetHeight, true);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap resizeBitmap(Bitmap bitmap, int maxDimension) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();

        if (width <= maxDimension && height <= maxDimension) return bitmap;

        float scale = (float) maxDimension / Math.max(width, height);
        int newWidth = Math.round(width * scale);
        int newHeight = Math.round(height * scale);

        return Bitmap.createScaledBitmap(bitmap, newWidth, newHeight, true);
    }

    public static long getFileSizeFromUri(Context context, Uri uri) {
        try (android.database.Cursor cursor = context.getContentResolver().query(
                uri,
                new String[]{android.provider.OpenableColumns.SIZE},
                null, null, null)) {

            if (cursor != null && cursor.moveToFirst()) {
                int sizeIndex = cursor.getColumnIndex(android.provider.OpenableColumns.SIZE);
                if (sizeIndex != -1 && !cursor.isNull(sizeIndex)) {
                    return cursor.getLong(sizeIndex);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static Bitmap getBitmapFromUri(Context context, Uri uri) {
        try {
            return MediaStore.Images.Media.getBitmap(
                    context.getContentResolver(), uri
            );
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
