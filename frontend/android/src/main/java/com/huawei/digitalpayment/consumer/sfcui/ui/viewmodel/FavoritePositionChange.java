package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u0003H\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0003H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/viewmodel/FavoritePositionChange;", "Landroid/os/Parcelable;", "from", "", TypedValues.TransitionType.S_TO, "<init>", "(II)V", "getFrom", "()I", "getTo", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavoritePositionChange implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FavoritePositionChange> CREATOR;
    private static long component1;
    private static int component3;
    private final int from;
    private final int to;
    private static final byte[] $$c = {35, -27, -128, TarHeader.LF_SYMLINK};
    private static final int $$f = 92;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {0, -128, 34, -14, 68, -9, 5, 66, -54, -5, 3, Ascii.VT, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, Ascii.DC2, -10, 7, Ascii.DLE, -8, 65, -60, 4, 4, 5, -8, Ascii.CAN, -20, Ascii.DLE, -7, 13, -3, 4, Ascii.DC2, 0, 4, -14, Ascii.DC2, -9, Ascii.SO, 2, 9, 0, -16, 10, 13, -5, 10, 4, 57, -73, 3, Ascii.SO, -9, 5, 0, 4, 4, Ascii.FF, -6, -3, 70};
    private static final int $$e = 244;
    private static final byte[] $$a = {TarHeader.LF_CHR, -39, 98, -44, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK};
    private static final int $$b = 253;
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private static int component2 = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavoritePositionChange> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FavoritePositionChange createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FavoritePositionChange favoritePositionChange = new FavoritePositionChange(parcel.readInt(), parcel.readInt());
            int i2 = ShareDataUIState + 5;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return favoritePositionChange;
        }

        @Override
        public FavoritePositionChange createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 17;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FavoritePositionChange[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 101;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            FavoritePositionChange[] favoritePositionChangeArr = new FavoritePositionChange[i];
            int i6 = i3 + 9;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return favoritePositionChangeArr;
        }

        @Override
        public FavoritePositionChange[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 31;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            FavoritePositionChange[] favoritePositionChangeArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 45 / 0;
            }
            return favoritePositionChangeArrNewArray;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r7, int r8, int r9) {
        /*
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r9 = r9 * 4
            int r9 = r9 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange.$$g(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange.$$a
            int r6 = r6 + 4
            int r8 = r8 * 6
            int r1 = 16 - r8
            int r7 = r7 * 16
            int r7 = r7 + 83
            byte[] r1 = new byte[r1]
            int r8 = 15 - r8
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-17)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange.a(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 5
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange.$$d
            int r6 = r6 * 54
            int r6 = 64 - r6
            int r8 = r8 * 4
            int r8 = r8 + 99
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + 3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange.c(int, short, short, java.lang.Object[]):void");
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component1 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 89;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 34, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getJumpTapTimeout() >> 16) + 1390, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, (char) (51269 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), -1883291598, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $11 + 73;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    public FavoritePositionChange(int i, int i2) {
        this.from = i;
        this.to = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FavoritePositionChange(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            int i4 = ShareDataUIState + 85;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            i = -1;
        }
        if ((i3 & 2) != 0) {
            int i7 = ShareDataUIState + 81;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            i2 = -1;
        }
        this(i, i2);
    }

    public final int getFrom() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 23;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.from;
        int i6 = i2 + 89;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getTo() {
        int i;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 97;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0) {
            i = this.to;
            int i5 = 46 / 0;
        } else {
            i = this.to;
        }
        int i6 = i4 + 123;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 44 / 0;
        }
        return i;
    }

    public final int component1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1370061132);
        if (objCopydefault == null) {
            int i4 = 825 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int i5 = 21 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 58323);
            byte b2 = (byte) ($$a[27] + 1);
            byte b3 = (byte) (-b2);
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4, i5, modifierMetaStateMask, 1796168145, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(ImageFormat.getBitsPerPixel(0) + 1, new char[]{19343, 64450, 19438, 53435, 56796, 9384, 28375, 16546, 14320, 41151, 60103, 50414, 46016, 11413, 26301, 18595, 16326, 43141, 58103, 52357, 48034, 13509, 32415, 20735, 10172, 45309}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(View.getDefaultSize(0, 0), new char[]{60532, 23947, 60433, 11307, 30351, 33507, 37442, 60403, 36887, 1786, 5719, 28609, 5169, 35534, 39535, 58327, 38957, 3794, 7798}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(731302035);
        if (objCopydefault2 == null) {
            int iKeyCodeFromString = 824 - KeyEvent.keyCodeFromString("");
            int i6 = 20 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            char mode = (char) (View.MeasureSpec.getMode(0) + 58322);
            byte b4 = (byte) 0;
            Object[] objArr5 = new Object[1];
            a((byte) (-$$a[9]), b4, b4, objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, i6, mode, -288417802, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1370984653);
            if (objCopydefault3 == null) {
                int i7 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 823;
                int iIndexOf = 19 - TextUtils.indexOf((CharSequence) "", '0');
                char offsetAfter = (char) (58322 - TextUtils.getOffsetAfter("", 0));
                byte b5 = (byte) (-$$a[11]);
                byte b6 = (byte) (b5 & 1);
                Object[] objArr6 = new Object[1];
                a(b5, b6, b6, objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7, iIndexOf, offsetAfter, 1796321366, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{strArr, new int[1], new int[]{i}, new int[]{i}};
            int i8 = ((int[]) objArr7[2])[0];
            int i9 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[0];
            int i10 = (int) Runtime.getRuntime().totalMemory();
            int i11 = ~i10;
            int i12 = (((-328320677) + ((((~(i11 | (-338046957))) | 69208812) | (~((-168398865) | i10))) * 717)) + (((~(i10 | (-338046957))) | ((~(i11 | (-168398865))) | 69208812)) * 717)) - 945103061;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[1])[0] = i14 ^ (i14 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(ViewConfiguration.getTapTimeout() >> 16, new char[]{45247, 63635, 45278, 33118, 63287, 10233, 16178, 27209, 52416, 41966, 47906, 60933, 18686, 12231, 14086, 25141, 50382, 43972, 45842, 58978, 16521, 14270, 12130, 31234, 56507, 45999, 43892, 65038, 22718, 16275}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b((-1) - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{64345, 65248, 64314, 46530, 1930, 8593, 3000, 39668, 34604, 42394, 36782, 7895, 777, 10676, 902, 37583, 36618, 44469, 34702, 5855, 2934, 12746}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            b(KeyEvent.normalizeMetaState(0), new char[]{5018, 55038, 5104, 13268, 464, 2459, 36266, 40125, 28580, 36230, 2477, 6306, 60381, 500, 34223, 38021, 26585, 34238, 393, 4225}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{14887, 64956, 14926, 36496, 29840, 8924, 12541, 59890, 17987, 42689, 46332, 28149, 49743, 11001, 14539, 57812, 20052, 44775, 48332, 26057}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            b(TextUtils.indexOf((CharSequence) "", '0') + 1, new char[]{58662, 60243, 58688, 19140, 25771, 13422, 62632, 63895, 39253, 45093, 28861, 32128, 7525, 15427, 64649, 61925, 37155, 47188, 30925, 30195, 5456, 9250, 58602, 59857, 35095, 41060, 24824, 28099, 3444, 11265, 60571, 57763, 33076, 43028, 26842, 26085, 1439, 21683, 54389, 6419, 47502, 53489, 20585, 40207, 15843, 23748, 56413, 4449, 45557, 55510, 22557, 38179, 13696, 17582, 50282, 2309, 43461, 49378, 16504, 36174, 11685, 19667, 52245, 368, 41446, 51350, 18527, 34100}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            b(((byte) KeyEvent.getModifierMetaStateMask()) + 1, new char[]{15804, 52997, 15749, 20207, 27136, 4150, 61570, 63341, 16799, 38000, 29889, 29561, 50687, 6160, 63743, 65307, 18874, 40020, 31923, 31576, 52681, 'r', 57503, 59257, 20954, 33889, 25731, 25405, 54757, 2128, 59621, 61276, 23037, 35860, 27813, 27470, 56581, 28850, 53343, 6069, 24859, 62629, 21583, 37804, 58671, 30864, 55329, 8088, 26936, 64644, 23651, 39903, 60747, 24736, 49218, 2036, 29019, 58544, 17492, 33773, 62778, 26759, 51253, 4057, 31098, 60563, 19571, 35786}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -945103061};
                byte[] bArr = $$d;
                byte b7 = bArr[0];
                byte b8 = b7;
                Object[] objArr15 = new Object[1];
                c(b8, (byte) (b8 - 1), b7, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                c((byte) (bArr[55] - 1), (byte) 62, bArr[0], objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i15 = ((int[]) objArr17[3])[0];
                int i16 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    int i17 = ShareDataUIState + 99;
                    copydefault = i17 % 128;
                    int i18 = i17 % 2;
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1370984653);
                    if (objCopydefault4 == null) {
                        int defaultSize = 824 - View.getDefaultSize(0, 0);
                        int fadingEdgeLength = 20 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 58322);
                        byte b9 = (byte) (-$$a[11]);
                        byte b10 = (byte) (b9 & 1);
                        Object[] objArr18 = new Object[1];
                        a(b9, b10, b10, objArr18);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, fadingEdgeLength, maximumDrawingCacheSize, 1796321366, false, (String) objArr18[0], null);
                    }
                    ((Field) objCopydefault4).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        b(ViewConfiguration.getPressedStateDuration() >> 16, new char[]{19343, 64450, 19438, 53435, 56796, 9384, 28375, 16546, 14320, 41151, 60103, 50414, 46016, 11413, 26301, 18595, 16326, 43141, 58103, 52357, 48034, 13509, 32415, 20735, 10172, 45309}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        b(ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{60532, 23947, 60433, 11307, 30351, 33507, 37442, 60403, 36887, 1786, 5719, 28609, 5169, 35534, 39535, 58327, 38957, 3794, 7798}, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(731302035);
                        if (objCopydefault5 == null) {
                            int i19 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 824;
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 20;
                            char cAxisFromString = (char) (58321 - MotionEvent.axisFromString(""));
                            byte b11 = (byte) 0;
                            Object[] objArr21 = new Object[1];
                            a((byte) (-$$a[9]), b11, b11, objArr21);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i19, packedPositionType, cAxisFromString, -288417802, false, (String) objArr21[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1370061132);
                        if (objCopydefault6 == null) {
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 825;
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 20;
                            char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 58321);
                            byte b12 = (byte) ($$a[27] + 1);
                            byte b13 = (byte) (-b12);
                            Object[] objArr22 = new Object[1];
                            a(b12, b13, b13, objArr22);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, packedPositionGroup, c2, 1796168145, false, (String) objArr22[0], null);
                        }
                        ((Field) objCopydefault6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i20 = ((int[]) objArr[3])[0];
        int i21 = ((int[]) objArr[2])[0];
        if (i21 == i20) {
            int i22 = copydefault + 103;
            ShareDataUIState = i22 % 128;
            int i23 = i22 % 2;
            Object[] objArr23 = {strArr, new int[1], new int[]{i}, new int[]{i}};
            int i24 = ((int[]) objArr[1])[0];
            int i25 = ((int[]) objArr[2])[0];
            int i26 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[0];
            int i27 = i24 + ((((~(19686552 | r0)) | (-104434981)) * 398) - 241619401) + (((~((~new Random().nextInt(2037182601)) | 19686552)) | (-104434981)) * 398);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            ((int[]) objArr23[1])[0] = i29 ^ (i29 << 5);
            Object[] objArr24 = {strArr2, new int[1], new int[]{i}, new int[]{i}};
            int i30 = ((int[]) objArr23[1])[0];
            int i31 = ((int[]) objArr23[2])[0];
            int i32 = ((int[]) objArr23[3])[0];
            int iMyPid = Process.myPid();
            int i33 = ~iMyPid;
            int i34 = i30 + (-1954386794) + (((-440566785) | i33) * (-369)) + (((~((-556612024) | i33)) | (-457421972)) * (-369)) + (((~(iMyPid | 556612023)) | (-997178808) | (~(i33 | (-16855188)))) * 369);
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr24[1])[0] = i36 ^ (i36 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                int i37 = ShareDataUIState + 7;
                copydefault = i37 % 128;
                for (int i38 = i37 % 2 == 0 ? 1 : 0; i38 < strArr3.length; i38++) {
                    int i39 = ShareDataUIState + 15;
                    copydefault = i39 % 128;
                    int i40 = i39 % 2;
                    arrayList.add(strArr3[i38]);
                }
            }
            long j2 = -1;
            long j3 = ((long) (i20 ^ i21)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 8) << 32) | (j4 - ((j4 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 6618, 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr25 = {-1646302226, Long.valueOf(j5), arrayList, null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6562 - ((Process.getThreadPriority(0) + 20) >> 6), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 56, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr25);
                Object[] objArr26 = {strArr, new int[1], new int[]{i}, new int[]{i}};
                int i41 = ((int[]) objArr[1])[0];
                int i42 = ((int[]) objArr[2])[0];
                int i43 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[0];
                int i44 = ~(((int) SystemClock.uptimeMillis()) | (-554508677));
                int i45 = i41 + (((-671066029) | i44) * (-196)) + 343830031 + ((i44 | 116557352) * 196);
                int i46 = (i45 << 13) ^ i45;
                int i47 = i46 ^ (i46 >>> 17);
                ((int[]) objArr26[1])[0] = i47 ^ (i47 << 5);
                Toast.makeText((Context) null, i21 / (((i21 - 1) * i21) % 2), 0).show();
                Object[] objArr27 = {strArr, new int[1], new int[]{i}, new int[]{i}};
                int i48 = ((int[]) objArr26[1])[0];
                int i49 = ((int[]) objArr26[2])[0];
                int i50 = ((int[]) objArr26[3])[0];
                String[] strArr5 = (String[]) objArr26[0];
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i51 = ~elapsedCpuTime;
                int i52 = i48 + 420426311 + (((~(elapsedCpuTime | (-710702411))) | (~((-268536357) | i51)) | 169346304) * (-68)) + ((~((-541356107) | i51)) * (-68)) + (((~(710702410 | i51)) | (-809892463)) * 68);
                int i53 = (i52 << 13) ^ i52;
                int i54 = i53 ^ (i53 >>> 17);
                ((int[]) objArr27[1])[0] = i54 ^ (i54 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        return this.from;
    }

    static {
        component3 = 0;
        ShareDataUIState();
        CREATOR = new Creator();
        int i = component2 + 93;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FavoritePositionChange() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static FavoritePositionChange copy$default(FavoritePositionChange favoritePositionChange, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = ShareDataUIState;
        int i6 = i5 + 5;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        if ((i3 & 1) != 0) {
            int i8 = i5 + 11;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            i = favoritePositionChange.from;
        }
        if ((i3 & 2) != 0) {
            i2 = favoritePositionChange.to;
            int i10 = i5 + 5;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
        }
        return favoritePositionChange.copy(i, i2);
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 89;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.to;
        int i6 = i2 + 97;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final FavoritePositionChange copy(int from, int to) {
        int i = 2 % 2;
        FavoritePositionChange favoritePositionChange = new FavoritePositionChange(from, to);
        int i2 = ShareDataUIState + 75;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 29 / 0;
        }
        return favoritePositionChange;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 47;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r7 instanceof com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange)) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        r7 = (com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r6.from == r7.from) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r1 = r1 + 33;
        com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange.ShareDataUIState = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if ((r1 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r6.to == r7.to) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange.copydefault
            int r2 = r1 + 111
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange.ShareDataUIState = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 37
            int r2 = r2 / r4
            if (r6 != r7) goto L19
            goto L18
        L16:
            if (r6 != r7) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r7 instanceof com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange
            r2 = r2 ^ r3
            if (r2 == 0) goto L1f
            return r4
        L1f:
            com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange r7 = (com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange) r7
            int r2 = r6.from
            int r5 = r7.from
            if (r2 == r5) goto L33
            int r1 = r1 + 33
            int r7 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange.ShareDataUIState = r7
            int r1 = r1 % r0
            if (r1 == 0) goto L31
            goto L32
        L31:
            r3 = r4
        L32:
            return r3
        L33:
            int r0 = r6.to
            int r7 = r7.to
            if (r0 == r7) goto L3a
            return r4
        L3a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel.FavoritePositionChange.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.from) * 31) + Integer.hashCode(this.to);
        int i4 = ShareDataUIState + 35;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FavoritePositionChange(from=" + this.from + ", to=" + this.to + ")";
        int i2 = copydefault + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeInt(this.from);
            dest.writeInt(this.to);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeInt(this.from);
        dest.writeInt(this.to);
        int i4 = copydefault + 43;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ShareDataUIState() {
        component1 = 7858034481004278677L;
    }
}
