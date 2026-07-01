package com.huawei.digitalpayment.consumer.sfcui.profile.pinmanage.security;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0003H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/security/LocalQuestion;", "", "count", "", "questions", "", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/security/LocalQuestionItem;", "<init>", "(ILjava/util/List;)V", "getCount", "()I", "getQuestions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalQuestion {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int copy = 1;
    private static int copydefault;
    private final int component2;
    private final List<LocalQuestionItem> component3;

    public LocalQuestion(int i, List<LocalQuestionItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.component2 = i;
        this.component3 = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalQuestion(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = copydefault;
            int i4 = i3 + 59;
            copy = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 35;
            copy = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            i = 1;
        }
        this(i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final int getCount() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        int i5 = this.component2;
        int i6 = i3 + 75;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final List<LocalQuestionItem> getQuestions() {
        int i = 2 % 2;
        int i2 = copy + 69;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    static {
        int i = 1 + 95;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalQuestion() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LocalQuestion copy$default(LocalQuestion localQuestion, int i, List list, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = copydefault + 93;
            copy = i4 % 128;
            if (i4 % 2 == 0) {
                i = localQuestion.component2;
                int i5 = 80 / 0;
            } else {
                i = localQuestion.component2;
            }
        }
        if ((i2 & 2) != 0) {
            int i6 = copydefault;
            int i7 = i6 + 1;
            copy = i7 % 128;
            int i8 = i7 % 2;
            List<LocalQuestionItem> list2 = localQuestion.component3;
            int i9 = i6 + 107;
            copy = i9 % 128;
            int i10 = i9 % 2;
            list = list2;
        }
        return localQuestion.copy(i, list);
    }

    public final int component1() {
        int i;
        int i2 = 2 % 2;
        int i3 = copy + 91;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 != 0) {
            i = this.component2;
            int i5 = 69 / 0;
        } else {
            i = this.component2;
        }
        int i6 = i4 + 77;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final List<LocalQuestionItem> component2() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        List<LocalQuestionItem> list = this.component3;
        int i5 = i3 + 85;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return list;
    }

    public final LocalQuestion copy(int count, List<LocalQuestionItem> questions) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(questions, "");
        LocalQuestion localQuestion = new LocalQuestion(count, questions);
        int i2 = copy + 9;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
        }
        return localQuestion;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copy + 113;
            copydefault = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof LocalQuestion)) {
            int i3 = copydefault + 121;
            copy = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        LocalQuestion localQuestion = (LocalQuestion) other;
        if (this.component2 != localQuestion.component2 || !Intrinsics.areEqual(this.component3, localQuestion.component3)) {
            return false;
        }
        int i5 = copydefault + 81;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Integer.hashCode(this.component2) * 31) + this.component3.hashCode();
        int i4 = copy + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalQuestion(count=" + this.component2 + ", questions=" + this.component3 + ")";
        int i2 = copy + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
