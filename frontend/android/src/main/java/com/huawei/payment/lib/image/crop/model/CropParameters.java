package com.huawei.payment.lib.image.crop.model;

import android.graphics.Bitmap;
import android.net.Uri;

public class CropParameters {
    private final ExifInfo ShareDataUIState;
    private Uri component1;
    private final int component2;
    private final Bitmap.CompressFormat component3;
    private final String component4;
    private final int copy;
    private Uri copydefault;
    private final String getAsAtTimestamp;
    private final int getRequestBeneficiariesState;

    public CropParameters(int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str, String str2, ExifInfo exifInfo) {
        this.copy = i;
        this.getRequestBeneficiariesState = i2;
        this.component3 = compressFormat;
        this.component2 = i3;
        this.component4 = str;
        this.getAsAtTimestamp = str2;
        this.ShareDataUIState = exifInfo;
    }

    public int getMaxResultImageSizeX() {
        return this.copy;
    }

    public int getMaxResultImageSizeY() {
        return this.getRequestBeneficiariesState;
    }

    public Bitmap.CompressFormat getCompressFormat() {
        return this.component3;
    }

    public int getCompressQuality() {
        return this.component2;
    }

    public String getImageInputPath() {
        return this.component4;
    }

    public String getImageOutputPath() {
        return this.getAsAtTimestamp;
    }

    public ExifInfo getExifInfo() {
        return this.ShareDataUIState;
    }

    public Uri getContentImageInputUri() {
        return this.copydefault;
    }

    public void setContentImageInputUri(Uri uri) {
        this.copydefault = uri;
    }

    public Uri getContentImageOutputUri() {
        return this.component1;
    }

    public void setContentImageOutputUri(Uri uri) {
        this.component1 = uri;
    }
}
