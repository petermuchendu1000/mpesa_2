package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.core.GriverParams;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÇ\u0001J\b\u0010$\u001a\u00020\u0003H\u0007J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H×\u0003J\t\u0010)\u001a\u00020\u0003H×\u0001J\t\u0010*\u001a\u00020\u0007H×\u0001J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u00060"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfferResponse;", "Landroid/os/Parcelable;", "data", "", "dataPercentage", "dataPrice", "name", "", "totalPrice", "validity", "voice", "voicePercentage", "voicePrice", "<init>", "(IIILjava/lang/String;ILjava/lang/String;III)V", "getData", "()I", "getDataPercentage", "getDataPrice", "getName", "()Ljava/lang/String;", "getTotalPrice", "getValidity", "getVoice", "getVoicePercentage", "getVoicePrice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfferResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<OfferResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("data")
    private final int data;

    @SerializedName("dataPercentage")
    private final int dataPercentage;

    @SerializedName("dataPrice")
    private final int dataPrice;

    @SerializedName(GriverParams.ShareParams.DESC)
    private final String name;

    @SerializedName("totalPrice")
    private final int totalPrice;

    @SerializedName("validity")
    private final String validity;

    @SerializedName("voice")
    private final int voice;

    @SerializedName("voicePercentage")
    private final int voicePercentage;

    @SerializedName("voicePrice")
    private final int voicePrice;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OfferResponse> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OfferResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            OfferResponse offerResponse = new OfferResponse(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            int i2 = ShareDataUIState + 11;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 21 / 0;
            }
            return offerResponse;
        }

        @Override
        public OfferResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 61;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            OfferResponse offerResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 5;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return offerResponseCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OfferResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 73;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            OfferResponse[] offerResponseArr = new OfferResponse[i];
            int i6 = i4 + 97;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return offerResponseArr;
        }

        @Override
        public OfferResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 35;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            OfferResponse[] offerResponseArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 16 / 0;
            }
            int i6 = ShareDataUIState + 81;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 73 / 0;
            }
            return offerResponseArrNewArray;
        }
    }

    public OfferResponse(int i, int i2, int i3, String str, int i4, String str2, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.data = i;
        this.dataPercentage = i2;
        this.dataPrice = i3;
        this.name = str;
        this.totalPrice = i4;
        this.validity = str2;
        this.voice = i5;
        this.voicePercentage = i6;
        this.voicePrice = i7;
    }

    public final int getData() {
        int i;
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 113;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.data;
            int i5 = 5 / 0;
        } else {
            i = this.data;
        }
        int i6 = i3 + 91;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public final int getDataPercentage() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.dataPercentage;
        int i6 = i3 + 77;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getDataPrice() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 73;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.dataPrice;
        int i6 = i2 + 91;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 43 / 0;
        }
        return i5;
    }

    public final String getName() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 55;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.name;
            int i4 = 4 / 0;
        } else {
            str = this.name;
        }
        int i5 = i2 + 49;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int getTotalPrice() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.totalPrice;
        int i6 = i3 + 61;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getValidity() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.validity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getVoice() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.voice;
        int i6 = i2 + 41;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final int getVoicePercentage() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 79;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.voicePercentage;
        int i6 = i2 + 35;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getVoicePrice() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 23;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.voicePrice;
        int i5 = i2 + 15;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    static {
        int i = copydefault + 13;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 39 / 0;
        }
    }

    public static OfferResponse copy$default(OfferResponse offerResponse, int i, int i2, int i3, String str, int i4, String str2, int i5, int i6, int i7, int i8, Object obj) {
        int i9;
        int i10;
        int i11;
        int i12 = 2 % 2;
        if ((i8 & 1) != 0) {
            i9 = offerResponse.data;
            int i13 = ShareDataUIState + 33;
            component1 = i13 % 128;
            int i14 = i13 % 2;
        } else {
            i9 = i;
        }
        int i15 = (i8 & 2) != 0 ? offerResponse.dataPercentage : i2;
        int i16 = (i8 & 4) != 0 ? offerResponse.dataPrice : i3;
        String str3 = (i8 & 8) != 0 ? offerResponse.name : str;
        int i17 = (i8 & 16) != 0 ? offerResponse.totalPrice : i4;
        String str4 = (i8 & 32) != 0 ? offerResponse.validity : str2;
        if ((i8 & 64) != 0) {
            i10 = offerResponse.voice;
            int i18 = component1 + 125;
            ShareDataUIState = i18 % 128;
            int i19 = i18 % 2;
        } else {
            i10 = i5;
        }
        int i20 = (i8 & 128) != 0 ? offerResponse.voicePercentage : i6;
        if ((i8 & 256) != 0) {
            int i21 = ShareDataUIState + 27;
            component1 = i21 % 128;
            if (i21 % 2 != 0) {
                i11 = offerResponse.voicePrice;
                int i22 = 88 / 0;
            } else {
                i11 = offerResponse.voicePrice;
            }
        } else {
            i11 = i7;
        }
        return offerResponse.copy(i9, i15, i16, str3, i17, str4, i10, i20, i11);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.data;
        int i6 = i3 + 37;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 31;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.dataPercentage;
        int i6 = i2 + 97;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.dataPrice;
        int i6 = i2 + 65;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.name;
        int i4 = i2 + 65;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.totalPrice;
        int i5 = i3 + 83;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.validity;
        int i5 = i2 + 109;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.voice;
        int i6 = i3 + 65;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.voicePercentage;
        int i6 = i3 + 1;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int component9() {
        int i;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 81;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.voicePrice;
            int i5 = 1 / 0;
        } else {
            i = this.voicePrice;
        }
        int i6 = i3 + 23;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public final OfferResponse copy(int data, int dataPercentage, int dataPrice, String name, int totalPrice, String validity, int voice, int voicePercentage, int voicePrice) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(validity, "");
        OfferResponse offerResponse = new OfferResponse(data, dataPercentage, dataPrice, name, totalPrice, validity, voice, voicePercentage, voicePrice);
        int i2 = component1 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return offerResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 29;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 9;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferResponse)) {
            int i6 = i4 + 77;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        OfferResponse offerResponse = (OfferResponse) other;
        if (this.data != offerResponse.data || this.dataPercentage != offerResponse.dataPercentage) {
            return false;
        }
        Object obj = null;
        if (this.dataPrice != offerResponse.dataPrice) {
            int i8 = i2 + 29;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.name, offerResponse.name) || this.totalPrice != offerResponse.totalPrice) {
            return false;
        }
        if (!Intrinsics.areEqual(this.validity, offerResponse.validity)) {
            int i9 = ShareDataUIState + 31;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.voice != offerResponse.voice) {
            return false;
        }
        if (this.voicePercentage == offerResponse.voicePercentage) {
            if (this.voicePrice == offerResponse.voicePrice) {
                return true;
            }
            int i11 = ShareDataUIState + 79;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        int i13 = ShareDataUIState;
        int i14 = i13 + 39;
        component1 = i14 % 128;
        int i15 = i14 % 2;
        int i16 = i13 + 77;
        component1 = i16 % 128;
        if (i16 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((Integer.hashCode(this.data) * 31) + Integer.hashCode(this.dataPercentage)) * 31) + Integer.hashCode(this.dataPrice)) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.totalPrice)) * 31) + this.validity.hashCode()) * 31) + Integer.hashCode(this.voice)) * 31) + Integer.hashCode(this.voicePercentage)) * 31) + Integer.hashCode(this.voicePrice);
        int i4 = ShareDataUIState + 117;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OfferResponse(data=" + this.data + ", dataPercentage=" + this.dataPercentage + ", dataPrice=" + this.dataPrice + ", name=" + this.name + ", totalPrice=" + this.totalPrice + ", validity=" + this.validity + ", voice=" + this.voice + ", voicePercentage=" + this.voicePercentage + ", voicePrice=" + this.voicePrice + ")";
        int i2 = component1 + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.data);
        dest.writeInt(this.dataPercentage);
        dest.writeInt(this.dataPrice);
        dest.writeString(this.name);
        dest.writeInt(this.totalPrice);
        dest.writeString(this.validity);
        dest.writeInt(this.voice);
        dest.writeInt(this.voicePercentage);
        dest.writeInt(this.voicePrice);
        int i4 = ShareDataUIState + 113;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
