package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen;", "Landroid/os/Parcelable;", "<init>", "()V", "Dashboard", "Create", "Confirm", "DoMore", "Delete", "Close", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen$Close;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen$Confirm;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen$Create;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen$Dashboard;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen$Delete;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen$DoMore;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BillManagerScreen implements Parcelable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component2;

    private BillManagerScreen() {
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen$Dashboard;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dashboard extends BillManagerScreen {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final Dashboard INSTANCE = new Dashboard();
        public static final Parcelable.Creator<Dashboard> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Dashboard> {
            private static int component1 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Dashboard createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 63;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Dashboard dashboard = Dashboard.INSTANCE;
                int i4 = component1 + 11;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return dashboard;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Dashboard createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 63;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Dashboard dashboardCreateFromParcel = createFromParcel(parcel);
                int i4 = component1 + 5;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return dashboardCreateFromParcel;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Dashboard[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 57;
                component1 = i3 % 128;
                Dashboard[] dashboardArr = new Dashboard[i];
                if (i3 % 2 != 0) {
                    return dashboardArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Dashboard[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 17;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Dashboard[] dashboardArrNewArray = newArray(i);
                int i5 = copydefault + 41;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return dashboardArrNewArray;
            }
        }

        private Dashboard() {
            super(null);
        }

        static {
            int i = component3 + 121;
            component2 = i % 128;
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
            int i2 = copydefault;
            int i3 = i2 + 7;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 119;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component1 + 37;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            if (other instanceof Dashboard) {
                return true;
            }
            int i3 = copydefault + 75;
            component1 = i3 % 128;
            return i3 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 115;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 95;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return -897273851;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 89;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 94 / 0;
            }
            int i5 = i2 + 63;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 68 / 0;
            }
            return "Dashboard";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = copydefault + 33;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = copydefault + 23;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static {
        int i = 1 + 59;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public BillManagerScreen(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen$Create;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Create extends BillManagerScreen {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private static int copydefault;
        public static final Create INSTANCE = new Create();
        public static final Parcelable.Creator<Create> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Create> {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Create createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 29;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Create create = Create.INSTANCE;
                if (i3 != 0) {
                    return create;
                }
                throw null;
            }

            @Override
            public Create createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 101;
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
            public final Create[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 75;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                Create[] createArr = new Create[i];
                int i6 = i3 + 119;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return createArr;
            }

            @Override
            public Create[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 37;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    return newArray(i);
                }
                newArray(i);
                throw null;
            }
        }

        private Create() {
            super(null);
        }

        static {
            int i = component2 + 93;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component1 + 115;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = (i2 % 2 == 0 ? 0 : 1) ^ 1;
            int i5 = i3 + 123;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        
            if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerScreen.Create) != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            r6 = (com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerScreen.Create) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        
            r3 = r3 + 91;
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerScreen.Create.component1 = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
        
            if ((r3 % 2) == 0) goto L17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerScreen.Create.component1
                r2 = 1
                int r1 = r1 + r2
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerScreen.Create.component3 = r3
                int r1 = r1 % r0
                r4 = 0
                if (r1 != 0) goto L15
                r1 = 66
                int r1 = r1 / r4
                if (r5 != r6) goto L22
                goto L17
            L15:
                if (r5 != r6) goto L22
            L17:
                int r3 = r3 + 91
                int r6 = r3 % 128
                com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerScreen.Create.component1 = r6
                int r3 = r3 % r0
                if (r3 == 0) goto L21
                r2 = r4
            L21:
                return r2
            L22:
                boolean r0 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerScreen.Create
                if (r0 != 0) goto L27
                return r4
            L27:
                com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerScreen$Create r6 = (com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerScreen.Create) r6
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerScreen.Create.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 41;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 67;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return 1595554091;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 93;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 1;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return "Create";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 83;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
            int i4 = component1 + 57;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen$Confirm;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Confirm extends BillManagerScreen {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final Confirm INSTANCE = new Confirm();
        public static final Parcelable.Creator<Confirm> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Confirm> {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Confirm createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 31;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Confirm confirm = Confirm.INSTANCE;
                int i4 = copydefault + 19;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 38 / 0;
                }
                return confirm;
            }

            @Override
            public Confirm createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 21;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Confirm confirmCreateFromParcel = createFromParcel(parcel);
                int i4 = copydefault + 5;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return confirmCreateFromParcel;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Confirm[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 83;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                Confirm[] confirmArr = new Confirm[i];
                int i6 = i3 + 109;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return confirmArr;
            }

            @Override
            public Confirm[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 37;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    newArray(i);
                    throw null;
                }
                Confirm[] confirmArrNewArray = newArray(i);
                int i4 = component3 + 63;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return confirmArrNewArray;
                }
                throw null;
            }
        }

        private Confirm() {
            super(null);
        }

        static {
            int i = component2 + 23;
            component3 = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component1 + 117;
            copydefault = i2 % 128;
            return i2 % 2 == 0 ? 1 : 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(!(other instanceof Confirm))) {
                return true;
            }
            int i2 = component1;
            int i3 = i2 + 85;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 113;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 89;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 81;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return 2140099697;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 27;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 1;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return "Confirm";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 93;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component1 + 61;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen$DoMore;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DoMore extends BillManagerScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final DoMore INSTANCE = new DoMore();
        public static final Parcelable.Creator<DoMore> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DoMore> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final DoMore createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 69;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                DoMore doMore = DoMore.INSTANCE;
                int i4 = ShareDataUIState + 89;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return doMore;
            }

            @Override
            public DoMore createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 115;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                DoMore doMoreCreateFromParcel = createFromParcel(parcel);
                int i4 = ShareDataUIState + 103;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 26 / 0;
                }
                return doMoreCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final DoMore[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 71;
                ShareDataUIState = i4 % 128;
                DoMore[] doMoreArr = new DoMore[i];
                if (i4 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = i3 + 125;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return doMoreArr;
            }

            @Override
            public DoMore[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 69;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    newArray(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                DoMore[] doMoreArrNewArray = newArray(i);
                int i4 = ShareDataUIState + 81;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return doMoreArrNewArray;
            }
        }

        private DoMore() {
            super(null);
        }

        static {
            int i = component2 + 109;
            copydefault = i % 128;
            if (i % 2 == 0) {
                int i2 = 38 / 0;
            }
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3 + 41;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 55;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 19;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof DoMore) {
                return true;
            }
            int i5 = i2 + 55;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 13;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 != 0) {
                int i4 = 8 / 0;
            }
            int i5 = i3 + 95;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return 1620711087;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3 + 27;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 19;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return "DoMore";
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 53;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen$Delete;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Delete extends BillManagerScreen {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component2 = 1;
        private static int component3;
        private static int copydefault;
        public static final Delete INSTANCE = new Delete();
        public static final Parcelable.Creator<Delete> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Delete> {
            private static int component1 = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Delete createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 39;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Delete delete = Delete.INSTANCE;
                if (i3 == 0) {
                    int i4 = 41 / 0;
                }
                return delete;
            }

            @Override
            public Delete createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 49;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    createFromParcel(parcel);
                    throw null;
                }
                Delete deleteCreateFromParcel = createFromParcel(parcel);
                int i3 = component1 + 1;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return deleteCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Delete[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 45;
                int i4 = i3 % 128;
                component2 = i4;
                int i5 = i3 % 2;
                Delete[] deleteArr = new Delete[i];
                int i6 = i4 + 63;
                component1 = i6 % 128;
                if (i6 % 2 != 0) {
                    return deleteArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Delete[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 119;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    newArray(i);
                    throw null;
                }
                Delete[] deleteArrNewArray = newArray(i);
                int i4 = component1 + 67;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 35 / 0;
                }
                return deleteArrNewArray;
            }
        }

        private Delete() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 61;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3 + 5;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2 == 0 ? 1 : 0;
            int i5 = i3 + 115;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 92 / 0;
            }
            return i4;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 103;
                int i3 = i2 % 128;
                component2 = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 65;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (other instanceof Delete) {
                return true;
            }
            int i7 = component2;
            int i8 = i7 + 89;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 75;
            component3 = i10 % 128;
            if (i10 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 65;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 35;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return 1612389850;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2 + 111;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return "Delete";
            }
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 89;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
            int i4 = component2 + 23;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH×\u0003J\t\u0010\n\u001a\u00020\u0005H×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen$Close;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Close extends BillManagerScreen {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final Close INSTANCE = new Close();
        public static final Parcelable.Creator<Close> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Close> {
            private static int component1 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Close createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 47;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Close close = Close.INSTANCE;
                int i4 = component1 + 101;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return close;
            }

            @Override
            public Close createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 39;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Close closeCreateFromParcel = createFromParcel(parcel);
                int i4 = component3 + 63;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return closeCreateFromParcel;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Close[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 81;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                Close[] closeArr = new Close[i];
                int i6 = i3 + 45;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return closeArr;
            }

            @Override
            public Close[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 97;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Close[] closeArrNewArray = newArray(i);
                int i5 = component3 + 103;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    return closeArrNewArray;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        private Close() {
            super(null);
        }

        static {
            int i = component2 + 33;
            copydefault = i % 128;
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
            int i2 = component3 + 79;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 79;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (!(!(other instanceof Close))) {
                return true;
            }
            int i5 = i2 + 77;
            component3 = i5 % 128;
            return i5 % 2 != 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 39;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 69;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 44 / 0;
            }
            return -1611267095;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 39;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 73;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return "Close";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component1 + 17;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component1 + 45;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
