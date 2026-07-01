package com.huawei.digitalpayment.consumer.baselib.widget.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatEditText;
import com.huawei.common.widget.text.AmountFilter;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.util.DensityUtils;

public class InputItemEditText extends AppCompatEditText implements TextWatcher {
    public static final int PADDING_SIZE = 4;
    public static final int WIDTH_SIZE = 2;
    private static int component1 = 1;
    private static int copydefault;
    private Bitmap clearBitmap;
    private String currency;
    private boolean isSelect;
    private boolean isShowCurrency;
    private Paint mPaint;
    private int resPadding;
    private int resWidth;
    private int textWidth;

    public InputItemEditText(Context context) {
        super(context);
        this.currency = AppConfigManager.getAppConfig().getCurrency();
        this.resPadding = 0;
        this.resWidth = 0;
        this.textWidth = 0;
        initView(context, null);
    }

    public InputItemEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currency = AppConfigManager.getAppConfig().getCurrency();
        this.resPadding = 0;
        this.resWidth = 0;
        this.textWidth = 0;
        initView(context, attributeSet);
    }

    public InputItemEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.currency = AppConfigManager.getAppConfig().getCurrency();
        this.resPadding = 0;
        this.resWidth = 0;
        this.textWidth = 0;
        initView(context, attributeSet);
    }

    private void initView(Context context, AttributeSet attributeSet) {
        int i = 2 % 2;
        Paint paint = new Paint(3);
        this.mPaint = paint;
        paint.setTextSize(dp2px(context, 12.0f));
        this.mPaint.setTextAlign(Paint.Align.CENTER);
        if (attributeSet != null) {
            int i2 = component1 + 13;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.InputItemEditText);
            this.isShowCurrency = typedArrayObtainStyledAttributes.getBoolean(R.styleable.InputItemEditText_isShowCurrency, false);
            this.isSelect = typedArrayObtainStyledAttributes.getBoolean(R.styleable.InputItemEditText_isSelect, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.resPadding == 0) {
            this.resPadding = dp2px(context, 16.0f);
        }
        if (this.resWidth == 0) {
            int i4 = component1 + 115;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                this.resWidth = dp2px(context, 16.0f);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.resWidth = dp2px(context, 16.0f);
        }
        this.textWidth = (int) this.mPaint.measureText(this.currency);
        if (this.isShowCurrency) {
            initCurrencyView();
            initAmoutType();
        }
    }

    private void initAmoutType() {
        int i = 2 % 2;
        addTextChangedListener(this);
        setInputType(8194);
        AmountFilter amountFilter = new AmountFilter();
        amountFilter.attach(this);
        setFilters(new InputFilter[]{amountFilter});
        int i2 = component1 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = component1 + 33;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        super.onMeasure(i, i2);
        int i6 = component1 + 37;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        super.onDraw(canvas);
        this.textWidth = (int) this.mPaint.measureText(this.currency);
        if (this.isShowCurrency) {
            drawCurrency(canvas);
            return;
        }
        if (this.isSelect) {
            drawSelectIcon(canvas);
            int i4 = component1 + 13;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 3;
            }
        }
    }

    private void drawSelectIcon(Canvas canvas) {
        int i = 2 % 2;
        int width = getWidth();
        int scrollX = getScrollX();
        int i2 = this.resPadding;
        int width2 = getWidth();
        int scrollX2 = getScrollX();
        int i3 = this.resPadding;
        int i4 = this.textWidth;
        int height = getHeight();
        int i5 = this.resWidth;
        int i6 = (height - i5) / 2;
        Rect rect = new Rect(((width2 + scrollX2) - i3) - i4, i6, (width + scrollX) - i2, i5 + i6);
        canvas.drawBitmap(createBitmap(getContext(), 0, R.mipmap.icon_the_right), rect.centerX(), rect.centerY() - (r1.getHeight() / 2), this.mPaint);
        int i7 = copydefault + 103;
        component1 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 56 / 0;
        }
    }

    private void drawCurrency(Canvas canvas) {
        int i = 2 % 2;
        int i2 = component1 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        drawCurrencyText(canvas);
        int i4 = component1 + 15;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
    }

    private void drawCurrencyText(Canvas canvas) {
        int i = 2 % 2;
        int width = getWidth();
        int scrollX = getScrollX();
        int width2 = getWidth();
        int scrollX2 = getScrollX();
        int i2 = this.textWidth;
        int height = getHeight();
        int i3 = this.resWidth;
        int i4 = (height - i3) / 2;
        Rect rect = new Rect((width2 + scrollX2) - i2, i4, width + scrollX, i3 + i4);
        Paint.FontMetrics fontMetrics = this.mPaint.getFontMetrics();
        float f = (fontMetrics.bottom - fontMetrics.top) / 2.0f;
        float f2 = fontMetrics.bottom;
        float fCenterY = rect.centerY();
        this.mPaint.setColor(getContext().getColor(R.color.colorMainText));
        canvas.drawText(this.currency, rect.centerX() - DensityUtils.dp2px(getContext(), 14.0f), fCenterY + (f - f2), this.mPaint);
        drawLine(canvas);
        int i5 = copydefault + 81;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void drawLine(Canvas canvas) {
        int i = 2 % 2;
        int i2 = component1 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int width = getWidth();
        int scrollX = getScrollX();
        int i4 = this.resPadding;
        int i5 = this.textWidth;
        int iDp2px = DensityUtils.dp2px(getContext(), 10.0f);
        int height = ((getHeight() - this.resWidth) / 2) - DensityUtils.dp2px(getContext(), 5.0f);
        int i6 = this.resWidth;
        int iDp2px2 = DensityUtils.dp2px(getContext(), 10.0f);
        this.mPaint.setStrokeWidth(0.5f);
        this.mPaint.setColor(Color.parseColor("#EBEBEB"));
        float f = (((width + scrollX) - i4) - i5) - iDp2px;
        canvas.drawLine(f, height, f, i6 + height + iDp2px2, this.mPaint);
        int i7 = component1 + 35;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void isSelect(boolean z) {
        boolean z2;
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.isSelect = z;
            z2 = true;
        } else {
            this.isSelect = z;
            z2 = false;
        }
        this.isShowCurrency = z2;
        postInvalidate();
    }

    @Override
    public void afterTextChanged(Editable editable) {
        int i = 2 % 2;
        int i2 = component1 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (editable.toString().length() == 2 && editable.toString().startsWith("0") && !editable.toString().equals("0.")) {
            int i4 = copydefault + 25;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            editable.delete(0, 1);
        }
    }

    public String getCurrency() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 27;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCurrency(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 57;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.currency = str;
        int i5 = i2 + 119;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
    }

    public void isShowCurrency(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.isShowCurrency = z;
        this.isSelect = false;
        if (z) {
            int i5 = i3 + 23;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            initAmoutType();
        }
        postInvalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r4 = android.graphics.BitmapFactory.decodeResource(r4.getResources(), r6);
        r5 = com.huawei.digitalpayment.consumer.baselib.widget.input.InputItemEditText.copydefault + 17;
        com.huawei.digitalpayment.consumer.baselib.widget.input.InputItemEditText.component1 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if ((r5 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r5 = 50 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 109;
        com.huawei.digitalpayment.consumer.baselib.widget.input.InputItemEditText.component1 = r2 % 128;
        r2 = r2 % 2;
        r4 = android.graphics.BitmapFactory.decodeResource(r4.getResources(), r5);
        r5 = com.huawei.digitalpayment.consumer.baselib.widget.input.InputItemEditText.copydefault + 115;
        com.huawei.digitalpayment.consumer.baselib.widget.input.InputItemEditText.component1 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap createBitmap(android.content.Context r4, int r5, int r6) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.baselib.widget.input.InputItemEditText.component1
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.baselib.widget.input.InputItemEditText.copydefault = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L15
            r1 = 70
            int r1 = r1 / 0
            if (r5 == 0) goto L30
            goto L17
        L15:
            if (r5 == 0) goto L30
        L17:
            int r2 = r2 + 109
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.baselib.widget.input.InputItemEditText.component1 = r6
            int r2 = r2 % r0
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeResource(r4, r5)
            int r5 = com.huawei.digitalpayment.consumer.baselib.widget.input.InputItemEditText.copydefault
            int r5 = r5 + 115
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.baselib.widget.input.InputItemEditText.component1 = r6
            int r5 = r5 % r0
            return r4
        L30:
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeResource(r4, r6)
            int r5 = com.huawei.digitalpayment.consumer.baselib.widget.input.InputItemEditText.copydefault
            int r5 = r5 + 17
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.baselib.widget.input.InputItemEditText.component1 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L47
            r5 = 50
            int r5 = r5 / 0
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.widget.input.InputItemEditText.createBitmap(android.content.Context, int, int):android.graphics.Bitmap");
    }

    public int dp2px(Context context, float f) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iApplyDimension = (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
        int i4 = component1 + 51;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return iApplyDimension;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void initCurrencyView() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = component1 + 91;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = component1 + 91;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
