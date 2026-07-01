package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.chart;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.utils.ConvertersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/chart/ChartMarkerView;", "Lcom/github/mikephil/charting/components/MarkerView;", "cxt", "Landroid/content/Context;", "layoutResource", "", "<init>", "(Landroid/content/Context;I)V", "txChartMarker", "Landroid/widget/TextView;", "refreshContent", "", "e", "Lcom/github/mikephil/charting/data/Entry;", "highlight", "Lcom/github/mikephil/charting/highlight/Highlight;", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChartMarkerView extends MarkerView {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private final Context cxt;
    private final int layoutResource;
    private TextView txChartMarker;

    public ChartMarkerView(Context context, int i) {
        super(context, i);
        this.cxt = context;
        this.layoutResource = i;
        View viewFindViewById = findViewById(R.id.txChartMarker);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.txChartMarker = (TextView) viewFindViewById;
    }

    @Override
    public void refreshContent(Entry e, Highlight highlight) {
        float y;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        if (e != null) {
            y = e.getY();
            int i5 = ShareDataUIState + 115;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = i3 + 33;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            y = 0.0f;
        }
        if (y > 0.0f) {
            this.txChartMarker.setText(ConvertersKt.byteConversion(y));
            this.txChartMarker.setVisibility(0);
            int i9 = ShareDataUIState + 3;
            component3 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            this.txChartMarker.setVisibility(8);
        }
        super.refreshContent(e, highlight);
    }

    static {
        int i = 1 + 39;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
