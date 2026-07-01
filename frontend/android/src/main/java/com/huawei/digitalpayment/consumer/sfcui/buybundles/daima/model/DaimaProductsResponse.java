package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.ImageFormat;
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
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0003H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0003H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductsResponse;", "Landroid/os/Parcelable;", "totalRecords", "", "data", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;", "<init>", "(ILjava/util/List;)V", "getTotalRecords", "()I", "getData", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DaimaProductsResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DaimaProductsResponse> CREATOR;
    private static int component1;
    private static long copydefault;

    @SerializedName("data")
    private final List<DaimaProduct> data;

    @SerializedName("totalRecords")
    private final int totalRecords;
    private static final byte[] $$c = {81, 99, 107, 124};
    private static final int $$f = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarHeader.LF_SYMLINK, -82, -81, 124, -9, 5, 66, -54, -5, 3, Ascii.VT, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -48, -17, 4, Ascii.SI, Base64.padSymbol, -48, -12, 10, 62, -66, 13, 5, -4, 8, -2, 67, -56, -2, -3, Ascii.DC2, -10, 7, Ascii.DLE, -8, 65, -73, Ascii.ESC, -14, -9, 5, 0, 4, 4, Ascii.FF, -6, -3, 70};
    private static final int $$e = 29;
    private static final byte[] $$a = {112, 44, -46, -27, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK};
    private static final int $$b = 209;
    private static int component2 = 0;
    private static int ShareDataUIState = 1;
    private static int component3 = 0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DaimaProductsResponse> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DaimaProductsResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            while (i4 != i3) {
                int i5 = copydefault + 89;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    arrayList.add(DaimaProduct.CREATOR.createFromParcel(parcel));
                    i4 += 109;
                } else {
                    arrayList.add(DaimaProduct.CREATOR.createFromParcel(parcel));
                    i4++;
                }
            }
            return new DaimaProductsResponse(i2, arrayList);
        }

        @Override
        public DaimaProductsResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 79;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            DaimaProductsResponse daimaProductsResponseCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 42 / 0;
            }
            return daimaProductsResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DaimaProductsResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 73;
            copydefault = i3 % 128;
            DaimaProductsResponse[] daimaProductsResponseArr = new DaimaProductsResponse[i];
            if (i3 % 2 == 0) {
                int i4 = 70 / 0;
            }
            return daimaProductsResponseArr;
        }

        @Override
        public DaimaProductsResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 37;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            DaimaProductsResponse[] daimaProductsResponseArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 67 / 0;
            }
            int i6 = component2 + 43;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return daimaProductsResponseArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
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
    private static java.lang.String $$g(short r7, int r8, short r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProductsResponse.$$c
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r9 = r9 * 3
            int r9 = 105 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2c
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2c:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProductsResponse.$$g(short, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 3
            int r8 = 28 - r8
            int r7 = r7 * 16
            int r7 = 99 - r7
            int r9 = r9 * 6
            int r9 = 16 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProductsResponse.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L1a:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r3
            r3 = r7
            r7 = r6
        L2e:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r3 + 1
            int r8 = r8 + (-17)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProductsResponse.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 3
            int r5 = 99 - r5
            int r7 = r7 * 50
            int r7 = 53 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProductsResponse.$$d
            int r6 = r6 * 41
            int r6 = 51 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r7 = r7 + 1
            r4 = r0[r7]
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + 3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProductsResponse.c(byte, short, int, java.lang.Object[]):void");
    }

    public DaimaProductsResponse(int i, List<DaimaProduct> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.totalRecords = i;
        this.data = list;
    }

    public final int getTotalRecords() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 117;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.totalRecords;
        int i6 = i2 + 113;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final List<DaimaProduct> getData() {
        List<DaimaProduct> list;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            list = this.data;
            int i4 = 70 / 0;
        } else {
            list = this.data;
        }
        int i5 = i3 + 109;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $11 + 123;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i5 = $10 + 103;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 3266, 34 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (60268 - (ViewConfiguration.getTouchSlop() >> 8)), -834797019, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() & (copydefault * 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 687, 35 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (60373 - (ViewConfiguration.getFadingEdgeLength() >> 16)), -1969106284, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
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
                int i7 = notifyVar.copydefault;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3266 - (ViewConfiguration.getTapTimeout() >> 16), 34 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 60267), -834797019, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (copydefault ^ 5431355972723572778L);
                    try {
                        Object[] objArr5 = {notifyVar, notifyVar};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                        if (objCopydefault4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 687, View.resolveSize(0, 0) + 34, (char) (View.combineMeasuredStates(0, 0) + 60373), -1969106284, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i8 = $11 + 21;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                Object[] objArr6 = {notifyVar, notifyVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 687, ImageFormat.getBitsPerPixel(0) + 35, (char) (60373 - TextUtils.getCapsMode("", 0, 0)), -1969106284, false, $$g(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objCopydefault5).invoke(null, objArr6);
                obj.hashCode();
                throw null;
            }
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr7 = {notifyVar, notifyVar};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault6 == null) {
                byte b12 = (byte) 0;
                byte b13 = b12;
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(687 - TextUtils.getCapsMode("", 0, 0), ImageFormat.getBitsPerPixel(0) + 35, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 60373), -1969106284, false, $$g(b12, b13, b13), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    public boolean equals(Object other) throws Throwable {
        Object[] objArr;
        char c2;
        Object[] objArr2;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1370061132);
        if (objCopydefault == null) {
            int mode = 824 - View.MeasureSpec.getMode(0);
            int i2 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 19;
            char cKeyCodeFromString = (char) (58322 - KeyEvent.keyCodeFromString(""));
            Object[] objArr3 = new Object[1];
            a((byte) 0, (byte) (-$$a[9]), (byte) ($$b & 7), objArr3);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(mode, i2, cKeyCodeFromString, 1796168145, false, (String) objArr3[0], null);
        }
        Object obj = null;
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr4 = new Object[1];
        b(ImageFormat.getBitsPerPixel(0) + 1754, new char[]{50963, 49605, 51876, 54155, 56441, 58662, 60928, 59571, 61909, 64160, 33574, 35954, 38183, 40452, 39128, 41376, 43663, 45912, 48220, 17670, 20453, 18644}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b((ViewConfiguration.getScrollBarSize() >> 8) + 683, new char[]{50967, 50613, 49733, 52995, 52653, 51776, 55060, 54669, 53839, 57104, 56752, 55903, 59167, 58800, 57933}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(731302035);
        if (objCopydefault2 == null) {
            int size = 824 - View.MeasureSpec.getSize(0);
            int size2 = View.MeasureSpec.getSize(0) + 20;
            char keyRepeatTimeout = (char) (58322 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
            byte b2 = (byte) ($$b & 7);
            byte b3 = (byte) (-$$a[21]);
            Object[] objArr6 = new Object[1];
            a(b2, b3, (byte) (b3 - 5), objArr6);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(size, size2, keyRepeatTimeout, -288417802, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1370984653);
            if (objCopydefault3 == null) {
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 824;
                int modifierMetaStateMask = 19 - ((byte) KeyEvent.getModifierMetaStateMask());
                char touchSlop = (char) (58322 - (ViewConfiguration.getTouchSlop() >> 8));
                byte b4 = (byte) 0;
                byte b5 = b4;
                Object[] objArr7 = new Object[1];
                a(b4, b5, (byte) (b5 + 1), objArr7);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, modifierMetaStateMask, touchSlop, 1796321366, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{strArr, new int[1], new int[]{i}, new int[]{i}};
            int i3 = ((int[]) objArr8[2])[0];
            int i4 = ((int[]) objArr8[3])[0];
            String[] strArr = (String[]) objArr8[0];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i5 = ~elapsedCpuTime;
            int i6 = 159161134 + (((~((-45726205) | i5)) | 53463847) * 519) + (((~(i5 | (-9449689))) | (~(62913535 | elapsedCpuTime))) * (-519)) + (((~(elapsedCpuTime | 53463847)) | 45726204) * 519) + 1966659913;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            c2 = 3;
        } else {
            Object[] objArr9 = new Object[1];
            b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 3389, new char[]{50963, 51745, 56684, 57527, 62441, 34090, 34936, 39927, 44795, 45095, 17248, 22211, 23023, 27400, 32336, 392, 5332, 9750, 10572, 15500, 53218, 53531, 58430, 63340, 64171, 36323}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b(TextUtils.indexOf((CharSequence) "", '0', 0) + 52010, new char[]{50961, 3118, 20818, 42619, 60339, 12497, 1520, 18732, 40522, 58227, 10372, 32216, 17149, 38406, 56120, 8316, 30093, 47781}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i9 = ShareDataUIState + 107;
                component2 = i9 % 128;
                if (i9 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = (((applicationContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext).getBaseContext() != null) ? applicationContext.getApplicationContext() : null;
            }
            Object[] objArr11 = new Object[1];
            b((ViewConfiguration.getScrollBarSize() >> 8) + 43573, new char[]{50968, 27942, 37742, 14732, 28552, 37911, 14893, 24687, 38589, 15489, 24883, 38732, 15741, 25527, 35313, 15876}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            b(((byte) KeyEvent.getModifierMetaStateMask()) + 61340, new char[]{50971, 10381, 6177, 2509, 31082, 26908, 23204, 18998, 48098, 43872, 39695, 36019, 64629, 60866, 56684, 52482}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr13 = new Object[1];
            b(View.getDefaultSize(0, 0) + 3299, new char[]{50964, 52136, 57040, 57835, 62621, 34687, 35393, 40304, 40969, 46269, 18377, 19153, 24035, 24774, 29481, 1627, 2420, 7252, 8418, 13213, 50863, 51598, 56468, 61219, 61960, 34159, 34891, 40167, 44996, 45814, 17806, 18493, 23339, 28245, 29037, 1103, 2214, 7051, 12021, 12767, 50287, 55066, 55933, 60725, 61461, 33956, 38873, 39659, 44420, 45112, 17218, 22057, 22877, 28136, 28916, 910, 5817, 6557, 11301, 16148, 49782, 54612, 55787, 60620}, objArr13);
            String str = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            b(50069 - View.resolveSizeAndState(0, 0, 0), new char[]{51019, 1232, 16445, 36268, 51477, 5882, 21050, 40452, 56249, 10110, 25752, 40994, 60856, 10630, 30000, 45741, 65047, 15268, 1840, 17224, 32992, 52347, 2440, 21872, 37555, 57038, 6706, 26613, 41743, 57590, 11318, 26699, 46571, 61812, 16000, 31252, 18353, 33743, 53076, 3313, 18441, 38302, 53606, 7489, 23258, 42614, 58240, 12106, 27829, 43158, 62477, 12773, 32001, 47818, 34431, 49728, 3980, 19257, 34946, 54288, 4520, 23953, 39168, 59119}, objArr14);
            try {
                Object[] objArr15 = {applicationContext, new String[]{str, (String) objArr14[0]}, Integer.valueOf(iIntValue), 17, 1966659913};
                byte[] bArr = $$d;
                byte b6 = bArr[56];
                byte b7 = b6;
                Object[] objArr16 = new Object[1];
                c(b6, b7, (byte) (b7 + 1), objArr16);
                Class<?> cls4 = Class.forName((String) objArr16[0]);
                byte b8 = bArr[56];
                byte b9 = b8;
                Object[] objArr17 = new Object[1];
                c(b9, (byte) (b9 + 1), b8, objArr17);
                Object[] objArr18 = (Object[]) cls4.getMethod((String) objArr17[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr15);
                int i10 = ((int[]) objArr18[3])[0];
                int i11 = ((int[]) objArr18[2])[0];
                if (applicationContext != null) {
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1370984653);
                    if (objCopydefault4 == null) {
                        int i12 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 824;
                        int packedPositionChild = 19 - ExpandableListView.getPackedPositionChild(0L);
                        char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 58321);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr19 = new Object[1];
                        a(b10, b11, (byte) (b11 + 1), objArr19);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i12, packedPositionChild, c3, 1796321366, false, (String) objArr19[0], null);
                    }
                    ((Field) objCopydefault4).set(null, objArr18);
                    try {
                        Object[] objArr20 = new Object[1];
                        b(1753 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{50963, 49605, 51876, 54155, 56441, 58662, 60928, 59571, 61909, 64160, 33574, 35954, 38183, 40452, 39128, 41376, 43663, 45912, 48220, 17670, 20453, 18644}, objArr20);
                        Class<?> cls5 = Class.forName((String) objArr20[0]);
                        Object[] objArr21 = new Object[1];
                        b(683 - TextUtils.getCapsMode("", 0, 0), new char[]{50967, 50613, 49733, 52995, 52653, 51776, 55060, 54669, 53839, 57104, 56752, 55903, 59167, 58800, 57933}, objArr21);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(731302035);
                        if (objCopydefault5 == null) {
                            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 824;
                            int i13 = 20 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            char jumpTapTimeout2 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 58322);
                            byte b12 = (byte) ($$b & 7);
                            byte b13 = (byte) (-$$a[21]);
                            Object[] objArr22 = new Object[1];
                            a(b12, b13, (byte) (b13 - 5), objArr22);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(jumpTapTimeout, i13, jumpTapTimeout2, -288417802, false, (String) objArr22[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1370061132);
                        if (objCopydefault6 == null) {
                            int modifierMetaStateMask2 = 823 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int windowTouchSlop = 20 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 58323);
                            Object[] objArr23 = new Object[1];
                            a((byte) 0, (byte) (-$$a[9]), (byte) ($$b & 7), objArr23);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(modifierMetaStateMask2, windowTouchSlop, cLastIndexOf, 1796168145, false, (String) objArr23[0], null);
                        }
                        ((Field) objCopydefault6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr18;
                c2 = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr[c2])[0];
        int i15 = ((int[]) objArr[2])[0];
        if (i15 == i14) {
            Object[] objArr24 = {strArr, new int[1], new int[]{i}, new int[]{i}};
            int i16 = ((int[]) objArr[1])[0];
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[0];
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i19 = i16 + (-1626640661) + (((~(407897519 | elapsedCpuTime2)) | 103385680) * 104) + ((~((~elapsedCpuTime2) | (-4195629))) * (-104)) + ((elapsedCpuTime2 | 507087571) * 104);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr24[1])[0] = i21 ^ (i21 << 5);
            objArr2 = new Object[]{strArr2, new int[1], new int[]{i}, new int[]{i}};
            int i22 = ((int[]) objArr24[1])[0];
            int i23 = ((int[]) objArr24[2])[0];
            int i24 = ((int[]) objArr24[3])[0];
            int iMyPid = Process.myPid();
            int i25 = (-808037523) + (((~((-946329968) | iMyPid)) | 847139915) * (-318));
            int i26 = ~(847139915 | iMyPid);
            int i27 = ~iMyPid;
            int i28 = i22 + i25 + ((i26 | (~((-35128321) | i27))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iMyPid | (-35128321))) | (~(981458287 | i27))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr2[1])[0] = i30 ^ (i30 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i31 = ShareDataUIState + 29;
                component2 = i31 % 128;
                int i32 = i31 % 2;
                for (String str2 : strArr3) {
                    arrayList.add(str2);
                }
            }
            long j2 = -1;
            long j3 = ((long) (i14 ^ i15)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 8) << 32) | (j4 - ((j4 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6617 - ImageFormat.getBitsPerPixel(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr25 = {-827548779, Long.valueOf(j5), arrayList, null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 56 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr25);
                Object[] objArr26 = {strArr, new int[1], new int[]{i}, new int[]{i}};
                int i33 = ((int[]) objArr[1])[0];
                int i34 = ((int[]) objArr[2])[0];
                int i35 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[0];
                int iIdentityHashCode = System.identityHashCode(this);
                int i36 = ~iIdentityHashCode;
                int i37 = i33 + 1105362421 + (((~(164437131 | i36)) | (~((-263627184) | iIdentityHashCode))) * 210) + (((~(iIdentityHashCode | 268418479)) | (~(i36 | (-159645836)))) * 210);
                int i38 = (i37 << 13) ^ i37;
                int i39 = i38 ^ (i38 >>> 17);
                ((int[]) objArr26[1])[0] = i39 ^ (i39 << 5);
                int[] iArr = new int[i15];
                int i40 = i15 - 1;
                iArr[i40] = 1;
                Toast.makeText((Context) null, iArr[((i15 * i40) % 2) - 1], 1).show();
                Object[] objArr27 = {strArr, new int[1], new int[]{i}, new int[]{i}};
                int i41 = ((int[]) objArr26[1])[0];
                int i42 = ((int[]) objArr26[2])[0];
                int i43 = ((int[]) objArr26[3])[0];
                String[] strArr5 = (String[]) objArr26[0];
                int iMyUid = Process.myUid();
                int i44 = ~iMyUid;
                int i45 = i41 + (-1171655419) + (((~((-568871232) | i44)) | 566249507) * (-108)) + (((~(i44 | 668061283)) | (~((-668061284) | iMyUid)) | (-670683008)) * 54) + ((iMyUid | (-670683008)) * 54);
                int i46 = (i45 << 13) ^ i45;
                int i47 = i46 ^ (i46 >>> 17);
                ((int[]) objArr27[1])[0] = i47 ^ (i47 << 5);
                int i48 = ShareDataUIState + 7;
                component2 = i48 % 128;
                int i49 = i48 % 2;
                objArr2 = objArr27;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof DaimaProductsResponse)) {
            return false;
        }
        DaimaProductsResponse daimaProductsResponse = (DaimaProductsResponse) other;
        if (this.totalRecords == daimaProductsResponse.totalRecords) {
            if (Intrinsics.areEqual(this.data, daimaProductsResponse.data)) {
                return true;
            }
            int i50 = ShareDataUIState + 19;
            component2 = i50 % 128;
            int i51 = i50 % 2;
            return false;
        }
        int i52 = ((int[]) objArr2[1])[0];
        int i53 = i52 * i52;
        int i54 = -(1255020659 * i52);
        int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
        int i56 = -(i52 * 1620842343);
        int i57 = (i55 & i56) + (i56 | i55);
        int i58 = (i57 & 962490729) + (962490729 | i57);
        int i59 = i58 >> 29;
        int i60 = ((i59 & (-15)) + (i59 | (-15))) / 8;
        int i61 = (i60 & 1) + (i60 | 1);
        int i62 = -(((((i58 >> 20) - 8191) / 4096) + 1) ^ (((i58 | i61) << 1) - (i61 ^ i58)));
        int i63 = (i62 & 7) + (i62 | 7);
        int i64 = i63 >> 26;
        int i65 = ((i64 ^ ComposerKt.defaultsKey) + ((i64 & ComposerKt.defaultsKey) << 1)) / 64;
        int i66 = (i65 & 1) + (i65 | 1);
        return 0 / (((-((i66 & 1) + (i66 | 1))) & i63) * 1999);
    }

    static {
        component1 = 1;
        ShareDataUIState();
        CREATOR = new Creator();
        int i = component3 + 119;
        component1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DaimaProductsResponse copy$default(DaimaProductsResponse daimaProductsResponse, int i, List list, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 75;
        int i5 = i4 % 128;
        component2 = i5;
        if (i4 % 2 == 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            i = daimaProductsResponse.totalRecords;
        }
        if ((i2 & 2) != 0) {
            int i6 = i5 + 103;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            list = daimaProductsResponse.data;
        }
        return daimaProductsResponse.copy(i, list);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 35;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.totalRecords;
        int i6 = i2 + 111;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 60 / 0;
        }
        return i5;
    }

    public final List<DaimaProduct> component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<DaimaProduct> list = this.data;
        int i5 = i3 + 79;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final DaimaProductsResponse copy(int totalRecords, List<DaimaProduct> data) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(data, "");
        DaimaProductsResponse daimaProductsResponse = new DaimaProductsResponse(totalRecords, data);
        int i2 = component2 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return daimaProductsResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 21;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.totalRecords) * 31) + this.data.hashCode();
        int i4 = component2 + 113;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DaimaProductsResponse(totalRecords=" + this.totalRecords + ", data=" + this.data + ")";
        int i2 = ShareDataUIState + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeInt(this.totalRecords);
            List<DaimaProduct> list = this.data;
            dest.writeInt(list.size());
            list.iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeInt(this.totalRecords);
        List<DaimaProduct> list2 = this.data;
        dest.writeInt(list2.size());
        Iterator<DaimaProduct> it = list2.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        int i4 = component2 + 123;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ShareDataUIState() {
        copydefault = -6929682392632899752L;
    }
}
