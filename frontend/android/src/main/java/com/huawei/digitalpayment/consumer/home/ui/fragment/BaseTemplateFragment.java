package com.huawei.digitalpayment.consumer.home.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.ariver.tracedebug.core.TraceDebugManager;
import com.huawei.common.fragment.BaseFragment;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.service.IPullRefresh;
import com.huawei.digitalpayment.home.theme.data.local.LocalComponent;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000f2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fJ\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fJ.\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u001a\u0010\u001b\u001a\u00020\r2\u0010\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/BaseTemplateFragment;", "Lcom/huawei/common/fragment/BaseFragment;", "Lcom/huawei/digitalpayment/consumer/baselib/service/IPullRefresh;", "<init>", "()V", "component", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalComponent;", "getComponent", "()Lcom/huawei/digitalpayment/home/theme/data/local/LocalComponent;", "setComponent", "(Lcom/huawei/digitalpayment/home/theme/data/local/LocalComponent;)V", "refreshFinishListener", "Lcom/huawei/common/listener/ApiCallback;", "", "onAttach", "", "context", "Landroid/content/Context;", "setRefreshFinishListener", "getRefreshFinishListener", "initViewParams", "backgroundColorView", "Landroid/view/View;", "backgroundImageView", "Landroid/widget/ImageView;", "root", "Lcom/huawei/common/widget/round/RoundConstraintLayout;", TraceDebugManager.IdeCommand.REFRESH, "callback", "Companion", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseTemplateFragment extends BaseFragment implements IPullRefresh {
    public static final int $stable = 8;

    public static final Companion INSTANCE;
    public static final String KEY_COMPONENT = "component";
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private static int equals = 1;
    private ApiCallback<Boolean> ShareDataUIState;
    private LocalComponent component2;

    protected final LocalComponent getComponent() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        LocalComponent localComponent = this.component2;
        int i5 = i3 + 11;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return localComponent;
    }

    protected final void setComponent(LocalComponent localComponent) {
        int i = 2 % 2;
        int i2 = component1 + 43;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        this.component2 = localComponent;
        int i5 = i3 + 59;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onAttach(Context context) {
        Serializable serializable;
        int i = 2 % 2;
        int i2 = component1 + 119;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("component");
        } else {
            int i4 = component1 + 89;
            equals = i4 % 128;
            int i5 = i4 % 2;
            serializable = null;
        }
        this.component2 = (LocalComponent) serializable;
    }

    public final void setRefreshFinishListener(ApiCallback<Boolean> refreshFinishListener) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        this.ShareDataUIState = refreshFinishListener;
        int i5 = i3 + 113;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final ApiCallback<Boolean> getRefreshFinishListener() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        ApiCallback<Boolean> apiCallback = this.ShareDataUIState;
        int i5 = i3 + 43;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return apiCallback;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[PHI: r1
  0x002c: PHI (r1v9 int) = (r1v8 int), (r1v11 int) binds: [B:13:0x002a, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initViewParams(com.huawei.digitalpayment.home.theme.data.local.LocalComponent r5, android.view.View r6, android.widget.ImageView r7, com.huawei.common.widget.round.RoundConstraintLayout r8) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.BaseTemplateFragment.initViewParams(com.huawei.digitalpayment.home.theme.data.local.LocalComponent, android.view.View, android.widget.ImageView, com.huawei.common.widget.round.RoundConstraintLayout):void");
    }

    public boolean refresh(ApiCallback<Boolean> callback) {
        int i = 2 % 2;
        int i2 = component1 + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState = callback;
        boolean zRefresh = IPullRefresh.DefaultImpls.refresh(this, callback);
        int i4 = equals + 23;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return zRefresh;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = component3 + 9;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/BaseTemplateFragment$Companion;", "", "<init>", "()V", "KEY_COMPONENT", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
