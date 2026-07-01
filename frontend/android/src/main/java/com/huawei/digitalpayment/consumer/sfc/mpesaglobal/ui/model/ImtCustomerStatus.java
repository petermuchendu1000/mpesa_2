package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/ImtCustomerStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Active", "Inactive", "Unknown", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImtCustomerStatus implements Parcelable {
    private static final EnumEntries $ENTRIES;
    private static final ImtCustomerStatus[] $VALUES;
    public static final Parcelable.Creator<ImtCustomerStatus> CREATOR;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    public static final ImtCustomerStatus Active = new ImtCustomerStatus("Active", 0);
    public static final ImtCustomerStatus Inactive = new ImtCustomerStatus("Inactive", 1);
    public static final ImtCustomerStatus Unknown = new ImtCustomerStatus("Unknown", 2);

    private ImtCustomerStatus(String str, int i) {
    }

    static {
        ImtCustomerStatus[] imtCustomerStatusArr$values = $values();
        $VALUES = imtCustomerStatusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(imtCustomerStatusArr$values);
        CREATOR = new Parcelable.Creator<ImtCustomerStatus>() {
            private static int component2 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ImtCustomerStatus createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 61;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                ImtCustomerStatus imtCustomerStatusValueOf = ImtCustomerStatus.valueOf(parcel.readString());
                int i4 = copydefault + 65;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 6 / 0;
                }
                return imtCustomerStatusValueOf;
            }

            @Override
            public ImtCustomerStatus createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 79;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ImtCustomerStatus imtCustomerStatusCreateFromParcel = createFromParcel(parcel);
                int i4 = copydefault + 7;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return imtCustomerStatusCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ImtCustomerStatus[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 63;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                ImtCustomerStatus[] imtCustomerStatusArr = new ImtCustomerStatus[i];
                int i6 = i3 + 47;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return imtCustomerStatusArr;
            }

            @Override
            public ImtCustomerStatus[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 15;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                ImtCustomerStatus[] imtCustomerStatusArrNewArray = newArray(i);
                int i5 = copydefault + 31;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return imtCustomerStatusArrNewArray;
                }
                throw null;
            }
        };
        int i = component1 + 97;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static ImtCustomerStatus valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return (ImtCustomerStatus) Enum.valueOf(ImtCustomerStatus.class, str);
        }
        throw null;
    }

    public static ImtCustomerStatus[] values() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ImtCustomerStatus[] imtCustomerStatusArr = (ImtCustomerStatus[]) $VALUES.clone();
        int i3 = component3 + 1;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return imtCustomerStatusArr;
        }
        throw null;
    }

    private static final ImtCustomerStatus[] $values() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return new ImtCustomerStatus[]{Active, Inactive, Unknown};
        }
        ImtCustomerStatus imtCustomerStatus = Active;
        ImtCustomerStatus imtCustomerStatus2 = Inactive;
        ImtCustomerStatus imtCustomerStatus3 = Unknown;
        ImtCustomerStatus[] imtCustomerStatusArr = new ImtCustomerStatus[2];
        imtCustomerStatusArr[1] = imtCustomerStatus;
        imtCustomerStatusArr[1] = imtCustomerStatus2;
        imtCustomerStatusArr[3] = imtCustomerStatus3;
        return imtCustomerStatusArr;
    }

    public static EnumEntries<ImtCustomerStatus> getEntries() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 83;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        EnumEntries<ImtCustomerStatus> enumEntries = $ENTRIES;
        int i4 = i2 + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return enumEntries;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(name());
        int i4 = component2 + 17;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
