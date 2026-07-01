package com.huawei.digitalpayment.consumer.sfcui.components.toast;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.iap.ac.android.acs.operation.common.ContainerUIProvider;
import com.safaricom.consumer.commons.util.TextResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\t¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/toast/ToastView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", ContainerUIProvider.KEY_SHOW, "", "type", "Lcom/huawei/digitalpayment/consumer/sfcui/components/toast/ToastView$Type;", "delay", "", "(Lcom/huawei/digitalpayment/consumer/sfcui/components/toast/ToastView$Type;Ljava/lang/Long;)V", "hide", "Companion", "Type", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ToastView extends View {
    public static final int $stable = 0;
    public static final long CUSTOM_DELAY_DURATION = 2000;

    public static final Companion INSTANCE = new Companion(null);
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/toast/ToastView$Companion;", "", "<init>", "()V", "CUSTOM_DELAY_DURATION", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/toast/ToastView$Type;", "", "message", "Lcom/safaricom/consumer/commons/util/TextResource;", "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;)V", "getMessage", "()Lcom/safaricom/consumer/commons/util/TextResource;", "Success", "Error", "Lcom/huawei/digitalpayment/consumer/sfcui/components/toast/ToastView$Type$Error;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/toast/ToastView$Type$Success;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Type {
        public static final int $stable = 8;
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;
        private final TextResource component1;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/toast/ToastView$Type$Success;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/toast/ToastView$Type;", "message", "Lcom/safaricom/consumer/commons/util/TextResource;", "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;)V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Success extends Type {
            public static final int $stable = 0;
            private static int component2 = 0;
            private static int component3 = 77 % 128;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(TextResource textResource) {
                super(textResource, null);
                Intrinsics.checkNotNullParameter(textResource, "");
            }

            static {
                int i = 77 % 2;
            }
        }

        private Type(TextResource textResource) {
            this.component1 = textResource;
        }

        public final TextResource getMessage() {
            int i = 2 % 2;
            int i2 = component2 + 91;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            TextResource textResource = this.component1;
            int i5 = i3 + 49;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 41 / 0;
            }
            return textResource;
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/toast/ToastView$Type$Error;", "Lcom/huawei/digitalpayment/consumer/sfcui/components/toast/ToastView$Type;", "message", "Lcom/safaricom/consumer/commons/util/TextResource;", "<init>", "(Lcom/safaricom/consumer/commons/util/TextResource;)V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Error extends Type {
            public static final int $stable = 0;
            private static int component1 = 0;
            private static int component3 = 45 % 128;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(TextResource textResource) {
                super(textResource, null);
                Intrinsics.checkNotNullParameter(textResource, "");
            }

            static {
                if (45 % 2 == 0) {
                    throw null;
                }
            }
        }

        static {
            int i = 1 + 103;
            component3 = i % 128;
            int i2 = i % 2;
        }

        public Type(TextResource textResource, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource);
        }
    }

    public static void show$default(ToastView toastView, Type type, Long l, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 101;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 != 0 ? (i & 2) != 0 : (i & 3) != 0) {
            int i5 = i4 + 43;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            l = null;
        }
        toastView.show(type, l);
    }

    public final void show(Type type, Long delay) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(type, "");
        setVisibility(0);
        int i4 = ShareDataUIState + 57;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void hide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        setVisibility(8);
        int i4 = ShareDataUIState + 77;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static {
        int i = component2 + 23;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 74 / 0;
        }
    }
}
