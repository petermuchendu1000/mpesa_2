package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÇ\u0001J\b\u0010+\u001a\u00020\nH\u0007J\u0013\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010.H×\u0003J\t\u0010/\u001a\u00020\nH×\u0001J\t\u00100\u001a\u00020\u0003H×\u0001J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\nH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00066"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/PurchasePaper;", "Landroid/os/Parcelable;", "baseUrl", "", "optimizedAttributes", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/OptimizedAttributes;", "optimizedStatus", "", FirebaseAnalytics.Param.PRICE, "productId", "", "productName", "releaseDate", "releaseId", "releaseName", "releaseValue", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/OptimizedAttributes;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getBaseUrl", "()Ljava/lang/String;", "getOptimizedAttributes", "()Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/OptimizedAttributes;", "getOptimizedStatus", "()Z", "getPrice", "getProductId", "()I", "getProductName", "getReleaseDate", "getReleaseId", "getReleaseName", "getReleaseValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchasePaper implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PurchasePaper> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("baseUrl")
    private final String baseUrl;

    @SerializedName("optimizedAttributes")
    private final OptimizedAttributes optimizedAttributes;

    @SerializedName("optimizedStatus")
    private final boolean optimizedStatus;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName("productId")
    private final int productId;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("releaseDate")
    private final String releaseDate;

    @SerializedName("releaseId")
    private final int releaseId;

    @SerializedName("releaseName")
    private final String releaseName;

    @SerializedName("releaseValue")
    private final String releaseValue;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PurchasePaper> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PurchasePaper createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            OptimizedAttributes optimizedAttributesCreateFromParcel = OptimizedAttributes.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i2 = component2 + 109;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                int i4 = component2 + 19;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                z = false;
            }
            return new PurchasePaper(string, optimizedAttributesCreateFromParcel, z, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override
        public PurchasePaper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 37;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            PurchasePaper purchasePaperCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 43;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return purchasePaperCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PurchasePaper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 71;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            PurchasePaper[] purchasePaperArr = new PurchasePaper[i];
            int i6 = i4 + 105;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return purchasePaperArr;
        }

        @Override
        public PurchasePaper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 93;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public PurchasePaper(String str, OptimizedAttributes optimizedAttributes, boolean z, String str2, int i, String str3, String str4, int i2, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(optimizedAttributes, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.baseUrl = str;
        this.optimizedAttributes = optimizedAttributes;
        this.optimizedStatus = z;
        this.price = str2;
        this.productId = i;
        this.productName = str3;
        this.releaseDate = str4;
        this.releaseId = i2;
        this.releaseName = str5;
        this.releaseValue = str6;
    }

    public final String getBaseUrl() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.baseUrl;
        int i4 = i3 + 43;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final OptimizedAttributes getOptimizedAttributes() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        OptimizedAttributes optimizedAttributes = this.optimizedAttributes;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return optimizedAttributes;
    }

    public final boolean getOptimizedStatus() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.optimizedStatus;
        int i4 = i2 + 57;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final String getPrice() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 91;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.price;
            int i4 = 11 / 0;
        } else {
            str = this.price;
        }
        int i5 = i3 + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getProductId() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.productId;
        int i6 = i3 + 93;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 24 / 0;
        }
        return i5;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productName;
        }
        throw null;
    }

    public final String getReleaseDate() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.releaseDate;
        }
        throw null;
    }

    public final int getReleaseId() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.releaseId;
        int i6 = i3 + 49;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final String getReleaseName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.releaseName;
        int i5 = i2 + 31;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getReleaseValue() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.releaseValue;
        int i5 = i3 + 115;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component1() throws Throwable {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 67, ExpandableListView.getPackedPositionGroup(0L) + 33, (char) (19696 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 518907119, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(0L) + 37, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 55511118, false, "component2", null);
        }
        int i5 = ((Field) objCopydefault2).getInt(null);
        long j = i5;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - (ViewConfiguration.getScrollBarSize() >> 8), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31, (char) Gravity.getAbsoluteGravity(0, 0), 58536393, false, "component3", null);
        }
        int i6 = ((Field) objCopydefault3).getInt(null);
        long j2 = -754;
        long j3 = -1;
        long j4 = j3 ^ 13960649193711402L;
        long j5 = j4 | 778742804450493022L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j6 = (((long) 755) * 13960649193711402L) + (((long) (-753)) * 778742804450493022L) + (((j5 ^ j3) | ((j4 | jIdentityHashCode) ^ j3) | ((jIdentityHashCode | 778742804450493022L) ^ j3)) * j2);
        long j7 = (j5 | jIdentityHashCode) ^ j3;
        long j8 = jIdentityHashCode ^ j3;
        long j9 = j6 + (j2 * (j7 | ((j8 | 792562577106265982L) ^ j3))) + (((long) 754) * (j4 | j8));
        int i7 = 0;
        while (true) {
            for (int i8 = 0; i8 != 8; i8++) {
                i6 = (((((int) (j >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
            }
            if (i7 != 0) {
                break;
            }
            int i9 = copydefault + 63;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            i7++;
            j = j9;
        }
        if (i6 == i4) {
            return this.baseUrl;
        }
        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
        if (objCopydefault4 == null) {
            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - Color.alpha(0), 33 - Drawable.resolveOpacity(0, 0), (char) (19697 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1457147715, false, "copydefault", null);
        }
        Object obj = ((Field) objCopydefault4).get(null);
        long j10 = -1;
        long j11 = 0;
        long j12 = (((long) (i5 ^ i4)) & ((((long) 0) << 32) | (j10 - ((j10 >> 63) << 32)))) | (((long) 1) << 32) | (j11 - ((j11 >> 63) << 32));
        try {
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault5 == null) {
                str = "";
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6617, TextUtils.indexOf((CharSequence) str, '0') + 43, (char) Gravity.getAbsoluteGravity(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            } else {
                str = "";
            }
            Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
            Object[] objArr = {866483695, Long.valueOf(j12), obj, null, false, false};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6561 - MotionEvent.axisFromString(str), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 57, (char) TextUtils.getCapsMode(str, 0, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
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
        int i = component1 + 89;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static PurchasePaper copy$default(PurchasePaper purchasePaper, String str, OptimizedAttributes optimizedAttributes, boolean z, String str2, int i, String str3, String str4, int i2, String str5, String str6, int i3, Object obj) {
        String str7;
        OptimizedAttributes optimizedAttributes2;
        boolean z2;
        String str8;
        int i4;
        String str9;
        String str10;
        int i5 = 2 % 2;
        if ((i3 & 1) != 0) {
            int i6 = component3 + 121;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                str7 = purchasePaper.baseUrl;
                int i7 = 89 / 0;
            } else {
                str7 = purchasePaper.baseUrl;
            }
        } else {
            str7 = str;
        }
        if ((i3 & 2) != 0) {
            int i8 = component3 + 85;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            optimizedAttributes2 = purchasePaper.optimizedAttributes;
        } else {
            optimizedAttributes2 = optimizedAttributes;
        }
        if ((i3 & 4) != 0) {
            int i10 = copydefault + 85;
            component3 = i10 % 128;
            if (i10 % 2 == 0) {
                boolean z3 = purchasePaper.optimizedStatus;
                throw null;
            }
            z2 = purchasePaper.optimizedStatus;
        } else {
            z2 = z;
        }
        if ((i3 & 8) != 0) {
            int i11 = component3 + 31;
            copydefault = i11 % 128;
            int i12 = i11 % 2;
            str8 = purchasePaper.price;
        } else {
            str8 = str2;
        }
        if ((i3 & 16) != 0) {
            int i13 = component3;
            int i14 = i13 + 119;
            copydefault = i14 % 128;
            int i15 = i14 % 2;
            i4 = purchasePaper.productId;
            int i16 = i13 + 117;
            copydefault = i16 % 128;
            int i17 = i16 % 2;
        } else {
            i4 = i;
        }
        if ((i3 & 32) != 0) {
            int i18 = component3 + 59;
            copydefault = i18 % 128;
            if (i18 % 2 != 0) {
                String str11 = purchasePaper.productName;
                throw null;
            }
            str9 = purchasePaper.productName;
        } else {
            str9 = str3;
        }
        String str12 = (i3 & 64) != 0 ? purchasePaper.releaseDate : str4;
        int i19 = (i3 & 128) != 0 ? purchasePaper.releaseId : i2;
        if ((i3 & 256) != 0) {
            int i20 = copydefault + 125;
            component3 = i20 % 128;
            if (i20 % 2 == 0) {
                String str13 = purchasePaper.releaseName;
                throw null;
            }
            str10 = purchasePaper.releaseName;
        } else {
            str10 = str5;
        }
        return purchasePaper.copy(str7, optimizedAttributes2, z2, str8, i4, str9, str12, i19, str10, (i3 & 512) != 0 ? purchasePaper.releaseValue : str6);
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 35;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.releaseValue;
        int i4 = i2 + 81;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final OptimizedAttributes component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        OptimizedAttributes optimizedAttributes = this.optimizedAttributes;
        int i5 = i2 + 13;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return optimizedAttributes;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.optimizedStatus;
        int i5 = i3 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.price;
        int i4 = i3 + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int component5() {
        int i;
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 109;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.productId;
            int i5 = 75 / 0;
        } else {
            i = this.productId;
        }
        int i6 = i3 + 53;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.productName;
        int i4 = i3 + 89;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.releaseDate;
        int i5 = i3 + 111;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component8() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.releaseId;
        int i5 = i3 + 45;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 59;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.releaseName;
        int i5 = i2 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PurchasePaper copy(String baseUrl, OptimizedAttributes optimizedAttributes, boolean optimizedStatus, String price, int productId, String productName, String releaseDate, int releaseId, String releaseName, String releaseValue) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(baseUrl, "");
        Intrinsics.checkNotNullParameter(optimizedAttributes, "");
        Intrinsics.checkNotNullParameter(price, "");
        Intrinsics.checkNotNullParameter(productName, "");
        Intrinsics.checkNotNullParameter(releaseDate, "");
        Intrinsics.checkNotNullParameter(releaseName, "");
        Intrinsics.checkNotNullParameter(releaseValue, "");
        PurchasePaper purchasePaper = new PurchasePaper(baseUrl, optimizedAttributes, optimizedStatus, price, productId, productName, releaseDate, releaseId, releaseName, releaseValue);
        int i2 = copydefault + 11;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        return purchasePaper;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 71;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof PurchasePaper)) {
            return false;
        }
        PurchasePaper purchasePaper = (PurchasePaper) other;
        if (!Intrinsics.areEqual(this.baseUrl, purchasePaper.baseUrl) || !Intrinsics.areEqual(this.optimizedAttributes, purchasePaper.optimizedAttributes)) {
            return false;
        }
        if (this.optimizedStatus != purchasePaper.optimizedStatus) {
            int i4 = copydefault + 123;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.price, purchasePaper.price) || this.productId != purchasePaper.productId || (!Intrinsics.areEqual(this.productName, purchasePaper.productName)) || !Intrinsics.areEqual(this.releaseDate, purchasePaper.releaseDate)) {
            return false;
        }
        if (this.releaseId != purchasePaper.releaseId) {
            int i6 = component3 + 29;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.releaseName, purchasePaper.releaseName)) {
            int i7 = copydefault + 25;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.releaseValue, purchasePaper.releaseValue)) {
            return true;
        }
        int i9 = component3 + 51;
        copydefault = i9 % 128;
        return i9 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((this.baseUrl.hashCode() * 31) + this.optimizedAttributes.hashCode()) * 31) + Boolean.hashCode(this.optimizedStatus)) * 31) + this.price.hashCode()) * 31) + Integer.hashCode(this.productId)) * 31) + this.productName.hashCode()) * 31) + this.releaseDate.hashCode()) * 31) + Integer.hashCode(this.releaseId)) * 31) + this.releaseName.hashCode()) * 31) + this.releaseValue.hashCode();
        int i4 = copydefault + 11;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PurchasePaper(baseUrl=" + this.baseUrl + ", optimizedAttributes=" + this.optimizedAttributes + ", optimizedStatus=" + this.optimizedStatus + ", price=" + this.price + ", productId=" + this.productId + ", productName=" + this.productName + ", releaseDate=" + this.releaseDate + ", releaseId=" + this.releaseId + ", releaseName=" + this.releaseName + ", releaseValue=" + this.releaseValue + ")";
        int i2 = copydefault + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.baseUrl);
        this.optimizedAttributes.writeToParcel(dest, flags);
        dest.writeInt(this.optimizedStatus ? 1 : 0);
        dest.writeString(this.price);
        dest.writeInt(this.productId);
        dest.writeString(this.productName);
        dest.writeString(this.releaseDate);
        dest.writeInt(this.releaseId);
        dest.writeString(this.releaseName);
        dest.writeString(this.releaseValue);
        int i4 = component3 + 111;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
