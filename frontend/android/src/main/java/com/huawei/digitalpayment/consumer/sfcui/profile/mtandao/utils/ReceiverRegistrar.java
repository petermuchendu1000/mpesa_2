package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.ArrayMap;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ReceiverRegistrar;", "", "mContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mReceiverMap", "Landroid/util/ArrayMap;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Intent;", "safeRegisterReceiver", RequestMoneyRecordFragment.REQUEST_TYPE_RECEIVER, "filter", "Landroid/content/IntentFilter;", "safeUnregisterReceiver", "", "safeUnregisterAllReceivers", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReceiverRegistrar {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component3 = 0;
    private static int copy = 1;
    private static int copydefault;
    private final ArrayMap<BroadcastReceiver, Intent> component1;
    private final Context component2;

    public ReceiverRegistrar(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.component2 = context;
        this.component1 = new ArrayMap<>();
    }

    public final Intent safeRegisterReceiver(BroadcastReceiver receiver, IntentFilter filter) {
        int i = 2 % 2;
        int i2 = copy + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(receiver, "");
        if (!this.component1.containsKey(receiver)) {
            Intent intentRegisterReceiver = this.component2.registerReceiver(receiver, filter);
            this.component1.put(receiver, intentRegisterReceiver);
            return intentRegisterReceiver;
        }
        Intent intent = this.component1.get(receiver);
        int i4 = copy + 63;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return intent;
    }

    public final void safeUnregisterReceiver(BroadcastReceiver receiver) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(receiver, "");
        if (this.component1.containsKey(receiver)) {
            int i4 = copy + 109;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            this.component2.unregisterReceiver(receiver);
            this.component1.remove(receiver);
            int i6 = copy + 97;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public final void safeUnregisterAllReceivers() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            for (BroadcastReceiver broadcastReceiver : this.component1.keySet()) {
                int i3 = copy + 55;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNull(broadcastReceiver);
                safeUnregisterReceiver(broadcastReceiver);
                int i5 = component3 + 75;
                copy = i5 % 128;
                int i6 = i5 % 2;
            }
            return;
        }
        this.component1.keySet().iterator();
        throw null;
    }

    static {
        int i = 1 + 35;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
