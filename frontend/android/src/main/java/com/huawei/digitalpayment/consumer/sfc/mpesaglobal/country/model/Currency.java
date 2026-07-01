package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyAirtimeTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0012\u001a\u00020\bH\u0007J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\bH×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0007J%\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/Currency;", "Landroid/os/Parcelable;", "iso", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIso", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "write$Self", BuyAirtimeTypes.SELF, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ConsumerSfcUiMpesaGlobal_release", "$serializer", "Companion", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final class Currency implements Parcelable {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final String iso;
    private final String name;

    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Currency> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Currency> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Currency createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Currency currency = new Currency(parcel.readString(), parcel.readString());
            int i2 = component3 + 105;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return currency;
        }

        @Override
        public Currency createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 77;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Currency currencyCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 29;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return currencyCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Currency[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 113;
            int i4 = i3 % 128;
            copydefault = i4;
            Object obj = null;
            Currency[] currencyArr = new Currency[i];
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 103;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return currencyArr;
            }
            throw null;
        }

        @Override
        public Currency[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 5;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            Currency[] currencyArrNewArray = newArray(i);
            int i5 = component3 + 75;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return currencyArrNewArray;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/Currency$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/Currency;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        public final KSerializer<Currency> serializer() {
            int i = 2 % 2;
            int i2 = component2 + 39;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Currency$$serializer currency$$serializer = Currency$$serializer.INSTANCE;
            int i4 = component2 + 33;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return currency$$serializer;
        }

        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Currency(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            int i2 = component3 + 47;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            PluginExceptionsKt.throwMissingFieldException(i, 3, Currency$$serializer.INSTANCE.getDescriptor());
            int i4 = component2 + 109;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 5;
            } else {
                int i6 = 2 % 2;
            }
        }
        this.iso = str;
        this.name = str2;
    }

    @JvmStatic
    public static final void write$Self$ConsumerSfcUiMpesaGlobal_release(Currency self, CompositeEncoder output, SerialDescriptor serialDesc) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            output.encodeStringElement(serialDesc, 0, self.iso);
            output.encodeStringElement(serialDesc, 0, self.name);
        } else {
            output.encodeStringElement(serialDesc, 0, self.iso);
            output.encodeStringElement(serialDesc, 1, self.name);
        }
        int i3 = component2 + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }

    public Currency(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.iso = str;
        this.name = str2;
    }

    public final String getIso() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 53;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iso;
        int i5 = i2 + 101;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 91;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 43;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = copydefault + 31;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static Currency copy$default(Currency currency, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 57;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = currency.iso;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 7;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str2 = currency.name;
            if (i7 != 0) {
                int i8 = 52 / 0;
            }
        }
        Currency currencyCopy = currency.copy(str, str2);
        int i9 = component3 + 107;
        component2 = i9 % 128;
        if (i9 % 2 == 0) {
            return currencyCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.iso;
        int i5 = i3 + 23;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 61;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Currency copy(String iso, String name) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(iso, "");
        Intrinsics.checkNotNullParameter(name, "");
        Currency currency = new Currency(iso, name);
        int i2 = component2 + 105;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return currency;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component2 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 103;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Currency)) {
            int i5 = i2 + 53;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        Currency currency = (Currency) other;
        if (Intrinsics.areEqual(this.iso, currency.iso)) {
            return Intrinsics.areEqual(this.name, currency.name);
        }
        int i7 = component3 + 19;
        component2 = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.iso.hashCode();
        return i3 == 0 ? (iHashCode >>> 7) / this.name.hashCode() : (iHashCode * 31) + this.name.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Currency(iso=" + this.iso + ", name=" + this.name + ')';
        int i2 = component3 + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.iso);
        dest.writeString(this.name);
        int i4 = component2 + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
