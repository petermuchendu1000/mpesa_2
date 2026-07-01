package com.huawei.digitalpayment.consumer.base.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.engine.common.track.watchdog.ARiverTrackWatchDogEventConstant;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyAirtimeTypes;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 52\u00020\u0001:\u00015BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f0\u001e0\u001dH\u0016J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003Jc\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0006\u0010*\u001a\u00020+J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010.\u001a\u00020+HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0012¨\u00066"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/reporting/BuyBundlesEvent;", "Lcom/huawei/digitalpayment/consumer/base/reporting/MarketingEventPayload;", "successful", "", "bundleValue", "", "bundleCost", "bundleClass", "paymentType", "msisdn", "bundleType", "g3Identity", "appSession", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSuccessful", "()Z", "getBundleValue", "()Ljava/lang/String;", "getBundleCost", "getBundleClass", "getPaymentType", "getMsisdn", "getBundleType", "getG3Identity", "getAppSession", "eventName", "getEventName", "toAttributes", "", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuyBundlesEvent implements MarketingEventPayload {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;
    private final String appSession;
    private final String bundleClass;
    private final String bundleCost;
    private final String bundleType;
    private final String bundleValue;
    private final String g3Identity;
    private final String msisdn;
    private final String paymentType;
    private final boolean successful;

    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<BuyBundlesEvent> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BuyBundlesEvent> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BuyBundlesEvent createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = component3 + 23;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readInt();
                throw null;
            }
            if (parcel.readInt() != 0) {
                int i4 = component1 + 65;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            return new BuyBundlesEvent(z, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override
        public BuyBundlesEvent createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 51;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BuyBundlesEvent[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 61;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            BuyBundlesEvent[] buyBundlesEventArr = new BuyBundlesEvent[i];
            int i6 = i4 + 109;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return buyBundlesEventArr;
        }

        @Override
        public BuyBundlesEvent[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 73;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            BuyBundlesEvent[] buyBundlesEventArrNewArray = newArray(i);
            int i4 = component1 + 65;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return buyBundlesEventArrNewArray;
            }
            throw null;
        }
    }

    public BuyBundlesEvent(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.successful = z;
        this.bundleValue = str;
        this.bundleCost = str2;
        this.bundleClass = str3;
        this.paymentType = str4;
        this.msisdn = str5;
        this.bundleType = str6;
        this.g3Identity = str7;
        this.appSession = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BuyBundlesEvent(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        String str10;
        if ((i & 128) != 0) {
            int i2 = ShareDataUIState + 17;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            str9 = "";
        } else {
            str9 = str7;
        }
        if ((i & 256) != 0) {
            int i4 = component2 + 87;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str10 = "";
        } else {
            str10 = str8;
        }
        this(z, str, str2, str3, str4, str5, str6, str9, str10);
    }

    public final boolean getSuccessful() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 41;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.successful;
        int i5 = i2 + 23;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getBundleValue() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bundleValue;
        int i5 = i2 + 43;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBundleCost() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.bundleCost;
            int i4 = 37 / 0;
        } else {
            str = this.bundleCost;
        }
        int i5 = i3 + 121;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return str;
    }

    public final String getBundleClass() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.bundleClass;
            int i4 = 61 / 0;
        } else {
            str = this.bundleClass;
        }
        int i5 = i3 + 85;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPaymentType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 3;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.paymentType;
        int i5 = i2 + 71;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBundleType() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.bundleType;
            int i4 = 67 / 0;
        } else {
            str = this.bundleType;
        }
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getG3Identity() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.g3Identity;
        int i5 = i3 + 57;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAppSession() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.appSession;
        int i4 = i2 + 45;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public String getEventName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 109;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return "buyBundles";
    }

    @Override
    public List<Map<String, Object>> toAttributes() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List<Map<String, Object>> listListOf = CollectionsKt.listOf((Object[]) new Map[]{MapsKt.mapOf(TuplesKt.to("key", "successful"), TuplesKt.to("value", Boolean.valueOf(this.successful))), MapsKt.mapOf(TuplesKt.to("key", "bundleValue"), TuplesKt.to("value", this.bundleValue)), MapsKt.mapOf(TuplesKt.to("key", "bundleCost"), TuplesKt.to("value", this.bundleCost)), MapsKt.mapOf(TuplesKt.to("key", "bundleClass"), TuplesKt.to("value", this.bundleClass)), MapsKt.mapOf(TuplesKt.to("key", "paymentType"), TuplesKt.to("value", this.paymentType)), MapsKt.mapOf(TuplesKt.to("key", "MSISDN"), TuplesKt.to("value", this.msisdn)), MapsKt.mapOf(TuplesKt.to("key", "bundleType"), TuplesKt.to("value", this.bundleType)), MapsKt.mapOf(TuplesKt.to("key", "G3Identity"), TuplesKt.to("value", this.g3Identity)), MapsKt.mapOf(TuplesKt.to("key", "appSession"), TuplesKt.to("value", this.appSession))});
        int i4 = component2 + 75;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return listListOf;
    }

    static {
        int i = component1 + 65;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/reporting/BuyBundlesEvent$Companion;", "", "<init>", "()V", ARiverTrackWatchDogEventConstant.FLAG_START_UP_CREATE, "Lcom/huawei/digitalpayment/consumer/base/reporting/BuyBundlesEvent;", "bundleType", "", "bundleValue", "bundleCost", "bundleClass", "paymentType", "msisdn", "successful", "", "normalizePaymentType", "normalizeMsisdn", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component3 = 1;
        private static int copydefault;

        private Companion() {
        }

        public static BuyBundlesEvent create$default(Companion companion, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
            boolean z2;
            int i2 = 2 % 2;
            int i3 = copydefault + 15;
            int i4 = i3 % 128;
            component3 = i4;
            if (i3 % 2 != 0 ? (i & 64) == 0 : (i & 29) == 0) {
                z2 = z;
            } else {
                int i5 = i4 + 29;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                z2 = true;
            }
            BuyBundlesEvent buyBundlesEventCreate = companion.create(str, str2, str3, str4, str5, str6, z2);
            int i7 = component3 + 83;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 95 / 0;
            }
            return buyBundlesEventCreate;
        }

        @JvmStatic
        public final BuyBundlesEvent create(String bundleType, String bundleValue, String bundleCost, String bundleClass, String paymentType, String msisdn, boolean successful) {
            int i = 2 % 2;
            int i2 = component3 + 85;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(bundleType, "");
            Intrinsics.checkNotNullParameter(bundleValue, "");
            Intrinsics.checkNotNullParameter(bundleCost, "");
            Intrinsics.checkNotNullParameter(bundleClass, "");
            Intrinsics.checkNotNullParameter(paymentType, "");
            Intrinsics.checkNotNullParameter(msisdn, "");
            String strShareDataUIState = ShareDataUIState(paymentType);
            String strComponent2 = component2(msisdn);
            String str = bundleType;
            if (StringsKt.isBlank(str)) {
                str = "data";
            }
            BuyBundlesEvent buyBundlesEvent = new BuyBundlesEvent(successful, bundleValue, bundleCost, bundleClass, strShareDataUIState, strComponent2, str, "", "");
            int i4 = component3 + 55;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return buyBundlesEvent;
        }

        private final String ShareDataUIState(String str) {
            int i = 2 % 2;
            int i2 = component3 + 61;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            String string = StringsKt.trim(str).toString();
            if (StringsKt.isBlank(string)) {
                return "";
            }
            if (StringsKt.equals(string, "m-pesa", true) || StringsKt.equals(string, BuyAirtimeTypes.MPESA, true)) {
                return Keys.PAY_METHOD_MPESA;
            }
            if (!StringsKt.equals(string, "airtime", true)) {
                return (!(StringsKt.equals(string, BuyAirtimeTypes.BONGA, true) ^ true) || StringsKt.equals(string, "bonga points", true)) ? Keys.PAY_METHOD_BONGA : string;
            }
            int i4 = copydefault + 41;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return Keys.PAY_METHOD_AIRTIME;
        }

        private final String component2(String str) {
            int i = 2 % 2;
            int i2 = copydefault + 93;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            if (!StringsKt.isBlank(str)) {
                return SfcPhoneNumberUtil.INSTANCE.formatterInputPhoneNumber(str);
            }
            int i4 = component3 + 117;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return "";
            }
            throw null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static BuyBundlesEvent copy$default(BuyBundlesEvent buyBundlesEvent, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        int i2 = 2 % 2;
        int i3 = component2 + 97;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        boolean z2 = (i & 1) != 0 ? buyBundlesEvent.successful : z;
        String str11 = (i & 2) != 0 ? buyBundlesEvent.bundleValue : str;
        String str12 = (i & 4) != 0 ? buyBundlesEvent.bundleCost : str2;
        String str13 = (i & 8) != 0 ? buyBundlesEvent.bundleClass : str3;
        if ((i & 16) != 0) {
            int i6 = i4 + 25;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                String str14 = buyBundlesEvent.paymentType;
                throw null;
            }
            str9 = buyBundlesEvent.paymentType;
        } else {
            str9 = str4;
        }
        String str15 = (i & 32) != 0 ? buyBundlesEvent.msisdn : str5;
        if ((i & 64) != 0) {
            str10 = buyBundlesEvent.bundleType;
            int i7 = i4 + 5;
            component2 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 5 % 2;
            }
        } else {
            str10 = str6;
        }
        BuyBundlesEvent buyBundlesEventCopy = buyBundlesEvent.copy(z2, str11, str12, str13, str9, str15, str10, (i & 128) != 0 ? buyBundlesEvent.g3Identity : str7, (i & 256) != 0 ? buyBundlesEvent.appSession : str8);
        int i9 = ShareDataUIState + 119;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return buyBundlesEventCopy;
    }

    @JvmStatic
    public static final BuyBundlesEvent create(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            INSTANCE.create(str, str2, str3, str4, str5, str6, z);
            throw null;
        }
        BuyBundlesEvent buyBundlesEventCreate = INSTANCE.create(str, str2, str3, str4, str5, str6, z);
        int i3 = ShareDataUIState + 39;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return buyBundlesEventCreate;
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.successful;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 39;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bundleValue;
        int i5 = i2 + 99;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.bundleCost;
        int i5 = i3 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.bundleClass;
        int i4 = i3 + 83;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.paymentType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msisdn;
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.bundleType;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return str;
    }

    public final String component8() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.g3Identity;
            int i4 = 9 / 0;
        } else {
            str = this.g3Identity;
        }
        int i5 = i3 + 7;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.appSession;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BuyBundlesEvent copy(boolean successful, String bundleValue, String bundleCost, String bundleClass, String paymentType, String msisdn, String bundleType, String g3Identity, String appSession) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundleValue, "");
        Intrinsics.checkNotNullParameter(bundleCost, "");
        Intrinsics.checkNotNullParameter(bundleClass, "");
        Intrinsics.checkNotNullParameter(paymentType, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(bundleType, "");
        Intrinsics.checkNotNullParameter(g3Identity, "");
        Intrinsics.checkNotNullParameter(appSession, "");
        BuyBundlesEvent buyBundlesEvent = new BuyBundlesEvent(successful, bundleValue, bundleCost, bundleClass, paymentType, msisdn, bundleType, g3Identity, appSession);
        int i2 = ShareDataUIState + 85;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return buyBundlesEvent;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyBundlesEvent)) {
            int i4 = i2 + 47;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        BuyBundlesEvent buyBundlesEvent = (BuyBundlesEvent) other;
        if (this.successful != buyBundlesEvent.successful) {
            return false;
        }
        if (!Intrinsics.areEqual(this.bundleValue, buyBundlesEvent.bundleValue)) {
            int i6 = component2 + 3;
            ShareDataUIState = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.bundleCost, buyBundlesEvent.bundleCost) || !Intrinsics.areEqual(this.bundleClass, buyBundlesEvent.bundleClass)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.paymentType, buyBundlesEvent.paymentType)) {
            int i7 = component2 + 67;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.msisdn, buyBundlesEvent.msisdn)) {
            int i9 = ShareDataUIState + 79;
            component2 = i9 % 128;
            return i9 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.bundleType, buyBundlesEvent.bundleType)) {
            int i10 = component2 + 33;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.g3Identity, buyBundlesEvent.g3Identity)) {
            int i12 = ShareDataUIState + 123;
            component2 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.appSession, buyBundlesEvent.appSession)) {
            return true;
        }
        int i14 = component2;
        int i15 = i14 + 1;
        ShareDataUIState = i15 % 128;
        int i16 = i15 % 2;
        int i17 = i14 + 73;
        ShareDataUIState = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 34 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((Boolean.hashCode(this.successful) * 31) + this.bundleValue.hashCode()) * 31) + this.bundleCost.hashCode()) * 31) + this.bundleClass.hashCode()) * 31) + this.paymentType.hashCode()) * 31) + this.msisdn.hashCode()) * 31) + this.bundleType.hashCode()) * 31) + this.g3Identity.hashCode()) * 31) + this.appSession.hashCode();
        int i4 = component2 + 29;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BuyBundlesEvent(successful=" + this.successful + ", bundleValue=" + this.bundleValue + ", bundleCost=" + this.bundleCost + ", bundleClass=" + this.bundleClass + ", paymentType=" + this.paymentType + ", msisdn=" + this.msisdn + ", bundleType=" + this.bundleType + ", g3Identity=" + this.g3Identity + ", appSession=" + this.appSession + ")";
        int i2 = ShareDataUIState + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.successful ? 1 : 0);
        dest.writeString(this.bundleValue);
        dest.writeString(this.bundleCost);
        dest.writeString(this.bundleClass);
        dest.writeString(this.paymentType);
        dest.writeString(this.msisdn);
        dest.writeString(this.bundleType);
        dest.writeString(this.g3Identity);
        dest.writeString(this.appSession);
        int i4 = ShareDataUIState + 17;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
