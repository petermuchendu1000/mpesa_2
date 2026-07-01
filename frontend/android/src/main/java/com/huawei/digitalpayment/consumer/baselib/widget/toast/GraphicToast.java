package com.huawei.digitalpayment.consumer.baselib.widget.toast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.huawei.common.util.L;
import com.huawei.common.util.color.ColorUtils;
import com.huawei.digitalpayment.consumer.baselib.R;

@Deprecated
public class GraphicToast extends Toast {
    private static int component3 = 1;
    private static int copydefault;

    public GraphicToast(Context context, String str) {
        this(context, str, -1);
    }

    public GraphicToast(Context context, String str, int i) {
        Drawable drawable;
        super(context);
        Object obj = null;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.custom_toast, (ViewGroup) null);
        viewInflate.setBackgroundColor(ColorUtils.INSTANCE.withAlpha(0.8f, com.blankj.utilcode.util.ColorUtils.getColor(R.color.colorMainText)));
        ((TextView) viewInflate.findViewById(R.id.tvMessage)).setText(str);
        try {
            drawable = ContextCompat.getDrawable(context, i);
            int i2 = 2 % 2;
        } catch (Exception e) {
            L.d("GraphicToast", "GraphicToast: " + e.getMessage());
            drawable = null;
        }
        if (drawable != null) {
            int i3 = component3 + 51;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                ((ImageView) viewInflate.findViewById(R.id.ivIcon)).setImageDrawable(drawable);
                throw null;
            }
            ((ImageView) viewInflate.findViewById(R.id.ivIcon)).setImageDrawable(drawable);
            int i4 = component3 + 107;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        setView(viewInflate);
        setGravity(17, 0, 0);
        setDuration(1);
        int i6 = copydefault + 63;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
