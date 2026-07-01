package com.huawei.digitalpayment.consumer.zuriui.state;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.zuriui.models.MessageType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003Ja\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001e¨\u0006-"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/state/MessageUiState;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "text", "user", "Lcom/huawei/digitalpayment/consumer/zuriui/state/UserUiState;", "createdAt", "", "type", "Lcom/huawei/digitalpayment/consumer/zuriui/models/MessageType;", "buttons", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/huawei/digitalpayment/consumer/zuriui/state/ButtonUiState;", "isSelected", "", "isCurrentUser", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/zuriui/state/UserUiState;JLcom/huawei/digitalpayment/consumer/zuriui/models/MessageType;Lkotlinx/collections/immutable/ImmutableList;ZZ)V", "getId", "()Ljava/lang/String;", "getText", "getUser", "()Lcom/huawei/digitalpayment/consumer/zuriui/state/UserUiState;", "getCreatedAt", "()J", "getType", "()Lcom/huawei/digitalpayment/consumer/zuriui/models/MessageType;", "getButtons", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MessageUiState {
    public static final int $stable = 0;
    private static int component4 = 87 % 128;
    private static int getRequestBeneficiariesState = 0;
    private static int hashCode = 0;
    private static int toString = 1;
    private final String ShareDataUIState;
    private final boolean component1;
    private final ImmutableList<ButtonUiState> component2;
    private final long component3;
    private final MessageType copy;
    private final boolean copydefault;
    private final UserUiState equals;
    private final String getAsAtTimestamp;

    public MessageUiState(String str, String str2, UserUiState userUiState, long j, MessageType messageType, ImmutableList<ButtonUiState> immutableList, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(userUiState, "");
        Intrinsics.checkNotNullParameter(messageType, "");
        Intrinsics.checkNotNullParameter(immutableList, "");
        this.ShareDataUIState = str;
        this.getAsAtTimestamp = str2;
        this.equals = userUiState;
        this.component3 = j;
        this.copy = messageType;
        this.component2 = immutableList;
        this.copydefault = z;
        this.component1 = z2;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = hashCode + 15;
        toString = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return str;
    }

    public final String getText() {
        int i = 2 % 2;
        int i2 = toString + 67;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 83;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final UserUiState getUser() {
        int i = 2 % 2;
        int i2 = toString + 13;
        int i3 = i2 % 128;
        hashCode = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        UserUiState userUiState = this.equals;
        int i4 = i3 + 61;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
        return userUiState;
    }

    public final long getCreatedAt() {
        int i = 2 % 2;
        int i2 = toString + 7;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        int i3 = 43 / 0;
        return this.component3;
    }

    public final MessageType getType() {
        MessageType messageType;
        int i = 2 % 2;
        int i2 = hashCode + 101;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 == 0) {
            messageType = this.copy;
            int i4 = 84 / 0;
        } else {
            messageType = this.copy;
        }
        int i5 = i3 + 59;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return messageType;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageUiState(String str, String str2, UserUiState userUiState, long j, MessageType messageType, ImmutableList immutableList, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ImmutableList immutableList2;
        boolean z3;
        if ((i & 32) != 0) {
            PersistentList persistentListPersistentListOf = ExtensionsKt.persistentListOf();
            int i2 = hashCode + 63;
            toString = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            immutableList2 = persistentListPersistentListOf;
        } else {
            immutableList2 = immutableList;
        }
        boolean z4 = (i & 64) != 0 ? false : z;
        if ((i & 128) != 0) {
            int i5 = hashCode + 119;
            toString = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            z3 = false;
        } else {
            z3 = z2;
        }
        this(str, str2, userUiState, j, messageType, immutableList2, z4, z3);
    }

    public final ImmutableList<ButtonUiState> getButtons() {
        int i = 2 % 2;
        int i2 = toString + 45;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    public final boolean isSelected() {
        int i = 2 % 2;
        int i2 = hashCode + 79;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 71;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return z;
    }

    public final boolean isCurrentUser() {
        int i = 2 % 2;
        int i2 = hashCode + 97;
        int i3 = i2 % 128;
        toString = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.component1;
        int i4 = i3 + 85;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    static {
        if (87 % 2 == 0) {
            int i = 53 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MessageUiState copy$default(MessageUiState messageUiState, String str, String str2, UserUiState userUiState, long j, MessageType messageType, ImmutableList immutableList, boolean z, boolean z2, int i, Object obj) {
        String str3;
        UserUiState userUiState2;
        long j2;
        MessageType messageType2;
        ImmutableList immutableList2;
        boolean z3;
        boolean z4;
        int i2 = 2 % 2;
        int i3 = toString;
        int i4 = i3 + 63;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 75;
            hashCode = i6 % 128;
            if (i6 % 2 != 0) {
                String str4 = messageUiState.ShareDataUIState;
                throw null;
            }
            str3 = messageUiState.ShareDataUIState;
        } else {
            str3 = str;
        }
        String str5 = (i & 2) != 0 ? messageUiState.getAsAtTimestamp : str2;
        if ((i & 4) != 0) {
            userUiState2 = messageUiState.equals;
            int i7 = i3 + 49;
            hashCode = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 % 4;
            }
        } else {
            userUiState2 = userUiState;
        }
        if ((i & 8) != 0) {
            int i9 = hashCode + 93;
            toString = i9 % 128;
            int i10 = i9 % 2;
            j2 = messageUiState.component3;
            if (i10 == 0) {
                int i11 = 16 / 0;
            }
        } else {
            j2 = j;
        }
        if ((i & 16) != 0) {
            int i12 = toString + 67;
            int i13 = i12 % 128;
            hashCode = i13;
            int i14 = i12 % 2;
            messageType2 = messageUiState.copy;
            int i15 = i13 + 31;
            toString = i15 % 128;
            int i16 = i15 % 2;
        } else {
            messageType2 = messageType;
        }
        if ((i & 32) != 0) {
            immutableList2 = messageUiState.component2;
            int i17 = toString + 29;
            hashCode = i17 % 128;
            int i18 = i17 % 2;
        } else {
            immutableList2 = immutableList;
        }
        if ((i & 64) != 0) {
            z3 = messageUiState.copydefault;
            int i19 = toString + 103;
            hashCode = i19 % 128;
            int i20 = i19 % 2;
        } else {
            z3 = z;
        }
        if ((i & 128) != 0) {
            int i21 = hashCode + 1;
            toString = i21 % 128;
            int i22 = i21 % 2;
            z4 = messageUiState.component1;
        } else {
            z4 = z2;
        }
        return messageUiState.copy(str3, str5, userUiState2, j2, messageType2, immutableList2, z3, z4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = toString + 103;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 107;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i2 + 41;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final UserUiState component3() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 21;
        toString = i3 % 128;
        int i4 = i3 % 2;
        UserUiState userUiState = this.equals;
        int i5 = i2 + 19;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return userUiState;
    }

    public final long component4() {
        int i = 2 % 2;
        int i2 = toString + 45;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        long j = this.component3;
        int i5 = i3 + 53;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final MessageType component5() {
        int i = 2 % 2;
        int i2 = toString + 53;
        int i3 = i2 % 128;
        hashCode = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        MessageType messageType = this.copy;
        int i4 = i3 + 109;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return messageType;
    }

    public final ImmutableList<ButtonUiState> component6() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 37;
        toString = i3 % 128;
        int i4 = i3 % 2;
        ImmutableList<ButtonUiState> immutableList = this.component2;
        int i5 = i2 + 27;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return immutableList;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = hashCode + 57;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final boolean component8() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 107;
        toString = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component1;
        int i5 = i2 + 121;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return z;
    }

    public final MessageUiState copy(String id, String text, UserUiState user, long createdAt, MessageType type, ImmutableList<ButtonUiState> buttons, boolean isSelected, boolean isCurrentUser) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(user, "");
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(buttons, "");
        MessageUiState messageUiState = new MessageUiState(id, text, user, createdAt, type, buttons, isSelected, isCurrentUser);
        int i2 = toString + 29;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        return messageUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageUiState)) {
            int i2 = hashCode + 93;
            toString = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        MessageUiState messageUiState = (MessageUiState) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, messageUiState.ShareDataUIState)) {
            int i4 = toString + 21;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, messageUiState.getAsAtTimestamp) || !Intrinsics.areEqual(this.equals, messageUiState.equals) || this.component3 != messageUiState.component3 || this.copy != messageUiState.copy || !Intrinsics.areEqual(this.component2, messageUiState.component2)) {
            return false;
        }
        if (this.copydefault != messageUiState.copydefault) {
            int i6 = toString + 63;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.component1 == messageUiState.component1) {
            return true;
        }
        int i8 = toString + 91;
        hashCode = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = toString + 43;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.ShareDataUIState.hashCode();
        String str = this.getAsAtTimestamp;
        if (str == null) {
            int i5 = hashCode + 113;
            toString = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i7 = hashCode + 91;
            toString = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 5 / 3;
            }
            i = iHashCode2;
        }
        return (((((((((((((iHashCode * 31) + i) * 31) + this.equals.hashCode()) * 31) + Long.hashCode(this.component3)) * 31) + this.copy.hashCode()) * 31) + this.component2.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.component1);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MessageUiState(id=" + this.ShareDataUIState + ", text=" + this.getAsAtTimestamp + ", user=" + this.equals + ", createdAt=" + this.component3 + ", type=" + this.copy + ", buttons=" + this.component2 + ", isSelected=" + this.copydefault + ", isCurrentUser=" + this.component1 + ')';
        int i2 = toString + 1;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
