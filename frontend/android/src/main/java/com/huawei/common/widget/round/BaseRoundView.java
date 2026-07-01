package com.huawei.common.widget.round;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.common.R;
import com.huawei.common.util.skin.SkinManager;
import com.huawei.common.widget.input.AttrUtils;

public class BaseRoundView {
    private final Region ShareDataUIState;
    private final Paint component1;
    private final float[] component2;
    private final Path component3;
    private int component4;
    private int copy;
    private final Path copydefault;
    private boolean equals;
    private int getAsAtTimestamp;
    private int getRequestBeneficiariesState;
    private final View getSponsorBeneficiariesState;

    public BaseRoundView(View view, AttributeSet attributeSet) {
        this.component2 = new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize};
        this.getSponsorBeneficiariesState = view;
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, R.styleable.fillet_view);
        this.copy = AttrUtils.INSTANCE.getColor(view.getContext(), typedArrayObtainStyledAttributes, R.styleable.fillet_view_round_stroke_color, -1);
        this.component4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.fillet_view_round_stroke_width, 0);
        this.getAsAtTimestamp = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.fillet_view_round_stroke_dash_length, 0);
        this.getRequestBeneficiariesState = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.fillet_view_round_stroke_dash_space, 0);
        this.equals = typedArrayObtainStyledAttributes.getBoolean(R.styleable.fillet_view_round_as_circle, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.fillet_view_round_corner, 0);
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.fillet_view_round_corner_top_left, dimensionPixelSize);
        float dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.fillet_view_round_corner_top_right, dimensionPixelSize);
        float dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.fillet_view_round_corner_bottom_right, dimensionPixelSize);
        float dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.fillet_view_round_corner_bottom_left, dimensionPixelSize);
        Paint paint = new Paint();
        this.component1 = paint;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        this.copydefault = new Path();
        this.component3 = new Path();
        this.ShareDataUIState = new Region();
        typedArrayObtainStyledAttributes.recycle();
        SkinManager.INSTANCE.onCreateView(view, attributeSet);
    }

    public void onSizeChanged(int i, int i2) {
        RectF rectF = new RectF();
        rectF.top = 0.0f;
        rectF.left = 0.0f;
        rectF.bottom = i2;
        rectF.right = i;
        this.component3.reset();
        if (this.equals) {
            float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
            PointF pointF = new PointF(i / 2, i2 / 2);
            this.component3.addCircle(pointF.x, pointF.y, fMin, Path.Direction.CW);
            float f = -10;
            this.component3.moveTo(f, f);
            this.component3.moveTo(i + 10, i2 + 10);
        } else {
            this.component3.addRoundRect(rectF, this.component2, Path.Direction.CW);
        }
        Region region = new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.copydefault.reset();
        this.copydefault.addRect(rectF, Path.Direction.CW);
        this.copydefault.op(this.component3, Path.Op.DIFFERENCE);
        this.ShareDataUIState.setPath(this.copydefault, region);
    }

    public void draw(Canvas canvas) {
        canvas.saveLayer(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), null, 31);
    }

    public void drawOff(Canvas canvas) {
        int i;
        if (this.component4 > 0) {
            this.component1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            this.component1.setStrokeWidth(this.component4 * 2);
            this.component1.setColor(this.copy);
            this.component1.setStyle(Paint.Style.STROKE);
            int i2 = this.getAsAtTimestamp;
            if (i2 > 0 && (i = this.getRequestBeneficiariesState) > 0) {
                this.component1.setPathEffect(new DashPathEffect(new float[]{i2, i}, 0.0f));
            }
            canvas.drawPath(this.component3, this.component1);
        }
        this.component1.setColor(-1);
        this.component1.setStyle(Paint.Style.FILL);
        this.component1.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawPath(this.copydefault, this.component1);
        canvas.restore();
    }

    public Path getClipPath() {
        return this.component3;
    }

    public boolean isRoundAsCircle() {
        return this.equals;
    }

    public void setRoundAsCircle(boolean z) {
        this.equals = z;
    }

    public int getStrokeColor() {
        return this.copy;
    }

    public void setStrokeColor(int i) {
        this.copy = i;
        component3();
    }

    public int getStrokeWidth() {
        return this.component4;
    }

    public void setStrokeWidth(int i) {
        this.component4 = i;
        component3();
    }

    public float getRoundCornerTopLeft() {
        return this.component2[0];
    }

    public void setRoundCornerTopLeft(int i) {
        float[] fArr = this.component2;
        float f = i;
        fArr[0] = f;
        fArr[1] = f;
        component3();
    }

    public void setRoundCorner(int i) {
        float[] fArr = this.component2;
        float f = i;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        fArr[4] = f;
        fArr[5] = f;
        fArr[6] = f;
        fArr[7] = f;
        component3();
    }

    public float getRoundCornerTopRight() {
        return this.component2[2];
    }

    public void setRoundCornerTopRight(int i) {
        float[] fArr = this.component2;
        float f = i;
        fArr[2] = f;
        fArr[3] = f;
        component3();
    }

    public float getRoundCornerBottomLeft() {
        return this.component2[6];
    }

    public void setRoundCornerBottomLeft(int i) {
        float[] fArr = this.component2;
        float f = i;
        fArr[6] = f;
        fArr[7] = f;
        component3();
    }

    public float getRoundCornerBottomRight() {
        return this.component2[4];
    }

    public void setRoundCornerBottomRight(int i) {
        float[] fArr = this.component2;
        float f = i;
        fArr[4] = f;
        fArr[5] = f;
        component3();
    }

    private void component3() {
        this.getSponsorBeneficiariesState.invalidate();
    }
}
