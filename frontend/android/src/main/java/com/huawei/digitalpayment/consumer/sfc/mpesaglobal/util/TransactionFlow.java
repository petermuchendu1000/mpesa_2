package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow;", "Landroid/os/Parcelable;", "<init>", "()V", "initiationType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/InitiationType;", "getInitiationType", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/InitiationType;", "isInteractive", "", "()Z", "Regular", "AppLink", "Announcement", "CostEstimation", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow$Announcement;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow$AppLink;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow$CostEstimation;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow$Regular;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TransactionFlow implements Parcelable {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component2 = 1;

    public abstract InitiationType getInitiationType();

    public abstract boolean isInteractive();

    private TransactionFlow() {
    }

    static {
        int i = 1 + 3;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TransactionFlow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow$Regular;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow;", "<init>", "()V", "initiationType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/InitiationType;", "getInitiationType", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/InitiationType;", "isInteractive", "", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Regular extends TransactionFlow {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component2 = 1;
        private static int component3;
        private static int copydefault;
        public static final Regular INSTANCE = new Regular();
        private static final InitiationType initiationType = InitiationType.MANUAL;
        private static final boolean isInteractive = true;
        public static final Parcelable.Creator<Regular> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Regular> {
            private static int component1 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Regular createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 99;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                Regular regular = Regular.INSTANCE;
                if (i3 != 0) {
                    int i4 = 35 / 0;
                }
                return regular;
            }

            @Override
            public Regular createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 119;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Regular regularCreateFromParcel = createFromParcel(parcel);
                int i4 = component3 + 53;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 46 / 0;
                }
                return regularCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Regular[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 67;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                Regular[] regularArr = new Regular[i];
                int i6 = i4 + 33;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return regularArr;
            }

            @Override
            public Regular[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 11;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Regular[] regularArrNewArray = newArray(i);
                int i5 = component1 + 37;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return regularArrNewArray;
            }
        }

        private Regular() {
            super(null);
        }

        static {
            int i = copydefault + 113;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        @Override
        public InitiationType getInitiationType() {
            int i = 2 % 2;
            int i2 = component2 + 71;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            InitiationType initiationType2 = initiationType;
            int i4 = i3 + 27;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 99 / 0;
            }
            return initiationType2;
        }

        @Override
        public boolean isInteractive() {
            int i = 2 % 2;
            int i2 = component2 + 59;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return isInteractive;
            }
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2 + 45;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2 != 0 ? 1 : 0;
            int i5 = i3 + 113;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(i3 == 0 ? 0 : 1);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0013\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0013H×\u0001J\t\u0010\u0018\u001a\u00020\u0004H×\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013H\u0007R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow$AppLink;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow;", "deepLinkData", "", "", "<init>", "(Ljava/util/Map;)V", "getDeepLinkData", "()Ljava/util/Map;", "initiationType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/InitiationType;", "getInitiationType", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/InitiationType;", "isInteractive", "", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AppLink extends TransactionFlow {
        public static final int $stable = 8;
        public static final Parcelable.Creator<AppLink> CREATOR = new Creator();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 1;
        private static int copydefault;
        private final Map<String, String> deepLinkData;
        private final InitiationType initiationType;
        private final boolean isInteractive;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AppLink> {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AppLink createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                int i3 = component2 + 33;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 0;
                while (i5 != i2) {
                    int i6 = component2 + 123;
                    ShareDataUIState = i6 % 128;
                    if (i6 % 2 != 0) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                        i5 += 54;
                    } else {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                        i5++;
                    }
                }
                return new AppLink(linkedHashMap);
            }

            @Override
            public AppLink createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 77;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    createFromParcel(parcel);
                    throw null;
                }
                AppLink appLinkCreateFromParcel = createFromParcel(parcel);
                int i3 = ShareDataUIState + 51;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return appLinkCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AppLink[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 39;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                AppLink[] appLinkArr = new AppLink[i];
                int i6 = i3 + 69;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 25 / 0;
                }
                return appLinkArr;
            }

            @Override
            public AppLink[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 97;
                component2 = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    newArray(i);
                    obj.hashCode();
                    throw null;
                }
                AppLink[] appLinkArrNewArray = newArray(i);
                int i4 = ShareDataUIState + 57;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return appLinkArrNewArray;
                }
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppLink(Map<String, String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            this.deepLinkData = map;
            this.initiationType = InitiationType.APP_LINK;
            this.isInteractive = true;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public AppLink(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                int i2 = component3 + 79;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                map = MapsKt.emptyMap();
                int i4 = ShareDataUIState + 115;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            }
            this(map);
        }

        public final Map<String, String> getDeepLinkData() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 59;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            Map<String, String> map = this.deepLinkData;
            int i5 = i3 + 121;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return map;
        }

        @Override
        public InitiationType getInitiationType() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 63;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            InitiationType initiationType = this.initiationType;
            int i5 = i3 + 119;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return initiationType;
        }

        @Override
        public boolean isInteractive() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 115;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.isInteractive;
            int i5 = i2 + 23;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 6 / 0;
            }
            return z;
        }

        static {
            int i = copydefault + 115;
            component1 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AppLink() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static AppLink copy$default(AppLink appLink, Map map, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component3 + 3;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 75;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    Map<String, String> map2 = appLink.deepLinkData;
                    throw null;
                }
                map = appLink.deepLinkData;
            }
            return appLink.copy(map);
        }

        public final Map<String, String> component1() {
            int i = 2 % 2;
            int i2 = component3 + 5;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            Map<String, String> map = this.deepLinkData;
            int i5 = i3 + 59;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return map;
        }

        public final AppLink copy(Map<String, String> deepLinkData) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(deepLinkData, "");
            AppLink appLink = new AppLink(deepLinkData);
            int i2 = component3 + 101;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return appLink;
            }
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 87;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 57;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 99;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 90 / 0;
                }
                return true;
            }
            if (!(!(other instanceof AppLink))) {
                if (!Intrinsics.areEqual(this.deepLinkData, ((AppLink) other).deepLinkData)) {
                    return false;
                }
                int i4 = ShareDataUIState + 31;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = ShareDataUIState + 95;
            int i7 = i6 % 128;
            component3 = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 103;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 51;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.deepLinkData.hashCode();
            int i4 = ShareDataUIState + 7;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "AppLink(deepLinkData=" + this.deepLinkData + ')';
            int i2 = ShareDataUIState + 21;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            Map<String, String> map = this.deepLinkData;
            dest.writeInt(map.size());
            int i2 = component3 + 103;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                int i4 = component3 + 121;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                dest.writeString(entry.getKey());
                dest.writeString(entry.getValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0013\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0012H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow$Announcement;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow;", "announcementId", "", "<init>", "(Ljava/lang/String;)V", "getAnnouncementId", "()Ljava/lang/String;", "initiationType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/InitiationType;", "getInitiationType", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/InitiationType;", "isInteractive", "", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Announcement extends TransactionFlow {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Announcement> CREATOR = new Creator();
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;
        private final String announcementId;
        private final InitiationType initiationType;
        private final boolean isInteractive;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Announcement> {
            private static int component1 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Announcement createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Announcement announcement = new Announcement(parcel.readString());
                int i2 = copydefault + 113;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return announcement;
            }

            @Override
            public Announcement createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 89;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return createFromParcel(parcel);
                }
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Announcement[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 117;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                Announcement[] announcementArr = new Announcement[i];
                int i6 = i3 + 3;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 19 / 0;
                }
                return announcementArr;
            }

            @Override
            public Announcement[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 55;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Announcement[] announcementArrNewArray = newArray(i);
                int i5 = component1 + 23;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return announcementArrNewArray;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Announcement(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.announcementId = str;
            this.initiationType = InitiationType.ANNOUNCEMENT;
            this.isInteractive = true;
        }

        public final String getAnnouncementId() {
            int i = 2 % 2;
            int i2 = component3 + 95;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.announcementId;
            if (i3 == 0) {
                int i4 = 24 / 0;
            }
            return str;
        }

        @Override
        public InitiationType getInitiationType() {
            int i = 2 % 2;
            int i2 = component3 + 113;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            InitiationType initiationType = this.initiationType;
            if (i3 == 0) {
                int i4 = 33 / 0;
            }
            return initiationType;
        }

        @Override
        public boolean isInteractive() {
            int i = 2 % 2;
            int i2 = component2 + 15;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            boolean z = this.isInteractive;
            int i5 = i3 + 67;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = component1 + 39;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public static Announcement copy$default(Announcement announcement, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component3 + 69;
            int i4 = i3 % 128;
            component2 = i4;
            if (i3 % 2 != 0 && (i & 1) != 0) {
                int i5 = i4 + 71;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                str = announcement.announcementId;
            }
            Announcement announcementCopy = announcement.copy(str);
            int i7 = component2 + 7;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return announcementCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 21;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.announcementId;
            int i5 = i2 + 117;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Announcement copy(String announcementId) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(announcementId, "");
            Announcement announcement = new Announcement(announcementId);
            int i2 = component2 + 113;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return announcement;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3 + 37;
            component2 = i2 % 128;
            return 1 ^ (i2 % 2 == 0 ? 0 : 1);
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 37;
            int i4 = i3 % 128;
            component3 = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                int i5 = i2 + 75;
                component3 = i5 % 128;
                return i5 % 2 == 0;
            }
            if (!(other instanceof Announcement)) {
                int i6 = i4 + 113;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.announcementId, ((Announcement) other).announcementId)) {
                int i8 = component2 + 35;
                component3 = i8 % 128;
                return i8 % 2 != 0;
            }
            int i9 = component3 + 71;
            component2 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 47 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 33;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.announcementId;
            if (i3 != 0) {
                return str.hashCode();
            }
            str.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Announcement(announcementId=" + this.announcementId + ')';
            int i2 = component3 + 7;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 103;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.announcementId);
            int i4 = component3 + 83;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow$CostEstimation;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow;", "<init>", "()V", "initiationType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/InitiationType;", "getInitiationType", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/InitiationType;", "isInteractive", "", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CostEstimation extends TransactionFlow {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private static int copydefault = 0;
        private static final boolean isInteractive = false;
        public static final CostEstimation INSTANCE = new CostEstimation();
        private static final InitiationType initiationType = InitiationType.MANUAL;
        public static final Parcelable.Creator<CostEstimation> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CostEstimation> {
            private static int ShareDataUIState = 1;
            private static int component1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CostEstimation createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 95;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                CostEstimation costEstimation = CostEstimation.INSTANCE;
                int i4 = ShareDataUIState + 11;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return costEstimation;
            }

            @Override
            public CostEstimation createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 99;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                CostEstimation costEstimationCreateFromParcel = createFromParcel(parcel);
                int i4 = ShareDataUIState + 15;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return costEstimationCreateFromParcel;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CostEstimation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 105;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                CostEstimation[] costEstimationArr = new CostEstimation[i];
                int i6 = i4 + 91;
                component1 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 45 / 0;
                }
                return costEstimationArr;
            }

            @Override
            public CostEstimation[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 27;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    newArray(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CostEstimation[] costEstimationArrNewArray = newArray(i);
                int i4 = ShareDataUIState + 41;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 17 / 0;
                }
                return costEstimationArrNewArray;
            }
        }

        private CostEstimation() {
            super(null);
        }

        static {
            int i = copydefault + 103;
            component3 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        @Override
        public InitiationType getInitiationType() {
            int i = 2 % 2;
            int i2 = component2 + 43;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            InitiationType initiationType2 = initiationType;
            int i5 = i3 + 1;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return initiationType2;
        }

        @Override
        public boolean isInteractive() {
            int i = 2 % 2;
            int i2 = component2 + 89;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            boolean z = isInteractive;
            if (i3 != 0) {
                int i4 = 48 / 0;
            }
            return z;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2 + 75;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 115;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 29;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
            int i4 = component2 + 85;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 53 / 0;
            }
        }
    }
}
