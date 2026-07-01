package com.huawei.common.widget.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.bumptech.glide.request.RequestOptions;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.R;
import com.huawei.common.image.ImageInterfaceManager;
import com.huawei.common.util.L;
import com.huawei.common.widget.input.AttrUtils;
import com.huawei.common.widget.round.RoundConstraintLayout;
import java.util.ArrayList;
import java.util.List;

public class MarqueeView<T> extends ViewFlipper {
    private static final int DIRECTION_BOTTOM_TO_TOP = 0;
    private static final int DIRECTION_LEFT_TO_RIGHT = 3;
    private static final int DIRECTION_RIGHT_TO_LEFT = 2;
    private static final int DIRECTION_TOP_TO_BOTTOM = 1;
    private static final int GRAVITY_CENTER = 1;
    private static final int GRAVITY_LEFT = 0;
    private static final int GRAVITY_RIGHT = 2;
    private int animBottomIn;
    private int animDuration;
    private boolean animStartBoolean;
    private int animTopOut;
    private int direction;
    private int gravity;
    private int interval;
    private int layoutId;
    private int mPosition;
    private int marqueeBackgroundColor;
    private int marqueeRoundCorner;
    private List<T> messageList;
    private OnItemClickListener<T> onItemClickListener;
    private OnItemSelectedListener<T> onItemSelectedClickListener;
    private boolean setAnimDurationBoolean;
    private boolean singleLine;
    private int textColor;
    private int textSize;
    private Typeface typeface;

    public interface IMarqueeItem {
        int getFlipInterval();

        String marqueeIcon();

        CharSequence marqueeMessage();

        default String marqueeTime() {
            return null;
        }
    }

    public interface OnItemClickListener<V> {
        void onItemClick(int i, V v, View view);
    }

    public interface OnItemSelectedListener<V> {
        void onItemSelectedClick(int i, V v);
    }

    public MarqueeView(Context context) {
        this(context, null);
    }

