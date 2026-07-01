package com.huawei.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.ConvertUtils;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;

public class BubblesView extends RoundTextView {
    public static final int CIRCLE = 1;
    public static final int ELLIPSE = 0;
    private int bubblesBackgroundColor;
    private int bubblesHeight;
    private int bubblesTextColor;
    private int bubblesType;
    private int bubblesWidth;
    private int roundCorner;
    private int roundCornerBottomLeft;
    private int roundCornerBottomRight;
    private int roundCornerTopLeft;
    private int roundCornerTopRight;

    public BubblesView(Context context) {
        this(context, null);
    }

    public BubblesView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) throws Throwable {
        initAttrs(context, attributeSet);
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 67, Process.getGidForName("") + 34, (char) (19697 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 518907119, false, "component3", null);
        }
        int i = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - KeyEvent.keyCodeFromString(""), 30 - Color.blue(0), (char) View.combineMeasuredStates(0, 0), 55511118, false, "component2", null);
        }
        int i2 = ((Field) objCopydefault2).getInt(null);
        long j = i2;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 37, AndroidCharacter.getMirror('0') - 18, (char) ((Process.getThreadPriority(0) + 20) >> 6), 58536393, false, "component3", null);
        }
        int i3 = ((Field) objCopydefault3).getInt(null);
        long j2 = -159;
        long j3 = (j2 * 1221581115165877456L) + (j2 * (-428877661521673032L));
        long j4 = 160;
        long j5 = -1;
        long jNextInt = ((long) new Random().nextInt(1261692092)) ^ j5;
        long j6 = j3 + (((j5 ^ 1221581115165877456L) | (-428877661521673032L)) * j4) + (((long) (-160)) * (((jNextInt | 1221581115165877456L) ^ j5) | ((-360288454079175432L) ^ j5))) + (j4 * ((j5 ^ (jNextInt | (j5 ^ (-428877661521673032L)))) | 1221581115165877456L));
        int i4 = 0;
        while (true) {
            for (int i5 = 0; i5 != 8; i5++) {
                i3 = (((((int) (j >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j = j6;
        }
        if (i3 != i) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (19697 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j7 = i2 ^ i;
            long j8 = -1;
            long j9 = 0;
            long j10 = (j7 & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 6618, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {870738195, Long.valueOf(j10), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0', 0), 56 - KeyEvent.normalizeMetaState(0), (char) TextUtils.indexOf("", ""), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                throw new RuntimeException(String.valueOf(i2));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        initViews();
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BubblesView);
        CharSequence text = getText();
        int iDp2px = ConvertUtils.dp2px(6.0f);
        if (!TextUtils.isEmpty(text)) {
            iDp2px = ConvertUtils.dp2px(16.0f);
        }
        this.bubblesHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BubblesView_bubbles_height, iDp2px);
        this.bubblesWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BubblesView_bubbles_width, 0);
        this.bubblesType = typedArrayObtainStyledAttributes.getInt(R.styleable.BubblesView_bubbles_type, 0);
        this.roundCorner = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BubblesView_bubbles_round_corner, 0);
        this.roundCornerTopLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BubblesView_bubbles_round_corner_top_left, iDp2px);
        this.roundCornerTopRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BubblesView_bubbles_round_corner_top_right, iDp2px);
        this.roundCornerBottomLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BubblesView_bubbles_round_corner_bottom_left, iDp2px);
        this.roundCornerBottomRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.BubblesView_bubbles_round_corner_bottom_right, iDp2px);
        this.bubblesTextColor = typedArrayObtainStyledAttributes.getColor(R.styleable.BubblesView_bubbles_text_color, ColorUtils.getColor(R.color.colorBackground));
        this.bubblesBackgroundColor = typedArrayObtainStyledAttributes.getColor(R.styleable.BubblesView_bubbles_background_color, ColorUtils.getColor(R.color.colorUrgentDefault));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initViews() {
        setGravity(17);
        setTextColor(this.bubblesTextColor);
        setBackgroundColor(this.bubblesBackgroundColor);
        setBaseFilletView();
        setTextSize(10.0f);
    }

    private void setBaseFilletView() {
        setHeight(this.bubblesHeight);
        setMinWidth(this.bubblesHeight);
        int i = this.bubblesWidth;
        if (i != 0) {
            setWidth(i);
        }
        if (this.bubblesType == 1) {
            setWidth(this.bubblesHeight);
            getBaseFilletView().setRoundCorner(this.bubblesHeight);
            getBaseFilletView().setRoundAsCircle(true);
        } else {
            getBaseFilletView().setRoundAsCircle(false);
            if (this.roundCorner != 0) {
                getBaseFilletView().setRoundCorner(this.roundCorner);
            } else {
                getBaseFilletView().setRoundCornerBottomLeft(this.roundCornerBottomLeft);
                getBaseFilletView().setRoundCornerBottomRight(this.roundCornerBottomRight);
                getBaseFilletView().setRoundCornerTopLeft(this.roundCornerTopLeft);
                getBaseFilletView().setRoundCornerTopRight(this.roundCornerTopRight);
            }
        }
        getBaseFilletView().onSizeChanged(getWidth(), getHeight());
    }

    public void setBubblesHeight(int i) {
        this.bubblesHeight = i;
        initViews();
    }

    public void setBubblesWidth(int i) {
        this.bubblesWidth = i;
        initViews();
    }

    public void setBubblesType(int i) {
        this.bubblesType = i;
        initViews();
    }

    public void setBubblesTextColor(int i) {
        this.bubblesTextColor = i;
        initViews();
    }

    public void setBubblesBackgroundColor(int i) {
        this.bubblesBackgroundColor = i;
        initViews();
    }

    public void setRoundCornerTopLeft(int i) {
        this.roundCornerTopLeft = i;
        initViews();
    }

    public void setRoundCornerTopRight(int i) {
        this.roundCornerTopRight = i;
        initViews();
    }

    public void setRoundCornerBottomLeft(int i) {
        this.roundCornerBottomLeft = i;
        initViews();
    }

    public void setRoundCornerBottomRight(int i) {
        this.roundCornerBottomRight = i;
        initViews();
    }

    public void setRoundCorner(int i) {
        this.roundCorner = i;
        initViews();
    }
}
