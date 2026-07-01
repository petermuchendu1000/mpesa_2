package com.safaricom.sharedui.compose.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0013H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/GifData;", "Landroid/os/Parcelable;", "url", "", "previewUrl", "shape", "Lcom/safaricom/sharedui/compose/confirmation/GifDisplayShape;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/safaricom/sharedui/compose/confirmation/GifDisplayShape;)V", "getUrl", "()Ljava/lang/String;", "getPreviewUrl", "getShape", "()Lcom/safaricom/sharedui/compose/confirmation/GifDisplayShape;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GifData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<GifData> CREATOR = new Creator();
    private final String previewUrl;
    private final GifDisplayShape shape;
    private final String url;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GifData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final GifData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GifData(parcel.readString(), parcel.readString(), GifDisplayShape.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final GifData[] newArray(int i) {
            return new GifData[i];
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public GifData(String str, String str2, GifDisplayShape gifDisplayShape) {
        Intrinsics.checkNotNullParameter(gifDisplayShape, "");
        this.url = str;
        this.previewUrl = str2;
        this.shape = gifDisplayShape;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final GifDisplayShape getShape() {
        return this.shape;
    }

    public static GifData copy$default(GifData gifData, String str, String str2, GifDisplayShape gifDisplayShape, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gifData.url;
        }
        if ((i & 2) != 0) {
            str2 = gifData.previewUrl;
        }
        if ((i & 4) != 0) {
            gifDisplayShape = gifData.shape;
        }
        return gifData.copy(str, str2, gifDisplayShape);
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final GifDisplayShape getShape() {
        return this.shape;
    }

    public final GifData copy(String url, String previewUrl, GifDisplayShape shape) {
        Intrinsics.checkNotNullParameter(shape, "");
        return new GifData(url, previewUrl, shape);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GifData)) {
            return false;
        }
        GifData gifData = (GifData) other;
        return Intrinsics.areEqual(this.url, gifData.url) && Intrinsics.areEqual(this.previewUrl, gifData.previewUrl) && this.shape == gifData.shape;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.previewUrl;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.shape.hashCode();
    }

    public String toString() {
        return "GifData(url=" + this.url + ", previewUrl=" + this.previewUrl + ", shape=" + this.shape + ')';
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.url);
        dest.writeString(this.previewUrl);
        dest.writeString(this.shape.name());
    }
}
