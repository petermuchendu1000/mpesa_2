package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.digitalpayment.consumer.sfc.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/SpinnerAdapter;", "Landroid/widget/ArrayAdapter;", "", "context", "Landroid/content/Context;", "resource", "", "textViewResourceId", FirebaseAnalytics.Param.ITEMS, "", "<init>", "(Landroid/content/Context;II[Ljava/lang/String;)V", "[Ljava/lang/String;", "isEnabled", "", "position", "getDropDownView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpinnerAdapter extends ArrayAdapter<String> {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 119 % 128;
    private static int copydefault;
    private final String[] ShareDataUIState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpinnerAdapter(Context context, int i, int i2, String[] strArr) {
        super(context, i, i2, strArr);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        this.ShareDataUIState = strArr;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parent, "");
        View dropDownView = super.getDropDownView(position, convertView, parent);
        TextView textView = (TextView) dropDownView.findViewById(R.id.text1);
        View viewFindViewById = dropDownView.findViewById(R.id.separator);
        if (position == 0) {
            int i2 = component1 + 55;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            textView.setTextColor(getContext().getColor(R.color.greyed_out));
        }
        if (position == this.ShareDataUIState.length - 1) {
            int i4 = component2 + 101;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.setVisibility(0);
        }
        Intrinsics.checkNotNull(dropDownView);
        return dropDownView;
    }

    static {
        if (119 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isEnabled(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            if (r5 == 0) goto L14
            int r5 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpinnerAdapter.component2
            int r5 = r5 + 69
            int r2 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpinnerAdapter.component1 = r2
            int r5 = r5 % r0
            if (r5 == 0) goto L12
            goto L14
        L12:
            r5 = 1
            goto L15
        L14:
            r5 = r1
        L15:
            int r2 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpinnerAdapter.component1
            int r2 = r2 + 11
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpinnerAdapter.component2 = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L23
            r0 = 70
            int r0 = r0 / r1
        L23:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpinnerAdapter.isEnabled(int):boolean");
    }
}
