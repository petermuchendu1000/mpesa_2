package com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/recipient/RecipientType;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/recipient/IRecipientType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SELF", "OTHER", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RecipientType implements IRecipientType, Parcelable {
    private static final EnumEntries $ENTRIES;
    private static final RecipientType[] $VALUES;
    public static final Parcelable.Creator<RecipientType> CREATOR;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("SELF")
    public static final RecipientType SELF = new RecipientType("SELF", 0) {
        private static int component3 = 1;
        private static int copydefault;
        private final String buttonName = "";
        private final String displayName = "Own Number";
        private final boolean enabled = true;

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        public final String getButtonName() {
            int i = 2 % 2;
            int i2 = copydefault + 125;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            String str = this.buttonName;
            int i5 = i3 + 55;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override
        public String getComponent2() {
            int i = 2 % 2;
            int i2 = component3 + 109;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.displayName;
            int i5 = i3 + 111;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public boolean getComponent3() {
            int i = 2 % 2;
            int i2 = component3 + 81;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            boolean z = this.enabled;
            int i5 = i3 + 115;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }
    };

    @SerializedName("OTHER")
    public static final RecipientType OTHER = new RecipientType("OTHER", 1) {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private final String buttonName = "";
        private final String displayName = "Other Number";
        private final boolean enabled = true;

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        public final String getButtonName() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 17;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.buttonName;
            int i5 = i3 + 49;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        @Override
        public String getComponent2() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 13;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.displayName;
            if (i3 == 0) {
                int i4 = 14 / 0;
            }
            return str;
        }

        @Override
        public boolean getComponent3() {
            int i = 2 % 2;
            int i2 = component2 + 119;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            boolean z = this.enabled;
            int i5 = i3 + 97;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 81 / 0;
            }
            return z;
        }
    };

    private RecipientType(String str, int i) {
    }

    @Override
    public String getCopydefault() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return name();
        }
        name();
        throw null;
    }

    static {
        RecipientType[] recipientTypeArr$values = $values();
        $VALUES = recipientTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(recipientTypeArr$values);
        CREATOR = new Parcelable.Creator<RecipientType>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final RecipientType createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 99;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                if (i3 == 0) {
                    RecipientType.valueOf(string);
                    throw null;
                }
                RecipientType recipientTypeValueOf = RecipientType.valueOf(string);
                int i4 = component2 + 35;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return recipientTypeValueOf;
            }

            @Override
            public RecipientType createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 83;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                RecipientType recipientTypeCreateFromParcel = createFromParcel(parcel);
                int i4 = ShareDataUIState + 63;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 84 / 0;
                }
                return recipientTypeCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final RecipientType[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 69;
                ShareDataUIState = i4 % 128;
                RecipientType[] recipientTypeArr = new RecipientType[i];
                if (i4 % 2 == 0) {
                    throw null;
                }
                int i5 = i3 + 39;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 9 / 0;
                }
                return recipientTypeArr;
            }

            @Override
            public RecipientType[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 27;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                RecipientType[] recipientTypeArrNewArray = newArray(i);
                int i5 = ShareDataUIState + 31;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 72 / 0;
                }
                return recipientTypeArrNewArray;
            }
        };
        int i = ShareDataUIState + 27;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 14 / 0;
        }
    }

    public static RecipientType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 113;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RecipientType recipientType = (RecipientType) Enum.valueOf(RecipientType.class, str);
        int i4 = component1 + 107;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return recipientType;
    }

    public static RecipientType[] values() {
        RecipientType[] recipientTypeArr;
        int i = 2 % 2;
        int i2 = component1 + 79;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            recipientTypeArr = (RecipientType[]) $VALUES.clone();
            int i3 = 36 / 0;
        } else {
            recipientTypeArr = (RecipientType[]) $VALUES.clone();
        }
        int i4 = component1 + 31;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return recipientTypeArr;
    }

    private static final RecipientType[] $values() {
        RecipientType[] recipientTypeArr;
        int i = 2 % 2;
        int i2 = component3 + 17;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            RecipientType recipientType = SELF;
            RecipientType recipientType2 = OTHER;
            recipientTypeArr = new RecipientType[5];
            recipientTypeArr[0] = recipientType;
            recipientTypeArr[1] = recipientType2;
        } else {
            recipientTypeArr = new RecipientType[]{SELF, OTHER};
        }
        int i4 = i3 + 69;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return recipientTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RecipientType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<RecipientType> getEntries() {
        EnumEntries<RecipientType> enumEntries;
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            enumEntries = $ENTRIES;
            int i4 = 25 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 57;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(name());
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
