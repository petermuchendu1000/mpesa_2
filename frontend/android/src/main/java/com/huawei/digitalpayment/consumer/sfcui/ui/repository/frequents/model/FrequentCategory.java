package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model.FrequentTabItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory;", "Landroid/os/Parcelable;", "title", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem;)V", "getTitle", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem;", "Apps", "Send", "Pay", "Bundles", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory$Apps;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory$Bundles;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory$Pay;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory$Send;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FrequentCategory implements Parcelable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 115 % 128;
    private static int component2 = 1;
    private static int copydefault;
    private final FrequentTabItem title;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory$Apps;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Apps extends FrequentCategory {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int component3;
        public static final Apps INSTANCE = new Apps();
        public static final Parcelable.Creator<Apps> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Apps> {
            private static int component1 = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Apps createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 61;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Apps apps = Apps.INSTANCE;
                int i4 = component1 + 51;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 13 / 0;
                }
                return apps;
            }

            @Override
            public Apps createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 109;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Apps appsCreateFromParcel = createFromParcel(parcel);
                int i4 = component1 + 93;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 11 / 0;
                }
                return appsCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Apps[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 103;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                Apps[] appsArr = new Apps[i];
                int i6 = i4 + 19;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return appsArr;
            }

            @Override
            public Apps[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 17;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Apps[] appsArrNewArray = newArray(i);
                int i5 = component2 + 43;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return appsArrNewArray;
            }
        }

        private Apps() {
            super(FrequentTabItem.APPS.INSTANCE, null);
        }

        static {
            int i = component2 + 95;
            component1 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 79;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 51;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 6 / 0;
            }
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 115;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            if (this == other) {
                int i6 = i4 + 53;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(other instanceof Apps)) {
                return false;
            }
            int i8 = i2 + 69;
            component3 = i8 % 128;
            if (i8 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 65;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 21;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return 1794893888;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 65;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return "Apps";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 37;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    private FrequentCategory(FrequentTabItem frequentTabItem) {
        this.title = frequentTabItem;
    }

    public final FrequentTabItem getTitle() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        FrequentTabItem frequentTabItem = this.title;
        int i5 = i3 + 1;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return frequentTabItem;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory$Send;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Send extends FrequentCategory {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        public static final Send INSTANCE = new Send();
        public static final Parcelable.Creator<Send> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Send> {
            private static int component2 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Send createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 23;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Send send = Send.INSTANCE;
                int i4 = component2 + 9;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return send;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Send createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 35;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Send sendCreateFromParcel = createFromParcel(parcel);
                int i4 = component2 + 113;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return sendCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Send[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 23;
                component2 = i3 % 128;
                Send[] sendArr = new Send[i];
                if (i3 % 2 == 0) {
                    int i4 = 70 / 0;
                }
                return sendArr;
            }

            @Override
            public Send[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 17;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    newArray(i);
                    throw null;
                }
                Send[] sendArrNewArray = newArray(i);
                int i4 = component2 + 31;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return sendArrNewArray;
                }
                obj.hashCode();
                throw null;
            }
        }

        private Send() {
            super(FrequentTabItem.SEND.INSTANCE, null);
        }

        static {
            int i = ShareDataUIState + 17;
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
            int i2 = component2 + 89;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2 != 0 ? 1 : 0;
            int i5 = i3 + 113;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return i4;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 77;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof Send) {
                return true;
            }
            int i5 = i2 + 57;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 45;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return 1795419478;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 85;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return "Send";
            }
            int i3 = 46 / 0;
            return "Send";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 61;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component1 + 17;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static {
        int i = 115 % 2;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory$Pay;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Pay extends FrequentCategory {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final Pay INSTANCE = new Pay();
        public static final Parcelable.Creator<Pay> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Pay> {
            private static int component3 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Pay createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 39;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Pay pay = Pay.INSTANCE;
                int i4 = copydefault + 53;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return pay;
            }

            @Override
            public Pay createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 71;
                component3 = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    createFromParcel(parcel);
                    throw null;
                }
                Pay payCreateFromParcel = createFromParcel(parcel);
                int i3 = component3 + 7;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return payCreateFromParcel;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Pay[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 13;
                int i4 = i3 % 128;
                copydefault = i4;
                int i5 = i3 % 2;
                Pay[] payArr = new Pay[i];
                int i6 = i4 + 17;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return payArr;
            }

            @Override
            public Pay[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 99;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return newArray(i);
                }
                newArray(i);
                throw null;
            }
        }

        private Pay() {
            super(FrequentTabItem.PAY.INSTANCE, null);
        }

        static {
            int i = component3 + 117;
            component2 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component1 + 29;
            copydefault = i2 % 128;
            return i2 % 2 == 0 ? 1 : 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copydefault + 49;
                component1 = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(other instanceof Pay)) {
                return false;
            }
            int i3 = component1 + 7;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 89;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 47;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return -80633574;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 87;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 117;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return "Pay";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 103;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    public FrequentCategory(FrequentTabItem frequentTabItem, DefaultConstructorMarker defaultConstructorMarker) {
        this(frequentTabItem);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory$Bundles;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentCategory;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Bundles extends FrequentCategory {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault;
        public static final Bundles INSTANCE = new Bundles();
        public static final Parcelable.Creator<Bundles> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Bundles> {
            private static int component2 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Bundles createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 23;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                if (i3 != 0) {
                    return Bundles.INSTANCE;
                }
                Bundles bundles = Bundles.INSTANCE;
                throw null;
            }

            @Override
            public Bundles createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 89;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Bundles bundlesCreateFromParcel = createFromParcel(parcel);
                int i4 = component3 + 69;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return bundlesCreateFromParcel;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Bundles[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 111;
                int i4 = i3 % 128;
                component3 = i4;
                Bundles[] bundlesArr = new Bundles[i];
                if (i3 % 2 != 0) {
                    int i5 = 8 / 0;
                }
                int i6 = i4 + 77;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 88 / 0;
                }
                return bundlesArr;
            }

            @Override
            public Bundles[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 113;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    newArray(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Bundles[] bundlesArrNewArray = newArray(i);
                int i4 = component2 + 123;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return bundlesArrNewArray;
            }
        }

        private Bundles() {
            super(FrequentTabItem.BUNDLES.INSTANCE, null);
        }

        static {
            int i = component1 + 63;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault + 93;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 7;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this != other) {
                if (!(!(other instanceof Bundles))) {
                    return true;
                }
                int i2 = copydefault + 23;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = copydefault;
            int i5 = i4 + 39;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 5;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 85;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 9;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 24 / 0;
            }
            return 369444771;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 93;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 25;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return "Bundles";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = copydefault + 91;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
        }
    }
}
