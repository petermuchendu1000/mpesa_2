package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.BackHandlerKtBackHandler21invokeinlinedonDispose1;
import kotlin.BackHandlerKtBackHandler3;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.cancelAll;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem;", "Landroid/os/Parcelable;", "<init>", "()V", "Header", "Content", "AdditionalInfoType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$Content;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$Header;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ConfirmItem implements Parcelable {
    public static final int $stable = 0;
    private static char[] component1;
    private static long component2;
    private static int component3;
    private static char copydefault;
    private static final byte[] $$a = {65, -53, 110, -39};
    private static final int $$b = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private static int ShareDataUIState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.ConfirmItem.$$a
            int r7 = r7 * 16
            int r7 = 119 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L2f
        L16:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.ConfirmItem.$$c(int, short, int):java.lang.String");
    }

    private ConfirmItem() {
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0003H\u0007J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0003H×\u0001J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$Header;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem;", "headerTitleRes", "", "drawablePicture", "secondaryPicture", "<init>", "(IILjava/lang/Integer;)V", "getHeaderTitleRes", "()I", "getDrawablePicture", "getSecondaryPicture", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(IILjava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$Header;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Header extends ConfirmItem {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Header> CREATOR = new Creator();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int copydefault = 1;
        private final int drawablePicture;
        private final int headerTitleRes;
        private final Integer secondaryPicture;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Header> {
            private static int ShareDataUIState = 1;
            private static int component1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Header createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 43;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (i3 != 0) {
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readInt();
                    throw null;
                }
                Header header = new Header(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                int i4 = ShareDataUIState + 123;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return header;
                }
                throw null;
            }

            @Override
            public Header createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 49;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    return createFromParcel(parcel);
                }
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Header[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 125;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                Header[] headerArr = new Header[i];
                int i6 = i4 + 13;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return headerArr;
            }

            @Override
            public Header[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 1;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Header[] headerArrNewArray = newArray(i);
                int i5 = component1 + 81;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return headerArrNewArray;
                }
                throw null;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Header(int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i3 & 4) != 0) {
                int i4 = copydefault + 123;
                int i5 = i4 % 128;
                component1 = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 119;
                copydefault = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 / 2;
                } else {
                    int i9 = 2 % 2;
                }
                num = null;
            }
            this(i, i2, num);
        }

        public final int getHeaderTitleRes() {
            int i = 2 % 2;
            int i2 = component1 + 11;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = this.headerTitleRes;
            int i6 = i3 + 81;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final int getDrawablePicture() {
            int i = 2 % 2;
            int i2 = copydefault + 79;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.drawablePicture;
            if (i3 != 0) {
                int i5 = 31 / 0;
            }
            return i4;
        }

        public final Integer getSecondaryPicture() {
            int i = 2 % 2;
            int i2 = copydefault + 79;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            Integer num = this.secondaryPicture;
            int i5 = i3 + 25;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        public Header(int i, int i2, Integer num) {
            super(null);
            this.headerTitleRes = i;
            this.drawablePicture = i2;
            this.secondaryPicture = num;
        }

        static {
            int i = ShareDataUIState + 3;
            component2 = i % 128;
            int i2 = i % 2;
        }

        public static Header copy$default(Header header, int i, int i2, Integer num, int i3, Object obj) {
            int i4 = 2 % 2;
            int i5 = copydefault + 19;
            int i6 = i5 % 128;
            component1 = i6;
            if (i5 % 2 == 0 ? (i3 & 1) != 0 : (i3 & 1) != 0) {
                i = header.headerTitleRes;
                int i7 = i6 + 49;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
            }
            if ((i3 & 2) != 0) {
                i2 = header.drawablePicture;
                int i9 = i6 + 9;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
            }
            if ((i3 & 4) != 0) {
                int i11 = copydefault + 7;
                component1 = i11 % 128;
                if (i11 % 2 != 0) {
                    Integer num2 = header.secondaryPicture;
                    throw null;
                }
                num = header.secondaryPicture;
            }
            return header.copy(i, i2, num);
        }

        public final int component1() {
            int i = 2 % 2;
            int i2 = component1 + 91;
            int i3 = i2 % 128;
            copydefault = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = this.headerTitleRes;
            int i5 = i3 + 47;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return i4;
            }
            throw null;
        }

        public final int component2() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 83;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = this.drawablePicture;
            int i5 = i2 + 97;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public final Integer component3() {
            int i = 2 % 2;
            int i2 = copydefault + 65;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            Integer num = this.secondaryPicture;
            int i5 = i3 + 43;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        public final Header copy(int headerTitleRes, int drawablePicture, Integer secondaryPicture) {
            int i = 2 % 2;
            Header header = new Header(headerTitleRes, drawablePicture, secondaryPicture);
            int i2 = copydefault + 17;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return header;
            }
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault + 39;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2 != 0 ? 1 : 0;
            int i5 = i3 + 43;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                int i2 = component1 + 71;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            Header header = (Header) other;
            if (this.headerTitleRes == header.headerTitleRes) {
                return this.drawablePicture == header.drawablePicture && Intrinsics.areEqual(this.secondaryPicture, header.secondaryPicture);
            }
            int i4 = copydefault + 41;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int i3 = copydefault + 91;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode = Integer.hashCode(this.headerTitleRes);
            int iHashCode2 = Integer.hashCode(this.drawablePicture);
            Integer num = this.secondaryPicture;
            if (num == null) {
                int i5 = component1;
                int i6 = i5 + 67;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 61;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
                i = 0;
            } else {
                int iHashCode3 = num.hashCode();
                int i10 = copydefault + 117;
                component1 = i10 % 128;
                int i11 = i10 % 2;
                i = iHashCode3;
            }
            return (((iHashCode * 31) + iHashCode2) * 31) + i;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Header(headerTitleRes=" + this.headerTitleRes + ", drawablePicture=" + this.drawablePicture + ", secondaryPicture=" + this.secondaryPicture + ')';
            int i2 = component1 + 117;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            int i = 2 % 2;
            int i2 = copydefault + 37;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            if (i3 != 0) {
                dest.writeInt(this.headerTitleRes);
                dest.writeInt(this.drawablePicture);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            dest.writeInt(this.headerTitleRes);
            dest.writeInt(this.drawablePicture);
            Integer num = this.secondaryPicture;
            if (num == null) {
                int i4 = copydefault + 89;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J@\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÇ\u0001¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0003H\u0007J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH×\u0003J\t\u0010 \u001a\u00020\u0003H×\u0001J\t\u0010!\u001a\u00020\u0006H×\u0001J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$Content;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem;", "hintRes", "", "valueRes", "value", "", "additionalInfo", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$AdditionalInfoType;", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getHintRes", "()I", "getValueRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValue", "()Ljava/lang/String;", "getAdditionalInfo", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$Content;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Content extends ConfirmItem {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Content> CREATOR = new Creator();
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault = 1;
        private final List<AdditionalInfoType> additionalInfo;
        private final int hintRes;
        private final String value;
        private final Integer valueRes;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Content> {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Content createFromParcel(Parcel parcel) {
                Integer numValueOf;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                int i2 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    int i3 = copydefault + 45;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
                String string = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                int i6 = copydefault + 77;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 0;
                while (i8 != i5) {
                    arrayList.add(parcel.readParcelable(Content.class.getClassLoader()));
                    i8++;
                    int i9 = copydefault + 19;
                    component3 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 5 / 4;
                    }
                }
                return new Content(i2, numValueOf, string, arrayList);
            }

            @Override
            public Content createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 71;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Content contentCreateFromParcel = createFromParcel(parcel);
                int i4 = component3 + 91;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return contentCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Content[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 59;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                Content[] contentArr = new Content[i];
                int i6 = i3 + 21;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    return contentArr;
                }
                throw null;
            }

            @Override
            public Content[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 33;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Content[] contentArrNewArray = newArray(i);
                int i5 = copydefault + 65;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return contentArrNewArray;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Content(int i, Integer num, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 2) != 0) {
                int i3 = component2 + 125;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                int i4 = 2 % 2;
                num = null;
            }
            if ((i2 & 4) != 0) {
                int i5 = ShareDataUIState + 11;
                int i6 = i5 % 128;
                component2 = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 41;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                int i10 = 2 % 2;
                str = null;
            }
            this(i, num, str, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final int getHintRes() {
            int i = 2 % 2;
            int i2 = component2 + 37;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.hintRes;
            if (i3 != 0) {
                int i5 = 53 / 0;
            }
            return i4;
        }

        public final Integer getValueRes() {
            Integer num;
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 117;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                num = this.valueRes;
                int i4 = 92 / 0;
            } else {
                num = this.valueRes;
            }
            int i5 = i2 + 17;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        public final String getValue() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 15;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.value;
            int i5 = i3 + 77;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final List<AdditionalInfoType> getAdditionalInfo() {
            int i = 2 % 2;
            int i2 = component2 + 75;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            List<AdditionalInfoType> list = this.additionalInfo;
            int i5 = i3 + 95;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return list;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Content(int i, Integer num, String str, List<? extends AdditionalInfoType> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.hintRes = i;
            this.valueRes = num;
            this.value = str;
            this.additionalInfo = list;
        }

        static {
            int i = copydefault + 63;
            component1 = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Content copy$default(Content content, int i, Integer num, String str, List list, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = component2 + 17;
            int i5 = i4 % 128;
            ShareDataUIState = i5;
            if (i4 % 2 == 0 && (i2 & 1) != 0) {
                i = content.hintRes;
            }
            if ((i2 & 2) != 0) {
                int i6 = i5 + 75;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    Integer num2 = content.valueRes;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                num = content.valueRes;
            }
            if ((i2 & 4) != 0) {
                str = content.value;
            }
            if ((i2 & 8) != 0) {
                list = content.additionalInfo;
                int i7 = component2 + 93;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
            }
            return content.copy(i, num, str, list);
        }

        public final int component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 35;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.hintRes;
            int i6 = i2 + 91;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final Integer component2() {
            int i = 2 % 2;
            int i2 = component2 + 21;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            Integer num = this.valueRes;
            int i5 = i3 + 113;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return num;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 71;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.value;
            int i5 = i2 + 95;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final List<AdditionalInfoType> component4() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 1;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.additionalInfo;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Content copy(int hintRes, Integer valueRes, String value, List<? extends AdditionalInfoType> additionalInfo) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(additionalInfo, "");
            Content content = new Content(hintRes, valueRes, value, additionalInfo);
            int i2 = component2 + 7;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return content;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 29;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 3;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 59;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof Content)) {
                int i4 = component2 + 121;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            Content content = (Content) other;
            if (this.hintRes != content.hintRes) {
                return false;
            }
            if (!Intrinsics.areEqual(this.valueRes, content.valueRes)) {
                int i6 = ShareDataUIState + 123;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.value, content.value)) {
                return false;
            }
            if (Intrinsics.areEqual(this.additionalInfo, content.additionalInfo)) {
                return true;
            }
            int i8 = component2 + 113;
            ShareDataUIState = i8 % 128;
            return i8 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 77;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = Integer.hashCode(this.hintRes);
            Integer num = this.valueRes;
            if (num == null) {
                int i4 = component2 + 65;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 5 / 5;
                }
                iHashCode = 0;
            } else {
                iHashCode = num.hashCode();
            }
            String str = this.value;
            return (((((iHashCode2 * 31) + iHashCode) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.additionalInfo.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Content(hintRes=" + this.hintRes + ", valueRes=" + this.valueRes + ", value=" + this.value + ", additionalInfo=" + this.additionalInfo + ')';
            int i2 = component2 + 77;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            int i = 2 % 2;
            int i2 = component2 + 63;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            if (i3 != 0) {
                dest.writeInt(this.hintRes);
                throw null;
            }
            dest.writeInt(this.hintRes);
            Integer num = this.valueRes;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
                int i4 = component2 + 43;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
            dest.writeInt(iIntValue);
            dest.writeString(this.value);
            List<AdditionalInfoType> list = this.additionalInfo;
            dest.writeInt(list.size());
            Iterator<AdditionalInfoType> it = list.iterator();
            while (it.hasNext()) {
                int i6 = component2 + 119;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                dest.writeParcelable(it.next(), flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$AdditionalInfoType;", "Landroid/os/Parcelable;", "<init>", "()V", "Hint", "ExchangeRate", "Fee", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$AdditionalInfoType$ExchangeRate;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$AdditionalInfoType$Fee;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$AdditionalInfoType$Hint;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AdditionalInfoType implements Parcelable {
        public static final int $stable = 0;
        private static int component2 = 0;
        private static int component3 = 1;

        private AdditionalInfoType() {
        }

        static {
            int i = 1 + 11;
            component2 = i % 128;
            int i2 = i % 2;
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u0003H\u0007J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0003H×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$AdditionalInfoType$Hint;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$AdditionalInfoType;", "labelRes", "", "<init>", "(I)V", "getLabelRes", "()I", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Hint extends AdditionalInfoType {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Hint> CREATOR = new Creator();
            private static int ShareDataUIState = 0;
            private static int component1 = 1;
            private static int component2 = 1;
            private static int component3;
            private final int labelRes;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Hint> {
                private static int component1 = 0;
                private static int component3 = 1;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final Hint createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    Hint hint = new Hint(parcel.readInt());
                    int i2 = component1 + 71;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    return hint;
                }

                @Override
                public Hint createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = component3 + 7;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Hint hintCreateFromParcel = createFromParcel(parcel);
                    int i4 = component3 + 11;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return hintCreateFromParcel;
                    }
                    throw null;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final Hint[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = component3 + 1;
                    component1 = i3 % 128;
                    Hint[] hintArr = new Hint[i];
                    if (i3 % 2 != 0) {
                        int i4 = 5 / 0;
                    }
                    return hintArr;
                }

                @Override
                public Hint[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = component1 + 51;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    Hint[] hintArrNewArray = newArray(i);
                    int i5 = component1 + 21;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    return hintArrNewArray;
                }
            }

            public Hint(int i) {
                super(null);
                this.labelRes = i;
            }

            public final int getLabelRes() {
                int i = 2 % 2;
                int i2 = component2 + 121;
                int i3 = i2 % 128;
                component3 = i3;
                int i4 = i2 % 2;
                int i5 = this.labelRes;
                int i6 = i3 + 39;
                component2 = i6 % 128;
                if (i6 % 2 != 0) {
                    return i5;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            static {
                int i = ShareDataUIState + 31;
                component1 = i % 128;
                int i2 = i % 2;
            }

            public static Hint copy$default(Hint hint, int i, int i2, Object obj) {
                int i3 = 2 % 2;
                int i4 = component3;
                int i5 = i4 + 95;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                if ((i2 & 1) != 0) {
                    int i7 = i4 + 35;
                    component2 = i7 % 128;
                    int i8 = i7 % 2;
                    i = hint.labelRes;
                }
                return hint.copy(i);
            }

            public final int component1() {
                int i = 2 % 2;
                int i2 = component2;
                int i3 = i2 + 61;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.labelRes;
                int i6 = i2 + 27;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return i5;
            }

            public final Hint copy(int labelRes) {
                int i = 2 % 2;
                Hint hint = new Hint(labelRes);
                int i2 = component2 + 9;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return hint;
            }

            @Override
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = component2 + 29;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return 0;
            }

            public boolean equals(Object other) {
                int i = 2 % 2;
                int i2 = component2;
                int i3 = i2 + 33;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                if (this != other) {
                    return (other instanceof Hint) && this.labelRes == ((Hint) other).labelRes;
                }
                int i5 = i2 + 11;
                int i6 = i5 % 128;
                component3 = i6;
                int i7 = i5 % 2;
                int i8 = i6 + 59;
                component2 = i8 % 128;
                if (i8 % 2 != 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = component2 + 123;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = Integer.hashCode(this.labelRes);
                int i4 = component3 + 99;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return iHashCode;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Hint(labelRes=" + this.labelRes + ')';
                int i2 = component2 + 113;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 60 / 0;
                }
                return str;
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                int i = 2 % 2;
                int i2 = component3 + 15;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeInt(this.labelRes);
                int i4 = component3 + 31;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public AdditionalInfoType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$AdditionalInfoType$ExchangeRate;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$AdditionalInfoType;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ExchangeRate extends AdditionalInfoType {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ExchangeRate> CREATOR = new Creator();
            private static int ShareDataUIState = 0;
            private static int component1 = 0;
            private static int component2 = 1;
            private static int copydefault = 1;
            private final String text;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExchangeRate> {
                private static int ShareDataUIState = 1;
                private static int copydefault;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final ExchangeRate createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    ExchangeRate exchangeRate = new ExchangeRate(parcel.readString());
                    int i2 = ShareDataUIState + 19;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    return exchangeRate;
                }

                @Override
                public ExchangeRate createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 41;
                    copydefault = i2 % 128;
                    if (i2 % 2 == 0) {
                        return createFromParcel(parcel);
                    }
                    createFromParcel(parcel);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final ExchangeRate[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 37;
                    copydefault = i3 % 128;
                    ExchangeRate[] exchangeRateArr = new ExchangeRate[i];
                    if (i3 % 2 != 0) {
                        int i4 = 98 / 0;
                    }
                    return exchangeRateArr;
                }

                @Override
                public ExchangeRate[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 89;
                    copydefault = i3 % 128;
                    Object obj = null;
                    if (i3 % 2 != 0) {
                        newArray(i);
                        obj.hashCode();
                        throw null;
                    }
                    ExchangeRate[] exchangeRateArrNewArray = newArray(i);
                    int i4 = ShareDataUIState + 101;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        return exchangeRateArrNewArray;
                    }
                    obj.hashCode();
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExchangeRate(String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.text = str;
            }

            public final String getText() {
                int i = 2 % 2;
                int i2 = copydefault;
                int i3 = i2 + 1;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                String str = this.text;
                int i5 = i2 + 85;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            static {
                int i = component2 + 9;
                component1 = i % 128;
                int i2 = i % 2;
            }

            public static ExchangeRate copy$default(ExchangeRate exchangeRate, String str, int i, Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 67;
                ShareDataUIState = i4 % 128;
                int i5 = i & 1;
                if (i4 % 2 == 0 ? i5 != 0 : i5 != 0) {
                    int i6 = i3 + 97;
                    ShareDataUIState = i6 % 128;
                    if (i6 % 2 != 0) {
                        String str2 = exchangeRate.text;
                        throw null;
                    }
                    str = exchangeRate.text;
                }
                return exchangeRate.copy(str);
            }

            public final String component1() {
                int i = 2 % 2;
                int i2 = copydefault + 71;
                int i3 = i2 % 128;
                ShareDataUIState = i3;
                Object obj = null;
                if (i2 % 2 != 0) {
                    throw null;
                }
                String str = this.text;
                int i4 = i3 + 103;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return str;
                }
                obj.hashCode();
                throw null;
            }

            public final ExchangeRate copy(String text) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(text, "");
                ExchangeRate exchangeRate = new ExchangeRate(text);
                int i2 = copydefault + 53;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return exchangeRate;
            }

            @Override
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 35;
                copydefault = i2 % 128;
                return i2 % 2 == 0 ? 1 : 0;
            }

            public boolean equals(Object other) {
                int i = 2 % 2;
                if (this == other) {
                    int i2 = ShareDataUIState + 11;
                    copydefault = i2 % 128;
                    if (i2 % 2 != 0) {
                        return true;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!(other instanceof ExchangeRate)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.text, ((ExchangeRate) other).text)) {
                    int i3 = copydefault + 87;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
                int i5 = ShareDataUIState + 67;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = ShareDataUIState + 19;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    iHashCode = this.text.hashCode();
                    int i3 = 78 / 0;
                } else {
                    iHashCode = this.text.hashCode();
                }
                int i4 = ShareDataUIState + 71;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return iHashCode;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "ExchangeRate(text=" + this.text + ')';
                int i2 = copydefault + 113;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 19;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(dest, "");
                dest.writeString(this.text);
                int i4 = ShareDataUIState + 13;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 0;
                }
            }
        }

        public static void component3() {
            BackHandlerKtBackHandler3.component2[0] = BackHandlerKtBackHandler21invokeinlinedonDispose1.component1[0];
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0005H×\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$AdditionalInfoType$Fee;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$AdditionalInfoType;", "amount", "", "currency", "", "<init>", "(DLjava/lang/String;)V", "getAmount", "()D", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Fee extends AdditionalInfoType {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Fee> CREATOR = new Creator();
            private static int ShareDataUIState = 1;
            private static int component2 = 1;
            private static int component3;
            private static int copydefault;
            private final double amount;
            private final String currency;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Fee> {
                private static int ShareDataUIState = 1;
                private static int component3;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final Fee createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    Fee fee = new Fee(parcel.readDouble(), parcel.readString());
                    int i2 = ShareDataUIState + 93;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    return fee;
                }

                @Override
                public Fee createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = component3 + 25;
                    ShareDataUIState = i2 % 128;
                    if (i2 % 2 == 0) {
                        createFromParcel(parcel);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Fee feeCreateFromParcel = createFromParcel(parcel);
                    int i3 = ShareDataUIState + 31;
                    component3 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 81 / 0;
                    }
                    return feeCreateFromParcel;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final Fee[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState;
                    int i4 = i3 + 59;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    Fee[] feeArr = new Fee[i];
                    int i6 = i3 + 99;
                    component3 = i6 % 128;
                    if (i6 % 2 == 0) {
                        return feeArr;
                    }
                    throw null;
                }

                @Override
                public Fee[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 47;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    Fee[] feeArrNewArray = newArray(i);
                    int i5 = component3 + 105;
                    ShareDataUIState = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 71 / 0;
                    }
                    return feeArrNewArray;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Fee(double d2, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.amount = d2;
                this.currency = str;
            }

            public final double getAmount() {
                int i = 2 % 2;
                int i2 = component2 + 49;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.amount;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String getCurrency() {
                int i = 2 % 2;
                int i2 = component2 + 29;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                String str = this.currency;
                if (i3 != 0) {
                    int i4 = 15 / 0;
                }
                return str;
            }

            static {
                int i = copydefault + 67;
                ShareDataUIState = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Fee copy$default(Fee fee, double d2, String str, int i, Object obj) {
                int i2 = 2 % 2;
                if ((i & 1) != 0) {
                    int i3 = component3 + 47;
                    component2 = i3 % 128;
                    if (i3 % 2 == 0) {
                        double d3 = fee.amount;
                        throw null;
                    }
                    d2 = fee.amount;
                }
                if ((i & 2) != 0) {
                    int i4 = component3;
                    int i5 = i4 + 13;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    String str2 = fee.currency;
                    int i7 = i4 + 113;
                    component2 = i7 % 128;
                    int i8 = i7 % 2;
                    str = str2;
                }
                return fee.copy(d2, str);
            }

            public final double component1() {
                int i = 2 % 2;
                int i2 = component3;
                int i3 = i2 + 67;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                double d2 = this.amount;
                int i4 = i2 + 3;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return d2;
            }

            public final String component2() {
                String str;
                int i = 2 % 2;
                int i2 = component3 + 87;
                int i3 = i2 % 128;
                component2 = i3;
                if (i2 % 2 == 0) {
                    str = this.currency;
                    int i4 = 85 / 0;
                } else {
                    str = this.currency;
                }
                int i5 = i3 + 39;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final Fee copy(double amount, String currency) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(currency, "");
                Fee fee = new Fee(amount, currency);
                int i2 = component3 + 47;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return fee;
            }

            @Override
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = component2 + 55;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return 0;
            }

            public boolean equals(Object other) {
                int i = 2 % 2;
                if (this == other) {
                    int i2 = component2 + 59;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(other instanceof Fee)) {
                    return false;
                }
                Fee fee = (Fee) other;
                if (Double.compare(this.amount, fee.amount) != 0) {
                    return false;
                }
                if (Intrinsics.areEqual(this.currency, fee.currency)) {
                    return true;
                }
                int i4 = component2 + 35;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = component2 + 53;
                component3 = i2 % 128;
                int iHashCode = i2 % 2 != 0 ? (Double.hashCode(this.amount) << 54) - this.currency.hashCode() : (Double.hashCode(this.amount) * 31) + this.currency.hashCode();
                int i3 = component2 + 71;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Fee(amount=" + this.amount + ", currency=" + this.currency + ')';
                int i2 = component3 + 85;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                int i = 2 % 2;
                int i2 = component3 + 31;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(dest, "");
                if (i3 != 0) {
                    dest.writeDouble(this.amount);
                    dest.writeString(this.currency);
                } else {
                    dest.writeDouble(this.amount);
                    dest.writeString(this.currency);
                    throw null;
                }
            }
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 31;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $10 + 67;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 7032, (-16777182) - Color.rgb(0, 0, 0), (char) (63440 - Drawable.resolveOpacity(0, 0)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.getDefaultSize(0, 0) + 1390, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17, (char) (View.combineMeasuredStates(0, 0) + 51269), -1883291598, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    private static void a(byte b2, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        Object obj;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component1;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 7423, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15, (char) (TextUtils.getOffsetAfter("", 0) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
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
        Object[] objArr3 = {Integer.valueOf(copydefault)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (ViewConfiguration.getTapTimeout() >> 16), View.combineMeasuredStates(0, 0) + 15, (char) (64291 - Color.blue(0)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i3 = i - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
            int i6 = $11 + 21;
            $10 = i6 % 128;
            i2 = 2;
            int i7 = i6 % 2;
        } else {
            i2 = 2;
            i3 = i;
        }
        if (i3 > 1) {
            int i8 = $11 + 113;
            $10 = i8 % 128;
            int i9 = i8 % i2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i3) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 13 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (TextUtils.lastIndexOf("", '0') + 44464), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            int i10 = $10 + 71;
                            $11 = i10 % 128;
                            int i11 = i10 % 2;
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.combineMeasuredStates(0, 0) + 24, (char) (KeyEvent.normalizeMetaState(0) + 27637), 794909189, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i12];
                            int i13 = $10 + 27;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                        } else {
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i15 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i15];
                                cArr4[cancelall.component2 + 1] = cArr2[i16];
                            } else {
                                int i17 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i18 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i17];
                                cArr4[cancelall.component2 + 1] = cArr2[i18];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        int i19 = 0;
        while (i19 < i) {
            int i20 = $11 + 25;
            $10 = i20 % 128;
            if (i20 % 2 != 0) {
                cArr4[i19] = (char) (cArr4[i19] ^ 11333);
                i19 += 113;
            } else {
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                i19++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static {
        component3 = 0;
        ShareDataUIState();
        int i = ShareDataUIState + 43;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ConfirmItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] copydefault(android.content.Context r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 3721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.ConfirmItem.copydefault(android.content.Context, int, int):java.lang.Object[]");
    }

    static void ShareDataUIState() {
        component1 = new char[]{2032, 1050, 2037, 1985, 1964, 2003, 2029, 2036, 1977, 2016, 2018, 1988, 1048, 1051, 2025, 2035, 1055, 2041, 2021, 2028, 1952, 2027, 2020, 2026, 2038, 1981, 1054, 2040, 2019, 1049, 2031, 1966, 1987, 1993, 2024, 1999, 1973, 1968, 2008, 2017, 2022, 2005, 2039, 2030, 2034, 2000, 2023, 2033, 1998};
        copydefault = (char) 12829;
        component2 = -925969768636059871L;
    }
}
