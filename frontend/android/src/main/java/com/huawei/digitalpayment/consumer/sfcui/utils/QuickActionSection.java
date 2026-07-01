package com.huawei.digitalpayment.consumer.sfcui.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.iap.ac.android.acs.operation.log.LogConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionSection;", "Landroid/os/Parcelable;", LogConstants.Mpm.Interceptor.ACTION, "Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickAction;", "subActions", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickAction;Ljava/util/List;)V", "getAction", "()Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickAction;", "getSubActions", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickActionSection implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuickActionSection> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private final QuickAction action;
    private final List<QuickAction> subActions;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QuickActionSection> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final QuickActionSection createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            QuickAction quickActionCreateFromParcel = QuickAction.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = component2 + 23;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(QuickAction.CREATOR.createFromParcel(parcel));
                    i3 += 102;
                } else {
                    arrayList.add(QuickAction.CREATOR.createFromParcel(parcel));
                    i3++;
                }
            }
            return new QuickActionSection(quickActionCreateFromParcel, arrayList);
        }

        @Override
        public QuickActionSection createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 33;
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
        public final QuickActionSection[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 71;
            int i4 = i3 % 128;
            copydefault = i4;
            QuickActionSection[] quickActionSectionArr = new QuickActionSection[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 33;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return quickActionSectionArr;
            }
            throw null;
        }

        @Override
        public QuickActionSection[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 113;
            copydefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                newArray(i);
                obj.hashCode();
                throw null;
            }
            QuickActionSection[] quickActionSectionArrNewArray = newArray(i);
            int i4 = copydefault + 77;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return quickActionSectionArrNewArray;
            }
            throw null;
        }
    }

    public QuickActionSection(QuickAction quickAction, List<QuickAction> list) {
        Intrinsics.checkNotNullParameter(quickAction, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.action = quickAction;
        this.subActions = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickActionSection(QuickAction quickAction, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = component3 + 35;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                list = CollectionsKt.emptyList();
                int i3 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                throw null;
            }
        }
        this(quickAction, list);
    }

    public final QuickAction getAction() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        QuickAction quickAction = this.action;
        int i5 = i3 + 103;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return quickAction;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<QuickAction> getSubActions() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<QuickAction> list = this.subActions;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = component2 + 99;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static QuickActionSection copy$default(QuickActionSection quickActionSection, QuickAction quickAction, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 19;
        component1 = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            quickAction = quickActionSection.action;
            int i5 = i3 + 87;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            list = quickActionSection.subActions;
            int i7 = component1 + 91;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        }
        QuickActionSection quickActionSectionCopy = quickActionSection.copy(quickAction, list);
        int i9 = component1 + 107;
        component3 = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 43 / 0;
        }
        return quickActionSectionCopy;
    }

    public final QuickAction component1() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        QuickAction quickAction = this.action;
        int i5 = i3 + 93;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return quickAction;
    }

    public final List<QuickAction> component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<QuickAction> list = this.subActions;
        int i5 = i2 + 89;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final QuickActionSection copy(QuickAction action, List<QuickAction> subActions) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(subActions, "");
        QuickActionSection quickActionSection = new QuickActionSection(action, subActions);
        int i2 = component1 + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return quickActionSection;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 7;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.action, ((com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection) r6).action) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.subActions, r6.subActions)) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection.component3 + 53;
        com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection.component1 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection.component1
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection.component3 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 86
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection r6 = (com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection) r6
            com.huawei.digitalpayment.consumer.sfcui.utils.QuickAction r1 = r5.action
            com.huawei.digitalpayment.consumer.sfcui.utils.QuickAction r4 = r6.action
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L2b
            return r3
        L2b:
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.utils.QuickAction> r1 = r5.subActions
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.utils.QuickAction> r6 = r6.subActions
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            r6 = r6 ^ r2
            if (r6 == 0) goto L40
            int r6 = com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection.component3
            int r6 = r6 + 53
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection.component1 = r1
            int r6 = r6 % r0
            return r3
        L40:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component1 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.action.hashCode() - 30) >> this.subActions.hashCode() : (this.action.hashCode() * 31) + this.subActions.hashCode();
        int i3 = component3 + 23;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QuickActionSection(action=" + this.action + ", subActions=" + this.subActions + ")";
        int i2 = component3 + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.action.writeToParcel(dest, flags);
        List<QuickAction> list = this.subActions;
        dest.writeInt(list.size());
        Iterator<QuickAction> it = list.iterator();
        int i4 = component1 + 1;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 5;
        }
        while (it.hasNext()) {
            int i6 = component1 + 69;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            it.next().writeToParcel(dest, flags);
        }
    }
}
