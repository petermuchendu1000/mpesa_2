package com.huawei.digitalpayment.consumer.base.resp;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
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
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/BalancesResponse;", "Landroid/os/Parcelable;", "balances", "", "Lcom/huawei/digitalpayment/consumer/base/resp/Balances;", "<init>", "(Ljava/util/List;)V", "getBalances", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalancesResponse implements Parcelable {
    public static final Parcelable.Creator<BalancesResponse> CREATOR;
    private static long component2;
    private static int component3;

    @SerializedName("balances")
    private final List<Balances> balances;
    private static final byte[] $$c = {Base64.padSymbol, -49, -70, 93};
    private static final int $$f = 27;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {126, 1, Ascii.SUB, -71, -9, 5, 66, -54, -5, 3, Ascii.VT, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, Ascii.DC2, -10, 7, Ascii.DLE, -8, 65, -60, 4, 4, 5, -8, Ascii.CAN, -20, Ascii.DLE, -7, 13, -3, 4, Ascii.DC2, -1, -9, 5, 3, 1, 4, 67, -73, 3, 17, Ascii.FF, -9, 5, 0, 4, 4, Ascii.FF, -6, -3, 70};
    private static final int $$e = 240;
    private static final byte[] $$a = {78, -86, -128, -128, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -25, -30, -26, -26, -18, -36, -33, 40, -39, -31, -7, -38, -34};
    private static final int $$b = 213;
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private static int component1 = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BalancesResponse> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BalancesResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                int i4 = component1 + 3;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(Balances.CREATOR.createFromParcel(parcel));
            }
            BalancesResponse balancesResponse = new BalancesResponse(arrayList);
            int i6 = component1 + 93;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return balancesResponse;
        }

        @Override
        public BalancesResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 15;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            BalancesResponse balancesResponseCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 93 / 0;
            }
            return balancesResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BalancesResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 115;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            BalancesResponse[] balancesResponseArr = new BalancesResponse[i];
            int i6 = i4 + 101;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                return balancesResponseArr;
            }
            throw null;
        }

        @Override
        public BalancesResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 115;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r6, int r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 105 - r8
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.$$c
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.$$g(short, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = r8 + 6
            int r6 = r6 * 2
            int r6 = 101 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.$$a
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r8 = r8 + 5
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-27)
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.a(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 99
            int r6 = r6 * 46
            int r0 = 56 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.$$d
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = 55 - r6
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + 3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.c(short, byte, short, java.lang.Object[]):void");
    }

    public BalancesResponse(List<Balances> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.balances = list;
    }

    public final List<Balances> getBalances() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Balances> list = this.balances;
        int i4 = i3 + 23;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 69;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3266 - TextUtils.getCapsMode("", 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 32, (char) (60267 - ExpandableListView.getPackedPositionChild(0L)), -834797019, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() & (component2 | 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 687, 34 - TextUtils.indexOf("", "", 0), (char) (60373 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), -1969106284, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = notifyVar.copydefault;
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3265 - TextUtils.indexOf((CharSequence) "", '0', 0), Color.argb(0, 0, 0, 0) + 33, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 60267), -834797019, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (component2 ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 687, TextUtils.getOffsetAfter("", 0) + 34, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 60373), -1969106284, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 688, KeyEvent.keyCodeFromString("") + 34, (char) (60373 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), -1969106284, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            int i6 = $10 + 63;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    @Override
    public final int describeContents() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-412868303);
        if (objCopydefault == null) {
            int gidForName = Process.getGidForName("") + 1116;
            int iGreen = Color.green(0) + 22;
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
            byte b2 = (byte) ($$b & 3);
            byte b3 = (byte) (-b2);
            Object[] objArr3 = new Object[1];
            a(b2, b3, (byte) (-b3), objArr3);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(gidForName, iGreen, cLastIndexOf, 574488148, false, (String) objArr3[0], null);
        }
        Object obj = null;
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr4 = new Object[1];
        b(28151 - KeyEvent.keyCodeFromString(""), new char[]{24160, 13208, 34187, 6038, 59826, 31675, 52655, 24558, 12758, 33757, 5513, 59343, 31212, 52217, 24055, 12061, 33052, 4901, 58675, 30523, 51502, 23337}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(60317 - TextUtils.getOffsetBefore("", 0), new char[]{24164, 46576, 35162, 40102, 61446, 50293, 56267, 12056, 652, 5861, 27215, 16842, 21812, 43157, 48370}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-413791824);
        if (objCopydefault2 == null) {
            int i2 = 1116 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int trimmedLength = 22 - TextUtils.getTrimmedLength("");
            char c2 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i3 = $$b;
            Object[] objArr6 = new Object[1];
            a((byte) (i3 & 3), (byte) 8, (byte) (i3 & 3), objArr6);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i2, trimmedLength, c2, 571463381, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1207399525);
            if (objCopydefault3 == null) {
                int packedPositionType = 1115 - ExpandableListView.getPackedPositionType(0L);
                int i4 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                byte b4 = (byte) 0;
                Object[] objArr7 = new Object[1];
                a(b4, (byte) (b4 | 17), b4, objArr7);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, i4, cRgb, 2102482174, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = (-1591705793) + (((~((-382392744) | iIdentityHashCode)) | 344463360 | (~(189195255 | iIdentityHashCode))) * (-880));
            int i6 = (~((-382392744) | (~iIdentityHashCode))) | (-189195256);
            int i7 = ~(iIdentityHashCode | 382392743);
            int i8 = i5 + ((i6 | i7) * (-880)) + (i7 * 880) + 628252185;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            b(34981 - ExpandableListView.getPackedPositionType(0L), new char[]{24160, 54986, 20271, 51100, 31994, 62801, 28091, 58028, 6984, 37820, 2051, 33080, 14844, 44547, 10099, 24515, 54311, 19613, 50671, 31303, 62129, 27616, 57437, 6327, 37144, 1656}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b(36187 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{24162, 54063, 17605, 63074, 27400, 40104, 3671, 33597, 13481, 42562, 56291, 19585, 65062, 29695, 58511, 5693, 35806, 15716}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = ShareDataUIState + 115;
                copydefault = i11 % 128;
                if (i11 % 2 == 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            b((ViewConfiguration.getKeyRepeatDelay() >> 16) + 49783, new char[]{24171, 39959, 55961, 6405, 22515, 37438, 53418, 3886, 19934, 34816, 50932, 1381, 17382, 48766, 64742, 14997}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            b((Process.myPid() >> 22) + 52859, new char[]{24168, 36894, 49810, 13598, 26521, 22031, 34967, 64293, 11665, 7219, 20156, 33056, 62342, 8785, 5343, 18257}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i12 = ShareDataUIState + 51;
            copydefault = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 628252185};
                byte[] bArr = $$d;
                byte b5 = bArr[61];
                Object[] objArr14 = new Object[1];
                c(b5, bArr[48], b5, objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                c(bArr[1], (byte) (-bArr[7]), bArr[61], objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1207399525);
                    if (objCopydefault4 == null) {
                        int i14 = 1115 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int i15 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22;
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        byte b6 = (byte) 0;
                        Object[] objArr17 = new Object[1];
                        a(b6, (byte) (b6 | 17), b6, objArr17);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i14, i15, cCombineMeasuredStates, 2102482174, false, (String) objArr17[0], null);
                    }
                    ((Field) objCopydefault4).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        b((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 28150, new char[]{24160, 13208, 34187, 6038, 59826, 31675, 52655, 24558, 12758, 33757, 5513, 59343, 31212, 52217, 24055, 12061, 33052, 4901, 58675, 30523, 51502, 23337}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        b((ViewConfiguration.getLongPressTimeout() >> 16) + 60317, new char[]{24164, 46576, 35162, 40102, 61446, 50293, 56267, 12056, 652, 5861, 27215, 16842, 21812, 43157, 48370}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-413791824);
                        if (objCopydefault5 == null) {
                            int i16 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1114;
                            int scrollBarFadeDuration = 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i17 = $$b;
                            byte b7 = (byte) (i17 & 3);
                            Object[] objArr20 = new Object[1];
                            a((byte) (i17 & 3), (byte) 8, b7, objArr20);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i16, scrollBarFadeDuration, c3, 571463381, false, (String) objArr20[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-412868303);
                        if (objCopydefault6 == null) {
                            int iArgb = Color.argb(0, 0, 0, 0) + 1115;
                            int minimumFlingVelocity = 22 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            char cBlue = (char) Color.blue(0);
                            byte b8 = (byte) ($$b & 3);
                            byte b9 = (byte) (-b8);
                            Object[] objArr21 = new Object[1];
                            a(b8, b9, (byte) (-b9), objArr21);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iArgb, minimumFlingVelocity, cBlue, 574488148, false, (String) objArr21[0], null);
                        }
                        ((Field) objCopydefault6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr16;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i18 = ((int[]) objArr[1])[0];
        int i19 = ((int[]) objArr[2])[0];
        if (i19 == i18) {
            int i20 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i21 = ~((int) SystemClock.elapsedRealtime());
            int i22 = i20 + 1246926771 + (((~((-343936017) | i21)) | 537133504) * (-828)) + ((i21 | (-343936017)) * (-828)) + 1311179712;
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr22[0])[0] = i24 ^ (i24 << 5);
            int i25 = ((int[]) objArr22[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr22[1])[0]}, new int[]{((int[]) objArr22[2])[0]}, (String[]) objArr22[3]};
            int iMyUid = Process.myUid();
            int i26 = ~((-428857499) | iMyUid);
            int i27 = (-1263631765) + ((134987914 | i26) * (-280)) + ((i26 | (~(235660010 | iMyUid))) * 140);
            int i28 = ~((-293869585) | iMyUid);
            int i29 = ~iMyUid;
            int i30 = i25 + i27 + (((~(i29 | 529529594)) | i28 | (~((-134987915) | i29))) * 140);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr2[0])[0] = i32 ^ (i32 << 5);
        } else {
            long j2 = -1;
            long j3 = ((long) (i18 ^ i19)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 7) << 32) | (j4 - ((j4 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6618 - Color.red(0), 42 - TextUtils.getTrimmedLength(""), (char) View.resolveSizeAndState(0, 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr23 = {-1235372483, Long.valueOf(j5), new ArrayList(), null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6562 - View.combineMeasuredStates(0, 0), 55 - TextUtils.lastIndexOf("", '0'), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr23);
                int i33 = ((int[]) objArr[0])[0];
                Object[] objArr24 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i34 = ~iIdentityHashCode2;
                int i35 = i33 + 886673307 + (((~(42106838 | i34)) | 151090649) * (-328)) + ((iIdentityHashCode2 | 151090649) * 164) + (((~(iIdentityHashCode2 | (-42106839))) | 30160 | (~(i34 | 193167327))) * 164);
                int i36 = (i35 << 13) ^ i35;
                int i37 = i36 ^ (i36 >>> 17);
                ((int[]) objArr24[0])[0] = i37 ^ (i37 << 5);
                Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
                int i38 = ((int[]) objArr24[0])[0];
                objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr24[1])[0]}, new int[]{((int[]) objArr24[2])[0]}, (String[]) objArr24[3]};
                int i39 = i38 + (((4407887 | r0) * (-374)) - 1689836039) + (((~((~System.identityHashCode(this)) | 13850623)) | 9442736) * 374);
                int i40 = (i39 << 13) ^ i39;
                int i41 = i40 ^ (i40 >>> 17);
                ((int[]) objArr2[0])[0] = i41 ^ (i41 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        int i42 = ((int[]) objArr2[0])[0];
        int i43 = i42 * i42;
        int i44 = -(241163866 * i42);
        int i45 = ((((i43 | i44) << 1) - (i43 ^ i44)) - (~(-(i42 * 286040872)))) - 1;
        int i46 = (i45 & (-1060302463)) + ((-1060302463) | i45);
        int i47 = i46 >> 29;
        int i48 = ((i47 & (-15)) + (i47 | (-15))) / 8;
        int i49 = (i48 & 1) + (i48 | 1);
        int i50 = -(i49 ^ ((i46 - (~i49)) - 1));
        int i51 = (i50 & 8) + (i50 | 8);
        int i52 = i51 >> 23;
        int i53 = ((i52 & (-1023)) + (i52 | (-1023))) / 512;
        int i54 = (i53 ^ 1) + ((i53 & 1) << 1);
        return 0 / (((-(((i54 | 1) << 1) - (i54 ^ 1))) & i51) * 150);
    }

    static {
        component3 = 0;
        component3();
        CREATOR = new Creator();
        int i = component1 + 99;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BalancesResponse copy$default(BalancesResponse balancesResponse, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 73;
        copydefault = i4 % 128;
        int i5 = i & 1;
        if (i4 % 2 != 0 ? i5 != 0 : i5 != 0) {
            list = balancesResponse.balances;
            int i6 = i3 + 111;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        }
        return balancesResponse.copy(list);
    }

    public final List<Balances> component1() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<Balances> list = this.balances;
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return list;
    }

    public final BalancesResponse copy(List<Balances> balances) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(balances, "");
        BalancesResponse balancesResponse = new BalancesResponse(balances);
        int i2 = ShareDataUIState + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return balancesResponse;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.base.resp.BalancesResponse) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 29;
        com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.ShareDataUIState = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.balances, ((com.huawei.digitalpayment.consumer.base.resp.BalancesResponse) r6).balances) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.ShareDataUIState + 45;
        com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.copydefault = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if ((r6 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r6 = 15 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.ShareDataUIState
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.copydefault = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 97
            int r1 = r1 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.base.resp.BalancesResponse
            if (r1 != 0) goto L28
            int r2 = r2 + 29
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.ShareDataUIState = r6
            int r2 = r2 % r0
            if (r2 == 0) goto L27
            return r3
        L27:
            return r4
        L28:
            com.huawei.digitalpayment.consumer.base.resp.BalancesResponse r6 = (com.huawei.digitalpayment.consumer.base.resp.BalancesResponse) r6
            java.util.List<com.huawei.digitalpayment.consumer.base.resp.Balances> r1 = r5.balances
            java.util.List<com.huawei.digitalpayment.consumer.base.resp.Balances> r6 = r6.balances
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L35
            return r4
        L35:
            int r6 = com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.ShareDataUIState
            int r6 = r6 + 45
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.copydefault = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L43
            r6 = 15
            int r6 = r6 / r4
        L43:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.BalancesResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.balances.hashCode();
            int i3 = 62 / 0;
        } else {
            iHashCode = this.balances.hashCode();
        }
        int i4 = copydefault + 53;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BalancesResponse(balances=" + this.balances + ")";
        int i2 = copydefault + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<Balances> list = this.balances;
        dest.writeInt(list.size());
        Iterator<Balances> it = list.iterator();
        int i4 = ShareDataUIState + 55;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = copydefault + 31;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                int i7 = 47 / 0;
            } else {
                it.next().writeToParcel(dest, flags);
            }
        }
    }

    static void component3() {
        component2 = -8769934409396920789L;
    }
}
