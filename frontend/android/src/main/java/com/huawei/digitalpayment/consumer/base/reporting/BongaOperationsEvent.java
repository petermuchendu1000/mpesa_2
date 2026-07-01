package com.huawei.digitalpayment.consumer.base.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.engine.common.track.watchdog.ARiverTrackWatchDogEventConstant;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00160\u0015H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f¨\u0006,"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/reporting/BongaOperationsEvent;", "Lcom/huawei/digitalpayment/consumer/base/reporting/MarketingEventPayload;", "redemptionType", "", "pointsUsed", "redemptionDetails", "msisdn", "g3Identity", "appSession", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRedemptionType", "()Ljava/lang/String;", "getPointsUsed", "getRedemptionDetails", "getMsisdn", "getG3Identity", "getAppSession", "eventName", "getEventName", "toAttributes", "", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaOperationsEvent implements MarketingEventPayload {
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String appSession;
    private final String g3Identity;
    private final String msisdn;
    private final String pointsUsed;
    private final String redemptionDetails;
    private final String redemptionType;

    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<BongaOperationsEvent> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BongaOperationsEvent> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaOperationsEvent createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BongaOperationsEvent bongaOperationsEvent = new BongaOperationsEvent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 107;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return bongaOperationsEvent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public BongaOperationsEvent createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 111;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            BongaOperationsEvent bongaOperationsEventCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 63;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return bongaOperationsEventCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaOperationsEvent[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 101;
            component1 = i3 % 128;
            BongaOperationsEvent[] bongaOperationsEventArr = new BongaOperationsEvent[i];
            if (i3 % 2 == 0) {
                int i4 = 10 / 0;
            }
            return bongaOperationsEventArr;
        }

        @Override
        public BongaOperationsEvent[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 97;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            BongaOperationsEvent[] bongaOperationsEventArrNewArray = newArray(i);
            int i5 = component1 + 27;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return bongaOperationsEventArrNewArray;
        }
    }

    public BongaOperationsEvent(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.redemptionType = str;
        this.pointsUsed = str2;
        this.redemptionDetails = str3;
        this.msisdn = str4;
        this.g3Identity = str5;
        this.appSession = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BongaOperationsEvent(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        if ((i & 16) != 0) {
            int i2 = component1 + 79;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str7 = "";
        } else {
            str7 = str5;
        }
        if ((i & 32) != 0) {
            int i5 = component3 + 25;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i6 = 2 % 2;
            str8 = "";
        } else {
            str8 = str6;
        }
        this(str, str2, str3, str4, str7, str8);
    }

    public final String getRedemptionType() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.redemptionType;
        int i5 = i3 + 63;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPointsUsed() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.pointsUsed;
        }
        throw null;
    }

    public final String getRedemptionDetails() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.redemptionDetails;
        int i5 = i3 + 123;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 97;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 101;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getG3Identity() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.g3Identity;
        int i5 = i2 + 81;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAppSession() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appSession;
        int i5 = i2 + 19;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String getEventName() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return "bongaOperations";
        }
        int i3 = 10 / 0;
        return "bongaOperations";
    }

    @Override
    public List<Map<String, Object>> toAttributes() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        List<Map<String, Object>> listListOf = CollectionsKt.listOf((Object[]) new Map[]{MapsKt.mapOf(TuplesKt.to("key", "successful"), TuplesKt.to("value", true)), MapsKt.mapOf(TuplesKt.to("key", "redemptionType"), TuplesKt.to("value", this.redemptionType)), MapsKt.mapOf(TuplesKt.to("key", "pointsUsed"), TuplesKt.to("value", this.pointsUsed)), MapsKt.mapOf(TuplesKt.to("key", "redemptionDetails"), TuplesKt.to("value", this.redemptionDetails)), MapsKt.mapOf(TuplesKt.to("key", "MSISDN"), TuplesKt.to("value", this.msisdn)), MapsKt.mapOf(TuplesKt.to("key", "G3Identity"), TuplesKt.to("value", this.g3Identity)), MapsKt.mapOf(TuplesKt.to("key", "appSession"), TuplesKt.to("value", this.appSession))});
        int i4 = component1 + 77;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return listListOf;
    }

    static {
        int i = component2 + 121;
        copydefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007J(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007J0\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007J \u0010\u0013\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/reporting/BongaOperationsEvent$Companion;", "", "<init>", "()V", ARiverTrackWatchDogEventConstant.FLAG_START_UP_CREATE, "Lcom/huawei/digitalpayment/consumer/base/reporting/BongaOperationsEvent;", "resourceName", "", "resourceUnit", "pointsUsed", "msisdn", "createForBongaTill", "tillNumber", "merchantName", "createForBongaPaybill", "paybillNumber", "accountNumber", "createForDonation", "orgName", "createForTransfer", "recipientMsisdn", "normalizeRedemptionType", "normalizeMsisdn", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        private Companion() {
        }

        @JvmStatic
        public final BongaOperationsEvent create(String resourceName, String resourceUnit, String pointsUsed, String msisdn) {
            String string;
            int i = 2 % 2;
            int i2 = copydefault + 119;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(resourceName, "");
                Intrinsics.checkNotNullParameter(resourceUnit, "");
                Intrinsics.checkNotNullParameter(pointsUsed, "");
                Intrinsics.checkNotNullParameter(msisdn, "");
                ShareDataUIState(resourceName).length();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(resourceName, "");
            Intrinsics.checkNotNullParameter(resourceUnit, "");
            Intrinsics.checkNotNullParameter(pointsUsed, "");
            Intrinsics.checkNotNullParameter(msisdn, "");
            String strShareDataUIState = ShareDataUIState(resourceName);
            if (strShareDataUIState.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(strShareDataUIState.charAt(0));
                Intrinsics.checkNotNull(strValueOf, "");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                sb.append((Object) upperCase);
                String strSubstring = strShareDataUIState.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                sb.append(strSubstring);
                string = sb.toString();
                int i3 = copydefault + 43;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
            } else {
                string = strShareDataUIState;
            }
            return new BongaOperationsEvent("RedeemBonga_" + string, pointsUsed, "resource=" + strShareDataUIState + "|unit=" + resourceUnit, component3(msisdn), null, null, 48, null);
        }

        @JvmStatic
        public final BongaOperationsEvent createForBongaTill(String pointsUsed, String tillNumber, String merchantName, String msisdn) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 99;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(pointsUsed, "");
                Intrinsics.checkNotNullParameter(tillNumber, "");
                Intrinsics.checkNotNullParameter(merchantName, "");
                Intrinsics.checkNotNullParameter(msisdn, "");
                StringsKt.isBlank(merchantName);
                throw null;
            }
            Intrinsics.checkNotNullParameter(pointsUsed, "");
            Intrinsics.checkNotNullParameter(tillNumber, "");
            Intrinsics.checkNotNullParameter(merchantName, "");
            Intrinsics.checkNotNullParameter(msisdn, "");
            String str = merchantName;
            if (StringsKt.isBlank(str)) {
                int i3 = ShareDataUIState;
                int i4 = i3 + 11;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 7;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                str = "Unknown";
            }
            return new BongaOperationsEvent("LipaNaBonga_BuyGoods", pointsUsed, "till=" + tillNumber + "|merchant=" + ((Object) str), component3(msisdn), null, null, 48, null);
        }

        @JvmStatic
        public final BongaOperationsEvent createForBongaPaybill(String pointsUsed, String paybillNumber, String accountNumber, String merchantName, String msisdn) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(pointsUsed, "");
            Intrinsics.checkNotNullParameter(paybillNumber, "");
            Intrinsics.checkNotNullParameter(accountNumber, "");
            Intrinsics.checkNotNullParameter(merchantName, "");
            Intrinsics.checkNotNullParameter(msisdn, "");
            String str = merchantName;
            if (StringsKt.isBlank(str)) {
                int i2 = copydefault + 95;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                str = "Unknown";
            }
            BongaOperationsEvent bongaOperationsEvent = new BongaOperationsEvent("LipaNaBonga_PayBill", pointsUsed, "paybill=" + paybillNumber + "|account=" + accountNumber + "|name=" + ((Object) str), component3(msisdn), null, null, 48, null);
            int i3 = ShareDataUIState + 93;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return bongaOperationsEvent;
        }

        @JvmStatic
        public final BongaOperationsEvent createForDonation(String pointsUsed, String orgName, String paybillNumber, String accountNumber, String msisdn) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 77;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(pointsUsed, "");
            Intrinsics.checkNotNullParameter(orgName, "");
            Intrinsics.checkNotNullParameter(paybillNumber, "");
            Intrinsics.checkNotNullParameter(accountNumber, "");
            Intrinsics.checkNotNullParameter(msisdn, "");
            String str = orgName;
            if (StringsKt.isBlank(str)) {
                int i4 = copydefault + 81;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                str = "Unknown";
            }
            return new BongaOperationsEvent("DonateBonga_PayBill", pointsUsed, "org=" + ((Object) str) + "|paybill=" + paybillNumber + "|account=" + accountNumber, component3(msisdn), null, null, 48, null);
        }

        @JvmStatic
        public final BongaOperationsEvent createForTransfer(String pointsUsed, String recipientMsisdn, String msisdn) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(pointsUsed, "");
            Intrinsics.checkNotNullParameter(recipientMsisdn, "");
            Intrinsics.checkNotNullParameter(msisdn, "");
            BongaOperationsEvent bongaOperationsEvent = new BongaOperationsEvent("TransferBonga", pointsUsed, "recipient=" + recipientMsisdn, component3(msisdn), null, null, 48, null);
            int i2 = copydefault + 93;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return bongaOperationsEvent;
        }

        private final String ShareDataUIState(String str) {
            int i = 2 % 2;
            int i2 = copydefault + 89;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String lowerCase = StringsKt.trim(str).toString().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String str2 = lowerCase;
            String str3 = "airtime";
            Object obj = null;
            if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) "airtime", false, 2, (Object) null)) {
                if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) "internet", false, 2, (Object) null)) {
                    if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "data", false, 2, (Object) null)) {
                        int i4 = ShareDataUIState + 99;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                    } else {
                        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "minute", false, 2, (Object) null)) {
                            int i6 = ShareDataUIState + 27;
                            copydefault = i6 % 128;
                            int i7 = i6 % 2;
                            return "minutes";
                        }
                        str3 = Keys.BUNDLE_TYPE_SMS;
                        if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) Keys.BUNDLE_TYPE_SMS, false, 2, (Object) null)) {
                            str3 = "mms";
                            if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) "mms", false, 2, (Object) null)) {
                                return !StringsKt.isBlank(str2) ? lowerCase : "unknown";
                            }
                        }
                    }
                }
                int i8 = ShareDataUIState + 75;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
                return "data";
            }
            int i10 = ShareDataUIState + 57;
            copydefault = i10 % 128;
            if (i10 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            return str3;
        }

        private final String component3(String str) {
            int i = 2 % 2;
            int i2 = copydefault + 29;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                if (!StringsKt.isBlank(str)) {
                    return SfcPhoneNumberUtil.INSTANCE.formatterInputPhoneNumber(str);
                }
                int i3 = ShareDataUIState + 31;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return "";
            }
            StringsKt.isBlank(str);
            throw null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static BongaOperationsEvent copy$default(BongaOperationsEvent bongaOperationsEvent, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 89;
        component3 = i4 % 128;
        String str9 = (i4 % 2 == 0 && (i & 1) != 0) ? bongaOperationsEvent.redemptionType : str;
        String str10 = (i & 2) != 0 ? bongaOperationsEvent.pointsUsed : str2;
        if ((i & 4) != 0) {
            int i5 = i3 + 15;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            str7 = bongaOperationsEvent.redemptionDetails;
        } else {
            str7 = str3;
        }
        String str11 = (i & 8) != 0 ? bongaOperationsEvent.msisdn : str4;
        if ((i & 16) != 0) {
            int i7 = component3 + 15;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            str8 = bongaOperationsEvent.g3Identity;
        } else {
            str8 = str5;
        }
        return bongaOperationsEvent.copy(str9, str10, str7, str11, str8, (i & 32) != 0 ? bongaOperationsEvent.appSession : str6);
    }

    @JvmStatic
    public static final BongaOperationsEvent create(String str, String str2, String str3, String str4) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        BongaOperationsEvent bongaOperationsEventCreate = INSTANCE.create(str, str2, str3, str4);
        int i4 = component1 + 125;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return bongaOperationsEventCreate;
    }

    @JvmStatic
    public static final BongaOperationsEvent createForBongaPaybill(String str, String str2, String str3, String str4, String str5) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return INSTANCE.createForBongaPaybill(str, str2, str3, str4, str5);
        }
        BongaOperationsEvent bongaOperationsEventCreateForBongaPaybill = INSTANCE.createForBongaPaybill(str, str2, str3, str4, str5);
        int i3 = 15 / 0;
        return bongaOperationsEventCreateForBongaPaybill;
    }

    @JvmStatic
    public static final BongaOperationsEvent createForBongaTill(String str, String str2, String str3, String str4) {
        BongaOperationsEvent bongaOperationsEventCreateForBongaTill;
        int i = 2 % 2;
        int i2 = component1 + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            bongaOperationsEventCreateForBongaTill = INSTANCE.createForBongaTill(str, str2, str3, str4);
            int i3 = 43 / 0;
        } else {
            bongaOperationsEventCreateForBongaTill = INSTANCE.createForBongaTill(str, str2, str3, str4);
        }
        int i4 = component1 + 97;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return bongaOperationsEventCreateForBongaTill;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final BongaOperationsEvent createForDonation(String str, String str2, String str3, String str4, String str5) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        BongaOperationsEvent bongaOperationsEventCreateForDonation = INSTANCE.createForDonation(str, str2, str3, str4, str5);
        int i4 = component1 + 53;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return bongaOperationsEventCreateForDonation;
    }

    @JvmStatic
    public static final BongaOperationsEvent createForTransfer(String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        BongaOperationsEvent bongaOperationsEventCreateForTransfer = INSTANCE.createForTransfer(str, str2, str3);
        int i4 = component1 + 7;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return bongaOperationsEventCreateForTransfer;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 79;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.redemptionType;
        int i4 = i2 + 87;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.pointsUsed;
        int i5 = i3 + 67;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 29;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.redemptionDetails;
        int i5 = i2 + 7;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 73;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 93;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.g3Identity;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 55;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appSession;
        int i5 = i2 + 107;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final BongaOperationsEvent copy(String redemptionType, String pointsUsed, String redemptionDetails, String msisdn, String g3Identity, String appSession) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(redemptionType, "");
        Intrinsics.checkNotNullParameter(pointsUsed, "");
        Intrinsics.checkNotNullParameter(redemptionDetails, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(g3Identity, "");
        Intrinsics.checkNotNullParameter(appSession, "");
        BongaOperationsEvent bongaOperationsEvent = new BongaOperationsEvent(redemptionType, pointsUsed, redemptionDetails, msisdn, g3Identity, appSession);
        int i2 = component1 + 113;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
        return bongaOperationsEvent;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 47;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 61;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof BongaOperationsEvent)) {
            int i4 = i2 + 107;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        BongaOperationsEvent bongaOperationsEvent = (BongaOperationsEvent) other;
        if (!Intrinsics.areEqual(this.redemptionType, bongaOperationsEvent.redemptionType)) {
            int i6 = component1 + 21;
            component3 = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.pointsUsed, bongaOperationsEvent.pointsUsed) || !Intrinsics.areEqual(this.redemptionDetails, bongaOperationsEvent.redemptionDetails)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.msisdn, bongaOperationsEvent.msisdn)) {
            int i7 = component1 + 41;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.g3Identity, bongaOperationsEvent.g3Identity)) {
            return false;
        }
        if (Intrinsics.areEqual(this.appSession, bongaOperationsEvent.appSession)) {
            return true;
        }
        int i9 = component3 + 99;
        component1 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.redemptionType.hashCode() * 31) + this.pointsUsed.hashCode()) * 31) + this.redemptionDetails.hashCode()) * 31) + this.msisdn.hashCode()) * 31) + this.g3Identity.hashCode()) * 31) + this.appSession.hashCode();
        int i4 = component3 + 115;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaOperationsEvent(redemptionType=" + this.redemptionType + ", pointsUsed=" + this.pointsUsed + ", redemptionDetails=" + this.redemptionDetails + ", msisdn=" + this.msisdn + ", g3Identity=" + this.g3Identity + ", appSession=" + this.appSession + ")";
        int i2 = component1 + 25;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 11 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.redemptionType);
        dest.writeString(this.pointsUsed);
        dest.writeString(this.redemptionDetails);
        dest.writeString(this.msisdn);
        dest.writeString(this.g3Identity);
        dest.writeString(this.appSession);
        int i4 = component1 + 75;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
