package com.huawei.digitalpayment.consumer.base.session;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/session/SfcSessionManagerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "onUserInteraction", "", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcSessionManagerView extends FrameLayout {

    public static final Companion INSTANCE = new Companion(null);
    private static int ShareDataUIState = 0;
    private static final String TAG = "SessionManagerView";
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfcSessionManagerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfcSessionManagerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(event, "");
        if (event.getAction() == 0) {
            int i2 = component2 + 75;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            onUserInteraction();
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(event);
        int i4 = component2 + 9;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zDispatchTouchEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onUserInteraction() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        SFCSessionOutManager.INSTANCE.onUserInteraction();
        int i4 = component2 + 65;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = ShareDataUIState + 93;
        component3 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/session/SfcSessionManagerView$Companion;", "", "<init>", "()V", "TAG", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
