package com.safaricom.sharedui.compose.confirmation;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity;
import com.safaricom.consumer.commons.util.TextResource;
import com.safaricom.sharedui.compose.confirmation.ConfirmInfoItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\u000fHÆ\u0003J\t\u0010:\u001a\u00020\u000fHÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010*J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003JÀ\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\bHÇ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\b2\b\u0010C\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010D\u001a\u00020\u000fH×\u0001J\t\u0010E\u001a\u00020\u000bH×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010 R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010 R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010 ¨\u0006F"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/ConfirmTransactionState;", "", SfcServicePinActivity.EXTRA_SCREEN_TITLE, "Lcom/safaricom/consumer/commons/util/TextResource;", "transactionTitleLarge", "transactionHeaderTitle", "continueButtonText", "isContinueButtonEnabled", "", "useOverdraft", "placeholderName", "", "photoUrl", "shouldShowNewAvatarIcon", "iconResource", "", "iconTint", "backgroundCircleColor", "fields", "", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmTransactionFields;", "additionalDescription", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$AdditionalDescription;", "isOfflineModeOn", GriverMonitorConstants.KEY_IS_LOADING, "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;ZIILjava/lang/Integer;Ljava/util/List;Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$AdditionalDescription;ZZ)V", "getScreenTitle", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getTransactionTitleLarge", "getTransactionHeaderTitle", "getContinueButtonText", "()Z", "getUseOverdraft", "getPlaceholderName", "()Ljava/lang/String;", "getPhotoUrl", "getShouldShowNewAvatarIcon", "getIconResource", "()I", "getIconTint", "getBackgroundCircleColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFields", "()Ljava/util/List;", "getAdditionalDescription", "()Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$AdditionalDescription;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;ZIILjava/lang/Integer;Ljava/util/List;Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$AdditionalDescription;ZZ)Lcom/safaricom/sharedui/compose/confirmation/ConfirmTransactionState;", "equals", "other", "hashCode", "toString", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfirmTransactionState {
    public static final int $stable = 8;
    private final String ArtificialStackFrames;
    private final TextResource ShareDataUIState;
    private final Integer component1;
    private final ConfirmInfoItem.AdditionalDescription component2;
    private final List<ConfirmTransactionFields> component3;
    private final boolean component4;
    private final boolean copy;
    private final int copydefault;
    private final int equals;
    private final boolean getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final boolean getAsAtTimestamp;
    private final String getRequestBeneficiariesState;
    private final TextResource getShareableDataState;
    private final boolean getSponsorBeneficiariesState;
    private final TextResource hashCode;
    private final TextResource toString;

    public ConfirmTransactionState(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, boolean z, boolean z2, String str, String str2, boolean z3, int i, int i2, Integer num, List<ConfirmTransactionFields> list, ConfirmInfoItem.AdditionalDescription additionalDescription, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.toString = textResource;
        this.getShareableDataState = textResource2;
        this.hashCode = textResource3;
        this.ShareDataUIState = textResource4;
        this.getAsAtTimestamp = z;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = z2;
        this.ArtificialStackFrames = str;
        this.getRequestBeneficiariesState = str2;
        this.getSponsorBeneficiariesState = z3;
        this.copydefault = i;
        this.equals = i2;
        this.component1 = num;
        this.component3 = list;
        this.component2 = additionalDescription;
        this.component4 = z4;
        this.copy = z5;
    }

    public ConfirmTransactionState(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, boolean z, boolean z2, String str, String str2, boolean z3, int i, int i2, Integer num, List list, ConfirmInfoItem.AdditionalDescription additionalDescription, boolean z4, boolean z5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : textResource, (i3 & 2) != 0 ? null : textResource2, (i3 & 4) != 0 ? null : textResource3, (i3 & 8) != 0 ? null : textResource4, (i3 & 16) != 0 ? true : z, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? "" : str, (i3 & 128) == 0 ? str2 : "", (i3 & 256) != 0 ? false : z3, (i3 & 512) != 0 ? -1 : i, (i3 & 1024) == 0 ? i2 : -1, (i3 & 2048) != 0 ? null : num, (i3 & 4096) != 0 ? CollectionsKt.emptyList() : list, (i3 & 8192) != 0 ? null : additionalDescription, (i3 & 16384) != 0 ? false : z4, (i3 & 32768) != 0 ? false : z5);
    }

    public final TextResource getScreenTitle() {
        return this.toString;
    }

    public final TextResource getTransactionTitleLarge() {
        return this.getShareableDataState;
    }

    public final TextResource getTransactionHeaderTitle() {
        return this.hashCode;
    }

    public final TextResource getContinueButtonText() {
        return this.ShareDataUIState;
    }

    public final boolean isContinueButtonEnabled() {
        return this.getAsAtTimestamp;
    }

    public final boolean getUseOverdraft() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    public final String getPlaceholderName() {
        return this.ArtificialStackFrames;
    }

    public final String getPhotoUrl() {
        return this.getRequestBeneficiariesState;
    }

    public final boolean getShouldShowNewAvatarIcon() {
        return this.getSponsorBeneficiariesState;
    }

    public final int getIconResource() {
        return this.copydefault;
    }

    public final int getIconTint() {
        return this.equals;
    }

    public final Integer getBackgroundCircleColor() {
        return this.component1;
    }

    public final List<ConfirmTransactionFields> getFields() {
        return this.component3;
    }

    public final ConfirmInfoItem.AdditionalDescription getAdditionalDescription() {
        return this.component2;
    }

    public final boolean isOfflineModeOn() {
        return this.component4;
    }

    public final boolean isLoading() {
        return this.copy;
    }

    public ConfirmTransactionState() {
        this(null, null, null, null, false, false, null, null, false, 0, 0, null, null, null, false, false, 65535, null);
    }

    public final TextResource getToString() {
        return this.toString;
    }

    public final int getCopydefault() {
        return this.copydefault;
    }

    public final int getEquals() {
        return this.equals;
    }

    public final Integer getComponent1() {
        return this.component1;
    }

    public final List<ConfirmTransactionFields> component13() {
        return this.component3;
    }

    public final ConfirmInfoItem.AdditionalDescription getComponent2() {
        return this.component2;
    }

    public final boolean getComponent4() {
        return this.component4;
    }

    public final boolean getCopy() {
        return this.copy;
    }

    public final TextResource getGetShareableDataState() {
        return this.getShareableDataState;
    }

    public final TextResource getHashCode() {
        return this.hashCode;
    }

    public final TextResource getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final boolean getGetAsAtTimestamp() {
        return this.getAsAtTimestamp;
    }

    public final boolean getGetARTIFICIAL_FRAME_PACKAGE_NAME() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    public final String getArtificialStackFrames() {
        return this.ArtificialStackFrames;
    }

    public final String getGetRequestBeneficiariesState() {
        return this.getRequestBeneficiariesState;
    }

    public final boolean getGetSponsorBeneficiariesState() {
        return this.getSponsorBeneficiariesState;
    }

    public final ConfirmTransactionState copy(TextResource screenTitle, TextResource transactionTitleLarge, TextResource transactionHeaderTitle, TextResource continueButtonText, boolean isContinueButtonEnabled, boolean useOverdraft, String placeholderName, String photoUrl, boolean shouldShowNewAvatarIcon, int iconResource, int iconTint, Integer backgroundCircleColor, List<ConfirmTransactionFields> fields, ConfirmInfoItem.AdditionalDescription additionalDescription, boolean isOfflineModeOn, boolean isLoading) {
        Intrinsics.checkNotNullParameter(placeholderName, "");
        Intrinsics.checkNotNullParameter(photoUrl, "");
        Intrinsics.checkNotNullParameter(fields, "");
        return new ConfirmTransactionState(screenTitle, transactionTitleLarge, transactionHeaderTitle, continueButtonText, isContinueButtonEnabled, useOverdraft, placeholderName, photoUrl, shouldShowNewAvatarIcon, iconResource, iconTint, backgroundCircleColor, fields, additionalDescription, isOfflineModeOn, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmTransactionState)) {
            return false;
        }
        ConfirmTransactionState confirmTransactionState = (ConfirmTransactionState) other;
        return Intrinsics.areEqual(this.toString, confirmTransactionState.toString) && Intrinsics.areEqual(this.getShareableDataState, confirmTransactionState.getShareableDataState) && Intrinsics.areEqual(this.hashCode, confirmTransactionState.hashCode) && Intrinsics.areEqual(this.ShareDataUIState, confirmTransactionState.ShareDataUIState) && this.getAsAtTimestamp == confirmTransactionState.getAsAtTimestamp && this.getARTIFICIAL_FRAME_PACKAGE_NAME == confirmTransactionState.getARTIFICIAL_FRAME_PACKAGE_NAME && Intrinsics.areEqual(this.ArtificialStackFrames, confirmTransactionState.ArtificialStackFrames) && Intrinsics.areEqual(this.getRequestBeneficiariesState, confirmTransactionState.getRequestBeneficiariesState) && this.getSponsorBeneficiariesState == confirmTransactionState.getSponsorBeneficiariesState && this.copydefault == confirmTransactionState.copydefault && this.equals == confirmTransactionState.equals && Intrinsics.areEqual(this.component1, confirmTransactionState.component1) && Intrinsics.areEqual(this.component3, confirmTransactionState.component3) && Intrinsics.areEqual(this.component2, confirmTransactionState.component2) && this.component4 == confirmTransactionState.component4 && this.copy == confirmTransactionState.copy;
    }

    public int hashCode() {
        TextResource textResource = this.toString;
        int iHashCode = textResource == null ? 0 : textResource.hashCode();
        TextResource textResource2 = this.getShareableDataState;
        int iHashCode2 = textResource2 == null ? 0 : textResource2.hashCode();
        TextResource textResource3 = this.hashCode;
        int iHashCode3 = textResource3 == null ? 0 : textResource3.hashCode();
        TextResource textResource4 = this.ShareDataUIState;
        int iHashCode4 = textResource4 == null ? 0 : textResource4.hashCode();
        int iHashCode5 = Boolean.hashCode(this.getAsAtTimestamp);
        int iHashCode6 = Boolean.hashCode(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
        int iHashCode7 = this.ArtificialStackFrames.hashCode();
        int iHashCode8 = this.getRequestBeneficiariesState.hashCode();
        int iHashCode9 = Boolean.hashCode(this.getSponsorBeneficiariesState);
        int iHashCode10 = Integer.hashCode(this.copydefault);
        int iHashCode11 = Integer.hashCode(this.equals);
        Integer num = this.component1;
        int iHashCode12 = num == null ? 0 : num.hashCode();
        int iHashCode13 = this.component3.hashCode();
        ConfirmInfoItem.AdditionalDescription additionalDescription = this.component2;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (additionalDescription != null ? additionalDescription.hashCode() : 0)) * 31) + Boolean.hashCode(this.component4)) * 31) + Boolean.hashCode(this.copy);
    }

    public String toString() {
        return "ConfirmTransactionState(screenTitle=" + this.toString + ", transactionTitleLarge=" + this.getShareableDataState + ", transactionHeaderTitle=" + this.hashCode + ", continueButtonText=" + this.ShareDataUIState + ", isContinueButtonEnabled=" + this.getAsAtTimestamp + ", useOverdraft=" + this.getARTIFICIAL_FRAME_PACKAGE_NAME + ", placeholderName=" + this.ArtificialStackFrames + ", photoUrl=" + this.getRequestBeneficiariesState + ", shouldShowNewAvatarIcon=" + this.getSponsorBeneficiariesState + ", iconResource=" + this.copydefault + ", iconTint=" + this.equals + ", backgroundCircleColor=" + this.component1 + ", fields=" + this.component3 + ", additionalDescription=" + this.component2 + ", isOfflineModeOn=" + this.component4 + ", isLoading=" + this.copy + ')';
    }
}
