package com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelNotification;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009e\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u00101J\b\u00102\u001a\u00020\u0005H\u0007J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H×\u0003J\t\u00107\u001a\u00020\u0005H×\u0001J\t\u00108\u001a\u00020\u0003H×\u0001J\u0018\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0005H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b!\u0010\u0016R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\"\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u0006>"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/blivebundles/model/BLiveOffer;", "Landroid/os/Parcelable;", "offerName", "", "offerValidity", "", "resourceAccId", "resourceValue", "offerPrice", "", "offerUssdName", "offeringId", "locationId", "autoRenewOfferId", "offerId", "subOfferId", "resourceType", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getOfferName", "()Ljava/lang/String;", "getOfferValidity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResourceAccId", "getResourceValue", "getOfferPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getOfferUssdName", "getOfferingId", "getLocationId", "getAutoRenewOfferId", "getOfferId", "getSubOfferId", "getResourceType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/blivebundles/model/BLiveOffer;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BLiveOffer implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BLiveOffer> CREATOR;
    private static long ShareDataUIState;
    private static int component1;
    private static char[] component2;

    @SerializedName("autoRenewOfferId")
    private final String autoRenewOfferId;

    @SerializedName("locationId")
    private final String locationId;

    @SerializedName("offerId")
    private final Integer offerId;

    @SerializedName("offerName")
    private final String offerName;

    @SerializedName("subOfferPrice")
    private final Double offerPrice;

    @SerializedName("offerUssdName")
    private final String offerUssdName;

    @SerializedName("offerValidity")
    private final Integer offerValidity;

    @SerializedName("offeringId")
    private final Integer offeringId;

    @SerializedName("resourceAccId")
    private final Integer resourceAccId;

    @SerializedName("resourceType")
    private final String resourceType;

    @SerializedName("resourceValue")
    private final Integer resourceValue;

    @SerializedName("subOfferId")
    private final Integer subOfferId;
    private static final byte[] $$c = {63, 67, 46, -88};
    private static final int $$d = 58;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {62, TarHeader.LF_FIFO, 60, 44, -38, -24, -29, -25, -25, -17, -35, -32, 39};
    private static final int $$b = 31;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private static int component3 = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BLiveOffer> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BLiveOffer createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            Integer numValueOf3;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 93;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Object obj = null;
            if (parcel.readInt() == 0) {
                int i4 = ShareDataUIState + 65;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                int i5 = component3 + 9;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 61 / 0;
                }
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                int i7 = component3 + 31;
                ShareDataUIState = i7 % 128;
                if (i7 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new BLiveOffer(string, numValueOf, numValueOf2, numValueOf3, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override
        public BLiveOffer createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 33;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            BLiveOffer bLiveOfferCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 29;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return bLiveOfferCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BLiveOffer[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 67;
            ShareDataUIState = i3 % 128;
            BLiveOffer[] bLiveOfferArr = new BLiveOffer[i];
            if (i3 % 2 == 0) {
                return bLiveOfferArr;
            }
            throw null;
        }

        @Override
        public BLiveOffer[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 109;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            BLiveOffer[] bLiveOfferArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 28 / 0;
            }
            return bLiveOfferArrNewArray;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r6, short r7, short r8) {
        /*
            int r6 = r6 + 117
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveOffer.$$c
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            int r7 = r7 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L29:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveOffer.$$e(byte, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveOffer.$$a
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r8 = r8 * 3
            int r8 = r8 + 99
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-26)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.model.BLiveOffer.b(short, short, short, java.lang.Object[]):void");
    }

    public BLiveOffer(String str, Integer num, Integer num2, Integer num3, Double d2, String str2, Integer num4, String str3, String str4, Integer num5, Integer num6, String str5) {
        this.offerName = str;
        this.offerValidity = num;
        this.resourceAccId = num2;
        this.resourceValue = num3;
        this.offerPrice = d2;
        this.offerUssdName = str2;
        this.offeringId = num4;
        this.locationId = str3;
        this.autoRenewOfferId = str4;
        this.offerId = num5;
        this.subOfferId = num6;
        this.resourceType = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BLiveOffer(String str, Integer num, Integer num2, Integer num3, Double d2, String str2, Integer num4, String str3, String str4, Integer num5, Integer num6, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        Integer num7;
        Integer num8;
        Integer num9;
        Double d3;
        String str7;
        String str8 = null;
        if ((i & 1) != 0) {
            int i2 = getAsAtTimestamp + 29;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str6 = null;
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            int i4 = copydefault + 97;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                str8.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            num7 = null;
        } else {
            num7 = num;
        }
        if ((i & 4) != 0) {
            int i6 = copydefault + 17;
            getAsAtTimestamp = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            num8 = null;
        } else {
            num8 = num2;
        }
        if ((i & 8) != 0) {
            int i8 = getAsAtTimestamp + 53;
            copydefault = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
            num9 = null;
        } else {
            num9 = num3;
        }
        if ((i & 16) != 0) {
            int i10 = copydefault + 123;
            getAsAtTimestamp = i10 % 128;
            int i11 = i10 % 2;
            d3 = null;
        } else {
            d3 = d2;
        }
        String str9 = (i & 32) != 0 ? null : str2;
        Integer num10 = (i & 64) != 0 ? null : num4;
        if ((i & 128) != 0) {
            int i12 = copydefault + 33;
            getAsAtTimestamp = i12 % 128;
            int i13 = i12 % 2;
            str7 = null;
        } else {
            str7 = str3;
        }
        String str10 = (i & 256) != 0 ? null : str4;
        Integer num11 = (i & 512) != 0 ? null : num5;
        Integer num12 = (i & 1024) != 0 ? null : num6;
        if ((i & 2048) != 0) {
            int i14 = getAsAtTimestamp + 101;
            copydefault = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 2 % 2;
        } else {
            str8 = str5;
        }
        this(str6, num7, num8, num9, d3, str9, num10, str7, str10, num11, num12, str8);
    }

    public final String getOfferName() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.offerName;
        int i5 = i3 + 1;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getOfferValidity() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 47;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.offerValidity;
        int i5 = i2 + 59;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getResourceAccId() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 47;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.resourceAccId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getResourceValue() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 63;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.resourceValue;
        int i4 = i3 + 9;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Double getOfferPrice() {
        Double d2;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 47;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            d2 = this.offerPrice;
            int i4 = 16 / 0;
        } else {
            d2 = this.offerPrice;
        }
        int i5 = i2 + 7;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return d2;
    }

    public final String getOfferUssdName() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.offerUssdName;
        int i5 = i3 + 87;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getOfferingId() {
        Integer num;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.offeringId;
            int i4 = 63 / 0;
        } else {
            num = this.offeringId;
        }
        int i5 = i2 + 83;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getLocationId() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 53;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.locationId;
        int i5 = i2 + 41;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAutoRenewOfferId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 3;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.autoRenewOfferId;
        int i5 = i2 + 73;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getOfferId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 7;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.offerId;
        int i5 = i2 + 37;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getSubOfferId() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        Integer num = this.subOfferId;
        int i5 = i3 + 93;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getResourceType() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String str = this.resourceType;
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return str;
    }

    private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i4 = $11 + 81;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component2[i2 + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    int i7 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1757;
                    int i8 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 33;
                    char cMyTid = (char) (Process.myTid() >> 22);
                    byte length = (byte) $$c.length;
                    byte b2 = (byte) (length - 5);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i7, i8, cMyTid, 1159210934, false, $$e(length, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(ShareDataUIState), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 3608, ExpandableListView.getPackedPositionGroup(0L) + 29, (char) (7171 - (KeyEvent.getMaxKeyCode() >> 16)), 1951385784, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) (-1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.indexOf("", ""), 24 - View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 27761), -1529629956, false, $$e((byte) 5, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b6 = (byte) (-1);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - View.combineMeasuredStates(0, 0), 24 - Color.blue(0), (char) (27760 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), -1529629956, false, $$e((byte) 5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            int i9 = $10 + 63;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    public final BLiveOffer copy(String offerName, Integer offerValidity, Integer resourceAccId, Integer resourceValue, Double offerPrice, String offerUssdName, Integer offeringId, String locationId, String autoRenewOfferId, Integer offerId, Integer subOfferId, String resourceType) throws Throwable {
        CharSequence charSequence;
        int i;
        int i2;
        long j;
        int i3;
        int i4 = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - Color.red(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19696), 520092524, false, "component2", null);
        }
        Object obj = null;
        int i5 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L) + 22, KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(KeyEvent.normalizeMetaState(0) + 15, 22 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j2 = -209;
        long j3 = (j2 * 2279690404400283080L) + (j2 * 2176032692206227245L);
        long j4 = 210;
        long j5 = -1;
        long j6 = j5 ^ 2279690404400283080L;
        long j7 = j5 ^ 2176032692206227245L;
        CharSequence charSequence2 = "";
        long jIdentityHashCode = System.identityHashCode(this);
        long j8 = jIdentityHashCode ^ j5;
        long j9 = j3 + (((j6 | j7) ^ j5) * j4) + ((((j7 | j8) ^ j5) | ((j6 | jIdentityHashCode) ^ j5)) * j4) + (j4 * ((((j6 | j8) | 2176032692206227245L) ^ j5) | ((jIdentityHashCode | (j7 | 2279690404400283080L)) ^ j5)));
        int i6 = 0;
        while (true) {
            int i7 = 8;
            if (i6 != 10) {
                int i8 = getAsAtTimestamp + 87;
                copydefault = i8 % 128;
                if (i8 % 2 != 0) {
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                    charSequence = charSequence2;
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - TextUtils.getCapsMode(charSequence, 0, 0), 30 - ((Process.getThreadPriority(0) + 20) >> 6), (char) TextUtils.indexOf(charSequence, charSequence), 846241313, false, "copydefault", null);
                    }
                    i = ((Field) objCopydefault2).getInt(obj);
                    j = jLongValue;
                    i2 = 1;
                } else {
                    charSequence = charSequence2;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 31 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 846241313, false, "copydefault", null);
                    }
                    i = ((Field) objCopydefault3).getInt(obj);
                    i2 = 0;
                    j = jLongValue;
                }
                while (true) {
                    int i9 = 0;
                    while (i9 != i7) {
                        int i10 = copydefault;
                        int i11 = i10 + 121;
                        getAsAtTimestamp = i11 % 128;
                        if (i11 % 2 == 0) {
                            i3 = (((((int) (j << i9)) & 26947) >>> (i >>> 114)) >>> (i % 86)) / i;
                            i9 += 73;
                        } else {
                            i3 = (((((int) (j >> i9)) & 255) + (i << 6)) + (i << 16)) - i;
                            i9++;
                        }
                        i = i3;
                        int i12 = i10 + 117;
                        getAsAtTimestamp = i12 % 128;
                        int i13 = i12 % 2;
                        i7 = 8;
                    }
                    if (i2 != 0) {
                        break;
                    }
                    i2++;
                    int i14 = getAsAtTimestamp + 89;
                    copydefault = i14 % 128;
                    int i15 = i14 % 2;
                    j = j9;
                    i7 = 8;
                }
                if (i == i5) {
                    break;
                }
                jLongValue -= 1024;
                i6++;
                charSequence2 = charSequence;
                obj = null;
            } else {
                CharSequence charSequence3 = charSequence2;
                int length = offerName != null ? offerName.length() : 0;
                try {
                    Object[] objArr3 = {1384447649};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1662, View.resolveSize(0, 0) + 10, (char) ((Process.getThreadPriority(0) + 20) >> 6), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(length), 0, 900180810, ((Constructor) objCopydefault4).newInstance(objArr3), false};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault5 == null) {
                        int doubleTapTimeout = 1454 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int defaultSize = 22 - View.getDefaultSize(0, 0);
                        char cMyTid = (char) (Process.myTid() >> 22);
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        b(b2, b3, b3, objArr5);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(doubleTapTimeout, defaultSize, cMyTid, 1908380642, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1591, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39, (char) ((-16777216) - Color.rgb(0, 0, 0))), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objCopydefault5).invoke(null, objArr4);
                    int i16 = ((int[]) objArr6[2])[0];
                    int i17 = ((int[]) objArr6[1])[0];
                    if (i17 != i16) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr6[3];
                        if (strArr != null) {
                            for (String str : strArr) {
                                int i18 = copydefault + 103;
                                getAsAtTimestamp = i18 % 128;
                                int i19 = i18 % 2;
                                arrayList.add(str);
                            }
                        }
                        long j10 = -1;
                        long j11 = (((long) 0) << 32) | (j10 - ((j10 >> 63) << 32));
                        long j12 = 0;
                        long j13 = (j11 & ((long) (i17 ^ i16))) | (((long) 1) << 32) | (j12 - ((j12 >> 63) << 32));
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault6 == null) {
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6617 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getTouchSlop() >> 8) + 42, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
                        Object[] objArr7 = {1384447649, Long.valueOf(j13), arrayList, null, false, false};
                        Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault7 == null) {
                            objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength(charSequence3) + 6562, 'h' - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault7).invoke(objInvoke, objArr7);
                        throw new RuntimeException(String.valueOf(i17));
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        return new BLiveOffer(offerName, offerValidity, resourceAccId, resourceValue, offerPrice, offerUssdName, offeringId, locationId, autoRenewOfferId, offerId, subOfferId, resourceType);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.offerName;
        Integer num = this.offerValidity;
        Integer num2 = this.resourceAccId;
        Integer num3 = this.resourceValue;
        Double d2 = this.offerPrice;
        String str2 = this.offerUssdName;
        Integer num4 = this.offeringId;
        String str3 = this.locationId;
        String str4 = this.autoRenewOfferId;
        Integer num5 = this.offerId;
        Integer num6 = this.subOfferId;
        String str5 = this.resourceType;
        StringBuilder sb = new StringBuilder("BLiveOffer(offerName=");
        sb.append(str);
        sb.append(", offerValidity=");
        sb.append(num);
        sb.append(", resourceAccId=");
        sb.append(num2);
        sb.append(", resourceValue=");
        sb.append(num3);
        sb.append(", offerPrice=");
        sb.append(d2);
        sb.append(", offerUssdName=");
        sb.append(str2);
        sb.append(", offeringId=");
        sb.append(num4);
        sb.append(", locationId=");
        sb.append(str3);
        sb.append(", autoRenewOfferId=");
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - TextUtils.getOffsetBefore("", 0), 32 - TextUtils.lastIndexOf("", '0'), (char) (19696 - TextUtils.indexOf("", "", 0, 0)), 518907119, false, "component3", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - TextUtils.getCapsMode("", 0, 0), 30 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getEdgeSlop() >> 16), 55511118, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault2).getInt(null);
        long j = i3;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 36, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 29, (char) Color.red(0), 58536393, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault3).getInt(null);
        long j2 = 69;
        long j3 = -1;
        long j4 = j3 ^ 112753388686952630L;
        long j5 = j3 ^ 679950064957251794L;
        long jNextInt = new Random().nextInt(1202647452);
        long j6 = (((long) 70) * 112753388686952630L) + (((long) (-68)) * 679950064957251794L) + (((((j4 | j5) | jNextInt) ^ j3) | ((720504469169629430L | jNextInt) ^ j3)) * j2) + (((long) (-69)) * (((j4 | 679950064957251794L) ^ j3) | ((j4 | jNextInt) ^ j3) | ((jNextInt | 679950064957251794L) ^ j3))) + (j2 * (j3 ^ (j5 | 112753388686952630L)));
        long j7 = j;
        int i5 = 0;
        while (true) {
            for (int i6 = 0; i6 != 8; i6++) {
                i4 = (((((int) (j7 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
            }
            if (i5 != 0) {
                break;
            }
            int i7 = getAsAtTimestamp + 9;
            int i8 = i7 % 128;
            copydefault = i8;
            i5 = i7 % 2 != 0 ? i5 + 43 : i5 + 1;
            int i9 = i8 + 15;
            getAsAtTimestamp = i9 % 128;
            int i10 = i9 % 2;
            j7 = j6;
        }
        if (i4 == i2) {
            sb.append(str4);
            sb.append(", offerId=");
            sb.append(num5);
            sb.append(", subOfferId=");
            sb.append(num6);
            sb.append(", resourceType=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }
        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
        if (objCopydefault4 == null) {
            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 34, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 19696), 1457147715, false, "copydefault", null);
        }
        Object obj = ((Field) objCopydefault4).get(null);
        long j8 = -1;
        long j9 = 0;
        long j10 = (((long) (i3 ^ i2)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
        try {
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault5 == null) {
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6617 - MotionEvent.axisFromString(""), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 42, (char) (Process.myTid() >> 22), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
            Object[] objArr = {-2141767391, Long.valueOf(j10), obj, null, false, false};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6562, 55 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault6).invoke(objInvoke, objArr);
            throw new RuntimeException(String.valueOf(i3));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static {
        component1 = 0;
        ShareDataUIState();
        CREATOR = new Creator();
        int i = component3 + 41;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
    }

    public BLiveOffer() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static BLiveOffer copy$default(BLiveOffer bLiveOffer, String str, Integer num, Integer num2, Integer num3, Double d2, String str2, Integer num4, String str3, String str4, Integer num5, Integer num6, String str5, int i, Object obj) {
        String str6;
        Integer num7;
        Integer num8;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getAsAtTimestamp + 7;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str6 = bLiveOffer.offerName;
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            int i5 = copydefault + 93;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            num7 = bLiveOffer.offerValidity;
        } else {
            num7 = num;
        }
        Integer num9 = (i & 4) != 0 ? bLiveOffer.resourceAccId : num2;
        Integer num10 = (i & 8) != 0 ? bLiveOffer.resourceValue : num3;
        Double d3 = (i & 16) != 0 ? bLiveOffer.offerPrice : d2;
        String str7 = (i & 32) != 0 ? bLiveOffer.offerUssdName : str2;
        Integer num11 = (i & 64) != 0 ? bLiveOffer.offeringId : num4;
        String str8 = (i & 128) != 0 ? bLiveOffer.locationId : str3;
        String str9 = (i & 256) != 0 ? bLiveOffer.autoRenewOfferId : str4;
        Integer num12 = (i & 512) != 0 ? bLiveOffer.offerId : num5;
        if ((i & 1024) != 0) {
            int i7 = copydefault + 7;
            getAsAtTimestamp = i7 % 128;
            if (i7 % 2 == 0) {
                Integer num13 = bLiveOffer.subOfferId;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            num8 = bLiveOffer.subOfferId;
        } else {
            num8 = num6;
        }
        return bLiveOffer.copy(str6, num7, num9, num10, d3, str7, num11, str8, str9, num12, num8, (i & 2048) != 0 ? bLiveOffer.resourceType : str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 15;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.offerName;
        int i5 = i3 + 97;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return str;
    }

    public final Integer component10() {
        Integer num;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 45;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.offerId;
            int i4 = 84 / 0;
        } else {
            num = this.offerId;
        }
        int i5 = i2 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component11() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Integer num = this.subOfferId;
        int i4 = i3 + 33;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.resourceType;
        int i5 = i3 + 49;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 53;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.offerValidity;
        int i5 = i3 + 121;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        Integer num = this.resourceAccId;
        int i5 = i3 + 21;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 75;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.resourceValue;
        int i4 = i3 + 123;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Double component5() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 45;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Double d2 = this.offerPrice;
        int i5 = i3 + 103;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 31;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.offerUssdName;
        int i5 = i3 + 43;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Integer component7() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 29;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.offeringId;
        int i5 = i2 + 109;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return num;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 87;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.locationId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 63;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.autoRenewOfferId;
        int i5 = i3 + 3;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return str;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 109;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 19;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getAsAtTimestamp + 25;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 93 / 0;
            }
            return true;
        }
        if (!(!(other instanceof BLiveOffer))) {
            BLiveOffer bLiveOffer = (BLiveOffer) other;
            if (!Intrinsics.areEqual(this.offerName, bLiveOffer.offerName)) {
                int i4 = getAsAtTimestamp + 103;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.offerValidity, bLiveOffer.offerValidity)) {
                int i6 = getAsAtTimestamp + 11;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.resourceAccId, bLiveOffer.resourceAccId) || !Intrinsics.areEqual(this.resourceValue, bLiveOffer.resourceValue) || !Intrinsics.areEqual((Object) this.offerPrice, (Object) bLiveOffer.offerPrice) || !Intrinsics.areEqual(this.offerUssdName, bLiveOffer.offerUssdName) || !Intrinsics.areEqual(this.offeringId, bLiveOffer.offeringId)) {
                return false;
            }
            if (Intrinsics.areEqual(this.locationId, bLiveOffer.locationId)) {
                if (Intrinsics.areEqual(this.autoRenewOfferId, bLiveOffer.autoRenewOfferId)) {
                    if (!Intrinsics.areEqual(this.offerId, bLiveOffer.offerId)) {
                        return false;
                    }
                    if (Intrinsics.areEqual(this.subOfferId, bLiveOffer.subOfferId)) {
                        return Intrinsics.areEqual(this.resourceType, bLiveOffer.resourceType);
                    }
                    int i8 = getAsAtTimestamp + 27;
                    copydefault = i8 % 128;
                    return i8 % 2 != 0;
                }
                int i9 = copydefault;
                int i10 = i9 + 33;
                getAsAtTimestamp = i10 % 128;
                int i11 = i10 % 2;
                int i12 = i9 + 65;
                getAsAtTimestamp = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
            int i14 = copydefault + 125;
            getAsAtTimestamp = i14 % 128;
            int i15 = i14 % 2;
        }
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 19;
        getAsAtTimestamp = i4 % 128;
        int iHashCode6 = 1;
        if (i4 % 2 == 0) {
            str = this.offerName;
            if (str == null) {
                i = 1;
                int i5 = i3 + 11;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 1;
                iHashCode2 = str.hashCode();
            }
        } else {
            str = this.offerName;
            if (str == null) {
                i = 0;
                int i52 = i3 + 11;
                getAsAtTimestamp = i52 % 128;
                int i62 = i52 % 2;
                iHashCode = i;
                iHashCode2 = 0;
            } else {
                iHashCode = 0;
                iHashCode2 = str.hashCode();
            }
        }
        Integer num = this.offerValidity;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Integer num2 = this.resourceAccId;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.resourceValue;
        int iHashCode9 = num3 == null ? 0 : num3.hashCode();
        Double d2 = this.offerPrice;
        if (d2 == null) {
            int i7 = copydefault + 17;
            getAsAtTimestamp = i7 % 128;
            iHashCode3 = i7 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = d2.hashCode();
        }
        String str2 = this.offerUssdName;
        if (str2 == null) {
            int i8 = getAsAtTimestamp + 113;
            copydefault = i8 % 128;
            if (i8 % 2 == 0) {
                iHashCode6 = 0;
            }
        } else {
            iHashCode6 = str2.hashCode();
        }
        Integer num4 = this.offeringId;
        int iHashCode10 = num4 == null ? 0 : num4.hashCode();
        String str3 = this.locationId;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.autoRenewOfferId;
        if (str4 == null) {
            int i9 = getAsAtTimestamp + 17;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str4.hashCode();
        }
        Integer num5 = this.offerId;
        if (num5 == null) {
            iHashCode5 = 0;
        } else {
            iHashCode5 = num5.hashCode();
            int i11 = copydefault + 19;
            getAsAtTimestamp = i11 % 128;
            int i12 = i11 % 2;
        }
        Integer num6 = this.subOfferId;
        int iHashCode12 = num6 != null ? num6.hashCode() : 0;
        String str5 = this.resourceType;
        if (str5 == null) {
            int i13 = copydefault + 61;
            getAsAtTimestamp = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 2 / 5;
            }
        } else {
            iHashCode = str5.hashCode();
        }
        return (((((((((((((((((((((iHashCode2 * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode12) * 31) + iHashCode;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.offerName);
        Integer num = this.offerValidity;
        if (num == null) {
            int i2 = getAsAtTimestamp + 79;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.resourceAccId;
        if (num2 == null) {
            int i4 = copydefault + 83;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
            int i6 = getAsAtTimestamp + 15;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.resourceValue;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
            int i8 = getAsAtTimestamp + 77;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
        }
        Double d2 = this.offerPrice;
        if (d2 == null) {
            dest.writeInt(0);
            int i10 = copydefault + 93;
            getAsAtTimestamp = i10 % 128;
            int i11 = i10 % 2;
        } else {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        }
        dest.writeString(this.offerUssdName);
        Integer num4 = this.offeringId;
        if (num4 == null) {
            int i12 = getAsAtTimestamp + 107;
            copydefault = i12 % 128;
            int i13 = i12 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        dest.writeString(this.locationId);
        dest.writeString(this.autoRenewOfferId);
        Integer num5 = this.offerId;
        if (num5 == null) {
            int i14 = getAsAtTimestamp + 103;
            copydefault = i14 % 128;
            if (i14 % 2 != 0) {
                dest.writeInt(1);
            } else {
                dest.writeInt(0);
            }
        } else {
            dest.writeInt(1);
            dest.writeInt(num5.intValue());
        }
        Integer num6 = this.subOfferId;
        if (num6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num6.intValue());
        }
        dest.writeString(this.resourceType);
    }

    static void ShareDataUIState() {
        component2 = new char[]{3095, 52522, 36470, 20370, 2257, 51685, 35646, 17414, 1417, 50887, 34732, 16643, 599, 50063, 40126, 24061, 7995, 55399, 39326, 23215, 7165, 54535, 3091, 52520, 36467, 20368, 2253, 51689, 35646, 17530, 1411, 50901, 34798, 16676, 583, 50065, 40111};
        ShareDataUIState = -7844942141822153404L;
    }
}
