package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\u009b\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÇ\u0001J\b\u00104\u001a\u000205H\u0007J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H×\u0003J\t\u0010:\u001a\u000205H×\u0001J\t\u0010;\u001a\u00020\u0003H×\u0001J\u0018\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000205H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006A"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkMpesaPurchaseRequest;", "Landroid/os/Parcelable;", "partyAMsisdn", "", "partyBMsisdn", "offeringId", "offerPrice", "okoaAmount", "channelSessionId", "useOD", "fulizaAmount", "securityCredential", "tariff", "offerName", "locationId", "cnOfferId", "gsmResource", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkGsmResource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPartyAMsisdn", "()Ljava/lang/String;", "getPartyBMsisdn", "getOfferingId", "getOfferPrice", "getOkoaAmount", "getChannelSessionId", "getUseOD", "getFulizaAmount", "getSecurityCredential", "getTariff", "getOfferName", "getLocationId", "getCnOfferId", "getGsmResource", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EasyTalkMpesaPurchaseRequest implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EasyTalkMpesaPurchaseRequest> CREATOR;
    private static long ShareDataUIState;
    private static int component1;
    private static int component2;
    private static char copydefault;

    @SerializedName("channelSessionId")
    private final String channelSessionId;

    @SerializedName("cnOfferId")
    private final String cnOfferId;

    @SerializedName("fulizaAmount")
    private final String fulizaAmount;

    @SerializedName("gsmResource")
    private final List<EasyTalkGsmResource> gsmResource;

    @SerializedName("locationId")
    private final String locationId;

    @SerializedName("offerName")
    private final String offerName;

    @SerializedName("offerPrice")
    private final String offerPrice;

    @SerializedName("offeringId")
    private final String offeringId;

    @SerializedName("okoaAmount")
    private final String okoaAmount;

    @SerializedName("partyAMsisdn")
    private final String partyAMsisdn;

    @SerializedName("partyBMsisdn")
    private final String partyBMsisdn;

    @SerializedName("securityCredential")
    private final String securityCredential;

    @SerializedName("tariff")
    private final String tariff;

    @SerializedName("useOD")
    private final String useOD;
    private static final byte[] $$c = {Ascii.SI, -112, -70, -94};
    private static final int $$d = 38;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {94, -53, Ascii.FS, -60, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48};
    private static final int $$b = 110;
    private static int component4 = 0;
    private static int copy = 1;
    private static int component3 = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EasyTalkMpesaPurchaseRequest> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EasyTalkMpesaPurchaseRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = i2;
                int i5 = component3 + 49;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                arrayList.add(EasyTalkGsmResource.CREATOR.createFromParcel(parcel));
                i3++;
                string12 = string12;
                i2 = i4;
            }
            EasyTalkMpesaPurchaseRequest easyTalkMpesaPurchaseRequest = new EasyTalkMpesaPurchaseRequest(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, arrayList);
            int i7 = ShareDataUIState + 47;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return easyTalkMpesaPurchaseRequest;
        }

        @Override
        public EasyTalkMpesaPurchaseRequest createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 13;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            EasyTalkMpesaPurchaseRequest easyTalkMpesaPurchaseRequestCreateFromParcel = createFromParcel(parcel);
            int i3 = component3 + 7;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return easyTalkMpesaPurchaseRequestCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EasyTalkMpesaPurchaseRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 105;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            EasyTalkMpesaPurchaseRequest[] easyTalkMpesaPurchaseRequestArr = new EasyTalkMpesaPurchaseRequest[i];
            int i6 = i3 + 77;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                return easyTalkMpesaPurchaseRequestArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public EasyTalkMpesaPurchaseRequest[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 83;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r5, byte r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r5 = 3 - r5
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkMpesaPurchaseRequest.$$c
            int r6 = r6 * 4
            int r1 = r6 + 1
            int r7 = r7 + 98
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L14
            r3 = r2
            r2 = r5
            goto L2d
        L14:
            r4 = r7
            r7 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            int r7 = r7 + 1
            if (r2 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L27:
            r3 = r0[r7]
            r4 = r2
            r2 = r7
            r7 = r3
            r3 = r4
        L2d:
            int r7 = -r7
            int r5 = r5 + r7
            r7 = r2
            r2 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkMpesaPurchaseRequest.$$e(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 37 - r6
            int r8 = r8 * 16
            int r8 = 99 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkMpesaPurchaseRequest.$$a
            int r7 = r7 * 6
            int r1 = 16 - r7
            byte[] r1 = new byte[r1]
            int r7 = 15 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r6
            int r6 = r3 + (-17)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkMpesaPurchaseRequest.a(int, int, short, java.lang.Object[]):void");
    }

    public EasyTalkMpesaPurchaseRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<EasyTalkGsmResource> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.partyAMsisdn = str;
        this.partyBMsisdn = str2;
        this.offeringId = str3;
        this.offerPrice = str4;
        this.okoaAmount = str5;
        this.channelSessionId = str6;
        this.useOD = str7;
        this.fulizaAmount = str8;
        this.securityCredential = str9;
        this.tariff = str10;
        this.offerName = str11;
        this.locationId = str12;
        this.cnOfferId = str13;
        this.gsmResource = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EasyTalkMpesaPurchaseRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str14;
        String str15;
        String str16;
        String str17 = (i & 16) != 0 ? "0" : str5;
        if ((i & 64) != 0) {
            int i2 = 2 % 2;
            str14 = "0";
        } else {
            str14 = str7;
        }
        if ((i & 128) != 0) {
            int i3 = component4 + 69;
            copy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str15 = "0";
        } else {
            str15 = str8;
        }
        if ((i & 2048) != 0) {
            int i6 = component4 + 83;
            copy = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str16 = "";
        } else {
            str16 = str12;
        }
        this(str, str2, str3, str4, str17, str6, str14, str15, str9, str10, str11, str16, str13, (i & 8192) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getPartyAMsisdn() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 5;
        copy = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.partyAMsisdn;
        int i4 = i2 + 49;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getPartyBMsisdn() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 19;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.partyBMsisdn;
        int i4 = i2 + 51;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getOfferingId() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 111;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.offeringId;
        int i4 = i2 + 95;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getOfferPrice() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 125;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerPrice;
        int i5 = i2 + 95;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getOkoaAmount() {
        String str;
        int i = 2 % 2;
        int i2 = component4 + 93;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            str = this.okoaAmount;
            int i4 = 55 / 0;
        } else {
            str = this.okoaAmount;
        }
        int i5 = i3 + 49;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getChannelSessionId() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 43;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.channelSessionId;
        int i5 = i2 + 35;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getUseOD() {
        int i = 2 % 2;
        int i2 = component4 + 29;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.useOD;
        int i4 = i3 + 21;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getFulizaAmount() {
        int i = 2 % 2;
        int i2 = copy + 95;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.fulizaAmount;
        int i5 = i3 + 15;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getSecurityCredential() {
        int i = 2 % 2;
        int i2 = copy + 85;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.securityCredential;
        }
        throw null;
    }

    public final String getTariff() {
        int i = 2 % 2;
        int i2 = component4 + 51;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tariff;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOfferName() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 123;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerName;
        int i5 = i2 + 45;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLocationId() {
        String str;
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 95;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.locationId;
            int i4 = 53 / 0;
        } else {
            str = this.locationId;
        }
        int i5 = i2 + 47;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCnOfferId() {
        int i = 2 % 2;
        int i2 = component4 + 29;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.cnOfferId;
        int i5 = i3 + 123;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<EasyTalkGsmResource> getGsmResource() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 31;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        List<EasyTalkGsmResource> list = this.gsmResource;
        int i5 = i2 + 105;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    private static void b(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i3 = $10 + 93;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4036 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 30 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (Color.argb(0, 0, 0, 0) + 19181), 1912513118, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - View.MeasureSpec.getMode(0), 11 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (ViewConfiguration.getTouchSlop() >> 8), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - (KeyEvent.getMaxKeyCode() >> 16), 28 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 931716605, false, $$e(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 7568, View.resolveSize(0, 0) + 11, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (ShareDataUIState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component1) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i5 = $10 + 27;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $11 + 61;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Type inference failed for: r2v143, types: [boolean, int] */
    public boolean equals(Object other) throws Throwable {
        Object[] objArr;
        char c2;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = component4 + 91;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
        if (objCopydefault == null) {
            int i4 = 999 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iMyPid = 31 - (Process.myPid() >> 22);
            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 61686);
            byte b2 = (byte) 0;
            Object[] objArr3 = new Object[1];
            a((byte) ($$a[5] + 1), b2, (byte) (b2 + 1), objArr3);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4, iMyPid, bitsPerPixel, -1638177773, false, (String) objArr3[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr4 = new Object[1];
        b((char) (KeyEvent.getMaxKeyCode() >> 16), ViewConfiguration.getScrollBarSize() >> 8, new char[]{17901, 6027, 19967, 24860, 59908, 30872, 46808, 37155, 60063, 38699, 9206, 18958, 43629, 9729, 34328, 17253, 49865, 28349, 38633, 63665, 15027, 12123}, new char[]{56731, 43171, 25953, 21456}, new char[]{6614, 57423, 46589, 53550}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9259), ((Process.getThreadPriority(0) + 20) >> 6) + 897902194, new char[]{32541, 54133, 1898, 32262, 18241, 41522, 16910, 44987, 27541, 27588, 47600, 767, 40982, 9012, 30481}, new char[]{29255, 34022, 11317, 64292}, new char[]{6614, 57423, 46589, 53550}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
        if (objCopydefault2 == null) {
            int iMyPid2 = 999 - (Process.myPid() >> 22);
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 32;
            char longPressTimeout = (char) (61685 - (ViewConfiguration.getLongPressTimeout() >> 16));
            byte b3 = (byte) ($$b & 23);
            byte b4 = (byte) (b3 - 5);
            Object[] objArr6 = new Object[1];
            a(b3, b4, (byte) (b4 - 1), objArr6);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iMyPid2, packedPositionChild, longPressTimeout, 1267259187, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
            if (objCopydefault3 == null) {
                int iLastIndexOf = 998 - TextUtils.lastIndexOf("", '0', 0, 0);
                int pressedStateDuration = 31 - (ViewConfiguration.getPressedStateDuration() >> 16);
                char c3 = (char) (61685 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                byte b5 = (byte) ($$a[7] - 1);
                byte b6 = (byte) (b5 - 2);
                Object[] objArr7 = new Object[1];
                a(b5, b6, (byte) (b6 - 1), objArr7);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, pressedStateDuration, c3, 1267122354, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr8[2])[0];
            int i6 = ((int[]) objArr8[1])[0];
            int i7 = ~((int) Runtime.getRuntime().freeMemory());
            int i8 = ~(622524129 | i7);
            int i9 = (-1088408979) + ((i8 | 126949264) * 764) + (((~(i7 | 126949264)) | 537583713) * (-1528)) + ((579592561 | i8) * 764) + 1571287180;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
        } else {
            try {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2218 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 45, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), -2019038240, false, null, new Class[0]);
                }
                Object[] objArr9 = {null, ((Constructor) objCopydefault4).newInstance(null), 1571287180, 1};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                if (objCopydefault5 == null) {
                    int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 1000;
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 31;
                    char keyRepeatDelay = (char) (61685 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    Object[] objArr10 = new Object[1];
                    a(b7, b8, (byte) (b8 - 1), objArr10);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf2, iIndexOf, keyRepeatDelay, 939672146, false, (String) objArr10[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1030, 42 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0)), (Class) ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 1072, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 42, (char) (ExpandableListView.getPackedPositionGroup(0L) + 33531)), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objCopydefault5).invoke(null, objArr9);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                if (objCopydefault6 == null) {
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 999;
                    int iNormalizeMetaState = 31 - KeyEvent.normalizeMetaState(0);
                    char c4 = (char) (61686 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    byte b9 = (byte) ($$a[7] - 1);
                    byte b10 = (byte) (b9 - 2);
                    Object[] objArr11 = new Object[1];
                    a(b9, b10, (byte) (b10 - 1), objArr11);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, iNormalizeMetaState, c4, 1267122354, false, (String) objArr11[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    b((char) KeyEvent.normalizeMetaState(0), TextUtils.getOffsetBefore("", 0), new char[]{17901, 6027, 19967, 24860, 59908, 30872, 46808, 37155, 60063, 38699, 9206, 18958, 43629, 9729, 34328, 17253, 49865, 28349, 38633, 63665, 15027, 12123}, new char[]{56731, 43171, 25953, 21456}, new char[]{6614, 57423, 46589, 53550}, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    b((char) (9260 - KeyEvent.getDeadChar(0, 0)), 897902194 - Color.green(0), new char[]{32541, 54133, 1898, 32262, 18241, 41522, 16910, 44987, 27541, 27588, 47600, 767, 40982, 9012, 30481}, new char[]{29255, 34022, 11317, 64292}, new char[]{6614, 57423, 46589, 53550}, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                    if (objCopydefault7 == null) {
                        int offsetBefore = 999 - TextUtils.getOffsetBefore("", 0);
                        int fadingEdgeLength = 31 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        char defaultSize = (char) (61685 - View.getDefaultSize(0, 0));
                        byte b11 = (byte) ($$b & 23);
                        byte b12 = (byte) (b11 - 5);
                        Object[] objArr14 = new Object[1];
                        a(b11, b12, (byte) (b12 - 1), objArr14);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, fadingEdgeLength, defaultSize, 1267259187, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                    if (objCopydefault8 == null) {
                        int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 999;
                        int iRgb = (-16777185) - Color.rgb(0, 0, 0);
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 61685);
                        byte b13 = (byte) 0;
                        Object[] objArr15 = new Object[1];
                        a((byte) ($$a[5] + 1), b13, (byte) (b13 + 1), objArr15);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength2, iRgb, cResolveSize, -1638177773, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 == i12) {
            Object[] objArr16 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i14 = ((int[]) objArr[3])[0];
            int i15 = ((int[]) objArr[2])[0];
            int i16 = ((int[]) objArr[1])[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i17 = i14 + (((1646917432 + (((-310550894) | iFreeMemory) * (-381))) + (((~((~iFreeMemory) | (-317367678))) | 763106962) * 381)) - 1939194055);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr16[3])[0] = i19 ^ (i19 << 5);
            objArr2 = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i20 = ((int[]) objArr16[3])[0];
            int i21 = ((int[]) objArr16[2])[0];
            int i22 = ((int[]) objArr16[1])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i23 = i20 + 1930117459 + (((~((-470025467) | iIdentityHashCode)) | (-481037824)) * (-502)) + ((~((~iIdentityHashCode) | (-201589897))) * (-502)) + (((~(iIdentityHashCode | (-279447928))) | (-470025467)) * 502);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr2[3])[0] = i25 ^ (i25 << 5);
            c2 = 3;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[0];
            if (strArr != null) {
                int i26 = 0;
                while (i26 < strArr.length) {
                    arrayList.add(strArr[i26]);
                    i26++;
                    int i27 = copy + 93;
                    component4 = i27 % 128;
                    int i28 = i27 % 2;
                }
            }
            long j2 = -1;
            long j3 = ((long) (i12 ^ i13)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 11) << 32) | (j4 - ((j4 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getEdgeSlop() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, (char) View.resolveSizeAndState(0, 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
            Object[] objArr17 = {455070387, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 6563, 56 - (Process.myPid() >> 22), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault10).invoke(objInvoke, objArr17);
            Object[] objArr18 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i29 = ((int[]) objArr[3])[0];
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[1])[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i32 = i29 + ((((-1480673733) + (((~startElapsedRealtime) | 3149588) * 1324)) + (((~(startElapsedRealtime | 70958869)) | (~(678514524 | startElapsedRealtime))) * (-1324))) - 1939907386);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr18[3])[0] = i34 ^ (i34 << 5);
            Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
            Object[] objArr19 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i35 = ((int[]) objArr18[3])[0];
            int i36 = ((int[]) objArr18[2])[0];
            int i37 = ((int[]) objArr18[1])[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i38 = ~iIdentityHashCode2;
            int i39 = (~((-669631254) | i38)) | 589922305;
            int i40 = ~(iIdentityHashCode2 | (-133193));
            int i41 = i35 + 362315954 + ((i39 | i40) * (-713)) + (i40 * 1426) + ((~((-79842141) | i38)) * 713);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            c2 = 3;
            ((int[]) objArr19[3])[0] = i43 ^ (i43 << 5);
            objArr2 = objArr19;
        }
        if (this == other) {
            int i44 = ((int[]) objArr2[c2])[0];
            int i45 = i44 * i44;
            int i46 = -(1965721146 * i44);
            int i47 = (((i45 ^ i46) + ((i45 & i46) << 1)) - (~(-(i44 * (-175490650))))) - 1;
            int i48 = ((i47 | (-122420992)) << 1) - ((-122420992) ^ i47);
            int i49 = i48 >> 28;
            int i50 = (i49 - 31) / 16;
            int i51 = ((i50 | 1) << 1) - (i50 ^ 1);
            int i52 = (i48 & i51) + (i48 | i51);
            int i53 = ((i49 & (-31)) + (i49 | (-31))) / 16;
            int i54 = -((((i53 | 1) << 1) - (i53 ^ 1)) ^ i52);
            int i55 = ((i54 | 2) << 1) - (i54 ^ 2);
            int i56 = i55 >> 19;
            int i57 = (((i56 | (-16383)) << 1) - (i56 ^ (-16383))) / 8192;
            return 452 / (((-(((i57 ^ 1) + ((i57 & 1) << 1)) + 1)) & i55) * 226);
        }
        if (!(other instanceof EasyTalkMpesaPurchaseRequest)) {
            int i58 = component4 + 35;
            copy = i58 % 128;
            return i58 % 2 == 0;
        }
        EasyTalkMpesaPurchaseRequest easyTalkMpesaPurchaseRequest = (EasyTalkMpesaPurchaseRequest) other;
        if (!(!Intrinsics.areEqual(this.partyAMsisdn, easyTalkMpesaPurchaseRequest.partyAMsisdn))) {
            if (!Intrinsics.areEqual(this.partyBMsisdn, easyTalkMpesaPurchaseRequest.partyBMsisdn)) {
                int i59 = copy + 103;
                component4 = i59 % 128;
                return i59 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.offeringId, easyTalkMpesaPurchaseRequest.offeringId) || !Intrinsics.areEqual(this.offerPrice, easyTalkMpesaPurchaseRequest.offerPrice) || (!Intrinsics.areEqual(this.okoaAmount, easyTalkMpesaPurchaseRequest.okoaAmount)) || !Intrinsics.areEqual(this.channelSessionId, easyTalkMpesaPurchaseRequest.channelSessionId) || !Intrinsics.areEqual(this.useOD, easyTalkMpesaPurchaseRequest.useOD)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.fulizaAmount, easyTalkMpesaPurchaseRequest.fulizaAmount)) {
                int i60 = copy + 73;
                component4 = i60 % 128;
                int i61 = i60 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.securityCredential, easyTalkMpesaPurchaseRequest.securityCredential)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.tariff, easyTalkMpesaPurchaseRequest.tariff)) {
                int i62 = component4 + 115;
                copy = i62 % 128;
                int i63 = i62 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.offerName, easyTalkMpesaPurchaseRequest.offerName) || !Intrinsics.areEqual(this.locationId, easyTalkMpesaPurchaseRequest.locationId)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.cnOfferId, easyTalkMpesaPurchaseRequest.cnOfferId)) {
                int i64 = component4 + 83;
                copy = i64 % 128;
                int i65 = i64 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.gsmResource, easyTalkMpesaPurchaseRequest.gsmResource)) {
                return true;
            }
            int i66 = component4 + 27;
            copy = i66 % 128;
            int i67 = i66 % 2;
            return false;
        }
        return false;
    }

    static {
        component2 = 0;
        ShareDataUIState();
        CREATOR = new Creator();
        int i = component3 + 17;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EasyTalkMpesaPurchaseRequest copy$default(EasyTalkMpesaPurchaseRequest easyTalkMpesaPurchaseRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, int i, Object obj) {
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        int i2 = 2 % 2;
        String str19 = (i & 1) != 0 ? easyTalkMpesaPurchaseRequest.partyAMsisdn : str;
        if ((i & 2) != 0) {
            int i3 = copy + 5;
            component4 = i3 % 128;
            if (i3 % 2 != 0) {
                str14 = easyTalkMpesaPurchaseRequest.partyBMsisdn;
                int i4 = 16 / 0;
            } else {
                str14 = easyTalkMpesaPurchaseRequest.partyBMsisdn;
            }
        } else {
            str14 = str2;
        }
        String str20 = (i & 4) != 0 ? easyTalkMpesaPurchaseRequest.offeringId : str3;
        String str21 = (i & 8) != 0 ? easyTalkMpesaPurchaseRequest.offerPrice : str4;
        if ((i & 16) != 0) {
            int i5 = component4 + 53;
            copy = i5 % 128;
            int i6 = i5 % 2;
            str15 = easyTalkMpesaPurchaseRequest.okoaAmount;
        } else {
            str15 = str5;
        }
        String str22 = (i & 32) != 0 ? easyTalkMpesaPurchaseRequest.channelSessionId : str6;
        String str23 = (i & 64) != 0 ? easyTalkMpesaPurchaseRequest.useOD : str7;
        if ((i & 128) != 0) {
            int i7 = copy;
            int i8 = i7 + 103;
            component4 = i8 % 128;
            int i9 = i8 % 2;
            str16 = easyTalkMpesaPurchaseRequest.fulizaAmount;
            int i10 = i7 + 33;
            component4 = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str16 = str8;
        }
        if ((i & 256) != 0) {
            int i12 = component4 + 43;
            copy = i12 % 128;
            if (i12 % 2 == 0) {
                String str24 = easyTalkMpesaPurchaseRequest.securityCredential;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str17 = easyTalkMpesaPurchaseRequest.securityCredential;
        } else {
            str17 = str9;
        }
        if ((i & 512) != 0) {
            int i13 = copy + 95;
            component4 = i13 % 128;
            int i14 = i13 % 2;
            str18 = easyTalkMpesaPurchaseRequest.tariff;
        } else {
            str18 = str10;
        }
        return easyTalkMpesaPurchaseRequest.copy(str19, str14, str20, str21, str15, str22, str23, str16, str17, str18, (i & 1024) != 0 ? easyTalkMpesaPurchaseRequest.offerName : str11, (i & 2048) != 0 ? easyTalkMpesaPurchaseRequest.locationId : str12, (i & 4096) != 0 ? easyTalkMpesaPurchaseRequest.cnOfferId : str13, (i & 8192) != 0 ? easyTalkMpesaPurchaseRequest.gsmResource : list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy + 111;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.partyAMsisdn;
        int i5 = i3 + 45;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 17;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.tariff;
        int i4 = i2 + 39;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 39;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.offerName;
        int i5 = i2 + 55;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = component4 + 65;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.locationId;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return str;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 47;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cnOfferId;
        int i5 = i2 + 63;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<EasyTalkGsmResource> component14() {
        List<EasyTalkGsmResource> list;
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 39;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.gsmResource;
            int i4 = 85 / 0;
        } else {
            list = this.gsmResource;
        }
        int i5 = i2 + 67;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copy + 77;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.partyBMsisdn;
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component4 + 11;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.offeringId;
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return str;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = component4 + 79;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            str = this.offerPrice;
            int i4 = 36 / 0;
        } else {
            str = this.offerPrice;
        }
        int i5 = i3 + 55;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copy + 41;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.okoaAmount;
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component4 + 109;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.channelSessionId;
        int i5 = i3 + 113;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copy + 53;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.useOD;
        int i4 = i3 + 109;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copy + 103;
        int i3 = i2 % 128;
        component4 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.fulizaAmount;
        int i4 = i3 + 45;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component4 + 83;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.securityCredential;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final EasyTalkMpesaPurchaseRequest copy(String partyAMsisdn, String partyBMsisdn, String offeringId, String offerPrice, String okoaAmount, String channelSessionId, String useOD, String fulizaAmount, String securityCredential, String tariff, String offerName, String locationId, String cnOfferId, List<EasyTalkGsmResource> gsmResource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(partyAMsisdn, "");
        Intrinsics.checkNotNullParameter(partyBMsisdn, "");
        Intrinsics.checkNotNullParameter(offeringId, "");
        Intrinsics.checkNotNullParameter(offerPrice, "");
        Intrinsics.checkNotNullParameter(okoaAmount, "");
        Intrinsics.checkNotNullParameter(channelSessionId, "");
        Intrinsics.checkNotNullParameter(useOD, "");
        Intrinsics.checkNotNullParameter(fulizaAmount, "");
        Intrinsics.checkNotNullParameter(securityCredential, "");
        Intrinsics.checkNotNullParameter(tariff, "");
        Intrinsics.checkNotNullParameter(offerName, "");
        Intrinsics.checkNotNullParameter(locationId, "");
        Intrinsics.checkNotNullParameter(cnOfferId, "");
        Intrinsics.checkNotNullParameter(gsmResource, "");
        EasyTalkMpesaPurchaseRequest easyTalkMpesaPurchaseRequest = new EasyTalkMpesaPurchaseRequest(partyAMsisdn, partyBMsisdn, offeringId, offerPrice, okoaAmount, channelSessionId, useOD, fulizaAmount, securityCredential, tariff, offerName, locationId, cnOfferId, gsmResource);
        int i2 = copy + 97;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return easyTalkMpesaPurchaseRequest;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component4 + 121;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 69;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 65;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((this.partyAMsisdn.hashCode() * 31) + this.partyBMsisdn.hashCode()) * 31) + this.offeringId.hashCode()) * 31) + this.offerPrice.hashCode()) * 31) + this.okoaAmount.hashCode()) * 31) + this.channelSessionId.hashCode()) * 31) + this.useOD.hashCode()) * 31) + this.fulizaAmount.hashCode()) * 31) + this.securityCredential.hashCode()) * 31) + this.tariff.hashCode()) * 31) + this.offerName.hashCode()) * 31) + this.locationId.hashCode()) * 31) + this.cnOfferId.hashCode()) * 31) + this.gsmResource.hashCode();
        int i4 = component4 + 33;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EasyTalkMpesaPurchaseRequest(partyAMsisdn=" + this.partyAMsisdn + ", partyBMsisdn=" + this.partyBMsisdn + ", offeringId=" + this.offeringId + ", offerPrice=" + this.offerPrice + ", okoaAmount=" + this.okoaAmount + ", channelSessionId=" + this.channelSessionId + ", useOD=" + this.useOD + ", fulizaAmount=" + this.fulizaAmount + ", securityCredential=" + this.securityCredential + ", tariff=" + this.tariff + ", offerName=" + this.offerName + ", locationId=" + this.locationId + ", cnOfferId=" + this.cnOfferId + ", gsmResource=" + this.gsmResource + ")";
        int i2 = component4 + 93;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.partyAMsisdn);
        dest.writeString(this.partyBMsisdn);
        dest.writeString(this.offeringId);
        dest.writeString(this.offerPrice);
        dest.writeString(this.okoaAmount);
        dest.writeString(this.channelSessionId);
        dest.writeString(this.useOD);
        dest.writeString(this.fulizaAmount);
        dest.writeString(this.securityCredential);
        dest.writeString(this.tariff);
        dest.writeString(this.offerName);
        dest.writeString(this.locationId);
        dest.writeString(this.cnOfferId);
        List<EasyTalkGsmResource> list = this.gsmResource;
        dest.writeInt(list.size());
        Iterator<EasyTalkGsmResource> it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = copy + 91;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                int i3 = 70 / 0;
            } else {
                it.next().writeToParcel(dest, flags);
            }
            int i4 = copy + 79;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static void ShareDataUIState() {
        ShareDataUIState = 1920713243243240743L;
        component1 = 1386857713;
        copydefault = (char) 50417;
    }
}
