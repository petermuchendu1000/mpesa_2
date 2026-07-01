package com.huawei.digitalpayment.consumer.zuriui.models;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JV\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÇ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010%\u001a\u00020&H×\u0001J\t\u0010'\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "text", "user", "Lcom/huawei/digitalpayment/consumer/zuriui/models/User;", "createdAt", "", "type", "options", "", "Lcom/huawei/digitalpayment/consumer/zuriui/models/Button;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/zuriui/models/User;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getText", "getUser", "()Lcom/huawei/digitalpayment/consumer/zuriui/models/User;", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "getOptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/zuriui/models/User;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)Lcom/huawei/digitalpayment/consumer/zuriui/models/Message;", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Message {
    public static final int $stable = 8;
    private static int component4 = 0;
    private static int copy = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private final String ShareDataUIState;
    private final Long component1;
    private final List<Button> component2;
    private final String component3;
    private final String copydefault;
    private final User getRequestBeneficiariesState;

    public Message(String str, String str2, User user, Long l, String str3, List<Button> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(user, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component3 = str;
        this.copydefault = str2;
        this.getRequestBeneficiariesState = user;
        this.component1 = l;
        this.ShareDataUIState = str3;
        this.component2 = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Message(String str, String str2, User user, Long l, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List list2;
        if ((i & 32) != 0) {
            int i2 = getAsAtTimestamp + 23;
            copy = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            list2 = null;
        } else {
            list2 = list;
        }
        this(str, str2, user, l, str3, list2);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = copy + 29;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final String getText() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 83;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 65;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final User getUser() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 19;
        copy = i3 % 128;
        int i4 = i3 % 2;
        User user = this.getRequestBeneficiariesState;
        int i5 = i2 + 11;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return user;
    }

    public final Long getCreatedAt() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 45;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        Long l = this.component1;
        int i5 = i3 + 87;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return l;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 53;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Button> getOptions() {
        int i = 2 % 2;
        int i2 = copy + 13;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 87;
        component4 = i % 128;
        if (i % 2 != 0) {
            int i2 = 18 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Message copy$default(Message message, String str, String str2, User user, Long l, String str3, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = message.component3;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = message.copydefault;
        }
        String str5 = str2;
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i3 = getAsAtTimestamp + 73;
            copy = i3 % 128;
            if (i3 % 2 == 0) {
                User user2 = message.getRequestBeneficiariesState;
                obj2.hashCode();
                throw null;
            }
            user = message.getRequestBeneficiariesState;
        }
        User user3 = user;
        if ((i & 8) != 0) {
            l = message.component1;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            int i4 = copy;
            int i5 = i4 + 5;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            str3 = message.ShareDataUIState;
            int i7 = i4 + 63;
            getAsAtTimestamp = i7 % 128;
            int i8 = i7 % 2;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            int i9 = getAsAtTimestamp;
            int i10 = i9 + 115;
            copy = i10 % 128;
            if (i10 % 2 == 0) {
                List<Button> list2 = message.component2;
                throw null;
            }
            list = message.component2;
            int i11 = i9 + 105;
            copy = i11 % 128;
            int i12 = i11 % 2;
        }
        return message.copy(str4, str5, user3, l2, str6, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 61;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 71;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 39;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 105;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final User component3() {
        int i = 2 % 2;
        int i2 = copy + 123;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        User user = this.getRequestBeneficiariesState;
        int i4 = i3 + 121;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return user;
    }

    public final Long component4() {
        int i = 2 % 2;
        int i2 = copy + 29;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Long l = this.component1;
        int i4 = i3 + 61;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return l;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 45;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 51;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<Button> component6() {
        int i = 2 % 2;
        int i2 = copy + 81;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        List<Button> list = this.component2;
        int i5 = i3 + 5;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return list;
    }

    public final Message copy(String id, String text, User user, Long createdAt, String type, List<Button> options) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(user, "");
        Intrinsics.checkNotNullParameter(type, "");
        Message message = new Message(id, text, user, createdAt, type, options);
        int i2 = getAsAtTimestamp + 27;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return message;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 97;
        copy = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            int i5 = i2 + 37;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        Message message = (Message) other;
        if (!Intrinsics.areEqual(this.component3, message.component3) || !Intrinsics.areEqual(this.copydefault, message.copydefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getRequestBeneficiariesState, message.getRequestBeneficiariesState)) {
            int i7 = getAsAtTimestamp + 87;
            copy = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, message.component1) || !Intrinsics.areEqual(this.ShareDataUIState, message.ShareDataUIState)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component2, message.component2)) {
            return true;
        }
        int i9 = copy + 35;
        getAsAtTimestamp = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[PHI: r1 r3
  0x0026: PHI (r1v18 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.zuriui.models.Message.copy
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.zuriui.models.Message.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            java.lang.String r1 = r7.component3
            int r1 = r1.hashCode()
            java.lang.String r3 = r7.copydefault
            if (r3 != 0) goto L26
            goto L24
        L1a:
            java.lang.String r1 = r7.component3
            int r1 = r1.hashCode()
            java.lang.String r3 = r7.copydefault
            if (r3 != 0) goto L26
        L24:
            r3 = r2
            goto L2a
        L26:
            int r3 = r3.hashCode()
        L2a:
            com.huawei.digitalpayment.consumer.zuriui.models.User r4 = r7.getRequestBeneficiariesState
            int r4 = r4.hashCode()
            java.lang.Long r5 = r7.component1
            if (r5 != 0) goto L3f
            int r5 = com.huawei.digitalpayment.consumer.zuriui.models.Message.copy
            int r5 = r5 + 41
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.zuriui.models.Message.getAsAtTimestamp = r6
            int r5 = r5 % r0
            r0 = r2
            goto L43
        L3f:
            int r0 = r5.hashCode()
        L43:
            java.lang.String r5 = r7.ShareDataUIState
            int r5 = r5.hashCode()
            java.util.List<com.huawei.digitalpayment.consumer.zuriui.models.Button> r6 = r7.component2
            if (r6 != 0) goto L4e
            goto L52
        L4e:
            int r2 = r6.hashCode()
        L52:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.models.Message.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Message(id=" + this.component3 + ", text=" + this.copydefault + ", user=" + this.getRequestBeneficiariesState + ", createdAt=" + this.component1 + ", type=" + this.ShareDataUIState + ", options=" + this.component2 + ')';
        int i2 = getAsAtTimestamp + 121;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
