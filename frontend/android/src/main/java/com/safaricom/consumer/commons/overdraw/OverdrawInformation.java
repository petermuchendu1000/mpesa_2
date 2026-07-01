package com.safaricom.consumer.commons.overdraw;

import android.content.Context;
import android.graphics.Color;
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
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.common.base.Ascii;
import com.safaricom.mpesa.logging.L;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.getActiveNotifications;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0004DEFGBo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010&\u001a\u0004\u0018\u00010\u00052\b\u0010'\u001a\u0004\u0018\u00010\u00052\b\u0010(\u001a\u0004\u0018\u00010\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010*J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0080\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00106J\u0006\u00107\u001a\u000208J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u000208HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\u0016\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u000208R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010\u0015¨\u0006H"}, d2 = {"Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation;", "Landroid/os/Parcelable;", "status", "", "balance", "", "limit", "currency", "dueAmount", "dueDate", "subscribeDate", "takenAmount", "lenderInfo", "Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$LenderInfo;", "chargesInfo", "Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$ChargesInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$LenderInfo;Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$ChargesInfo;)V", "getStatus", "()Ljava/lang/String;", "getBalance", "()Ljava/lang/Double;", "setBalance", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLimit", "getCurrency", "getDueAmount", "setDueAmount", "getDueDate", "getSubscribeDate", "getTakenAmount", "getLenderInfo", "()Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$LenderInfo;", "getChargesInfo", "()Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$ChargesInfo;", "reservedLimit", "getReservedLimit", "calculateReservedLimit", "totalLimit", "availableLimit", "usedLimit", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$LenderInfo;Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$ChargesInfo;)Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "LenderInfo", "ChargesInfo", "OverdraftFee", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OverdrawInformation implements Parcelable {
    private Double balance;
    private final ChargesInfo chargesInfo;
    private final String currency;
    private Double dueAmount;
    private final String dueDate;
    private final LenderInfo lenderInfo;
    private final Double limit;
    private final String status;
    private final String subscribeDate;
    private final Double takenAmount;

    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<OverdrawInformation> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OverdrawInformation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OverdrawInformation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OverdrawInformation(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : LenderInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ChargesInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OverdrawInformation[] newArray(int i) {
            return new OverdrawInformation[i];
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public OverdrawInformation(String str, Double d2, Double d3, String str2, Double d4, String str3, String str4, Double d5, LenderInfo lenderInfo, ChargesInfo chargesInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.status = str;
        this.balance = d2;
        this.limit = d3;
        this.currency = str2;
        this.dueAmount = d4;
        this.dueDate = str3;
        this.subscribeDate = str4;
        this.takenAmount = d5;
        this.lenderInfo = lenderInfo;
        this.chargesInfo = chargesInfo;
    }

    public OverdrawInformation(String str, Double d2, Double d3, String str2, Double d4, String str3, String str4, Double d5, LenderInfo lenderInfo, ChargesInfo chargesInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d2, d3, str2, (i & 16) != 0 ? null : d4, (i & 32) != 0 ? null : str3, str4, (i & 128) != 0 ? null : d5, (i & 256) != 0 ? null : lenderInfo, (i & 512) != 0 ? null : chargesInfo);
    }

    public final String getStatus() {
        return this.status;
    }

    public final Double getBalance() {
        return this.balance;
    }

    public final void setBalance(Double d2) {
        this.balance = d2;
    }

    public final Double getLimit() {
        return this.limit;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getDueAmount() {
        return this.dueAmount;
    }

    public final void setDueAmount(Double d2) {
        this.dueAmount = d2;
    }

    public final String getDueDate() {
        return this.dueDate;
    }

    public final String getSubscribeDate() {
        return this.subscribeDate;
    }

    public final Double getTakenAmount() {
        return this.takenAmount;
    }

    public final LenderInfo getLenderInfo() {
        return this.lenderInfo;
    }

    public final ChargesInfo getChargesInfo() {
        return this.chargesInfo;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$Companion;", "", "<init>", "()V", "createEmptyInfo", "Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation;", "status", "Lcom/safaricom/consumer/commons/overdraw/OverdrawStatus;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final OverdrawInformation createEmptyInfo(OverdrawStatus status) {
            Intrinsics.checkNotNullParameter(status, "");
            return new OverdrawInformation(status.name(), null, null, "", null, null, "", null, null, null, 944, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Double getReservedLimit() {
        Double dCalculateReservedLimit = calculateReservedLimit(this.limit, this.balance, this.takenAmount);
        L.INSTANCE.v("OverdrawInformation reservedLimit=" + dCalculateReservedLimit, new Object[0]);
        return dCalculateReservedLimit;
    }

    private final Double calculateReservedLimit(Double totalLimit, Double availableLimit, Double usedLimit) {
        L.INSTANCE.v("calculateReservedLimit() totalLimit=" + totalLimit + ", availableLimit=" + availableLimit + ", usedLimit=" + usedLimit, new Object[0]);
        try {
            if (totalLimit == null) {
                L.INSTANCE.w("totalLimit is null", new Object[0]);
                throw new IllegalArgumentException(Unit.INSTANCE.toString());
            }
            if (availableLimit == null) {
                L.INSTANCE.w("availableLimit is null", new Object[0]);
                throw new IllegalArgumentException(Unit.INSTANCE.toString());
            }
            if (usedLimit == null) {
                L.INSTANCE.w("usedLimit is null", new Object[0]);
                throw new IllegalArgumentException(Unit.INSTANCE.toString());
            }
            return Double.valueOf((totalLimit.doubleValue() - availableLimit.doubleValue()) - usedLimit.doubleValue());
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getStatus() {
        return this.status;
    }

    public final ChargesInfo getChargesInfo() {
        return this.chargesInfo;
    }

    public final Double getBalance() {
        return this.balance;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006!"}, d2 = {"Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$LenderInfo;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "name", "iconUrl", "coverIconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getIconUrl", "getCoverIconUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LenderInfo implements Parcelable {
        public static final Parcelable.Creator<LenderInfo> CREATOR;

        public static final Companion INSTANCE;
        private static int[] ShareDataUIState;
        private static int component2;
        private final String coverIconUrl;
        private final String iconUrl;
        private final String id;
        private final String name;
        private static final byte[] $$c = {TarHeader.LF_SYMLINK, 44, -54, Ascii.EM};
        private static final int $$d = 60;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {94, -53, Ascii.FS, -60, 38, Ascii.CAN, Ascii.GS, Ascii.EM, Ascii.EM, 17, 35, 32, -39};
        private static final int $$b = 153;
        private static int component3 = 0;
        private static int copydefault = 1;
        private static int component1 = 1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LenderInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final LenderInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new LenderInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final LenderInfo[] newArray(int i) {
                return new LenderInfo[i];
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(byte r6, int r7, byte r8) {
            /*
                int r8 = r8 * 4
                int r0 = r8 + 1
                int r7 = r7 * 4
                int r7 = 3 - r7
                byte[] r1 = com.safaricom.consumer.commons.overdraw.OverdrawInformation.LenderInfo.$$c
                int r6 = r6 + 104
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2b
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r7 = r7 + 1
                if (r3 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L23:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2b:
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.safaricom.consumer.commons.overdraw.OverdrawInformation.LenderInfo.$$e(byte, int, byte):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(byte r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.safaricom.consumer.commons.overdraw.OverdrawInformation.LenderInfo.$$a
                int r9 = r9 * 2
                int r9 = r9 + 99
                int r7 = r7 + 4
                int r8 = r8 * 4
                int r8 = 10 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r9 = r7
                r3 = r8
                r5 = r2
                goto L2d
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                int r7 = r7 + 1
                if (r5 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L2d:
                int r3 = r3 + r7
                int r7 = r3 + (-26)
                r3 = r5
                r6 = r9
                r9 = r7
                r7 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.safaricom.consumer.commons.overdraw.OverdrawInformation.LenderInfo.b(byte, short, int, java.lang.Object[]):void");
        }

        public LenderInfo(String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.id = str;
            this.name = str2;
            this.iconUrl = str3;
            this.coverIconUrl = str4;
        }

        public final String getId() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 37;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.id;
            int i5 = i2 + 13;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String getName() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 23;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.name;
            int i5 = i2 + 19;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String getIconUrl() {
            int i = 2 % 2;
            int i2 = component3 + 11;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.iconUrl;
            int i5 = i3 + 21;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getCoverIconUrl() {
            int i = 2 % 2;
            int i2 = copydefault + 41;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.coverIconUrl;
            }
            throw null;
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$LenderInfo$Companion;", "", "<init>", "()V", "createEmptyLenderInfo", "Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$LenderInfo;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final LenderInfo createEmptyLenderInfo() {
                return new LenderInfo("", "", "", "");
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            getActiveNotifications getactivenotifications = new getActiveNotifications();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = ShareDataUIState;
            int i4 = 684241640;
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 73;
                    $10 = i8 % 128;
                    if (i8 % i2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                            if (objCopydefault == null) {
                                byte b2 = (byte) i2;
                                byte b3 = (byte) (b2 - 2);
                                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - (Process.myTid() >> 22), 37 - Color.blue(0), (char) (KeyEvent.getMaxKeyCode() >> 16), -309236339, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                            i7 >>>= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 2;
                            byte b5 = (byte) (b4 - 2);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4391, 37 - View.MeasureSpec.getSize(0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -309236339, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                        i7++;
                    }
                    i2 = 2;
                    i4 = 684241640;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = ShareDataUIState;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = 0;
                while (i9 < length3) {
                    Object[] objArr4 = new Object[i5];
                    objArr4[i6] = Integer.valueOf(iArr5[i9]);
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 2;
                        byte b7 = (byte) (b6 - 2);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(i6) + 4391, AndroidCharacter.getMirror('0') - 11, (char) ExpandableListView.getPackedPositionType(0L), -309236339, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    i9++;
                    i5 = 1;
                    i6 = 0;
                }
                iArr5 = iArr6;
            }
            int i10 = i6;
            System.arraycopy(iArr5, i10, iArr4, i10, length2);
            getactivenotifications.component1 = i10;
            while (getactivenotifications.component1 < iArr.length) {
                int i11 = $11 + 1;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
                cArr[1] = (char) iArr[getactivenotifications.component1];
                cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
                cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
                getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
                getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
                getActiveNotifications.component2(iArr4);
                int i13 = 0;
                for (int i14 = 16; i13 < i14; i14 = 16) {
                    getactivenotifications.ShareDataUIState ^= iArr4[i13];
                    Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2968 - TextUtils.indexOf("", ""), 15 - Process.getGidForName(""), (char) (49872 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 462826032, false, $$e(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i13++;
                }
                int i15 = getactivenotifications.ShareDataUIState;
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = i15;
                getactivenotifications.component2 ^= iArr4[16];
                getactivenotifications.ShareDataUIState ^= iArr4[17];
                int i16 = getactivenotifications.ShareDataUIState;
                int i17 = getactivenotifications.component2;
                cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
                cArr[1] = (char) getactivenotifications.ShareDataUIState;
                cArr[2] = (char) (getactivenotifications.component2 >>> 16);
                cArr[3] = (char) getactivenotifications.component2;
                getActiveNotifications.component2(iArr4);
                cArr2[getactivenotifications.component1 * 2] = cArr[0];
                cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
                cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
                cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
                Object[] objArr6 = {getactivenotifications, getactivenotifications};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) 3;
                    byte b11 = (byte) (b10 - 3);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 24, (char) (27637 - TextUtils.getOffsetBefore("", 0)), -1616366948, false, $$e(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        public String toString() throws Throwable {
            String str;
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder("LenderInfo(id=");
            String str2 = this.id;
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
            String str3 = "";
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(66 - TextUtils.indexOf((CharSequence) "", '0'), 33 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19696), 520092524, false, "component2", null);
            }
            int i2 = ((Field) objCopydefault).getInt(null);
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, new int[]{-2040418987, 1965809105, 2137562496, 261946517, 1142477080, -1230987381, 777461674, 768125604, -1278241636, -2103654735, -457618120, 610218344}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, new int[]{560247039, 2045436202, 211957719, -823021106, 2097452787, -767462994, 2058739370, -672594993}, objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long j = 628;
            long j2 = -627;
            long jMyUid = Process.myUid();
            long j3 = -1;
            long j4 = (j * 578514536232752102L) + (j * 3877208560373758223L) + ((jMyUid | 3877208560373758223L | (j3 ^ 578514536232752102L)) * j2) + (j2 * ((((j3 ^ 3877208560373758223L) | jMyUid) ^ j3) | 578514536232752102L)) + (((long) 627) * ((((jMyUid ^ j3) | 3877208560373758223L) ^ j3) | (j3 ^ (jMyUid | 578514536232752102L))));
            int i3 = 0;
            while (true) {
                if (i3 != 10) {
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 37, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29, (char) TextUtils.getOffsetAfter(str3, 0), 846241313, false, "copydefault", null);
                    }
                    int i4 = ((Field) objCopydefault2).getInt(null);
                    int i5 = 0;
                    long j5 = jLongValue;
                    while (true) {
                        int i6 = 0;
                        while (i6 != 8) {
                            i4 = (((((int) (j5 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                            i6++;
                            str3 = str3;
                        }
                        str = str3;
                        if (i5 != 0) {
                            break;
                        }
                        i5++;
                        str3 = str;
                        j5 = j4;
                    }
                    if (i4 == i2) {
                        break;
                    }
                    int i7 = component3 + 109;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                    jLongValue -= 1024;
                    i3++;
                    str3 = str;
                } else {
                    String str4 = str3;
                    Object[] objArr3 = new Object[1];
                    a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, new int[]{-659163130, -953977895, 420099129, 21048878, -512294912, 129505442, -554568360, -566735137}, objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    a(15 - TextUtils.indexOf((CharSequence) str4, '0'), new int[]{89542874, -316451564, 1218873889, -1091023625, 858631844, 723586495, -1159866604, -1157240183}, objArr4);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr5 = {-1715718661};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 1664, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1006506020, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1701124753, ((Constructor) objCopydefault3).newInstance(objArr5), false};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                        if (objCopydefault4 == null) {
                            int i9 = 1455 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            int i10 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22;
                            char c2 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            byte b2 = (byte) (-1);
                            byte b3 = (byte) (b2 + 1);
                            Object[] objArr7 = new Object[1];
                            b(b2, b3, b3, objArr7);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i9, i10, c2, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(1591 - KeyEvent.normalizeMetaState(0), 39 - (ViewConfiguration.getEdgeSlop() >> 16), (char) TextUtils.indexOf(str4, str4)), Boolean.TYPE});
                        }
                        Object[] objArr8 = (Object[]) ((Method) objCopydefault4).invoke(null, objArr6);
                        int i11 = ((int[]) objArr8[2])[0];
                        int i12 = ((int[]) objArr8[1])[0];
                        if (i12 == i11) {
                            int i13 = component3 + 113;
                            copydefault = i13 % 128;
                            int i14 = i13 % 2;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr8[3];
                            if (strArr != null) {
                                int i15 = copydefault + 123;
                                component3 = i15 % 128;
                                int i16 = 2;
                                int i17 = i15 % 2;
                                int i18 = 0;
                                while (i18 < strArr.length) {
                                    int i19 = copydefault + 95;
                                    component3 = i19 % 128;
                                    int i20 = i19 % i16;
                                    arrayList.add(strArr[i18]);
                                    i18++;
                                    i16 = 2;
                                }
                            }
                            long j6 = -1;
                            long j7 = 0;
                            long j8 = (((long) (i12 ^ i11)) & ((j6 - ((j6 >> 63) << 32)) | (((long) 0) << 32))) | (j7 - ((j7 >> 63) << 32)) | (((long) 1) << 32);
                            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                            if (objCopydefault5 == null) {
                                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6617 - MotionEvent.axisFromString(str4), KeyEvent.normalizeMetaState(0) + 42, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                            }
                            Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                            Object[] objArr9 = {-1715718661, Long.valueOf(j8), arrayList, null, false, false};
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                            if (objCopydefault6 == null) {
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 56, (char) (TextUtils.indexOf((CharSequence) str4, '0') + 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                            }
                            ((Method) objCopydefault6).invoke(objInvoke, objArr9);
                            int[] iArr = new int[i12];
                            int i21 = i12 - 1;
                            iArr[i21] = 1;
                            Toast.makeText((Context) null, iArr[((i12 * i21) % 2) - 1], 1).show();
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
            sb.append(str2);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", iconUrl=");
            sb.append(this.iconUrl);
            sb.append(", coverIconUrl=");
            sb.append(this.coverIconUrl);
            sb.append(')');
            return sb.toString();
        }

        static {
            component2 = 0;
            ShareDataUIState();
            INSTANCE = new Companion(null);
            CREATOR = new Creator();
            int i = component1 + 41;
            component2 = i % 128;
            if (i % 2 != 0) {
                int i2 = 90 / 0;
            }
        }

        public static LenderInfo copy$default(LenderInfo lenderInfo, String str, String str2, String str3, String str4, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component3 + 63;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    String str5 = lenderInfo.id;
                    throw null;
                }
                str = lenderInfo.id;
            }
            if ((i & 2) != 0) {
                str2 = lenderInfo.name;
            }
            if ((i & 4) != 0) {
                str3 = lenderInfo.iconUrl;
            }
            if ((i & 8) != 0) {
                str4 = lenderInfo.coverIconUrl;
                int i4 = component3 + 69;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }
            return lenderInfo.copy(str, str2, str3, str4);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component3 + 115;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.id;
            int i5 = i3 + 95;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = copydefault + 125;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.name;
            if (i3 != 0) {
                int i4 = 42 / 0;
            }
            return str;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = component3 + 65;
            int i3 = i2 % 128;
            copydefault = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.iconUrl;
            int i4 = i3 + 87;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 59 / 0;
            }
            return str;
        }

        public final String component4() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 7;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.coverIconUrl;
            int i5 = i2 + 91;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final LenderInfo copy(String id, String name, String iconUrl, String coverIconUrl) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(id, "");
            Intrinsics.checkNotNullParameter(name, "");
            Intrinsics.checkNotNullParameter(iconUrl, "");
            Intrinsics.checkNotNullParameter(coverIconUrl, "");
            LenderInfo lenderInfo = new LenderInfo(id, name, iconUrl, coverIconUrl);
            int i2 = component3 + 67;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 16 / 0;
            }
            return lenderInfo;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 13;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 85;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 113;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof LenderInfo)) {
                return false;
            }
            LenderInfo lenderInfo = (LenderInfo) other;
            if (!Intrinsics.areEqual(this.id, lenderInfo.id) || !Intrinsics.areEqual(this.name, lenderInfo.name) || !Intrinsics.areEqual(this.iconUrl, lenderInfo.iconUrl)) {
                return false;
            }
            if (Intrinsics.areEqual(this.coverIconUrl, lenderInfo.coverIconUrl)) {
                return true;
            }
            int i4 = component3;
            int i5 = i4 + 97;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 93;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 61;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.coverIconUrl.hashCode();
            int i4 = copydefault + 87;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = copydefault + 83;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.id);
            dest.writeString(this.name);
            dest.writeString(this.iconUrl);
            dest.writeString(this.coverIconUrl);
            int i4 = copydefault + 77;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }

        static void ShareDataUIState() {
            ShareDataUIState = new int[]{150959473, -2126906334, 590921286, 1331409127, -1597373835, 595741150, 1082821914, 2062902479, 1191419645, 273701124, 889066921, -1483524798, 107780503, -282315550, -698707263, -1538307794, 1532048183, -2133561757};
        }
    }

    public final Double getLimit() {
        return this.limit;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getDueAmount() {
        return this.dueAmount;
    }

    public final String getDueDate() {
        return this.dueDate;
    }

    public final String getSubscribeDate() {
        return this.subscribeDate;
    }

    public final Double getTakenAmount() {
        return this.takenAmount;
    }

    public final LenderInfo getLenderInfo() {
        return this.lenderInfo;
    }

    public final OverdrawInformation copy(String status, Double balance, Double limit, String currency, Double dueAmount, String dueDate, String subscribeDate, Double takenAmount, LenderInfo lenderInfo, ChargesInfo chargesInfo) {
        Intrinsics.checkNotNullParameter(status, "");
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(subscribeDate, "");
        return new OverdrawInformation(status, balance, limit, currency, dueAmount, dueDate, subscribeDate, takenAmount, lenderInfo, chargesInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverdrawInformation)) {
            return false;
        }
        OverdrawInformation overdrawInformation = (OverdrawInformation) other;
        return Intrinsics.areEqual(this.status, overdrawInformation.status) && Intrinsics.areEqual((Object) this.balance, (Object) overdrawInformation.balance) && Intrinsics.areEqual((Object) this.limit, (Object) overdrawInformation.limit) && Intrinsics.areEqual(this.currency, overdrawInformation.currency) && Intrinsics.areEqual((Object) this.dueAmount, (Object) overdrawInformation.dueAmount) && Intrinsics.areEqual(this.dueDate, overdrawInformation.dueDate) && Intrinsics.areEqual(this.subscribeDate, overdrawInformation.subscribeDate) && Intrinsics.areEqual((Object) this.takenAmount, (Object) overdrawInformation.takenAmount) && Intrinsics.areEqual(this.lenderInfo, overdrawInformation.lenderInfo) && Intrinsics.areEqual(this.chargesInfo, overdrawInformation.chargesInfo);
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode();
        Double d2 = this.balance;
        int iHashCode2 = d2 == null ? 0 : d2.hashCode();
        Double d3 = this.limit;
        int iHashCode3 = d3 == null ? 0 : d3.hashCode();
        int iHashCode4 = this.currency.hashCode();
        Double d4 = this.dueAmount;
        int iHashCode5 = d4 == null ? 0 : d4.hashCode();
        String str = this.dueDate;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = this.subscribeDate.hashCode();
        Double d5 = this.takenAmount;
        int iHashCode8 = d5 == null ? 0 : d5.hashCode();
        LenderInfo lenderInfo = this.lenderInfo;
        int iHashCode9 = lenderInfo == null ? 0 : lenderInfo.hashCode();
        ChargesInfo chargesInfo = this.chargesInfo;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (chargesInfo != null ? chargesInfo.hashCode() : 0);
    }

    public String toString() {
        return "OverdrawInformation(status=" + this.status + ", balance=" + this.balance + ", limit=" + this.limit + ", currency=" + this.currency + ", dueAmount=" + this.dueAmount + ", dueDate=" + this.dueDate + ", subscribeDate=" + this.subscribeDate + ", takenAmount=" + this.takenAmount + ", lenderInfo=" + this.lenderInfo + ", chargesInfo=" + this.chargesInfo + ')';
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$ChargesInfo;", "Landroid/os/Parcelable;", "accessFee", "Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$OverdraftFee;", "maintenanceFee", "penaltyFee", "<init>", "(Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$OverdraftFee;Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$OverdraftFee;Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$OverdraftFee;)V", "getAccessFee", "()Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$OverdraftFee;", "getMaintenanceFee", "getPenaltyFee", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChargesInfo implements Parcelable {
        public static final Parcelable.Creator<ChargesInfo> CREATOR = new Creator();
        private final OverdraftFee accessFee;
        private final OverdraftFee maintenanceFee;
        private final OverdraftFee penaltyFee;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ChargesInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ChargesInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ChargesInfo(OverdraftFee.CREATOR.createFromParcel(parcel), OverdraftFee.CREATOR.createFromParcel(parcel), OverdraftFee.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ChargesInfo[] newArray(int i) {
                return new ChargesInfo[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public ChargesInfo(OverdraftFee overdraftFee, OverdraftFee overdraftFee2, OverdraftFee overdraftFee3) {
            Intrinsics.checkNotNullParameter(overdraftFee, "");
            Intrinsics.checkNotNullParameter(overdraftFee2, "");
            Intrinsics.checkNotNullParameter(overdraftFee3, "");
            this.accessFee = overdraftFee;
            this.maintenanceFee = overdraftFee2;
            this.penaltyFee = overdraftFee3;
        }

        public final OverdraftFee getAccessFee() {
            return this.accessFee;
        }

        public final OverdraftFee getMaintenanceFee() {
            return this.maintenanceFee;
        }

        public final OverdraftFee getPenaltyFee() {
            return this.penaltyFee;
        }

        public static ChargesInfo copy$default(ChargesInfo chargesInfo, OverdraftFee overdraftFee, OverdraftFee overdraftFee2, OverdraftFee overdraftFee3, int i, Object obj) {
            if ((i & 1) != 0) {
                overdraftFee = chargesInfo.accessFee;
            }
            if ((i & 2) != 0) {
                overdraftFee2 = chargesInfo.maintenanceFee;
            }
            if ((i & 4) != 0) {
                overdraftFee3 = chargesInfo.penaltyFee;
            }
            return chargesInfo.copy(overdraftFee, overdraftFee2, overdraftFee3);
        }

        public final OverdraftFee getAccessFee() {
            return this.accessFee;
        }

        public final OverdraftFee getMaintenanceFee() {
            return this.maintenanceFee;
        }

        public final OverdraftFee getPenaltyFee() {
            return this.penaltyFee;
        }

        public final ChargesInfo copy(OverdraftFee accessFee, OverdraftFee maintenanceFee, OverdraftFee penaltyFee) {
            Intrinsics.checkNotNullParameter(accessFee, "");
            Intrinsics.checkNotNullParameter(maintenanceFee, "");
            Intrinsics.checkNotNullParameter(penaltyFee, "");
            return new ChargesInfo(accessFee, maintenanceFee, penaltyFee);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChargesInfo)) {
                return false;
            }
            ChargesInfo chargesInfo = (ChargesInfo) other;
            return Intrinsics.areEqual(this.accessFee, chargesInfo.accessFee) && Intrinsics.areEqual(this.maintenanceFee, chargesInfo.maintenanceFee) && Intrinsics.areEqual(this.penaltyFee, chargesInfo.penaltyFee);
        }

        public int hashCode() {
            return (((this.accessFee.hashCode() * 31) + this.maintenanceFee.hashCode()) * 31) + this.penaltyFee.hashCode();
        }

        public String toString() {
            return "ChargesInfo(accessFee=" + this.accessFee + ", maintenanceFee=" + this.maintenanceFee + ", penaltyFee=" + this.penaltyFee + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            this.accessFee.writeToParcel(dest, flags);
            this.maintenanceFee.writeToParcel(dest, flags);
            this.penaltyFee.writeToParcel(dest, flags);
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.status);
        Double d2 = this.balance;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        }
        Double d3 = this.limit;
        if (d3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d3.doubleValue());
        }
        dest.writeString(this.currency);
        Double d4 = this.dueAmount;
        if (d4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d4.doubleValue());
        }
        dest.writeString(this.dueDate);
        dest.writeString(this.subscribeDate);
        Double d5 = this.takenAmount;
        if (d5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d5.doubleValue());
        }
        LenderInfo lenderInfo = this.lenderInfo;
        if (lenderInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            lenderInfo.writeToParcel(dest, flags);
        }
        ChargesInfo chargesInfo = this.chargesInfo;
        if (chargesInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            chargesInfo.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$OverdraftFee;", "Landroid/os/Parcelable;", "rate", "", "value", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getValue", "component1", "component2", "copy", "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/safaricom/consumer/commons/overdraw/OverdrawInformation$OverdraftFee;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OverdraftFee implements Parcelable {
        public static final Parcelable.Creator<OverdraftFee> CREATOR = new Creator();
        private final Double rate;
        private final Double value;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OverdraftFee> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OverdraftFee createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new OverdraftFee(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final OverdraftFee[] newArray(int i) {
                return new OverdraftFee[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public OverdraftFee(Double d2, Double d3) {
            this.rate = d2;
            this.value = d3;
        }

        public final Double getRate() {
            return this.rate;
        }

        public final Double getValue() {
            return this.value;
        }

        public static OverdraftFee copy$default(OverdraftFee overdraftFee, Double d2, Double d3, int i, Object obj) {
            if ((i & 1) != 0) {
                d2 = overdraftFee.rate;
            }
            if ((i & 2) != 0) {
                d3 = overdraftFee.value;
            }
            return overdraftFee.copy(d2, d3);
        }

        public final Double getRate() {
            return this.rate;
        }

        public final Double getValue() {
            return this.value;
        }

        public final OverdraftFee copy(Double rate, Double value) {
            return new OverdraftFee(rate, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OverdraftFee)) {
                return false;
            }
            OverdraftFee overdraftFee = (OverdraftFee) other;
            return Intrinsics.areEqual((Object) this.rate, (Object) overdraftFee.rate) && Intrinsics.areEqual((Object) this.value, (Object) overdraftFee.value);
        }

        public int hashCode() {
            Double d2 = this.rate;
            int iHashCode = d2 == null ? 0 : d2.hashCode();
            Double d3 = this.value;
            return (iHashCode * 31) + (d3 != null ? d3.hashCode() : 0);
        }

        public String toString() {
            return "OverdraftFee(rate=" + this.rate + ", value=" + this.value + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            Double d2 = this.rate;
            if (d2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeDouble(d2.doubleValue());
            }
            Double d3 = this.value;
            if (d3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeDouble(d3.doubleValue());
            }
        }
    }
}
