package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.CharUtils;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\u0006H\u0007J\u0013\u0010*\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010,H×\u0003J\t\u0010-\u001a\u00020\u0006H×\u0001J\t\u0010.\u001a\u00020\u0003H×\u0001J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0006H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u00064"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/SubBundles;", "Landroid/os/Parcelable;", "productName", "", "productId", "productAmount", "", "productUnits", "autoRenew", "", "balanceCode", "type", "limit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductName", "()Ljava/lang/String;", "getProductId", "getProductAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProductUnits", "getAutoRenew", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBalanceCode", "getType", "getLimit", "toWithExpiryResp", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "validity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/SubBundles;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubBundles implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SubBundles> CREATOR;
    private static int component2;
    private static int component3;
    private static int copydefault;

    @SerializedName("autoRenew")
    private final Boolean autoRenew;

    @SerializedName("balanceCode")
    private final String balanceCode;

    @SerializedName("limit")
    private final String limit;

    @SerializedName("productAmount")
    private final Integer productAmount;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("productUnits")
    private final String productUnits;

    @SerializedName("type")
    private final String type;
    private static final byte[] $$c = {79, 9, 94, -7};
    private static final int $$f = 52;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {1, -128, 109, -128, -38, -24, -29, -25, -25, -17, -35, -32, 39};
    private static final int $$e = 96;
    private static final byte[] $$a = {Ascii.SI, -57, -42, 5, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -40, 39, Ascii.US, 7, 38, 34};
    private static final int $$b = 201;
    private static int component1 = 0;
    private static int equals = 1;
    private static int ShareDataUIState = 0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SubBundles> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SubBundles createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Boolean bool;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = component2 + 103;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string3 = parcel.readString();
            boolean z = false;
            if (parcel.readInt() == 0) {
                int i4 = component2 + 21;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 71 / 0;
                }
                bool = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i6 = ShareDataUIState + 109;
                    component2 = i6 % 128;
                    if (i6 % 2 == 0) {
                        z = true;
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                int i7 = ShareDataUIState + 65;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                bool = boolValueOf;
            }
            return new SubBundles(string, string2, numValueOf, string3, bool, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override
        public SubBundles createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 115;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            SubBundles subBundlesCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 111;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return subBundlesCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SubBundles[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 109;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            SubBundles[] subBundlesArr = new SubBundles[i];
            int i6 = i3 + 77;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return subBundlesArr;
        }

        @Override
        public SubBundles[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 119;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            SubBundles[] subBundlesArrNewArray = newArray(i);
            int i4 = ShareDataUIState + 33;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return subBundlesArrNewArray;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r6, int r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.SubBundles.$$c
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = r6 + 1
            int r8 = r8 * 2
            int r8 = 65 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.SubBundles.$$g(short, int, byte):java.lang.String");
    }

    private static void a(short s, byte b2, int i, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = i * 4;
        int i3 = 22 - (s * 9);
        int i4 = (b2 * 2) + 99;
        byte[] bArr2 = new byte[10 - i2];
        int i5 = 9 - i2;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i4 = (i5 + i3) - 27;
            i3++;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4;
            int i9 = i3 + 1;
            i6 = i7;
            i4 = (i8 + bArr[i3]) - 27;
            i3 = i9;
        }
    }

    private static void d(short s, short s2, short s3, Object[] objArr) {
        int i = s3 * 3;
        byte[] bArr = $$d;
        int i2 = s2 + 4;
        int i3 = 99 - (s * 4);
        byte[] bArr2 = new byte[i + 10];
        int i4 = i + 9;
        int i5 = -1;
        if (bArr == null) {
            i3 = (i2 + (-i3)) - 26;
            i5 = -1;
        }
        while (true) {
            int i6 = i2;
            int i7 = i3;
            int i8 = i5 + 1;
            int i9 = i6 + 1;
            bArr2[i8] = (byte) i7;
            if (i8 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = i9;
                i3 = (i7 + (-bArr[i9])) - 26;
                i5 = i8;
            }
        }
    }

    public SubBundles(String str, String str2, Integer num, String str3, Boolean bool, String str4, String str5, String str6) {
        this.productName = str;
        this.productId = str2;
        this.productAmount = num;
        this.productUnits = str3;
        this.autoRenew = bool;
        this.balanceCode = str4;
        this.type = str5;
        this.limit = str6;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.productName;
        int i4 = i3 + 51;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productId;
        int i5 = i2 + 87;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getProductAmount() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 51;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.productAmount;
        int i5 = i2 + 111;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getProductUnits() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 123;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productUnits;
        int i5 = i2 + 13;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final Boolean getAutoRenew() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 27;
        equals = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.autoRenew;
        int i5 = i2 + 47;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final String getBalanceCode() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.balanceCode;
        int i5 = i3 + 77;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 87;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLimit() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 15;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.limit;
        int i5 = i2 + 13;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final WithExpiryResp toWithExpiryResp(String validity) {
        int iIntValue;
        String str;
        String str2;
        int i = 2 % 2;
        int i2 = component1 + 13;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(validity, "");
        String str3 = this.productName;
        String str4 = str3 == null ? "" : str3;
        String str5 = this.productId;
        String str6 = str5 == null ? "" : str5;
        Integer num = this.productAmount;
        if (num != null) {
            int i4 = component1 + 103;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                num.intValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            iIntValue = num.intValue();
            int i5 = component1 + 51;
            equals = i5 % 128;
            int i6 = i5 % 2;
        } else {
            iIntValue = 0;
        }
        int i7 = iIntValue;
        String str7 = this.productUnits;
        if (str7 == null) {
            int i8 = component1 + 1;
            equals = i8 % 128;
            int i9 = i8 % 2;
            str = "";
        } else {
            str = str7;
        }
        String str8 = this.type;
        if (str8 == null) {
            int i10 = component1 + 125;
            equals = i10 % 128;
            int i11 = i10 % 2;
            str2 = "";
        } else {
            str2 = str8;
        }
        return new WithExpiryResp(str4, String.valueOf(i7), str, false, true, str6, validity, null, null, str2, null, null, null, null, 0, null, 64904, null);
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i3];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 3784, TextUtils.getOffsetAfter("", 0) + 38, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 26859), 2015799920, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7406, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, (char) (Process.myPid() >> 22), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $11 + 97;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            int i8 = $10 + 3;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i3 - iTrustedWebActivityServiceStub.component1);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i3];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                int i10 = $11 + 51;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) TextUtils.getOffsetAfter("", 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void c(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            int i5 = $11 + 109;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - Drawable.resolveOpacity(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 39, (char) (Drawable.resolveOpacity(0, 0) + 26860), 2015799920, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7405, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            int i8 = $11 + 121;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            iTrustedWebActivityServiceStub.component1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
            int i10 = $11 + 107;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        if (z) {
            int i12 = $11 + 107;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                int i14 = $10 + 111;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 << iTrustedWebActivityServiceStub.ShareDataUIState) >> 1];
                    try {
                        Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getEdgeSlop() >> 16), 15 - MotionEvent.axisFromString(""), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                    Object[] objArr5 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7407 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i15 = $10 + 117;
        $11 = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public final Integer component3() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Integer num = this.productAmount;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-412868303);
        if (objCopydefault == null) {
            int iArgb = Color.argb(0, 0, 0, 0) + 1115;
            int iGreen = Color.green(0) + 22;
            char gidForName = (char) (Process.getGidForName("") + 1);
            byte b2 = (byte) 2;
            byte b3 = (byte) (b2 - 2);
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iArgb, iGreen, gidForName, 574488148, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(104 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new char[]{'\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483}, 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), false, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((ViewConfiguration.getWindowTouchSlop() >> 8) + 107, 5 - MotionEvent.axisFromString(""), new char[]{65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, CharUtils.CR, 5, 65530, 65534, 65515, 65533}, (ViewConfiguration.getPressedStateDuration() >> 16) + 15, true, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-413791824);
        if (objCopydefault2 == null) {
            int threadPriority = 1115 - ((Process.getThreadPriority(0) + 20) >> 6);
            int iIndexOf = 22 - TextUtils.indexOf("", "", 0);
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            byte b4 = (byte) ($$b & 7);
            byte b5 = (byte) (b4 - 1);
            Object[] objArr5 = new Object[1];
            a(b4, b5, b5, objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, iIndexOf, edgeSlop, 571463381, false, (String) objArr5[0], null);
        }
        if (j != ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object[] objArr6 = new Object[1];
            b((Process.myTid() >> 22) + 103, 18 - View.resolveSizeAndState(0, 0, 0), new char[]{6, 19, 6, 17, 0, 65502, 65483, CharUtils.CR, CharUtils.CR, 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17}, 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), true, objArr6);
            Class<?> cls2 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            b(110 - (ViewConfiguration.getEdgeSlop() >> 16), Drawable.resolveOpacity(0, 0) + 14, new char[]{65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b'}, 18 - (ViewConfiguration.getLongPressTimeout() >> 16), false, objArr7);
            Method method = cls2.getMethod((String) objArr7[0], new Class[0]);
            Context applicationContext = (Context) method.invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr8 = new Object[1];
            b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 102, (ViewConfiguration.getScrollBarSize() >> 8) + 16, new char[]{'\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, false, objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 105, 9 - ExpandableListView.getPackedPositionType(0L), new char[]{65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, CharUtils.CR, 65531}, View.MeasureSpec.makeMeasureSpec(0, 0) + 16, true, objArr9);
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), -682037781};
                Object[] objArr11 = new Object[1];
                c(new char[]{'\t', 11, 0, 1, '\b', 65482, 65518, 1, 15, 1, 16, 65516, 5, '\n', 65515, 16, '\f', 65522, 5, 1, 19, 65513, 11, 0, 1, '\b', 65531, 65506, 65533, 65535, 16, 11, 14, 21, 65535, 11, '\t', 65482, 4, 17, 65533, 19, 1, 5, 65482, 0, 5, 3, 5, 16, 65533, '\b', '\f', 65533, 21, '\t', 1, '\n', 16, 65482, 65535, 11, '\n', 15, 17, '\t', 1, 14, 65482, '\b', 11, 3, 5, '\n', 65513, 11, 0, 17, '\b', 1, 65482, '\t', '\f', 5, '\n', 65482, 18, 5, 1, 19}, 168 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 91, 34 - KeyEvent.getDeadChar(0, 0), false, objArr11);
                Class<?> cls4 = Class.forName(((String) objArr11[0]).intern());
                byte b6 = $$d[0];
                byte b7 = (byte) (b6 - 1);
                byte b8 = (byte) (-b6);
                Object[] objArr12 = new Object[1];
                d(b7, b8, (byte) (b8 + 1), objArr12);
                Object[] objArr13 = (Object[]) cls4.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    int i2 = component1 + 119;
                    equals = i2 % 128;
                    int i3 = i2 % 2;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1207399525);
                    if (objCopydefault3 == null) {
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1115;
                        int offsetBefore = 22 - TextUtils.getOffsetBefore("", 0);
                        char c2 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        byte b9 = (byte) 0;
                        byte b10 = (byte) (b9 + 1);
                        Object[] objArr14 = new Object[1];
                        a(b9, b10, b10, objArr14);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, offsetBefore, c2, 2102482174, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault3).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        b(TextUtils.getCapsMode("", 0, 0) + 103, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, new char[]{'\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483}, 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), false, objArr15);
                        Class<?> cls5 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        b(107 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5, new char[]{65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, CharUtils.CR, 5, 65530, 65534, 65515, 65533}, 15 - (KeyEvent.getMaxKeyCode() >> 16), true, objArr16);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-413791824);
                        if (objCopydefault4 == null) {
                            int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1114;
                            int capsMode = TextUtils.getCapsMode("", 0, 0) + 22;
                            char cResolveSize = (char) View.resolveSize(0, 0);
                            byte b11 = (byte) ($$b & 7);
                            byte b12 = (byte) (b11 - 1);
                            Object[] objArr17 = new Object[1];
                            a(b11, b12, b12, objArr17);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i4, capsMode, cResolveSize, 571463381, false, (String) objArr17[0], null);
                        }
                        ((Field) objCopydefault4).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-412868303);
                        if (objCopydefault5 == null) {
                            int iIndexOf2 = 1115 - TextUtils.indexOf("", "");
                            int absoluteGravity = 22 + Gravity.getAbsoluteGravity(0, 0);
                            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                            byte b13 = (byte) 2;
                            byte b14 = (byte) (b13 - 2);
                            Object[] objArr18 = new Object[1];
                            a(b13, b14, b14, objArr18);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, absoluteGravity, jumpTapTimeout, 574488148, false, (String) objArr18[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr13;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            int i5 = component1 + 53;
            equals = i5 % 128;
            int i6 = i5 % 2;
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1207399525);
            if (objCopydefault6 == null) {
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1115;
                int i7 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte b15 = (byte) 0;
                byte b16 = (byte) (b15 + 1);
                Object[] objArr19 = new Object[1];
                a(b15, b16, b16, objArr19);
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(doubleTapTimeout, i7, fadingEdgeLength, 2102482174, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objCopydefault6).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr20[1])[0]}, new int[]{((int[]) objArr20[2])[0]}, (String[]) objArr20[3]};
            int iNextInt = new Random().nextInt(536956402);
            int i8 = ~iNextInt;
            int i9 = ((((((~(316400027 | i8)) | (~((-509597516) | iNextInt))) | (~(i8 | 509597515))) * 959) + 137666478) + (((~(iNextInt | 509597515)) | ((~(i8 | (-509597516))) | (~(316400027 | iNextInt)))) * 959)) - 682037781;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[0])[0] = i11 ^ (i11 << 5);
        }
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 == i12) {
            int i14 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i15 = i14 + 1091849183 + (((~((-264625) | (~iIdentityHashCode))) | (~(192932863 | iIdentityHashCode))) * (-272)) + (((~((-35089394) | iIdentityHashCode)) | 34824769) * (-272)) + (((~(iIdentityHashCode | 35089393)) | 158108094) * 272);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr21[0])[0] = i17 ^ (i17 << 5);
            int i18 = ((int[]) objArr21[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr21[1])[0]}, new int[]{((int[]) objArr21[2])[0]}, (String[]) objArr21[3]};
            int iMyPid = Process.myPid();
            int i19 = i18 + 1575495319 + (((~(694388220 | iMyPid)) | 344226304) * 104) + ((~((~iMyPid) | (-151028817))) * (-104)) + ((iMyPid | 887585708) * 104);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr22[0])[0] = i21 ^ (i21 << 5);
        } else {
            long j2 = -1;
            long j3 = ((long) (i12 ^ i13)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 7) << 32) | (j4 - ((j4 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.indexOf((CharSequence) "", '0'), Color.green(0) + 42, (char) View.getDefaultSize(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr23 = {1062525854, Long.valueOf(j5), new ArrayList(), null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 56 - TextUtils.getOffsetAfter("", 0), (char) (KeyEvent.getMaxKeyCode() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr23);
                int i22 = ((int[]) objArr[0])[0];
                Object[] objArr24 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int i23 = ~System.identityHashCode(this);
                int i24 = ~(1036117214 | i23);
                int i25 = i22 + 1003920575 + ((i24 | (-842919727)) * 764) + (((~(i23 | (-842919727))) | 805430286) * (-1528)) + (((-268176369) | i24) * 764);
                int i26 = (i25 << 13) ^ i25;
                int i27 = i26 ^ (i26 >>> 17);
                ((int[]) objArr24[0])[0] = i27 ^ (i27 << 5);
                int[] iArr = new int[i13];
                int i28 = i13 - 1;
                iArr[i28] = 1;
                Toast.makeText((Context) null, iArr[((i13 * i28) % 2) - 1], 1).show();
                int i29 = ((int[]) objArr24[0])[0];
                Object[] objArr25 = {new int[1], new int[]{((int[]) objArr24[1])[0]}, new int[]{((int[]) objArr24[2])[0]}, (String[]) objArr24[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i30 = i29 + 937575327 + (((~((-334927695) | iIdentityHashCode2)) | 327423552) * 1504) + ((~(iIdentityHashCode2 | (-7504143))) * (-1504)) + 731838992;
                int i31 = (i30 << 13) ^ i30;
                int i32 = i31 ^ (i31 >>> 17);
                ((int[]) objArr25[0])[0] = i32 ^ (i32 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        return num;
    }

    static {
        component3 = 1;
        copydefault();
        ShareDataUIState();
        CREATOR = new Creator();
        int i = ShareDataUIState + 57;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static SubBundles copy$default(SubBundles subBundles, String str, String str2, Integer num, String str3, Boolean bool, String str4, String str5, String str6, int i, Object obj) {
        Boolean bool2;
        String str7;
        int i2 = 2 % 2;
        String str8 = (i & 1) != 0 ? subBundles.productName : str;
        String str9 = (i & 2) != 0 ? subBundles.productId : str2;
        Integer num2 = (i & 4) != 0 ? subBundles.productAmount : num;
        String str10 = (i & 8) != 0 ? subBundles.productUnits : str3;
        if ((i & 16) != 0) {
            int i3 = component1 + 55;
            equals = i3 % 128;
            int i4 = i3 % 2;
            bool2 = subBundles.autoRenew;
        } else {
            bool2 = bool;
        }
        if ((i & 32) != 0) {
            int i5 = component1 + 35;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                String str11 = subBundles.balanceCode;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str7 = subBundles.balanceCode;
        } else {
            str7 = str4;
        }
        return subBundles.copy(str8, str9, num2, str10, bool2, str7, (i & 64) != 0 ? subBundles.type : str5, (i & 128) != 0 ? subBundles.limit : str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.productName;
        int i4 = i3 + 101;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 111;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productId;
        int i5 = i2 + 89;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = equals + 25;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.productUnits;
        int i5 = i3 + 15;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component5() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.autoRenew;
        int i4 = i3 + 55;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return bool;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.balanceCode;
        int i5 = i3 + 5;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 97;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = equals + 15;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.limit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SubBundles copy(String productName, String productId, Integer productAmount, String productUnits, Boolean autoRenew, String balanceCode, String type, String limit) {
        int i = 2 % 2;
        SubBundles subBundles = new SubBundles(productName, productId, productAmount, productUnits, autoRenew, balanceCode, type, limit);
        int i2 = equals + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return subBundles;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubBundles)) {
            int i2 = component1 + 77;
            equals = i2 % 128;
            return i2 % 2 == 0;
        }
        SubBundles subBundles = (SubBundles) other;
        if (!Intrinsics.areEqual(this.productName, subBundles.productName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.productId, subBundles.productId)) {
            int i3 = equals + 79;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productAmount, subBundles.productAmount) || !Intrinsics.areEqual(this.productUnits, subBundles.productUnits) || !Intrinsics.areEqual(this.autoRenew, subBundles.autoRenew)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.balanceCode, subBundles.balanceCode)) {
            int i5 = equals + 7;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.type, subBundles.type)) {
            int i7 = component1 + 71;
            equals = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.limit, subBundles.limit))) {
            return true;
        }
        int i9 = equals + 69;
        component1 = i9 % 128;
        return i9 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.productName;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.productId;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.productAmount;
        if (num == null) {
            int i2 = equals + 67;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        String str3 = this.productUnits;
        if (str3 == null) {
            int i4 = component1 + 87;
            equals = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        Boolean bool = this.autoRenew;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        String str4 = this.balanceCode;
        if (str4 == null) {
            int i6 = equals + 35;
            component1 = i6 % 128;
            iHashCode3 = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.type;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.limit;
        if (str6 == null) {
            int i7 = equals + 23;
            component1 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            iHashCode4 = str6.hashCode();
            int i9 = equals + 35;
            component1 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 / 2;
            }
        }
        return (((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + iHashCode8) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SubBundles(productName=" + this.productName + ", productId=" + this.productId + ", productAmount=" + this.productAmount + ", productUnits=" + this.productUnits + ", autoRenew=" + this.autoRenew + ", balanceCode=" + this.balanceCode + ", type=" + this.type + ", limit=" + this.limit + ")";
        int i2 = component1 + 111;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = equals + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.productName);
            dest.writeString(this.productId);
            throw null;
        }
        dest.writeString(this.productName);
        dest.writeString(this.productId);
        Integer num = this.productAmount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.productUnits);
        Boolean bool = this.autoRenew;
        if (bool == null) {
            int i4 = equals + 117;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.balanceCode);
        dest.writeString(this.type);
        dest.writeString(this.limit);
    }

    static void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        component2 = -890926374;
        int i5 = i3 + 105;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    static void copydefault() {
        copydefault = -890926435;
    }
}
