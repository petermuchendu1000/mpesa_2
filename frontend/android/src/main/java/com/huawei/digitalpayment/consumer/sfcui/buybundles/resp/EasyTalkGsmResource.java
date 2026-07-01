package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkGsmResource;", "Landroid/os/Parcelable;", "freeResourceType", "", "freeResourceAmount", "freeResourceValidity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFreeResourceType", "()Ljava/lang/String;", "getFreeResourceAmount", "getFreeResourceValidity", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EasyTalkGsmResource implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EasyTalkGsmResource> CREATOR;
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    private static char copy;
    private static char copydefault;
    private static int equals;
    private static char getAsAtTimestamp;
    private static char getRequestBeneficiariesState;

    @SerializedName("freeResourceAmount")
    private final String freeResourceAmount;

    @SerializedName("freeResourceType")
    private final String freeResourceType;

    @SerializedName("freeResourceValidity")
    private final String freeResourceValidity;
    private static final byte[] $$c = {79, -7, -1, -17};
    private static final int $$f = 210;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {102, -86, -98, TarHeader.LF_DIR, -21, 7, -17, 13, 33, -29, -19, 19, Ascii.FF, Ascii.FF, -10, -33, 19, -19, Ascii.SI};
    private static final int $$e = 243;
    private static final byte[] $$a = {93, TarHeader.LF_LINK, 76, -114, Ascii.FS, Ascii.SO, 19, Ascii.SI, Ascii.SI, 7, Ascii.EM, Ascii.SYN, -49, Ascii.FS, 17, Ascii.EM, -5, 17, 17, Ascii.VT, 36, 7, Ascii.CAN, 37, 9, 33, 3, -17, 45, 35, -3, 4, 4, Ascii.SUB, TarHeader.LF_LINK, -3, 35, 1};
    private static final int $$b = 194;
    private static int ArtificialStackFrames = 0;
    private static int hashCode = 1;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r5, int r6, int r7) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 111
            int r5 = r5 * 2
            int r0 = r5 + 1
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkGsmResource.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
        L27:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkGsmResource.$$g(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 16
            int r7 = 99 - r7
            int r8 = r8 + 10
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkGsmResource.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r7 = r8
            r4 = r2
            goto L27
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
        L27:
            int r7 = r7 + r3
            int r7 = r7 + (-16)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkGsmResource.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkGsmResource.$$d
            int r6 = r6 * 2
            int r6 = r6 + 16
            int r8 = r8 * 4
            int r8 = 83 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
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
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkGsmResource.d(int, int, int, java.lang.Object[]):void");
    }

    public EasyTalkGsmResource(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.freeResourceType = str;
        this.freeResourceAmount = str2;
        this.freeResourceValidity = str3;
    }

    public final String getFreeResourceType() {
        int i = 2 % 2;
        int i2 = hashCode + 43;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.freeResourceType;
        int i5 = i3 + 57;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getFreeResourceAmount() {
        int i = 2 % 2;
        int i2 = hashCode + 95;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.freeResourceAmount;
        int i5 = i3 + 93;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i3 = $11 + 47;
        $10 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (iNotificationSideChannelDefault.component3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $11 + 121;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i5) ^ ((c3 << 4) + ((char) (((long) getRequestBeneficiariesState) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(getAsAtTimestamp)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 844;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 32;
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 23252);
                        byte b2 = (byte) ($$c[2] + 1);
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, edgeSlop, bitsPerPixel, 592652048, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copy)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 844;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 32;
                        char c4 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23250);
                        byte b4 = (byte) ($$c[2] + 1);
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, packedPositionGroup, c4, 592652048, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    int i9 = $10 + 103;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - (ViewConfiguration.getTapTimeout() >> 16), 48 - TextUtils.lastIndexOf("", '0'), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = $10 + 23;
            $11 = i3 % 128;
        }
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i3 = $11 + 57;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i5) ^ ((c3 << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int gidForName = 843 - Process.getGidForName("");
                        int iMyPid = 32 - (Process.myPid() >> 22);
                        char doubleTapTimeout = (char) (23251 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        byte b2 = (byte) ($$c[2] + 1);
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(gidForName, iMyPid, doubleTapTimeout, 592652048, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 844;
                        int longPressTimeout = 32 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        char c4 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23252);
                        byte b4 = (byte) ($$c[2] + 1);
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, longPressTimeout, c4, 592652048, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 49 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) Color.alpha(0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i7 = $11 + 105;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EasyTalkGsmResource> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EasyTalkGsmResource[] newArray(int i) throws Throwable {
            int i2 = 2 % 2;
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - (ViewConfiguration.getPressedStateDuration() >> 16), 33 - TextUtils.indexOf("", "", 0), (char) (AndroidCharacter.getMirror('0') + 19648), 518907119, false, "component3", null);
            }
            int i3 = ((Field) objCopydefault).getInt(null);
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 30, (char) TextUtils.indexOf("", ""), 55511118, false, "component2", null);
            }
            int i4 = ((Field) objCopydefault2).getInt(null);
            long j = i4;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(36 - Process.getGidForName(""), Color.blue(0) + 30, (char) TextUtils.getOffsetAfter("", 0), 58536393, false, "component3", null);
            }
            int i5 = ((Field) objCopydefault3).getInt(null);
            long j2 = 521;
            long j3 = -1;
            long j4 = j3 ^ 3967402018380075171L;
            long j5 = (int) Runtime.getRuntime().totalMemory();
            long j6 = ((j3 ^ (-3174698564735870747L)) | 3967402018380075171L) ^ j3;
            long j7 = (((long) (-520)) * 3967402018380075171L) + (((long) 522) * (-3174698564735870747L)) + ((((j4 | (-3174698564735870747L)) | j5) ^ j3) * j2) + (((long) (-1042)) * j6) + (j2 * ((j3 ^ ((j4 | (j5 ^ j3)) | (-3174698564735870747L))) | j6));
            int i6 = 0;
            while (true) {
                for (int i7 = 0; i7 != 8; i7++) {
                    i5 = (((((int) (j >> i7)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                }
                if (i6 != 0) {
                    break;
                }
                int i8 = copydefault + 115;
                int i9 = i8 % 128;
                component2 = i9;
                int i10 = i8 % 2;
                i6++;
                int i11 = i9 + 43;
                copydefault = i11 % 128;
                int i12 = i11 % 2;
                j = j7;
            }
            if (i5 != i3) {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(68 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 33 - TextUtils.indexOf("", "", 0, 0), (char) (19696 - View.getDefaultSize(0, 0)), 1457147715, false, "copydefault", null);
                }
                Object obj = ((Field) objCopydefault4).get(null);
                long j8 = -1;
                long j9 = 0;
                long j10 = (((long) (i4 ^ i3)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
                try {
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault5 == null) {
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 6618, (ViewConfiguration.getJumpTapTimeout() >> 16) + 42, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                    Object[] objArr = {-895014148, Long.valueOf(j10), obj, null, false, false};
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                    if (objCopydefault6 == null) {
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 6562, 57 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (Process.myTid() >> 22), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objCopydefault6).invoke(objInvoke, objArr);
                    int[] iArr = new int[i4];
                    int i13 = i4 - 1;
                    iArr[i13] = 1;
                    Toast.makeText((Context) null, iArr[((i13 * i4) % 2) - 1], 1).show();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            return new EasyTalkGsmResource[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EasyTalkGsmResource createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            EasyTalkGsmResource easyTalkGsmResource = new EasyTalkGsmResource(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 27;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return easyTalkGsmResource;
        }

        @Override
        public EasyTalkGsmResource createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 25;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            EasyTalkGsmResource easyTalkGsmResourceCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 64 / 0;
            }
            int i5 = component2 + 43;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return easyTalkGsmResourceCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public EasyTalkGsmResource[] newArray(int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = component2 + 59;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            EasyTalkGsmResource[] easyTalkGsmResourceArrNewArray = newArray(i);
            int i4 = component2 + 77;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return easyTalkGsmResourceArrNewArray;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getFreeResourceValidity() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkGsmResource.getFreeResourceValidity():java.lang.String");
    }

    static {
        equals = 0;
        copydefault();
        ShareDataUIState();
        CREATOR = new Creator();
        int i = component4 + 117;
        equals = i % 128;
        if (i % 2 != 0) {
            int i2 = 74 / 0;
        }
    }

    public static EasyTalkGsmResource copy$default(EasyTalkGsmResource easyTalkGsmResource, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ArtificialStackFrames;
        int i4 = i3 + 121;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 39;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
            str = easyTalkGsmResource.freeResourceType;
        }
        if ((i & 2) != 0) {
            str2 = easyTalkGsmResource.freeResourceAmount;
            int i8 = hashCode + 51;
            ArtificialStackFrames = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i & 4) != 0) {
            str3 = easyTalkGsmResource.freeResourceValidity;
        }
        return easyTalkGsmResource.copy(str, str2, str3);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = hashCode + 65;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 != 0) {
            str = this.freeResourceType;
            int i4 = 59 / 0;
        } else {
            str = this.freeResourceType;
        }
        int i5 = i3 + 1;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 79;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.freeResourceAmount;
        int i5 = i2 + 125;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 119;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.freeResourceValidity;
        int i5 = i2 + 69;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return str;
    }

    public final EasyTalkGsmResource copy(String freeResourceType, String freeResourceAmount, String freeResourceValidity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(freeResourceType, "");
        Intrinsics.checkNotNullParameter(freeResourceAmount, "");
        Intrinsics.checkNotNullParameter(freeResourceValidity, "");
        EasyTalkGsmResource easyTalkGsmResource = new EasyTalkGsmResource(freeResourceType, freeResourceAmount, freeResourceValidity);
        int i2 = hashCode + 43;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 14 / 0;
        }
        return easyTalkGsmResource;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 23;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 43;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof EasyTalkGsmResource)) {
            return false;
        }
        EasyTalkGsmResource easyTalkGsmResource = (EasyTalkGsmResource) other;
        if (!Intrinsics.areEqual(this.freeResourceType, easyTalkGsmResource.freeResourceType)) {
            int i2 = ArtificialStackFrames + 111;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.freeResourceAmount, easyTalkGsmResource.freeResourceAmount)) {
            int i4 = ArtificialStackFrames + 95;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.freeResourceValidity, easyTalkGsmResource.freeResourceValidity)) {
            return true;
        }
        int i6 = ArtificialStackFrames + 71;
        hashCode = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 27;
        hashCode = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.freeResourceType.hashCode() * 126) + this.freeResourceAmount.hashCode()) - 86) % this.freeResourceValidity.hashCode() : (((this.freeResourceType.hashCode() * 31) + this.freeResourceAmount.hashCode()) * 31) + this.freeResourceValidity.hashCode();
        int i3 = hashCode + 119;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EasyTalkGsmResource(freeResourceType=" + this.freeResourceType + ", freeResourceAmount=" + this.freeResourceAmount + ", freeResourceValidity=" + this.freeResourceValidity + ")";
        int i2 = ArtificialStackFrames + 7;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 57;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.freeResourceType);
        dest.writeString(this.freeResourceAmount);
        dest.writeString(this.freeResourceValidity);
        if (i3 == 0) {
            throw null;
        }
    }

    static void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 83;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        copydefault = (char) 44969;
        component2 = (char) 1349;
        ShareDataUIState = (char) 41013;
        component3 = (char) 57146;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 125;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
    }

    static void copydefault() {
        component1 = (char) 21650;
        copy = (char) 12012;
        getRequestBeneficiariesState = (char) 14897;
        getAsAtTimestamp = (char) 30261;
    }
}
