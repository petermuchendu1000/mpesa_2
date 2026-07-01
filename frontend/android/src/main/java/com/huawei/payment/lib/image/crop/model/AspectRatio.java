package com.huawei.payment.lib.image.crop.model;

import android.os.Parcel;
import android.os.Parcelable;

public class AspectRatio implements Parcelable {
    public static final Parcelable.Creator<AspectRatio> CREATOR = new Parcelable.Creator<AspectRatio>() {
        @Override
        public AspectRatio createFromParcel(Parcel parcel) {
            return new AspectRatio(parcel);
        }

        @Override
        public AspectRatio[] newArray(int i) {
            return new AspectRatio[i];
        }
    };
    private final String aspectRatioTitle;
    private final float aspectRatioX;
    private final float aspectRatioY;

    @Override
    public int describeContents() {
        return 0;
    }

    public AspectRatio(String str, float f, float f2) {
        this.aspectRatioTitle = str;
        this.aspectRatioX = f;
        this.aspectRatioY = f2;
    }

    protected AspectRatio(Parcel parcel) {
        this.aspectRatioTitle = parcel.readString();
        this.aspectRatioX = parcel.readFloat();
        this.aspectRatioY = parcel.readFloat();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.aspectRatioTitle);
        parcel.writeFloat(this.aspectRatioX);
        parcel.writeFloat(this.aspectRatioY);
    }

    public String getAspectRatioTitle() {
        return this.aspectRatioTitle;
    }

    public float getAspectRatioX() {
        return this.aspectRatioX;
    }

    public float getAspectRatioY() {
        return this.aspectRatioY;
    }
}
