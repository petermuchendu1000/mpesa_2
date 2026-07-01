package com.huawei.digitalpayment.consumer.subsui.resp.skiza;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.catalog.GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H×\u0003J\t\u0010!\u001a\u00020\u001dH×\u0001J\t\u0010\"\u001a\u00020\u0003H×\u0001J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/resp/skiza/SkizaTone;", "Landroid/os/Parcelable;", "name", "", "subscriptionID", "singerName", "amount", "selected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getSubscriptionID", "getSingerName", "getAmount", "setAmount", "(Ljava/lang/String;)V", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SkizaTone implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SkizaTone> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("Amount")
    private String amount;

    @SerializedName("Name")
    private final String name;
    private boolean selected;

    @SerializedName("SingerName")
    private final String singerName;

    @SerializedName("SubscriptionID")
    private final String subscriptionID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SkizaTone> {
        private static final byte[] $$a = {1, -128, 109, -128, 6, -5, 3};
        private static final int $$b = 65;
        private static int component2 = 0;
        private static int component3 = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 2
                int r6 = 99 - r6
                int r8 = r8 * 3
                int r8 = 4 - r8
                byte[] r0 = com.huawei.digitalpayment.consumer.subsui.resp.skiza.SkizaTone.Creator.$$a
                int r7 = r7 * 3
                int r7 = 6 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                int r7 = r7 + 1
                if (r4 != r8) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                r3 = r0[r7]
            L2a:
                int r6 = r6 + r3
                int r6 = r6 + 6
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.subsui.resp.skiza.SkizaTone.Creator.a(byte, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SkizaTone createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = component2 + 73;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i4 = component2 + 15;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            return new SkizaTone(string, string2, string3, string4, z);
        }

        @Override
        public SkizaTone createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 31;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            SkizaTone skizaToneCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 103;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 70 / 0;
            }
            return skizaToneCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SkizaTone[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 121;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            SkizaTone[] skizaToneArr = new SkizaTone[i];
            int i6 = i4 + 59;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return skizaToneArr;
        }

        @Override
        public SkizaTone[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 35;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            SkizaTone[] skizaToneArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 61 / 0;
            }
            return skizaToneArrNewArray;
        }

        public static Object[] component1(int i, int i2, int i3) throws Throwable {
            int i4;
            CharSequence charSequence;
            CharSequence charSequence2;
            int i5;
            int i6;
            CharSequence charSequence3;
            int i7 = 2 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-876109068);
                if (objCopydefault == null) {
                    int i8 = 2262 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iLastIndexOf = 13 - TextUtils.lastIndexOf("", '0');
                    char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35831);
                    byte b2 = $$a[0];
                    byte b3 = (byte) (b2 - 1);
                    byte b4 = b2;
                    Object[] objArr = new Object[1];
                    a(b3, b4, (byte) (b4 - 1), objArr);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i8, iLastIndexOf, c2, 245267857, false, (String) objArr[0], new Class[0]);
                }
                long jLongValue = ((Long) ((Method) objCopydefault).invoke(null, null)).longValue();
                long j = -649343722;
                long j2 = -183;
                long j3 = -1;
                long j4 = j ^ j3;
                long startElapsedRealtime = ((long) ((int) Process.getStartElapsedRealtime())) ^ j3;
                long j5 = j4 | startElapsedRealtime;
                long j6 = jLongValue ^ j3;
                long j7 = j6 | startElapsedRealtime;
                long j8 = (j2 * j) + (j2 * jLongValue) + (((long) (-184)) * (((j5 | jLongValue) ^ j3) | ((j7 | j) ^ j3)));
                long j9 = 184;
                long j10 = j8 + ((((j4 | j6) ^ j3) | (j5 ^ j3) | (j7 ^ j3)) * j9) + (j9 * (j | jLongValue)) + ((long) (-1132182445));
                int i9 = (-1201832366) + (((~(1664166448 | i)) | 67403780 | (~((-1193574437) | i))) * (-754));
                int i10 = ~((-67403781) | i);
                int i11 = ~i;
                int i12 = ((int) (j10 >> 32)) & (i9 + (((~(i11 | (-1126170657))) | i10) * (-754)) + ((1664166448 | i11) * 754));
                int i13 = ((int) j10) & (169663790 + (((~((-274731095) | i11)) | 1711957504) * (-591)) + (((-274731095) | i) * 591));
                if (((i13 & i12) | (i12 ^ i13)) != 0) {
                    int i14 = component2;
                    int i15 = ((i14 | 37) << 1) - (i14 ^ 37);
                    component3 = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                int i17 = ~i;
                GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1.copydefault();
                int i18 = -i4;
                int i19 = ((i4 & i18) | (i4 ^ i18)) >> 31;
                int i20 = (~i19) & i;
                int i21 = i19 & (i ^ 264);
                int i22 = (i20 ^ i21) | (i21 & i20);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(686554871);
                if (objCopydefault2 == null) {
                    int iLastIndexOf2 = 4067 - TextUtils.lastIndexOf("", '0', 0);
                    int iResolveSize = 26 - View.resolveSize(0, 0);
                    char cMakeMeasureSpec = (char) (2041 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    byte b5 = $$a[0];
                    byte b6 = (byte) (b5 - 1);
                    byte b7 = b5;
                    Object[] objArr2 = new Object[1];
                    a(b6, b7, (byte) (b7 - 1), objArr2);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf2, iResolveSize, cMakeMeasureSpec, -307093102, false, (String) objArr2[0], new Class[0]);
                }
                long jLongValue2 = ((Long) ((Method) objCopydefault2).invoke(null, null)).longValue();
                long j11 = 1001523524;
                long j12 = -575;
                long j13 = (j12 * j11) + (j12 * jLongValue2);
                long j14 = 576;
                long j15 = j11 ^ j3;
                long j16 = jLongValue2 ^ j3;
                long j17 = (j15 | j16) ^ j3;
                long j18 = (int) Runtime.getRuntime().totalMemory();
                long j19 = j13 + ((j17 | ((j16 | j18) ^ j3)) * j14) + (((((j16 | (j18 ^ j3)) | j11) ^ j3) | ((j15 | jLongValue2) ^ j3)) * j14) + (j14 * j17) + ((long) (-1317853476));
                int i23 = component2;
                int i24 = (i23 & 95) + (i23 | 95);
                component3 = i24 % 128;
                int i25 = i24 % 2;
                int i26 = ((int) (j19 >> 32)) & (73955930 + (((~(421567473 | i)) | 612966408) * (-140)) + ((~(1034533881 | i)) * 70) + (((~(1015658937 | i)) | 631841352) * 70));
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i27 = ~startUptimeMillis;
                int i28 = ((int) ((long) ((((int) j19) & (((-868217777) + (((~((-176696471) | startUptimeMillis)) | ((~(i27 | (-1634976585))) | 1613922880)) * 717)) + (((~(startUptimeMillis | (-1634976585))) | ((~(i27 | (-176696471))) | 1613922880)) * 717))) | i26))) != 0 ? (i & (-282)) | (i11 & 281) : i;
                int i29 = i ^ i22;
                int i30 = (i29 | (-i29)) >> 31;
                int i31 = component3;
                int i32 = ((i31 | 27) << 1) - (i31 ^ 27);
                component2 = i32 % 128;
                if (i32 % 2 != 0) {
                    throw null;
                }
                int i33 = i28 & (~i30);
                int i34 = i30 & i22;
                int i35 = (i33 & i34) | (i33 ^ i34);
                if ((i2 & 16384) == 0) {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2147367226);
                    if (objCopydefault3 == null) {
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1758;
                        int i36 = 34 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        char c3 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        byte b8 = $$a[0];
                        byte b9 = b8;
                        Object[] objArr3 = new Object[1];
                        a(b9, (byte) (b9 - 1), b8, objArr3);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, i36, c3, 1163401635, false, (String) objArr3[0], new Class[0]);
                    }
                    long jLongValue3 = ((Long) ((Method) objCopydefault3).invoke(null, null)).longValue();
                    long j20 = -599440112;
                    long j21 = 503;
                    long j22 = -502;
                    long j23 = j20 | jLongValue3;
                    long j24 = (j21 * j20) + (j21 * jLongValue3) + (j22 * j23);
                    long j25 = j20 ^ j3;
                    long j26 = (j25 | (jLongValue3 ^ j3)) ^ j3;
                    long j27 = i;
                    long j28 = j25 | (j27 ^ j3);
                    long j29 = (j23 | j27) ^ j3;
                    charSequence = "";
                    long j30 = j24 + (j22 * (j26 | (j28 ^ j3) | j29)) + (((long) 502) * (j29 | ((jLongValue3 | j28) ^ j3))) + ((long) 1660767662);
                    int i37 = ((int) (j30 >> 32)) & ((-364794778) + (((~(1471603671 | i11)) | (-1386137214)) * (-602)) + (((~(1471603671 | i)) | (-1472129024) | (~((-1385611862) | i11))) * (-301)) + ((~(i11 | (-1386137214))) * 301));
                    int i38 = ~((int) SystemClock.uptimeMillis());
                    int i39 = ((int) j30) & ((((-1754753727) + (((~((-413958613) | i38)) | (-1023267798)) * (-828))) + ((i38 | (-413958613)) * (-828))) - 839652944);
                    int i40 = component3;
                    int i41 = (i40 & 61) + (i40 | 61);
                    int i42 = i41 % 128;
                    component2 = i42;
                    int i43 = i41 % 2;
                    int i44 = -i;
                    int i45 = i42 + 71;
                    component3 = i45 % 128;
                    int i46 = i45 % 2;
                    int i47 = ((i & i44) | (i ^ i44)) >> 31;
                    int i48 = (~i47) & i;
                    int i49 = ((i42 | 91) << 1) - (i42 ^ 91);
                    int i50 = i49 % 128;
                    component3 = i50;
                    int i51 = i49 % 2;
                    int i52 = i47 & ((i & (-269)) | (i11 & 268));
                    int i53 = (i52 & i48) | (i48 ^ i52);
                    int i54 = ((i50 | 9) << 1) - (i50 ^ 9);
                    int i55 = i54 % 128;
                    component2 = i55;
                    int i56 = i54 % 2;
                    int i57 = ((~i35) & i) | (i35 & i11);
                    int i58 = i57 | (-i57);
                    int i59 = (i55 & 69) + (i55 | 69);
                    int i60 = i59 % 128;
                    component3 = i60;
                    int i61 = i59 % 2 == 0 ? i58 * 31 : i58 >> 31;
                    int i62 = i53 & (~i61);
                    int i63 = (i60 & 123) + (i60 | 123);
                    component2 = i63 % 128;
                    if (i63 % 2 != 0) {
                        throw null;
                    }
                    i35 = (i35 & i61) | i62;
                } else {
                    charSequence = "";
                }
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1397258100);
                if (objCopydefault4 == null) {
                    int i64 = 1758 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 34;
                    char cMyPid = (char) (Process.myPid() >> 22);
                    byte b10 = $$a[0];
                    byte b11 = (byte) (b10 - 1);
                    byte b12 = b10;
                    Object[] objArr4 = new Object[1];
                    a(b11, b12, (byte) (b12 - 1), objArr4);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i64, absoluteGravity, cMyPid, -1777227759, false, (String) objArr4[0], new Class[0]);
                }
                long jLongValue4 = ((Long) ((Method) objCopydefault4).invoke(null, null)).longValue();
                long j31 = 372372096;
                long j32 = -318;
                long j33 = j31 ^ j3;
                long j34 = jLongValue4 ^ j3;
                int i65 = i35;
                long jNextInt = new Random().nextInt(1262134119);
                long j35 = (((long) (-317)) * j31) + (((long) 319) * jLongValue4) + (((((j33 | j34) | jNextInt) ^ j3) | ((((jNextInt ^ j3) | j31) | jLongValue4) ^ j3)) * j32) + (j32 * (((j34 | j31) ^ j3) | ((j31 | jNextInt) ^ j3))) + (((long) TypedValues.AttributesType.TYPE_PIVOT_TARGET) * (j34 | ((j33 | jNextInt) ^ j3))) + ((long) 589561710);
                int i66 = (int) (j35 >> 32);
                int i67 = component2;
                int i68 = (i67 ^ 113) + ((i67 & 113) << 1);
                component3 = i68 % 128;
                if (i68 % 2 == 0) {
                    Object obj = null;
                    Runtime.getRuntime().maxMemory();
                    obj.hashCode();
                    throw null;
                }
                int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                int i69 = i66 & (1053778754 + (((~((-115053608) | startElapsedRealtime2)) | (-1323292072)) * (-502)) + ((~((~startElapsedRealtime2) | (-1119269))) * (-502)) + (((~(startElapsedRealtime2 | (-1322172804))) | (-115053608)) * 502));
                int i70 = ((int) j35) & ((-1972008908) + (((~((-1701714080) | i11)) | (~((-1156026807) | i11))) * (-867)) + (((~((-1701714080) | i)) | 1147539606 | (~((-1156026807) | i))) * (-1734)) + (((~((-1147539607) | i11)) | (~((-554174474) | i)) | (~((-8487201) | i))) * 867));
                int i71 = (i & (-267)) | (i11 & 266);
                int i72 = -i;
                int i73 = component3;
                int i74 = (i73 & 9) + (i73 | 9);
                int i75 = i74 % 128;
                component2 = i75;
                int i76 = i74 % 2 != 0 ? (i | i72) * 21 : ((i & i72) | (i ^ i72)) >> 31;
                int i77 = (~i76) & i;
                int i78 = ((i75 | 99) << 1) - (i75 ^ 99);
                int i79 = i78 % 128;
                component3 = i79;
                int i80 = i78 % 2;
                int i81 = i76 & i71;
                int i82 = (i81 & i77) | (i77 ^ i81);
                int i83 = (~(i & i65)) & (i | i65);
                int i84 = -i83;
                int i85 = (i83 & i84) | (i83 ^ i84);
                int i86 = i79 + 21;
                component2 = i86 % 128;
                int i87 = i86 % 2;
                int i88 = i85 >> 31;
                int i89 = i82 & (~i88);
                int i90 = ((i79 | 85) << 1) - (i79 ^ 85);
                component2 = i90 % 128;
                if (i90 % 2 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i91 = i65 & i88;
                int i92 = (i89 & i91) | (i89 ^ i91);
                if ((i2 & 524288) == 0) {
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1348107492);
                    if (objCopydefault5 == null) {
                        charSequence3 = charSequence;
                        int capsMode = TextUtils.getCapsMode(charSequence3, 0, 0) + 3250;
                        int iAlpha = Color.alpha(0) + 16;
                        char c4 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        byte b13 = $$a[0];
                        byte b14 = (byte) (b13 - 1);
                        byte b15 = b13;
                        Object[] objArr5 = new Object[1];
                        a(b14, b15, (byte) (b15 - 1), objArr5);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, iAlpha, c4, 1794923641, false, (String) objArr5[0], new Class[0]);
                    } else {
                        charSequence3 = charSequence;
                    }
                    long jLongValue5 = ((Long) ((Method) objCopydefault5).invoke(null, null)).longValue();
                    long j36 = -1239712176;
                    long j37 = (((long) 477) * j36) + (((long) (-475)) * jLongValue5);
                    long j38 = ((j36 ^ j3) | jLongValue5) ^ j3;
                    long j39 = jLongValue5 ^ j3;
                    charSequence2 = charSequence3;
                    i5 = i17;
                    long j40 = (int) Runtime.getRuntime().totalMemory();
                    long j41 = ((j39 | j36) | j40) ^ j3;
                    long j42 = j37 + (((long) (-476)) * (j38 | j41)) + (((long) 952) * j41) + (((long) 476) * ((((j40 ^ j3) | j39) | j36) ^ j3)) + ((long) (-358807262));
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i93 = ~iMaxMemory;
                    int i94 = ((int) (j42 >> 32)) & ((-1573993084) + (((~(2061879729 | i93)) | (-2147483064)) * (-108)) + (((~(i93 | (-624653319))) | (~(624653318 | iMaxMemory)) | 539049984) * 54) + ((iMaxMemory | 539049984) * 54));
                    int i95 = ((int) j42) & ((-89411904) + (((~(i11 | (-682810047))) | (-754416364)) * (-1042)) + (((-682810047) | i) * 521) + (((~(754416363 | i)) | (-754449152) | (~((-682777259) | i11))) * 521));
                    if (i > 0 && (i != 3 || (i2 & 268435456) == 0)) {
                        int i96 = (~(i & 280)) & (i | 280);
                        int i97 = ((~i92) & i) | (i92 & i11);
                        int i98 = -i97;
                        int i99 = (i97 & i98) | (i97 ^ i98);
                        int i100 = component2;
                        int i101 = (i100 ^ 31) + ((i100 & 31) << 1);
                        component3 = i101 % 128;
                        int i102 = i101 % 2;
                        int i103 = i99 >> 31;
                        int i104 = i96 & (~i103);
                        int i105 = i100 + 19;
                        component3 = i105 % 128;
                        i92 = (i92 & i103) | i104;
                        if (i105 % 2 == 0) {
                            int i106 = 21 / 0;
                        }
                    }
                    int i107 = component3;
                    int i108 = i107 + 13;
                    component2 = i108 % 128;
                    int i109 = i108 % 2;
                    int i110 = ~i;
                    int i111 = -i110;
                    int i112 = ((i110 & i111) | (i110 ^ i111)) >> 31;
                    int i113 = ((i & (-288)) | (i11 & 287)) & (~i112);
                    int i114 = i112 & i;
                    int i115 = (i107 ^ 55) + ((i107 & 55) << 1);
                    component2 = i115 % 128;
                    if (i115 % 2 != 0) {
                        throw null;
                    }
                    int i116 = (i114 & i113) | (i113 ^ i114);
                    int i117 = (~(i & i92)) & (i | i92);
                    int i118 = -i117;
                    int i119 = ((i117 & i118) | (i117 ^ i118)) >> 31;
                    int i120 = i116 & (~i119);
                    int i121 = i92 & i119;
                    i92 = (i121 & i120) | (i120 ^ i121);
                    i6 = 16;
                } else {
                    charSequence2 = charSequence;
                    i5 = i17;
                    i6 = 16;
                }
                byte[] bArr = new byte[i6];
                Object[] objArr6 = {bArr};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(684477609);
                if (objCopydefault6 == null) {
                    int iIndexOf = 4652 - TextUtils.indexOf(charSequence2, '0', 0, 0);
                    int fadingEdgeLength = 30 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    char jumpTapTimeout = (char) (20731 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    byte b16 = $$a[0];
                    byte b17 = (byte) (b16 - 1);
                    byte b18 = b16;
                    Object[] objArr7 = new Object[1];
                    a(b17, b18, (byte) (b18 - 1), objArr7);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, fadingEdgeLength, jumpTapTimeout, -308964404, false, (String) objArr7[0], new Class[]{byte[].class});
                }
                long jLongValue6 = ((Long) ((Method) objCopydefault6).invoke(null, objArr6)).longValue();
                long j43 = 689754614;
                long j44 = -103;
                long j45 = (j44 * j43) + (j44 * jLongValue6);
                long j46 = 104;
                long j47 = jLongValue6 ^ j3;
                long j48 = i;
                long j49 = j45 + (((((j43 ^ j3) | j47) ^ j3) | ((j47 | j48) ^ j3)) * j46) + (((long) (-104)) * ((((j48 ^ j3) | j43) | jLongValue6) ^ j3)) + (j46 * (j43 | j48)) + ((long) (-1357570405));
                int i122 = ~(((int) Runtime.getRuntime().maxMemory()) | 1447136352);
                int i123 = ((int) (j49 >> 32)) & ((((-1456913110) | i122) * (-658)) + 1481043946 + ((i122 | (-1456979702)) * 658));
                int iMyPid = Process.myPid();
                int i124 = ~iMyPid;
                int i125 = ((int) j49) & ((-1048685566) + ((2056067479 | i124) * (-757)) + ((~((-88113193) | iMyPid)) * 1514) + (((~(iMyPid | 2144180671)) | (~(i124 | (-801673407))) | 713560214) * 757));
                int i126 = (i | (-i)) >> 31;
                int i127 = (i126 & (~(i & 313)) & (i | 313)) | ((~i126) & i);
                String[] strArr = {Base64.encodeToString(bArr, 0)};
                Object[] objArr8 = new Object[2];
                int i128 = (~(i & i92)) & (i | i92);
                int i129 = -i128;
                int i130 = (((i128 & i129) | (i128 ^ i129)) >> 31) & 1;
                int i131 = -i130;
                int i132 = (~(((i131 & i130) | (i130 ^ i131)) >> 31)) & 1;
                objArr8[i130] = strArr;
                objArr8[i132] = null;
                String[] strArr2 = (String[]) objArr8[0];
                int i133 = i ^ i92;
                int i134 = -i133;
                int i135 = ((i133 & i134) | (i133 ^ i134)) >> 31;
                int i136 = i127 & (~i135);
                int i137 = i92 & i135;
                int i138 = (i137 & i136) | (i136 ^ i137);
                int i139 = i ^ i138;
                Object[] objArr9 = {new int[]{i138}, new int[1], new int[]{i}, strArr2};
                int i140 = ((((-374077056) | r1) * (-196)) - 511942063) + (((~(((int) Runtime.getRuntime().totalMemory()) | (-306959998))) | 67117058) * 196) + (((i139 | (-i139)) >> 31) & 16);
                int i141 = i140 * (-337);
                int i142 = -(-(i3 * 339));
                int i143 = (i141 ^ i142) + ((i141 & i142) << 1);
                int i144 = ~i140;
                int i145 = ~((i144 ^ i11) | (i144 & i11));
                int i146 = ~i3;
                int i147 = ~((i146 & i140) | (i146 ^ i140));
                int i148 = (((i143 - (~(-(-((((i145 & i147) | (i145 ^ i147)) | (~((i140 ^ i) | (i140 & i)))) * (-338)))))) - 1) - (~(-(-((~(i144 | i3)) * 338))))) - 1;
                int i149 = ~i140;
                int i150 = ~((i149 & i5) | (i149 ^ i5));
                int i151 = i3 | i140;
                int i152 = ~((i & i151) | (i151 ^ i));
                int i153 = i148 + (((i152 & i150) | (i150 ^ i152)) * 338);
                int i154 = i153 << 13;
                int i155 = (i154 | i153) & (~(i153 & i154));
                int i156 = i155 >>> 17;
                int i157 = ((~i155) & i156) | ((~i156) & i155);
                int i158 = i157 << 5;
                ((int[]) objArr9[1])[0] = ((~i157) & i158) | ((~i158) & i157);
                return objArr9;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    public SkizaTone(String str, String str2, String str3, String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.subscriptionID = str2;
        this.singerName = str3;
        this.amount = str4;
        this.selected = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SkizaTone(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        boolean z2;
        if ((i & 4) != 0) {
            int i2 = ShareDataUIState + 121;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 82 / 0;
            }
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 16) != 0) {
            int i4 = component1;
            int i5 = i4 + 83;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 101;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        this(str, str2, str5, str4, z2);
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.name;
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        return str;
    }

    public final String getSubscriptionID() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.subscriptionID;
            int i4 = 45 / 0;
        } else {
            str = this.subscriptionID;
        }
        int i5 = i2 + 93;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getSingerName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.singerName;
        int i5 = i3 + 105;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 43;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 65;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setAmount(String str) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.amount = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final boolean getSelected() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        boolean z = this.selected;
        int i5 = i3 + 119;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 73;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.selected = z;
        int i5 = i2 + 91;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 123;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static SkizaTone copy$default(SkizaTone skizaTone, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 123;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 95;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str = skizaTone.name;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = skizaTone.subscriptionID;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = skizaTone.singerName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = skizaTone.amount;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            z = skizaTone.selected;
        }
        SkizaTone skizaToneCopy = skizaTone.copy(str5, str6, str7, str8, z);
        int i8 = ShareDataUIState + 61;
        component1 = i8 % 128;
        if (i8 % 2 != 0) {
            return skizaToneCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.name;
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.subscriptionID;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.singerName;
        int i4 = i3 + 25;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 25;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 39;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.selected;
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SkizaTone copy(String name, String subscriptionID, String singerName, String amount, boolean selected) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(subscriptionID, "");
        SkizaTone skizaTone = new SkizaTone(name, subscriptionID, singerName, amount, selected);
        int i2 = ShareDataUIState + 83;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return skizaTone;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 99;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SkizaTone)) {
            int i4 = component1 + 27;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        SkizaTone skizaTone = (SkizaTone) other;
        if (Intrinsics.areEqual(this.name, skizaTone.name)) {
            return Intrinsics.areEqual(this.subscriptionID, skizaTone.subscriptionID) && Intrinsics.areEqual(this.singerName, skizaTone.singerName) && Intrinsics.areEqual(this.amount, skizaTone.amount) && this.selected == skizaTone.selected;
        }
        int i6 = ShareDataUIState + 23;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.subscriptionID.hashCode();
        String str = this.singerName;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = component1 + 67;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        String str2 = this.amount;
        int iHashCode4 = (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.selected);
        int i6 = component1 + 89;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SkizaTone(name=" + this.name + ", subscriptionID=" + this.subscriptionID + ", singerName=" + this.singerName + ", amount=" + this.amount + ", selected=" + this.selected + ")";
        int i2 = component1 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 55;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.name);
        dest.writeString(this.subscriptionID);
        dest.writeString(this.singerName);
        dest.writeString(this.amount);
        dest.writeInt(this.selected ? 1 : 0);
        int i4 = ShareDataUIState + 19;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
