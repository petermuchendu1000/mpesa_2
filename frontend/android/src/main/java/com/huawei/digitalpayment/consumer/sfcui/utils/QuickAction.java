package com.huawei.digitalpayment.consumer.sfcui.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\t\u00103\u001a\u00020\u0010HÆ\u0003J\u0081\u0001\u00104\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÇ\u0001J\b\u00105\u001a\u00020\u0003H\u0007J\u0013\u00106\u001a\u00020\u000b2\b\u00107\u001a\u0004\u0018\u000108H×\u0003J\t\u00109\u001a\u00020\u0003H×\u0001J\t\u0010:\u001a\u00020\u0010H×\u0001J\u0018\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001dR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u000e\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u001d\"\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%¨\u0006@"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickAction;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "title", "icon", "color", "shortTitle", "quickActionType", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionType;", "isActive", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionState;", "isSelected", "idStr", "", "titleStr", KeysConstants.KEY_EXECUTE, "<init>", "(IIIIILcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionType;ZLcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionState;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getTitle", "getIcon", "getColor", "getShortTitle", "getQuickActionType", "()Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionType;", "()Z", "getState", "()Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionState;", "setState", "(Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionState;)V", "setSelected", "(Z)V", "getIdStr", "()Ljava/lang/String;", "getTitleStr", "getExecute", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickAction implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuickAction> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private final int color;
    private final String execute;
    private final int icon;
    private final int id;
    private final String idStr;
    private final boolean isActive;
    private boolean isSelected;
    private final QuickActionType quickActionType;
    private final int shortTitle;
    private QuickActionState state;
    private final int title;
    private final String titleStr;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QuickAction> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final QuickAction createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            QuickActionType quickActionType = (QuickActionType) parcel.readParcelable(QuickAction.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i7 = ShareDataUIState + 73;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            QuickActionState quickActionStateValueOf = QuickActionState.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i9 = ShareDataUIState + 85;
                int i10 = i9 % 128;
                component1 = i10;
                boolean z3 = i9 % 2 != 0;
                int i11 = i10 + 5;
                ShareDataUIState = i11 % 128;
                int i12 = i11 % 2;
                z2 = z3;
            } else {
                z2 = false;
            }
            return new QuickAction(i2, i3, i4, i5, i6, quickActionType, z, quickActionStateValueOf, z2, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override
        public QuickAction createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 23;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            QuickAction quickActionCreateFromParcel = createFromParcel(parcel);
            int i3 = ShareDataUIState + 91;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return quickActionCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final QuickAction[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 77;
            ShareDataUIState = i4 % 128;
            QuickAction[] quickActionArr = new QuickAction[i];
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 13;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return quickActionArr;
        }

        @Override
        public QuickAction[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 33;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            QuickAction[] quickActionArrNewArray = newArray(i);
            int i5 = component1 + 33;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return quickActionArrNewArray;
        }
    }

    public QuickAction(int i, int i2, int i3, int i4, int i5, QuickActionType quickActionType, boolean z, QuickActionState quickActionState, boolean z2, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(quickActionType, "");
        Intrinsics.checkNotNullParameter(quickActionState, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = i;
        this.title = i2;
        this.icon = i3;
        this.color = i4;
        this.shortTitle = i5;
        this.quickActionType = quickActionType;
        this.isActive = z;
        this.state = quickActionState;
        this.isSelected = z2;
        this.idStr = str;
        this.titleStr = str2;
        this.execute = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickAction(int i, int i2, int i3, int i4, int i5, QuickActionType quickActionType, boolean z, QuickActionState quickActionState, boolean z2, String str, String str2, String str3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        int i7;
        int i8;
        int i9;
        int i10;
        QuickActionType.Transaction transaction;
        String str4;
        String str5;
        int i11 = (i6 & 1) != 0 ? 0 : i;
        boolean z3 = true;
        if ((i6 & 2) != 0) {
            int i12 = component3 + 95;
            ShareDataUIState = i12 % 128;
            i7 = i12 % 2 != 0 ? 1 : 0;
        } else {
            int i13 = 2 % 2;
            i7 = i2;
        }
        if ((i6 & 4) != 0) {
            int i14 = 2 % 2;
            i8 = 0;
        } else {
            i8 = i3;
        }
        if ((i6 & 8) != 0) {
            int i15 = ShareDataUIState + 57;
            component3 = i15 % 128;
            i9 = i15 % 2 == 0 ? 1 : 0;
        } else {
            i9 = i4;
        }
        if ((i6 & 16) != 0) {
            i10 = i7;
        } else {
            int i16 = ShareDataUIState + 99;
            component3 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = 2 % 2;
            i10 = i5;
        }
        if ((i6 & 32) != 0) {
            transaction = QuickActionType.Transaction.INSTANCE;
            int i19 = ShareDataUIState + 59;
            component3 = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 2 % 2;
        } else {
            transaction = quickActionType;
        }
        if ((i6 & 64) != 0) {
            int i22 = ShareDataUIState + 119;
            component3 = i22 % 128;
            int i23 = i22 % 2;
        } else {
            z3 = z;
        }
        QuickActionState quickActionState2 = (i6 & 128) != 0 ? QuickActionState.DEFAULT : quickActionState;
        boolean z4 = (i6 & 256) != 0 ? false : z2;
        if ((i6 & 512) != 0) {
            int i24 = ShareDataUIState + 63;
            component3 = i24 % 128;
            if (i24 % 2 == 0) {
                int i25 = 58 / 0;
            }
            str4 = "";
        } else {
            str4 = str;
        }
        if ((i6 & 1024) != 0) {
            int i26 = ShareDataUIState + 101;
            component3 = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = 2 % 2;
            }
            str5 = "";
        } else {
            str5 = str2;
        }
        this(i11, i7, i8, i9, i10, transaction, z3, quickActionState2, z4, str4, str5, (i6 & 2048) == 0 ? str3 : "");
    }

    public final int getId() {
        int i;
        int i2 = 2 % 2;
        int i3 = component3 + 67;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        if (i3 % 2 != 0) {
            i = this.id;
            int i5 = 58 / 0;
        } else {
            i = this.id;
        }
        int i6 = i4 + 63;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public final int getTitle() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.title;
        }
        throw null;
    }

    public final int getIcon() {
        int i;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 11;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 == 0) {
            i = this.icon;
            int i5 = 87 / 0;
        } else {
            i = this.icon;
        }
        int i6 = i4 + 93;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getColor() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.color;
        }
        throw null;
    }

    public final int getShortTitle() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.shortTitle;
        int i5 = i3 + 37;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final QuickActionType getQuickActionType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 67;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        QuickActionType quickActionType = this.quickActionType;
        int i5 = i2 + 121;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return quickActionType;
    }

    public final boolean isActive() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isActive;
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return z;
    }

    public final QuickActionState getState() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.state;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setState(QuickActionState quickActionState) {
        int i = 2 % 2;
        int i2 = component3 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quickActionState, "");
        this.state = quickActionState;
        int i4 = component3 + 111;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean isSelected() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.isSelected;
        int i5 = i3 + 9;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return z;
    }

    public final void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.isSelected = z;
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
    }

    public final String getIdStr() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.idStr;
        int i4 = i3 + 25;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getTitleStr() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.titleStr;
        int i4 = i3 + 21;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.execute;
        int i5 = i3 + 39;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component2 + 93;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public QuickAction() {
        this(0, 0, 0, 0, 0, null, false, null, false, null, null, null, 4095, null);
    }

    public static QuickAction copy$default(QuickAction quickAction, int i, int i2, int i3, int i4, int i5, QuickActionType quickActionType, boolean z, QuickActionState quickActionState, boolean z2, String str, String str2, String str3, int i6, Object obj) {
        int i7;
        QuickActionType quickActionType2;
        boolean z3;
        String str4;
        int i8 = 2 % 2;
        int i9 = (i6 & 1) != 0 ? quickAction.id : i;
        int i10 = (i6 & 2) != 0 ? quickAction.title : i2;
        int i11 = (i6 & 4) != 0 ? quickAction.icon : i3;
        int i12 = (i6 & 8) != 0 ? quickAction.color : i4;
        if ((i6 & 16) != 0) {
            int i13 = ShareDataUIState + 107;
            component3 = i13 % 128;
            int i14 = i13 % 2;
            i7 = quickAction.shortTitle;
        } else {
            i7 = i5;
        }
        if ((i6 & 32) != 0) {
            int i15 = ShareDataUIState + 33;
            component3 = i15 % 128;
            int i16 = i15 % 2;
            quickActionType2 = quickAction.quickActionType;
        } else {
            quickActionType2 = quickActionType;
        }
        if ((i6 & 64) != 0) {
            int i17 = component3 + 63;
            ShareDataUIState = i17 % 128;
            int i18 = i17 % 2;
            z3 = quickAction.isActive;
        } else {
            z3 = z;
        }
        QuickActionState quickActionState2 = (i6 & 128) != 0 ? quickAction.state : quickActionState;
        boolean z4 = (i6 & 256) != 0 ? quickAction.isSelected : z2;
        if ((i6 & 512) != 0) {
            int i19 = component3 + 83;
            ShareDataUIState = i19 % 128;
            if (i19 % 2 != 0) {
                String str5 = quickAction.idStr;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str4 = quickAction.idStr;
        } else {
            str4 = str;
        }
        QuickAction quickActionCopy = quickAction.copy(i9, i10, i11, i12, i7, quickActionType2, z3, quickActionState2, z4, str4, (i6 & 1024) != 0 ? quickAction.titleStr : str2, (i6 & 2048) != 0 ? quickAction.execute : str3);
        int i20 = component3 + 25;
        ShareDataUIState = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 6 / 0;
        }
        return quickActionCopy;
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 119;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.id;
        int i6 = i2 + 35;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.idStr;
        int i5 = i3 + 119;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.titleStr;
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 3;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.execute;
        int i4 = i2 + 119;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.title;
        int i5 = i2 + 7;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 115;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.icon;
        int i6 = i2 + 19;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component4() {
        int i;
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 105;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.color;
            int i5 = 71 / 0;
        } else {
            i = this.color;
        }
        int i6 = i3 + 117;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 113;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.shortTitle;
        int i6 = i2 + 77;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final QuickActionType component6() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 21;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        QuickActionType quickActionType = this.quickActionType;
        int i5 = i2 + 87;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return quickActionType;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isActive;
        int i5 = i2 + 65;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final QuickActionState component8() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        QuickActionState quickActionState = this.state;
        int i5 = i3 + 41;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return quickActionState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component9() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.isSelected;
        int i4 = i2 + 71;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return z;
    }

    public final QuickAction copy(int id, int title, int icon, int color, int shortTitle, QuickActionType quickActionType, boolean isActive, QuickActionState state, boolean isSelected, String idStr, String titleStr, String execute) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quickActionType, "");
        Intrinsics.checkNotNullParameter(state, "");
        Intrinsics.checkNotNullParameter(idStr, "");
        Intrinsics.checkNotNullParameter(titleStr, "");
        Intrinsics.checkNotNullParameter(execute, "");
        QuickAction quickAction = new QuickAction(id, title, icon, color, shortTitle, quickActionType, isActive, state, isSelected, idStr, titleStr, execute);
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return quickAction;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        component3 = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickAction)) {
            return false;
        }
        QuickAction quickAction = (QuickAction) other;
        if (this.id != quickAction.id || this.title != quickAction.title) {
            return false;
        }
        if (this.icon != quickAction.icon) {
            int i2 = component3 + 125;
            ShareDataUIState = i2 % 128;
            return i2 % 2 != 0;
        }
        if (this.color != quickAction.color) {
            return false;
        }
        if (this.shortTitle != quickAction.shortTitle) {
            int i3 = component3 + 81;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.quickActionType, quickAction.quickActionType)) {
            int i5 = component3 + 33;
            ShareDataUIState = i5 % 128;
            return i5 % 2 != 0;
        }
        if (this.isActive != quickAction.isActive || this.state != quickAction.state || this.isSelected != quickAction.isSelected) {
            return false;
        }
        if (Intrinsics.areEqual(this.idStr, quickAction.idStr)) {
            return Intrinsics.areEqual(this.titleStr, quickAction.titleStr) && Intrinsics.areEqual(this.execute, quickAction.execute);
        }
        int i6 = ShareDataUIState + 33;
        component3 = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.icon)) * 31) + Integer.hashCode(this.color)) * 31) + Integer.hashCode(this.shortTitle)) * 31) + this.quickActionType.hashCode()) * 31) + Boolean.hashCode(this.isActive)) * 31) + this.state.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.idStr.hashCode()) * 31) + this.titleStr.hashCode()) * 31) + this.execute.hashCode();
        int i4 = component3 + 27;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QuickAction(id=" + this.id + ", title=" + this.title + ", icon=" + this.icon + ", color=" + this.color + ", shortTitle=" + this.shortTitle + ", quickActionType=" + this.quickActionType + ", isActive=" + this.isActive + ", state=" + this.state + ", isSelected=" + this.isSelected + ", idStr=" + this.idStr + ", titleStr=" + this.titleStr + ", execute=" + this.execute + ")";
        int i2 = component3 + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.id);
        dest.writeInt(this.title);
        dest.writeInt(this.icon);
        dest.writeInt(this.color);
        dest.writeInt(this.shortTitle);
        dest.writeParcelable(this.quickActionType, flags);
        dest.writeInt(this.isActive ? 1 : 0);
        dest.writeString(this.state.name());
        dest.writeInt(this.isSelected ? 1 : 0);
        dest.writeString(this.idStr);
        dest.writeString(this.titleStr);
        dest.writeString(this.execute);
        int i4 = ShareDataUIState + 101;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
