package com.huawei.digitalpayment.consumer.baselib.session;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class SessionManagerView extends FrameLayout {
    private static int ShareDataUIState = 1;
    private static final String TAG = "SessionManagerView";
    private static int component3;

    public SessionManagerView(Context context) {
        super(context);
    }

    public SessionManagerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (motionEvent.getAction() == 0) {
            int i4 = ShareDataUIState + 79;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            onUserInteraction();
            int i6 = ShareDataUIState + 43;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private void onUserInteraction() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        SessionOutManager.getInstance().onUserInteraction();
        int i4 = component3 + 47;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
