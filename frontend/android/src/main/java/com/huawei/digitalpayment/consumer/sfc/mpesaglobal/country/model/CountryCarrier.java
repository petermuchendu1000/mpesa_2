package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0012\u001a\u00020\bH\u0007J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\bH×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0007J%\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryCarrier;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "write$Self", BuyAirtimeTypes.SELF, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ConsumerSfcUiMpesaGlobal_release", "$serializer", "Companion", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final class CountryCarrier implements Parcelable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private final String id;
    private final String name;

    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CountryCarrier> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountryCarrier> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryCarrier createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CountryCarrier countryCarrier = new CountryCarrier(parcel.readString(), parcel.readString());
            int i2 = copydefault + 13;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return countryCarrier;
            }
            throw null;
        }

        @Override
        public CountryCarrier createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 101;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            CountryCarrier countryCarrierCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 97;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return countryCarrierCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryCarrier[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 69;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            CountryCarrier[] countryCarrierArr = new CountryCarrier[i];
            int i6 = i4 + 63;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 7 / 0;
            }
            return countryCarrierArr;
        }

        @Override
        public CountryCarrier[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 99;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            CountryCarrier[] countryCarrierArrNewArray = newArray(i);
            int i5 = component2 + 3;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return countryCarrierArrNewArray;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryCarrier$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryCarrier;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 1;
        private static int component3;

        public final KSerializer<CountryCarrier> serializer() {
            int i = 2 % 2;
            int i2 = component2 + 81;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            CountryCarrier$$serializer countryCarrier$$serializer = CountryCarrier$$serializer.INSTANCE;
            int i4 = component3 + 39;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return countryCarrier$$serializer;
        }

        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CountryCarrier(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            int i2 = component1 + 61;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            PluginExceptionsKt.throwMissingFieldException(i, 3, CountryCarrier$$serializer.INSTANCE.getDescriptor());
            int i4 = ShareDataUIState + 11;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.id = str;
        this.name = str2;
    }

    @JvmStatic
    public static final void write$Self$ConsumerSfcUiMpesaGlobal_release(CountryCarrier self, CompositeEncoder output, SerialDescriptor serialDesc) {
        int i = 2 % 2;
        int i2 = component1 + 5;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            output.encodeStringElement(serialDesc, 0, self.id);
            output.encodeStringElement(serialDesc, 0, self.name);
        } else {
            output.encodeStringElement(serialDesc, 0, self.id);
            output.encodeStringElement(serialDesc, 1, self.name);
        }
        int i3 = ShareDataUIState + 125;
        component1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public CountryCarrier(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.name = str2;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 27;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 81;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static CountryCarrier copy$default(CountryCarrier countryCarrier, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 99;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 77;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str = countryCarrier.id;
        }
        if ((i & 2) != 0) {
            str2 = countryCarrier.name;
        }
        return countryCarrier.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 71;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 107;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        int i4 = i3 + 25;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return str;
    }

    public final CountryCarrier copy(String id, String name) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(name, "");
        CountryCarrier countryCarrier = new CountryCarrier(id, name);
        int i2 = ShareDataUIState + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return countryCarrier;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 55;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof CountryCarrier)) {
            return false;
        }
        CountryCarrier countryCarrier = (CountryCarrier) other;
        if (Intrinsics.areEqual(this.id, countryCarrier.id)) {
            return !(Intrinsics.areEqual(this.name, countryCarrier.name) ^ true);
        }
        int i6 = ShareDataUIState + 1;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.id.hashCode() * 31) + this.name.hashCode();
        int i4 = component1 + 45;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CountryCarrier(id=" + this.id + ", name=" + this.name + ')';
        int i2 = component1 + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.id);
        dest.writeString(this.name);
        int i4 = ShareDataUIState + 51;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
