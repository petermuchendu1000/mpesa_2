package com.huawei.common.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.huawei.common.util.L;

public class Gloading {
    public static final int STATUS_EMPTY_DATA = 4;
    public static final int STATUS_LOADING = 1;
    public static final int STATUS_LOAD_FAILED = 3;
    public static final int STATUS_LOAD_SUCCESS = 2;
    private static volatile Gloading ShareDataUIState = null;
    private static final String component1 = "Gloading";
    private static boolean copydefault = false;
    private Adapter component2;

    public interface Adapter {
        View getView(Holder holder, View view, int i);
    }

    public static void debug(boolean z) {
        copydefault = z;
    }

    private Gloading() {
    }

    public static Gloading from(Adapter adapter) {
        Gloading gloading = new Gloading();
        gloading.component2 = adapter;
        return gloading;
    }

    public static Gloading getDefault() {
        if (ShareDataUIState == null) {
            synchronized (Gloading.class) {
                if (ShareDataUIState == null) {
                    ShareDataUIState = new Gloading();
                }
            }
        }
        return ShareDataUIState;
    }

    public static void initDefault(Adapter adapter) {
        getDefault().component2 = adapter;
    }

    public Holder wrap(Activity activity) {
        return new Holder(this.component2, activity, (ViewGroup) activity.findViewById(R.id.content));
    }

    public Holder wrap(View view) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            frameLayout.setLayoutParams(layoutParams);
        }
        if (view.getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            viewGroup.addView(frameLayout, iIndexOfChild);
        }
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        return new Holder(this.component2, view.getContext(), frameLayout);
    }

    public Holder cover(View view) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            L.e("view has no viewParent to show gloading as cover!");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        if (viewGroup != null) {
            viewGroup.addView(frameLayout, view.getLayoutParams());
        }
        return new Holder(this.component2, view.getContext(), frameLayout);
    }

    public static class Holder {
        private Context ShareDataUIState;
        private Adapter component1;
        private Object component2;
        private View component3;
        private int copydefault;
        private ViewGroup equals;
        private SparseArray<View> getAsAtTimestamp;
        private Runnable getRequestBeneficiariesState;

        private Holder(Adapter adapter, Context context, ViewGroup viewGroup) {
            this.getAsAtTimestamp = new SparseArray<>(4);
            this.ShareDataUIState = context;
            this.component1 = adapter;
            this.equals = viewGroup;
        }

        public Holder withRetry(Runnable runnable) {
            this.getRequestBeneficiariesState = runnable;
            return this;
        }

        public Holder withData(Object obj) {
            this.component2 = obj;
            return this;
        }

        public void showLoadSuccess() {
            showLoadingStatus(2);
        }

        public void showLoadFailed() {
            showLoadingStatus(3);
        }

        public void showLoading() {
            showLoadingStatus(1);
        }

        public void showEmpty() {
            showLoadingStatus(4);
        }

        public void showLoadingStatus(int i) {
            if (this.copydefault == i || !component2()) {
                return;
            }
            this.copydefault = i;
            View view = this.getAsAtTimestamp.get(i);
            if (view == null) {
                view = this.component3;
            }
            try {
                View view2 = this.component1.getView(this, view, i);
                if (view2 == null) {
                    L.d(Gloading.component1, this.component1.getClass().getName() + ".getView returns null");
                    return;
                }
                if (view2 != this.component3 || this.equals.indexOfChild(view2) < 0) {
                    View view3 = this.component3;
                    if (view3 != null) {
                        this.equals.removeView(view3);
                    }
                    view2.setElevation(Float.MAX_VALUE);
                    this.equals.addView(view2);
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                    }
                } else if (this.equals.indexOfChild(view2) != this.equals.getChildCount() - 1) {
                    view2.bringToFront();
                }
                this.component3 = view2;
                this.getAsAtTimestamp.put(i, view2);
            } catch (Exception e) {
                L.d(Gloading.component1, "showLoadingStatus: " + e.getMessage());
            }
        }

        private boolean component2() {
            if (this.component1 == null) {
                L.d(Gloading.component1, "Gloading.Adapter is not specified.");
            }
            if (this.ShareDataUIState == null) {
                L.d(Gloading.component1, "Context is null.");
            }
            if (this.equals == null) {
                L.d(Gloading.component1, "The mWrapper of loading status view is null.");
            }
            return (this.component1 == null || this.ShareDataUIState == null || this.equals == null) ? false : true;
        }

        public Context getContext() {
            return this.ShareDataUIState;
        }

        public ViewGroup getWrapper() {
            return this.equals;
        }

        public Runnable getRetryTask() {
            return this.getRequestBeneficiariesState;
        }

        public <T> T getData() {
            try {
                return (T) this.component2;
            } catch (Exception e) {
                L.d(Gloading.component1, "getData: " + e.getMessage());
                return null;
            }
        }
    }
}
