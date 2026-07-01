package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003Ji\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÇ\u0001J\b\u0010)\u001a\u00020\u0006H\u0007J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H×\u0003J\t\u0010.\u001a\u00020\u0006H×\u0001J\t\u0010/\u001a\u00020\u0003H×\u0001J\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0006H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00065"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfaMotoFetchOffersResponse;", "Landroid/os/Parcelable;", "message", "", "sessionID", "count", "", "etuBalance", "", "bongaBalance", "airtimeBalance", "storiIbambeBalance", "storoBonusBalance", "data", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfferBundle;", "<init>", "(Ljava/lang/String;Ljava/lang/String;IDDDDDLjava/util/List;)V", "getMessage", "()Ljava/lang/String;", "getSessionID", "getCount", "()I", "getEtuBalance", "()D", "getBongaBalance", "getAirtimeBalance", "getStoriIbambeBalance", "getStoroBonusBalance", "getData", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfaMotoFetchOffersResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<OfaMotoFetchOffersResponse> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("subscriberAirtimeBalance")
    private final double airtimeBalance;

    @SerializedName("subscriberBongaBalance")
    private final double bongaBalance;

    @SerializedName("count")
    private final int count;

    @SerializedName("data")
    private final List<OfferBundle> data;

    @SerializedName("subscriberEtuBalance")
    private final double etuBalance;

    @SerializedName("message")
    private final String message;

    @SerializedName("sessionID")
    private final String sessionID;

    @SerializedName("subscriberStoriIbambeBalance")
    private final double storiIbambeBalance;

    @SerializedName("subscriberStoroBonusBalance")
    private final double storoBonusBalance;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OfaMotoFetchOffersResponse> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OfaMotoFetchOffersResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i2 = parcel.readInt();
            double d2 = parcel.readDouble();
            double d3 = parcel.readDouble();
            double d4 = parcel.readDouble();
            double d5 = parcel.readDouble();
            double d6 = parcel.readDouble();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int i4 = ShareDataUIState + 13;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 3;
            }
            int i6 = 0;
            while (i6 != i3) {
                int i7 = component2 + 59;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                arrayList.add(OfferBundle.CREATOR.createFromParcel(parcel));
                i6++;
                i3 = i3;
            }
            return new OfaMotoFetchOffersResponse(string, string2, i2, d2, d3, d4, d5, d6, arrayList);
        }

        @Override
        public OfaMotoFetchOffersResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 43;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            OfaMotoFetchOffersResponse ofaMotoFetchOffersResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 111;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return ofaMotoFetchOffersResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OfaMotoFetchOffersResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 81;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            OfaMotoFetchOffersResponse[] ofaMotoFetchOffersResponseArr = new OfaMotoFetchOffersResponse[i];
            int i6 = i3 + 27;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return ofaMotoFetchOffersResponseArr;
        }

        @Override
        public OfaMotoFetchOffersResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 5;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            OfaMotoFetchOffersResponse[] ofaMotoFetchOffersResponseArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 6 / 0;
            }
            return ofaMotoFetchOffersResponseArrNewArray;
        }
    }

    public OfaMotoFetchOffersResponse(String str, String str2, int i, double d2, double d3, double d4, double d5, double d6, List<OfferBundle> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.message = str;
        this.sessionID = str2;
        this.count = i;
        this.etuBalance = d2;
        this.bongaBalance = d3;
        this.airtimeBalance = d4;
        this.storiIbambeBalance = d5;
        this.storoBonusBalance = d6;
        this.data = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OfaMotoFetchOffersResponse(String str, String str2, int i, double d2, double d3, double d4, double d5, double d6, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        int i3;
        double d7;
        double d8;
        double d9;
        double d10;
        if ((i2 & 1) != 0) {
            int i4 = 2 % 2;
            str3 = "";
        } else {
            str3 = str;
        }
        String str4 = (i2 & 2) == 0 ? str2 : "";
        if ((i2 & 4) != 0) {
            int i5 = copydefault + 113;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            int i7 = component2 + 81;
            copydefault = i7 % 128;
            d7 = i7 % 2 != 0 ? 1.0d : 0.0d;
        } else {
            d7 = d2;
        }
        if ((i2 & 16) != 0) {
            int i8 = component2 + 95;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            d8 = 0.0d;
        } else {
            d8 = d3;
        }
        if ((i2 & 32) != 0) {
            int i10 = component2 + 55;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            d9 = 0.0d;
        } else {
            d9 = d4;
        }
        if ((i2 & 64) != 0) {
            int i12 = component2 + 125;
            copydefault = i12 % 128;
            int i13 = i12 % 2;
            d10 = 0.0d;
        } else {
            d10 = d5;
        }
        this(str3, str4, i3, d7, d8, d9, d10, (i2 & 128) == 0 ? d6 : 0.0d, (i2 & 256) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.message;
        int i4 = i2 + 85;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getSessionID() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.sessionID;
        int i5 = i3 + 49;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getCount() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.count;
        int i6 = i3 + 117;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final double getEtuBalance() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.etuBalance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double getBongaBalance() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 93;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.bongaBalance;
        int i5 = i2 + 17;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final double getAirtimeBalance() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.airtimeBalance;
        }
        int i3 = 41 / 0;
        return this.airtimeBalance;
    }

    public final double getStoriIbambeBalance() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.storiIbambeBalance;
        int i5 = i2 + 31;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final double getStoroBonusBalance() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        double d2 = this.storoBonusBalance;
        int i4 = i3 + 87;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return d2;
        }
        throw null;
    }

    public final List<OfferBundle> getData() {
        List<OfferBundle> list;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 51;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.data;
            int i4 = 42 / 0;
        } else {
            list = this.data;
        }
        int i5 = i2 + 69;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public int hashCode() throws Throwable {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.message.hashCode() * 31) + this.sessionID.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + Double.hashCode(this.etuBalance)) * 31) + Double.hashCode(this.bongaBalance)) * 31) + Double.hashCode(this.airtimeBalance)) * 31) + Double.hashCode(this.storiIbambeBalance);
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(68 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 32, (char) (19697 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 518907119, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 30, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 55511118, false, "component2", null);
        }
        int i5 = ((Field) objCopydefault2).getInt(null);
        long j = i5;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 37, 30 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) TextUtils.getTrimmedLength(""), 58536393, false, "component3", null);
        }
        int i6 = ((Field) objCopydefault3).getInt(null);
        long j2 = -1;
        long j3 = j2 ^ (-1046626308433100340L);
        long jNextInt = new Random().nextInt();
        long j4 = jNextInt ^ j2;
        long j5 = (((long) (-830)) * 1839329762077304764L) + (((long) 832) * (-1046626308433100340L)) + (((long) (-831)) * (((j3 | j4) ^ j2) | (((-432417105675032580L) | jNextInt) ^ j2))) + (((long) (-1662)) * (((j3 | 1839329762077304764L) | jNextInt) ^ j2)) + (((long) 831) * ((((j2 ^ 1839329762077304764L) | j4) ^ j2) | ((jNextInt | 1839329762077304764L) ^ j2) | ((jNextInt | (-1046626308433100340L)) ^ j2)));
        int i7 = 0;
        while (true) {
            for (int i8 = 0; i8 != 8; i8++) {
                int i9 = component2 + 49;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
                i6 = (((((int) (j >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
            }
            if (i7 != 0) {
                break;
            }
            int i11 = copydefault + 35;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            i7++;
            j = j5;
        }
        if (i6 == i4) {
            return (((iHashCode * 31) + Double.hashCode(this.storoBonusBalance)) * 31) + this.data.hashCode();
        }
        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
        if (objCopydefault4 == null) {
            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - Color.alpha(0), 32 - ExpandableListView.getPackedPositionChild(0L), (char) (19696 - KeyEvent.getDeadChar(0, 0)), 1457147715, false, "copydefault", null);
        }
        Object obj = ((Field) objCopydefault4).get(null);
        long j6 = i5 ^ i4;
        long j7 = -1;
        long j8 = 0;
        long j9 = (j6 & ((((long) 0) << 32) | (j7 - ((j7 >> 63) << 32)))) | (((long) 1) << 32) | (j8 - ((j8 >> 63) << 32));
        try {
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault5 == null) {
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6618 - Color.blue(0), ExpandableListView.getPackedPositionType(0L) + 42, (char) View.resolveSizeAndState(0, 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
            Object[] objArr = {-1058807745, Long.valueOf(j9), obj, null, false, false};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 6562, 57 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault6).invoke(objInvoke, objArr);
            throw new RuntimeException(String.valueOf(i5));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static {
        int i = component3 + 117;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 0 / 0;
        }
    }

    public OfaMotoFetchOffersResponse() {
        this(null, null, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static OfaMotoFetchOffersResponse copy$default(OfaMotoFetchOffersResponse ofaMotoFetchOffersResponse, String str, String str2, int i, double d2, double d3, double d4, double d5, double d6, List list, int i2, Object obj) {
        double d7;
        double d8;
        int i3 = 2 % 2;
        String str3 = (i2 & 1) != 0 ? ofaMotoFetchOffersResponse.message : str;
        String str4 = (i2 & 2) != 0 ? ofaMotoFetchOffersResponse.sessionID : str2;
        int i4 = (i2 & 4) != 0 ? ofaMotoFetchOffersResponse.count : i;
        double d9 = (i2 & 8) != 0 ? ofaMotoFetchOffersResponse.etuBalance : d2;
        Object obj2 = null;
        if ((i2 & 16) != 0) {
            int i5 = component2 + 31;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                double d10 = ofaMotoFetchOffersResponse.bongaBalance;
                obj2.hashCode();
                throw null;
            }
            d7 = ofaMotoFetchOffersResponse.bongaBalance;
        } else {
            d7 = d3;
        }
        double d11 = (i2 & 32) != 0 ? ofaMotoFetchOffersResponse.airtimeBalance : d4;
        if ((i2 & 64) != 0) {
            int i6 = copydefault + 85;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                double d12 = ofaMotoFetchOffersResponse.storiIbambeBalance;
                obj2.hashCode();
                throw null;
            }
            d8 = ofaMotoFetchOffersResponse.storiIbambeBalance;
        } else {
            d8 = d5;
        }
        return ofaMotoFetchOffersResponse.copy(str3, str4, i4, d9, d7, d11, d8, (i2 & 128) != 0 ? ofaMotoFetchOffersResponse.storoBonusBalance : d6, (i2 & 256) != 0 ? ofaMotoFetchOffersResponse.data : list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 25;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.message;
        int i5 = i2 + 5;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.sessionID;
        int i4 = i3 + 45;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.count;
        int i6 = i3 + 87;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final double component4() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        double d2 = this.etuBalance;
        int i5 = i3 + 121;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final double component5() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        double d2 = this.bongaBalance;
        int i4 = i3 + 111;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return d2;
    }

    public final double component6() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.airtimeBalance;
        }
        throw null;
    }

    public final double component7() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        double d2 = this.storiIbambeBalance;
        int i5 = i3 + 63;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final double component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 75;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.storoBonusBalance;
        int i5 = i2 + 115;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final List<OfferBundle> component9() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.data;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final OfaMotoFetchOffersResponse copy(String message, String sessionID, int count, double etuBalance, double bongaBalance, double airtimeBalance, double storiIbambeBalance, double storoBonusBalance, List<OfferBundle> data) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(sessionID, "");
        Intrinsics.checkNotNullParameter(data, "");
        OfaMotoFetchOffersResponse ofaMotoFetchOffersResponse = new OfaMotoFetchOffersResponse(message, sessionID, count, etuBalance, bongaBalance, airtimeBalance, storiIbambeBalance, storoBonusBalance, data);
        int i2 = component2 + 87;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return ofaMotoFetchOffersResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfaMotoFetchOffersResponse)) {
            int i4 = i3 + 87;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        OfaMotoFetchOffersResponse ofaMotoFetchOffersResponse = (OfaMotoFetchOffersResponse) other;
        if (!Intrinsics.areEqual(this.message, ofaMotoFetchOffersResponse.message)) {
            int i5 = component2 + 107;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.sessionID, ofaMotoFetchOffersResponse.sessionID) || this.count != ofaMotoFetchOffersResponse.count) {
            return false;
        }
        if (Double.compare(this.etuBalance, ofaMotoFetchOffersResponse.etuBalance) != 0) {
            int i7 = component2 + 111;
            copydefault = i7 % 128;
            return i7 % 2 != 0;
        }
        if (Double.compare(this.bongaBalance, ofaMotoFetchOffersResponse.bongaBalance) != 0) {
            return false;
        }
        if (Double.compare(this.airtimeBalance, ofaMotoFetchOffersResponse.airtimeBalance) != 0) {
            int i8 = component2 + 61;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Double.compare(this.storiIbambeBalance, ofaMotoFetchOffersResponse.storiIbambeBalance) != 0) {
            int i10 = component2 + 61;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Double.compare(this.storoBonusBalance, ofaMotoFetchOffersResponse.storoBonusBalance) == 0) {
            return Intrinsics.areEqual(this.data, ofaMotoFetchOffersResponse.data);
        }
        int i12 = copydefault + 25;
        component2 = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OfaMotoFetchOffersResponse(message=" + this.message + ", sessionID=" + this.sessionID + ", count=" + this.count + ", etuBalance=" + this.etuBalance + ", bongaBalance=" + this.bongaBalance + ", airtimeBalance=" + this.airtimeBalance + ", storiIbambeBalance=" + this.storiIbambeBalance + ", storoBonusBalance=" + this.storoBonusBalance + ", data=" + this.data + ")";
        int i2 = component2 + 93;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.message);
        dest.writeString(this.sessionID);
        dest.writeInt(this.count);
        dest.writeDouble(this.etuBalance);
        dest.writeDouble(this.bongaBalance);
        dest.writeDouble(this.airtimeBalance);
        dest.writeDouble(this.storiIbambeBalance);
        dest.writeDouble(this.storoBonusBalance);
        List<OfferBundle> list = this.data;
        dest.writeInt(list.size());
        Iterator<OfferBundle> it = list.iterator();
        int i4 = copydefault + 49;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
