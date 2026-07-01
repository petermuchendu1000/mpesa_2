package com.huawei.digitalpayment.consumer.sfcui.sharedata;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.model.DataSharingTypes;
import com.safaricom.designsystem.components.payment.IPaymentOption;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareableDataType;", "Lcom/safaricom/designsystem/components/payment/IPaymentOption;", "", "displayNameStringResource", "", "iconResource", "<init>", "(Ljava/lang/String;III)V", "getDisplayNameStringResource", "()I", "getIconResource", DataSharingTypes.WITH_EXPIRY, DataSharingTypes.NO_EXPIRY, "Postpaid", "Undefined", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareableDataType implements IPaymentOption {
    private static final EnumEntries $ENTRIES;
    private static final ShareableDataType[] $VALUES;
    public static final Parcelable.Creator<ShareableDataType> CREATOR;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final int displayNameStringResource;
    private final int iconResource;
    public static final ShareableDataType ExpiryBundles = new ShareableDataType(DataSharingTypes.WITH_EXPIRY, 0, R.string.with_expiry, R.drawable.icon_bundle_with_expiry);
    public static final ShareableDataType NonExpiryBundles = new ShareableDataType(DataSharingTypes.NO_EXPIRY, 1, R.string.no_expiry_bundles, R.drawable.ic_no_expiry_bundles);
    public static final ShareableDataType Postpaid = new ShareableDataType("Postpaid", 2, R.string.gsm_postpaid, R.drawable.ic_post_pay_balance);
    public static final ShareableDataType Undefined = new ShareableDataType("Undefined", 3, 0, 0);

    private ShareableDataType(String str, int i, int i2, int i3) {
        this.displayNameStringResource = i2;
        this.iconResource = i3;
    }

    @Override
    public int getDisplayNameStringResource() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 23;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.displayNameStringResource;
        int i6 = i2 + 117;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 32 / 0;
        }
        return i5;
    }

    @Override
    public int getIconResource() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.iconResource;
        int i6 = i2 + 25;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ShareableDataType[] shareableDataTypeArr$values = $values();
        $VALUES = shareableDataTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(shareableDataTypeArr$values);
        CREATOR = new Parcelable.Creator<ShareableDataType>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ShareableDataType createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component1 + 109;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                ShareableDataType shareableDataTypeValueOf = ShareableDataType.valueOf(parcel.readString());
                int i4 = ShareDataUIState + 47;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return shareableDataTypeValueOf;
                }
                throw null;
            }

            @Override
            public ShareableDataType createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 59;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ShareableDataType shareableDataTypeCreateFromParcel = createFromParcel(parcel);
                int i4 = component1 + 107;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 59 / 0;
                }
                return shareableDataTypeCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ShareableDataType[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 3;
                component1 = i3 % 128;
                ShareableDataType[] shareableDataTypeArr = new ShareableDataType[i];
                if (i3 % 2 != 0) {
                    return shareableDataTypeArr;
                }
                throw null;
            }

            @Override
            public ShareableDataType[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 19;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                ShareableDataType[] shareableDataTypeArrNewArray = newArray(i);
                if (i4 == 0) {
                    int i5 = 21 / 0;
                }
                return shareableDataTypeArrNewArray;
            }
        };
        int i = component3 + 45;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static ShareableDataType valueOf(String str) {
        ShareableDataType shareableDataType;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            shareableDataType = (ShareableDataType) Enum.valueOf(ShareableDataType.class, str);
            int i3 = 54 / 0;
        } else {
            shareableDataType = (ShareableDataType) Enum.valueOf(ShareableDataType.class, str);
        }
        int i4 = ShareDataUIState + 97;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return shareableDataType;
    }

    public static ShareableDataType[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return (ShareableDataType[]) $VALUES.clone();
        }
        int i3 = 23 / 0;
        return (ShareableDataType[]) $VALUES.clone();
    }

    private static final ShareableDataType[] $values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 67;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ShareableDataType[] shareableDataTypeArr = {ExpiryBundles, NonExpiryBundles, Postpaid, Undefined};
        int i5 = i2 + 19;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return shareableDataTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<ShareableDataType> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 89;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(name());
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
