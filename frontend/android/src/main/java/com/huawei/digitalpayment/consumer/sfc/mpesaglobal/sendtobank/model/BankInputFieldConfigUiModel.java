package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003Jy\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÇ\u0001J\b\u0010'\u001a\u00020\u000eH\u0007J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H×\u0003J\t\u0010,\u001a\u00020\u000eH×\u0001J\t\u0010-\u001a\u00020\u0003H×\u0001J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u000eH\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/model/BankInputFieldConfigUiModel;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "length", "name", "key", "required", "type", "value", "options", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/model/BankComboValueUiModel;", "selectedIndex", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "getId", "()Ljava/lang/String;", "getLength", "getName", "getKey", "getRequired", "getType", "getValue", "getOptions", "()Ljava/util/List;", "getSelectedIndex", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BankInputFieldConfigUiModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BankInputFieldConfigUiModel> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String id;
    private final String key;
    private final String length;
    private final String name;
    private final List<BankComboValueUiModel> options;
    private final String required;
    private final int selectedIndex;
    private final String type;
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankInputFieldConfigUiModel> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankInputFieldConfigUiModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = component2;
                int i3 = i2 + 71;
                copydefault = i3 % 128;
                arrayList = null;
                if (i3 % 2 == 0) {
                    arrayList.hashCode();
                    throw null;
                }
                int i4 = i2 + 1;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = parcel.readInt();
                arrayList = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList.add(BankComboValueUiModel.CREATOR.createFromParcel(parcel));
                }
            }
            return new BankInputFieldConfigUiModel(string, string2, string3, string4, string5, string6, string7, arrayList, parcel.readInt());
        }

        @Override
        public BankInputFieldConfigUiModel createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 23;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            BankInputFieldConfigUiModel bankInputFieldConfigUiModelCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 77 / 0;
            }
            return bankInputFieldConfigUiModelCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankInputFieldConfigUiModel[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 97;
            component2 = i3 % 128;
            BankInputFieldConfigUiModel[] bankInputFieldConfigUiModelArr = new BankInputFieldConfigUiModel[i];
            if (i3 % 2 == 0) {
                return bankInputFieldConfigUiModelArr;
            }
            throw null;
        }

        @Override
        public BankInputFieldConfigUiModel[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 103;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public BankInputFieldConfigUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<BankComboValueUiModel> list, int i) {
        this.id = str;
        this.length = str2;
        this.name = str3;
        this.key = str4;
        this.required = str5;
        this.type = str6;
        this.value = str7;
        this.options = list;
        this.selectedIndex = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BankInputFieldConfigUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        int i3;
        if ((i2 & 64) != 0) {
            int i4 = component3 + 41;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 38 / 0;
            }
            int i6 = 2 % 2;
            str8 = null;
        } else {
            str8 = str7;
        }
        List list2 = (i2 & 128) != 0 ? null : list;
        if ((i2 & 256) != 0) {
            int i7 = component2 + 49;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        this(str, str2, str3, str4, str5, str6, str8, list2, i3);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.id;
        int i4 = i3 + 55;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getLength() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.length;
        int i4 = i3 + 19;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 119;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 81;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 99;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRequired() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.required;
        int i5 = i3 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getType() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.type;
            int i4 = 22 / 0;
        } else {
            str = this.type;
        }
        int i5 = i2 + 55;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 7;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<BankComboValueUiModel> getOptions() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<BankComboValueUiModel> list = this.options;
        int i4 = i2 + 109;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final int getSelectedIndex() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 73;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.selectedIndex;
        int i6 = i2 + 121;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static {
        int i = copydefault + 69;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 78 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BankInputFieldConfigUiModel copy$default(BankInputFieldConfigUiModel bankInputFieldConfigUiModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, int i2, Object obj) {
        String str8;
        String str9;
        int i3;
        int i4 = 2 % 2;
        String str10 = (i2 & 1) != 0 ? bankInputFieldConfigUiModel.id : str;
        String str11 = (i2 & 2) != 0 ? bankInputFieldConfigUiModel.length : str2;
        String str12 = (i2 & 4) != 0 ? bankInputFieldConfigUiModel.name : str3;
        String str13 = (i2 & 8) != 0 ? bankInputFieldConfigUiModel.key : str4;
        if ((i2 & 16) != 0) {
            int i5 = component3 + 93;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str8 = bankInputFieldConfigUiModel.required;
        } else {
            str8 = str5;
        }
        if ((i2 & 32) != 0) {
            str9 = bankInputFieldConfigUiModel.type;
            int i7 = component2 + 41;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str9 = str6;
        }
        String str14 = (i2 & 64) != 0 ? bankInputFieldConfigUiModel.value : str7;
        List list2 = (i2 & 128) != 0 ? bankInputFieldConfigUiModel.options : list;
        if ((i2 & 256) != 0) {
            i3 = bankInputFieldConfigUiModel.selectedIndex;
            int i9 = component2 + 121;
            component3 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i3 = i;
        }
        BankInputFieldConfigUiModel bankInputFieldConfigUiModelCopy = bankInputFieldConfigUiModel.copy(str10, str11, str12, str13, str8, str9, str14, list2, i3);
        int i11 = component2 + 3;
        component3 = i11 % 128;
        if (i11 % 2 == 0) {
            return bankInputFieldConfigUiModelCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 73;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.length;
        int i5 = i3 + 111;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 65;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.key;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.required;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 35;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 91;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 41;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 73;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final List<BankComboValueUiModel> component8() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<BankComboValueUiModel> list = this.options;
        int i4 = i3 + 115;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final int component9() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.selectedIndex;
        int i6 = i2 + 105;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final BankInputFieldConfigUiModel copy(String id, String length, String name, String key, String required, String type, String value, List<BankComboValueUiModel> options, int selectedIndex) {
        int i = 2 % 2;
        BankInputFieldConfigUiModel bankInputFieldConfigUiModel = new BankInputFieldConfigUiModel(id, length, name, key, required, type, value, options, selectedIndex);
        int i2 = component2 + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return bankInputFieldConfigUiModel;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 67;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 103;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankInputFieldConfigUiModel)) {
            return false;
        }
        BankInputFieldConfigUiModel bankInputFieldConfigUiModel = (BankInputFieldConfigUiModel) other;
        if (!Intrinsics.areEqual(this.id, bankInputFieldConfigUiModel.id) || !Intrinsics.areEqual(this.length, bankInputFieldConfigUiModel.length)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.name, bankInputFieldConfigUiModel.name)) {
            int i2 = component2 + 107;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.key, bankInputFieldConfigUiModel.key)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.required, bankInputFieldConfigUiModel.required)) {
            int i4 = component3 + 23;
            int i5 = i4 % 128;
            component2 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 27;
            component3 = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.type, bankInputFieldConfigUiModel.type)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.value, bankInputFieldConfigUiModel.value)) {
            int i8 = component3 + 45;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.options, bankInputFieldConfigUiModel.options)) {
            return this.selectedIndex == bankInputFieldConfigUiModel.selectedIndex;
        }
        int i10 = component2 + 35;
        component3 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = component2 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.id;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.length;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.name;
        if (str3 == null) {
            int i4 = component2 + 51;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.key;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.required;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.type;
        if (str6 == null) {
            int i6 = component3 + 77;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str6.hashCode();
        }
        String str7 = this.value;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        List<BankComboValueUiModel> list = this.options;
        return (((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + (list != null ? list.hashCode() : 0)) * 31) + Integer.hashCode(this.selectedIndex);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankInputFieldConfigUiModel(id=" + this.id + ", length=" + this.length + ", name=" + this.name + ", key=" + this.key + ", required=" + this.required + ", type=" + this.type + ", value=" + this.value + ", options=" + this.options + ", selectedIndex=" + this.selectedIndex + ')';
        int i2 = component3 + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.id);
        dest.writeString(this.length);
        dest.writeString(this.name);
        dest.writeString(this.key);
        dest.writeString(this.required);
        dest.writeString(this.type);
        dest.writeString(this.value);
        List<BankComboValueUiModel> list = this.options;
        if (list == null) {
            int i2 = component3 + 113;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<BankComboValueUiModel> it = list.iterator();
            while (it.hasNext()) {
                int i4 = component2 + 41;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    it.next().writeToParcel(dest, flags);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.selectedIndex);
    }
}
