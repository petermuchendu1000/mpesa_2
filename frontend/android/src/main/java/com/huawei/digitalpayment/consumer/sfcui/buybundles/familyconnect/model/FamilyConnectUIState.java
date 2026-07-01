package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import com.alibaba.ariver.commonability.device.jsapi.system.field.group.WindowInfoFieldGroup;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.Bundle;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\t\u00104\u001a\u00020\u0013HÆ\u0003J\t\u00105\u001a\u00020\u0013HÆ\u0003J\u0087\u0001\u00106\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÇ\u0001J\u0013\u00107\u001a\u00020\u00132\b\u00108\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00109\u001a\u00020\nH×\u0001J\t\u0010:\u001a\u00020\fH×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010&R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010&R\u0011\u0010'\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR\u0011\u0010)\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b*\u0010&¨\u0006;"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectUIState;", "", FavouriteBundlesService.BUNDLES_PARAM, "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/Bundle;", WindowInfoFieldGroup.FIELD_SCREEN, "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectHomeScreen;", "purchasedBeneficiaries", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/Beneficiary;", "maxBeneficiariesAllowed", "", "activeBeneficiaryInfo", "", "purchasedBundle", "expiryDate", "used", "usedFraction", "", GriverMonitorConstants.KEY_IS_LOADING, "", "isError", "<init>", "(Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectHomeScreen;Ljava/util/List;ILjava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/Bundle;Ljava/lang/String;Ljava/lang/String;FZZ)V", "getBundles", "()Ljava/util/List;", "getScreen", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectHomeScreen;", "getPurchasedBeneficiaries", "getMaxBeneficiariesAllowed", "()I", "getActiveBeneficiaryInfo", "()Ljava/lang/String;", "getPurchasedBundle", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/Bundle;", "getExpiryDate", "getUsed", "getUsedFraction", "()F", "()Z", "purchasedBeneficiariesCount", "getPurchasedBeneficiariesCount", "canAddMoreBeneficiaries", "getCanAddMoreBeneficiaries", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FamilyConnectUIState {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 1;
    private static int getShareableDataState = 59 % 128;
    private static int getSponsorBeneficiariesState;
    private static int toString;
    private final boolean ShareDataUIState;
    private final String component1;
    private final String component2;
    private final List<Bundle> component3;
    private final Bundle component4;
    private final String copy;
    private final boolean copydefault;
    private final List<Beneficiary> equals;
    private final int getAsAtTimestamp;
    private final FamilyConnectHomeScreen getRequestBeneficiariesState;
    private final float hashCode;

    public FamilyConnectUIState(List<Bundle> list, FamilyConnectHomeScreen familyConnectHomeScreen, List<Beneficiary> list2, int i, String str, Bundle bundle, String str2, String str3, float f, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(familyConnectHomeScreen, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component3 = list;
        this.getRequestBeneficiariesState = familyConnectHomeScreen;
        this.equals = list2;
        this.getAsAtTimestamp = i;
        this.component2 = str;
        this.component4 = bundle;
        this.component1 = str2;
        this.copy = str3;
        this.hashCode = f;
        this.ShareDataUIState = z;
        this.copydefault = z2;
    }

    public final List<Bundle> getBundles() {
        int i = 2 % 2;
        int i2 = toString + 61;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<Bundle> list = this.component3;
        int i4 = i3 + 27;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final FamilyConnectHomeScreen getScreen() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 63;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        FamilyConnectHomeScreen familyConnectHomeScreen = this.getRequestBeneficiariesState;
        int i5 = i3 + 111;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return familyConnectHomeScreen;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FamilyConnectUIState(List list, FamilyConnectHomeScreen familyConnectHomeScreen, List list2, int i, String str, Bundle bundle, String str2, String str3, float f, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        List listEmptyList;
        FamilyConnectHomeScreen familyConnectHomeScreen2;
        List listEmptyList2;
        int i3;
        Bundle bundle2;
        if ((i2 & 1) != 0) {
            int i4 = toString + 85;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = list;
        }
        if ((i2 & 2) != 0) {
            FamilyConnectHomeScreen familyConnectHomeScreen3 = FamilyConnectHomeScreen.BUNDLES;
            int i7 = toString + 83;
            ArtificialStackFrames = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            familyConnectHomeScreen2 = familyConnectHomeScreen3;
        } else {
            familyConnectHomeScreen2 = familyConnectHomeScreen;
        }
        Object obj = null;
        if ((i2 & 4) != 0) {
            int i10 = ArtificialStackFrames + 23;
            toString = i10 % 128;
            if (i10 % 2 != 0) {
                Collections.emptyList();
                obj.hashCode();
                throw null;
            }
            listEmptyList2 = Collections.emptyList();
        } else {
            listEmptyList2 = list2;
        }
        if ((i2 & 8) != 0) {
            int i11 = 2 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            int i12 = ArtificialStackFrames + 49;
            toString = i12 % 128;
            int i13 = i12 % 2;
            bundle2 = null;
        } else {
            bundle2 = bundle;
        }
        this(listEmptyList, familyConnectHomeScreen2, listEmptyList2, i3, str, bundle2, str2, str3, f, z, z2);
    }

    public final List<Beneficiary> getPurchasedBeneficiaries() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 63;
        toString = i3 % 128;
        int i4 = i3 % 2;
        List<Beneficiary> list = this.equals;
        int i5 = i2 + 41;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final int getMaxBeneficiariesAllowed() {
        int i = 2 % 2;
        int i2 = toString + 7;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getAsAtTimestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getActiveBeneficiaryInfo() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 87;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 5;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Bundle getPurchasedBundle() {
        int i = 2 % 2;
        int i2 = toString + 77;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        Bundle bundle = this.component4;
        int i5 = i3 + 91;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return bundle;
        }
        throw null;
    }

    public final String getExpiryDate() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 53;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 37;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getUsed() {
        int i = 2 % 2;
        int i2 = toString + 49;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 11;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return str;
    }

    public final float getUsedFraction() {
        int i = 2 % 2;
        int i2 = toString + 67;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return this.hashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = toString + 73;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 15 / 0;
        }
        return z;
    }

    public final boolean isError() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 75;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 17;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final int getPurchasedBeneficiariesCount() {
        int i = 2 % 2;
        int i2 = toString + 43;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        int size = this.equals.size();
        int i4 = ArtificialStackFrames + 65;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            return size;
        }
        throw null;
    }

    public final boolean getCanAddMoreBeneficiaries() {
        int i = 2 % 2;
        if (getPurchasedBeneficiariesCount() >= this.getAsAtTimestamp) {
            return false;
        }
        int i2 = ArtificialStackFrames + 109;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 1;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    static {
        int i = 59 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FamilyConnectUIState copy$default(FamilyConnectUIState familyConnectUIState, List list, FamilyConnectHomeScreen familyConnectHomeScreen, List list2, int i, String str, Bundle bundle, String str2, String str3, float f, boolean z, boolean z2, int i2, Object obj) {
        List list3;
        List list4;
        String str4;
        String str5;
        float f2;
        int i3 = 2 % 2;
        Object obj2 = null;
        if ((i2 & 1) != 0) {
            int i4 = toString + 67;
            ArtificialStackFrames = i4 % 128;
            if (i4 % 2 == 0) {
                List<Bundle> list5 = familyConnectUIState.component3;
                throw null;
            }
            list3 = familyConnectUIState.component3;
        } else {
            list3 = list;
        }
        FamilyConnectHomeScreen familyConnectHomeScreen2 = (i2 & 2) != 0 ? familyConnectUIState.getRequestBeneficiariesState : familyConnectHomeScreen;
        if ((i2 & 4) != 0) {
            int i5 = ArtificialStackFrames + 69;
            int i6 = i5 % 128;
            toString = i6;
            if (i5 % 2 != 0) {
                List<Beneficiary> list6 = familyConnectUIState.equals;
                obj2.hashCode();
                throw null;
            }
            list4 = familyConnectUIState.equals;
            int i7 = i6 + 93;
            ArtificialStackFrames = i7 % 128;
            int i8 = i7 % 2;
        } else {
            list4 = list2;
        }
        int i9 = (i2 & 8) != 0 ? familyConnectUIState.getAsAtTimestamp : i;
        if ((i2 & 16) != 0) {
            str4 = familyConnectUIState.component2;
            int i10 = ArtificialStackFrames + 31;
            toString = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str4 = str;
        }
        Bundle bundle2 = (i2 & 32) != 0 ? familyConnectUIState.component4 : bundle;
        String str6 = (i2 & 64) != 0 ? familyConnectUIState.component1 : str2;
        if ((i2 & 128) != 0) {
            int i12 = toString + 77;
            ArtificialStackFrames = i12 % 128;
            if (i12 % 2 == 0) {
                String str7 = familyConnectUIState.copy;
                throw null;
            }
            str5 = familyConnectUIState.copy;
        } else {
            str5 = str3;
        }
        if ((i2 & 256) != 0) {
            int i13 = toString + 73;
            ArtificialStackFrames = i13 % 128;
            if (i13 % 2 == 0) {
                float f3 = familyConnectUIState.hashCode;
                obj2.hashCode();
                throw null;
            }
            f2 = familyConnectUIState.hashCode;
        } else {
            f2 = f;
        }
        return familyConnectUIState.copy(list3, familyConnectHomeScreen2, list4, i9, str4, bundle2, str6, str5, f2, (i2 & 512) != 0 ? familyConnectUIState.ShareDataUIState : z, (i2 & 1024) != 0 ? familyConnectUIState.copydefault : z2);
    }

    public final List<Bundle> component1() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 75;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        List<Bundle> list = this.component3;
        int i5 = i2 + 113;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean component10() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 85;
        int i3 = i2 % 128;
        toString = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.ShareDataUIState;
        int i4 = i3 + 51;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean component11() {
        int i = 2 % 2;
        int i2 = toString + 97;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final FamilyConnectHomeScreen component2() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 47;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getRequestBeneficiariesState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Beneficiary> component3() {
        int i = 2 % 2;
        int i2 = toString + 101;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return this.equals;
        }
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 71;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.getAsAtTimestamp;
        int i5 = i2 + 25;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 115;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 105;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Bundle component6() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 63;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        Bundle bundle = this.component4;
        int i5 = i3 + 85;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return bundle;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 57;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 19;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 85;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.copy;
        int i4 = i2 + 59;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return str;
    }

    public final float component9() {
        int i = 2 % 2;
        int i2 = toString + 103;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.hashCode;
        int i4 = i3 + 57;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return f;
    }

    public final FamilyConnectUIState copy(List<Bundle> bundles, FamilyConnectHomeScreen screen, List<Beneficiary> purchasedBeneficiaries, int maxBeneficiariesAllowed, String activeBeneficiaryInfo, Bundle purchasedBundle, String expiryDate, String used, float usedFraction, boolean isLoading, boolean isError) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundles, "");
        Intrinsics.checkNotNullParameter(screen, "");
        Intrinsics.checkNotNullParameter(purchasedBeneficiaries, "");
        Intrinsics.checkNotNullParameter(activeBeneficiaryInfo, "");
        Intrinsics.checkNotNullParameter(used, "");
        FamilyConnectUIState familyConnectUIState = new FamilyConnectUIState(bundles, screen, purchasedBeneficiaries, maxBeneficiariesAllowed, activeBeneficiaryInfo, purchasedBundle, expiryDate, used, usedFraction, isLoading, isError);
        int i2 = toString + 83;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        return familyConnectUIState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 103;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyConnectUIState)) {
            int i5 = i3 + 119;
            ArtificialStackFrames = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        FamilyConnectUIState familyConnectUIState = (FamilyConnectUIState) other;
        if (!Intrinsics.areEqual(this.component3, familyConnectUIState.component3)) {
            int i7 = toString + 7;
            ArtificialStackFrames = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.getRequestBeneficiariesState != familyConnectUIState.getRequestBeneficiariesState) {
            int i9 = ArtificialStackFrames;
            int i10 = i9 + 21;
            toString = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 29;
            toString = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.equals, familyConnectUIState.equals)) {
            int i14 = toString + 103;
            ArtificialStackFrames = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (this.getAsAtTimestamp != familyConnectUIState.getAsAtTimestamp || (!Intrinsics.areEqual(this.component2, familyConnectUIState.component2))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component4, familyConnectUIState.component4)) {
            int i16 = toString + 103;
            ArtificialStackFrames = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, familyConnectUIState.component1)) {
            int i18 = toString + 9;
            ArtificialStackFrames = i18 % 128;
            int i19 = i18 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copy, familyConnectUIState.copy)) {
            int i20 = ArtificialStackFrames + 25;
            toString = i20 % 128;
            int i21 = i20 % 2;
            return false;
        }
        if (Float.compare(this.hashCode, familyConnectUIState.hashCode) != 0 || this.ShareDataUIState != familyConnectUIState.ShareDataUIState) {
            return false;
        }
        if (this.copydefault == familyConnectUIState.copydefault) {
            return true;
        }
        int i22 = ArtificialStackFrames + 35;
        toString = i22 % 128;
        int i23 = i22 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.component3.hashCode();
        int iHashCode3 = this.getRequestBeneficiariesState.hashCode();
        int iHashCode4 = this.equals.hashCode();
        int iHashCode5 = Integer.hashCode(this.getAsAtTimestamp);
        int iHashCode6 = this.component2.hashCode();
        Bundle bundle = this.component4;
        if (bundle == null) {
            int i2 = ArtificialStackFrames + 125;
            int i3 = i2 % 128;
            toString = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 81;
            ArtificialStackFrames = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bundle.hashCode();
        }
        String str = this.component1;
        int iHashCode7 = (((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.copy.hashCode()) * 31) + Float.hashCode(this.hashCode)) * 31) + Boolean.hashCode(this.ShareDataUIState)) * 31) + Boolean.hashCode(this.copydefault);
        int i7 = ArtificialStackFrames + 117;
        toString = i7 % 128;
        if (i7 % 2 == 0) {
            return iHashCode7;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FamilyConnectUIState(bundles=" + this.component3 + ", screen=" + this.getRequestBeneficiariesState + ", purchasedBeneficiaries=" + this.equals + ", maxBeneficiariesAllowed=" + this.getAsAtTimestamp + ", activeBeneficiaryInfo=" + this.component2 + ", purchasedBundle=" + this.component4 + ", expiryDate=" + this.component1 + ", used=" + this.copy + ", usedFraction=" + this.hashCode + ", isLoading=" + this.ShareDataUIState + ", isError=" + this.copydefault + ")";
        int i2 = toString + 1;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
