package com.huawei.digitalpayment.checkout.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.huawei.digitalpayment.checkoutModule.R;
import com.huawei.digitalpayment.consumer.baselib.util.DensityUtils;

public class CheckOutPinEditText extends AppCompatEditText {
    private static int ShareDataUIState = 1;
    private static int component1;
    private int editBgStartY;
    private int editBgWidth;
    private int inputPadding;
    private Paint mBlueDivideLinePaint;
    private int mCircleColor;
    private Paint mCirclePaint;
    private int mCircleRadius;
    private OnPasswordCompleteListener mCompleteListener;
    private Context mContext;
    private int mCurInputCount;
    private int mDivideLineColor;
    private Paint mDivideLinePaint;
    private int mDivideLineWidth;
    private float mFirstCircleX;
    private float mFirstCircleY;
    private RectF mFrameRectF;
    private int mHeight;
    private int mMaxCount;
    private int mRectAngle;
    private int mStrokeColor;
    private Paint mStrokePaint;
    private int mWidth;

    public interface OnPasswordCompleteListener {
        void onComplete(String str);
    }

    public CheckOutPinEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurInputCount = 0;
        this.mCircleRadius = dip2px(getContext(), 5.0f);
        this.mMaxCount = 6;
        this.mCircleColor = -16777216;
        this.mStrokeColor = -16777216;
        this.mDivideLineColor = -16777216;
        this.mDivideLineWidth = dip2px(getContext(), 0.5f);
        this.inputPadding = DensityUtils.dp2px(getContext(), 8.0f);
        this.mFrameRectF = new RectF();
        this.mRectAngle = 0;
        this.mContext = context;
        forbidCopy();
        getAtt(attributeSet);
        initPaint();
        setCursorVisible(false);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.mMaxCount)});
    }

    private void forbidCopy() {
        int i = 2 % 2;
        setCustomSelectionActionModeCallback(new ActionMode.Callback(this) {
            private static int component2 = 1;
            private static int component3;

            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                int i2 = 2 % 2;
                int i3 = component3 + 31;
                component2 = i3 % 128;
                return i3 % 2 == 0;
            }

            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 5;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 117;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {
                int i2 = 2 % 2;
                int i3 = component3 + 43;
                component2 = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 23;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 119;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        });
        setEnabled(false);
        setLongClickable(false);
        setImeOptions(268435456);
        int i2 = component1 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void getAtt(AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        TypedArray typedArrayObtainStyledAttributes = this.mContext.obtainStyledAttributes(attributeSet, R.styleable.PinEditText);
        this.mMaxCount = typedArrayObtainStyledAttributes.getInt(R.styleable.PinEditText_maxCount, this.mMaxCount);
        this.mCircleColor = typedArrayObtainStyledAttributes.getColor(R.styleable.PinEditText_pwdCircleColor, this.mCircleColor);
        this.mCircleRadius = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.PinEditText_pwdCircleRadius, this.mCircleRadius);
        this.mStrokeColor = typedArrayObtainStyledAttributes.getColor(R.styleable.PinEditText_strokeColor, this.mStrokeColor);
        this.mDivideLineColor = typedArrayObtainStyledAttributes.getColor(R.styleable.PinEditText_divideLineColor, this.mDivideLineColor);
        this.mDivideLineWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.PinEditText_divideLineWidth, this.mDivideLineWidth);
        this.mRectAngle = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.PinEditText_rectAngle, this.mRectAngle);
        typedArrayObtainStyledAttributes.recycle();
        int i4 = component1 + 13;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
    }

    private void initPaint() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.mCirclePaint = getPaint(dip2px(getContext(), this.mMaxCount - 1), Paint.Style.FILL, this.mCircleColor);
        this.mStrokePaint = getPaint(this.mDivideLineWidth * 2, Paint.Style.STROKE, this.mStrokeColor);
        this.mDivideLinePaint = getPaint(this.mDivideLineWidth, Paint.Style.STROKE, this.mDivideLineColor);
        this.mBlueDivideLinePaint = getPaint(this.mDivideLineWidth * 2, Paint.Style.STROKE, getContext().getColor(R.color.color_366bfc));
        int i4 = ShareDataUIState + 57;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private Paint getPaint(int i, Paint.Style style, int i2) {
        int i3 = 2 % 2;
        Paint paint = new Paint(1);
        paint.setStrokeWidth(i);
        paint.setStyle(style);
        paint.setColor(i2);
        paint.setAntiAlias(true);
        int i4 = ShareDataUIState + 105;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return paint;
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = ShareDataUIState + 115;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        super.onSizeChanged(i, i2, i3, i4);
        this.mHeight = i2;
        this.mWidth = i;
        int i8 = this.inputPadding;
        int i9 = this.mMaxCount;
        int i10 = (i - ((i9 - 1) * i8)) / i9;
        this.editBgWidth = i10;
        this.editBgStartY = (i2 - i10) / 2;
        this.mFirstCircleX = ((i - (i8 * 5)) / i9) / 2;
        this.mFirstCircleY = i2 / 2;
        this.mFrameRectF.set(0.0f, 0.0f, i, i2);
        int i11 = component1 + 35;
        ShareDataUIState = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 37;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i5 = this.inputPadding;
            int i6 = this.mMaxCount;
            int i7 = (size << (i5 % (i6 % 1))) % i6;
            this.editBgWidth = i7;
            setMeasuredDimension(size, i7 / 2);
            return;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int i8 = this.inputPadding;
        int i9 = this.mMaxCount;
        int i10 = (size2 - (i8 * (i9 - 1))) / i9;
        this.editBgWidth = i10;
        setMeasuredDimension(size2, i10 + 4);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = component1 + 27;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            drawPinBackground(canvas);
            drawPsdCircle(canvas);
            int i3 = ShareDataUIState + 23;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        drawPinBackground(canvas);
        drawPsdCircle(canvas);
        obj.hashCode();
        throw null;
    }

    private void drawPinBackground(Canvas canvas) {
        int i = 2 % 2;
        int i2 = this.editBgWidth;
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.mMaxCount) {
            RectF rectF = new RectF();
            rectF.top = this.editBgStartY;
            rectF.bottom = this.editBgStartY + this.editBgWidth;
            if (i3 != 0) {
                int i5 = component1 + 103;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    i4 = i2 - this.inputPadding;
                    i2 = this.editBgWidth % i4;
                } else {
                    i4 = this.inputPadding + i2;
                    i2 = this.editBgWidth + i4;
                }
            }
            rectF.left = i4 + 1;
            rectF.right = i2;
            if (this.mCurInputCount == i3) {
                int i6 = ShareDataUIState + 107;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                canvas.drawRoundRect(rectF, dip2px(getContext(), 10.0f), dip2px(getContext(), 10.0f), this.mBlueDivideLinePaint);
            } else {
                canvas.drawRoundRect(rectF, dip2px(getContext(), 10.0f), dip2px(getContext(), 10.0f), this.mDivideLinePaint);
            }
            i3++;
            int i8 = ShareDataUIState + 125;
            component1 = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = ShareDataUIState + 23;
        component1 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 89 / 0;
        }
    }

    private void drawPsdCircle(Canvas canvas) {
        int i = 2 % 2;
        float f = this.mFirstCircleX;
        int i2 = ShareDataUIState + 115;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 % 5;
        }
        for (int i4 = 0; i4 < this.mCurInputCount; i4++) {
            int i5 = component1 + 11;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            if (i4 != 0) {
                f += this.editBgWidth + this.inputPadding;
            }
            canvas.drawCircle(f, this.mFirstCircleY, this.mCircleRadius, this.mCirclePaint);
        }
    }

    @Override
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        OnPasswordCompleteListener onPasswordCompleteListener;
        int i4 = 2 % 2;
        super.onTextChanged(charSequence, i, i2, i3);
        int length = charSequence.toString().length();
        this.mCurInputCount = length;
        if (length == this.mMaxCount && (onPasswordCompleteListener = this.mCompleteListener) != null) {
            int i5 = component1 + 3;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            onPasswordCompleteListener.onComplete(getPasswordString());
        }
        invalidate();
        int i7 = ShareDataUIState + 5;
        component1 = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override
    protected void onSelectionChanged(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = component1 + 35;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            super.onSelectionChanged(i, i2);
            int i5 = 0 / 0;
            if (i != i2) {
                return;
            }
        } else {
            super.onSelectionChanged(i, i2);
            if (i != i2) {
                return;
            }
        }
        int i6 = ShareDataUIState + 43;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            setSelection(getText().length());
        } else {
            setSelection(getText().length());
            int i7 = 46 / 0;
        }
    }

    public void setMaxCount(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 83;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        this.mMaxCount = i;
        int i6 = i4 + 87;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }

    public String getPasswordString() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String strTrim = getText().toString().trim();
        int i4 = ShareDataUIState + 109;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return strTrim;
    }

    public void setOnCompleteListener(OnPasswordCompleteListener onPasswordCompleteListener) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.mCompleteListener = onPasswordCompleteListener;
        int i5 = i2 + 85;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public static int dip2px(Context context, float f) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
        int i5 = component1 + 13;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }
}
