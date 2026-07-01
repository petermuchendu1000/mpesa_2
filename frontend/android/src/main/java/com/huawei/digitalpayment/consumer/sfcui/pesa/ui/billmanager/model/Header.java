package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelAll;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0006H\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u0006H×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0006H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/Header;", "Landroid/os/Parcelable;", Keys.KEY_CUSTOMER_MESSAGE, "", "requestRefId", "responseCode", "", "responseMessage", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerMessage", "()Ljava/lang/String;", "getRequestRefId", "getResponseCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResponseMessage", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/Header;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Header implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Header> CREATOR;
    private static char ShareDataUIState;
    private static int component1;
    private static char[] component3;

    @SerializedName(Keys.KEY_CUSTOMER_MESSAGE)
    private final String customerMessage;

    @SerializedName("requestRefId")
    private final String requestRefId;

    @SerializedName("responseCode")
    private final Integer responseCode;

    @SerializedName("responseMessage")
    private final String responseMessage;

    @SerializedName("timestamp")
    private final String timestamp;
    private static final byte[] $$c = {73, 121, -48, -56};
    private static final int $$d = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {2, 105, -126, -86, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_NORMAL};
    private static final int $$b = 75;
    private static int component2 = 0;
    private static int equals = 1;
    private static int copydefault = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Header> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Header createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 117;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Integer numValueOf = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = copydefault + 3;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new Header(string, string2, numValueOf, parcel.readString(), parcel.readString());
        }

        @Override
        public Header createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 33;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Header headerCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 89;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return headerCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Header[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 5;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            Header[] headerArr = new Header[i];
            int i6 = i3 + 1;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 53 / 0;
            }
            return headerArr;
        }

        @Override
        public Header[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 45;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            Header[] headerArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 81 / 0;
            }
            return headerArrNewArray;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r6, short r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.Header.$$c
            int r6 = r6 * 2
            int r6 = r6 + 119
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.Header.$$e(byte, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.Header.$$a
            int r7 = r7 * 6
            int r1 = 16 - r7
            int r8 = r8 * 16
            int r8 = 99 - r8
            int r6 = r6 * 3
            int r6 = 36 - r6
            byte[] r1 = new byte[r1]
            int r7 = 15 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r8 = r6
            r3 = r7
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L31:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-17)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.Header.a(byte, int, short, java.lang.Object[]):void");
    }

    public Header(String str, String str2, Integer num, String str3, String str4) {
        this.customerMessage = str;
        this.requestRefId = str2;
        this.responseCode = num;
        this.responseMessage = str3;
        this.timestamp = str4;
    }

    public final String getCustomerMessage() {
        int i = 2 % 2;
        int i2 = equals + 87;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.customerMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRequestRefId() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.requestRefId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x062c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer getResponseCode() {
        /*
            Method dump skipped, instruction units count: 1673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.Header.getResponseCode():java.lang.Integer");
    }

    public final String getResponseMessage() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.responseMessage;
            int i4 = 49 / 0;
        } else {
            str = this.responseMessage;
        }
        int i5 = i2 + 53;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTimestamp() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.timestamp;
        int i5 = i2 + 9;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void b(byte b2, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        char c2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component3;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 7422, 15 - TextUtils.indexOf("", ""), (char) ((-16712925) - Color.rgb(0, 0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        char c3 = '\b';
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 7422, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, (char) (64290 - ExpandableListView.getPackedPositionChild(0L)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i6 = $11 + 35;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i8 = $11 + 97;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    c2 = c3;
                    obj = obj2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = cancelall;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = cancelall;
                    objArr4[9] = cancelall;
                    objArr4[c3] = Integer.valueOf(cCharValue);
                    objArr4[7] = cancelall;
                    objArr4[6] = cancelall;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = cancelall;
                    objArr4[3] = cancelall;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = cancelall;
                    objArr4[0] = cancelall;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        int iIndexOf = 7116 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int iGreen = Color.green(0) + 14;
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 44464);
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[1] = Object.class;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[5] = Integer.TYPE;
                        clsArr[6] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[c3] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iGreen, cLastIndexOf, 1150140696, false, "x", clsArr);
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        Object[] objArr5 = new Object[11];
                        objArr5[10] = cancelall;
                        objArr5[9] = Integer.valueOf(cCharValue);
                        objArr5[c3] = cancelall;
                        objArr5[7] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = cancelall;
                        objArr5[4] = cancelall;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[1] = cancelall;
                        objArr5[0] = cancelall;
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            int iResolveOpacity = 2944 - Drawable.resolveOpacity(0, 0);
                            int i10 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24;
                            char maximumDrawingCacheSize = (char) (27637 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            String str$$e = $$e(b3, b4, b4);
                            c2 = '\b';
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iResolveOpacity, i10, maximumDrawingCacheSize, 794909189, false, str$$e, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = c3;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i11 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i11];
                    } else {
                        c2 = c3;
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i12 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i12];
                            cArr4[cancelall.component2 + 1] = cArr2[i13];
                        } else {
                            int i14 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i15 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i14];
                            cArr4[cancelall.component2 + 1] = cArr2[i15];
                            int i16 = $10 + 91;
                            $11 = i16 % 128;
                            i3 = 2;
                            if (i16 % 2 == 0) {
                                int i17 = 2 / 4;
                            }
                            cancelall.component2 += i3;
                            obj2 = obj;
                            c3 = c2;
                        }
                    }
                }
                i3 = 2;
                cancelall.component2 += i3;
                obj2 = obj;
                c3 = c2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static {
        component1 = 0;
        copydefault();
        CREATOR = new Creator();
        int i = copydefault + 3;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static Header copy$default(Header header, String str, String str2, Integer num, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = header.customerMessage;
            int i3 = component2 + 69;
            equals = i3 % 128;
            int i4 = i3 % 2;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = header.requestRefId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            num = header.responseCode;
            int i5 = component2 + 1;
            equals = i5 % 128;
            int i6 = i5 % 2;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            int i7 = equals + 61;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            str3 = header.responseMessage;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            int i9 = equals + 53;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            str4 = header.timestamp;
        }
        return header.copy(str5, str6, num2, str7, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.customerMessage;
        int i5 = i3 + 41;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.requestRefId;
        int i5 = i3 + 57;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.responseCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.responseMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = equals + 37;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.timestamp;
        int i5 = i3 + 119;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Header copy(String customerMessage, String requestRefId, Integer responseCode, String responseMessage, String timestamp) {
        int i = 2 % 2;
        Header header = new Header(customerMessage, requestRefId, responseCode, responseMessage, timestamp);
        int i2 = component2 + 35;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return header;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = equals + 21;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 29;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 39;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        if (!Intrinsics.areEqual(this.customerMessage, header.customerMessage)) {
            int i7 = component2 + 47;
            equals = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.requestRefId, header.requestRefId) || !Intrinsics.areEqual(this.responseCode, header.responseCode)) {
            return false;
        }
        if (Intrinsics.areEqual(this.responseMessage, header.responseMessage)) {
            if (Intrinsics.areEqual(this.timestamp, header.timestamp)) {
                return true;
            }
            int i9 = equals + 81;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = equals;
        int i12 = i11 + 37;
        component2 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 + 61;
        component2 = i14 % 128;
        if (i14 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.customerMessage;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.requestRefId;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.responseCode;
        if (num == null) {
            int i2 = component2 + 15;
            equals = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = num.hashCode();
        }
        String str3 = this.responseMessage;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.timestamp;
        if (str4 == null) {
            int i3 = component2 + 93;
            equals = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iHashCode2 = str4.hashCode();
        }
        return (((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Header(customerMessage=" + this.customerMessage + ", requestRefId=" + this.requestRefId + ", responseCode=" + this.responseCode + ", responseMessage=" + this.responseMessage + ", timestamp=" + this.timestamp + ")";
        int i2 = component2 + 63;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = equals + 19;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.customerMessage);
        dest.writeString(this.requestRefId);
        Integer num = this.responseCode;
        if (num == null) {
            int i4 = equals + 33;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.responseMessage);
        dest.writeString(this.timestamp);
    }

    static void copydefault() {
        component3 = new char[]{2030, 1050, 2025, 2022, 2029, 2020, 2023, 1051, 2002, 2028, 2034, 2017, 2035, 2041, 2019, 2032, 1987, 2036, 2018, 2021, 1966, 2027, 2031, 2003, 2016};
        ShareDataUIState = (char) 12831;
    }
}
