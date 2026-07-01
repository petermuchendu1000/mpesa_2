package com.huawei.digitalpayment.consumer.base.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huawei.common.util.AssetsReadUtils;
import com.huawei.common.widget.blur.BlurView;
import com.huawei.digitalpayment.consumer.base.widget.TextBlurView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public class MaskBlurUtils {
    public static final String IS_BACKGROUND_BLUR = "backgroundBlur";
    public static final String IS_BACKGROUND_BLUR_LEVEL = "backgroundBlurLevel";
    public static final String MASK_VIEW = "mastView";
    private static final String ShareDataUIState = "MaskBlurUtils";
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    public static final List<String> translucentActivityNames = Collections.unmodifiableList(new ArrayList());

    static {
        int i = component1 + 105;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static void addTranslucentActivityName(String str) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            translucentActivityNames.contains(str);
            throw null;
        }
        List<String> list = translucentActivityNames;
        if (list.contains(str)) {
            return;
        }
        list.add(str);
        int i3 = copydefault + 119;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 % 2;
        }
    }

    public static void addMask(Context context) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (component1()) {
            int i4 = copydefault + 73;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            Activity activityComponent1 = component1(context);
            if (activityComponent1 != null) {
                addMask((ViewGroup) activityComponent1.findViewById(R.id.content));
            }
        }
        int i6 = component2 + 101;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    public static void addMask(final ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            removeMask(viewGroup);
            int measuredWidth = viewGroup.getMeasuredWidth();
            int measuredHeight = viewGroup.getMeasuredHeight();
            if (measuredWidth <= 0 || measuredHeight <= 0) {
                viewGroup.post(new Runnable() {
                    private static int component1 = 1;
                    private static int component3;

                    @Override
                    public final void run() {
                        int i3 = 2 % 2;
                        int i4 = component3 + 107;
                        component1 = i4 % 128;
                        int i5 = i4 % 2;
                        MaskBlurUtils.component2(viewGroup);
                        int i6 = component3 + 7;
                        component1 = i6 % 128;
                        if (i6 % 2 != 0) {
                            return;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                });
                return;
            }
            BlurView blurView = new BlurView(viewGroup.getContext());
            blurView.setBlurRadius(ShareDataUIState());
            viewGroup.addView(blurView, new ViewGroup.LayoutParams(measuredWidth, measuredHeight));
            blurView.setTag("mastView");
            int i3 = copydefault + 81;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        removeMask(viewGroup);
        viewGroup.getMeasuredWidth();
        viewGroup.getMeasuredHeight();
        throw null;
    }

    static void component2(ViewGroup viewGroup) {
        int i = 2 % 2;
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        if (measuredWidth > 0) {
            int i2 = copydefault + 9;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            if (measuredHeight > 0) {
                BlurView blurView = new BlurView(viewGroup.getContext());
                blurView.setBlurRadius(ShareDataUIState());
                viewGroup.addView(blurView, new ViewGroup.LayoutParams(measuredWidth, measuredHeight));
                blurView.setTag("mastView");
                int i4 = copydefault + 29;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    public static void addOneMask(final ViewGroup viewGroup, final TextView textView, final int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 95;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (viewGroup.findViewWithTag("mastView") == null) {
            int measuredWidth = viewGroup.getMeasuredWidth();
            int measuredHeight = viewGroup.getMeasuredHeight();
            if (measuredWidth <= 0 || measuredHeight <= 0) {
                viewGroup.post(new Runnable() {
                    private static int component1 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final void run() {
                        int i5 = 2 % 2;
                        int i6 = copydefault + 15;
                        component1 = i6 % 128;
                        int i7 = i6 % 2;
                        MaskBlurUtils.component1(viewGroup, textView, i);
                        int i8 = copydefault + 95;
                        component1 = i8 % 128;
                        if (i8 % 2 != 0) {
                            throw null;
                        }
                    }
                });
                return;
            }
            TextBlurView textBlurView = new TextBlurView(viewGroup.getContext(), textView, i);
            textBlurView.setBlurRadius(ShareDataUIState());
            viewGroup.addView(textBlurView, new ViewGroup.LayoutParams(measuredWidth, measuredHeight));
            textBlurView.setTag("mastView");
            return;
        }
        int i5 = component2 + 45;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    static void component1(ViewGroup viewGroup, TextView textView, int i) {
        int i2 = 2 % 2;
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        if (measuredWidth > 0) {
            int i3 = component2 + 29;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (measuredHeight > 0) {
                TextBlurView textBlurView = new TextBlurView(viewGroup.getContext(), textView, i);
                textBlurView.setBlurRadius(ShareDataUIState());
                viewGroup.addView(textBlurView, new ViewGroup.LayoutParams(measuredWidth, measuredHeight));
                textBlurView.setTag("mastView");
            }
        }
        int i4 = copydefault + 113;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void ShareDataUIState(ViewGroup viewGroup, float f) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        if (measuredWidth > 0) {
            int i4 = copydefault + 3;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (measuredHeight > 0) {
                BlurView blurView = new BlurView(viewGroup.getContext());
                blurView.setBlurRadius(f);
                viewGroup.addView(blurView, new ViewGroup.LayoutParams(measuredWidth, -1));
                blurView.setTag("mastView");
            }
        }
    }

    public static void addMask(final ViewGroup viewGroup, final float f, int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 117;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            removeMask(viewGroup);
            throw null;
        }
        removeMask(viewGroup);
        if (i <= 0) {
            viewGroup.post(new Runnable() {
                private static int component2 = 0;
                private static int copydefault = 1;

                @Override
                public final void run() {
                    int i4 = 2 % 2;
                    int i5 = copydefault + 9;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    MaskBlurUtils.ShareDataUIState(viewGroup, f);
                    int i7 = copydefault + 11;
                    component2 = i7 % 128;
                    int i8 = i7 % 2;
                }
            });
            return;
        }
        BlurView blurView = new BlurView(viewGroup.getContext());
        blurView.setBlurRadius(f);
        viewGroup.addView(blurView, new ViewGroup.LayoutParams(i, -1));
        blurView.setTag("mastView");
        int i4 = copydefault + 87;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void addMask(final ViewGroup viewGroup, final int i) {
        int i2 = 2 % 2;
        removeMask(viewGroup);
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        if (measuredWidth > 0) {
            if (measuredHeight <= 0) {
                int i3 = component2 + 65;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 3 % 3;
                }
            } else {
                BlurView blurView = new BlurView(viewGroup.getContext());
                blurView.setBlurRadius(ShareDataUIState());
                blurView.setOverlayColor(i);
                viewGroup.addView(blurView, new ViewGroup.LayoutParams(measuredWidth, measuredHeight));
                blurView.setTag("mastView");
                int i5 = component2 + 77;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        viewGroup.post(new Runnable() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void run() {
                int i6 = 2 % 2;
                int i7 = component3 + 115;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                MaskBlurUtils.component1(viewGroup, i);
                int i9 = component3 + 19;
                copydefault = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 94 / 0;
                }
            }
        });
    }

    static void component1(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 25;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        if (measuredWidth > 0) {
            int i5 = copydefault + 63;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            if (measuredHeight > 0) {
                BlurView blurView = new BlurView(viewGroup.getContext());
                blurView.setBlurRadius(ShareDataUIState());
                blurView.setOverlayColor(i);
                viewGroup.addView(blurView, new ViewGroup.LayoutParams(measuredWidth, measuredHeight));
                blurView.setTag("mastView");
                int i7 = copydefault + 59;
                component2 = i7 % 128;
                int i8 = i7 % 2;
            }
        }
    }

    public static void removeMask(Context context) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Activity activityComponent1 = component1(context);
        if (activityComponent1 != null) {
            removeMask((ViewGroup) activityComponent1.findViewById(R.id.content));
            int i4 = copydefault + 37;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 3;
            }
        }
    }

    public static void removeMask(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewWithTag = viewGroup.findViewWithTag("mastView");
        if (viewFindViewWithTag != null) {
            viewGroup.removeView(viewFindViewWithTag);
        }
        int i4 = component2 + 99;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
    }

    private static boolean component1() {
        int i = 2 % 2;
        boolean zOptBoolean = false;
        try {
            zOptBoolean = new JSONObject(AssetsReadUtils.parseFile("dialog_config.json")).optBoolean("backgroundBlur", false);
            int i2 = copydefault + 21;
            component2 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception unused) {
        }
        return zOptBoolean;
    }

    private static float ShareDataUIState() {
        int i = 2 % 2;
        try {
            float fOptInt = new JSONObject(AssetsReadUtils.parseFile("dialog_config.json")).optInt("backgroundBlurLevel", 18);
            int i2 = copydefault + 39;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return fOptInt;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            return 18.0f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.app.Activity component1(android.content.Context r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.util.MaskBlurUtils.copydefault
            int r2 = r1 + 121
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.base.util.MaskBlurUtils.component2 = r3
            int r2 = r2 % r0
            r2 = 0
            if (r6 != 0) goto L10
            goto L4e
        L10:
            boolean r4 = r6 instanceof android.app.Activity
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == r5) goto L29
            int r1 = r1 + 49
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.base.util.MaskBlurUtils.component2 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L26
            android.app.Activity r6 = (android.app.Activity) r6
            r1 = 34
            int r1 = r1 / 0
            goto L4f
        L26:
            android.app.Activity r6 = (android.app.Activity) r6
            goto L4f
        L29:
            boolean r1 = r6 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L4e
            int r3 = r3 + 101
            int r1 = r3 % 128
            com.huawei.digitalpayment.consumer.base.util.MaskBlurUtils.copydefault = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L41
            android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
            android.content.Context r6 = r6.getBaseContext()
            android.app.Activity r6 = component1(r6)
            goto L4f
        L41:
            android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
            android.content.Context r6 = r6.getBaseContext()
            component1(r6)
            r2.hashCode()
            throw r2
        L4e:
            r6 = r2
        L4f:
            if (r6 != 0) goto L5b
            int r6 = com.huawei.digitalpayment.consumer.base.util.MaskBlurUtils.component2
            int r6 = r6 + 79
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.base.util.MaskBlurUtils.copydefault = r1
            int r6 = r6 % r0
            return r2
        L5b:
            boolean r1 = component2(r6)
            if (r1 == 0) goto L85
            int r1 = com.huawei.digitalpayment.consumer.base.util.MaskBlurUtils.copydefault
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.util.MaskBlurUtils.component2 = r2
            int r1 = r1 % r0
            java.util.List r0 = com.blankj.utilcode.util.ActivityUtils.getActivityList()
            java.util.Iterator r0 = r0.iterator()
        L72:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r0.next()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = component2(r1)
            if (r2 != 0) goto L72
            r6 = r1
        L85:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.MaskBlurUtils.component1(android.content.Context):android.app.Activity");
    }

    private static boolean component2(Activity activity) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (((ViewGroup) activity.findViewById(R.id.content)).getChildCount() != 0) {
            return translucentActivityNames.contains(activity.getClass().getSimpleName());
        }
        int i4 = component2;
        int i5 = i4 + 5;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 11;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 5 % 4;
        }
        return true;
    }
}
