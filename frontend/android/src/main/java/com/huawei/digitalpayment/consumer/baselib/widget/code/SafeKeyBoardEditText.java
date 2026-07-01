package com.huawei.digitalpayment.consumer.baselib.widget.code;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatEditText;
import com.blankj.utilcode.util.KeyboardUtils;
import com.huawei.digitalpayment.consumer.baselib.widget.code.VirtualKeyboardView;

@Deprecated
public class SafeKeyBoardEditText extends AppCompatEditText implements View.OnKeyListener {
    private static int component3 = 0;
    private static int copydefault = 1;
    private GestureDetector gestureDetector;
    protected Activity mActivity;
    private View mContentView;
    private View mDecorView;
    private PopupWindow mKeyboardPopupWindow;
    private VirtualKeyboardView mVirtualKeyboardView;
    private Window mWindow;
    private int scrollDis;

    public SafeKeyBoardEditText(Context context) {
        this(context, null);
    }

    public SafeKeyBoardEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scrollDis = 0;
        this.mActivity = getActivity(context);
        initKeyboard(context);
        initEvent();
    }

    private void initEvent() {
        int i = 2 % 2;
        setCustomSelectionActionModeCallback(new ActionMode.Callback(this) {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 43;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 11;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 68 / 0;
                }
                return false;
            }

            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                int i2 = 2 % 2;
                int i3 = copydefault + 125;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {
                int i2 = 2 % 2;
                int i3 = copydefault + 89;
                component1 = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 85;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 121;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
        });
        initGestureDetector();
        setLongClickable(false);
        setImeOptions(268435456);
        setOnTouchListener(new View.OnTouchListener() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i2 = 2 % 2;
                int i3 = component2 + 67;
                ShareDataUIState = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    SafeKeyBoardEditText.$r8$lambda$FEtohsJrEJiEt9cG_LcXM3eMxRc(this.f$0, view, motionEvent);
                    obj.hashCode();
                    throw null;
                }
                boolean z$r8$lambda$FEtohsJrEJiEt9cG_LcXM3eMxRc = SafeKeyBoardEditText.$r8$lambda$FEtohsJrEJiEt9cG_LcXM3eMxRc(this.f$0, view, motionEvent);
                int i4 = component2 + 25;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return z$r8$lambda$FEtohsJrEJiEt9cG_LcXM3eMxRc;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component3 + 67;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private boolean lambda$initEvent$0(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        view.requestFocus();
        this.gestureDetector.onTouchEvent(motionEvent);
        int i4 = component3 + 17;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void initGestureDetector() {
        int i = 2 % 2;
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                int i2 = 2 % 2;
                int i3 = component2 + 47;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                SafeKeyBoardEditText.this.showKeyboard();
                boolean zOnSingleTapUp = super.onSingleTapUp(motionEvent);
                int i5 = ShareDataUIState + 121;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 86 / 0;
                }
                return zOnSingleTapUp;
            }
        });
        int i2 = component3 + 49;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = 2 % 2;
        super.onFocusChanged(z, i, rect);
        if (z) {
            int i3 = component3 + 83;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            showKeyboard();
        } else {
            hideKeyboard();
        }
        int i5 = component3 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    private void lambda$initKeyboard$1() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.mKeyboardPopupWindow.dismiss();
            clearFocus();
        } else {
            this.mKeyboardPopupWindow.dismiss();
            clearFocus();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private void lambda$initKeyboard$2() {
        View view;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.scrollDis;
        if (i5 <= 0 || (view = this.mContentView) == null) {
            return;
        }
        int i6 = i2 + 47;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        view.scrollBy(0, -i5);
        int i8 = copydefault + 95;
        component3 = i8 % 128;
        int i9 = i8 % 2;
    }

    private void initKeyboard(Context context) {
        int i = 2 % 2;
        setShowSoftInputOnFocus(false);
        setOnKeyListener(this);
        VirtualKeyboardView virtualKeyboardView = new VirtualKeyboardView(context);
        this.mVirtualKeyboardView = virtualKeyboardView;
        virtualKeyboardView.setEditText(this);
        this.mVirtualKeyboardView.setOnVirtualKeyboardFinish(new VirtualKeyboardView.OnVirtualKeyboardFinish() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onFinish() {
                int i2 = 2 % 2;
                int i3 = copydefault + 69;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                SafeKeyBoardEditText.$r8$lambda$4PPzEOj6Vu8Zr_k9VeWTrg1rLSw(this.f$0);
                if (i4 == 0) {
                    int i5 = 62 / 0;
                }
            }
        });
        this.mVirtualKeyboardView.post(new Runnable() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void run() {
                int i2 = 2 % 2;
                int i3 = copydefault + 87;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                SafeKeyBoardEditText.m10247$r8$lambda$zu5fH9hit69v4zMIgg1yBqurNU(this.f$0);
                int i5 = component3 + 59;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        this.mKeyboardPopupWindow = new PopupWindow((View) this.mVirtualKeyboardView, -1, -2, false);
        PopNoRecordProxy.instance().noScreenRecord(this.mKeyboardPopupWindow);
        this.mKeyboardPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final void onDismiss() {
                int i2 = 2 % 2;
                int i3 = component1 + 61;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    SafeKeyBoardEditText.$r8$lambda$vW13pmjS7S1FDoCjGbPq7OBH3go(this.f$0);
                    obj.hashCode();
                    throw null;
                }
                SafeKeyBoardEditText.$r8$lambda$vW13pmjS7S1FDoCjGbPq7OBH3go(this.f$0);
                int i4 = component1 + 21;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }
        });
        this.mKeyboardPopupWindow.setBackgroundDrawable(new ColorDrawable(0));
        int i2 = component3 + 99;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void showKeyboard() {
        PopupWindow popupWindow;
        View view;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = copydefault;
        int i5 = i4 + 113;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        if (this.mDecorView != null) {
            int i7 = i4 + 17;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            PopupWindow popupWindow2 = this.mKeyboardPopupWindow;
            if (popupWindow2 == null || popupWindow2.isShowing()) {
                return;
            }
            int i9 = copydefault + 113;
            component3 = i9 % 128;
            if (i9 % 2 != 0) {
                KeyboardUtils.hideSoftInput(this.mActivity);
                popupWindow = this.mKeyboardPopupWindow;
                view = this.mDecorView;
                i = 38;
                i2 = 1;
            } else {
                KeyboardUtils.hideSoftInput(this.mActivity);
                popupWindow = this.mKeyboardPopupWindow;
                view = this.mDecorView;
                i = 80;
                i2 = 0;
            }
            popupWindow.showAtLocation(view, i, i2, i2);
            moveUpLayout();
        }
    }

    public void isShuffleKeyboard(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.mVirtualKeyboardView.isShuffleKeyboard(z);
        int i4 = component3 + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private void moveUpLayout() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (this.mDecorView != null) {
            int i5 = i2 + 99;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            if (this.mContentView != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.mDecorView.getWindowVisibleDisplayFrame(rect);
                int measuredHeight = (iArr[1] + getMeasuredHeight()) - (rect.bottom - this.mVirtualKeyboardView.getHeight());
                this.scrollDis = measuredHeight;
                if (measuredHeight > 0) {
                    int i7 = component3 + 117;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                    this.mContentView.scrollBy(0, measuredHeight);
                    int i9 = component3 + 81;
                    copydefault = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
        }
    }

    public void hideKeyboard() {
        int i = 2 % 2;
        PopupWindow popupWindow = this.mKeyboardPopupWindow;
        if (popupWindow != null) {
            int i2 = copydefault + 53;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                if (popupWindow.isShowing()) {
                    this.mKeyboardPopupWindow.dismiss();
                }
            } else {
                popupWindow.isShowing();
                throw null;
            }
        }
        int i3 = component3 + 73;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super.onAttachedToWindow();
            getActivity(getContext());
            throw null;
        }
        super.onAttachedToWindow();
        Activity activity = getActivity(getContext());
        if (activity != null) {
            int i3 = component3 + 55;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                Window window = activity.getWindow();
                this.mWindow = window;
                this.mDecorView = window.getDecorView();
                this.mContentView = this.mWindow.findViewById(R.id.content);
                return;
            }
            Window window2 = activity.getWindow();
            this.mWindow = window2;
            this.mDecorView = window2.getDecorView();
            this.mContentView = this.mWindow.findViewById(R.id.content);
            obj.hashCode();
            throw null;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromWindow();
        hideKeyboard();
        this.mKeyboardPopupWindow = null;
        this.mVirtualKeyboardView = null;
        this.mDecorView = null;
        this.mContentView = null;
        this.mWindow = null;
        int i4 = copydefault + 9;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static Activity getActivity(Context context) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (context == null) {
            return null;
        }
        if (!(!(context instanceof Activity))) {
            Activity activity = (Activity) context;
            int i5 = i2 + 111;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return activity;
        }
        if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Override
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        if (i != 4) {
            return false;
        }
        int i3 = component3 + 17;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
        } else if (keyEvent.getAction() != 1) {
            return false;
        }
        if (!(!this.mKeyboardPopupWindow.isShowing())) {
            hideKeyboard();
            int i4 = component3 + 81;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            Activity activity = this.mActivity;
            if (activity != null) {
                int i6 = component3 + 105;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                activity.onBackPressed();
            }
        }
        return true;
    }

    public static void $r8$lambda$4PPzEOj6Vu8Zr_k9VeWTrg1rLSw(SafeKeyBoardEditText safeKeyBoardEditText) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        safeKeyBoardEditText.lambda$initKeyboard$1();
        int i4 = component3 + 21;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static boolean $r8$lambda$FEtohsJrEJiEt9cG_LcXM3eMxRc(SafeKeyBoardEditText safeKeyBoardEditText, View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zLambda$initEvent$0 = safeKeyBoardEditText.lambda$initEvent$0(view, motionEvent);
        int i4 = component3 + 49;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return zLambda$initEvent$0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$vW13pmjS7S1FDoCjGbPq7OBH3go(SafeKeyBoardEditText safeKeyBoardEditText) {
        int i = 2 % 2;
        int i2 = component3 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        safeKeyBoardEditText.lambda$initKeyboard$2();
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        int i5 = copydefault + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void m10247$r8$lambda$zu5fH9hit69v4zMIgg1yBqurNU(SafeKeyBoardEditText safeKeyBoardEditText) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        safeKeyBoardEditText.moveUpLayout();
        if (i3 != 0) {
            throw null;
        }
        int i4 = component3 + 21;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
