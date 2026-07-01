package com.huawei.digitalpayment.consumer.home.ui.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010$J\u0094\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÇ\u0001¢\u0006\u0002\u00103J\b\u00104\u001a\u000205H\u0007J\u0013\u00106\u001a\u00020\u00122\b\u00107\u001a\u0004\u0018\u000108H×\u0003J\t\u00109\u001a\u000205H×\u0001J\t\u0010:\u001a\u00020\u0003H×\u0001J\u0018\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000205H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$¨\u0006@"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/BalanceDetails;", "Landroid/os/Parcelable;", "balanceName", "", "balanceCode", "balanceAvailable", "", "balanceUnits", "balanceExpiry", "callToActions", "", "Lcom/huawei/digitalpayment/consumer/home/ui/resp/Actions;", "active", "currentCreditUsage", "totalCreditAmount", "outstandingCreditUsage", "dueDate", "expires", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;FFFLjava/lang/String;Ljava/lang/Boolean;)V", "getBalanceName", "()Ljava/lang/String;", "getBalanceCode", "getBalanceAvailable", "()F", "getBalanceUnits", "getBalanceExpiry", "getCallToActions", "()Ljava/util/List;", "getActive", "getCurrentCreditUsage", "getTotalCreditAmount", "getOutstandingCreditUsage", "getDueDate", "getExpires", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;FFFLjava/lang/String;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/consumer/home/ui/resp/BalanceDetails;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalanceDetails implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BalanceDetails> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

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
        private static int component1 = 0;
        private static int copydefault = 1;

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
            if (parcel.readInt() == 0) {
                int i2 = component1 + 11;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 % 3;
                }
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    int i6 = copydefault + 61;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
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
                int i8 = copydefault + 45;
                component1 = i8 % 128;
                int i9 = i8 % 2;
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BalanceDetails(string, string2, f, string3, string4, arrayList2, string5, f2, f3, f4, string6, boolValueOf);
        }

        @Override
        public BalanceDetails createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 15;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            BalanceDetails balanceDetailsCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 20 / 0;
            }
            return balanceDetailsCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BalanceDetails[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 119;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            BalanceDetails[] balanceDetailsArr = new BalanceDetails[i];
            int i6 = i4 + 13;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return balanceDetailsArr;
        }

        @Override
        public BalanceDetails[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 5;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            BalanceDetails[] balanceDetailsArrNewArray = newArray(i);
            int i5 = component1 + 47;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return balanceDetailsArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
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

    public final String getBalanceName() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.balanceName;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return str;
    }

    public final String getBalanceCode() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.balanceCode;
        int i5 = i3 + 15;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final float getBalanceAvailable() {
        float f;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 91;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            f = this.balanceAvailable;
            int i4 = 82 / 0;
        } else {
            f = this.balanceAvailable;
        }
        int i5 = i2 + 89;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBalanceUnits() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 97;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.balanceUnits;
            int i4 = 96 / 0;
        } else {
            str = this.balanceUnits;
        }
        int i5 = i2 + 85;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return str;
    }

    public final String getBalanceExpiry() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.balanceExpiry;
        }
        throw null;
    }

    public final List<Actions> getCallToActions() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<Actions> list = this.callToActions;
        int i5 = i2 + 3;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getActive() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 33;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.active;
        int i4 = i2 + 25;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final float getCurrentCreditUsage() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 59;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        float f = this.currentCreditUsage;
        int i4 = i2 + 91;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final float getTotalCreditAmount() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        float f = this.totalCreditAmount;
        int i5 = i3 + 19;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float getOutstandingCreditUsage() {
        float f;
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            f = this.outstandingCreditUsage;
            int i4 = 99 / 0;
        } else {
            f = this.outstandingCreditUsage;
        }
        int i5 = i3 + 19;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final String getDueDate() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dueDate;
        int i5 = i2 + 67;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean getExpires() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Boolean bool = this.expires;
        int i4 = i3 + 61;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    static {
        int i = ShareDataUIState + 81;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BalanceDetails copy$default(BalanceDetails balanceDetails, String str, String str2, float f, String str3, String str4, List list, String str5, float f2, float f3, float f4, String str6, Boolean bool, int i, Object obj) {
        String str7;
        String str8;
        String str9;
        float f5;
        Boolean bool2;
        int i2 = 2 % 2;
        int i3 = component2 + 79;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        String str10 = (i & 1) != 0 ? balanceDetails.balanceName : str;
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i6 = i4 + 45;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                String str11 = balanceDetails.balanceCode;
                throw null;
            }
            str7 = balanceDetails.balanceCode;
        } else {
            str7 = str2;
        }
        float f6 = (i & 4) != 0 ? balanceDetails.balanceAvailable : f;
        String str12 = (i & 8) != 0 ? balanceDetails.balanceUnits : str3;
        if ((i & 16) != 0) {
            str8 = balanceDetails.balanceExpiry;
            int i7 = i4 + 93;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str8 = str4;
        }
        List list2 = (i & 32) != 0 ? balanceDetails.callToActions : list;
        if ((i & 64) != 0) {
            int i9 = i4 + 53;
            component2 = i9 % 128;
            if (i9 % 2 == 0) {
                String str13 = balanceDetails.active;
                throw null;
            }
            str9 = balanceDetails.active;
        } else {
            str9 = str5;
        }
        float f7 = (i & 128) != 0 ? balanceDetails.currentCreditUsage : f2;
        float f8 = (i & 256) != 0 ? balanceDetails.totalCreditAmount : f3;
        if ((i & 512) != 0) {
            int i10 = component2 + 67;
            component3 = i10 % 128;
            if (i10 % 2 != 0) {
                float f9 = balanceDetails.outstandingCreditUsage;
                obj2.hashCode();
                throw null;
            }
            f5 = balanceDetails.outstandingCreditUsage;
        } else {
            f5 = f4;
        }
        String str14 = (i & 1024) != 0 ? balanceDetails.dueDate : str6;
        if ((i & 2048) != 0) {
            int i11 = component3 + 85;
            component2 = i11 % 128;
            if (i11 % 2 == 0) {
                Boolean bool3 = balanceDetails.expires;
                throw null;
            }
            bool2 = balanceDetails.expires;
        } else {
            bool2 = bool;
        }
        return balanceDetails.copy(str10, str7, f6, str12, str8, list2, str9, f7, f8, f5, str14, bool2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 119;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.balanceName;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final float component10() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        float f = this.outstandingCreditUsage;
        int i5 = i2 + 63;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component2 + 9;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.dueDate;
        int i4 = i3 + 21;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final Boolean component12() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.expires;
        int i5 = i3 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.balanceCode;
        int i5 = i2 + 77;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final float component3() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        float f = this.balanceAvailable;
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        return f;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.balanceUnits;
        int i5 = i3 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.balanceExpiry;
        }
        throw null;
    }

    public final List<Actions> component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 13;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<Actions> list = this.callToActions;
        int i4 = i2 + 51;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.active;
        int i5 = i3 + 109;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float component8() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.currentCreditUsage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float component9() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
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
        int i2 = component2 + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return balanceDetails;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 21;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 123;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceDetails)) {
            return false;
        }
        BalanceDetails balanceDetails = (BalanceDetails) other;
        if ((!Intrinsics.areEqual(this.balanceName, balanceDetails.balanceName)) || !Intrinsics.areEqual(this.balanceCode, balanceDetails.balanceCode) || Float.compare(this.balanceAvailable, balanceDetails.balanceAvailable) != 0 || !Intrinsics.areEqual(this.balanceUnits, balanceDetails.balanceUnits)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.balanceExpiry, balanceDetails.balanceExpiry)) {
            int i2 = component2 + 35;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.callToActions, balanceDetails.callToActions)) {
            int i4 = component3 + 83;
            component2 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.active, balanceDetails.active) || Float.compare(this.currentCreditUsage, balanceDetails.currentCreditUsage) != 0) {
            return false;
        }
        if (Float.compare(this.totalCreditAmount, balanceDetails.totalCreditAmount) != 0) {
            int i5 = component2 + 71;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (Float.compare(this.outstandingCreditUsage, balanceDetails.outstandingCreditUsage) == 0) {
            return Intrinsics.areEqual(this.dueDate, balanceDetails.dueDate) && Intrinsics.areEqual(this.expires, balanceDetails.expires);
        }
        int i6 = component3 + 121;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.balanceName.hashCode();
        int iHashCode3 = this.balanceCode.hashCode();
        int iHashCode4 = Float.hashCode(this.balanceAvailable);
        int iHashCode5 = this.balanceUnits.hashCode();
        String str = this.balanceExpiry;
        int iHashCode6 = 0;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        List<Actions> list = this.callToActions;
        if (list == null) {
            int i2 = component2 + 103;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
            int i4 = component2 + 37;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode8 = this.active.hashCode();
        int iHashCode9 = Float.hashCode(this.currentCreditUsage);
        int iHashCode10 = Float.hashCode(this.totalCreditAmount);
        int iHashCode11 = Float.hashCode(this.outstandingCreditUsage);
        String str2 = this.dueDate;
        int iHashCode12 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.expires;
        if (bool == null) {
            int i6 = component3 + 79;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode6 = bool.hashCode();
        }
        return (((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BalanceDetails(balanceName=" + this.balanceName + ", balanceCode=" + this.balanceCode + ", balanceAvailable=" + this.balanceAvailable + ", balanceUnits=" + this.balanceUnits + ", balanceExpiry=" + this.balanceExpiry + ", callToActions=" + this.callToActions + ", active=" + this.active + ", currentCreditUsage=" + this.currentCreditUsage + ", totalCreditAmount=" + this.totalCreditAmount + ", outstandingCreditUsage=" + this.outstandingCreditUsage + ", dueDate=" + this.dueDate + ", expires=" + this.expires + ")";
        int i2 = component2 + 115;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.balanceName);
        dest.writeString(this.balanceCode);
        dest.writeFloat(this.balanceAvailable);
        dest.writeString(this.balanceUnits);
        dest.writeString(this.balanceExpiry);
        List<Actions> list = this.callToActions;
        if (list == null) {
            int i2 = component3 + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Actions> it = list.iterator();
            while (it.hasNext()) {
                int i4 = component3 + 61;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                it.next().writeToParcel(dest, flags);
                int i6 = component2 + 107;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 % 3;
                }
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
    }
}
