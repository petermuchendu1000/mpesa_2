package com.huawei.digitalpayment.consumer.base.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huawei.digitalpayment.consumer.baseui.R;
import com.huawei.digitalpayment.consumer.baseui.databinding.LayoutPinPadBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \"2\u00020\u0001:\u0003 !\"B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0019J\u0006\u0010\u001d\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\u0019J\b\u0010\u001f\u001a\u00020\u0019H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/ui/widget/PinPadView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lengthMode", "Lcom/huawei/digitalpayment/consumer/base/ui/widget/PinPadView$LengthMode;", "hasError", "", "maxNumberOfDots", "", "minNumberOfDots", "dotsList", "Ljava/util/ArrayList;", "Lcom/huawei/digitalpayment/consumer/base/ui/widget/PinPadDotView;", "selectedDot", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/huawei/digitalpayment/consumer/base/ui/widget/PinPadView$PinPadListener;", "showingLoadingAnimation", "binding", "Lcom/huawei/digitalpayment/consumer/baseui/databinding/LayoutPinPadBinding;", "setListener", "", "selectDot", "clearDots", "deselectDot", "startLoadingAnimation", "showErrorAnimation", "notifyPinChange", "PinPadListener", "LengthMode", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PinPadView extends LinearLayout {

    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_DOTS = 4;
    private static final long LOADING_DELAY = 200;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final LayoutPinPadBinding binding;
    private final ArrayList<PinPadDotView> dotsList;
    private boolean hasError;
    private LengthMode lengthMode;
    private PinPadListener listener;
    private int maxNumberOfDots;
    private int minNumberOfDots;
    private int selectedDot;
    private boolean showingLoadingAnimation;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/ui/widget/PinPadView$PinPadListener;", "", "onMaxPinReached", "", "onPinChanged", "isPinValid", "", "onErrorAnimationFinished", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PinPadListener {
        void onErrorAnimationFinished();

        void onMaxPinReached();

        void onPinChanged(boolean isPinValid);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinPadView(Context context, AttributeSet attributeSet) {
        LengthMode lengthMode;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.lengthMode = LengthMode.STATIC;
        this.maxNumberOfDots = 4;
        this.minNumberOfDots = 4;
        this.dotsList = new ArrayList<>();
        LayoutPinPadBinding layoutPinPadBindingInflate = LayoutPinPadBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(layoutPinPadBindingInflate, "");
        this.binding = layoutPinPadBindingInflate;
        int i = this.maxNumberOfDots;
        int i2 = 0;
        Object obj = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PinPadView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            this.maxNumberOfDots = typedArrayObtainStyledAttributes.getInt(R.styleable.PinPadView_maxLength, 4);
            this.minNumberOfDots = typedArrayObtainStyledAttributes.getInt(R.styleable.PinPadView_minLength, 4);
            i = typedArrayObtainStyledAttributes.getInt(R.styleable.PinPadView_pinPadDots, 4);
            if (typedArrayObtainStyledAttributes.getBoolean(R.styleable.PinPadView_dynamicLength, false)) {
                int i3 = copydefault + 115;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    LengthMode lengthMode2 = LengthMode.DYNAMIC;
                    obj.hashCode();
                    throw null;
                }
                lengthMode = LengthMode.DYNAMIC;
                int i4 = 2 % 2;
            } else {
                lengthMode = LengthMode.STATIC;
            }
            this.lengthMode = lengthMode;
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.lengthMode == LengthMode.STATIC) {
            while (i2 < i) {
                this.dotsList.add(new PinPadDotView(context, null));
                this.binding.pinPadContainer.addView((View) CollectionsKt.last((List) this.dotsList));
                i2++;
                int i5 = component2 + 45;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/ui/widget/PinPadView$LengthMode;", "", "<init>", "(Ljava/lang/String;I)V", "STATIC", "DYNAMIC", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LengthMode {
        private static final EnumEntries $ENTRIES;
        private static final LengthMode[] $VALUES;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;
        public static final LengthMode STATIC = new LengthMode("STATIC", 0);
        public static final LengthMode DYNAMIC = new LengthMode("DYNAMIC", 1);

        private LengthMode(String str, int i) {
        }

        static {
            LengthMode[] lengthModeArr$values = $values();
            $VALUES = lengthModeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(lengthModeArr$values);
            int i = component1 + 1;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public static LengthMode valueOf(String str) {
            int i = 2 % 2;
            int i2 = component3 + 17;
            copydefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            LengthMode lengthMode = (LengthMode) Enum.valueOf(LengthMode.class, str);
            int i3 = component3 + 19;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return lengthMode;
            }
            obj.hashCode();
            throw null;
        }

        public static LengthMode[] values() {
            int i = 2 % 2;
            int i2 = component3 + 15;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            LengthMode[] lengthModeArr = (LengthMode[]) $VALUES.clone();
            int i4 = copydefault + 93;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return lengthModeArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final LengthMode[] $values() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 1;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            LengthMode[] lengthModeArr = {STATIC, DYNAMIC};
            int i5 = i2 + 87;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return lengthModeArr;
            }
            throw null;
        }

        public static EnumEntries<LengthMode> getEntries() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 19;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<LengthMode> enumEntries = $ENTRIES;
            int i5 = i2 + 89;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/ui/widget/PinPadView$Companion;", "", "<init>", "()V", "LOADING_DELAY", "", "DEFAULT_DOTS", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void setListener(PinPadListener listener) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(listener, "");
            this.listener = listener;
        } else {
            Intrinsics.checkNotNullParameter(listener, "");
            this.listener = listener;
            throw null;
        }
    }

    public final void selectDot() {
        int i = 2 % 2;
        if (this.hasError) {
            clearDots();
            this.hasError = false;
        }
        PinPadListener pinPadListener = null;
        if (this.lengthMode == LengthMode.DYNAMIC) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            PinPadDotView pinPadDotView = new PinPadDotView(context, null);
            this.dotsList.add(pinPadDotView);
            this.binding.pinPadContainer.addView(pinPadDotView);
            int i2 = copydefault + 109;
            component2 = i2 % 128;
            int i3 = i2 % 2;
        }
        int size = this.dotsList.size();
        int i4 = this.selectedDot;
        if (i4 < this.maxNumberOfDots) {
            int i5 = copydefault + 99;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            PinPadDotView pinPadDotView2 = this.dotsList.get(i4);
            Intrinsics.checkNotNullExpressionValue(pinPadDotView2, "");
            pinPadDotView2.selectDot();
            this.selectedDot++;
            notifyPinChange();
            if (!(!Intrinsics.areEqual(r2, CollectionsKt.last((List) this.dotsList))) && size == this.maxNumberOfDots) {
                PinPadListener pinPadListener2 = this.listener;
                if (pinPadListener2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i7 = component2 + 85;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    pinPadListener = pinPadListener2;
                }
                pinPadListener.onMaxPinReached();
                int i9 = component2 + 49;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
            }
        }
    }

    public final void clearDots() {
        int i = 2 % 2;
        if (this.lengthMode != LengthMode.DYNAMIC) {
            Iterator<PinPadDotView> it = this.dotsList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            int i2 = copydefault + 5;
            component2 = i2 % 128;
            while (true) {
                int i3 = i2 % 2;
                if (!it.hasNext()) {
                    break;
                }
                PinPadDotView next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                next.resetDot();
                i2 = component2 + 103;
                copydefault = i2 % 128;
            }
        } else {
            int i4 = component2 + 51;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                this.dotsList.clear();
                this.binding.pinPadContainer.removeAllViews();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.dotsList.clear();
            this.binding.pinPadContainer.removeAllViews();
        }
        this.selectedDot = 0;
        notifyPinChange();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void deselectDot() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = r4.selectedDot
            if (r1 <= 0) goto L59
            int r2 = com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView.component2
            int r2 = r2 + 97
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView.copydefault = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L28
            int r1 = r1 + 61
            r4.selectedDot = r1
            java.util.ArrayList<com.huawei.digitalpayment.consumer.base.ui.widget.PinPadDotView> r2 = r4.dotsList
            java.lang.Object r1 = r2.get(r1)
            com.huawei.digitalpayment.consumer.base.ui.widget.PinPadDotView r1 = (com.huawei.digitalpayment.consumer.base.ui.widget.PinPadDotView) r1
            r1.deselectDot()
            com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView$LengthMode r1 = r4.lengthMode
            com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView$LengthMode r2 = com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView.LengthMode.DYNAMIC
            if (r1 != r2) goto L4d
            goto L3d
        L28:
            int r1 = r1 + (-1)
            r4.selectedDot = r1
            java.util.ArrayList<com.huawei.digitalpayment.consumer.base.ui.widget.PinPadDotView> r2 = r4.dotsList
            java.lang.Object r1 = r2.get(r1)
            com.huawei.digitalpayment.consumer.base.ui.widget.PinPadDotView r1 = (com.huawei.digitalpayment.consumer.base.ui.widget.PinPadDotView) r1
            r1.deselectDot()
            com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView$LengthMode r1 = r4.lengthMode
            com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView$LengthMode r2 = com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView.LengthMode.DYNAMIC
            if (r1 != r2) goto L4d
        L3d:
            java.util.ArrayList<com.huawei.digitalpayment.consumer.base.ui.widget.PinPadDotView> r1 = r4.dotsList
            int r2 = r4.selectedDot
            r1.remove(r2)
            com.huawei.digitalpayment.consumer.baseui.databinding.LayoutPinPadBinding r1 = r4.binding
            android.widget.LinearLayout r1 = r1.pinPadContainer
            int r2 = r4.selectedDot
            r1.removeViewAt(r2)
        L4d:
            r4.notifyPinChange()
            int r1 = com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView.copydefault
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView.component2 = r2
            int r1 = r1 % r0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView.deselectDot():void");
    }

    public final void startLoadingAnimation() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.showingLoadingAnimation = true;
        Iterator<PinPadDotView> it = this.dotsList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        long j = 0;
        while (it.hasNext()) {
            PinPadDotView next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            final PinPadDotView pinPadDotView = next;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                private static int ShareDataUIState = 0;
                private static int component1 = 1;

                @Override
                public final void run() {
                    int i4 = 2 % 2;
                    int i5 = ShareDataUIState + 93;
                    component1 = i5 % 128;
                    if (i5 % 2 == 0) {
                        PinPadView.$r8$lambda$UofBbqEJJ0rCidYMpgc5PNisbLw(this.f$0, pinPadDotView);
                        int i6 = 1 / 0;
                    } else {
                        PinPadView.$r8$lambda$UofBbqEJJ0rCidYMpgc5PNisbLw(this.f$0, pinPadDotView);
                    }
                    int i7 = ShareDataUIState + 89;
                    component1 = i7 % 128;
                    int i8 = i7 % 2;
                }
            }, j);
            j += LOADING_DELAY;
        }
        int i4 = copydefault + 67;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void startLoadingAnimation$lambda$2(PinPadView pinPadView, PinPadDotView pinPadDotView) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pinPadView, "");
        Intrinsics.checkNotNullParameter(pinPadDotView, "");
        if (pinPadView.showingLoadingAnimation) {
            int i4 = copydefault + 85;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            pinPadDotView.playLoadingAnimation();
            if (i5 == 0) {
                int i6 = 82 / 0;
            }
        }
    }

    public final void showErrorAnimation() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.hasError = true;
        this.showingLoadingAnimation = false;
        Iterator<PinPadDotView> it = this.dotsList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            int i4 = component2 + 11;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                PinPadDotView next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                next.showError();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            PinPadDotView next2 = it.next();
            Intrinsics.checkNotNullExpressionValue(next2, "");
            next2.showError();
        }
        ((PinPadDotView) CollectionsKt.last((List) this.dotsList)).setErrorAnimationListener(new Function0() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = component2 + 69;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                Unit unit$r8$lambda$WwRUmE_sNORLuc2JMM94s9ZUUE0 = PinPadView.$r8$lambda$WwRUmE_sNORLuc2JMM94s9ZUUE0(this.f$0);
                int i8 = component1 + 35;
                component2 = i8 % 128;
                int i9 = i8 % 2;
                return unit$r8$lambda$WwRUmE_sNORLuc2JMM94s9ZUUE0;
            }
        });
    }

    private static final Unit showErrorAnimation$lambda$3(PinPadView pinPadView) {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        PinPadListener pinPadListener = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(pinPadView, "");
            PinPadListener pinPadListener2 = pinPadView.listener;
            throw null;
        }
        Intrinsics.checkNotNullParameter(pinPadView, "");
        PinPadListener pinPadListener3 = pinPadView.listener;
        if (pinPadListener3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = component2 + 29;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 5 / 5;
            }
        } else {
            pinPadListener = pinPadListener3;
        }
        pinPadListener.onErrorAnimationFinished();
        pinPadView.clearDots();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void notifyPinChange() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            java.util.ArrayList<com.huawei.digitalpayment.consumer.base.ui.widget.PinPadDotView> r1 = r8.dotsList
            int r1 = r1.size()
            int r2 = r8.minNumberOfDots
            int r3 = r8.maxNumberOfDots
            r4 = 1
            r5 = 0
            if (r1 > r3) goto L21
            if (r2 > r1) goto L21
            int r2 = com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView.copydefault
            int r2 = r2 + 109
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView.component2 = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L1f
            goto L2a
        L1f:
            r2 = r4
            goto L2b
        L21:
            int r2 = com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView.copydefault
            int r2 = r2 + 111
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView.component2 = r3
            int r2 = r2 % r0
        L2a:
            r2 = r5
        L2b:
            r3 = 0
            if (r2 == 0) goto L3f
            int r6 = com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView.copydefault
            int r6 = r6 + 5
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView.component2 = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L3e
            int r0 = r8.selectedDot
            if (r1 != r0) goto L3f
            goto L40
        L3e:
            throw r3
        L3f:
            r4 = r5
        L40:
            com.safaricom.mpesa.logging.L r0 = com.safaricom.mpesa.logging.L.INSTANCE
            int r1 = r8.selectedDot
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Pin has changed: { inRange: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = ", selectedIndex: "
            r6.append(r2)
            r6.append(r1)
            java.lang.String r1 = " }"
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r0.v(r1, r2)
            com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView$PinPadListener r0 = r8.listener
            if (r0 != 0) goto L6e
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            goto L6f
        L6e:
            r3 = r0
        L6f:
            r3.onPinChanged(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.ui.widget.PinPadView.notifyPinChange():void");
    }

    public static void $r8$lambda$UofBbqEJJ0rCidYMpgc5PNisbLw(PinPadView pinPadView, PinPadDotView pinPadDotView) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        startLoadingAnimation$lambda$2(pinPadView, pinPadDotView);
        int i4 = component2 + 47;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static Unit $r8$lambda$WwRUmE_sNORLuc2JMM94s9ZUUE0(PinPadView pinPadView) {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitShowErrorAnimation$lambda$3 = showErrorAnimation$lambda$3(pinPadView);
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return unitShowErrorAnimation$lambda$3;
    }

    static {
        int i = component3 + 121;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