    public MarqueeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setAnimDurationBoolean = false;
        this.interval = 3000;
        this.textSize = 14;
        this.animDuration = 1000;
        this.textColor = -16777216;
        this.gravity = 19;
        this.singleLine = false;
        this.direction = 0;
        this.animTopOut = R.anim.anim_top_out;
        this.animBottomIn = R.anim.anim_bottom_in;
        this.messageList = new ArrayList();
        this.animStartBoolean = false;
        this.layoutId = R.layout.common_marquee_view;
        this.marqueeBackgroundColor = -1;
        this.marqueeRoundCorner = SizeUtils.dp2px(8.0f);
        init(context, attributeSet, 0);
    }

    public void setMarqueeBackgroundColor(int i) {
        this.marqueeBackgroundColor = i;
    }

    public void setMarqueeRoundCorner(int i) {
        this.marqueeRoundCorner = i;
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MarqueeView, i, 0);
        this.layoutId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MarqueeView_mvLayout, this.layoutId);
        this.interval = typedArrayObtainStyledAttributes.getInteger(R.styleable.MarqueeView_mvInterval, this.interval);
        this.setAnimDurationBoolean = typedArrayObtainStyledAttributes.hasValue(R.styleable.MarqueeView_mvAnimDuration);
        this.animDuration = typedArrayObtainStyledAttributes.getInteger(R.styleable.MarqueeView_mvAnimDuration, this.animDuration);
        this.singleLine = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MarqueeView_mvSingleLine, false);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.MarqueeView_mvTextSize)) {
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.MarqueeView_mvTextSize, this.textSize);
            this.textSize = dimension;
            this.textSize = ConvertUtils.px2sp(dimension);
        }
        this.textColor = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes, R.styleable.MarqueeView_mvTextColor, this.textColor);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MarqueeView_mvFont, 0);
        if (resourceId != 0) {
            this.typeface = ResourcesCompat.getFont(context, resourceId);
        }
        setGravityType(typedArrayObtainStyledAttributes);
        setAnim(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setAnim(TypedArray typedArray) {
        if (typedArray.hasValue(R.styleable.MarqueeView_mvDirection)) {
            int i = typedArray.getInt(R.styleable.MarqueeView_mvDirection, this.direction);
            this.direction = i;
            if (i == 0) {
                this.animBottomIn = R.anim.anim_bottom_in;
                this.animTopOut = R.anim.anim_top_out;
                return;
            }
            if (i == 1) {
                this.animBottomIn = R.anim.anim_top_in;
                this.animTopOut = R.anim.anim_bottom_out;
                return;
            } else if (i == 2) {
                this.animBottomIn = R.anim.anim_right_in;
                this.animTopOut = R.anim.anim_left_out;
                return;
            } else {
                if (i != 3) {
                    return;
                }
                this.animBottomIn = R.anim.anim_left_in;
                this.animTopOut = R.anim.anim_right_out;
                return;
            }
        }
        this.animBottomIn = R.anim.anim_bottom_in;
        this.animTopOut = R.anim.anim_top_out;
    }

    private void setGravityType(TypedArray typedArray) {
        int i = typedArray.getInt(R.styleable.MarqueeView_mvGravity, 0);
        if (i == 0) {
            this.gravity = 8388627;
        } else if (i == 1) {
            this.gravity = 17;
        } else {
            if (i != 2) {
                return;
            }
            this.gravity = 8388629;
        }
    }

    public void startWithText(String str) {
        startWithText(str, this.animBottomIn, this.animTopOut);
    }

    public void startWithText(final String str, final int i, final int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                MarqueeView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                MarqueeView.this.startWithFixedWidth(str, i, i2);
            }
        });
    }

    public void startWithFixedWidth(String str, int i, int i2) {
        int length = str.length();
        int iPx2dp = ConvertUtils.px2dp(getWidth());
        if (iPx2dp == 0) {
            L.e("Please set the width of MarqueeView !");
            return;
        }
        int i3 = iPx2dp / this.textSize;
        ArrayList arrayList = new ArrayList();
        if (length <= i3) {
            arrayList.add(str);
        } else {
            int i4 = length / i3;
            int i5 = 0;
            int i6 = length % i3 != 0 ? 1 : 0;
            while (i5 < i4 + i6) {
                int i7 = i5 + 1;
                arrayList.add(str.substring(i5 * i3, Math.min(i7 * i3, length)));
                i5 = i7;
            }
        }
        if (this.messageList == null) {
            this.messageList = new ArrayList();
        }
        this.messageList.clear();
        this.messageList.addAll(arrayList);
        postStart(i, i2);
    }

    public void startWithList(List<T> list, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        setMessages(list);
        postStart(i, i2);
    }

    public void startWithList(List<T> list) {
        startWithList(list, this.animBottomIn, this.animTopOut);
    }

    private void postStart(final int i, final int i2) {
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$postStart$0(i, i2);
            }
        });
    }

    public void lambda$postStart$0(int i, int i2) {
        removeAllViews();
        clearAnimation();
        List<T> list = this.messageList;
        if (list == null || list.isEmpty()) {
            L.e("The messages cannot be empty!");
            return;
        }
        this.mPosition = 0;
        updateFlipInterval();
        addView(createTextView(this.messageList.get(this.mPosition)));
        if (this.messageList.size() > 1) {
            setInAndOutAnimation(i, i2);
            startFlipping();
        }
        handAnimation();
    }

    private void handAnimation() {
        if (getInAnimation() != null) {
            setAnimation();
        }
    }

    private void setAnimation() {
        getInAnimation().setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationStart(Animation animation) {
                if (MarqueeView.this.animStartBoolean) {
                    animation.cancel();
                }
                MarqueeView.this.animStartBoolean = true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override
            public void onAnimationEnd(Animation animation) {
                MarqueeView.this.mPosition++;
                if (MarqueeView.this.mPosition >= MarqueeView.this.messageList.size()) {
                    MarqueeView.this.mPosition = 0;
                }
                Object obj = MarqueeView.this.messageList.get(MarqueeView.this.mPosition);
                if (MarqueeView.this.onItemSelectedClickListener != null) {
                    MarqueeView.this.onItemSelectedClickListener.onItemSelectedClick(MarqueeView.this.mPosition, obj);
                }
                ConstraintLayout constraintLayoutCreateTextView = MarqueeView.this.createTextView(obj);
                if (constraintLayoutCreateTextView.getParent() == null) {
                    MarqueeView.this.addView(constraintLayoutCreateTextView);
                }
                MarqueeView.this.animStartBoolean = false;
            }
        });
    }

    @Override
    public void showNext() {
        updateFlipInterval();
        super.showNext();
    }

    private void updateFlipInterval() {
        int i = this.mPosition;
        if (i >= this.messageList.size()) {
            i = 0;
        }
        T t = this.messageList.get(i);
        if (t instanceof IMarqueeItem) {
            setFlipInterval(((IMarqueeItem) t).getFlipInterval());
        } else {
            setFlipInterval(this.interval);
        }
    }

    protected ConstraintLayout createTextView(final T t) {
        String str;
        String strMarqueeIcon;
        TextView textView;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) getChildAt((getDisplayedChild() + 1) % this.messageList.size());
        if (roundConstraintLayout == null) {
            ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(getContext()), this.layoutId, this, false);
            RoundConstraintLayout roundConstraintLayout2 = (RoundConstraintLayout) viewDataBindingInflate.getRoot();
            roundConstraintLayout2.getBaseFilletView().setRoundCorner(this.marqueeRoundCorner);
            TextView textView2 = (TextView) viewDataBindingInflate.getRoot().findViewById(R.id.tvContent);
            if (textView2 != null) {
                setMessageTv(textView2);
                String strMarqueeTime = null;
                CharSequence charSequenceMarqueeMessage = "";
                if (t instanceof CharSequence) {
                    strMarqueeIcon = "";
                    charSequenceMarqueeMessage = (CharSequence) t;
                } else if (t instanceof IMarqueeItem) {
                    IMarqueeItem iMarqueeItem = (IMarqueeItem) t;
                    charSequenceMarqueeMessage = iMarqueeItem.marqueeMessage();
                    strMarqueeIcon = iMarqueeItem.marqueeIcon();
                    strMarqueeTime = iMarqueeItem.marqueeTime();
                } else {
                    str = "";
                    textView2.setText(charSequenceMarqueeMessage);
                    ImageInterfaceManager.INSTANCE.getImageInterface().load((ImageView) viewDataBindingInflate.getRoot().findViewById(R.id.ivIcon), str, new RequestOptions());
                    textView = (TextView) viewDataBindingInflate.getRoot().findViewById(R.id.tvTime);
                    if (textView != null && !TextUtils.isEmpty(strMarqueeTime)) {
                        textView.setText(strMarqueeTime);
                        textView.setVisibility(0);
                    }
                }
                str = strMarqueeIcon;
                textView2.setText(charSequenceMarqueeMessage);
                ImageInterfaceManager.INSTANCE.getImageInterface().load((ImageView) viewDataBindingInflate.getRoot().findViewById(R.id.ivIcon), str, new RequestOptions());
                textView = (TextView) viewDataBindingInflate.getRoot().findViewById(R.id.tvTime);
                if (textView != null) {
                    textView.setText(strMarqueeTime);
                    textView.setVisibility(0);
                }
            }
            roundConstraintLayout2.setTag(Integer.valueOf(this.mPosition));
            roundConstraintLayout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    MarqueeView.m10069xdd2e4e55(this.f$0, t, view);
                }
            });
            roundConstraintLayout = roundConstraintLayout2;
        }
        int i = this.marqueeBackgroundColor;
        if (i != -1) {
            roundConstraintLayout.setBackgroundColor(i);
        }
        return roundConstraintLayout;
    }

    private void lambda$createTextView$1(Object obj, View view) {
        OnItemClickListener<T> onItemClickListener = this.onItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(getPosition(), obj, view);
        }
    }

    private void setMessageTv(TextView textView) {
        textView.setGravity(this.gravity | 16);
        textView.setTextColor(this.textColor);
        textView.setTextSize(this.textSize);
        textView.setIncludeFontPadding(true);
        textView.setSingleLine(this.singleLine);
        if (this.singleLine) {
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        Typeface typeface = this.typeface;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
    }

    public int getPosition() {
        if (getCurrentView() == null) {
            return 0;
        }
        return ((Integer) getCurrentView().getTag()).intValue();
    }

    public void setOnItemClickListener(OnItemClickListener<T> onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setMessages(List<T> list) {
        this.messageList = list;
    }

    public void setOnItemSelectedListener(OnItemSelectedListener<T> onItemSelectedListener) {
        this.onItemSelectedClickListener = onItemSelectedListener;
    }

    private void setInAndOutAnimation(int i, int i2) {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), i);
        if (this.setAnimDurationBoolean) {
            animationLoadAnimation.setDuration(this.animDuration);
        }
        setInAnimation(animationLoadAnimation);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(getContext(), i2);
        if (this.setAnimDurationBoolean) {
            animationLoadAnimation2.setDuration(this.animDuration);
        }
        setOutAnimation(animationLoadAnimation2);
    }

    public void setTypeface(Typeface typeface) {
        this.typeface = typeface;
    }

    public static void m10069xdd2e4e55(MarqueeView marqueeView, Object obj, View view) {
        Callback.onClick_enter(view);
        try {
            marqueeView.lambda$createTextView$1(obj, view);
        } finally {
            Callback.onClick_exit();
        }
    }
}
