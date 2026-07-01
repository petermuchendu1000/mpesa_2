package com.huawei.digitalpayment.consumer.sfcui.sharedata;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\nJ\u000b\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\nR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/Event;", "T", "", "content", "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "hasBeenHandled", "", "getContentIfNotHandled", "()Ljava/lang/Object;", "peekContent", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class Event<T> {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private static int component4 = 1;
    private static int copydefault;
    private final T component1;
    private boolean component2;

    public Event(T t) {
        this.component1 = t;
    }

    public final T getContentIfNotHandled() {
        int i = 2 % 2;
        if (!this.component2) {
            this.component2 = true;
            T t = this.component1;
            int i2 = copydefault + 99;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return t;
        }
        int i4 = component4 + 67;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final T peekContent() {
        T t;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 97;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            t = this.component1;
            int i4 = 49 / 0;
        } else {
            t = this.component1;
        }
        int i5 = i2 + 9;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return t;
    }

    static {
        int i = 1 + 103;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
