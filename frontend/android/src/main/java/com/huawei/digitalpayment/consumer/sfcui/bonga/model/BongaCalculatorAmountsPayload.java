package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaCalculatorAmountsPayload;", "Landroid/os/Parcelable;", "amount", "", "<init>", "(Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaCalculatorAmountsPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BongaCalculatorAmountsPayload> CREATOR;
    private static int ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    private static char copydefault;

    @SerializedName("amount")
    private final String amount;
    private static final byte[] $$c = {65, -53, 110, -39};
    private static final int $$d = 247;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {2, 77, TarHeader.LF_CONTIG, -86, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_NORMAL};
    private static final int $$b = 182;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r5, short r6, byte r7) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 111
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaCalculatorAmountsPayload.$$c
            int r7 = r7 + 4
            int r5 = r5 * 3
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaCalculatorAmountsPayload.$$e(int, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 36 - r6
            int r8 = r8 * 16
            int r8 = r8 + 83
            int r7 = r7 * 6
            int r0 = r7 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaCalculatorAmountsPayload.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 9
            r2 = 0
            if (r1 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L30:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-17)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaCalculatorAmountsPayload.a(int, byte, short, java.lang.Object[]):void");
    }

    public BongaCalculatorAmountsPayload(String str) {
        this.amount = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BongaCalculatorAmountsPayload(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = getAsAtTimestamp + 57;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 119;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str = null;
        }
        this(str);
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 107;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BongaCalculatorAmountsPayload> {
        private static final byte[] $$c = {35, -27, -128, TarHeader.LF_SYMLINK};
        private static final int $$f = 103;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {66, -42, -1, 80, -39, -25, -30, -26, -26, -18, -36, -33, 39};
        private static final int $$e = 133;
        private static final byte[] $$a = {TarHeader.LF_NORMAL, 86, 58, 71, -7, Ascii.ETB, -19, Ascii.EM, -72, TarHeader.LF_CONTIG, 17, 9, -7, 6, -3, -63, 71, -1, -9, 0, -51, 39, 20, 0, 17, -11, 17, -39, Ascii.FS, Ascii.SYN, -36, Ascii.US, -9, 0};
        private static final int $$b = 96;
        private static int component3 = 0;
        private static int ShareDataUIState = 1;
        private static long copydefault = 2706656761689306457L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(int r5, byte r6, int r7) {
            /*
                int r5 = r5 * 3
                int r5 = r5 + 103
                int r7 = r7 * 2
                int r0 = r7 + 1
                byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaCalculatorAmountsPayload.Creator.$$c
                int r6 = r6 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                int r6 = r6 + 1
                byte r4 = (byte) r5
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L24:
                r3 = r1[r6]
            L26:
                int r3 = -r3
                int r5 = r5 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaCalculatorAmountsPayload.Creator.$$g(int, byte, int):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(byte r5, int r6, byte r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaCalculatorAmountsPayload.Creator.$$a
                int r5 = r5 * 2
                int r1 = 31 - r5
                int r6 = r6 * 2
                int r6 = 4 - r6
                int r7 = r7 * 2
                int r7 = r7 + 106
                byte[] r1 = new byte[r1]
                int r5 = 30 - r5
                r2 = 0
                if (r0 != 0) goto L18
                r4 = r6
                r3 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r5) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L26:
                int r3 = r3 + 1
                r4 = r0[r6]
            L2a:
                int r6 = r6 + 1
                int r7 = r7 + r4
                int r7 = r7 + (-2)
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaCalculatorAmountsPayload.Creator.a(byte, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(int r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 9
                int r6 = 12 - r6
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaCalculatorAmountsPayload.Creator.$$d
                int r8 = r8 * 9
                int r8 = 10 - r8
                int r7 = r7 + 97
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L28
            L14:
                r3 = r2
            L15:
                int r6 = r6 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r3 = r0[r6]
            L28:
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-27)
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaCalculatorAmountsPayload.Creator.b(int, byte, int, java.lang.Object[]):void");
        }

        private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
            char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
            iTrustedWebActivityServiceDefault.copydefault = 4;
            while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
                int i3 = $11 + 91;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
                int i5 = iTrustedWebActivityServiceDefault.copydefault;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ViewConfiguration.getFadingEdgeLength() >> 16), Color.green(0) + 34, (char) (63440 - (ViewConfiguration.getTapTimeout() >> 16)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - View.resolveSizeAndState(0, 0, 0), 'B' - AndroidCharacter.getMirror('0'), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 51270), -1883291598, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                    int i6 = $10 + 19;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaCalculatorAmountsPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BongaCalculatorAmountsPayload bongaCalculatorAmountsPayload = new BongaCalculatorAmountsPayload(parcel.readString());
            int i2 = component3 + 5;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 27 / 0;
            }
            return bongaCalculatorAmountsPayload;
        }

        @Override
        public BongaCalculatorAmountsPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 45;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            BongaCalculatorAmountsPayload bongaCalculatorAmountsPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 65;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return bongaCalculatorAmountsPayloadCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaCalculatorAmountsPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 91;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            BongaCalculatorAmountsPayload[] bongaCalculatorAmountsPayloadArr = new BongaCalculatorAmountsPayload[i];
            int i6 = i4 + 107;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return bongaCalculatorAmountsPayloadArr;
        }

        @Override
        public BongaCalculatorAmountsPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 99;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0262  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int component1(java.util.List r28) {
            /*
                Method dump skipped, instruction units count: 1988
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaCalculatorAmountsPayload.Creator.component1(java.util.List):int");
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i5 = $11 + 81;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i7 = 58224;
            int i8 = i4;
            while (i8 < 16) {
                int i9 = $10 + 109;
                $11 = i9 % 128;
                int i10 = i9 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[i4];
                int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) component1) ^ 4374495167426960553L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component2);
                    objArr2[i2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int packedPositionType = 844 - ExpandableListView.getPackedPositionType(0L);
                        int i13 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31;
                        char minimumFlingVelocity = (char) (23251 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        String str$$e = $$e(b2, b3, (byte) (b3 - 1));
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, i13, minimumFlingVelocity, 592652048, false, str$$e, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 843, View.MeasureSpec.getSize(0) + 32, (char) (KeyEvent.getDeadChar(0, 0) + 23251), 592652048, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    cArr3 = cArr4;
                    i2 = 2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - TextUtils.indexOf("", "", 0, 0), TextUtils.getTrimmedLength("") + 49, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i14 = $10 + 107;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            i2 = 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) throws Throwable {
        Object[] objArr;
        char c2;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 69;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
        if (objCopydefault == null) {
            int trimmedLength = 999 - TextUtils.getTrimmedLength("");
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 31;
            char cMyTid = (char) ((Process.myTid() >> 22) + 61685);
            byte b2 = (byte) 11;
            byte b3 = (byte) (b2 & 5);
            Object[] objArr3 = new Object[1];
            a(b2, b3, (byte) (b3 - 1), objArr3);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(trimmedLength, keyRepeatDelay, cMyTid, -1638177773, false, (String) objArr3[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr4 = new Object[1];
        b(View.getDefaultSize(0, 0) + 22, new char[]{13354, 9503, 15160, 4831, 58236, 4644, 50108, 43141, 41939, 46847, 50046, 31888, 56592, 64220, 27778, 48752, 12014, 1433, 3154, 48824, 5168, 23312}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{5545, 11542, 62156, 42726, 14188, 23111, 63375, 50952, 50920, 23573, 16228, 17952, 52521, 40619, 42378, 37010}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
        if (objCopydefault2 == null) {
            int iAlpha = 999 - Color.alpha(0);
            int iIndexOf = 30 - TextUtils.indexOf((CharSequence) "", '0');
            char bitsPerPixel = (char) (61684 - ImageFormat.getBitsPerPixel(0));
            byte b4 = (byte) 0;
            Object[] objArr6 = new Object[1];
            a((byte) ($$b & 15), b4, (byte) (b4 + 1), objArr6);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, iIndexOf, bitsPerPixel, 1267259187, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
            if (objCopydefault3 == null) {
                int iResolveOpacity = 999 - Drawable.resolveOpacity(0, 0);
                int i4 = 32 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                char cNormalizeMetaState = (char) (61685 - KeyEvent.normalizeMetaState(0));
                byte b5 = (byte) ($$a[0] + 1);
                byte b6 = (byte) (b5 - 3);
                Object[] objArr7 = new Object[1];
                a(b5, b6, (byte) (b6 + 1), objArr7);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iResolveOpacity, i4, cNormalizeMetaState, 1267122354, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i5 = ((int[]) objArr8[2])[0];
            int i6 = ((int[]) objArr8[1])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = ~iIdentityHashCode;
            int i8 = 458560541 + (((~(628388313 | i7)) | 33786880) * (-1188));
            int i9 = (~(iIdentityHashCode | (-628388314))) | 33786880;
            int i10 = ~(121085080 | i7);
            int i11 = i8 + ((i9 | i10) * 594) + (((~((-628388314) | i7)) | 541090113 | i10) * 594) + 956882515;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[3])[0] = i13 ^ (i13 << 5);
        } else {
            try {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2218 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 45 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), -2019038240, false, null, new Class[0]);
                }
                Object[] objArr9 = {null, ((Constructor) objCopydefault4).newInstance(null), 956882515, 1};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                if (objCopydefault5 == null) {
                    int iAlpha2 = 999 - Color.alpha(0);
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 31;
                    char offsetBefore = (char) (61685 - TextUtils.getOffsetBefore("", 0));
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    Object[] objArr10 = new Object[1];
                    a(b7, b8, (byte) (b8 + 1), objArr10);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha2, jumpTapTimeout, offsetBefore, 939672146, false, (String) objArr10[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1030, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, (char) Color.green(0)), (Class) ITrustedWebActivityCallbackDefault.copydefault(1071 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 43, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 33531)), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr11 = (Object[]) ((Method) objCopydefault5).invoke(null, objArr9);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                if (objCopydefault6 == null) {
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 999;
                    int i14 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31;
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 61686);
                    byte b9 = (byte) ($$a[0] + 1);
                    byte b10 = (byte) (b9 - 3);
                    Object[] objArr12 = new Object[1];
                    a(b9, b10, (byte) (b10 + 1), objArr12);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, i14, cLastIndexOf, 1267122354, false, (String) objArr12[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr11);
                try {
                    Object[] objArr13 = new Object[1];
                    b(TextUtils.indexOf((CharSequence) "", '0') + 23, new char[]{13354, 9503, 15160, 4831, 58236, 4644, 50108, 43141, 41939, 46847, 50046, 31888, 56592, 64220, 27778, 48752, 12014, 1433, 3154, 48824, 5168, 23312}, objArr13);
                    Class<?> cls2 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    b(15 - View.combineMeasuredStates(0, 0), new char[]{5545, 11542, 62156, 42726, 14188, 23111, 63375, 50952, 50920, 23573, 16228, 17952, 52521, 40619, 42378, 37010}, objArr14);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                    if (objCopydefault7 == null) {
                        int fadingEdgeLength = 999 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i15 = 31 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 61685);
                        byte b11 = (byte) 0;
                        Object[] objArr15 = new Object[1];
                        a((byte) ($$b & 15), b11, (byte) (b11 + 1), objArr15);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, i15, cIndexOf, 1267259187, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                    if (objCopydefault8 == null) {
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 999;
                        int gidForName = 30 - Process.getGidForName("");
                        char cRgb = (char) ((-16715531) - Color.rgb(0, 0, 0));
                        byte b12 = (byte) 11;
                        byte b13 = (byte) (b12 & 5);
                        Object[] objArr16 = new Object[1];
                        a(b12, b13, (byte) (b13 - 1), objArr16);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(doubleTapTimeout, gidForName, cRgb, -1638177773, false, (String) objArr16[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
                    objArr = objArr11;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[2])[0];
        if (i17 == i16) {
            int i18 = getAsAtTimestamp + 53;
            getRequestBeneficiariesState = i18 % 128;
            int i19 = i18 % 2;
            Object[] objArr17 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i20 = ((int[]) objArr[3])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[1])[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i23 = ~(67826743 | iIdentityHashCode2);
            int i24 = i20 + (-369608251) + ((681642504 | i23) * (-814)) + ((i23 | (~((~iIdentityHashCode2) | (-681646651))) | 67822597) * 407) + (((~(iIdentityHashCode2 | 681646650)) | (~((-67826744) | iIdentityHashCode2)) | 67822597) * 407);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr17[3])[0] = i26 ^ (i26 << 5);
            objArr2 = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i27 = ((int[]) objArr17[3])[0];
            int i28 = ((int[]) objArr17[2])[0];
            int i29 = ((int[]) objArr17[1])[0];
            int i30 = (int) Runtime.getRuntime().totalMemory();
            int i31 = ~i30;
            int i32 = ~(33360774 | i31);
            int i33 = i27 + 1537482585 + ((704774249 | i32) * (-712)) + (((~(i30 | 738135023)) | (~(i31 | (-704774250)))) * (-712)) + (((-716112620) | i32) * 712);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr2[3])[0] = i35 ^ (i35 << 5);
            int i36 = getRequestBeneficiariesState + 61;
            getAsAtTimestamp = i36 % 128;
            int i37 = i36 % 2;
            c2 = 3;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[0];
            if (strArr != null) {
                int i38 = 0;
                while (i38 < strArr.length) {
                    arrayList.add(strArr[i38]);
                    i38++;
                    int i39 = getAsAtTimestamp + 45;
                    getRequestBeneficiariesState = i39 % 128;
                    int i40 = i39 % 2;
                }
            }
            long j2 = -1;
            long j3 = ((long) (i16 ^ i17)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 11) << 32) | (j4 - ((j4 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 6619, KeyEvent.normalizeMetaState(0) + 42, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
            Object[] objArr18 = {1752876619, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Color.red(0), ExpandableListView.getPackedPositionGroup(0L) + 56, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault10).invoke(objInvoke, objArr18);
            Object[] objArr19 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i41 = ((int[]) objArr[3])[0];
            int i42 = ((int[]) objArr[2])[0];
            int i43 = ((int[]) objArr[1])[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i44 = ~iIdentityHashCode3;
            int i45 = i41 + 116037710 + (((~((-250438753) | i44)) | 499034641) * (-90)) + (((~((-250438753) | iIdentityHashCode3)) | (-536866418)) * (-45)) + (((~(iIdentityHashCode3 | (-499034642))) | (-250438753) | (~(i44 | 499034641))) * 45);
            int i46 = (i45 << 13) ^ i45;
            int i47 = i46 ^ (i46 >>> 17);
            ((int[]) objArr19[3])[0] = i47 ^ (i47 << 5);
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            Object[] objArr20 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i48 = ((int[]) objArr19[3])[0];
            int i49 = ((int[]) objArr19[2])[0];
            int i50 = ((int[]) objArr19[1])[0];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i51 = i48 + 1617002094 + (((~((-749735987) | (~iIdentityHashCode4))) | 262592) * (-591)) + ((iIdentityHashCode4 | (-749735987)) * 591);
            int i52 = (i51 << 13) ^ i51;
            int i53 = i52 ^ (i52 >>> 17);
            c2 = 3;
            ((int[]) objArr20[3])[0] = i53 ^ (i53 << 5);
            objArr2 = objArr20;
        }
        String strConcat = "5\\19\\10\\1\\10\\".concat("dest");
        int i54 = ((int[]) objArr2[c2])[0];
        int i55 = i54 * i54;
        int i56 = -(2017747851 * i54);
        int i57 = ((i55 | i56) << 1) - (i55 ^ i56);
        int i58 = -(i54 * (-1605664041));
        int i59 = (((i57 | i58) << 1) - (i58 ^ i57)) - (-1681133409);
        int i60 = ((i59 >> 24) - 511) / 256;
        int i61 = (i60 & 1) + (i60 | 1);
        int i62 = (-((((i59 | i61) << 1) - (i61 ^ i59)) ^ ((((i59 >> 20) - 8191) / 4096) + 1))) + 3;
        int i63 = i62 >> 15;
        int i64 = (((i63 | (-262143)) << 1) - (i63 ^ (-262143))) / 131072;
        int i65 = (i64 & 1) + (i64 | 1);
        Intrinsics.checkNotNullParameter(dest, strConcat.substring(20670 / ((i62 & (-((i65 ^ 1) + ((i65 & 1) << 1)))) * 530)));
        dest.writeString(this.amount);
    }

    static {
        ShareDataUIState = 0;
        copydefault();
        CREATOR = new Creator();
        int i = equals + 41;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BongaCalculatorAmountsPayload() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static BongaCalculatorAmountsPayload copy$default(BongaCalculatorAmountsPayload bongaCalculatorAmountsPayload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 65;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = bongaCalculatorAmountsPayload.amount;
            int i5 = i4 + 87;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
        }
        return bongaCalculatorAmountsPayload.copy(str);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 79;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.amount;
            int i4 = 98 / 0;
        } else {
            str = this.amount;
        }
        int i5 = i2 + 41;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BongaCalculatorAmountsPayload copy(String amount) {
        int i = 2 % 2;
        BongaCalculatorAmountsPayload bongaCalculatorAmountsPayload = new BongaCalculatorAmountsPayload(amount);
        int i2 = getAsAtTimestamp + 33;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 69 / 0;
        }
        return bongaCalculatorAmountsPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 79;
        getRequestBeneficiariesState = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getRequestBeneficiariesState + 49;
            getAsAtTimestamp = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof BongaCalculatorAmountsPayload)) {
            int i3 = getAsAtTimestamp + 105;
            getRequestBeneficiariesState = i3 % 128;
            return i3 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.amount, ((BongaCalculatorAmountsPayload) other).amount)) {
            int i4 = getRequestBeneficiariesState + 15;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = getRequestBeneficiariesState + 49;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.amount;
        if (str == null) {
            int i2 = getAsAtTimestamp + 69;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i4 = getRequestBeneficiariesState + 85;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaCalculatorAmountsPayload(amount=" + this.amount + ")";
        int i2 = getAsAtTimestamp + 39;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static void copydefault() {
        copydefault = (char) 8440;
        component3 = (char) 51687;
        component1 = '3';
        component2 = (char) 26065;
    }
}
