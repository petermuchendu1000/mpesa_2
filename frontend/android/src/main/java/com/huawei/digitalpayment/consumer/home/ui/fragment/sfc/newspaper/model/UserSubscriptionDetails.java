package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.InputDeviceCompat;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.CharUtils;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÇ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0013H×\u0001J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/UserSubscriptionDetails;", "Landroid/os/Parcelable;", "autoRenewProducts", "", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/AutoRenewProduct;", "oldNewspaper", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/Newspaper;", "todaysNewsPaper", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAutoRenewProducts", "()Ljava/util/List;", "getOldNewspaper", "getTodaysNewsPaper", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserSubscriptionDetails implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserSubscriptionDetails> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("autoRenewProducts")
    private final List<AutoRenewProduct> autoRenewProducts;

    @SerializedName("oldNewspaper")
    private final List<Newspaper> oldNewspaper;

    @SerializedName("todaysNewsPaper")
    private final List<Newspaper> todaysNewsPaper;

    public UserSubscriptionDetails(List<AutoRenewProduct> list, List<Newspaper> list2, List<Newspaper> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.autoRenewProducts = list;
        this.oldNewspaper = list2;
        this.todaysNewsPaper = list3;
    }

    public final List<AutoRenewProduct> getAutoRenewProducts() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.autoRenewProducts;
        }
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserSubscriptionDetails> {
        private static final byte[] $$c = {20, 103, 109, TarHeader.LF_BLK};
        private static final int $$d = 72;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {57, 126, 65, 8, -38, -24, -29, -25, -25, -17, -35, -32, 39};
        private static final int $$b = 172;
        private static int copydefault = 0;
        private static int component2 = 1;
        private static int component3 = -890926568;

        private static String $$e(int i, int i2, int i3) {
            int i4 = (i * 3) + 4;
            byte[] bArr = $$c;
            int i5 = i2 * 3;
            int i6 = (i3 * 4) + 65;
            byte[] bArr2 = new byte[i5 + 1];
            int i7 = -1;
            if (bArr == null) {
                i4++;
                i6 += -i5;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i6;
                if (i7 == i5) {
                    return new String(bArr2, 0);
                }
                int i8 = bArr[i4];
                i4++;
                i6 += -i8;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(byte r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 4
                int r8 = 99 - r8
                int r9 = r9 * 3
                int r9 = 3 - r9
                byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model.UserSubscriptionDetails.Creator.$$a
                int r7 = r7 * 3
                int r7 = 10 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r8 = r9
                r4 = r2
                goto L2e
            L17:
                r3 = r2
            L18:
                int r9 = r9 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r6
            L2e:
                int r3 = -r3
                int r9 = r9 + r3
                int r9 = r9 + (-26)
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model.UserSubscriptionDetails.Creator.b(byte, int, short, java.lang.Object[]):void");
        }

        private static void a(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i4 = 2 % 2;
            ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
            char[] cArr3 = new char[i];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                int i5 = $11 + 79;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
                cArr3[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
                int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(component3)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - View.MeasureSpec.getMode(0), 37 - MotionEvent.axisFromString(""), (char) (View.MeasureSpec.getSize(0) + 26860), 2015799920, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 7406, 15 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (AndroidCharacter.getMirror('0') - '0'), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            if (i2 > 0) {
                iTrustedWebActivityServiceStub.component1 = i2;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
                System.arraycopy(cArr4, iTrustedWebActivityServiceStub.component1, cArr3, 0, i - iTrustedWebActivityServiceStub.component1);
                int i8 = $11 + 25;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            }
            if (z) {
                int i10 = $10 + 89;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr2 = new char[i];
                    iTrustedWebActivityServiceStub.ShareDataUIState = 1;
                } else {
                    cArr2 = new char[i];
                    iTrustedWebActivityServiceStub.ShareDataUIState = 0;
                }
                while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                    cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr3[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7405, InputDeviceCompat.SOURCE_JOYSTICK + Color.rgb(0, 0, 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                }
                cArr3 = cArr2;
            }
            String str = new String(cArr3);
            int i11 = $10 + 65;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            objArr[0] = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UserSubscriptionDetails[] newArray(int i) throws Throwable {
            float f;
            int i2;
            int i3;
            int i4 = 2 % 2;
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
            int i5 = 0;
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 34, (char) (19696 - ExpandableListView.getPackedPositionGroup(0L)), 520092524, false, "component2", null);
            }
            Object obj = null;
            int i6 = ((Field) objCopydefault).getInt(null);
            Object[] objArr = new Object[1];
            a(23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 21 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{'\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 227, true, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 8, new char[]{65515, 65534, 65530, 5, CharUtils.CR, 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533}, 232 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long j = 764;
            long j2 = -1;
            long jIdentityHashCode = ((long) System.identityHashCode(this)) ^ j2;
            long j3 = (jIdentityHashCode | 3685869678119543606L) ^ j2;
            long j4 = ((j2 ^ 3685869678119543606L) | 769853418486966719L) ^ j2;
            long j5 = (((long) 765) * 3685869678119543606L) + (((long) (-1527)) * 769853418486966719L) + ((j3 | 769853418486966719L) * j) + (((long) (-1528)) * (j4 | ((jIdentityHashCode | 769853418486966719L) ^ j2))) + (j * (j4 | (((j2 ^ 769853418486966719L) | 3685869678119543606L) ^ j2) | j3));
            int i7 = 0;
            long j6 = jLongValue;
            while (true) {
                if (i7 != 10) {
                    int i8 = component2 + 47;
                    copydefault = i8 % 128;
                    if (i8 % 2 != 0) {
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                        if (objCopydefault2 == null) {
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(i5, i5, i5, i5) + 37, 30 - View.combineMeasuredStates(i5, i5), (char) TextUtils.getOffsetAfter("", i5), 846241313, false, "copydefault", null);
                        }
                        i2 = ((Field) objCopydefault2).getInt(obj);
                        i3 = 1;
                    } else {
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 30 - View.resolveSize(i5, i5), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1)), 846241313, false, "copydefault", null);
                        }
                        i2 = ((Field) objCopydefault3).getInt(obj);
                        i3 = i5;
                    }
                    long j7 = j6;
                    while (true) {
                        int i9 = i5;
                        while (i9 != 8) {
                            i2 = (((((int) (j7 >> i9)) & 255) + (i2 << 6)) + (i2 << 16)) - i2;
                            i9++;
                            int i10 = component2 + 107;
                            copydefault = i10 % 128;
                            int i11 = i10 % 2;
                        }
                        if (i3 != 0) {
                            break;
                        }
                        int i12 = copydefault + 97;
                        component2 = i12 % 128;
                        i3 = i12 % 2 == 0 ? i3 + 112 : i3 + 1;
                        j7 = j5;
                        i5 = 0;
                    }
                    if (i2 == i6) {
                        break;
                    }
                    j6 -= 1024;
                    i7++;
                    i5 = 0;
                    obj = null;
                } else {
                    try {
                        Object[] objArr3 = {1392961697};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                        if (objCopydefault4 == null) {
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1663 - (ViewConfiguration.getScrollBarSize() >> 8), 10 - TextUtils.getOffsetAfter("", 0), (char) (MotionEvent.axisFromString("") + 1), 1006506020, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArr4 = {Integer.valueOf(i), 0, 315473039, ((Constructor) objCopydefault4).newInstance(objArr3), false};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                        if (objCopydefault5 == null) {
                            int iBlue = 1454 - Color.blue(0);
                            int offsetBefore = 22 - TextUtils.getOffsetBefore("", 0);
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            Object[] objArr5 = new Object[1];
                            b(b2, b3, b3, objArr5);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, offsetBefore, packedPositionType, 1908380642, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(1591 - ExpandableListView.getPackedPositionGroup(0L), 40 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)), Boolean.TYPE});
                        }
                        Object[] objArr6 = (Object[]) ((Method) objCopydefault5).invoke(null, objArr4);
                        int i13 = ((int[]) objArr6[2])[0];
                        int i14 = ((int[]) objArr6[1])[0];
                        if (i14 != i13) {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr6[3];
                            if (strArr != null) {
                                for (String str : strArr) {
                                    arrayList.add(str);
                                }
                            }
                            long j8 = -1;
                            long j9 = ((long) (i13 ^ i14)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)));
                            long j10 = 0;
                            long j11 = j9 | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                            if (objCopydefault6 == null) {
                                f = 0.0f;
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 43, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 428292935, false, "ShareDataUIState", new Class[0]);
                            } else {
                                f = 0.0f;
                            }
                            Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
                            Object[] objArr7 = {1392961697, Long.valueOf(j11), arrayList, null, false, false};
                            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                            if (objCopydefault7 == null) {
                                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6561, TextUtils.lastIndexOf("", '0', 0) + 57, (char) (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                            }
                            ((Method) objCopydefault7).invoke(objInvoke, objArr7);
                            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
            return new UserSubscriptionDetails[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UserSubscriptionDetails createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = copydefault + 7;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(AutoRenewProduct.CREATOR.createFromParcel(parcel));
                i3++;
                int i6 = component2 + 67;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }
            ArrayList arrayList2 = arrayList;
            int i8 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                int i10 = copydefault + 123;
                component2 = i10 % 128;
                int i11 = i10 % 2;
                arrayList3.add(Newspaper.CREATOR.createFromParcel(parcel));
            }
            ArrayList arrayList4 = arrayList3;
            int i12 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i12);
            int i13 = copydefault + 39;
            component2 = i13 % 128;
            int i14 = i13 % 2;
            for (int i15 = 0; i15 != i12; i15++) {
                arrayList5.add(Newspaper.CREATOR.createFromParcel(parcel));
            }
            return new UserSubscriptionDetails(arrayList2, arrayList4, arrayList5);
        }

        @Override
        public UserSubscriptionDetails createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 89;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            UserSubscriptionDetails userSubscriptionDetailsCreateFromParcel = createFromParcel(parcel);
            int i3 = copydefault + 37;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return userSubscriptionDetailsCreateFromParcel;
            }
            throw null;
        }

        @Override
        public UserSubscriptionDetails[] newArray(int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = copydefault + 45;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            UserSubscriptionDetails[] userSubscriptionDetailsArrNewArray = newArray(i);
            int i5 = copydefault + 75;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return userSubscriptionDetailsArrNewArray;
            }
            throw null;
        }
    }

    public final List<Newspaper> getOldNewspaper() throws Throwable {
        CharSequence charSequence;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33, (char) (TextUtils.indexOf((CharSequence) "", '0') + 19697), 518907119, false, "component3", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37, View.resolveSize(0, 0) + 30, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 55511118, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault2).getInt(null);
        long j = i3;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        int i4 = 8;
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.lastIndexOf("", '0') + 31, (char) Color.green(0), 58536393, false, "component3", null);
        }
        int i5 = ((Field) objCopydefault3).getInt(null);
        long j2 = -1;
        long j3 = j2 ^ 4246384800216943111L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j4 = 283;
        long j5 = j2 ^ (-3453681346572738687L);
        long j6 = (((long) 284) * 4246384800216943111L) + (((long) (-282)) * (-3453681346572738687L)) + (((long) (-283)) * (((j3 | (-3453681346572738687L)) ^ j2) | ((j3 | jIdentityHashCode) ^ j2))) + (((j5 | 4246384800216943111L) ^ j2) * j4) + (j4 * (j2 ^ ((j3 | j5) | jIdentityHashCode)));
        int i6 = component1 + 111;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 2 / 5;
        }
        int i8 = 0;
        long j7 = j;
        while (true) {
            int i9 = 0;
            while (i9 != i4) {
                i5 = (((((int) (j7 >> i9)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                i9++;
                i4 = 8;
            }
            if (i8 != 0) {
                break;
            }
            int i10 = component1 + 73;
            ShareDataUIState = i10 % 128;
            i8 = i10 % 2 == 0 ? i8 + 12 : i8 + 1;
            j7 = j6;
            i4 = 8;
        }
        if (i5 != i2) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                charSequence = "";
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 68, 32 - MotionEvent.axisFromString(""), (char) (19696 - TextUtils.getOffsetBefore(charSequence, 0)), 1457147715, false, "copydefault", null);
            } else {
                charSequence = "";
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j8 = -1;
            long j9 = 0;
            long j10 = (((long) (i3 ^ i2)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6617 - ExpandableListView.getPackedPositionChild(0L), Color.green(0) + 42, (char) (AndroidCharacter.getMirror('0') - '0'), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {-204663670, Long.valueOf(j10), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6562, 56 - TextUtils.indexOf(charSequence, charSequence, 0, 0), (char) Color.green(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                throw new RuntimeException(String.valueOf(i3));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        List<Newspaper> list = this.oldNewspaper;
        int i11 = ShareDataUIState + 113;
        component1 = i11 % 128;
        int i12 = i11 % 2;
        return list;
    }

    public final List<Newspaper> getTodaysNewsPaper() {
        List<Newspaper> list;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.todaysNewsPaper;
            int i4 = 67 / 0;
        } else {
            list = this.todaysNewsPaper;
        }
        int i5 = i2 + 75;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 35;
        component2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static UserSubscriptionDetails copy$default(UserSubscriptionDetails userSubscriptionDetails, List list, List list2, List list3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 51;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            list = userSubscriptionDetails.autoRenewProducts;
        }
        if ((i & 2) != 0) {
            list2 = userSubscriptionDetails.oldNewspaper;
        }
        if ((i & 4) != 0) {
            list3 = userSubscriptionDetails.todaysNewsPaper;
        }
        UserSubscriptionDetails userSubscriptionDetailsCopy = userSubscriptionDetails.copy(list, list2, list3);
        int i5 = component1 + 17;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return userSubscriptionDetailsCopy;
    }

    public final List<AutoRenewProduct> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<AutoRenewProduct> list = this.autoRenewProducts;
        int i4 = i3 + 39;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final List<Newspaper> component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<Newspaper> list = this.oldNewspaper;
        int i5 = i2 + 43;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<Newspaper> component3() {
        List<Newspaper> list;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            list = this.todaysNewsPaper;
            int i4 = 75 / 0;
        } else {
            list = this.todaysNewsPaper;
        }
        int i5 = i3 + 97;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final UserSubscriptionDetails copy(List<AutoRenewProduct> autoRenewProducts, List<Newspaper> oldNewspaper, List<Newspaper> todaysNewsPaper) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(autoRenewProducts, "");
        Intrinsics.checkNotNullParameter(oldNewspaper, "");
        Intrinsics.checkNotNullParameter(todaysNewsPaper, "");
        UserSubscriptionDetails userSubscriptionDetails = new UserSubscriptionDetails(autoRenewProducts, oldNewspaper, todaysNewsPaper);
        int i2 = component1 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return userSubscriptionDetails;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 57;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof UserSubscriptionDetails) {
            UserSubscriptionDetails userSubscriptionDetails = (UserSubscriptionDetails) other;
            if (Intrinsics.areEqual(this.autoRenewProducts, userSubscriptionDetails.autoRenewProducts)) {
                return Intrinsics.areEqual(this.oldNewspaper, userSubscriptionDetails.oldNewspaper) && Intrinsics.areEqual(this.todaysNewsPaper, userSubscriptionDetails.todaysNewsPaper);
            }
            int i2 = ShareDataUIState + 49;
            component1 = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = ShareDataUIState + 31;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 117;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.autoRenewProducts.hashCode() * 31) + this.oldNewspaper.hashCode()) * 31) + this.todaysNewsPaper.hashCode();
        int i4 = component1 + 95;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UserSubscriptionDetails(autoRenewProducts=" + this.autoRenewProducts + ", oldNewspaper=" + this.oldNewspaper + ", todaysNewsPaper=" + this.todaysNewsPaper + ")";
        int i2 = ShareDataUIState + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<AutoRenewProduct> list = this.autoRenewProducts;
        dest.writeInt(list.size());
        Iterator<AutoRenewProduct> it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = component1 + 69;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            it.next().writeToParcel(dest, flags);
        }
        List<Newspaper> list2 = this.oldNewspaper;
        dest.writeInt(list2.size());
        Iterator<Newspaper> it2 = list2.iterator();
        while (it2.hasNext()) {
            int i4 = ShareDataUIState + 65;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                it2.next().writeToParcel(dest, flags);
                int i5 = 69 / 0;
            } else {
                it2.next().writeToParcel(dest, flags);
            }
        }
        List<Newspaper> list3 = this.todaysNewsPaper;
        dest.writeInt(list3.size());
        Iterator<Newspaper> it3 = list3.iterator();
        while (it3.hasNext()) {
            int i6 = ShareDataUIState + 115;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                it3.next().writeToParcel(dest, flags);
                int i7 = 90 / 0;
            } else {
                it3.next().writeToParcel(dest, flags);
            }
        }
    }
}
