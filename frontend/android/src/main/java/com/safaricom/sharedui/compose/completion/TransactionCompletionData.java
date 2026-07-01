package com.safaricom.sharedui.compose.completion;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.safaricom.sharedui.compose.helper.PinCheckoutType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.getDefaultDarkScrimannotations;
import kotlin.getDefaultLightScrim;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÇ\u0001J\b\u0010\u001e\u001a\u00020\u001fH\u0007J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\"H×\u0003J\t\u0010#\u001a\u00020\u001fH×\u0001J\t\u0010$\u001a\u00020\u0005H×\u0001J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006*"}, d2 = {"Lcom/safaricom/sharedui/compose/completion/TransactionCompletionData;", "Landroid/os/Parcelable;", Keys.KEY_IS_SUCCESS, "", "message", "", "boldKeywords", "", "checkoutType", "Lcom/safaricom/sharedui/compose/helper/PinCheckoutType;", "title", "retryEnabled", "<init>", "(ZLjava/lang/String;Ljava/util/List;Lcom/safaricom/sharedui/compose/helper/PinCheckoutType;Ljava/lang/String;Z)V", "()Z", "getMessage", "()Ljava/lang/String;", "getBoldKeywords", "()Ljava/util/List;", "getCheckoutType", "()Lcom/safaricom/sharedui/compose/helper/PinCheckoutType;", "getTitle", "getRetryEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionCompletionData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransactionCompletionData> CREATOR = new Creator();
    private final List<String> boldKeywords;
    private final PinCheckoutType checkoutType;
    private final boolean isSuccess;
    private final String message;
    private final boolean retryEnabled;
    private final String title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransactionCompletionData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TransactionCompletionData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TransactionCompletionData(parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList(), PinCheckoutType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TransactionCompletionData[] newArray(int i) {
            return new TransactionCompletionData[i];
        }

        public static void copydefault() {
            getDefaultDarkScrimannotations.copydefault[0] = getDefaultLightScrim.component2[0];
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public TransactionCompletionData(boolean z, String str, List<String> list, PinCheckoutType pinCheckoutType, String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(pinCheckoutType, "");
        this.isSuccess = z;
        this.message = str;
        this.boldKeywords = list;
        this.checkoutType = pinCheckoutType;
        this.title = str2;
        this.retryEnabled = z2;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public final String getMessage() {
        return this.message;
    }

    public TransactionCompletionData(boolean z, String str, List list, PinCheckoutType pinCheckoutType, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? PinCheckoutType.POA : pinCheckoutType, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? true : z2);
    }

    public final List<String> getBoldKeywords() {
        return this.boldKeywords;
    }

    public final PinCheckoutType getCheckoutType() {
        return this.checkoutType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getRetryEnabled() {
        return this.retryEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TransactionCompletionData copy$default(TransactionCompletionData transactionCompletionData, boolean z, String str, List list, PinCheckoutType pinCheckoutType, String str2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = transactionCompletionData.isSuccess;
        }
        if ((i & 2) != 0) {
            str = transactionCompletionData.message;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            list = transactionCompletionData.boldKeywords;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            pinCheckoutType = transactionCompletionData.checkoutType;
        }
        PinCheckoutType pinCheckoutType2 = pinCheckoutType;
        if ((i & 16) != 0) {
            str2 = transactionCompletionData.title;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            z2 = transactionCompletionData.retryEnabled;
        }
        return transactionCompletionData.copy(z, str3, list2, pinCheckoutType2, str4, z2);
    }

    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<String> component3() {
        return this.boldKeywords;
    }

    public final PinCheckoutType getCheckoutType() {
        return this.checkoutType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getRetryEnabled() {
        return this.retryEnabled;
    }

    public final TransactionCompletionData copy(boolean isSuccess, String message, List<String> boldKeywords, PinCheckoutType checkoutType, String title, boolean retryEnabled) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(boldKeywords, "");
        Intrinsics.checkNotNullParameter(checkoutType, "");
        return new TransactionCompletionData(isSuccess, message, boldKeywords, checkoutType, title, retryEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionCompletionData)) {
            return false;
        }
        TransactionCompletionData transactionCompletionData = (TransactionCompletionData) other;
        return this.isSuccess == transactionCompletionData.isSuccess && Intrinsics.areEqual(this.message, transactionCompletionData.message) && Intrinsics.areEqual(this.boldKeywords, transactionCompletionData.boldKeywords) && this.checkoutType == transactionCompletionData.checkoutType && Intrinsics.areEqual(this.title, transactionCompletionData.title) && this.retryEnabled == transactionCompletionData.retryEnabled;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSuccess);
        int iHashCode2 = this.message.hashCode();
        int iHashCode3 = this.boldKeywords.hashCode();
        int iHashCode4 = this.checkoutType.hashCode();
        String str = this.title;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.retryEnabled);
    }

    public String toString() {
        return "TransactionCompletionData(isSuccess=" + this.isSuccess + ", message=" + this.message + ", boldKeywords=" + this.boldKeywords + ", checkoutType=" + this.checkoutType + ", title=" + this.title + ", retryEnabled=" + this.retryEnabled + ')';
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.isSuccess ? 1 : 0);
        dest.writeString(this.message);
        dest.writeStringList(this.boldKeywords);
        dest.writeString(this.checkoutType.name());
        dest.writeString(this.title);
        dest.writeInt(this.retryEnabled ? 1 : 0);
    }
}
