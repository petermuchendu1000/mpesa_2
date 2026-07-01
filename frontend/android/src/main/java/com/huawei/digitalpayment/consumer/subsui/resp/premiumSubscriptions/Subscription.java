package com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.engine.common.track.recovery.DeepRecoverARiverProxy;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePaymentPayload;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/resp/premiumSubscriptions/Subscription;", "Landroid/os/Parcelable;", "amount", "", "offerName", "offeringId", "productId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getOfferName", "getOfferingId", "getProductId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Subscription implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Subscription> CREATOR;
    private static char[] component1;
    private static int component2;
    private static long component3;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("offerName")
    private final String offerName;

    @SerializedName("offeringId")
    private final String offeringId;

    @SerializedName("productId")
    private final String productId;
    private static final byte[] $$c = {73, 121, -48, -56};
    private static final int $$d = 219;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {120, -46, -95, -23, Ascii.FS, 17, Ascii.EM, -5, 17, 17, Ascii.VT, 36, 7, Ascii.CAN, 37, 9, 33, 3, -17, 45, 35, -3, 4, 4, Ascii.SUB, TarHeader.LF_LINK, -3, 35, 1, Ascii.FS, Ascii.SO, 19, Ascii.SI, Ascii.SI, 7, Ascii.EM, Ascii.SYN, -49};
    private static final int $$b = 3;
    private static int copydefault = 0;
    private static int equals = 1;
    private static int ShareDataUIState = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Subscription> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Subscription createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Subscription subscription = new Subscription(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 105;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 67 / 0;
            }
            return subscription;
        }

        @Override
        public Subscription createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 29;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Subscription[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 115;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            Subscription[] subscriptionArr = new Subscription[i];
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 65;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return subscriptionArr;
        }

        @Override
        public Subscription[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 83;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r6, short r7, short r8) {
        /*
            int r7 = r7 + 117
            byte[] r0 = com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.Subscription.$$c
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L20:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L29:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.Subscription.$$e(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 5
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.Subscription.$$a
            int r5 = r5 * 16
            int r5 = 99 - r5
            int r1 = r7 + 10
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r5 = r5 + r4
            int r5 = r5 + (-16)
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.Subscription.a(short, int, int, java.lang.Object[]):void");
    }

    public Subscription(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.amount = str;
        this.offerName = str2;
        this.offeringId = str3;
        this.productId = str4;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 85;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOfferName() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.offerName;
        int i5 = i3 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOfferingId() {
        int i = 2 % 2;
        int i2 = equals + 75;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.offeringId;
        }
        throw null;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = equals + 23;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r20, int r21, char r22, java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions.Subscription.b(int, int, char, java.lang.Object[]):void");
    }

    public final String component3() throws Throwable {
        Object[] objArrShareDataUIState$16dd2b22;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
        if (objCopydefault == null) {
            int maxKeyCode = 2405 - (KeyEvent.getMaxKeyCode() >> 16);
            int i2 = 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
            byte b2 = (byte) ($$b - 3);
            Object[] objArr = new Object[1];
            a(b2, b2, $$a[28], objArr);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(maxKeyCode, i2, modifierMetaStateMask, 1926552790, false, (String) objArr[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr2 = new Object[1];
        b((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22, Color.rgb(0, 0, 0) + 16777216, (char) View.combineMeasuredStates(0, 0), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b(15 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 22, (char) (63733 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-873460037);
        if (objCopydefault2 == null) {
            byte b3 = $$a[28];
            byte b4 = (byte) (b3 + 1);
            Object[] objArr4 = new Object[1];
            a(b3, b4, (byte) (b4 + 4), objArr4);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 2406, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 246010334, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
            if (objCopydefault3 == null) {
                int i3 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2404;
                int iGreen = Color.green(0) + 26;
                char c2 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte b5 = (byte) ($$b - 3);
                byte b6 = (byte) (-$$a[7]);
                Object[] objArr5 = new Object[1];
                a(b5, b6, (byte) (b6 - 5), objArr5);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i3, iGreen, c2, 21921080, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objCopydefault3).get(null);
            objArrShareDataUIState$16dd2b22 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int i4 = ~System.identityHashCode(this);
            int i5 = (((-2012517906) + (((~(186658861 | i4)) | (-249417224)) * (-983))) + (((~(i4 | (-249417224))) | 167772165) * 983)) - 888083018;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArrShareDataUIState$16dd2b22[1])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            b(16 - ExpandableListView.getPackedPositionGroup(0L), 36 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, 53 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 63645), objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {361219739};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2036074497);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2393 - View.resolveSize(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12, (char) (TextUtils.getTrimmedLength("") + 30139), 1140467866, false, null, new Class[]{Integer.TYPE});
                }
                objArrShareDataUIState$16dd2b22 = FibrePaymentPayload.Creator.ShareDataUIState$16dd2b22(iIntValue, 0, ((Constructor) objCopydefault4).newInstance(objArr9), -888083018, false, false);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
                if (objCopydefault5 == null) {
                    int i8 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2404;
                    int capsMode = 26 - TextUtils.getCapsMode("", 0, 0);
                    char mode = (char) View.MeasureSpec.getMode(0);
                    byte b7 = (byte) ($$b - 3);
                    byte b8 = (byte) (-$$a[7]);
                    Object[] objArr10 = new Object[1];
                    a(b7, b8, (byte) (b8 - 5), objArr10);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i8, capsMode, mode, 21921080, false, (String) objArr10[0], null);
                }
                ((Field) objCopydefault5).set(null, objArrShareDataUIState$16dd2b22);
                try {
                    Object[] objArr11 = new Object[1];
                    b(21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), Color.green(0), (char) View.MeasureSpec.getSize(0), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b(Color.green(0) + 15, 22 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 63732), objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-873460037);
                    if (objCopydefault6 == null) {
                        int i9 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2405;
                        int i10 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 25;
                        char cMyTid = (char) (Process.myTid() >> 22);
                        byte b9 = $$a[28];
                        byte b10 = (byte) (b9 + 1);
                        Object[] objArr13 = new Object[1];
                        a(b9, b10, (byte) (b10 + 4), objArr13);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i9, i10, cMyTid, 246010334, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
                    if (objCopydefault7 == null) {
                        int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2405;
                        int capsMode2 = 26 - TextUtils.getCapsMode("", 0, 0);
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                        byte b11 = (byte) ($$b - 3);
                        Object[] objArr14 = new Object[1];
                        a(b11, b11, $$a[28], objArr14);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(i11, capsMode2, cLastIndexOf, 1926552790, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
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
        int i12 = ((int[]) objArrShareDataUIState$16dd2b22[0])[0];
        int i13 = ((int[]) objArrShareDataUIState$16dd2b22[2])[0];
        if (i13 == i12) {
            int i14 = copydefault + 63;
            equals = i14 % 128;
            int i15 = i14 % 2;
            int i16 = ((int[]) objArrShareDataUIState$16dd2b22[1])[0];
            Object[] objArr15 = {new int[]{((int[]) objArrShareDataUIState$16dd2b22[0])[0]}, new int[1], new int[]{((int[]) objArrShareDataUIState$16dd2b22[2])[0]}, (String[]) objArrShareDataUIState$16dd2b22[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i17 = ~(555159438 | iIdentityHashCode);
            int i18 = ~iIdentityHashCode;
            int i19 = i17 | (~(617917800 | i18));
            int i20 = ~((-555159439) | i18);
            int i21 = i16 + 345291773 + ((i19 | i20) * (-516)) + (((~(iIdentityHashCode | (-79732833))) | (~((-538184969) | i18))) * DeepRecoverARiverProxy.TYPE_EXCEPTION_CANNOT_CRASH_PAGE) + ((538184968 | i20) * DeepRecoverARiverProxy.TYPE_EXCEPTION_CANNOT_CRASH_PAGE);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr15[1])[0] = i23 ^ (i23 << 5);
            int i24 = ((int[]) objArr15[1])[0];
            Object[] objArr16 = {new int[]{((int[]) objArr15[0])[0]}, new int[1], new int[]{((int[]) objArr15[2])[0]}, (String[]) objArr15[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i25 = i24 + (-1138607335) + (((~(591575182 | iIdentityHashCode2)) | 654333544) * (-366)) + (((~(iIdentityHashCode2 | 658702062)) | 587206664) * 366);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr16[1])[0] = i27 ^ (i27 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrShareDataUIState$16dd2b22[3];
            if (strArr != null) {
                for (String str : strArr) {
                    int i28 = copydefault + 39;
                    equals = i28 % 128;
                    int i29 = i28 % 2;
                    arrayList.add(str);
                }
            }
            long j2 = -1;
            long j3 = ((long) (i12 ^ i13)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 2) << 32) | (j4 - ((j4 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 6619, ImageFormat.getBitsPerPixel(0) + 43, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault8).invoke(null, null);
            Object[] objArr17 = {361219739, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getEdgeSlop() >> 16) + 56, (char) ('0' - AndroidCharacter.getMirror('0')), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault9).invoke(objInvoke, objArr17);
            int i30 = ((int[]) objArrShareDataUIState$16dd2b22[1])[0];
            Object[] objArr18 = {new int[]{((int[]) objArrShareDataUIState$16dd2b22[0])[0]}, new int[1], new int[]{((int[]) objArrShareDataUIState$16dd2b22[2])[0]}, (String[]) objArrShareDataUIState$16dd2b22[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i31 = ~iElapsedRealtime;
            int i32 = i30 + 598528085 + ((499808246 | iElapsedRealtime) * (-676)) + (((~(482874096 | i31)) | (-499808247)) * 676) + (((~(iElapsedRealtime | (-16934151))) | (~(i31 | 420115734)) | 79692512) * 676);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr18[1])[0] = i34 ^ (i34 << 5);
            int[] iArr = new int[i13];
            int i35 = i13 - 1;
            iArr[i35] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i35) % 2) - 1], 1).show();
            int i36 = ((int[]) objArr18[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr18[0])[0]}, new int[1], new int[]{((int[]) objArr18[2])[0]}, (String[]) objArr18[3]};
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i37 = i36 + (((2137300427 + (((~((~iIdentityHashCode3) | 1007570360)) | 63021570) * 446)) + (((~(iIdentityHashCode3 | 1070591930)) | 1007307152) * 446)) - 1957150852);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr19[1])[0] = i39 ^ (i39 << 5);
        }
        return this.offeringId;
    }

    static {
        component2 = 0;
        ShareDataUIState();
        CREATOR = new Creator();
        int i = ShareDataUIState + 41;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static Subscription copy$default(Subscription subscription, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = subscription.amount;
        }
        if ((i & 2) != 0) {
            int i3 = equals + 27;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str2 = subscription.offerName;
        }
        if ((i & 4) != 0) {
            int i5 = copydefault + 49;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                String str5 = subscription.offeringId;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str3 = subscription.offeringId;
        }
        if ((i & 8) != 0) {
            str4 = subscription.productId;
        }
        Subscription subscriptionCopy = subscription.copy(str, str2, str3, str4);
        int i6 = copydefault + 27;
        equals = i6 % 128;
        int i7 = i6 % 2;
        return subscriptionCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 21;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 67;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.offerName;
        int i4 = i2 + 61;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = equals + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.productId;
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return str;
    }

    public final Subscription copy(String amount, String offerName, String offeringId, String productId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(offerName, "");
        Intrinsics.checkNotNullParameter(offeringId, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Subscription subscription = new Subscription(amount, offerName, offeringId, productId);
        int i2 = copydefault + 61;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return subscription;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        equals = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 107;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) other;
        if (Intrinsics.areEqual(this.amount, subscription.amount)) {
            if (!Intrinsics.areEqual(this.offerName, subscription.offerName)) {
                int i4 = copydefault + 73;
                equals = i4 % 128;
                return i4 % 2 == 0;
            }
            if (Intrinsics.areEqual(this.offeringId, subscription.offeringId)) {
                return Intrinsics.areEqual(this.productId, subscription.productId);
            }
            int i5 = equals + 123;
            copydefault = i5 % 128;
            return i5 % 2 != 0;
        }
        int i6 = equals;
        int i7 = i6 + 81;
        copydefault = i7 % 128;
        boolean z = i7 % 2 != 0;
        int i8 = i6 + 117;
        copydefault = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 96 / 0;
        }
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = equals + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.amount.hashCode();
        return i3 != 0 ? (((((iHashCode / 85) >>> this.offerName.hashCode()) * 58) >> this.offeringId.hashCode()) << 76) - this.productId.hashCode() : (((((iHashCode * 31) + this.offerName.hashCode()) * 31) + this.offeringId.hashCode()) * 31) + this.productId.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Subscription(amount=" + this.amount + ", offerName=" + this.offerName + ", offeringId=" + this.offeringId + ", productId=" + this.productId + ")";
        int i2 = copydefault + 113;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.amount);
            dest.writeString(this.offerName);
            dest.writeString(this.offeringId);
            dest.writeString(this.productId);
            throw null;
        }
        dest.writeString(this.amount);
        dest.writeString(this.offerName);
        dest.writeString(this.offeringId);
        dest.writeString(this.productId);
        int i4 = equals + 99;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ShareDataUIState() {
        component1 = new char[]{3095, 1561, 6160, 4615, 9245, 15898, 12308, 19039, 23569, 22028, 26706, 25134, 29699, 36360, 32780, 39452, 44043, 42532, 47112, 45578, 50177, 56840, 62694, 65262, 57568, 60144, 56564, 50915, 51425, 45782, 42222, 44779, 37093, 39676, 36070, 30435, 30952, 3100, 1558, 6146, 4628, 9308, 15903, 12305, 18975, 23577, 22097, 26671, 25092, 29705, 36367, 32797, 39444, 62594, 65166, 57484, 60038, 56475, 50823, 51353, 45717, 42155, 44675, 37010, 39560, 36004, 30345, 30849, 25217};
        component3 = 5685826830511179383L;
    }
}
