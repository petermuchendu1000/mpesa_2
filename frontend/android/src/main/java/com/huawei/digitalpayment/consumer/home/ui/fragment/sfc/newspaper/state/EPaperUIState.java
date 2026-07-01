package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.state;

import com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.EPaperScreens;
import com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model.IPublication;
import com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model.Release;
import com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model.TabItem;
import com.safaricom.sharedui.compose.completion.TransactionCompletionData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\u0007HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u009f\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00072\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÇ\u0001J\u0013\u00103\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00105\u001a\u000206H×\u0001J\t\u00107\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00068"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/state/EPaperUIState;", "", "currentScreen", "", "completionData", "Lcom/safaricom/sharedui/compose/completion/TransactionCompletionData;", "tabs", "", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/TabItem;", "errorMessage", "hasSubscriptions", "", "boughtNewspapers", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/IPublication;", "newspapers", "selectedPublication", "oldNewspapers", "todaysNewspapers", "release", "Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/Release;", "<init>", "(Ljava/lang/String;Lcom/safaricom/sharedui/compose/completion/TransactionCompletionData;Ljava/util/List;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/IPublication;Ljava/util/List;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/Release;)V", "getCurrentScreen", "()Ljava/lang/String;", "getCompletionData", "()Lcom/safaricom/sharedui/compose/completion/TransactionCompletionData;", "getTabs", "()Ljava/util/List;", "getErrorMessage", "getHasSubscriptions", "()Z", "getBoughtNewspapers", "getNewspapers", "getSelectedPublication", "()Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/IPublication;", "getOldNewspapers", "getTodaysNewspapers", "getRelease", "()Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/Release;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EPaperUIState {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 1;
    private static int getShareableDataState = 0;
    private static int getSponsorBeneficiariesState = 39 % 128;
    private static int toString;
    private final boolean ShareDataUIState;
    private final TransactionCompletionData component1;
    private final List<IPublication> component2;
    private final String component3;
    private final IPublication component4;
    private final Release copy;
    private final String copydefault;
    private final List<TabItem> equals;
    private final List<IPublication> getAsAtTimestamp;
    private final List<IPublication> getRequestBeneficiariesState;
    private final List<IPublication> hashCode;

    /* JADX WARN: Multi-variable type inference failed */
    public EPaperUIState(String str, TransactionCompletionData transactionCompletionData, List<TabItem> list, String str2, boolean z, List<? extends IPublication> list2, List<? extends IPublication> list3, IPublication iPublication, List<? extends IPublication> list4, List<? extends IPublication> list5, Release release) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.copydefault = str;
        this.component1 = transactionCompletionData;
        this.equals = list;
        this.component3 = str2;
        this.ShareDataUIState = z;
        this.component2 = list2;
        this.getRequestBeneficiariesState = list3;
        this.component4 = iPublication;
        this.getAsAtTimestamp = list4;
        this.hashCode = list5;
        this.copy = release;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EPaperUIState(String str, TransactionCompletionData transactionCompletionData, List list, String str2, boolean z, List list2, List list3, IPublication iPublication, List list4, List list5, Release release, int i, DefaultConstructorMarker defaultConstructorMarker) {
        TransactionCompletionData transactionCompletionData2;
        String str3;
        boolean z2;
        List listEmptyList;
        List listEmptyList2;
        List listEmptyList3;
        String str4 = (i & 1) != 0 ? EPaperScreens.ENTRY_POINT : str;
        Release release2 = null;
        if ((i & 2) != 0) {
            int i2 = ArtificialStackFrames + 11;
            toString = i2 % 128;
            int i3 = i2 % 2;
            transactionCompletionData2 = null;
        } else {
            transactionCompletionData2 = transactionCompletionData;
        }
        List listEmptyList4 = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 8) != 0) {
            int i4 = 2 % 2;
            str3 = "";
        } else {
            str3 = str2;
        }
        if ((i & 16) != 0) {
            int i5 = ArtificialStackFrames + 113;
            toString = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 32) != 0) {
            listEmptyList = CollectionsKt.emptyList();
            int i8 = 2 % 2;
        } else {
            listEmptyList = list2;
        }
        if ((i & 64) != 0) {
            int i9 = ArtificialStackFrames + 43;
            toString = i9 % 128;
            int i10 = i9 % 2;
            listEmptyList2 = CollectionsKt.emptyList();
        } else {
            listEmptyList2 = list3;
        }
        IPublication iPublication2 = (i & 128) != 0 ? null : iPublication;
        if ((i & 256) != 0) {
            int i11 = ArtificialStackFrames + 101;
            toString = i11 % 128;
            int i12 = i11 % 2;
            listEmptyList3 = CollectionsKt.emptyList();
        } else {
            listEmptyList3 = list4;
        }
        List listEmptyList5 = (i & 512) != 0 ? CollectionsKt.emptyList() : list5;
        if ((i & 1024) != 0) {
            int i13 = ArtificialStackFrames + 119;
            toString = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        } else {
            release2 = release;
        }
        this(str4, transactionCompletionData2, listEmptyList4, str3, z2, listEmptyList, listEmptyList2, iPublication2, listEmptyList3, listEmptyList5, release2);
    }

    public final String getCurrentScreen() {
        int i = 2 % 2;
        int i2 = toString + 93;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 49;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final TransactionCompletionData getCompletionData() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 113;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        TransactionCompletionData transactionCompletionData = this.component1;
        int i5 = i3 + 83;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return transactionCompletionData;
    }

    public final List<TabItem> getTabs() {
        List<TabItem> list;
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 101;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.equals;
            int i4 = 13 / 0;
        } else {
            list = this.equals;
        }
        int i5 = i2 + 79;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = toString + 23;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 37;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getHasSubscriptions() {
        int i = 2 % 2;
        int i2 = toString + 55;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 37;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final List<IPublication> getBoughtNewspapers() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 19;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    public final List<IPublication> getNewspapers() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 111;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        List<IPublication> list = this.getRequestBeneficiariesState;
        int i5 = i2 + 73;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IPublication getSelectedPublication() {
        int i = 2 % 2;
        int i2 = toString + 99;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        IPublication iPublication = this.component4;
        int i5 = i3 + 83;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return iPublication;
    }

    public final List<IPublication> getOldNewspapers() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 75;
        int i3 = i2 % 128;
        toString = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<IPublication> list = this.getAsAtTimestamp;
        int i4 = i3 + 35;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final List<IPublication> getTodaysNewspapers() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 123;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        List<IPublication> list = this.hashCode;
        int i5 = i2 + 33;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Release getRelease() {
        int i = 2 % 2;
        int i2 = toString + 15;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        Release release = this.copy;
        int i5 = i3 + 3;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return release;
    }

    static {
        int i = 39 % 2;
    }

    public EPaperUIState() {
        this(null, null, null, null, false, null, null, null, null, null, null, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EPaperUIState copy$default(EPaperUIState ePaperUIState, String str, TransactionCompletionData transactionCompletionData, List list, String str2, boolean z, List list2, List list3, IPublication iPublication, List list4, List list5, Release release, int i, Object obj) {
        List list6;
        String str3;
        List list7;
        List list8;
        List list9;
        int i2 = 2 % 2;
        String str4 = (i & 1) != 0 ? ePaperUIState.copydefault : str;
        TransactionCompletionData transactionCompletionData2 = (i & 2) != 0 ? ePaperUIState.component1 : transactionCompletionData;
        if ((i & 4) != 0) {
            int i3 = toString + 35;
            ArtificialStackFrames = i3 % 128;
            int i4 = i3 % 2;
            list6 = ePaperUIState.equals;
        } else {
            list6 = list;
        }
        if ((i & 8) != 0) {
            str3 = ePaperUIState.component3;
            int i5 = ArtificialStackFrames + 59;
            toString = i5 % 128;
            int i6 = i5 % 2;
        } else {
            str3 = str2;
        }
        boolean z2 = (i & 16) != 0 ? ePaperUIState.ShareDataUIState : z;
        if ((i & 32) != 0) {
            int i7 = toString + 85;
            ArtificialStackFrames = i7 % 128;
            int i8 = i7 % 2;
            list7 = ePaperUIState.component2;
        } else {
            list7 = list2;
        }
        Object obj2 = null;
        if ((i & 64) != 0) {
            int i9 = toString + 17;
            ArtificialStackFrames = i9 % 128;
            if (i9 % 2 == 0) {
                List<IPublication> list10 = ePaperUIState.getRequestBeneficiariesState;
                obj2.hashCode();
                throw null;
            }
            list8 = ePaperUIState.getRequestBeneficiariesState;
        } else {
            list8 = list3;
        }
        IPublication iPublication2 = (i & 128) != 0 ? ePaperUIState.component4 : iPublication;
        List list11 = (i & 256) != 0 ? ePaperUIState.getAsAtTimestamp : list4;
        if ((i & 512) != 0) {
            int i10 = toString + 27;
            ArtificialStackFrames = i10 % 128;
            if (i10 % 2 == 0) {
                List<IPublication> list12 = ePaperUIState.hashCode;
                obj2.hashCode();
                throw null;
            }
            list9 = ePaperUIState.hashCode;
        } else {
            list9 = list5;
        }
        return ePaperUIState.copy(str4, transactionCompletionData2, list6, str3, z2, list7, list8, iPublication2, list11, list9, (i & 1024) != 0 ? ePaperUIState.copy : release);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 57;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 29;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<IPublication> component10() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 115;
        toString = i3 % 128;
        int i4 = i3 % 2;
        List<IPublication> list = this.hashCode;
        int i5 = i2 + 83;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Release component11() {
        Release release;
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 89;
        toString = i3 % 128;
        if (i3 % 2 != 0) {
            release = this.copy;
            int i4 = 46 / 0;
        } else {
            release = this.copy;
        }
        int i5 = i2 + 117;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return release;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TransactionCompletionData component2() {
        int i = 2 % 2;
        int i2 = toString + 79;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        TransactionCompletionData transactionCompletionData = this.component1;
        int i4 = i3 + 1;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            return transactionCompletionData;
        }
        obj.hashCode();
        throw null;
    }

    public final List<TabItem> component3() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 55;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.equals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = toString + 13;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 95;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return str;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 11;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<IPublication> component6() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 37;
        toString = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<IPublication> list = this.component2;
        int i4 = i2 + 81;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final List<IPublication> component7() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 81;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        List<IPublication> list = this.getRequestBeneficiariesState;
        int i5 = i3 + 101;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final IPublication component8() {
        int i = 2 % 2;
        int i2 = toString + 23;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        IPublication iPublication = this.component4;
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        return iPublication;
    }

    public final List<IPublication> component9() {
        int i = 2 % 2;
        int i2 = toString + 93;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<IPublication> list = this.getAsAtTimestamp;
        int i4 = i3 + 21;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final EPaperUIState copy(String currentScreen, TransactionCompletionData completionData, List<TabItem> tabs, String errorMessage, boolean hasSubscriptions, List<? extends IPublication> boughtNewspapers, List<? extends IPublication> newspapers, IPublication selectedPublication, List<? extends IPublication> oldNewspapers, List<? extends IPublication> todaysNewspapers, Release release) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(currentScreen, "");
        Intrinsics.checkNotNullParameter(tabs, "");
        Intrinsics.checkNotNullParameter(errorMessage, "");
        Intrinsics.checkNotNullParameter(boughtNewspapers, "");
        Intrinsics.checkNotNullParameter(newspapers, "");
        EPaperUIState ePaperUIState = new EPaperUIState(currentScreen, completionData, tabs, errorMessage, hasSubscriptions, boughtNewspapers, newspapers, selectedPublication, oldNewspapers, todaysNewspapers, release);
        int i2 = toString + 97;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return ePaperUIState;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ArtificialStackFrames + 97;
            toString = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof EPaperUIState)) {
            int i4 = toString + 25;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        EPaperUIState ePaperUIState = (EPaperUIState) other;
        if (!Intrinsics.areEqual(this.copydefault, ePaperUIState.copydefault) || !Intrinsics.areEqual(this.component1, ePaperUIState.component1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.equals, ePaperUIState.equals)) {
            int i6 = toString + 19;
            ArtificialStackFrames = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, ePaperUIState.component3)) {
            return false;
        }
        if (this.ShareDataUIState != ePaperUIState.ShareDataUIState) {
            int i8 = toString + 119;
            int i9 = i8 % 128;
            ArtificialStackFrames = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 71;
            toString = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, ePaperUIState.component2)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getRequestBeneficiariesState, ePaperUIState.getRequestBeneficiariesState)) {
            int i13 = ArtificialStackFrames + 61;
            toString = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component4, ePaperUIState.component4)) {
            return Intrinsics.areEqual(this.getAsAtTimestamp, ePaperUIState.getAsAtTimestamp) && Intrinsics.areEqual(this.hashCode, ePaperUIState.hashCode) && Intrinsics.areEqual(this.copy, ePaperUIState.copy);
        }
        int i15 = ArtificialStackFrames + 31;
        toString = i15 % 128;
        int i16 = i15 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.copydefault.hashCode();
        TransactionCompletionData transactionCompletionData = this.component1;
        if (transactionCompletionData == null) {
            iHashCode = 0;
        } else {
            iHashCode = transactionCompletionData.hashCode();
            int i2 = ArtificialStackFrames + 69;
            toString = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 / 5;
            }
        }
        int iHashCode5 = this.equals.hashCode();
        int iHashCode6 = this.component3.hashCode();
        int iHashCode7 = Boolean.hashCode(this.ShareDataUIState);
        int iHashCode8 = this.component2.hashCode();
        int iHashCode9 = this.getRequestBeneficiariesState.hashCode();
        IPublication iPublication = this.component4;
        if (iPublication == null) {
            int i4 = toString + 81;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = iPublication.hashCode();
        }
        List<IPublication> list = this.getAsAtTimestamp;
        if (list == null) {
            int i6 = toString + 9;
            ArtificialStackFrames = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = list.hashCode();
        }
        List<IPublication> list2 = this.hashCode;
        int iHashCode10 = list2 == null ? 0 : list2.hashCode();
        Release release = this.copy;
        int iHashCode11 = (((((((((((((((((((iHashCode4 * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode10) * 31) + (release != null ? release.hashCode() : 0);
        int i8 = ArtificialStackFrames + 65;
        toString = i8 % 128;
        int i9 = i8 % 2;
        return iHashCode11;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EPaperUIState(currentScreen=" + this.copydefault + ", completionData=" + this.component1 + ", tabs=" + this.equals + ", errorMessage=" + this.component3 + ", hasSubscriptions=" + this.ShareDataUIState + ", boughtNewspapers=" + this.component2 + ", newspapers=" + this.getRequestBeneficiariesState + ", selectedPublication=" + this.component4 + ", oldNewspapers=" + this.getAsAtTimestamp + ", todaysNewspapers=" + this.hashCode + ", release=" + this.copy + ")";
        int i2 = ArtificialStackFrames + 121;
        toString = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
