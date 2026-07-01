package com.huawei.digitalpayment.consumer.manageandviewdata.utils;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.renderer.PieChartRenderer;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/utils/RoundedArcPieChartRenderer;", "Lcom/github/mikephil/charting/renderer/PieChartRenderer;", "chart", "Lcom/github/mikephil/charting/charts/PieChart;", "animator", "Lcom/github/mikephil/charting/animation/ChartAnimator;", "viewPortHandler", "Lcom/github/mikephil/charting/utils/ViewPortHandler;", "<init>", "(Lcom/github/mikephil/charting/charts/PieChart;Lcom/github/mikephil/charting/animation/ChartAnimator;Lcom/github/mikephil/charting/utils/ViewPortHandler;)V", "drawDataSet", "", "c", "Landroid/graphics/Canvas;", "dataSet", "Lcom/github/mikephil/charting/interfaces/datasets/IPieDataSet;", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoundedArcPieChartRenderer extends PieChartRenderer {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component2 = 71 % 128;
    private static int component3;
    private static int copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedArcPieChartRenderer(PieChart pieChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(pieChart, chartAnimator, viewPortHandler);
        Intrinsics.checkNotNullParameter(pieChart, "");
        Intrinsics.checkNotNullParameter(chartAnimator, "");
        Intrinsics.checkNotNullParameter(viewPortHandler, "");
    }

    @Override
    public void drawDataSet(Canvas c2, IPieDataSet dataSet) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(c2, "");
        Intrinsics.checkNotNullParameter(dataSet, "");
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float rotationAngle = this.mChart.getRotationAngle();
        float phaseY = this.mAnimator.getPhaseY();
        float f = 0.38f * radius;
        float f2 = radius - (f / 2.0f);
        RectF rectF = new RectF(centerCircleBox.x - f2, centerCircleBox.y - f2, centerCircleBox.x + f2, centerCircleBox.y + f2);
        Paint paint = this.mRenderPaint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(f);
        paint.setPathEffect(new CornerPathEffect(f / 2.5f));
        int entryCount = dataSet.getEntryCount();
        int i3 = 0;
        float f3 = 0.0f;
        while (i3 < entryCount) {
            int i4 = ShareDataUIState + 111;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            float f4 = this.mChart.getDrawAngles()[i3];
            float sliceSpace = dataSet.getSliceSpace();
            float f5 = sliceSpace / 2.0f;
            float f6 = (f4 - sliceSpace) * phaseY;
            if (f6 > 0.0f) {
                this.mRenderPaint.setColor(dataSet.getColor(i3));
                i = i3;
                c2.drawArc(rectF, f5 + rotationAngle + f3, f6, false, this.mRenderPaint);
            } else {
                i = i3;
            }
            f3 += f4;
            i3 = i + 1;
        }
        int i6 = ShareDataUIState + 115;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    static {
        int i = 71 % 2;
    }
}
