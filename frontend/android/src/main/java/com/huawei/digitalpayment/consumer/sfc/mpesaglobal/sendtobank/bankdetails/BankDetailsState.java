package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.model.BankInputFieldConfigUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÇ\u0001J\b\u0010\u001b\u001a\u00020\u001cH\u0007J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH×\u0003J\t\u0010 \u001a\u00020\u001cH×\u0001J\t\u0010!\u001a\u00020\u0003H×\u0001J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/bankdetails/BankDetailsState;", "Landroid/os/Parcelable;", "selectedCountry", "", "selectedCountryIso", "selectedCountryFlag", GriverMonitorConstants.KEY_IS_LOADING, "", "inputFieldConfigs", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/model/BankInputFieldConfigUiModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getSelectedCountry", "()Ljava/lang/String;", "getSelectedCountryIso", "getSelectedCountryFlag", "()Z", "getInputFieldConfigs", "()Ljava/util/List;", "isButtonEnabled", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BankDetailsState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BankDetailsState> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final List<BankInputFieldConfigUiModel> inputFieldConfigs;
    private final boolean isLoading;
    private final String selectedCountry;
    private final String selectedCountryFlag;
    private final String selectedCountryIso;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankDetailsState> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankDetailsState createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i2 = component1 + 43;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                z = false;
            }
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                int i6 = component1 + 19;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(BankInputFieldConfigUiModel.CREATOR.createFromParcel(parcel));
            }
            return new BankDetailsState(string, string2, string3, z, arrayList);
        }

        @Override
        public BankDetailsState createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 57;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            BankDetailsState bankDetailsStateCreateFromParcel = createFromParcel(parcel);
            int i3 = ShareDataUIState + 65;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 0;
            }
            return bankDetailsStateCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankDetailsState[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 63;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            BankDetailsState[] bankDetailsStateArr = new BankDetailsState[i];
            int i6 = i3 + 49;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                return bankDetailsStateArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public BankDetailsState[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 85;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            BankDetailsState[] bankDetailsStateArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 10 / 0;
            }
            return bankDetailsStateArrNewArray;
        }
    }

    public BankDetailsState(String str, String str2, String str3, boolean z, List<BankInputFieldConfigUiModel> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.selectedCountry = str;
        this.selectedCountryIso = str2;
        this.selectedCountryFlag = str3;
        this.isLoading = z;
        this.inputFieldConfigs = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BankDetailsState(String str, String str2, String str3, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        String str5 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = component3;
            int i3 = i2 + 111;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 85;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str4 = "";
        } else {
            str4 = str2;
        }
        String str6 = (i & 4) == 0 ? str3 : "";
        if ((i & 8) != 0) {
            int i7 = 2 % 2;
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            list = CollectionsKt.emptyList();
            int i8 = 2 % 2;
        }
        this(str5, str4, str6, z2, list);
    }

    public final String getSelectedCountry() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.selectedCountry;
        int i4 = i2 + 115;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return str;
    }

    public final String getSelectedCountryIso() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.selectedCountryIso;
        int i5 = i3 + 101;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final String getSelectedCountryFlag() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.selectedCountryFlag;
        }
        throw null;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.isLoading;
        int i4 = i3 + 117;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final List<BankInputFieldConfigUiModel> getInputFieldConfigs() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.inputFieldConfigs;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isButtonEnabled() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            java.util.List<com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.model.BankInputFieldConfigUiModel> r1 = r6.inputFieldConfigs
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component1
            int r2 = r2 + 47
            int r5 = r2 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component3 = r5
            int r2 = r2 % r0
            if (r2 == 0) goto L25
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r5 = 85
            int r5 = r5 / r3
            if (r2 == 0) goto L3e
            goto L30
        L25:
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            if (r2 == 0) goto L30
            goto L3e
        L30:
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component1
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component3 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L3c
            goto L7a
        L3c:
            r0 = 0
            throw r0
        L3e:
            java.util.Iterator r1 = r1.iterator()
        L42:
            boolean r2 = r1.hasNext()
            r2 = r2 ^ r4
            if (r2 == r4) goto L7a
            int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component1
            int r2 = r2 + 119
            int r5 = r2 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component3 = r5
            int r2 = r2 % r0
            java.lang.Object r2 = r1.next()
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.model.BankInputFieldConfigUiModel r2 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.model.BankInputFieldConfigUiModel) r2
            java.lang.String r2 = r2.getValue()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L66
            int r2 = r2.length()
            if (r2 != 0) goto L42
        L66:
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component3
            int r2 = r1 + 81
            int r5 = r2 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component1 = r5
            int r2 = r2 % r0
            if (r2 != 0) goto L73
            r2 = 4
            int r2 = r2 / r2
        L73:
            int r1 = r1 + r4
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component1 = r2
            int r1 = r1 % r0
            goto L7b
        L7a:
            r3 = r4
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.isButtonEnabled():boolean");
    }

    static {
        int i = copydefault + 103;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public BankDetailsState() {
        this(null, null, null, false, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BankDetailsState copy$default(BankDetailsState bankDetailsState, String str, String str2, String str3, boolean z, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 69;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str = bankDetailsState.selectedCountry;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = bankDetailsState.selectedCountryIso;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            int i5 = component3 + 45;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str3 = bankDetailsState.selectedCountryFlag;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            int i7 = component3 + 39;
            component1 = i7 % 128;
            if (i7 % 2 == 0) {
                boolean z2 = bankDetailsState.isLoading;
                throw null;
            }
            z = bankDetailsState.isLoading;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            list = bankDetailsState.inputFieldConfigs;
        }
        return bankDetailsState.copy(str4, str5, str6, z3, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 107;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.selectedCountry;
        int i5 = i2 + 55;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.selectedCountryIso;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 117;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.selectedCountryFlag;
        int i5 = i2 + 29;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isLoading;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<BankInputFieldConfigUiModel> component5() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<BankInputFieldConfigUiModel> list = this.inputFieldConfigs;
        int i5 = i3 + 85;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BankDetailsState copy(String selectedCountry, String selectedCountryIso, String selectedCountryFlag, boolean isLoading, List<BankInputFieldConfigUiModel> inputFieldConfigs) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(selectedCountry, "");
        Intrinsics.checkNotNullParameter(selectedCountryIso, "");
        Intrinsics.checkNotNullParameter(selectedCountryFlag, "");
        Intrinsics.checkNotNullParameter(inputFieldConfigs, "");
        BankDetailsState bankDetailsState = new BankDetailsState(selectedCountry, selectedCountryIso, selectedCountryFlag, isLoading, inputFieldConfigs);
        int i2 = component1 + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return bankDetailsState;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 47;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 95;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 49;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component1 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.selectedCountry, r6.selectedCountry) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.selectedCountryIso, r6.selectedCountryIso) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.selectedCountryFlag, r6.selectedCountryFlag) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component1 + 121;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component3 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r5.isLoading == r6.isLoading) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.inputFieldConfigs, r6.inputFieldConfigs) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component3 + 125;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component1 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
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
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component1
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component3 = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L16
            r1 = 44
            int r1 = r1 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState
            if (r1 != 0) goto L2c
            int r2 = r2 + 49
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component1 = r6
            int r2 = r2 % r0
            if (r2 == 0) goto L27
            return r4
        L27:
            r6 = 0
            r6.hashCode()
            throw r6
        L2c:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState) r6
            java.lang.String r1 = r5.selectedCountry
            java.lang.String r2 = r6.selectedCountry
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L39
            return r4
        L39:
            java.lang.String r1 = r5.selectedCountryIso
            java.lang.String r2 = r6.selectedCountryIso
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L44
            return r4
        L44:
            java.lang.String r1 = r5.selectedCountryFlag
            java.lang.String r2 = r6.selectedCountryFlag
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L58
            int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component1
            int r6 = r6 + 121
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component3 = r1
            int r6 = r6 % r0
            return r4
        L58:
            boolean r1 = r5.isLoading
            boolean r2 = r6.isLoading
            if (r1 == r2) goto L5f
            return r4
        L5f:
            java.util.List<com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.model.BankInputFieldConfigUiModel> r1 = r5.inputFieldConfigs
            java.util.List<com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.model.BankInputFieldConfigUiModel> r6 = r6.inputFieldConfigs
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L73
            int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component3
            int r6 = r6 + 125
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.component1 = r1
            int r6 = r6 % r0
            return r4
        L73:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.bankdetails.BankDetailsState.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.selectedCountry.hashCode() * 31) + this.selectedCountryIso.hashCode()) * 31) + this.selectedCountryFlag.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + this.inputFieldConfigs.hashCode();
        int i4 = component1 + 83;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankDetailsState(selectedCountry=" + this.selectedCountry + ", selectedCountryIso=" + this.selectedCountryIso + ", selectedCountryFlag=" + this.selectedCountryFlag + ", isLoading=" + this.isLoading + ", inputFieldConfigs=" + this.inputFieldConfigs + ')';
        int i2 = component1 + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.selectedCountry);
        dest.writeString(this.selectedCountryIso);
        dest.writeString(this.selectedCountryFlag);
        dest.writeInt(this.isLoading ? 1 : 0);
        List<BankInputFieldConfigUiModel> list = this.inputFieldConfigs;
        dest.writeInt(list.size());
        Iterator<BankInputFieldConfigUiModel> it = list.iterator();
        while (it.hasNext()) {
            int i4 = component1 + 15;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                int i5 = 16 / 0;
            } else {
                it.next().writeToParcel(dest, flags);
            }
        }
    }
}
