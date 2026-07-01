package com.huawei.digitalpayment.consumer.sfcui.ui.repository.frequents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.sfc.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0013\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem;", "Landroid/os/Parcelable;", "labelRes", "", "<init>", "(I)V", "getLabelRes", "()I", "APPS", "SEND", "PAY", "BUNDLES", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem$APPS;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem$BUNDLES;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem$PAY;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem$SEND;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FrequentTabItem implements Parcelable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;
    private final int labelRes;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem$APPS;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class APPS extends FrequentTabItem {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;
        public static final APPS INSTANCE = new APPS();
        public static final Parcelable.Creator<APPS> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<APPS> {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final APPS createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 101;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                APPS apps = APPS.INSTANCE;
                int i4 = copydefault + 15;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return apps;
                }
                throw null;
            }

            @Override
            public APPS createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 81;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                APPS appsCreateFromParcel = createFromParcel(parcel);
                if (i3 != 0) {
                    int i4 = 71 / 0;
                }
                int i5 = copydefault + 61;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return appsCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final APPS[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 79;
                int i4 = i3 % 128;
                component3 = i4;
                APPS[] appsArr = new APPS[i];
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 5;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return appsArr;
                }
                throw null;
            }

            @Override
            public APPS[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 83;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                APPS[] appsArrNewArray = newArray(i);
                int i5 = component3 + 29;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 71 / 0;
                }
                return appsArrNewArray;
            }
        }

        private APPS() {
            super(R.string.home_frequents_category_apps, null);
        }

        static {
            int i = ShareDataUIState + 97;
            component3 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault + 117;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 89;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copydefault + 57;
                component1 = i2 % 128;
                return !(i2 % 2 != 0);
            }
            if (!(!(other instanceof APPS))) {
                return true;
            }
            int i3 = component1 + 31;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 117;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 91;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return 1109917146;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 33;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 91;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return "APPS";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = copydefault + 33;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    private FrequentTabItem(int i) {
        this.labelRes = i;
    }

    public final int getLabelRes() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.labelRes;
        int i6 = i2 + 15;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem$SEND;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SEND extends FrequentTabItem {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final SEND INSTANCE = new SEND();
        public static final Parcelable.Creator<SEND> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SEND> {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final SEND createFromParcel(Parcel parcel) {
                SEND send;
                int i = 2 % 2;
                int i2 = copydefault + 93;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                if (i3 == 0) {
                    send = SEND.INSTANCE;
                    int i4 = 61 / 0;
                } else {
                    send = SEND.INSTANCE;
                }
                int i5 = copydefault + 27;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return send;
            }

            @Override
            public SEND createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 67;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                SEND sendCreateFromParcel = createFromParcel(parcel);
                int i4 = copydefault + 23;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return sendCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final SEND[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 47;
                int i4 = i3 % 128;
                component3 = i4;
                SEND[] sendArr = new SEND[i];
                if (i3 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i4 + 77;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return sendArr;
            }

            @Override
            public SEND[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 79;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    return newArray(i);
                }
                newArray(i);
                throw null;
            }
        }

        private SEND() {
            super(R.string.home_frequents_category_send, null);
        }

        static {
            int i = component2 + 13;
            component1 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3 + 19;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 9;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            if (this == other) {
                int i6 = i4 + 95;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (other instanceof SEND) {
                return true;
            }
            int i8 = i2 + 11;
            component3 = i8 % 128;
            if (i8 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 91;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return 1110442736;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 51;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 23;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return "SEND";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 15;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
            int i4 = copydefault + 51;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    static {
        int i = 1 + 7;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem$PAY;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PAY extends FrequentTabItem {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private static int copydefault;
        public static final PAY INSTANCE = new PAY();
        public static final Parcelable.Creator<PAY> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PAY> {
            private static int ShareDataUIState = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final PAY createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 59;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                PAY pay = PAY.INSTANCE;
                int i4 = component3 + 1;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return pay;
            }

            @Override
            public PAY createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 3;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                PAY payCreateFromParcel = createFromParcel(parcel);
                int i4 = component3 + 33;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return payCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final PAY[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 65;
                ShareDataUIState = i4 % 128;
                PAY[] payArr = new PAY[i];
                if (i4 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 41;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return payArr;
            }

            @Override
            public PAY[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 55;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                PAY[] payArrNewArray = newArray(i);
                if (i4 != 0) {
                    int i5 = 86 / 0;
                }
                int i6 = ShareDataUIState + 45;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 55 / 0;
                }
                return payArrNewArray;
            }
        }

        private PAY() {
            super(R.string.home_frequents_category_pay, null);
        }

        static {
            int i = component2 + 119;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 103;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 67;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 77 / 0;
            }
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof PAY) {
                return true;
            }
            int i2 = component1;
            int i3 = i2 + 39;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 29;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 81;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 5;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return 867101728;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 87;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 61;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 94 / 0;
            }
            return "PAY";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 57;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
            int i4 = component3 + 91;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public FrequentTabItem(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem$BUNDLES;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/frequents/model/FrequentTabItem;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BUNDLES extends FrequentTabItem {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault;
        public static final BUNDLES INSTANCE = new BUNDLES();
        public static final Parcelable.Creator<BUNDLES> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BUNDLES> {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BUNDLES createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 119;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                BUNDLES bundles = BUNDLES.INSTANCE;
                int i4 = component3 + 85;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return bundles;
            }

            @Override
            public BUNDLES createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 109;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    createFromParcel(parcel);
                    throw null;
                }
                BUNDLES bundlesCreateFromParcel = createFromParcel(parcel);
                int i3 = component3 + 67;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return bundlesCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final BUNDLES[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 25;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                BUNDLES[] bundlesArr = new BUNDLES[i];
                int i6 = i4 + 99;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 64 / 0;
                }
                return bundlesArr;
            }

            @Override
            public BUNDLES[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 123;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                BUNDLES[] bundlesArrNewArray = newArray(i);
                int i5 = ShareDataUIState + 57;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return bundlesArrNewArray;
            }
        }

        private BUNDLES() {
            super(R.string.home_frequents_category_bundles, null);
        }

        static {
            int i = component2 + 11;
            component1 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault + 65;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 19;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            if (this == other) {
                int i6 = i4 + 71;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(other instanceof BUNDLES)) {
                return false;
            }
            int i8 = i2 + 79;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 53;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 77;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return -383084631;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 53;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 111;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return "BUNDLES";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = copydefault + 47;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = copydefault + 119;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 69 / 0;
            }
        }
    }
}
