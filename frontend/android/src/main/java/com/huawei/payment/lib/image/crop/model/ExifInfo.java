package com.huawei.payment.lib.image.crop.model;

public class ExifInfo {
    private int ShareDataUIState;
    private int component1;
    private int component2;

    public ExifInfo(int i, int i2, int i3) {
        this.ShareDataUIState = i;
        this.component2 = i2;
        this.component1 = i3;
    }

    public int getExifOrientation() {
        return this.ShareDataUIState;
    }

    public void setExifOrientation(int i) {
        this.ShareDataUIState = i;
    }

    public int getExifDegrees() {
        return this.component2;
    }

    public void setExifDegrees(int i) {
        this.component2 = i;
    }

    public int getExifTranslation() {
        return this.component1;
    }

    public void setExifTranslation(int i) {
        this.component1 = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExifInfo exifInfo = (ExifInfo) obj;
        return this.ShareDataUIState == exifInfo.ShareDataUIState && this.component2 == exifInfo.component2 && this.component1 == exifInfo.component1;
    }

    public int hashCode() {
        return (((this.ShareDataUIState * 31) + this.component2) * 31) + this.component1;
    }
}
