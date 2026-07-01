package com.safaricom.sharedui.compose.confirmation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.safaricom.consumer.commons.util.TextResource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType;", "Landroid/os/Parcelable;", "<init>", "()V", "Info", "Fee", "Hint", "AccessFee", "ExchangeRate", "CountryState", "Warning", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$AccessFee;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$CountryState;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$ExchangeRate;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$Fee;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$Hint;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$Info;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$Warning;", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AdditionalInfoType implements Parcelable {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0014H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$AccessFee;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType;", "accessFee", "", "currency", "", "isCurrencyAllCaps", "", "<init>", "(DLjava/lang/String;Z)V", "getAccessFee", "()D", "getCurrency", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AccessFee extends AdditionalInfoType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<AccessFee> CREATOR = new Creator();
        private final double accessFee;
        private final String currency;
        private final boolean isCurrencyAllCaps;

        @Override
        public final int describeContents() {
            return 0;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AccessFee> {
            private static final byte[] $$c = {80, -19, -87, -22};
            private static final int $$f = 46;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {109, 5, -57, 108, Ascii.VT, -3, -64, TarHeader.LF_SYMLINK, 10, -4, -8, -2, 0, -2, -52, TarHeader.LF_SYMLINK, Ascii.DLE, -10, Ascii.FF, -18, Ascii.FF, -69, 69, -3, -18, 1, 1, -2, 0, -4, Ascii.DC2, -15, -58, TarHeader.LF_BLK, Ascii.VT, -4, -1, -8, -3, Ascii.DLE, -6, 2, -69, Ascii.RS, Ascii.ETB, 7, 1, 2, 6, -55, 43, -4, -1, -8, -3, Ascii.DLE, -6, 2, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, -66};
            private static final int $$e = 45;
            private static final byte[] $$a = {TarHeader.LF_SYMLINK, -82, -81, 124, 2, -15, TarHeader.LF_CHR, -50, TarHeader.LF_SYMLINK, -51, 32, -21, -4, 8, -14, -1, 19, -12, -3, 2, -15, 34, -19, -12, -4, Ascii.DLE, -14, -1, TarHeader.LF_SYMLINK, -35, -9, 9, -1, -3, 6, -6, 8, -17, 9, 4, -14, 32, -33, 19, -19, Ascii.SI, -12, -1, -9};
            private static final int $$b = 71;
            private static int copydefault = 0;
            private static int component1 = 1;
            private static long ShareDataUIState = 7541437352197633345L;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$g(int r5, short r6, short r7) {
                /*
                    byte[] r0 = com.safaricom.sharedui.compose.confirmation.AdditionalInfoType.AccessFee.Creator.$$c
                    int r7 = r7 * 2
                    int r7 = r7 + 103
                    int r6 = r6 * 2
                    int r6 = r6 + 4
                    int r5 = r5 * 4
                    int r1 = 1 - r5
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r5 = 0 - r5
                    if (r0 != 0) goto L19
                    r4 = r7
                    r3 = r2
                    r7 = r6
                    goto L29
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r5) goto L25
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L25:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                L29:
                    int r6 = r6 + 1
                    int r7 = r7 + r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.safaricom.sharedui.compose.confirmation.AdditionalInfoType.AccessFee.Creator.$$g(int, short, short):java.lang.String");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void a(short r7, byte r8, short r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 * 3
                    int r7 = 45 - r7
                    byte[] r0 = com.safaricom.sharedui.compose.confirmation.AdditionalInfoType.AccessFee.Creator.$$a
                    int r8 = r8 * 12
                    int r8 = 28 - r8
                    int r9 = r9 * 4
                    int r9 = r9 + 99
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r9
                    r5 = r2
                    r9 = r7
                    goto L2e
                L17:
                    r3 = r2
                L18:
                    int r7 = r7 + 1
                    byte r4 = (byte) r9
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r8) goto L29
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L29:
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r7
                    r7 = r6
                L2e:
                    int r3 = -r3
                    int r7 = r7 + r3
                    r3 = r5
                    r6 = r9
                    r9 = r7
                    r7 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.safaricom.sharedui.compose.confirmation.AdditionalInfoType.AccessFee.Creator.a(short, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void c(int r7, byte r8, short r9, java.lang.Object[] r10) {
                /*
                    int r7 = r7 * 54
                    int r7 = r7 + 4
                    byte[] r0 = com.safaricom.sharedui.compose.confirmation.AdditionalInfoType.AccessFee.Creator.$$d
                    int r9 = r9 * 45
                    int r9 = 55 - r9
                    int r8 = r8 * 4
                    int r8 = r8 + 99
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r8 = r7
                    r3 = r9
                    r4 = r2
                    goto L2d
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r9) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    r3 = r0[r7]
                    r6 = r8
                    r8 = r7
                    r7 = r3
                    r3 = r6
                L2d:
                    int r3 = r3 + r7
                    int r7 = r3 + 1
                    int r8 = r8 + 1
                    r3 = r4
                    r6 = r8
                    r8 = r7
                    r7 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.safaricom.sharedui.compose.confirmation.AdditionalInfoType.AccessFee.Creator.c(int, byte, short, java.lang.Object[]):void");
            }

            private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
                char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(ShareDataUIState ^ 6728534956745174161L, cArr, i);
                iTrustedWebActivityServiceDefault.copydefault = 4;
                while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
                    int i3 = $11 + 7;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
                    int i5 = iTrustedWebActivityServiceDefault.copydefault;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(ShareDataUIState)};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 7033, Color.blue(0) + 34, (char) (63488 - AndroidCharacter.getMirror('0')), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        try {
                            Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                            if (objCopydefault2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 1390, 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 51269), -1883291598, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objCopydefault2).invoke(null, objArr3);
                            int i6 = $10 + 121;
                            $11 = i6 % 128;
                            int i7 = i6 % 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
            }

            @Override
            public AccessFee[] newArray(int i) throws Throwable {
                Object[] objArr;
                char c2;
                int i2 = 2 % 2;
                AccessFee[] accessFeeArrNewArray = newArray(i);
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
                if (objCopydefault == null) {
                    int iLastIndexOf = 1114 - TextUtils.lastIndexOf("", '0', 0);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 22;
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    byte[] bArr = $$a;
                    byte b2 = (byte) (-bArr[14]);
                    byte b3 = (byte) (-bArr[15]);
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, fadingEdgeLength, tapTimeout, -1308762862, false, (String) objArr2[0], null);
                }
                long j = ((Field) objCopydefault).getLong(null);
                Object[] objArr3 = new Object[1];
                b(KeyEvent.keyCodeFromString(""), new char[]{54190, 49242, 62538, 15372, 54223, 55780, 51086, 28942, 46209, 16675, 28366, 34962, 7489, 10361, 63044, 10159, 58903, 36793, 40286, 48985, 20163, 30409, 9350, 54803, 55181, 56865}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, new char[]{36751, 35216, 33374, 31156, 36842, 36908, 45471, 13492, 59580, 2277, 6362, 52566, 16746, 24993, 32786, 25136, 47654, 50797, 60251}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
                if (objCopydefault2 == null) {
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1115;
                    int mode = View.MeasureSpec.getMode(0) + 22;
                    char c3 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[31];
                    byte b5 = bArr2[15];
                    Object[] objArr5 = new Object[1];
                    a(b4, (byte) (b5 + 1), (byte) (-b5), objArr5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, mode, c3, -206681338, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i3 = component1 + 73;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
                    if (objCopydefault3 == null) {
                        int scrollDefaultDelay2 = 1115 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 22;
                        char c4 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte[] bArr3 = $$a;
                        byte b6 = (byte) (bArr3[15] + 1);
                        byte b7 = bArr3[4];
                        Object[] objArr6 = new Object[1];
                        a(b6, b7, (byte) (b7 - 2), objArr6);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay2, tapTimeout2, c4, 44744436, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
                    int i5 = ((int[]) objArr7[2])[0];
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, new int[]{i5}, (String[]) objArr7[3]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int i6 = (-653108658) + ((~(116649375 | elapsedCpuTime)) * (-301)) + (((~((-80923926) | elapsedCpuTime)) | (~((~elapsedCpuTime) | 112273562))) * (-301)) + (((~(elapsedCpuTime | (-112273563))) | (-80923926)) * 301) + 552329636;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                    c2 = 2;
                } else {
                    try {
                        Object[] objArr8 = {Integer.valueOf(i), 552329636};
                        byte[] bArr4 = $$d;
                        byte b8 = bArr4[12];
                        byte b9 = b8;
                        Object[] objArr9 = new Object[1];
                        c(b8, b9, b9, objArr9);
                        Class<?> cls2 = Class.forName((String) objArr9[0]);
                        byte b10 = bArr4[25];
                        Object[] objArr10 = new Object[1];
                        c(b10, bArr4[12], b10, objArr10);
                        objArr = (Object[]) cls2.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
                        if (objCopydefault4 == null) {
                            int i9 = 1116 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            int iMakeMeasureSpec = 22 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            byte[] bArr5 = $$a;
                            byte b11 = (byte) (bArr5[15] + 1);
                            byte b12 = bArr5[4];
                            Object[] objArr11 = new Object[1];
                            a(b11, b12, (byte) (b12 - 2), objArr11);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i9, iMakeMeasureSpec, cResolveOpacity, 44744436, false, (String) objArr11[0], null);
                        }
                        ((Field) objCopydefault4).set(null, objArr);
                        try {
                            Object[] objArr12 = new Object[1];
                            b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), new char[]{54190, 49242, 62538, 15372, 54223, 55780, 51086, 28942, 46209, 16675, 28366, 34962, 7489, 10361, 63044, 10159, 58903, 36793, 40286, 48985, 20163, 30409, 9350, 54803, 55181, 56865}, objArr12);
                            Class<?> cls3 = Class.forName((String) objArr12[0]);
                            Object[] objArr13 = new Object[1];
                            b(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{36751, 35216, 33374, 31156, 36842, 36908, 45471, 13492, 59580, 2277, 6362, 52566, 16746, 24993, 32786, 25136, 47654, 50797, 60251}, objArr13);
                            long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
                            if (objCopydefault5 == null) {
                                int i10 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1115;
                                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 22;
                                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                byte[] bArr6 = $$a;
                                byte b13 = bArr6[31];
                                byte b14 = bArr6[15];
                                Object[] objArr14 = new Object[1];
                                a(b13, (byte) (b14 + 1), (byte) (-b14), objArr14);
                                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i10, threadPriority, minimumFlingVelocity, -206681338, false, (String) objArr14[0], null);
                            }
                            ((Field) objCopydefault5).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
                            if (objCopydefault6 == null) {
                                int i11 = 1116 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                                char tapTimeout3 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                byte[] bArr7 = $$a;
                                byte b15 = (byte) (-bArr7[14]);
                                byte b16 = (byte) (-bArr7[15]);
                                Object[] objArr15 = new Object[1];
                                a(b15, b16, b16, objArr15);
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i11, jumpTapTimeout, tapTimeout3, -1308762862, false, (String) objArr15[0], null);
                            }
                            ((Field) objCopydefault6).set(null, lValueOf2);
                            int i12 = copydefault + 61;
                            int i13 = i12 % 128;
                            component1 = i13;
                            c2 = 2;
                            int i14 = i12 % 2;
                            int i15 = i13 + 53;
                            copydefault = i15 % 128;
                            int i16 = i15 % 2;
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
                int i17 = ((int[]) objArr[1])[0];
                int i18 = ((int[]) objArr[c2])[0];
                if (i18 == i17) {
                    Object[] objArr16 = new Object[4];
                    objArr16[0] = new int[1];
                    objArr16[1] = new int[]{i};
                    objArr16[c2] = new int[]{i};
                    int i19 = ((int[]) objArr[0])[0];
                    int i20 = ((int[]) objArr[c2])[0];
                    int i21 = ((int[]) objArr[1])[0];
                    objArr16[3] = (String[]) objArr[3];
                    int iMyPid = Process.myPid();
                    int i22 = ~iMyPid;
                    int i23 = i19 + (-1367590673) + ((4292610 | i22) * (-192)) + (((~((-96354158) | i22)) | 92550720) * (-384)) + (((~(iMyPid | 100646767)) | (~(i22 | (-3803438))) | (~((-92550721) | iMyPid))) * BERTags.PRIVATE);
                    int i24 = (i23 << 13) ^ i23;
                    int i25 = i24 ^ (i24 >>> 17);
                    ((int[]) objArr16[0])[0] = i25 ^ (i25 << 5);
                    int i26 = ((int[]) objArr16[0])[0];
                    int i27 = ((int[]) objArr16[2])[0];
                    Object[] objArr17 = {new int[1], new int[]{((int[]) objArr16[1])[0]}, new int[]{i27}, (String[]) objArr16[3]};
                    int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                    int i28 = ~elapsedCpuTime2;
                    int i29 = 1030961765 + (((~(30186308 | i28)) | 137576491) * (-1188));
                    int i30 = (~(elapsedCpuTime2 | (-30186309))) | 137576491;
                    int i31 = ~(163011179 | i28);
                    int i32 = i26 + i29 + ((i30 | i31) * 594) + (((~((-30186309) | i28)) | 4751620 | i31) * 594);
                    int i33 = (i32 << 13) ^ i32;
                    int i34 = i33 ^ (i33 >>> 17);
                    ((int[]) objArr17[0])[0] = i34 ^ (i34 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[3];
                    if (strArr != null) {
                        int i35 = copydefault + 3;
                        component1 = i35 % 128;
                        int i36 = i35 % 2;
                        int i37 = 0;
                        while (i37 < strArr.length) {
                            arrayList.add(strArr[i37]);
                            i37++;
                            int i38 = component1 + 93;
                            copydefault = i38 % 128;
                            int i39 = i38 % 2;
                        }
                    }
                    long j2 = -1;
                    long j3 = ((long) (i17 ^ i18)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
                    long j4 = 0;
                    long j5 = j3 | (((long) 6) << 32) | (j4 - ((j4 >> 63) << 32));
                    try {
                        Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault7 == null) {
                            objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 6618, 42 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                        Object[] objArr18 = {-376230964, Long.valueOf(j5), arrayList, null, false, false};
                        Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault8 == null) {
                            objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6562 - ExpandableListView.getPackedPositionType(0L), TextUtils.getOffsetAfter("", 0) + 56, (char) KeyEvent.keyCodeFromString(""), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault8).invoke(objInvoke, objArr18);
                        int i40 = ((int[]) objArr[0])[0];
                        int i41 = ((int[]) objArr[2])[0];
                        Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{i41}, (String[]) objArr[3]};
                        int iNextInt = new Random().nextInt(649994117);
                        int i42 = i40 + (((~((-152294930) | iNextInt)) | 151240705) * (-283)) + 44644042 + ((~(iNextInt | (-1054225))) * 283);
                        int i43 = (i42 << 13) ^ i42;
                        int i44 = i43 ^ (i43 >>> 17);
                        ((int[]) objArr19[0])[0] = i44 ^ (i44 << 5);
                        Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
                        int i45 = ((int[]) objArr19[0])[0];
                        int i46 = ((int[]) objArr19[2])[0];
                        Object[] objArr20 = {new int[1], new int[]{((int[]) objArr19[1])[0]}, new int[]{i46}, (String[]) objArr19[3]};
                        int iNextInt2 = new Random().nextInt();
                        int i47 = i45 + (-1856434655) + (((~iNextInt2) | (-192673168)) * 1444) + (((~(iNextInt2 | 41374867)) | (~(151822620 | iNextInt2)) | (-192935328)) * (-1444)) + 1671073102;
                        int i48 = (i47 << 13) ^ i47;
                        int i49 = i48 ^ (i48 >>> 17);
                        ((int[]) objArr20[0])[0] = i49 ^ (i49 << 5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                }
                return accessFeeArrNewArray;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AccessFee createFromParcel(Parcel parcel) {
                boolean z;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                double d2 = parcel.readDouble();
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i2 = copydefault + 23;
                    int i3 = i2 % 128;
                    component1 = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 89;
                    copydefault = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 3 / 4;
                    }
                    z = true;
                } else {
                    z = false;
                }
                return new AccessFee(d2, string, z);
            }

            @Override
            public AccessFee createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 41;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                AccessFee accessFeeCreateFromParcel = createFromParcel(parcel);
                int i4 = component1 + 75;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 78 / 0;
                }
                return accessFeeCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AccessFee[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 73;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                AccessFee[] accessFeeArr = new AccessFee[i];
                int i6 = i3 + 93;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return accessFeeArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccessFee(double d2, String str, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.accessFee = d2;
            this.currency = str;
            this.isCurrencyAllCaps = z;
        }

        public AccessFee(double d2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(d2, str, (i & 4) != 0 ? true : z);
        }

        public final double getAccessFee() {
            return this.accessFee;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final boolean isCurrencyAllCaps() {
            return this.isCurrencyAllCaps;
        }

        public int hashCode() throws Throwable {
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 67, 33 - Color.alpha(0), (char) (19696 - TextUtils.getTrimmedLength("")), 518907119, false, "component3", null);
            }
            int i = ((Field) objCopydefault).getInt(null);
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 30, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 55511118, false, "component2", null);
            }
            int i2 = ((Field) objCopydefault2).getInt(null);
            long j = i2;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - ExpandableListView.getPackedPositionType(0L), 30 - View.resolveSize(0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 58536393, false, "component3", null);
            }
            int i3 = ((Field) objCopydefault3).getInt(null);
            long j2 = -949;
            long j3 = -1;
            long jIdentityHashCode = System.identityHashCode(this);
            long j4 = jIdentityHashCode ^ j3;
            long j5 = (j2 * 4057780256237536857L) + (j2 * (-3265076802593332433L)) + (((long) 1900) * ((((j3 ^ (-3265076802593332433L)) | j4) ^ j3) | (((j3 ^ 4057780256237536857L) | jIdentityHashCode) ^ j3))) + (((long) (-950)) * (((j4 | 4057780256237536857L) ^ j3) | ((jIdentityHashCode | (-3265076802593332433L)) ^ j3))) + (((long) 950) * (((j4 | (-3265076802593332433L)) ^ j3) | ((jIdentityHashCode | 4057780256237536857L) ^ j3)));
            int i4 = 0;
            while (true) {
                for (int i5 = 0; i5 != 8; i5++) {
                    i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                }
                if (i4 != 0) {
                    break;
                }
                i4++;
                j = j5;
            }
            if (i3 != i) {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 67, (ViewConfiguration.getTouchSlop() >> 8) + 33, (char) (19695 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1457147715, false, "copydefault", null);
                }
                Object obj = ((Field) objCopydefault4).get(null);
                long j6 = -1;
                long j7 = 0;
                long j8 = (((long) (i2 ^ i)) & ((((long) 0) << 32) | (j6 - ((j6 >> 63) << 32)))) | (((long) 1) << 32) | (j7 - ((j7 >> 63) << 32));
                try {
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault5 == null) {
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 6570, 42 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                    Object[] objArr = {867963546, Long.valueOf(j8), obj, null, false, false};
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                    if (objCopydefault6 == null) {
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - KeyEvent.keyCodeFromString(""), 56 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objCopydefault6).invoke(objInvoke, objArr);
                    throw new RuntimeException(String.valueOf(i2));
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            return (((Double.hashCode(this.accessFee) * 31) + this.currency.hashCode()) * 31) + Boolean.hashCode(this.isCurrencyAllCaps);
        }

        public static AccessFee copy$default(AccessFee accessFee, double d2, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                d2 = accessFee.accessFee;
            }
            if ((i & 2) != 0) {
                str = accessFee.currency;
            }
            if ((i & 4) != 0) {
                z = accessFee.isCurrencyAllCaps;
            }
            return accessFee.copy(d2, str, z);
        }

        public final double getAccessFee() {
            return this.accessFee;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final boolean getIsCurrencyAllCaps() {
            return this.isCurrencyAllCaps;
        }

        public final AccessFee copy(double accessFee, String currency, boolean isCurrencyAllCaps) {
            Intrinsics.checkNotNullParameter(currency, "");
            return new AccessFee(accessFee, currency, isCurrencyAllCaps);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccessFee)) {
                return false;
            }
            AccessFee accessFee = (AccessFee) other;
            return Double.compare(this.accessFee, accessFee.accessFee) == 0 && Intrinsics.areEqual(this.currency, accessFee.currency) && this.isCurrencyAllCaps == accessFee.isCurrencyAllCaps;
        }

        public String toString() {
            return "AccessFee(accessFee=" + this.accessFee + ", currency=" + this.currency + ", isCurrencyAllCaps=" + this.isCurrencyAllCaps + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeDouble(this.accessFee);
            dest.writeString(this.currency);
            dest.writeInt(this.isCurrencyAllCaps ? 1 : 0);
        }
    }

    private AdditionalInfoType() {
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0006H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0006H×\u0001J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006H\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$Info;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType;", "label", "Lcom/safaricom/consumer/commons/util/TextResource;", "value", "valueFont", "", "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/Integer;)V", "getLabel", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getValue", "getValueFont", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/Integer;)Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$Info;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Info extends AdditionalInfoType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Info> CREATOR = new Creator();
        private final TextResource label;
        private final TextResource value;
        private final Integer valueFont;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Info> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Info createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Info((TextResource) parcel.readParcelable(Info.class.getClassLoader()), (TextResource) parcel.readParcelable(Info.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Info[] newArray(int i) {
                return new Info[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public Info(TextResource textResource, TextResource textResource2, Integer num) {
            super(null);
            this.label = textResource;
            this.value = textResource2;
            this.valueFont = num;
        }

        public Info(TextResource textResource, TextResource textResource2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : textResource, (i & 2) != 0 ? null : textResource2, num);
        }

        public final TextResource getLabel() {
            return this.label;
        }

        public final TextResource getValue() {
            return this.value;
        }

        public final Integer getValueFont() {
            return this.valueFont;
        }

        public static Info copy$default(Info info, TextResource textResource, TextResource textResource2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                textResource = info.label;
            }
            if ((i & 2) != 0) {
                textResource2 = info.value;
            }
            if ((i & 4) != 0) {
                num = info.valueFont;
            }
            return info.copy(textResource, textResource2, num);
        }

        public final TextResource getLabel() {
            return this.label;
        }

        public final TextResource getValue() {
            return this.value;
        }

        public final Integer getValueFont() {
            return this.valueFont;
        }

        public final Info copy(TextResource label, TextResource value, Integer valueFont) {
            return new Info(label, value, valueFont);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return Intrinsics.areEqual(this.label, info.label) && Intrinsics.areEqual(this.value, info.value) && Intrinsics.areEqual(this.valueFont, info.valueFont);
        }

        public int hashCode() {
            TextResource textResource = this.label;
            int iHashCode = textResource == null ? 0 : textResource.hashCode();
            TextResource textResource2 = this.value;
            int iHashCode2 = textResource2 == null ? 0 : textResource2.hashCode();
            Integer num = this.valueFont;
            return (((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Info(label=" + this.label + ", value=" + this.value + ", valueFont=" + this.valueFont + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeParcelable(this.label, flags);
            dest.writeParcelable(this.value, flags);
            Integer num = this.valueFont;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
        }
    }

    public AdditionalInfoType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÇ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0016H×\u0001J\t\u0010\u001b\u001a\u00020\u0007H×\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\r¨\u0006!"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$Fee;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType;", "feeValue", "", "isCommission", "", "currency", "", "isCurrencyAllCaps", "<init>", "(DZLjava/lang/String;Z)V", "getFeeValue", "()D", "()Z", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Fee extends AdditionalInfoType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Fee> CREATOR = new Creator();
        private final String currency;
        private final double feeValue;
        private final boolean isCommission;
        private final boolean isCurrencyAllCaps;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Fee> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Fee createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Fee(parcel.readDouble(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Fee[] newArray(int i) {
                return new Fee[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fee(double d2, boolean z, String str, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.feeValue = d2;
            this.isCommission = z;
            this.currency = str;
            this.isCurrencyAllCaps = z2;
        }

        public Fee(double d2, boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(d2, (i & 2) != 0 ? false : z, str, (i & 8) != 0 ? true : z2);
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final double getFeeValue() {
            return this.feeValue;
        }

        public final boolean isCommission() {
            return this.isCommission;
        }

        public final boolean isCurrencyAllCaps() {
            return this.isCurrencyAllCaps;
        }

        public static Fee copy$default(Fee fee, double d2, boolean z, String str, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                d2 = fee.feeValue;
            }
            double d3 = d2;
            if ((i & 2) != 0) {
                z = fee.isCommission;
            }
            boolean z3 = z;
            if ((i & 4) != 0) {
                str = fee.currency;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                z2 = fee.isCurrencyAllCaps;
            }
            return fee.copy(d3, z3, str2, z2);
        }

        public final double getFeeValue() {
            return this.feeValue;
        }

        public final boolean getIsCommission() {
            return this.isCommission;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final boolean getIsCurrencyAllCaps() {
            return this.isCurrencyAllCaps;
        }

        public final Fee copy(double feeValue, boolean isCommission, String currency, boolean isCurrencyAllCaps) {
            Intrinsics.checkNotNullParameter(currency, "");
            return new Fee(feeValue, isCommission, currency, isCurrencyAllCaps);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Fee)) {
                return false;
            }
            Fee fee = (Fee) other;
            return Double.compare(this.feeValue, fee.feeValue) == 0 && this.isCommission == fee.isCommission && Intrinsics.areEqual(this.currency, fee.currency) && this.isCurrencyAllCaps == fee.isCurrencyAllCaps;
        }

        public int hashCode() {
            return (((((Double.hashCode(this.feeValue) * 31) + Boolean.hashCode(this.isCommission)) * 31) + this.currency.hashCode()) * 31) + Boolean.hashCode(this.isCurrencyAllCaps);
        }

        public String toString() {
            return "Fee(feeValue=" + this.feeValue + ", isCommission=" + this.isCommission + ", currency=" + this.currency + ", isCurrencyAllCaps=" + this.isCurrencyAllCaps + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeDouble(this.feeValue);
            dest.writeInt(this.isCommission ? 1 : 0);
            dest.writeString(this.currency);
            dest.writeInt(this.isCurrencyAllCaps ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eH\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$Hint;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType;", "label", "Lcom/safaricom/consumer/commons/util/TextResource;", "value", "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;)V", "getLabel", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Hint extends AdditionalInfoType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Hint> CREATOR = new Creator();
        private final TextResource label;
        private final TextResource value;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Hint> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Hint createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Hint((TextResource) parcel.readParcelable(Hint.class.getClassLoader()), (TextResource) parcel.readParcelable(Hint.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Hint[] newArray(int i) {
                return new Hint[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public Hint(TextResource textResource, TextResource textResource2) {
            super(null);
            this.label = textResource;
            this.value = textResource2;
        }

        public Hint(TextResource textResource, TextResource textResource2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : textResource, (i & 2) != 0 ? null : textResource2);
        }

        public final TextResource getLabel() {
            return this.label;
        }

        public final TextResource getValue() {
            return this.value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Hint() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static Hint copy$default(Hint hint, TextResource textResource, TextResource textResource2, int i, Object obj) {
            if ((i & 1) != 0) {
                textResource = hint.label;
            }
            if ((i & 2) != 0) {
                textResource2 = hint.value;
            }
            return hint.copy(textResource, textResource2);
        }

        public final TextResource getLabel() {
            return this.label;
        }

        public final TextResource getValue() {
            return this.value;
        }

        public final Hint copy(TextResource label, TextResource value) {
            return new Hint(label, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hint)) {
                return false;
            }
            Hint hint = (Hint) other;
            return Intrinsics.areEqual(this.label, hint.label) && Intrinsics.areEqual(this.value, hint.value);
        }

        public int hashCode() {
            TextResource textResource = this.label;
            int iHashCode = textResource == null ? 0 : textResource.hashCode();
            TextResource textResource2 = this.value;
            return (iHashCode * 31) + (textResource2 != null ? textResource2.hashCode() : 0);
        }

        public String toString() {
            return "Hint(label=" + this.label + ", value=" + this.value + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeParcelable(this.label, flags);
            dest.writeParcelable(this.value, flags);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$ExchangeRate;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType;", "value", "Lcom/safaricom/consumer/commons/util/TextResource;", "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;)V", "getValue", "()Lcom/safaricom/consumer/commons/util/TextResource;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ExchangeRate extends AdditionalInfoType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ExchangeRate> CREATOR = new Creator();
        private final TextResource value;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ExchangeRate> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ExchangeRate createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ExchangeRate((TextResource) parcel.readParcelable(ExchangeRate.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ExchangeRate[] newArray(int i) {
                return new ExchangeRate[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExchangeRate(TextResource textResource) {
            super(null);
            Intrinsics.checkNotNullParameter(textResource, "");
            this.value = textResource;
        }

        public final TextResource getValue() {
            return this.value;
        }

        public static ExchangeRate copy$default(ExchangeRate exchangeRate, TextResource textResource, int i, Object obj) {
            if ((i & 1) != 0) {
                textResource = exchangeRate.value;
            }
            return exchangeRate.copy(textResource);
        }

        public final TextResource getValue() {
            return this.value;
        }

        public final ExchangeRate copy(TextResource value) {
            Intrinsics.checkNotNullParameter(value, "");
            return new ExchangeRate(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExchangeRate) && Intrinsics.areEqual(this.value, ((ExchangeRate) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "ExchangeRate(value=" + this.value + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeParcelable(this.value, flags);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$CountryState;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType;", "label", "Lcom/safaricom/consumer/commons/util/TextResource;", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;)V", "getLabel", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getState", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CountryState extends AdditionalInfoType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<CountryState> CREATOR = new Creator();
        private final TextResource label;
        private final TextResource state;

        @Override
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CountryState(TextResource textResource, TextResource textResource2) {
            super(null);
            Intrinsics.checkNotNullParameter(textResource, "");
            Intrinsics.checkNotNullParameter(textResource2, "");
            this.label = textResource;
            this.state = textResource2;
        }

        public final TextResource getLabel() {
            return this.label;
        }

        public final TextResource getState() {
            return this.state;
        }

        public static CountryState copy$default(CountryState countryState, TextResource textResource, TextResource textResource2, int i, Object obj) {
            if ((i & 1) != 0) {
                textResource = countryState.label;
            }
            if ((i & 2) != 0) {
                textResource2 = countryState.state;
            }
            return countryState.copy(textResource, textResource2);
        }

        public final TextResource getLabel() {
            return this.label;
        }

        public final TextResource getState() {
            return this.state;
        }

        public final CountryState copy(TextResource label, TextResource state) {
            Intrinsics.checkNotNullParameter(label, "");
            Intrinsics.checkNotNullParameter(state, "");
            return new CountryState(label, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountryState)) {
                return false;
            }
            CountryState countryState = (CountryState) other;
            return Intrinsics.areEqual(this.label, countryState.label) && Intrinsics.areEqual(this.state, countryState.state);
        }

        public int hashCode() {
            return (this.label.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            return "CountryState(label=" + this.label + ", state=" + this.state + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeParcelable(this.label, flags);
            dest.writeParcelable(this.state, flags);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CountryState> {
            private static final byte[] $$c = {TarHeader.LF_NORMAL, -42, 66, -37};
            private static final int $$d = 52;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {4, -66, -36, 8, 6, -5, 3};
            private static final int $$b = 150;
            private static int component3 = 0;
            private static int component2 = 1;
            private static char[] ShareDataUIState = {33517, 33467, 33459, 33460, 33467, 33462, 33457, 33457, 33414, 33413, 33460, 33465, 33464, 33457, 33460, 33468, 33419, 33412, 33457, 33510, 33460, 33465, 33464, 33457, 33460, 33468, 33419, 33412, 33455, 33413, 33417, 33461, 33460, 33457, 33457, 33466, 33459, 33516, 33457, 33460, 33468, 33419, 33510, 33423, 33454, 33425, 33430, 33465, 33459, 33455, 33460, 33462, 33464, 33469, 33304, 33299, 33300, 33395, 33397, 33298, 33291, 33292, 33299, 33301, 33293, 33301, 33301, 33291, 33301, 33308, 33306, 33299, 33390, 33389, 33288, 33288, 33389, 33393, 33302, 33299, 33294, 33301, 33302, 33393, 33397, 33306, 33307, 33299, 33296, 33395, 33389, 33291, 33301, 33430, 33357, 33358, 33411, 33379, 33381, 33387, 33381, 33380, 33384, 33347, 33405, 33307, 33308, 33379, 33347, 33403, 33302, 33302, 33403, 33407, 33380, 33377, 33308, 33379, 33380, 33407, 33346, 33311, 33305, 33379, 33386, 33384, 33386, 33413, 33517, 33460, 33455, 33462, 33463, 33426, 33430, 33467, 33468, 33460, 33457, 33428, 33422, 33452, 33462, 33469, 33465, 33460, 33461, 33428, 33422, 33452, 33462, 33469, 33465, 33460, 33461, 33468, 33464, 33457, 33425, 33422, 33449, 33449, 33422, 33426};

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$e(int r5, byte r6, short r7) {
                /*
                    int r5 = r5 * 2
                    int r5 = r5 + 4
                    byte[] r0 = com.safaricom.sharedui.compose.confirmation.AdditionalInfoType.CountryState.Creator.$$c
                    int r6 = r6 + 110
                    int r7 = r7 * 4
                    int r1 = 1 - r7
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r0 != 0) goto L16
                    r4 = r7
                    r3 = r2
                    goto L26
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r7) goto L22
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L22:
                    r4 = r0[r5]
                    int r3 = r3 + 1
                L26:
                    int r6 = r6 + r4
                    int r5 = r5 + 1
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.safaricom.sharedui.compose.confirmation.AdditionalInfoType.CountryState.Creator.$$e(int, byte, short):java.lang.String");
            }

            private static void b(int i, byte b2, byte b3, Object[] objArr) {
                int i2 = b3 * 2;
                byte[] bArr = $$a;
                int i3 = 3 - (b2 * 3);
                int i4 = 99 - (i * 3);
                byte[] bArr2 = new byte[i2 + 4];
                int i5 = i2 + 3;
                int i6 = -1;
                if (bArr == null) {
                    i4 = i3 + i4 + 6;
                    i3 = i3;
                    i6 = -1;
                }
                while (true) {
                    int i7 = i6 + 1;
                    int i8 = i3 + 1;
                    bArr2[i7] = (byte) i4;
                    if (i7 == i5) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    i4 = i4 + bArr[i8] + 6;
                    i3 = i8;
                    i6 = i7;
                }
            }

            private static void a(boolean z, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
                int i;
                int length;
                char[] cArr;
                int i2;
                int i3 = 2;
                int i4 = 2 % 2;
                ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
                int i5 = iArr[0];
                int i6 = iArr[1];
                int i7 = iArr[2];
                int i8 = iArr[3];
                char[] cArr2 = ShareDataUIState;
                if (cArr2 != null) {
                    int i9 = $10 + 29;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        length = cArr2.length;
                        cArr = new char[length];
                        i2 = 1;
                    } else {
                        length = cArr2.length;
                        cArr = new char[length];
                        i2 = 0;
                    }
                    while (i2 < length) {
                        int i10 = $11 + 119;
                        $10 = i10 % 128;
                        if (i10 % i3 != 0) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                                if (objCopydefault == null) {
                                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(656 - MotionEvent.axisFromString(""), 14 - (Process.myPid() >> 22), (char) (65118 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                                }
                                cArr[i2] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                                i2--;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            try {
                                Object[] objArr3 = {Integer.valueOf(cArr2[i2])};
                                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                                if (objCopydefault2 == null) {
                                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(658 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 14 - (ViewConfiguration.getTouchSlop() >> 8), (char) (65118 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                                }
                                cArr[i2] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                                i2++;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        i3 = 2;
                    }
                    cArr2 = cArr;
                }
                char[] cArr3 = new char[i6];
                System.arraycopy(cArr2, i5, cArr3, 0, i6);
                if (bArr != null) {
                    int i11 = $10 + 123;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    char[] cArr4 = new char[i6];
                    iTrustedWebActivityService_Parcel.copydefault = 0;
                    int i13 = $11 + 117;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    char c2 = 0;
                    while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                        if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                            int i15 = $11 + 99;
                            $10 = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i16 = iTrustedWebActivityService_Parcel.copydefault;
                                Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                                if (objCopydefault3 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4502 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ImageFormat.getBitsPerPixel(0) + 37, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 27897), -1464227204, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i16] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                                int i17 = 95 / 0;
                            } else {
                                int i18 = iTrustedWebActivityService_Parcel.copydefault;
                                Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                                if (objCopydefault4 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4502 - View.resolveSize(0, 0), 36 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 27897), -1464227204, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i18] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            }
                        } else {
                            int i19 = iTrustedWebActivityService_Parcel.copydefault;
                            Object[] objArr6 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                            if (objCopydefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = (byte) (b6 + 5);
                                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 3580, 28 - TextUtils.indexOf("", "", 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1180380354, false, $$e(b6, b7, (byte) (b7 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i19] = ((Character) ((Method) objCopydefault5).invoke(null, objArr6)).charValue();
                        }
                        c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                        Object[] objArr7 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                        if (objCopydefault6 == null) {
                            int i20 = 1860 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 34;
                            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            byte length2 = (byte) $$c.length;
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i20, longPressTimeout, doubleTapTimeout, 80302927, false, $$e((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault6).invoke(null, objArr7);
                    }
                    cArr3 = cArr4;
                }
                if (i8 > 0) {
                    int i21 = $10 + 39;
                    $11 = i21 % 128;
                    int i22 = i21 % 2;
                    char[] cArr5 = new char[i6];
                    System.arraycopy(cArr3, 0, cArr5, 0, i6);
                    int i23 = i6 - i8;
                    System.arraycopy(cArr5, 0, cArr3, i23, i8);
                    System.arraycopy(cArr5, i8, cArr3, 0, i23);
                }
                if (z) {
                    char[] cArr6 = new char[i6];
                    iTrustedWebActivityService_Parcel.copydefault = 0;
                    while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                        int i24 = $11 + 39;
                        $10 = i24 % 128;
                        int i25 = i24 % 2;
                        cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i6 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                        iTrustedWebActivityService_Parcel.copydefault++;
                    }
                    cArr3 = cArr6;
                }
                if (i7 > 0) {
                    iTrustedWebActivityService_Parcel.copydefault = 0;
                    while (iTrustedWebActivityService_Parcel.copydefault < i6) {
                        int i26 = $11 + 53;
                        $10 = i26 % 128;
                        if (i26 % 2 != 0) {
                            cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] >>> iArr[2]);
                            i = iTrustedWebActivityService_Parcel.copydefault;
                        } else {
                            cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                            i = iTrustedWebActivityService_Parcel.copydefault + 1;
                        }
                        iTrustedWebActivityService_Parcel.copydefault = i;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CountryState createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                CountryState countryState = new CountryState((TextResource) parcel.readParcelable(CountryState.class.getClassLoader()), (TextResource) parcel.readParcelable(CountryState.class.getClassLoader()));
                int i2 = component3 + 119;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return countryState;
            }

            @Override
            public CountryState createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 75;
                component2 = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    createFromParcel(parcel);
                    obj.hashCode();
                    throw null;
                }
                CountryState countryStateCreateFromParcel = createFromParcel(parcel);
                int i3 = component3 + 5;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return countryStateCreateFromParcel;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CountryState[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 15;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                CountryState[] countryStateArr = new CountryState[i];
                int i6 = i4 + 115;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    return countryStateArr;
                }
                throw null;
            }

            @Override
            public CountryState[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 111;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                CountryState[] countryStateArrNewArray = newArray(i);
                int i5 = component3 + 85;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return countryStateArrNewArray;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(16:112|22|(1:24)|25|26|(4:107|27|28|29)|(2:31|(3:33|114|34))(5:39|109|40|41|(2:43|(10:45|46|104|57|58|(3:60|(1:62)(1:63)|64)(9:66|110|67|68|69|(1:71)|(4:108|73|(2:75|83)(5:76|105|77|78|79)|(1:90)(1:86))(0)|91|(1:93)(2:94|95))|65|(0)(0)|91|(0)(0))(3:47|48|(1:50)))(2:51|52))|56|104|57|58|(0)(0)|65|(0)(0)|91|(0)(0)) */
            /* JADX WARN: Removed duplicated region for block: B:108:0x030a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x02b7  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x02cf A[Catch: Exception -> 0x0390, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0390, blocks: (B:57:0x0290, B:66:0x02cf, B:68:0x02f3, B:88:0x0389, B:89:0x038f, B:67:0x02d9), top: B:104:0x0290, inners: #5 }] */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0390  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x04b2 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:94:0x04b3  */
            /* JADX WARN: Type inference failed for: r9v33 */
            /* JADX WARN: Type inference failed for: r9v41 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static java.lang.Object[] copydefault(int r25, int r26) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1330
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.safaricom.sharedui.compose.confirmation.AdditionalInfoType.CountryState.Creator.copydefault(int, int):java.lang.Object[]");
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0006H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0006H×\u0001J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$Warning;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType;", "label", "Lcom/safaricom/consumer/commons/util/TextResource;", "value", "valueFont", "", "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/Integer;)V", "getLabel", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getValue", "getValueFont", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/Integer;)Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType$Warning;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Warning extends AdditionalInfoType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Warning> CREATOR = new Creator();
        private final TextResource label;
        private final TextResource value;
        private final Integer valueFont;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Warning> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Warning createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Warning((TextResource) parcel.readParcelable(Warning.class.getClassLoader()), (TextResource) parcel.readParcelable(Warning.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Warning[] newArray(int i) {
                return new Warning[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Warning(TextResource textResource, TextResource textResource2, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(textResource, "");
            this.label = textResource;
            this.value = textResource2;
            this.valueFont = num;
        }

        public Warning(TextResource textResource, TextResource textResource2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, (i & 2) != 0 ? null : textResource2, num);
        }

        public final TextResource getLabel() {
            return this.label;
        }

        public final TextResource getValue() {
            return this.value;
        }

        public final Integer getValueFont() {
            return this.valueFont;
        }

        public static Warning copy$default(Warning warning, TextResource textResource, TextResource textResource2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                textResource = warning.label;
            }
            if ((i & 2) != 0) {
                textResource2 = warning.value;
            }
            if ((i & 4) != 0) {
                num = warning.valueFont;
            }
            return warning.copy(textResource, textResource2, num);
        }

        public final TextResource getLabel() {
            return this.label;
        }

        public final TextResource getValue() {
            return this.value;
        }

        public final Integer getValueFont() {
            return this.valueFont;
        }

        public final Warning copy(TextResource label, TextResource value, Integer valueFont) {
            Intrinsics.checkNotNullParameter(label, "");
            return new Warning(label, value, valueFont);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Warning)) {
                return false;
            }
            Warning warning = (Warning) other;
            return Intrinsics.areEqual(this.label, warning.label) && Intrinsics.areEqual(this.value, warning.value) && Intrinsics.areEqual(this.valueFont, warning.valueFont);
        }

        public int hashCode() {
            int iHashCode = this.label.hashCode();
            TextResource textResource = this.value;
            int iHashCode2 = textResource == null ? 0 : textResource.hashCode();
            Integer num = this.valueFont;
            return (((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Warning(label=" + this.label + ", value=" + this.value + ", valueFont=" + this.valueFont + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeParcelable(this.label, flags);
            dest.writeParcelable(this.value, flags);
            Integer num = this.valueFont;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
        }
    }
}
