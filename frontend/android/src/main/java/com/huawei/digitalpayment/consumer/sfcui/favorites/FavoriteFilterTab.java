package com.huawei.digitalpayment.consumer.sfcui.favorites;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab;", "Landroid/os/Parcelable;", "titleRes", "", "<init>", "(I)V", "getTitleRes", "()I", "Send", "BuyGoods", "Paybill", "Pochi", Keys.PAY_METHOD_AIRTIME, "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab$Airtime;", "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab$BuyGoods;", "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab$Paybill;", "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab$Pochi;", "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab$Send;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FavoriteFilterTab implements Parcelable {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final int titleRes;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab$Send;", "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Send extends FavoriteFilterTab {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault;
        public static final Send INSTANCE = new Send();
        public static final Parcelable.Creator<Send> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Send> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Send createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 85;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Send send = Send.INSTANCE;
                if (i3 == 0) {
                    throw null;
                }
                int i4 = ShareDataUIState + 7;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return send;
            }

            @Override
            public Send createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 87;
                ShareDataUIState = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    createFromParcel(parcel);
                    obj.hashCode();
                    throw null;
                }
                Send sendCreateFromParcel = createFromParcel(parcel);
                int i3 = copydefault + 59;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    return sendCreateFromParcel;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Send[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 87;
                copydefault = i3 % 128;
                Send[] sendArr = new Send[i];
                if (i3 % 2 != 0) {
                    return sendArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Send[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 123;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    newArray(i);
                    throw null;
                }
                Send[] sendArrNewArray = newArray(i);
                int i4 = ShareDataUIState + 27;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return sendArrNewArray;
            }
        }

        private Send() {
            super(R.string.favorites_filter_send, null);
        }

        static {
            int i = copydefault + 11;
            component3 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component1 + 89;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 35;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 90 / 0;
            }
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Send)) {
                int i2 = component1 + 75;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = component1 + 35;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 103;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 74 / 0;
            }
            int i5 = i2 + 25;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return 1493913640;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 83;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 99;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return "Send";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 121;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
            int i4 = component2 + 79;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private FavoriteFilterTab(int i) {
        this.titleRes = i;
    }

    public final int getTitleRes() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.titleRes;
        }
        throw null;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab$BuyGoods;", "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BuyGoods extends FavoriteFilterTab {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final BuyGoods INSTANCE = new BuyGoods();
        public static final Parcelable.Creator<BuyGoods> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BuyGoods> {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BuyGoods createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 93;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                if (i3 != 0) {
                    BuyGoods buyGoods = BuyGoods.INSTANCE;
                    obj.hashCode();
                    throw null;
                }
                BuyGoods buyGoods2 = BuyGoods.INSTANCE;
                int i4 = ShareDataUIState + 11;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return buyGoods2;
                }
                throw null;
            }

            @Override
            public BuyGoods createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 75;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    createFromParcel(parcel);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                BuyGoods buyGoodsCreateFromParcel = createFromParcel(parcel);
                int i3 = copydefault + 53;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return buyGoodsCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BuyGoods[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 9;
                int i4 = i3 % 128;
                copydefault = i4;
                int i5 = i3 % 2;
                BuyGoods[] buyGoodsArr = new BuyGoods[i];
                int i6 = i4 + 19;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return buyGoodsArr;
            }

            @Override
            public BuyGoods[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 63;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BuyGoods[] buyGoodsArrNewArray = newArray(i);
                if (i4 != 0) {
                    int i5 = 41 / 0;
                }
                return buyGoodsArrNewArray;
            }
        }

        private BuyGoods() {
            super(R.string.favorites_filter_buy_goods, null);
        }

        static {
            int i = copydefault + 123;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 13;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 101;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1 + 95;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof BuyGoods) {
                return true;
            }
            int i4 = i3 + 51;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 45;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 61;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return -1092125424;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 13;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 71 / 0;
            }
            int i5 = i2 + 75;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return "BuyGoods";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 85;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component1 + 9;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static {
        int i = 1 + 59;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab$Paybill;", "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Paybill extends FavoriteFilterTab {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;
        public static final Paybill INSTANCE = new Paybill();
        public static final Parcelable.Creator<Paybill> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Paybill> {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Paybill createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 53;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Paybill paybill = Paybill.INSTANCE;
                int i4 = ShareDataUIState + 7;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return paybill;
            }

            @Override
            public Paybill createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 101;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Paybill paybillCreateFromParcel = createFromParcel(parcel);
                if (i3 == 0) {
                    int i4 = 0 / 0;
                }
                int i5 = copydefault + 9;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return paybillCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Paybill[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 67;
                copydefault = i4 % 128;
                Paybill[] paybillArr = new Paybill[i];
                if (i4 % 2 != 0) {
                    int i5 = 56 / 0;
                }
                int i6 = i3 + 23;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return paybillArr;
            }

            @Override
            public Paybill[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 123;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Paybill[] paybillArrNewArray = newArray(i);
                int i5 = copydefault + 7;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 11 / 0;
                }
                return paybillArrNewArray;
            }
        }

        private Paybill() {
            super(R.string.favorites_filter_paybill, null);
        }

        static {
            int i = component3 + 45;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2 + 29;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 99;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (!(!(other instanceof Paybill))) {
                return true;
            }
            int i5 = i2 + 49;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 13;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 87;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return -2036696049;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 87;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 11;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return "Paybill";
            }
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 45;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = copydefault + 21;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public FavoriteFilterTab(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab$Pochi;", "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Pochi extends FavoriteFilterTab {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private static int copydefault;
        public static final Pochi INSTANCE = new Pochi();
        public static final Parcelable.Creator<Pochi> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Pochi> {
            private static int component2 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Pochi createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 21;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Pochi pochi = Pochi.INSTANCE;
                if (i3 == 0) {
                    return pochi;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Pochi createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 41;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Pochi pochiCreateFromParcel = createFromParcel(parcel);
                int i4 = component2 + 51;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return pochiCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Pochi[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 15;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                Pochi[] pochiArr = new Pochi[i];
                int i6 = i4 + 91;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 62 / 0;
                }
                return pochiArr;
            }

            @Override
            public Pochi[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 15;
                component2 = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    newArray(i);
                    obj.hashCode();
                    throw null;
                }
                Pochi[] pochiArrNewArray = newArray(i);
                int i4 = component2 + 13;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return pochiArrNewArray;
                }
                throw null;
            }
        }

        private Pochi() {
            super(R.string.favorites_filter_pochi, null);
        }

        static {
            int i = component3 + 103;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 111;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 63;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                int i5 = i2 + 103;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    return true;
                }
                obj.hashCode();
                throw null;
            }
            if (other instanceof Pochi) {
                return true;
            }
            int i6 = i4 + 49;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 15;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return -935800411;
            }
            int i3 = 60 / 0;
            return -935800411;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 107;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 27;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 0;
            }
            return "Pochi";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = ShareDataUIState + 117;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab$Airtime;", "Lcom/huawei/digitalpayment/consumer/sfcui/favorites/FavoriteFilterTab;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Airtime extends FavoriteFilterTab {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final Airtime INSTANCE = new Airtime();
        public static final Parcelable.Creator<Airtime> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Airtime> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Airtime createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 65;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Airtime airtime = Airtime.INSTANCE;
                if (i3 == 0) {
                    return airtime;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Airtime createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 23;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Airtime airtimeCreateFromParcel = createFromParcel(parcel);
                int i4 = ShareDataUIState + 17;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return airtimeCreateFromParcel;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Airtime[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 19;
                copydefault = i4 % 128;
                Object obj = null;
                Airtime[] airtimeArr = new Airtime[i];
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 43;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return airtimeArr;
                }
                throw null;
            }

            @Override
            public Airtime[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 75;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    newArray(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Airtime[] airtimeArrNewArray = newArray(i);
                int i4 = ShareDataUIState + 19;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return airtimeArrNewArray;
            }
        }

        private Airtime() {
            super(R.string.favorites_filter_airtime, null);
        }

        static {
            int i = component2 + 123;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault + 83;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copydefault + 3;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof Airtime)) {
                int i4 = copydefault + 33;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = copydefault + 83;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 16 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 43;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 1;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return 2053722743;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3 + 75;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 117;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 74 / 0;
            }
            return Keys.PAY_METHOD_AIRTIME;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = copydefault + 69;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component3 + 83;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
