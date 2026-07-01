package com.safaricom.designsystem.helpers;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.getSmallIconId;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/safaricom/designsystem/helpers/DisableRippleInteraction;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "<init>", "()V", "interactions", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/foundation/interaction/Interaction;", "getInteractions", "()Lkotlinx/coroutines/flow/Flow;", "emit", "", "interaction", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryEmit", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DisableRippleInteraction implements MutableInteractionSource {
    public static final int $stable = 0;
    public static final DisableRippleInteraction INSTANCE;
    private static int ShareDataUIState;
    private static byte[] component1;
    private static int component2;
    private static final Flow<Interaction> component3;
    private static int component4;
    private static int copydefault;
    private static short[] getRequestBeneficiariesState;
    private static final byte[] $$c = {94, -43, -105, 125};
    private static final int $$d = 252;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {10, 80, 9, 70, 38, Ascii.CAN, Ascii.GS, Ascii.EM, Ascii.EM, 17, 35, 32, -39};
    private static final int $$b = 17;
    private static int equals = 0;
    private static int copy = 1;
    private static int getAsAtTimestamp = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r5, byte r6, short r7) {
        /*
            int r5 = r5 * 2
            int r5 = 4 - r5
            int r7 = 116 - r7
            byte[] r0 = com.safaricom.designsystem.helpers.DisableRippleInteraction.$$c
            int r6 = r6 * 3
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r5]
        L24:
            int r4 = -r4
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.helpers.DisableRippleInteraction.$$e(int, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.safaricom.designsystem.helpers.DisableRippleInteraction.$$a
            int r7 = r7 * 4
            int r7 = 99 - r7
            int r5 = r5 * 2
            int r1 = r5 + 10
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r5 = r5 + 9
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
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
            int r7 = r7 + r4
            int r7 = r7 + (-26)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.helpers.DisableRippleInteraction.b(short, byte, short, java.lang.Object[]):void");
    }

    private DisableRippleInteraction() {
    }

    static {
        component4 = 1;
        component1();
        INSTANCE = new DisableRippleInteraction();
        component3 = FlowKt.emptyFlow();
        int i = getAsAtTimestamp + 41;
        component4 = i % 128;
        int i2 = i % 2;
    }

    private static void a(short s, byte b2, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(ShareDataUIState)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 999, (-16777185) - Color.rgb(0, 0, 0), (char) (61685 - TextUtils.indexOf("", "")), 1874745193, false, $$e(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                byte[] bArr = component1;
                char c2 = '0';
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $10 + 15;
                        $11 = i9 % 128;
                        int i10 = i9 % i5;
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2984 - (ViewConfiguration.getTouchSlop() >> 8), 48 - View.MeasureSpec.getSize(0), (char) (54461 - TextUtils.indexOf("", c2, 0)), -1178636483, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i8++;
                        int i11 = $10 + 31;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        i5 = 2;
                        c2 = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = component1;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(copydefault)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32, (char) (61685 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1874745193, false, $$e(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                    int i13 = $10 + 19;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) getRequestBeneficiariesState[i + ((int) (((long) copydefault) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                }
            } else {
                j = 7083766810336261929L;
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) copydefault) ^ j)) + i7;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component2), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    byte b9 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 1697, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36, (char) Color.green(0), -1454191902, false, $$e(b9, b9, (byte) $$c.length), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component1;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i15 = 0; i15 < length2; i15++) {
                        bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i16 = $10 + 87;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    z = true;
                } else {
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        int i18 = $11 + 33;
                        $10 = i18 % 128;
                        if (i18 % 2 != 0) {
                            byte[] bArr6 = component1;
                            getsmalliconid.copydefault = getsmalliconid.copydefault << 1;
                            i4 = getsmalliconid.component3 * (((byte) (((byte) (((long) bArr6[r8]) / 7083766810336261929L)) << s)) ^ b2);
                        } else {
                            byte[] bArr7 = component1;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            i4 = getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r8]) ^ 7083766810336261929L)) + s)) ^ b2);
                        }
                        getsmalliconid.component1 = (char) i4;
                    } else {
                        short[] sArr = getRequestBeneficiariesState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override
    public Flow<Interaction> getInteractions() throws Throwable {
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        long j = 0;
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32, (char) (19696 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 520092524, false, "component2", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a((short) ((-16777216) - Color.rgb(0, 0, 0)), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1727216682, (-11) - TextUtils.indexOf("", "", 0), (-2128149713) - TextUtils.getOffsetAfter("", 0), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a((short) TextUtils.getOffsetBefore("", 0), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (-1727216661) - ((Process.getThreadPriority(0) + 20) >> 6), (Process.myPid() >> 22) - 18, (-2128149710) - TextUtils.lastIndexOf("", '0', 0), objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j2 = 530;
        long j3 = ((long) 1058) + (j2 * 1697263141679391519L) + (j2 * 2758459954927118806L);
        long j4 = 529;
        long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
        long j5 = -1;
        long j6 = j3 + (((((jFreeMemory ^ j5) | 1697263141679391519L) ^ j5) | (4021125094628387807L ^ j5)) * j4) + (j4 * ((j5 ^ 2758459954927118806L) | ((jFreeMemory | 1697263141679391519L) ^ j5)));
        int i3 = 0;
        while (true) {
            if (i3 == 10) {
                Object[] objArr3 = new Object[1];
                a((short) (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 1727216647, View.resolveSizeAndState(0, 0, 0) - 17, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 2128149704, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a((short) Color.alpha(0), (byte) (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1727216633, (-18) - TextUtils.indexOf((CharSequence) "", '0'), (-2128149705) - ((Process.getThreadPriority(0) + 20) >> 6), objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {860746163};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 1663, KeyEvent.normalizeMetaState(0) + 10, (char) Drawable.resolveOpacity(0, 0), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1141240350, ((Constructor) objCopydefault2).newInstance(objArr5), false};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault3 == null) {
                        int i4 = 1455 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int i5 = 23 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        Object[] objArr7 = new Object[1];
                        b(b2, b3, (byte) (b3 + 1), objArr7);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i4, i5, cKeyCodeFromString, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 1592, 39 - View.resolveSizeAndState(0, 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objCopydefault3).invoke(null, objArr6);
                    int i6 = ((int[]) objArr8[2])[0];
                    int i7 = ((int[]) objArr8[1])[0];
                    if (i7 != i6) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[3];
                        if (strArr != null) {
                            int i8 = copy + 87;
                            equals = i8 % 128;
                            int i9 = i8 % 2;
                            int i10 = 0;
                            while (i10 < strArr.length) {
                                int i11 = copy + 25;
                                equals = i11 % 128;
                                if (i11 % 2 != 0) {
                                    arrayList.add(strArr[i10]);
                                    i10 += 44;
                                } else {
                                    arrayList.add(strArr[i10]);
                                    i10++;
                                }
                            }
                        }
                        long j7 = -1;
                        long j8 = 0;
                        long j9 = (((j7 - ((j7 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i7 ^ i6))) | (((long) 1) << 32) | (j8 - ((j8 >> 63) << 32));
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault4 == null) {
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6617 - ImageFormat.getBitsPerPixel(0), 41 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault4).invoke(null, null);
                        Object[] objArr9 = {860746163, Long.valueOf(j9), arrayList, null, false, false};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 55 - TextUtils.indexOf((CharSequence) "", '0'), (char) KeyEvent.normalizeMetaState(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault5).invoke(objInvoke, objArr9);
                        int[] iArr = new int[i7];
                        int i12 = i7 - 1;
                        iArr[i12] = 1;
                        Toast.makeText((Context) null, iArr[((i7 * i12) % 2) - 1], 1).show();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                int i13 = equals + 53;
                copy = i13 % 128;
                int i14 = i13 % 2;
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 37, (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 29, (char) (Color.rgb(0, 0, 0) + 16777216), 846241313, false, "copydefault", null);
                }
                int i15 = ((Field) objCopydefault6).getInt(null);
                int i16 = 0;
                long j10 = jLongValue;
                while (true) {
                    for (int i17 = 0; i17 != 8; i17++) {
                        i15 = (((((int) (j10 >> i17)) & 255) + (i15 << 6)) + (i15 << 16)) - i15;
                    }
                    if (i16 != 0) {
                        break;
                    }
                    i16++;
                    j10 = j6;
                }
                if (i15 == i2) {
                    break;
                }
                int i18 = copy + 101;
                equals = i18 % 128;
                int i19 = i18 % 2;
                jLongValue -= 1024;
                i3++;
                j = 0;
            }
        }
        return component3;
    }

    @Override
    public Object emit(Interaction interaction, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = equals + 79;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = equals + 91;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override
    public boolean tryEmit(Interaction interaction) {
        int i = 2 % 2;
        int i2 = equals + 97;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(interaction, "");
        int i4 = equals + 67;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    static void component1() {
        copydefault = -1757918461;
        ShareDataUIState = -238323960;
        component2 = -1894544869;
        component1 = new byte[]{33, -35, 42, 0, -1, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -110, 45, 104, -29, -46, -45, -44, 39, -33, 36, -47, 45, -36, 33, 34, -43, 58, -57, -42, -37, 42, 38, -36, 46, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, 40, -36, 5, -14, -36, 59, TarHeader.LF_NORMAL, -26, 44, 34, -36, 47, 32, 40, -46, 41, 41, 41, 41};
    }
}
