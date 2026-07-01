package com.huawei.common.widget;

import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Editable;
import android.text.GetChars;
import android.text.NoCopySpan;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
import android.text.style.UpdateLayout;
import android.view.View;
import java.lang.ref.WeakReference;

public class NoWaitPasswordTransformationMethod implements TransformationMethod, TextWatcher {
    public static final int DEFAULT_DELAY_HIDE_TIME = 0;
    public static final char DEFAULT_DOT = 9679;
    public static final char DEFAULT_SMALL_DOT = 8226;
    public static final char STAR = '*';
    static final int ShareDataUIState = 8;
    private int component2;
    private char component3;
    static final Object copydefault = new NoCopySpan.Concrete();
    static final Object component1 = new NoCopySpan.Concrete();

    @Override
    public void afterTextChanged(Editable editable) {
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public NoWaitPasswordTransformationMethod() {
        this.component3 = DEFAULT_DOT;
        this.component2 = 0;
    }

    public NoWaitPasswordTransformationMethod(char c2, int i) {
        this.component3 = c2;
        this.component2 = i;
    }

    public static NoWaitPasswordTransformationMethod getInstance() {
        return new NoWaitPasswordTransformationMethod();
    }

    private static <T> void ShareDataUIState(Spannable spannable, Class<T> cls) {
        for (Object obj : spannable.getSpans(0, spannable.length(), cls)) {
            spannable.removeSpan(obj);
        }
    }

    @Override
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            ShareDataUIState(spannable, ShareDataUIState.class);
            ShareDataUIState(spannable, component3.class);
            spannable.setSpan(new ShareDataUIState(view), 0, 0, 34);
        }
        return new component2(this.component3, charSequence);
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            ShareDataUIState[] shareDataUIStateArr = (ShareDataUIState[]) spannable.getSpans(0, charSequence.length(), ShareDataUIState.class);
            if (shareDataUIStateArr.length == 0) {
                return;
            }
            View view = null;
            for (int i4 = 0; view == null && i4 < shareDataUIStateArr.length; i4++) {
                view = (View) shareDataUIStateArr[i4].get();
            }
            if (view != null) {
                ShareDataUIState(spannable, component3.class);
            }
        }
    }

    @Override
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        if (!z && (charSequence instanceof Spannable)) {
            ShareDataUIState((Spannable) charSequence, component3.class);
        }
    }

    static class component2 implements CharSequence, GetChars {
        private final char ShareDataUIState;
        private CharSequence component1;

        public component2(char c2, CharSequence charSequence) {
            this.ShareDataUIState = c2;
            this.component1 = charSequence;
        }

        @Override
        public int length() {
            return this.component1.length();
        }

        @Override
        public char charAt(int i) {
            CharSequence charSequence = this.component1;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                int spanStart = spanned.getSpanStart(NoWaitPasswordTransformationMethod.copydefault);
                int spanEnd = spanned.getSpanEnd(NoWaitPasswordTransformationMethod.copydefault);
                if (i >= spanStart && i < spanEnd) {
                    return this.component1.charAt(i);
                }
                Character chShareDataUIState = ShareDataUIState(i, spanned, (component3[]) spanned.getSpans(0, spanned.length(), component3.class));
                if (chShareDataUIState != null) {
                    return chShareDataUIState.charValue();
                }
            }
            return this.ShareDataUIState;
        }

        private Character ShareDataUIState(int i, Spanned spanned, component3[] component3VarArr) {
            for (int i2 = 0; i2 < component3VarArr.length; i2++) {
                Character chComponent1 = component1(i, spanned, component3VarArr, i2);
                if (chComponent1 != null) {
                    return chComponent1;
                }
            }
            return null;
        }

        private Character component1(int i, Spanned spanned, component3[] component3VarArr, int i2) {
            if (spanned.getSpanStart(component3VarArr[i2].component3) < 0) {
                return null;
            }
            int spanStart = spanned.getSpanStart(component3VarArr[i2]);
            int spanEnd = spanned.getSpanEnd(component3VarArr[i2]);
            if (i < spanStart || i >= spanEnd) {
                return null;
            }
            return Character.valueOf(this.component1.charAt(i));
        }

        @Override
        public CharSequence subSequence(int i, int i2) {
            char[] cArr = new char[i2 - i];
            getChars(i, i2, cArr, 0);
            return new String(cArr);
        }

        @Override
        public String toString() {
            return subSequence(0, length()).toString();
        }

        @Override
        public void getChars(int i, int i2, char[] cArr, int i3) {
            TextUtils.getChars(this.component1, i, i2, cArr, i3);
            CharSequence charSequence = this.component1;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                int spanStart = spanned.getSpanStart(NoWaitPasswordTransformationMethod.copydefault);
                int spanEnd = spanned.getSpanEnd(NoWaitPasswordTransformationMethod.copydefault);
                component3[] component3VarArr = (component3[]) spanned.getSpans(0, spanned.length(), component3.class);
                int length = component3VarArr.length;
                int[] iArr = new int[length];
                int[] iArr2 = new int[length];
                for (int i4 = 0; i4 < length; i4++) {
                    if (spanned.getSpanStart(component3VarArr[i4].component3) >= 0) {
                        iArr[i4] = spanned.getSpanStart(component3VarArr[i4]);
                        iArr2[i4] = spanned.getSpanEnd(component3VarArr[i4]);
                    }
                }
                int i5 = i;
                while (i5 < i2) {
                    int i6 = i5;
                    int[] iArr3 = iArr2;
                    component2(i, cArr, i3, spanStart, spanEnd, length, iArr, iArr3, i6);
                    i5 = i6 + 1;
                    iArr2 = iArr3;
                    iArr = iArr;
                    length = length;
                }
            }
        }

        private void component2(int i, char[] cArr, int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2, int i6) {
            if (i6 < i3 || i6 >= i4) {
                component1(i, cArr, i2, i5, iArr, iArr2, i6);
            }
        }

        private void component1(int i, char[] cArr, int i2, int i3, int[] iArr, int[] iArr2, int i4) {
            for (int i5 = 0; i5 < i3; i5++) {
                if (i4 >= iArr[i5] && i4 < iArr2[i5]) {
                    return;
                }
            }
            cArr[(i4 - i) + i2] = this.ShareDataUIState;
        }
    }

    static class component3 extends Handler implements UpdateLayout, Runnable {
        private final Spannable ShareDataUIState;
        private final NoWaitPasswordTransformationMethod component3;

        public component3(Spannable spannable, NoWaitPasswordTransformationMethod noWaitPasswordTransformationMethod) {
            this.ShareDataUIState = spannable;
            this.component3 = noWaitPasswordTransformationMethod;
            postAtTime(this, SystemClock.uptimeMillis() + ((long) noWaitPasswordTransformationMethod.component2));
        }

        @Override
        public void run() {
            this.ShareDataUIState.removeSpan(this);
        }
    }

    static class ShareDataUIState extends WeakReference<View> implements NoCopySpan {
        public ShareDataUIState(View view) {
            super(view);
        }
    }
}
