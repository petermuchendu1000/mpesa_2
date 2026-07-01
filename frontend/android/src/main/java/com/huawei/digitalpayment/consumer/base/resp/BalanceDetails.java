package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010$J\u0094\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00103J\u0006\u00104\u001a\u000205J\u0013\u00106\u001a\u00020\u00122\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u000205HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000205R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$¨\u0006@"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/BalanceDetails;", "Landroid/os/Parcelable;", "balanceName", "", "balanceCode", "balanceAvailable", "", "balanceUnits", "balanceExpiry", "callToActions", "", "Lcom/huawei/digitalpayment/consumer/base/resp/Actions;", "active", "currentCreditUsage", "totalCreditAmount", "outstandingCreditUsage", "dueDate", "expires", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;FFFLjava/lang/String;Ljava/lang/Boolean;)V", "getBalanceName", "()Ljava/lang/String;", "getBalanceCode", "getBalanceAvailable", "()F", "getBalanceUnits", "getBalanceExpiry", "getCallToActions", "()Ljava/util/List;", "getActive", "getCurrentCreditUsage", "getTotalCreditAmount", "getOutstandingCreditUsage", "getDueDate", "getExpires", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;FFFLjava/lang/String;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/consumer/base/resp/BalanceDetails;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalanceDetails implements Parcelable {
    public static final Parcelable.Creator<BalanceDetails> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("active")
    private final String active;

    @SerializedName("balanceAvailable")
    private final float balanceAvailable;

    @SerializedName("balanceCode")
    private final String balanceCode;

    @SerializedName("balanceExpiry")
    private final String balanceExpiry;

    @SerializedName("balanceName")
    private final String balanceName;

    @SerializedName("balanceUnits")
    private final String balanceUnits;

    @SerializedName("callToActions")
    private final List<Actions> callToActions;

    @SerializedName("currentCreditUsage")
    private final float currentCreditUsage;

    @SerializedName("dueDate")
    private final String dueDate;

    @SerializedName("expires")
    private final Boolean expires;

    @SerializedName("outstandingCreditUsage")
    private final float outstandingCreditUsage;

    @SerializedName("totalCreditAmount")
    private final float totalCreditAmount;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BalanceDetails> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BalanceDetails createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            float f = parcel.readFloat();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(Actions.CREATOR.createFromParcel(parcel));
                }
            }
            ArrayList arrayList2 = arrayList;
            String string5 = parcel.readString();
            float f2 = parcel.readFloat();
            float f3 = parcel.readFloat();
            float f4 = parcel.readFloat();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = ShareDataUIState + 53;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i6 = ShareDataUIState + 13;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new BalanceDetails(string, string2, f, string3, string4, arrayList2, string5, f2, f3, f4, string6, boolValueOf);
        }

        @Override
        public BalanceDetails createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 29;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            BalanceDetails balanceDetailsCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 43;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return balanceDetailsCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BalanceDetails[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 67;
            component3 = i3 % 128;
            BalanceDetails[] balanceDetailsArr = new BalanceDetails[i];
            if (i3 % 2 == 0) {
                return balanceDetailsArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public BalanceDetails[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 85;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            BalanceDetails[] balanceDetailsArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 85 / 0;
            }
            int i6 = component3 + 47;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return balanceDetailsArrNewArray;
        }
    }

    public BalanceDetails(String str, String str2, float f, String str3, String str4, List<Actions> list, String str5, float f2, float f3, float f4, String str6, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.balanceName = str;
        this.balanceCode = str2;
        this.balanceAvailable = f;
        this.balanceUnits = str3;
        this.balanceExpiry = str4;
        this.callToActions = list;
        this.active = str5;
        this.currentCreditUsage = f2;
        this.totalCreditAmount = f3;
        this.outstandingCreditUsage = f4;
        this.dueDate = str6;
        this.expires = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BalanceDetails(String str, String str2, float f, String str3, String str4, List list, String str5, float f2, float f3, float f4, String str6, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        Boolean bool2;
        String str9 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = component2 + 15;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 65;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str7 = "";
        } else {
            str7 = str2;
        }
        String str10 = (i & 8) != 0 ? "" : str3;
        Object obj = null;
        String str11 = (i & 16) != 0 ? null : str4;
        List list2 = (i & 32) != 0 ? null : list;
        String str12 = (i & 64) != 0 ? "" : str5;
        if ((i & 1024) != 0) {
            int i7 = copydefault + 83;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            int i8 = 2 % 2;
            str8 = null;
        } else {
            str8 = str6;
        }
        if ((i & 2048) != 0) {
            int i9 = copydefault + 1;
            component2 = i9 % 128;
            if (i9 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            bool2 = null;
        } else {
            bool2 = bool;
        }
        this(str9, str7, f, str10, str11, list2, str12, f2, f3, f4, str8, bool2);
    }

    public final String getBalanceName() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.balanceName;
        }
        throw null;
    }

    public final String getBalanceCode() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.balanceCode;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return str;
    }

    public final float getBalanceAvailable() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        float f = this.balanceAvailable;
        int i5 = i3 + 95;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final String getBalanceUnits() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            str = this.balanceUnits;
            int i4 = 20 / 0;
        } else {
            str = this.balanceUnits;
        }
        int i5 = i3 + 49;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBalanceExpiry() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.balanceExpiry;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Actions> getCallToActions() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<Actions> list = this.callToActions;
        int i5 = i3 + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getActive() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.active;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final float getCurrentCreditUsage() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        float f = this.currentCreditUsage;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return f;
    }

    public final float getTotalCreditAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        float f = this.totalCreditAmount;
        int i5 = i3 + 15;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float getOutstandingCreditUsage() {
        float f;
        int i = 2 % 2;
        int i2 = copydefault + 99;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            f = this.outstandingCreditUsage;
            int i4 = 69 / 0;
        } else {
            f = this.outstandingCreditUsage;
        }
        int i5 = i3 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public final String getDueDate() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dueDate;
        int i5 = i2 + 115;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Boolean getExpires() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Boolean bool = this.expires;
        int i5 = i3 + 99;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    static {
        int i = component3 + 41;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BalanceDetails copy$default(BalanceDetails balanceDetails, String str, String str2, float f, String str3, String str4, List list, String str5, float f2, float f3, float f4, String str6, Boolean bool, int i, Object obj) {
        String str7;
        List list2;
        String str8;
        float f5;
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 89;
        component2 = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) {
            str7 = str;
        } else {
            int i5 = i3 + 63;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str7 = balanceDetails.balanceName;
        }
        String str9 = (i & 2) != 0 ? balanceDetails.balanceCode : str2;
        float f6 = (i & 4) != 0 ? balanceDetails.balanceAvailable : f;
        String str10 = (i & 8) != 0 ? balanceDetails.balanceUnits : str3;
        String str11 = (i & 16) != 0 ? balanceDetails.balanceExpiry : str4;
        if ((i & 32) != 0) {
            int i7 = component2 + 75;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                List<Actions> list3 = balanceDetails.callToActions;
                throw null;
            }
            list2 = balanceDetails.callToActions;
        } else {
            list2 = list;
        }
        if ((i & 64) != 0) {
            int i8 = component2 + 119;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            str8 = balanceDetails.active;
        } else {
            str8 = str5;
        }
        float f7 = (i & 128) != 0 ? balanceDetails.currentCreditUsage : f2;
        float f8 = (i & 256) != 0 ? balanceDetails.totalCreditAmount : f3;
        if ((i & 512) != 0) {
            int i10 = component2 + 95;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            f5 = balanceDetails.outstandingCreditUsage;
        } else {
            f5 = f4;
        }
        BalanceDetails balanceDetailsCopy = balanceDetails.copy(str7, str9, f6, str10, str11, list2, str8, f7, f8, f5, (i & 1024) != 0 ? balanceDetails.dueDate : str6, (i & 2048) != 0 ? balanceDetails.expires : bool);
        int i12 = copydefault + 27;
        component2 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 5 / 0;
        }
        return balanceDetailsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.balanceName;
        int i5 = i2 + 23;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final float component10() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        float f = this.outstandingCreditUsage;
        int i5 = i2 + 101;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.dueDate;
        int i5 = i3 + 23;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean component12() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 111;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.expires;
        int i5 = i2 + 89;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.balanceCode;
        int i5 = i3 + 49;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final float component3() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.balanceAvailable;
        int i4 = i3 + 95;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return f;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.balanceUnits;
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.balanceExpiry;
        int i4 = i3 + 61;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final List<Actions> component6() {
        List<Actions> list;
        int i = 2 % 2;
        int i2 = component2 + 47;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            list = this.callToActions;
            int i4 = 98 / 0;
        } else {
            list = this.callToActions;
        }
        int i5 = i3 + 11;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.active;
        int i5 = i2 + 107;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final float component8() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        float f = this.currentCreditUsage;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return f;
    }

    public final float component9() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.totalCreditAmount;
        }
        throw null;
    }

    public final BalanceDetails copy(String balanceName, String balanceCode, float balanceAvailable, String balanceUnits, String balanceExpiry, List<Actions> callToActions, String active, float currentCreditUsage, float totalCreditAmount, float outstandingCreditUsage, String dueDate, Boolean expires) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(balanceName, "");
        Intrinsics.checkNotNullParameter(balanceCode, "");
        Intrinsics.checkNotNullParameter(balanceUnits, "");
        Intrinsics.checkNotNullParameter(active, "");
        BalanceDetails balanceDetails = new BalanceDetails(balanceName, balanceCode, balanceAvailable, balanceUnits, balanceExpiry, callToActions, active, currentCreditUsage, totalCreditAmount, outstandingCreditUsage, dueDate, expires);
        int i2 = component2 + 113;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 33 / 0;
        }
        return balanceDetails;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        copydefault = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.base.resp.BalanceDetails) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.base.resp.BalanceDetails) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.balanceName, r6.balanceName) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.base.resp.BalanceDetails.copydefault + 33;
        com.huawei.digitalpayment.consumer.base.resp.BalanceDetails.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.balanceCode, r6.balanceCode) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (java.lang.Float.compare(r5.balanceAvailable, r6.balanceAvailable) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.balanceUnits, r6.balanceUnits) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.balanceExpiry, r6.balanceExpiry) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.callToActions, r6.callToActions) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.active, r6.active) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (java.lang.Float.compare(r5.currentCreditUsage, r6.currentCreditUsage) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        if (java.lang.Float.compare(r5.totalCreditAmount, r6.totalCreditAmount) == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        if (java.lang.Float.compare(r5.outstandingCreditUsage, r6.outstandingCreditUsage) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.base.resp.BalanceDetails.copydefault + 73;
        com.huawei.digitalpayment.consumer.base.resp.BalanceDetails.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.dueDate, r6.dueDate) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.base.resp.BalanceDetails.copydefault + 75;
        r1 = r6 % 128;
        com.huawei.digitalpayment.consumer.base.resp.BalanceDetails.component2 = r1;
        r6 = r6 % 2;
        r1 = r1 + 69;
        com.huawei.digitalpayment.consumer.base.resp.BalanceDetails.copydefault = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        if ((r1 % 2) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.expires, r6.expires) == true) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cc, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cd, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.base.resp.BalanceDetails.copydefault + 35;
        com.huawei.digitalpayment.consumer.base.resp.BalanceDetails.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.BalanceDetails.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = copydefault + 107;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.balanceName.hashCode();
        int iHashCode3 = this.balanceCode.hashCode();
        int iHashCode4 = Float.hashCode(this.balanceAvailable);
        int iHashCode5 = this.balanceUnits.hashCode();
        String str = this.balanceExpiry;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        List<Actions> list = this.callToActions;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        int iHashCode8 = this.active.hashCode();
        int iHashCode9 = Float.hashCode(this.currentCreditUsage);
        int iHashCode10 = Float.hashCode(this.totalCreditAmount);
        int iHashCode11 = Float.hashCode(this.outstandingCreditUsage);
        String str2 = this.dueDate;
        if (str2 == null) {
            int i4 = component2 + 61;
            copydefault = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str2.hashCode();
        }
        Boolean bool = this.expires;
        return (((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BalanceDetails(balanceName=" + this.balanceName + ", balanceCode=" + this.balanceCode + ", balanceAvailable=" + this.balanceAvailable + ", balanceUnits=" + this.balanceUnits + ", balanceExpiry=" + this.balanceExpiry + ", callToActions=" + this.callToActions + ", active=" + this.active + ", currentCreditUsage=" + this.currentCreditUsage + ", totalCreditAmount=" + this.totalCreditAmount + ", outstandingCreditUsage=" + this.outstandingCreditUsage + ", dueDate=" + this.dueDate + ", expires=" + this.expires + ")";
        int i2 = copydefault + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.balanceName);
        dest.writeString(this.balanceCode);
        dest.writeFloat(this.balanceAvailable);
        dest.writeString(this.balanceUnits);
        dest.writeString(this.balanceExpiry);
        List<Actions> list = this.callToActions;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Actions> it = list.iterator();
            while (!(!it.hasNext())) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.active);
        dest.writeFloat(this.currentCreditUsage);
        dest.writeFloat(this.totalCreditAmount);
        dest.writeFloat(this.outstandingCreditUsage);
        dest.writeString(this.dueDate);
        Boolean bool = this.expires;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        int i4 = copydefault + 83;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
