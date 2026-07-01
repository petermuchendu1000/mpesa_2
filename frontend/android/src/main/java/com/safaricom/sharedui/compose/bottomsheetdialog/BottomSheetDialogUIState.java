package com.safaricom.sharedui.compose.bottomsheetdialog;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\b\u001eJT\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÇ\u0001¢\u0006\u0002\b J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010#\u001a\u00020$H×\u0001J\t\u0010%\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/safaricom/sharedui/compose/bottomsheetdialog/BottomSheetDialogUIState;", "", "title", "", "message", "Lcom/safaricom/sharedui/compose/bottomsheetdialog/BottomSheetMessage;", "positiveButtonLabel", "negativeButtonLabel", "showBackButton", "", "positiveButtonColor", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;Lcom/safaricom/sharedui/compose/bottomsheetdialog/BottomSheetMessage;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/graphics/Color;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "()Lcom/safaricom/sharedui/compose/bottomsheetdialog/BottomSheetMessage;", "getPositiveButtonLabel", "getNegativeButtonLabel", "getShowBackButton", "()Z", "getPositiveButtonColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "component1", "component2", "component3", "component4", "component5", "component6", "component6-QN2ZGVo", "copy", "copy-_GLGcWc", "equals", "other", "hashCode", "", "toString", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BottomSheetDialogUIState {
    public static final int $stable = 0;
    private final Color ShareDataUIState;
    private final boolean component1;
    private final BottomSheetMessage component2;
    private final String component3;
    private final String copydefault;
    private final String getRequestBeneficiariesState;

    private BottomSheetDialogUIState(String str, BottomSheetMessage bottomSheetMessage, String str2, String str3, boolean z, Color color) {
        this.getRequestBeneficiariesState = str;
        this.component2 = bottomSheetMessage;
        this.component3 = str2;
        this.copydefault = str3;
        this.component1 = z;
        this.ShareDataUIState = color;
    }

    public BottomSheetDialogUIState(String str, BottomSheetMessage bottomSheetMessage, String str2, String str3, boolean z, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bottomSheetMessage, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) == 0 ? color : null, null);
    }

    public final String getTitle() {
        return this.getRequestBeneficiariesState;
    }

    public final BottomSheetMessage getMessage() {
        return this.component2;
    }

    public final String getPositiveButtonLabel() {
        return this.component3;
    }

    public final String getNegativeButtonLabel() {
        return this.copydefault;
    }

    public final boolean getShowBackButton() {
        return this.component1;
    }

    public final Color m12790getPositiveButtonColorQN2ZGVo() {
        return this.ShareDataUIState;
    }

    public BottomSheetDialogUIState(String str, BottomSheetMessage bottomSheetMessage, String str2, String str3, boolean z, Color color, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bottomSheetMessage, str2, str3, z, color);
    }

    public static BottomSheetDialogUIState m12787copy_GLGcWc$default(BottomSheetDialogUIState bottomSheetDialogUIState, String str, BottomSheetMessage bottomSheetMessage, String str2, String str3, boolean z, Color color, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bottomSheetDialogUIState.getRequestBeneficiariesState;
        }
        if ((i & 2) != 0) {
            bottomSheetMessage = bottomSheetDialogUIState.component2;
        }
        BottomSheetMessage bottomSheetMessage2 = bottomSheetMessage;
        if ((i & 4) != 0) {
            str2 = bottomSheetDialogUIState.component3;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = bottomSheetDialogUIState.copydefault;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            z = bottomSheetDialogUIState.component1;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            color = bottomSheetDialogUIState.ShareDataUIState;
        }
        return bottomSheetDialogUIState.m12789copy_GLGcWc(str, bottomSheetMessage2, str4, str5, z2, color);
    }

    public final String getGetRequestBeneficiariesState() {
        return this.getRequestBeneficiariesState;
    }

    public final BottomSheetMessage getComponent2() {
        return this.component2;
    }

    public final String getComponent3() {
        return this.component3;
    }

    public final String getCopydefault() {
        return this.copydefault;
    }

    public final boolean getComponent1() {
        return this.component1;
    }

    public final Color getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final BottomSheetDialogUIState m12789copy_GLGcWc(String title, BottomSheetMessage message, String positiveButtonLabel, String negativeButtonLabel, boolean showBackButton, Color positiveButtonColor) {
        return new BottomSheetDialogUIState(title, message, positiveButtonLabel, negativeButtonLabel, showBackButton, positiveButtonColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheetDialogUIState)) {
            return false;
        }
        BottomSheetDialogUIState bottomSheetDialogUIState = (BottomSheetDialogUIState) other;
        return Intrinsics.areEqual(this.getRequestBeneficiariesState, bottomSheetDialogUIState.getRequestBeneficiariesState) && Intrinsics.areEqual(this.component2, bottomSheetDialogUIState.component2) && Intrinsics.areEqual(this.component3, bottomSheetDialogUIState.component3) && Intrinsics.areEqual(this.copydefault, bottomSheetDialogUIState.copydefault) && this.component1 == bottomSheetDialogUIState.component1 && Intrinsics.areEqual(this.ShareDataUIState, bottomSheetDialogUIState.ShareDataUIState);
    }

    public int hashCode() {
        String str = this.getRequestBeneficiariesState;
        int iHashCode = str == null ? 0 : str.hashCode();
        BottomSheetMessage bottomSheetMessage = this.component2;
        int iHashCode2 = bottomSheetMessage == null ? 0 : bottomSheetMessage.hashCode();
        String str2 = this.component3;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.copydefault;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        int iHashCode5 = Boolean.hashCode(this.component1);
        Color color = this.ShareDataUIState;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (color != null ? Color.m6061hashCodeimpl(color.m6064unboximpl()) : 0);
    }

    public String toString() {
        return "BottomSheetDialogUIState(title=" + this.getRequestBeneficiariesState + ", message=" + this.component2 + ", positiveButtonLabel=" + this.component3 + ", negativeButtonLabel=" + this.copydefault + ", showBackButton=" + this.component1 + ", positiveButtonColor=" + this.ShareDataUIState + ')';
    }
}
