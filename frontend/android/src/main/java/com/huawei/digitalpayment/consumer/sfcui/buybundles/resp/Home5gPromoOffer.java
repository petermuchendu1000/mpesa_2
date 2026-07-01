package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelAll;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Home5gPromoOffer;", "Landroid/os/Parcelable;", "description", "", "offeringId", "validity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getOfferingId", "getValidity", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Home5gPromoOffer implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Home5gPromoOffer> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    @SerializedName("description")
    private final String description;

    @SerializedName("offeringId")
    private final String offeringId;

    @SerializedName("validity")
    private final String validity;

    public Home5gPromoOffer(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.description = str;
        this.offeringId = str2;
        this.validity = str3;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.description;
        }
        int i3 = 2 / 0;
        return this.description;
    }

    public final String getOfferingId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.offeringId;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return str;
    }

    public final String getValidity() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.validity;
        int i5 = i3 + 49;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component1 + 57;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static Home5gPromoOffer copy$default(Home5gPromoOffer home5gPromoOffer, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = home5gPromoOffer.description;
        }
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState + 23;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                String str4 = home5gPromoOffer.offeringId;
                throw null;
            }
            str2 = home5gPromoOffer.offeringId;
        }
        if ((i & 4) != 0) {
            str3 = home5gPromoOffer.validity;
            int i4 = copydefault + 97;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        return home5gPromoOffer.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.description;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 69;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.offeringId;
        int i4 = i2 + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 19;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.validity;
        int i5 = i2 + 113;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    public final Home5gPromoOffer copy(String description, String offeringId, String validity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(description, "");
        Intrinsics.checkNotNullParameter(offeringId, "");
        Intrinsics.checkNotNullParameter(validity, "");
        Home5gPromoOffer home5gPromoOffer = new Home5gPromoOffer(description, offeringId, validity);
        int i2 = ShareDataUIState + 67;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return home5gPromoOffer;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 101;
            ShareDataUIState = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof Home5gPromoOffer)) {
            return false;
        }
        Home5gPromoOffer home5gPromoOffer = (Home5gPromoOffer) other;
        if (!Intrinsics.areEqual(this.description, home5gPromoOffer.description)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.offeringId, home5gPromoOffer.offeringId)) {
            int i3 = copydefault + 107;
            ShareDataUIState = i3 % 128;
            return i3 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.validity, home5gPromoOffer.validity)) {
            return true;
        }
        int i4 = ShareDataUIState + 99;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.description.hashCode() * 31) + this.offeringId.hashCode()) * 31) + this.validity.hashCode();
        int i4 = copydefault + 51;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Home5gPromoOffer(description=" + this.description + ", offeringId=" + this.offeringId + ", validity=" + this.validity + ")";
        int i2 = copydefault + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.description);
        dest.writeString(this.offeringId);
        dest.writeString(this.validity);
        int i4 = copydefault + 117;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Home5gPromoOffer> {
        private static final byte[] $$c = {79, -25, -14, 102};
        private static final int $$f = 31;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {44, 39, Base64.padSymbol, Ascii.GS, Ascii.FF, 1, 9, Ascii.FF, 1, 9, -21, 1, 1, -5, 20, -9, 8};
        private static final int $$e = 200;
        private static final byte[] $$a = {114, 69, -115, -114, Ascii.SI, -8, Ascii.DLE, -1, -4, -3, -52, TarHeader.LF_CONTIG, Ascii.SO, 1, 8, -13, Ascii.VT, 8, PSSSigner.TRAILER_IMPLICIT, 68, -1, -61, Ascii.NAK, TarHeader.LF_LINK, 2, -2, -1, -4, 0, Ascii.NAK, -9, 8, 1, -35, 39, -6, Ascii.VT, -1, Ascii.NAK, -17, -27, 39, Ascii.VT, -7, Ascii.ETB, -19, -49, SignedBytes.MAX_POWER_OF_TWO, -9, Ascii.SI, -5, -55, 40, Ascii.SYN, Ascii.FF, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
        private static final int $$b = 48;
        private static int component3 = 0;
        private static int component1 = 1;
        private static char[] component2 = {1978, 2020, 2022, 1980, 1930, 1977, 1969, 2025, 1965, 1970, 2036, 2004, 2015, 1952, 2040, 2034, 2013, 2035, 2021, 1988, 1983, 1966, 1967, 2023, 2041, 2031, 2005, 2038, 1968, 1987, 2024, 1979, 1971, 2017, 2000, 2029, 2032, 2030, 2028, 2011, 2027, 1976, 2019, 1982, 1997, 1990, 2018, 1981, 1985};
        private static char ShareDataUIState = 12829;
        private static long copydefault = 3907336727481914242L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(short r5, short r6, byte r7) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Home5gPromoOffer.Creator.$$c
                int r6 = r6 + 4
                int r7 = 119 - r7
                int r5 = r5 * 2
                int r1 = 1 - r5
                byte[] r1 = new byte[r1]
                r2 = 0
                int r5 = 0 - r5
                if (r0 != 0) goto L14
                r3 = r5
                r4 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r5) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L24:
                r3 = r0[r6]
            L26:
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Home5gPromoOffer.Creator.$$g(short, short, byte):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(short r5, int r6, byte r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 3
                int r7 = 115 - r7
                int r0 = r5 + 4
                int r6 = 65 - r6
                byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Home5gPromoOffer.Creator.$$a
                byte[] r0 = new byte[r0]
                int r5 = r5 + 3
                r2 = 0
                if (r1 != 0) goto L15
                r4 = r7
                r3 = r2
                r7 = r5
                goto L29
            L15:
                r3 = r2
            L16:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r5) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L25:
                int r3 = r3 + 1
                r4 = r1[r6]
            L29:
                int r7 = r7 + r4
                int r7 = r7 + (-2)
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Home5gPromoOffer.Creator.c(short, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void d(short r5, byte r6, byte r7, java.lang.Object[] r8) {
            /*
                int r5 = 100 - r5
                int r0 = 11 - r6
                byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Home5gPromoOffer.Creator.$$d
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                int r6 = 10 - r6
                r2 = 0
                if (r1 != 0) goto L12
                r3 = r6
                r4 = r2
                goto L26
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r5
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L22:
                int r7 = r7 + 1
                r3 = r1[r7]
            L26:
                int r5 = r5 + r3
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Home5gPromoOffer.Creator.d(short, byte, byte, java.lang.Object[]):void");
        }

        private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            notify notifyVar = new notify();
            notifyVar.component3 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            notifyVar.copydefault = 0;
            while (notifyVar.copydefault < cArr.length) {
                int i3 = $10 + 13;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = notifyVar.copydefault;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 3266, 33 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (ExpandableListView.getPackedPositionChild(0L) + 60269), -834797019, false, $$g(b2, b3, (byte) (b3 & 17)), new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() + (copydefault * 5431355972723572778L);
                        Object[] objArr3 = {notifyVar, notifyVar};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - TextUtils.indexOf("", "", 0), View.MeasureSpec.getMode(0) + 34, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 60373), -1969106284, false, $$g(b4, (byte) (b4 - 1), (byte) (-$$c[2])), new Class[]{Object.class, Object.class});
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
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 3267, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 32, (char) (60268 - ExpandableListView.getPackedPositionGroup(0L)), -834797019, false, $$g(b5, b6, (byte) (b6 & 17)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (copydefault ^ 5431355972723572778L);
                    Object[] objArr5 = {notifyVar, notifyVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault4 == null) {
                        byte b7 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 687, 33 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.indexOf((CharSequence) "", '0') + 60374), -1969106284, false, $$g(b7, (byte) (b7 - 1), (byte) (-$$c[2])), new Class[]{Object.class, Object.class});
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
                    byte b8 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(688 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 33, (char) (60373 - Color.green(0)), -1969106284, false, $$g(b8, (byte) (b8 - 1), (byte) (-$$c[2])), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                int i6 = $11 + 91;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            }
            objArr[0] = new String(cArr2);
        }

        private static void a(byte b2, char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int length;
            char[] cArr2;
            int i3 = 2 % 2;
            cancelAll cancelall = new cancelAll();
            char[] cArr3 = component2;
            Object obj2 = null;
            if (cArr3 != null) {
                int i4 = $11 + 119;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                }
                for (int i5 = 0; i5 < length; i5++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 7422, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7423 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 15, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i6 = $11 + 51;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    i2 = i + 103;
                    cArr4[i2] = (char) (cArr[i2] >>> b2);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b2);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                cancelall.component2 = 0;
                while (cancelall.component2 < i2) {
                    cancelall.component1 = cArr[cancelall.component2];
                    cancelall.component3 = cArr[cancelall.component2 + 1];
                    if (cancelall.component1 == cancelall.component3) {
                        int i7 = $11 + 83;
                        $10 = i7 % 128;
                        if (i7 % 2 != 0) {
                            cArr4[cancelall.component2] = (char) (cancelall.component1 + b2);
                            cArr4[cancelall.component2] = (char) (cancelall.component3 / b2);
                        } else {
                            cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                            cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                        }
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - (ViewConfiguration.getFadingEdgeLength() >> 16), 13 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (44463 - (ViewConfiguration.getTapTimeout() >> 16)), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            int i8 = $11 + 1;
                            $10 = i8 % 128;
                            int i9 = i8 % 2;
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = (byte) (b3 - 1);
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - View.MeasureSpec.getMode(0), Color.green(0) + 24, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27637), 794909189, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i10 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr3[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr3[i10];
                        } else {
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i11 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr3[i11];
                                cArr4[cancelall.component2 + 1] = cArr3[i12];
                            } else {
                                int i13 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr3[i13];
                                cArr4[cancelall.component2 + 1] = cArr3[i14];
                            }
                        }
                    }
                    cancelall.component2 += 2;
                    obj2 = obj;
                }
            }
            int i15 = 0;
            while (i15 < i) {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
                i15++;
                int i16 = $10 + 27;
                $11 = i16 % 128;
                int i17 = i16 % 2;
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home5gPromoOffer createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Home5gPromoOffer home5gPromoOffer = new Home5gPromoOffer(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 109;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return home5gPromoOffer;
            }
            throw null;
        }

        @Override
        public Home5gPromoOffer createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 73;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Home5gPromoOffer home5gPromoOfferCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 1;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return home5gPromoOfferCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home5gPromoOffer[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 59;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            Home5gPromoOffer[] home5gPromoOfferArr = new Home5gPromoOffer[i];
            int i6 = i3 + 27;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return home5gPromoOfferArr;
        }

        @Override
        public Home5gPromoOffer[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 43;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            Home5gPromoOffer[] home5gPromoOfferArrNewArray = newArray(i);
            int i5 = component1 + 53;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return home5gPromoOfferArrNewArray;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0cc6  */
        /* JADX WARN: Removed duplicated region for block: B:187:0x0d4c A[Catch: Exception -> 0x0daf, all -> 0x0de0, IOException -> 0x0de7, TryCatch #0 {all -> 0x0de0, blocks: (B:113:0x0ad5, B:114:0x0ad8, B:116:0x0ae6, B:117:0x0b1e, B:119:0x0b34, B:120:0x0b71, B:121:0x0b82, B:123:0x0ba9, B:125:0x0bdd, B:127:0x0bff, B:129:0x0c7d, B:131:0x0c9f, B:133:0x0ca9, B:212:0x0daf, B:213:0x0ddf, B:168:0x0d11, B:169:0x0d14, B:174:0x0d21, B:176:0x0d2d, B:177:0x0d2e, B:185:0x0d45, B:187:0x0d4c, B:188:0x0d4d, B:195:0x0d67, B:197:0x0d72, B:198:0x0d73, B:200:0x0d75, B:202:0x0d86, B:203:0x0d87), top: B:311:0x0ad5 }] */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0d4d A[Catch: Exception -> 0x0daf, all -> 0x0de0, IOException -> 0x0de7, TryCatch #0 {all -> 0x0de0, blocks: (B:113:0x0ad5, B:114:0x0ad8, B:116:0x0ae6, B:117:0x0b1e, B:119:0x0b34, B:120:0x0b71, B:121:0x0b82, B:123:0x0ba9, B:125:0x0bdd, B:127:0x0bff, B:129:0x0c7d, B:131:0x0c9f, B:133:0x0ca9, B:212:0x0daf, B:213:0x0ddf, B:168:0x0d11, B:169:0x0d14, B:174:0x0d21, B:176:0x0d2d, B:177:0x0d2e, B:185:0x0d45, B:187:0x0d4c, B:188:0x0d4d, B:195:0x0d67, B:197:0x0d72, B:198:0x0d73, B:200:0x0d75, B:202:0x0d86, B:203:0x0d87), top: B:311:0x0ad5 }] */
        /* JADX WARN: Removed duplicated region for block: B:197:0x0d72 A[Catch: Exception -> 0x0daf, all -> 0x0de0, IOException -> 0x0de7, TryCatch #0 {all -> 0x0de0, blocks: (B:113:0x0ad5, B:114:0x0ad8, B:116:0x0ae6, B:117:0x0b1e, B:119:0x0b34, B:120:0x0b71, B:121:0x0b82, B:123:0x0ba9, B:125:0x0bdd, B:127:0x0bff, B:129:0x0c7d, B:131:0x0c9f, B:133:0x0ca9, B:212:0x0daf, B:213:0x0ddf, B:168:0x0d11, B:169:0x0d14, B:174:0x0d21, B:176:0x0d2d, B:177:0x0d2e, B:185:0x0d45, B:187:0x0d4c, B:188:0x0d4d, B:195:0x0d67, B:197:0x0d72, B:198:0x0d73, B:200:0x0d75, B:202:0x0d86, B:203:0x0d87), top: B:311:0x0ad5 }] */
        /* JADX WARN: Removed duplicated region for block: B:198:0x0d73 A[Catch: Exception -> 0x0daf, all -> 0x0de0, IOException -> 0x0de7, TryCatch #0 {all -> 0x0de0, blocks: (B:113:0x0ad5, B:114:0x0ad8, B:116:0x0ae6, B:117:0x0b1e, B:119:0x0b34, B:120:0x0b71, B:121:0x0b82, B:123:0x0ba9, B:125:0x0bdd, B:127:0x0bff, B:129:0x0c7d, B:131:0x0c9f, B:133:0x0ca9, B:212:0x0daf, B:213:0x0ddf, B:168:0x0d11, B:169:0x0d14, B:174:0x0d21, B:176:0x0d2d, B:177:0x0d2e, B:185:0x0d45, B:187:0x0d4c, B:188:0x0d4d, B:195:0x0d67, B:197:0x0d72, B:198:0x0d73, B:200:0x0d75, B:202:0x0d86, B:203:0x0d87), top: B:311:0x0ad5 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x03d4 A[PHI: r1 r3 r4 r7 r9 r10 r12 r35
  0x03d4: PHI (r1v106 java.lang.Object) = (r1v46 java.lang.Object), (r1v47 java.lang.Object) binds: [B:23:0x03d2, B:384:0x03d4] A[DONT_GENERATE, DONT_INLINE]
  0x03d4: PHI (r3v196 int) = (r3v49 int), (r3v50 int) binds: [B:23:0x03d2, B:384:0x03d4] A[DONT_GENERATE, DONT_INLINE]
  0x03d4: PHI (r4v211 int) = (r4v100 int), (r4v101 int) binds: [B:23:0x03d2, B:384:0x03d4] A[DONT_GENERATE, DONT_INLINE]
  0x03d4: PHI (r7v208 ??) = (r7v100 ??), (r7v101 ??) binds: [B:23:0x03d2, B:384:0x03d4] A[DONT_GENERATE, DONT_INLINE]
  0x03d4: PHI (r9v196 byte) = (r9v79 byte), (r9v80 byte) binds: [B:23:0x03d2, B:384:0x03d4] A[DONT_GENERATE, DONT_INLINE]
  0x03d4: PHI (r10v150 byte) = (r10v73 byte), (r10v74 byte) binds: [B:23:0x03d2, B:384:0x03d4] A[DONT_GENERATE, DONT_INLINE]
  0x03d4: PHI (r12v111 int) = (r12v6 int), (r12v56 int) binds: [B:23:0x03d2, B:384:0x03d4] A[DONT_GENERATE, DONT_INLINE]
  0x03d4: PHI (r35v21 ??) = (r35v5 ??), (r35v6 ??) binds: [B:23:0x03d2, B:384:0x03d4] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:257:0x1303 A[PHI: r1
  0x1303: PHI (r1v7 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:232:0x0f6d, B:234:0x1017, B:378:0x1303] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x03e3  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x05c7  */
        /* JADX WARN: Type inference failed for: r11v31 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String[]] */
        /* JADX WARN: Type inference failed for: r35v0 */
        /* JADX WARN: Type inference failed for: r35v1 */
        /* JADX WARN: Type inference failed for: r35v10 */
        /* JADX WARN: Type inference failed for: r35v11 */
        /* JADX WARN: Type inference failed for: r35v12 */
        /* JADX WARN: Type inference failed for: r35v13 */
        /* JADX WARN: Type inference failed for: r35v14 */
        /* JADX WARN: Type inference failed for: r35v15 */
        /* JADX WARN: Type inference failed for: r35v16 */
        /* JADX WARN: Type inference failed for: r35v17 */
        /* JADX WARN: Type inference failed for: r35v18 */
        /* JADX WARN: Type inference failed for: r35v19 */
        /* JADX WARN: Type inference failed for: r35v20 */
        /* JADX WARN: Type inference failed for: r35v21 */
        /* JADX WARN: Type inference failed for: r35v22 */
        /* JADX WARN: Type inference failed for: r35v31 */
        /* JADX WARN: Type inference failed for: r35v32 */
        /* JADX WARN: Type inference failed for: r35v33 */
        /* JADX WARN: Type inference failed for: r35v34 */
        /* JADX WARN: Type inference failed for: r35v35 */
        /* JADX WARN: Type inference failed for: r35v36 */
        /* JADX WARN: Type inference failed for: r35v37 */
        /* JADX WARN: Type inference failed for: r35v38 */
        /* JADX WARN: Type inference failed for: r35v39 */
        /* JADX WARN: Type inference failed for: r35v40 */
        /* JADX WARN: Type inference failed for: r35v41 */
        /* JADX WARN: Type inference failed for: r35v42 */
        /* JADX WARN: Type inference failed for: r35v5 */
        /* JADX WARN: Type inference failed for: r35v6 */
        /* JADX WARN: Type inference failed for: r35v7 */
        /* JADX WARN: Type inference failed for: r35v9 */
        /* JADX WARN: Type inference failed for: r41v10 */
        /* JADX WARN: Type inference failed for: r41v12 */
        /* JADX WARN: Type inference failed for: r41v3 */
        /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v153 */
        /* JADX WARN: Type inference failed for: r6v154 */
        /* JADX WARN: Type inference failed for: r6v155 */
        /* JADX WARN: Type inference failed for: r6v294 */
        /* JADX WARN: Type inference failed for: r6v41 */
        /* JADX WARN: Type inference failed for: r7v100 */
        /* JADX WARN: Type inference failed for: r7v101 */
        /* JADX WARN: Type inference failed for: r7v119 */
        /* JADX WARN: Type inference failed for: r7v149, types: [int] */
        /* JADX WARN: Type inference failed for: r7v151 */
        /* JADX WARN: Type inference failed for: r7v153 */
        /* JADX WARN: Type inference failed for: r7v154 */
        /* JADX WARN: Type inference failed for: r7v155 */
        /* JADX WARN: Type inference failed for: r7v170 */
        /* JADX WARN: Type inference failed for: r7v176 */
        /* JADX WARN: Type inference failed for: r7v177 */
        /* JADX WARN: Type inference failed for: r7v206 */
        /* JADX WARN: Type inference failed for: r7v207 */
        /* JADX WARN: Type inference failed for: r7v208 */
        /* JADX WARN: Type inference failed for: r7v289 */
        /* JADX WARN: Type inference failed for: r7v290 */
        /* JADX WARN: Type inference failed for: r7v291 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object[] component2(android.content.Context r48, int r49, int r50, int r51) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 7798
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Home5gPromoOffer.Creator.component2(android.content.Context, int, int, int):java.lang.Object[]");
        }
    }
}
