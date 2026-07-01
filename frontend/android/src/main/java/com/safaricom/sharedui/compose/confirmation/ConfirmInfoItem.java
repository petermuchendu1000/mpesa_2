package com.safaricom.sharedui.compose.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.common.primitives.SignedBytes;
import com.huawei.digitalpayment.common.theme.constants.ThemeConstants;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import com.safaricom.consumer.commons.statements.DisPlayItems;
import com.safaricom.consumer.commons.util.TextResource;
import com.safaricom.sharedui.compose.R;
import com.safaricom.sharedui.compose.confirmation.CategoryDetails;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "Landroid/os/Parcelable;", "<init>", "()V", "Content", "Header", "Divider", "AdditionalDescription", "ActionChip", "HighlightedContent", "FeeRequestDetails", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$ActionChip;", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$AdditionalDescription;", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$Content;", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$Divider;", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$FeeRequestDetails;", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$Header;", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$HighlightedContent;", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ConfirmInfoItem implements Parcelable {
    public static final int $stable = 0;

    private ConfirmInfoItem() {
    }

    public ConfirmInfoItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\n\u0012\b\b\u0003\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\"\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003Jl\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\n2\b\b\u0003\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÇ\u0001¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\u0006H\u0007J\u0013\u0010/\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u000101H×\u0003J\t\u00102\u001a\u00020\u0006H×\u0001J\t\u00103\u001a\u000204H×\u0001J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0006H\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R0\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010 R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006:"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$Content;", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "hint", "Lcom/safaricom/consumer/commons/util/TextResource;", "value", "valueColor", "", "valueInCaps", "", "additionalInfo", "Lkotlin/collections/ArrayList;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType;", "Ljava/util/ArrayList;", "actionIcon", "actionType", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;", "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;IZLjava/util/ArrayList;ILcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;)V", "getHint", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getValue", "getValueColor", "()I", "getValueInCaps", "()Z", "getAdditionalInfo", "()Ljava/util/ArrayList;", "setAdditionalInfo", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "getActionIcon", "setActionIcon", "(I)V", "getActionType", "()Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;", "setActionType", "(Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;IZLjava/util/ArrayList;ILcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;)Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$Content;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Content extends ConfirmInfoItem {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Content> CREATOR = new Creator();
        private int actionIcon;
        private ConfirmInfoAction actionType;
        private ArrayList<AdditionalInfoType> additionalInfo;
        private final TextResource hint;
        private final TextResource value;
        private final int valueColor;
        private final boolean valueInCaps;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Content> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Content createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "");
                TextResource textResource = (TextResource) parcel.readParcelable(Content.class.getClassLoader());
                TextResource textResource2 = (TextResource) parcel.readParcelable(Content.class.getClassLoader());
                int i = parcel.readInt();
                boolean z = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i2 = parcel.readInt();
                    arrayList = new ArrayList(i2);
                    for (int i3 = 0; i3 != i2; i3++) {
                        arrayList.add(parcel.readParcelable(Content.class.getClassLoader()));
                    }
                }
                return new Content(textResource, textResource2, i, z, arrayList, parcel.readInt(), ConfirmInfoAction.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Content[] newArray(int i) {
                return new Content[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public final TextResource getHint() {
            return this.hint;
        }

        public final TextResource getValue() {
            return this.value;
        }

        public final int getValueColor() {
            return this.valueColor;
        }

        public final boolean getValueInCaps() {
            return this.valueInCaps;
        }

        public Content(TextResource textResource, TextResource textResource2, int i, boolean z, ArrayList arrayList, int i2, ConfirmInfoAction confirmInfoAction, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : textResource, (i3 & 2) == 0 ? textResource2 : null, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? new ArrayList() : arrayList, (i3 & 32) != 0 ? -1 : i2, (i3 & 64) != 0 ? ConfirmInfoAction.NONE : confirmInfoAction);
        }

        public final ArrayList<AdditionalInfoType> getAdditionalInfo() {
            return this.additionalInfo;
        }

        public final void setAdditionalInfo(ArrayList<AdditionalInfoType> arrayList) {
            this.additionalInfo = arrayList;
        }

        public final int getActionIcon() {
            return this.actionIcon;
        }

        public final void setActionIcon(int i) {
            this.actionIcon = i;
        }

        public final ConfirmInfoAction getActionType() {
            return this.actionType;
        }

        public final void setActionType(ConfirmInfoAction confirmInfoAction) {
            Intrinsics.checkNotNullParameter(confirmInfoAction, "");
            this.actionType = confirmInfoAction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(TextResource textResource, TextResource textResource2, int i, boolean z, ArrayList<AdditionalInfoType> arrayList, int i2, ConfirmInfoAction confirmInfoAction) {
            super(null);
            Intrinsics.checkNotNullParameter(confirmInfoAction, "");
            this.hint = textResource;
            this.value = textResource2;
            this.valueColor = i;
            this.valueInCaps = z;
            this.additionalInfo = arrayList;
            this.actionIcon = i2;
            this.actionType = confirmInfoAction;
        }

        public Content() {
            this(null, null, 0, false, null, 0, null, 127, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Content copy$default(Content content, TextResource textResource, TextResource textResource2, int i, boolean z, ArrayList arrayList, int i2, ConfirmInfoAction confirmInfoAction, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                textResource = content.hint;
            }
            if ((i3 & 2) != 0) {
                textResource2 = content.value;
            }
            TextResource textResource3 = textResource2;
            if ((i3 & 4) != 0) {
                i = content.valueColor;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                z = content.valueInCaps;
            }
            boolean z2 = z;
            if ((i3 & 16) != 0) {
                arrayList = content.additionalInfo;
            }
            ArrayList arrayList2 = arrayList;
            if ((i3 & 32) != 0) {
                i2 = content.actionIcon;
            }
            int i5 = i2;
            if ((i3 & 64) != 0) {
                confirmInfoAction = content.actionType;
            }
            return content.copy(textResource, textResource3, i4, z2, arrayList2, i5, confirmInfoAction);
        }

        public final TextResource getHint() {
            return this.hint;
        }

        public final TextResource getValue() {
            return this.value;
        }

        public final int getValueColor() {
            return this.valueColor;
        }

        public final boolean getValueInCaps() {
            return this.valueInCaps;
        }

        public final ArrayList<AdditionalInfoType> component5() {
            return this.additionalInfo;
        }

        public final int getActionIcon() {
            return this.actionIcon;
        }

        public final ConfirmInfoAction getActionType() {
            return this.actionType;
        }

        public final Content copy(TextResource hint, TextResource value, int valueColor, boolean valueInCaps, ArrayList<AdditionalInfoType> additionalInfo, int actionIcon, ConfirmInfoAction actionType) {
            Intrinsics.checkNotNullParameter(actionType, "");
            return new Content(hint, value, valueColor, valueInCaps, additionalInfo, actionIcon, actionType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.hint, content.hint) && Intrinsics.areEqual(this.value, content.value) && this.valueColor == content.valueColor && this.valueInCaps == content.valueInCaps && Intrinsics.areEqual(this.additionalInfo, content.additionalInfo) && this.actionIcon == content.actionIcon && this.actionType == content.actionType;
        }

        public int hashCode() {
            TextResource textResource = this.hint;
            int iHashCode = textResource == null ? 0 : textResource.hashCode();
            TextResource textResource2 = this.value;
            int iHashCode2 = textResource2 == null ? 0 : textResource2.hashCode();
            int iHashCode3 = Integer.hashCode(this.valueColor);
            int iHashCode4 = Boolean.hashCode(this.valueInCaps);
            ArrayList<AdditionalInfoType> arrayList = this.additionalInfo;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (arrayList != null ? arrayList.hashCode() : 0)) * 31) + Integer.hashCode(this.actionIcon)) * 31) + this.actionType.hashCode();
        }

        public String toString() {
            return "Content(hint=" + this.hint + ", value=" + this.value + ", valueColor=" + this.valueColor + ", valueInCaps=" + this.valueInCaps + ", additionalInfo=" + this.additionalInfo + ", actionIcon=" + this.actionIcon + ", actionType=" + this.actionType + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeParcelable(this.hint, flags);
            dest.writeParcelable(this.value, flags);
            dest.writeInt(this.valueColor);
            dest.writeInt(this.valueInCaps ? 1 : 0);
            ArrayList<AdditionalInfoType> arrayList = this.additionalInfo;
            if (arrayList == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(arrayList.size());
                Iterator<AdditionalInfoType> it = arrayList.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
            dest.writeInt(this.actionIcon);
            this.actionType.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bX\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b&\u0010'J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010b\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010/J\t\u0010g\u001a\u00020\u0005HÆ\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010i\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u0005HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010p\u001a\u00020\u001bHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010#HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÐ\u0002\u0010x\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0011\u001a\u00020\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010yJ\b\u0010z\u001a\u00020\u0005H\u0007J\u0013\u0010{\u001a\u00020|2\b\u0010}\u001a\u0004\u0018\u00010~H×\u0003J\t\u0010\u007f\u001a\u00020\u0005H×\u0001J\n\u0010\u0080\u0001\u001a\u00020\u000bH×\u0001J\u001d\u0010\u0081\u0001\u001a\u00030\u0082\u00012\b\u0010\u0083\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u0005H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00100\u001a\u0004\b1\u0010/R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00100\u001a\u0004\b7\u0010/R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00100\u001a\u0004\b8\u0010/R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00100\u001a\u0004\b:\u0010/R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010+\"\u0004\b>\u0010?R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010)R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\bA\u0010/\"\u0004\bB\u0010CR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bE\u00103R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010)\"\u0004\bO\u0010PR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u00103\"\u0004\bR\u0010SR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0013\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010)R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010)¨\u0006\u0086\u0001"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$Header;", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "headerTitle", "Lcom/safaricom/consumer/commons/util/TextResource;", "headerTitleColor", "", "headerTitleBackgroundColor", "circleIcon", "circleIconTint", "circleIconTintColor", "placeholderName", "", "photoUri", "avatarColor", "Lcom/safaricom/sharedui/compose/confirmation/PlaceholderColors;", "circleImagePadding", "backgroundCircleColor", "drawablePicture", "drawablePictureTint", "name", "nameRes", "nameColor", "amount", "amountColor", "fee", DisPlayItems.TRANSACTION_ID, "categoryDetails", "Lcom/safaricom/sharedui/compose/confirmation/CategoryDetails;", "secondaryPicture", "Lcom/safaricom/sharedui/compose/confirmation/Picture;", "additionalDescription", "assetUrl", "assetDisplayShape", "Lcom/safaricom/sharedui/compose/confirmation/GifDisplayShape;", "scaleType", "Landroid/widget/ImageView$ScaleType;", ThemeConstants.COMMISSION, "feeReversed", "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;IIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/safaricom/sharedui/compose/confirmation/PlaceholderColors;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;Lcom/safaricom/consumer/commons/util/TextResource;ILcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/Integer;Lcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/String;Lcom/safaricom/sharedui/compose/confirmation/CategoryDetails;Lcom/safaricom/sharedui/compose/confirmation/Picture;Lcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/String;Lcom/safaricom/sharedui/compose/confirmation/GifDisplayShape;Landroid/widget/ImageView$ScaleType;Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;)V", "getHeaderTitle", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getHeaderTitleColor", "()I", "getHeaderTitleBackgroundColor", "getCircleIcon", "getCircleIconTint", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCircleIconTintColor", "getPlaceholderName", "()Ljava/lang/String;", "getPhotoUri", "getAvatarColor", "()Lcom/safaricom/sharedui/compose/confirmation/PlaceholderColors;", "getCircleImagePadding", "getBackgroundCircleColor", "getDrawablePicture", "getDrawablePictureTint", "getName", "getNameRes", "getNameColor", "setNameColor", "(I)V", "getAmount", "getAmountColor", "setAmountColor", "(Ljava/lang/Integer;)V", "getFee", "getTransactionId", "getCategoryDetails", "()Lcom/safaricom/sharedui/compose/confirmation/CategoryDetails;", "setCategoryDetails", "(Lcom/safaricom/sharedui/compose/confirmation/CategoryDetails;)V", "getSecondaryPicture", "()Lcom/safaricom/sharedui/compose/confirmation/Picture;", "setSecondaryPicture", "(Lcom/safaricom/sharedui/compose/confirmation/Picture;)V", "getAdditionalDescription", "setAdditionalDescription", "(Lcom/safaricom/consumer/commons/util/TextResource;)V", "getAssetUrl", "setAssetUrl", "(Ljava/lang/String;)V", "getAssetDisplayShape", "()Lcom/safaricom/sharedui/compose/confirmation/GifDisplayShape;", "setAssetDisplayShape", "(Lcom/safaricom/sharedui/compose/confirmation/GifDisplayShape;)V", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "getCommission", "getFeeReversed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "(Lcom/safaricom/consumer/commons/util/TextResource;IIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/safaricom/sharedui/compose/confirmation/PlaceholderColors;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;Lcom/safaricom/consumer/commons/util/TextResource;ILcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/Integer;Lcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/String;Lcom/safaricom/sharedui/compose/confirmation/CategoryDetails;Lcom/safaricom/sharedui/compose/confirmation/Picture;Lcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/String;Lcom/safaricom/sharedui/compose/confirmation/GifDisplayShape;Landroid/widget/ImageView$ScaleType;Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;)Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$Header;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Header extends ConfirmInfoItem {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Header> CREATOR = new Creator();
        private TextResource additionalDescription;
        private final TextResource amount;
        private Integer amountColor;
        private GifDisplayShape assetDisplayShape;
        private String assetUrl;
        private final PlaceholderColors avatarColor;
        private final Integer backgroundCircleColor;
        private CategoryDetails categoryDetails;
        private final int circleIcon;
        private final Integer circleIconTint;
        private final Integer circleIconTintColor;
        private final Integer circleImagePadding;
        private final TextResource commission;
        private final int drawablePicture;
        private final Integer drawablePictureTint;
        private final TextResource fee;
        private final TextResource feeReversed;
        private final TextResource headerTitle;
        private final int headerTitleBackgroundColor;
        private final int headerTitleColor;
        private final String name;
        private int nameColor;
        private final TextResource nameRes;
        private final String photoUri;
        private final String placeholderName;
        private final ImageView.ScaleType scaleType;
        private Picture secondaryPicture;
        private final String transactionId;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Header> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Header createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Header((TextResource) parcel.readParcelable(Header.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PlaceholderColors.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (TextResource) parcel.readParcelable(Header.class.getClassLoader()), parcel.readInt(), (TextResource) parcel.readParcelable(Header.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (TextResource) parcel.readParcelable(Header.class.getClassLoader()), parcel.readString(), (CategoryDetails) parcel.readParcelable(Header.class.getClassLoader()), parcel.readInt() == 0 ? null : Picture.CREATOR.createFromParcel(parcel), (TextResource) parcel.readParcelable(Header.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GifDisplayShape.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : ImageView.ScaleType.valueOf(parcel.readString()), (TextResource) parcel.readParcelable(Header.class.getClassLoader()), (TextResource) parcel.readParcelable(Header.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Header[] newArray(int i) {
                return new Header[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public final TextResource getHeaderTitle() {
            return this.headerTitle;
        }

        public final int getHeaderTitleColor() {
            return this.headerTitleColor;
        }

        public final int getHeaderTitleBackgroundColor() {
            return this.headerTitleBackgroundColor;
        }

        public final int getCircleIcon() {
            return this.circleIcon;
        }

        public final Integer getCircleIconTint() {
            return this.circleIconTint;
        }

        public final Integer getCircleIconTintColor() {
            return this.circleIconTintColor;
        }

        public final String getPlaceholderName() {
            return this.placeholderName;
        }

        public final String getPhotoUri() {
            return this.photoUri;
        }

        public final PlaceholderColors getAvatarColor() {
            return this.avatarColor;
        }

        public final Integer getCircleImagePadding() {
            return this.circleImagePadding;
        }

        public final Integer getBackgroundCircleColor() {
            return this.backgroundCircleColor;
        }

        public final int getDrawablePicture() {
            return this.drawablePicture;
        }

        public final Integer getDrawablePictureTint() {
            return this.drawablePictureTint;
        }

        public final String getName() {
            return this.name;
        }

        public final TextResource getNameRes() {
            return this.nameRes;
        }

        public Header(TextResource textResource, int i, int i2, int i3, Integer num, Integer num2, String str, String str2, PlaceholderColors placeholderColors, Integer num3, Integer num4, int i4, Integer num5, String str3, TextResource textResource2, int i5, TextResource textResource3, Integer num6, TextResource textResource4, String str4, CategoryDetails categoryDetails, Picture picture, TextResource textResource5, String str5, GifDisplayShape gifDisplayShape, ImageView.ScaleType scaleType, TextResource textResource6, TextResource textResource7, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, (i6 & 2) != 0 ? -1 : i, (i6 & 4) != 0 ? -1 : i2, (i6 & 8) == 0 ? i3 : -1, (i6 & 16) != 0 ? null : num, (i6 & 32) != 0 ? null : num2, (i6 & 64) != 0 ? null : str, (i6 & 128) != 0 ? null : str2, (i6 & 256) != 0 ? null : placeholderColors, (i6 & 512) != 0 ? null : num3, (i6 & 1024) != 0 ? null : num4, (i6 & 2048) != 0 ? 0 : i4, (i6 & 4096) != 0 ? null : num5, (i6 & 8192) != 0 ? null : str3, (i6 & 16384) != 0 ? null : textResource2, (i6 & 32768) != 0 ? R.color.confirm_info_name_default_color : i5, (i6 & 65536) != 0 ? null : textResource3, (i6 & 131072) != 0 ? null : num6, (i6 & 262144) != 0 ? null : textResource4, (i6 & 524288) != 0 ? null : str4, (i6 & 1048576) != 0 ? CategoryDetails.Hide.INSTANCE : categoryDetails, (i6 & 2097152) != 0 ? null : picture, (i6 & 4194304) != 0 ? null : textResource5, (i6 & 8388608) != 0 ? null : str5, (i6 & 16777216) != 0 ? null : gifDisplayShape, (i6 & 33554432) != 0 ? null : scaleType, (i6 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : textResource6, (i6 & 134217728) == 0 ? textResource7 : null);
        }

        public final int getNameColor() {
            return this.nameColor;
        }

        public final void setNameColor(int i) {
            this.nameColor = i;
        }

        public final TextResource getAmount() {
            return this.amount;
        }

        public final Integer getAmountColor() {
            return this.amountColor;
        }

        public final void setAmountColor(Integer num) {
            this.amountColor = num;
        }

        public final TextResource getFee() {
            return this.fee;
        }

        public final String getTransactionId() {
            return this.transactionId;
        }

        public final CategoryDetails getCategoryDetails() {
            return this.categoryDetails;
        }

        public final void setCategoryDetails(CategoryDetails categoryDetails) {
            Intrinsics.checkNotNullParameter(categoryDetails, "");
            this.categoryDetails = categoryDetails;
        }

        public final Picture getSecondaryPicture() {
            return this.secondaryPicture;
        }

        public final void setSecondaryPicture(Picture picture) {
            this.secondaryPicture = picture;
        }

        public final TextResource getAdditionalDescription() {
            return this.additionalDescription;
        }

        public final void setAdditionalDescription(TextResource textResource) {
            this.additionalDescription = textResource;
        }

        public final String getAssetUrl() {
            return this.assetUrl;
        }

        public final void setAssetUrl(String str) {
            this.assetUrl = str;
        }

        public final GifDisplayShape getAssetDisplayShape() {
            return this.assetDisplayShape;
        }

        public final void setAssetDisplayShape(GifDisplayShape gifDisplayShape) {
            this.assetDisplayShape = gifDisplayShape;
        }

        public final ImageView.ScaleType getScaleType() {
            return this.scaleType;
        }

        public final TextResource getCommission() {
            return this.commission;
        }

        public final TextResource getFeeReversed() {
            return this.feeReversed;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(TextResource textResource, int i, int i2, int i3, Integer num, Integer num2, String str, String str2, PlaceholderColors placeholderColors, Integer num3, Integer num4, int i4, Integer num5, String str3, TextResource textResource2, int i5, TextResource textResource3, Integer num6, TextResource textResource4, String str4, CategoryDetails categoryDetails, Picture picture, TextResource textResource5, String str5, GifDisplayShape gifDisplayShape, ImageView.ScaleType scaleType, TextResource textResource6, TextResource textResource7) {
            super(null);
            Intrinsics.checkNotNullParameter(textResource, "");
            Intrinsics.checkNotNullParameter(categoryDetails, "");
            this.headerTitle = textResource;
            this.headerTitleColor = i;
            this.headerTitleBackgroundColor = i2;
            this.circleIcon = i3;
            this.circleIconTint = num;
            this.circleIconTintColor = num2;
            this.placeholderName = str;
            this.photoUri = str2;
            this.avatarColor = placeholderColors;
            this.circleImagePadding = num3;
            this.backgroundCircleColor = num4;
            this.drawablePicture = i4;
            this.drawablePictureTint = num5;
            this.name = str3;
            this.nameRes = textResource2;
            this.nameColor = i5;
            this.amount = textResource3;
            this.amountColor = num6;
            this.fee = textResource4;
            this.transactionId = str4;
            this.categoryDetails = categoryDetails;
            this.secondaryPicture = picture;
            this.additionalDescription = textResource5;
            this.assetUrl = str5;
            this.assetDisplayShape = gifDisplayShape;
            this.scaleType = scaleType;
            this.commission = textResource6;
            this.feeReversed = textResource7;
        }

        public final TextResource getHeaderTitle() {
            return this.headerTitle;
        }

        public final Integer getCircleImagePadding() {
            return this.circleImagePadding;
        }

        public final Integer getBackgroundCircleColor() {
            return this.backgroundCircleColor;
        }

        public final int getDrawablePicture() {
            return this.drawablePicture;
        }

        public final Integer getDrawablePictureTint() {
            return this.drawablePictureTint;
        }

        public final String getName() {
            return this.name;
        }

        public final TextResource getNameRes() {
            return this.nameRes;
        }

        public final int getNameColor() {
            return this.nameColor;
        }

        public final TextResource getAmount() {
            return this.amount;
        }

        public final Integer getAmountColor() {
            return this.amountColor;
        }

        public final TextResource getFee() {
            return this.fee;
        }

        public final int getHeaderTitleColor() {
            return this.headerTitleColor;
        }

        public final String getTransactionId() {
            return this.transactionId;
        }

        public final CategoryDetails getCategoryDetails() {
            return this.categoryDetails;
        }

        public final Picture getSecondaryPicture() {
            return this.secondaryPicture;
        }

        public final TextResource getAdditionalDescription() {
            return this.additionalDescription;
        }

        public final String getAssetUrl() {
            return this.assetUrl;
        }

        public final GifDisplayShape getAssetDisplayShape() {
            return this.assetDisplayShape;
        }

        public final ImageView.ScaleType getScaleType() {
            return this.scaleType;
        }

        public final TextResource getCommission() {
            return this.commission;
        }

        public final TextResource getFeeReversed() {
            return this.feeReversed;
        }

        public final int getHeaderTitleBackgroundColor() {
            return this.headerTitleBackgroundColor;
        }

        public final int getCircleIcon() {
            return this.circleIcon;
        }

        public final Integer getCircleIconTint() {
            return this.circleIconTint;
        }

        public final Integer getCircleIconTintColor() {
            return this.circleIconTintColor;
        }

        public final String getPlaceholderName() {
            return this.placeholderName;
        }

        public final String getPhotoUri() {
            return this.photoUri;
        }

        public final PlaceholderColors getAvatarColor() {
            return this.avatarColor;
        }

        public final Header copy(TextResource headerTitle, int headerTitleColor, int headerTitleBackgroundColor, int circleIcon, Integer circleIconTint, Integer circleIconTintColor, String placeholderName, String photoUri, PlaceholderColors avatarColor, Integer circleImagePadding, Integer backgroundCircleColor, int drawablePicture, Integer drawablePictureTint, String name, TextResource nameRes, int nameColor, TextResource amount, Integer amountColor, TextResource fee, String transactionId, CategoryDetails categoryDetails, Picture secondaryPicture, TextResource additionalDescription, String assetUrl, GifDisplayShape assetDisplayShape, ImageView.ScaleType scaleType, TextResource commission, TextResource feeReversed) {
            Intrinsics.checkNotNullParameter(headerTitle, "");
            Intrinsics.checkNotNullParameter(categoryDetails, "");
            return new Header(headerTitle, headerTitleColor, headerTitleBackgroundColor, circleIcon, circleIconTint, circleIconTintColor, placeholderName, photoUri, avatarColor, circleImagePadding, backgroundCircleColor, drawablePicture, drawablePictureTint, name, nameRes, nameColor, amount, amountColor, fee, transactionId, categoryDetails, secondaryPicture, additionalDescription, assetUrl, assetDisplayShape, scaleType, commission, feeReversed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.areEqual(this.headerTitle, header.headerTitle) && this.headerTitleColor == header.headerTitleColor && this.headerTitleBackgroundColor == header.headerTitleBackgroundColor && this.circleIcon == header.circleIcon && Intrinsics.areEqual(this.circleIconTint, header.circleIconTint) && Intrinsics.areEqual(this.circleIconTintColor, header.circleIconTintColor) && Intrinsics.areEqual(this.placeholderName, header.placeholderName) && Intrinsics.areEqual(this.photoUri, header.photoUri) && Intrinsics.areEqual(this.avatarColor, header.avatarColor) && Intrinsics.areEqual(this.circleImagePadding, header.circleImagePadding) && Intrinsics.areEqual(this.backgroundCircleColor, header.backgroundCircleColor) && this.drawablePicture == header.drawablePicture && Intrinsics.areEqual(this.drawablePictureTint, header.drawablePictureTint) && Intrinsics.areEqual(this.name, header.name) && Intrinsics.areEqual(this.nameRes, header.nameRes) && this.nameColor == header.nameColor && Intrinsics.areEqual(this.amount, header.amount) && Intrinsics.areEqual(this.amountColor, header.amountColor) && Intrinsics.areEqual(this.fee, header.fee) && Intrinsics.areEqual(this.transactionId, header.transactionId) && Intrinsics.areEqual(this.categoryDetails, header.categoryDetails) && Intrinsics.areEqual(this.secondaryPicture, header.secondaryPicture) && Intrinsics.areEqual(this.additionalDescription, header.additionalDescription) && Intrinsics.areEqual(this.assetUrl, header.assetUrl) && this.assetDisplayShape == header.assetDisplayShape && this.scaleType == header.scaleType && Intrinsics.areEqual(this.commission, header.commission) && Intrinsics.areEqual(this.feeReversed, header.feeReversed);
        }

        public int hashCode() {
            int iHashCode = this.headerTitle.hashCode();
            int iHashCode2 = Integer.hashCode(this.headerTitleColor);
            int iHashCode3 = Integer.hashCode(this.headerTitleBackgroundColor);
            int iHashCode4 = Integer.hashCode(this.circleIcon);
            Integer num = this.circleIconTint;
            int iHashCode5 = num == null ? 0 : num.hashCode();
            Integer num2 = this.circleIconTintColor;
            int iHashCode6 = num2 == null ? 0 : num2.hashCode();
            String str = this.placeholderName;
            int iHashCode7 = str == null ? 0 : str.hashCode();
            String str2 = this.photoUri;
            int iHashCode8 = str2 == null ? 0 : str2.hashCode();
            PlaceholderColors placeholderColors = this.avatarColor;
            int iHashCode9 = placeholderColors == null ? 0 : placeholderColors.hashCode();
            Integer num3 = this.circleImagePadding;
            int iHashCode10 = num3 == null ? 0 : num3.hashCode();
            Integer num4 = this.backgroundCircleColor;
            int iHashCode11 = num4 == null ? 0 : num4.hashCode();
            int iHashCode12 = Integer.hashCode(this.drawablePicture);
            Integer num5 = this.drawablePictureTint;
            int iHashCode13 = num5 == null ? 0 : num5.hashCode();
            String str3 = this.name;
            int iHashCode14 = str3 == null ? 0 : str3.hashCode();
            TextResource textResource = this.nameRes;
            int iHashCode15 = textResource == null ? 0 : textResource.hashCode();
            int iHashCode16 = Integer.hashCode(this.nameColor);
            TextResource textResource2 = this.amount;
            int iHashCode17 = textResource2 == null ? 0 : textResource2.hashCode();
            Integer num6 = this.amountColor;
            int iHashCode18 = num6 == null ? 0 : num6.hashCode();
            TextResource textResource3 = this.fee;
            int iHashCode19 = textResource3 == null ? 0 : textResource3.hashCode();
            String str4 = this.transactionId;
            int iHashCode20 = str4 == null ? 0 : str4.hashCode();
            int iHashCode21 = this.categoryDetails.hashCode();
            Picture picture = this.secondaryPicture;
            int iHashCode22 = picture == null ? 0 : picture.hashCode();
            TextResource textResource4 = this.additionalDescription;
            int iHashCode23 = textResource4 == null ? 0 : textResource4.hashCode();
            String str5 = this.assetUrl;
            int iHashCode24 = str5 == null ? 0 : str5.hashCode();
            GifDisplayShape gifDisplayShape = this.assetDisplayShape;
            int iHashCode25 = gifDisplayShape == null ? 0 : gifDisplayShape.hashCode();
            ImageView.ScaleType scaleType = this.scaleType;
            int iHashCode26 = scaleType == null ? 0 : scaleType.hashCode();
            TextResource textResource5 = this.commission;
            int iHashCode27 = textResource5 == null ? 0 : textResource5.hashCode();
            TextResource textResource6 = this.feeReversed;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + (textResource6 == null ? 0 : textResource6.hashCode());
        }

        public String toString() {
            return "Header(headerTitle=" + this.headerTitle + ", headerTitleColor=" + this.headerTitleColor + ", headerTitleBackgroundColor=" + this.headerTitleBackgroundColor + ", circleIcon=" + this.circleIcon + ", circleIconTint=" + this.circleIconTint + ", circleIconTintColor=" + this.circleIconTintColor + ", placeholderName=" + this.placeholderName + ", photoUri=" + this.photoUri + ", avatarColor=" + this.avatarColor + ", circleImagePadding=" + this.circleImagePadding + ", backgroundCircleColor=" + this.backgroundCircleColor + ", drawablePicture=" + this.drawablePicture + ", drawablePictureTint=" + this.drawablePictureTint + ", name=" + this.name + ", nameRes=" + this.nameRes + ", nameColor=" + this.nameColor + ", amount=" + this.amount + ", amountColor=" + this.amountColor + ", fee=" + this.fee + ", transactionId=" + this.transactionId + ", categoryDetails=" + this.categoryDetails + ", secondaryPicture=" + this.secondaryPicture + ", additionalDescription=" + this.additionalDescription + ", assetUrl=" + this.assetUrl + ", assetDisplayShape=" + this.assetDisplayShape + ", scaleType=" + this.scaleType + ", commission=" + this.commission + ", feeReversed=" + this.feeReversed + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeParcelable(this.headerTitle, flags);
            dest.writeInt(this.headerTitleColor);
            dest.writeInt(this.headerTitleBackgroundColor);
            dest.writeInt(this.circleIcon);
            Integer num = this.circleIconTint;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            Integer num2 = this.circleIconTintColor;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeString(this.placeholderName);
            dest.writeString(this.photoUri);
            PlaceholderColors placeholderColors = this.avatarColor;
            if (placeholderColors == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                placeholderColors.writeToParcel(dest, flags);
            }
            Integer num3 = this.circleImagePadding;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num3.intValue());
            }
            Integer num4 = this.backgroundCircleColor;
            if (num4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num4.intValue());
            }
            dest.writeInt(this.drawablePicture);
            Integer num5 = this.drawablePictureTint;
            if (num5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num5.intValue());
            }
            dest.writeString(this.name);
            dest.writeParcelable(this.nameRes, flags);
            dest.writeInt(this.nameColor);
            dest.writeParcelable(this.amount, flags);
            Integer num6 = this.amountColor;
            if (num6 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num6.intValue());
            }
            dest.writeParcelable(this.fee, flags);
            dest.writeString(this.transactionId);
            dest.writeParcelable(this.categoryDetails, flags);
            Picture picture = this.secondaryPicture;
            if (picture == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                picture.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.additionalDescription, flags);
            dest.writeString(this.assetUrl);
            GifDisplayShape gifDisplayShape = this.assetDisplayShape;
            if (gifDisplayShape == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(gifDisplayShape.name());
            }
            ImageView.ScaleType scaleType = this.scaleType;
            if (scaleType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(scaleType.name());
            }
            dest.writeParcelable(this.commission, flags);
            dest.writeParcelable(this.feeReversed, flags);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$Divider;", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Divider extends ConfirmInfoItem {
        public static final int $stable = 0;
        public static final Divider INSTANCE = new Divider();
        public static final Parcelable.Creator<Divider> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Divider> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Divider createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Divider.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Divider[] newArray(int i) {
                return new Divider[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        private Divider() {
            super(null);
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010&\u001a\u00020\u000eHÆ\u0003J\\\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÇ\u0001¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020\fH\u0007J\u0013\u0010*\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010,H×\u0003J\t\u0010-\u001a\u00020\fH×\u0001J\t\u0010.\u001a\u00020\u0006H×\u0001J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\fH\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001f¨\u00064"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$AdditionalDescription;", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "addGifButton", "Lcom/safaricom/consumer/commons/util/TextResource;", "inputHint", "currentInput", "", "gifData", "Lcom/safaricom/sharedui/compose/confirmation/GifData;", "actionType", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;", "maxChars", "", "isEnabled", "", "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/String;Lcom/safaricom/sharedui/compose/confirmation/GifData;Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;Ljava/lang/Integer;Z)V", "getAddGifButton", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getInputHint", "getCurrentInput", "()Ljava/lang/String;", "setCurrentInput", "(Ljava/lang/String;)V", "getGifData", "()Lcom/safaricom/sharedui/compose/confirmation/GifData;", "getActionType", "()Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;", "getMaxChars", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/String;Lcom/safaricom/sharedui/compose/confirmation/GifData;Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;Ljava/lang/Integer;Z)Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$AdditionalDescription;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AdditionalDescription extends ConfirmInfoItem {
        public static final int $stable = 8;
        public static final Parcelable.Creator<AdditionalDescription> CREATOR = new Creator();
        private final ConfirmInfoAction actionType;
        private final TextResource addGifButton;
        private String currentInput;
        private final GifData gifData;
        private final TextResource inputHint;
        private final boolean isEnabled;
        private final Integer maxChars;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AdditionalDescription> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AdditionalDescription createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new AdditionalDescription((TextResource) parcel.readParcelable(AdditionalDescription.class.getClassLoader()), (TextResource) parcel.readParcelable(AdditionalDescription.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GifData.CREATOR.createFromParcel(parcel), ConfirmInfoAction.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final AdditionalDescription[] newArray(int i) {
                return new AdditionalDescription[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public final TextResource getAddGifButton() {
            return this.addGifButton;
        }

        public final TextResource getInputHint() {
            return this.inputHint;
        }

        public final String getCurrentInput() {
            return this.currentInput;
        }

        public final void setCurrentInput(String str) {
            this.currentInput = str;
        }

        public final GifData getGifData() {
            return this.gifData;
        }

        public AdditionalDescription(TextResource textResource, TextResource textResource2, String str, GifData gifData, ConfirmInfoAction confirmInfoAction, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : textResource, textResource2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : gifData, (i & 16) != 0 ? ConfirmInfoAction.NONE : confirmInfoAction, (i & 32) != 0 ? null : num, (i & 64) != 0 ? true : z);
        }

        public final ConfirmInfoAction getActionType() {
            return this.actionType;
        }

        public final Integer getMaxChars() {
            return this.maxChars;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdditionalDescription(TextResource textResource, TextResource textResource2, String str, GifData gifData, ConfirmInfoAction confirmInfoAction, Integer num, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(textResource2, "");
            Intrinsics.checkNotNullParameter(confirmInfoAction, "");
            this.addGifButton = textResource;
            this.inputHint = textResource2;
            this.currentInput = str;
            this.gifData = gifData;
            this.actionType = confirmInfoAction;
            this.maxChars = num;
            this.isEnabled = z;
        }

        public static AdditionalDescription copy$default(AdditionalDescription additionalDescription, TextResource textResource, TextResource textResource2, String str, GifData gifData, ConfirmInfoAction confirmInfoAction, Integer num, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                textResource = additionalDescription.addGifButton;
            }
            if ((i & 2) != 0) {
                textResource2 = additionalDescription.inputHint;
            }
            TextResource textResource3 = textResource2;
            if ((i & 4) != 0) {
                str = additionalDescription.currentInput;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                gifData = additionalDescription.gifData;
            }
            GifData gifData2 = gifData;
            if ((i & 16) != 0) {
                confirmInfoAction = additionalDescription.actionType;
            }
            ConfirmInfoAction confirmInfoAction2 = confirmInfoAction;
            if ((i & 32) != 0) {
                num = additionalDescription.maxChars;
            }
            Integer num2 = num;
            if ((i & 64) != 0) {
                z = additionalDescription.isEnabled;
            }
            return additionalDescription.copy(textResource, textResource3, str2, gifData2, confirmInfoAction2, num2, z);
        }

        public final TextResource getAddGifButton() {
            return this.addGifButton;
        }

        public final TextResource getInputHint() {
            return this.inputHint;
        }

        public final String getCurrentInput() {
            return this.currentInput;
        }

        public final GifData getGifData() {
            return this.gifData;
        }

        public final ConfirmInfoAction getActionType() {
            return this.actionType;
        }

        public final Integer getMaxChars() {
            return this.maxChars;
        }

        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        public final AdditionalDescription copy(TextResource addGifButton, TextResource inputHint, String currentInput, GifData gifData, ConfirmInfoAction actionType, Integer maxChars, boolean isEnabled) {
            Intrinsics.checkNotNullParameter(inputHint, "");
            Intrinsics.checkNotNullParameter(actionType, "");
            return new AdditionalDescription(addGifButton, inputHint, currentInput, gifData, actionType, maxChars, isEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalDescription)) {
                return false;
            }
            AdditionalDescription additionalDescription = (AdditionalDescription) other;
            return Intrinsics.areEqual(this.addGifButton, additionalDescription.addGifButton) && Intrinsics.areEqual(this.inputHint, additionalDescription.inputHint) && Intrinsics.areEqual(this.currentInput, additionalDescription.currentInput) && Intrinsics.areEqual(this.gifData, additionalDescription.gifData) && this.actionType == additionalDescription.actionType && Intrinsics.areEqual(this.maxChars, additionalDescription.maxChars) && this.isEnabled == additionalDescription.isEnabled;
        }

        public int hashCode() {
            TextResource textResource = this.addGifButton;
            int iHashCode = textResource == null ? 0 : textResource.hashCode();
            int iHashCode2 = this.inputHint.hashCode();
            String str = this.currentInput;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            GifData gifData = this.gifData;
            int iHashCode4 = gifData == null ? 0 : gifData.hashCode();
            int iHashCode5 = this.actionType.hashCode();
            Integer num = this.maxChars;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isEnabled);
        }

        public String toString() {
            return "AdditionalDescription(addGifButton=" + this.addGifButton + ", inputHint=" + this.inputHint + ", currentInput=" + this.currentInput + ", gifData=" + this.gifData + ", actionType=" + this.actionType + ", maxChars=" + this.maxChars + ", isEnabled=" + this.isEnabled + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeParcelable(this.addGifButton, flags);
            dest.writeParcelable(this.inputHint, flags);
            dest.writeString(this.currentInput);
            GifData gifData = this.gifData;
            if (gifData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                gifData.writeToParcel(dest, flags);
            }
            this.actionType.writeToParcel(dest, flags);
            Integer num = this.maxChars;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeInt(this.isEnabled ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0016\u001a\u00020\u0005H\u0007J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$ActionChip;", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "text", "Lcom/safaricom/consumer/commons/util/TextResource;", CdpConstants.CONTENT_TEXT_COLOR, "", "backgroundColor", "actionValue", "", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;IILjava/lang/String;Landroid/text/TextUtils$TruncateAt;)V", "getText", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getTextColor", "()I", "getBackgroundColor", "getActionValue", "()Ljava/lang/String;", "getEllipsize", "()Landroid/text/TextUtils$TruncateAt;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActionChip extends ConfirmInfoItem {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ActionChip> CREATOR = new Creator();
        private final String actionValue;
        private final int backgroundColor;
        private final TextUtils.TruncateAt ellipsize;
        private final TextResource text;
        private final int textColor;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActionChip> {
            private static final byte[] $$a = {SignedBytes.MAX_POWER_OF_TWO, -61, 76, -90, 6, -5, 3};
            private static final int $$b = 139;
            private static int copydefault = 0;
            private static int ShareDataUIState = 1;

            private static void a(int i, int i2, byte b2, Object[] objArr) {
                int i3 = (i * 2) + 97;
                int i4 = i2 * 3;
                byte[] bArr = $$a;
                int i5 = (b2 * 3) + 4;
                byte[] bArr2 = new byte[4 - i4];
                int i6 = 3 - i4;
                int i7 = -1;
                if (bArr == null) {
                    i3 = i5 + i3 + 6;
                    i5++;
                    i7 = -1;
                }
                while (true) {
                    int i8 = i7 + 1;
                    bArr2[i8] = (byte) i3;
                    if (i8 == i6) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i9 = i5;
                    i3 = i3 + bArr[i5] + 6;
                    i5 = i9 + 1;
                    i7 = i8;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ActionChip createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ActionChip((TextResource) parcel.readParcelable(ActionChip.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : TextUtils.TruncateAt.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ActionChip[] newArray(int i) {
                return new ActionChip[i];
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0119 A[Catch: all -> 0x09b9, TryCatch #0 {all -> 0x09b9, blocks: (B:3:0x000a, B:6:0x0016, B:7:0x004c, B:16:0x0113, B:18:0x0119, B:19:0x0158, B:48:0x0470, B:50:0x0478, B:51:0x04b6, B:60:0x05ac, B:62:0x05b2, B:63:0x05ef, B:87:0x076f, B:89:0x077c, B:90:0x07c0, B:40:0x0319, B:42:0x031f, B:44:0x035d), top: B:98:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x01ab  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0209  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x025b  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0263  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x028a  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0292  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0478 A[Catch: all -> 0x09b9, TryCatch #0 {all -> 0x09b9, blocks: (B:3:0x000a, B:6:0x0016, B:7:0x004c, B:16:0x0113, B:18:0x0119, B:19:0x0158, B:48:0x0470, B:50:0x0478, B:51:0x04b6, B:60:0x05ac, B:62:0x05b2, B:63:0x05ef, B:87:0x076f, B:89:0x077c, B:90:0x07c0, B:40:0x0319, B:42:0x031f, B:44:0x035d), top: B:98:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:54:0x056e  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0572  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x05a9  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x06fc  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0716  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x071e  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x0754  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x075c  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x076a  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x077c A[Catch: all -> 0x09b9, TryCatch #0 {all -> 0x09b9, blocks: (B:3:0x000a, B:6:0x0016, B:7:0x004c, B:16:0x0113, B:18:0x0119, B:19:0x0158, B:48:0x0470, B:50:0x0478, B:51:0x04b6, B:60:0x05ac, B:62:0x05b2, B:63:0x05ef, B:87:0x076f, B:89:0x077c, B:90:0x07c0, B:40:0x0319, B:42:0x031f, B:44:0x035d), top: B:98:0x000a }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static java.lang.Object[] ShareDataUIState(int r39, int r40, int r41) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 2498
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.safaricom.sharedui.compose.confirmation.ConfirmInfoItem.ActionChip.Creator.ShareDataUIState(int, int, int):java.lang.Object[]");
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public final TextResource getText() {
            return this.text;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getActionValue() {
            return this.actionValue;
        }

        public final TextUtils.TruncateAt getEllipsize() {
            return this.ellipsize;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionChip(TextResource textResource, int i, int i2, String str, TextUtils.TruncateAt truncateAt) {
            super(null);
            Intrinsics.checkNotNullParameter(textResource, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.text = textResource;
            this.textColor = i;
            this.backgroundColor = i2;
            this.actionValue = str;
            this.ellipsize = truncateAt;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeParcelable(this.text, flags);
            dest.writeInt(this.textColor);
            dest.writeInt(this.backgroundColor);
            dest.writeString(this.actionValue);
            TextUtils.TruncateAt truncateAt = this.ellipsize;
            if (truncateAt == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(truncateAt.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\fj\b\u0012\u0004\u0012\u00020\u000b`\n\u0012\b\b\u0001\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u001e\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\fj\b\u0012\u0004\u0012\u00020\u000b`\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003Jd\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\fj\b\u0012\u0004\u0012\u00020\u000b`\n2\b\b\u0003\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÇ\u0001¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\u0006H\u0007J\u0013\u0010/\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u000101H×\u0003J\t\u00102\u001a\u00020\u0006H×\u0001J\t\u00103\u001a\u000204H×\u0001J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0006H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R,\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\fj\b\u0012\u0004\u0012\u00020\u000b`\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010 R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006:"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$HighlightedContent;", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "hint", "Lcom/safaricom/consumer/commons/util/TextResource;", "value", "valueColor", "", "valueInCaps", "", "additionalInfo", "Lkotlin/collections/ArrayList;", "Lcom/safaricom/sharedui/compose/confirmation/AdditionalInfoType;", "Ljava/util/ArrayList;", "actionIcon", "actionType", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;", "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;IZLjava/util/ArrayList;ILcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;)V", "getHint", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getValue", "getValueColor", "()I", "getValueInCaps", "()Z", "getAdditionalInfo", "()Ljava/util/ArrayList;", "setAdditionalInfo", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "getActionIcon", "setActionIcon", "(I)V", "getActionType", "()Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;", "setActionType", "(Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;IZLjava/util/ArrayList;ILcom/safaricom/sharedui/compose/confirmation/ConfirmInfoAction;)Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$HighlightedContent;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HighlightedContent extends ConfirmInfoItem {
        public static final int $stable = 8;
        public static final Parcelable.Creator<HighlightedContent> CREATOR = new Creator();
        private int actionIcon;
        private ConfirmInfoAction actionType;
        private ArrayList<AdditionalInfoType> additionalInfo;
        private final TextResource hint;
        private final TextResource value;
        private final int valueColor;
        private final boolean valueInCaps;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<HighlightedContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final HighlightedContent createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                TextResource textResource = (TextResource) parcel.readParcelable(HighlightedContent.class.getClassLoader());
                TextResource textResource2 = (TextResource) parcel.readParcelable(HighlightedContent.class.getClassLoader());
                int i = parcel.readInt();
                boolean z = parcel.readInt() != 0;
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(parcel.readParcelable(HighlightedContent.class.getClassLoader()));
                }
                return new HighlightedContent(textResource, textResource2, i, z, arrayList, parcel.readInt(), ConfirmInfoAction.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final HighlightedContent[] newArray(int i) {
                return new HighlightedContent[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public final TextResource getHint() {
            return this.hint;
        }

        public final TextResource getValue() {
            return this.value;
        }

        public final int getValueColor() {
            return this.valueColor;
        }

        public final boolean getValueInCaps() {
            return this.valueInCaps;
        }

        public final ArrayList<AdditionalInfoType> getAdditionalInfo() {
            return this.additionalInfo;
        }

        public final void setAdditionalInfo(ArrayList<AdditionalInfoType> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.additionalInfo = arrayList;
        }

        public final int getActionIcon() {
            return this.actionIcon;
        }

        public final void setActionIcon(int i) {
            this.actionIcon = i;
        }

        public final ConfirmInfoAction getActionType() {
            return this.actionType;
        }

        public final void setActionType(ConfirmInfoAction confirmInfoAction) {
            Intrinsics.checkNotNullParameter(confirmInfoAction, "");
            this.actionType = confirmInfoAction;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HighlightedContent(TextResource textResource, TextResource textResource2, int i, boolean z, ArrayList<AdditionalInfoType> arrayList, int i2, ConfirmInfoAction confirmInfoAction) {
            super(null);
            Intrinsics.checkNotNullParameter(textResource, "");
            Intrinsics.checkNotNullParameter(textResource2, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(confirmInfoAction, "");
            this.hint = textResource;
            this.value = textResource2;
            this.valueColor = i;
            this.valueInCaps = z;
            this.additionalInfo = arrayList;
            this.actionIcon = i2;
            this.actionType = confirmInfoAction;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static HighlightedContent copy$default(HighlightedContent highlightedContent, TextResource textResource, TextResource textResource2, int i, boolean z, ArrayList arrayList, int i2, ConfirmInfoAction confirmInfoAction, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                textResource = highlightedContent.hint;
            }
            if ((i3 & 2) != 0) {
                textResource2 = highlightedContent.value;
            }
            TextResource textResource3 = textResource2;
            if ((i3 & 4) != 0) {
                i = highlightedContent.valueColor;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                z = highlightedContent.valueInCaps;
            }
            boolean z2 = z;
            if ((i3 & 16) != 0) {
                arrayList = highlightedContent.additionalInfo;
            }
            ArrayList arrayList2 = arrayList;
            if ((i3 & 32) != 0) {
                i2 = highlightedContent.actionIcon;
            }
            int i5 = i2;
            if ((i3 & 64) != 0) {
                confirmInfoAction = highlightedContent.actionType;
            }
            return highlightedContent.copy(textResource, textResource3, i4, z2, arrayList2, i5, confirmInfoAction);
        }

        public final TextResource getHint() {
            return this.hint;
        }

        public final TextResource getValue() {
            return this.value;
        }

        public final int getValueColor() {
            return this.valueColor;
        }

        public final boolean getValueInCaps() {
            return this.valueInCaps;
        }

        public final ArrayList<AdditionalInfoType> component5() {
            return this.additionalInfo;
        }

        public final int getActionIcon() {
            return this.actionIcon;
        }

        public final ConfirmInfoAction getActionType() {
            return this.actionType;
        }

        public final HighlightedContent copy(TextResource hint, TextResource value, int valueColor, boolean valueInCaps, ArrayList<AdditionalInfoType> additionalInfo, int actionIcon, ConfirmInfoAction actionType) {
            Intrinsics.checkNotNullParameter(hint, "");
            Intrinsics.checkNotNullParameter(value, "");
            Intrinsics.checkNotNullParameter(additionalInfo, "");
            Intrinsics.checkNotNullParameter(actionType, "");
            return new HighlightedContent(hint, value, valueColor, valueInCaps, additionalInfo, actionIcon, actionType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HighlightedContent)) {
                return false;
            }
            HighlightedContent highlightedContent = (HighlightedContent) other;
            return Intrinsics.areEqual(this.hint, highlightedContent.hint) && Intrinsics.areEqual(this.value, highlightedContent.value) && this.valueColor == highlightedContent.valueColor && this.valueInCaps == highlightedContent.valueInCaps && Intrinsics.areEqual(this.additionalInfo, highlightedContent.additionalInfo) && this.actionIcon == highlightedContent.actionIcon && this.actionType == highlightedContent.actionType;
        }

        public int hashCode() {
            return (((((((((((this.hint.hashCode() * 31) + this.value.hashCode()) * 31) + Integer.hashCode(this.valueColor)) * 31) + Boolean.hashCode(this.valueInCaps)) * 31) + this.additionalInfo.hashCode()) * 31) + Integer.hashCode(this.actionIcon)) * 31) + this.actionType.hashCode();
        }

        public String toString() {
            return "HighlightedContent(hint=" + this.hint + ", value=" + this.value + ", valueColor=" + this.valueColor + ", valueInCaps=" + this.valueInCaps + ", additionalInfo=" + this.additionalInfo + ", actionIcon=" + this.actionIcon + ", actionType=" + this.actionType + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeParcelable(this.hint, flags);
            dest.writeParcelable(this.value, flags);
            dest.writeInt(this.valueColor);
            dest.writeInt(this.valueInCaps ? 1 : 0);
            ArrayList<AdditionalInfoType> arrayList = this.additionalInfo;
            dest.writeInt(arrayList.size());
            Iterator<AdditionalInfoType> it = arrayList.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeInt(this.actionIcon);
            this.actionType.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem$FeeRequestDetails;", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "feeRequestId", "", "<init>", "(Ljava/lang/String;)V", "getFeeRequestId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FeeRequestDetails extends ConfirmInfoItem {
        public static final int $stable = 0;
        public static final Parcelable.Creator<FeeRequestDetails> CREATOR = new Creator();
        private final String feeRequestId;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FeeRequestDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final FeeRequestDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new FeeRequestDetails(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final FeeRequestDetails[] newArray(int i) {
                return new FeeRequestDetails[i];
            }
        }

        @Override
        public final int describeContents() {
            return 0;
        }

        public FeeRequestDetails(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final String getFeeRequestId() {
            return this.feeRequestId;
        }

        public FeeRequestDetails(String str) {
            super(null);
            this.feeRequestId = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FeeRequestDetails() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static FeeRequestDetails copy$default(FeeRequestDetails feeRequestDetails, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feeRequestDetails.feeRequestId;
            }
            return feeRequestDetails.copy(str);
        }

        public final String getFeeRequestId() {
            return this.feeRequestId;
        }

        public final FeeRequestDetails copy(String feeRequestId) {
            return new FeeRequestDetails(feeRequestId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FeeRequestDetails) && Intrinsics.areEqual(this.feeRequestId, ((FeeRequestDetails) other).feeRequestId);
        }

        public int hashCode() {
            String str = this.feeRequestId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "FeeRequestDetails(feeRequestId=" + this.feeRequestId + ')';
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.feeRequestId);
        }
    }
}
