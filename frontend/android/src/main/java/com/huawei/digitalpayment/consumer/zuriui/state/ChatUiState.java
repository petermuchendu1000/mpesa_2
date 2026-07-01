package com.huawei.digitalpayment.consumer.zuriui.state;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\nHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0010¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/state/ChatUiState;", "", "messages", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/huawei/digitalpayment/consumer/zuriui/state/MessageUiState;", "isTyping", "", "connectionState", "Lcom/huawei/digitalpayment/consumer/zuriui/state/ConnectionState;", "selectedCount", "", "isSelectionMode", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;ZLcom/huawei/digitalpayment/consumer/zuriui/state/ConnectionState;IZ)V", "getMessages", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "getConnectionState", "()Lcom/huawei/digitalpayment/consumer/zuriui/state/ConnectionState;", "getSelectedCount", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChatUiState {
    public static final int $stable = 0;
    private static int component4 = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final ImmutableList<MessageUiState> ShareDataUIState;
    private final boolean component1;
    private final int component2;
    private final ConnectionState component3;
    private final boolean copydefault;

    public ChatUiState(ImmutableList<MessageUiState> immutableList, boolean z, ConnectionState connectionState, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(immutableList, "");
        Intrinsics.checkNotNullParameter(connectionState, "");
        this.ShareDataUIState = immutableList;
        this.component1 = z;
        this.component3 = connectionState;
        this.component2 = i;
        this.copydefault = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChatUiState(ImmutableList immutableList, boolean z, ConnectionState connectionState, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        int i3;
        boolean z4 = false;
        if ((i2 & 1) != 0) {
            int i4 = getAsAtTimestamp + 13;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                immutableList = ExtensionsKt.persistentListOf();
                int i5 = 93 / 0;
            } else {
                immutableList = ExtensionsKt.persistentListOf();
            }
        }
        if ((i2 & 2) != 0) {
            int i6 = getAsAtTimestamp + 5;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i2 & 4) != 0) {
            int i8 = getAsAtTimestamp + 17;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            connectionState = ConnectionState.WAITING;
            int i10 = 2 % 2;
        }
        ConnectionState connectionState2 = connectionState;
        if ((i2 & 8) != 0) {
            int i11 = getAsAtTimestamp + 61;
            getRequestBeneficiariesState = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            int i14 = getAsAtTimestamp + 35;
            getRequestBeneficiariesState = i14 % 128;
            int i15 = i14 % 2;
        } else {
            z4 = z2;
        }
        this(immutableList, z3, connectionState2, i3, z4);
    }

    public final ImmutableList<MessageUiState> getMessages() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 7;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        ImmutableList<MessageUiState> immutableList = this.ShareDataUIState;
        int i5 = i3 + 19;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return immutableList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isTyping() {
        boolean z;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 101;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.component1;
            int i4 = 90 / 0;
        } else {
            z = this.component1;
        }
        int i5 = i2 + 115;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final ConnectionState getConnectionState() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 53;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        ConnectionState connectionState = this.component3;
        int i5 = i3 + 83;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return connectionState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getSelectedCount() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 5;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isSelectionMode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 17;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.copydefault;
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        return z;
    }

    static {
        int i = 1 + 27;
        equals = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ChatUiState() {
        this(null, false, null, 0, false, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ChatUiState copy$default(ChatUiState chatUiState, ImmutableList immutableList, boolean z, ConnectionState connectionState, int i, boolean z2, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = getRequestBeneficiariesState + 83;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            immutableList = chatUiState.ShareDataUIState;
        }
        ImmutableList immutableList2 = immutableList;
        if ((i2 & 2) != 0) {
            int i6 = getRequestBeneficiariesState + 37;
            getAsAtTimestamp = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z3 = chatUiState.component1;
                throw null;
            }
            z = chatUiState.component1;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            connectionState = chatUiState.component3;
        }
        ConnectionState connectionState2 = connectionState;
        if ((i2 & 8) != 0) {
            int i7 = getRequestBeneficiariesState + 115;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
            i = chatUiState.component2;
        }
        int i9 = i;
        if ((i2 & 16) != 0) {
            z2 = chatUiState.copydefault;
        }
        return chatUiState.copy(immutableList2, z4, connectionState2, i9, z2);
    }

    public final ImmutableList<MessageUiState> component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 47;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ImmutableList<MessageUiState> immutableList = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        return immutableList;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 99;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ConnectionState component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 85;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        ConnectionState connectionState = this.component3;
        int i5 = i2 + 15;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return connectionState;
        }
        throw null;
    }

    public final int component4() {
        int i;
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 43;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        if (i3 % 2 != 0) {
            i = this.component2;
            int i5 = 45 / 0;
        } else {
            i = this.component2;
        }
        int i6 = i4 + 53;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 21;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 21;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final ChatUiState copy(ImmutableList<MessageUiState> messages, boolean isTyping, ConnectionState connectionState, int selectedCount, boolean isSelectionMode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(messages, "");
        Intrinsics.checkNotNullParameter(connectionState, "");
        ChatUiState chatUiState = new ChatUiState(messages, isTyping, connectionState, selectedCount, isSelectionMode);
        int i2 = getAsAtTimestamp + 69;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return chatUiState;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 123;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatUiState)) {
            int i5 = i3 + 107;
            getAsAtTimestamp = i5 % 128;
            return i5 % 2 != 0;
        }
        ChatUiState chatUiState = (ChatUiState) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, chatUiState.ShareDataUIState)) {
            int i6 = getAsAtTimestamp + 39;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.component1 != chatUiState.component1) {
            return false;
        }
        if (this.component3 != chatUiState.component3) {
            int i8 = getAsAtTimestamp + 31;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.component2 != chatUiState.component2) {
            return false;
        }
        if (this.copydefault == chatUiState.copydefault) {
            return true;
        }
        int i10 = getRequestBeneficiariesState + 125;
        getAsAtTimestamp = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 19 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 71;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.ShareDataUIState.hashCode() * 31) + Boolean.hashCode(this.component1)) * 31) + this.component3.hashCode()) * 31) + Integer.hashCode(this.component2)) * 31) + Boolean.hashCode(this.copydefault);
        int i4 = getAsAtTimestamp + 71;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChatUiState(messages=" + this.ShareDataUIState + ", isTyping=" + this.component1 + ", connectionState=" + this.component3 + ", selectedCount=" + this.component2 + ", isSelectionMode=" + this.copydefault + ')';
        int i2 = getAsAtTimestamp + 85;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
