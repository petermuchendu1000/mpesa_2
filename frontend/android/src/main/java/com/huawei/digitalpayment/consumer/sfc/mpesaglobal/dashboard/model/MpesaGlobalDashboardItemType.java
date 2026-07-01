package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItemType;", "Landroid/os/Parcelable;", "<init>", "()V", "Transaction", "MiniApp", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItemType$MiniApp;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItemType$Transaction;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MpesaGlobalDashboardItemType implements Parcelable {
    public static final int $stable = 0;
    private static int component3 = 1;
    private static int copydefault;

    private MpesaGlobalDashboardItemType() {
    }

    static {
        int i = 1 + 33;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MpesaGlobalDashboardItemType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItemType$Transaction;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItemType;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Transaction extends MpesaGlobalDashboardItemType {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final Transaction INSTANCE = new Transaction();
        public static final Parcelable.Creator<Transaction> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Transaction> {
            private static int component1 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Transaction createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 71;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                if (i3 == 0) {
                    return Transaction.INSTANCE;
                }
                Transaction transaction = Transaction.INSTANCE;
                throw null;
            }

            @Override
            public Transaction createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 81;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Transaction transactionCreateFromParcel = createFromParcel(parcel);
                int i4 = copydefault + 7;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return transactionCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Transaction[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 97;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                Transaction[] transactionArr = new Transaction[i];
                int i6 = i4 + 9;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return transactionArr;
            }

            @Override
            public Transaction[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 45;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Transaction[] transactionArrNewArray = newArray(i);
                if (i4 == 0) {
                    int i5 = 87 / 0;
                }
                int i6 = copydefault + 121;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                return transactionArrNewArray;
            }
        }

        private Transaction() {
            super(null);
        }

        static {
            int i = copydefault + 65;
            component3 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component1 + 87;
            component2 = i2 % 128;
            return i2 % 2 == 0 ? 1 : 0;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 43;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component1 + 7;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItemType$MiniApp;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItemType;", "miniAppId", "", "miniAppName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMiniAppId", "()Ljava/lang/String;", "getMiniAppName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MiniApp extends MpesaGlobalDashboardItemType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<MiniApp> CREATOR = new Creator();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 1;
        private static int component3;
        private final String miniAppId;
        private final String miniAppName;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MiniApp> {
            private static int component1 = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MiniApp createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                MiniApp miniApp = new MiniApp(parcel.readString(), parcel.readString());
                int i2 = component1 + 119;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    return miniApp;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public MiniApp createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 57;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                MiniApp miniAppCreateFromParcel = createFromParcel(parcel);
                int i4 = component2 + 61;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return miniAppCreateFromParcel;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final MiniApp[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 89;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                MiniApp[] miniAppArr = new MiniApp[i];
                int i6 = i3 + 15;
                component1 = i6 % 128;
                if (i6 % 2 != 0) {
                    return miniAppArr;
                }
                throw null;
            }

            @Override
            public MiniApp[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 47;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                MiniApp[] miniAppArrNewArray = newArray(i);
                if (i4 == 0) {
                    int i5 = 19 / 0;
                }
                return miniAppArrNewArray;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniApp(String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.miniAppId = str;
            this.miniAppName = str2;
        }

        public final String getMiniAppId() {
            int i = 2 % 2;
            int i2 = component3 + 19;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.miniAppId;
            int i4 = i3 + 55;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String getMiniAppName() {
            int i = 2 % 2;
            int i2 = component1 + 31;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.miniAppName;
            int i4 = i3 + 101;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 49 / 0;
            }
            return str;
        }

        static {
            int i = component2 + 51;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public static MiniApp copy$default(MiniApp miniApp, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component3 + 99;
            int i4 = i3 % 128;
            component1 = i4;
            if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
                str = miniApp.miniAppId;
            }
            if ((i & 2) != 0) {
                int i5 = i4 + 35;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    String str3 = miniApp.miniAppName;
                    throw null;
                }
                str2 = miniApp.miniAppName;
            }
            return miniApp.copy(str, str2);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component3 + 41;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            String str = this.miniAppId;
            int i5 = i3 + 13;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String component2() {
            String str;
            int i = 2 % 2;
            int i2 = component3 + 121;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 == 0) {
                str = this.miniAppName;
                int i4 = 40 / 0;
            } else {
                str = this.miniAppName;
            }
            int i5 = i3 + 89;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final MiniApp copy(String miniAppId, String miniAppName) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(miniAppId, "");
            Intrinsics.checkNotNullParameter(miniAppName, "");
            MiniApp miniApp = new MiniApp(miniAppId, miniAppName);
            int i2 = component1 + 49;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return miniApp;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 103;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 119;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component1 + 117;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return true;
                }
                throw null;
            }
            if (!(other instanceof MiniApp)) {
                return false;
            }
            MiniApp miniApp = (MiniApp) other;
            if (!Intrinsics.areEqual(this.miniAppId, miniApp.miniAppId)) {
                return false;
            }
            if (Intrinsics.areEqual(this.miniAppName, miniApp.miniAppName)) {
                return true;
            }
            int i3 = component3 + 101;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 37;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.miniAppId.hashCode() * 31) + this.miniAppName.hashCode();
            int i4 = component1 + 5;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MiniApp(miniAppId=" + this.miniAppId + ", miniAppName=" + this.miniAppName + ')';
            int i2 = component3 + 89;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 105;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            if (i3 != 0) {
                dest.writeString(this.miniAppId);
                dest.writeString(this.miniAppName);
                int i4 = 55 / 0;
            } else {
                dest.writeString(this.miniAppId);
                dest.writeString(this.miniAppName);
            }
            int i5 = component1 + 73;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
