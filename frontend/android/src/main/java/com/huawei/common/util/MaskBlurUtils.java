package com.huawei.common.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.common.widget.blur.BlurView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

public class MaskBlurUtils {
    public static final String IS_BACKGROUND_BLUR = "backgroundBlur";
    public static final String IS_BACKGROUND_BLUR_LEVEL = "backgroundBlurLevel";
    public static final String MASK_VIEW = "mastView";
    private static final String copydefault = "MaskBlurUtils";
    public static final List<String> translucentActivityNames = Collections.unmodifiableList(new ArrayList());

    public static void addTranslucentActivityName(String str) {
        List<String> list = translucentActivityNames;
        if (list.contains(str)) {
            return;
        }
        list.add(str);
    }

    public static void addMask(Context context) {
        Activity activityCopydefault;
        if (ShareDataUIState() && (activityCopydefault = copydefault(context)) != null) {
            addMask((ViewGroup) activityCopydefault.findViewById(R.id.content));
        }
    }

    public static void addMask(ViewGroup viewGroup) {
        removeMask(viewGroup);
        BlurView blurView = new BlurView(viewGroup.getContext());
        blurView.setBlurRadius(component2());
        viewGroup.addView(blurView, new ViewGroup.LayoutParams(-1, -1));
        blurView.setTag("mastView");
    }

    public static void removeMask(Context context) {
        Activity activityCopydefault = copydefault(context);
        if (activityCopydefault != null) {
            removeMask((ViewGroup) activityCopydefault.findViewById(R.id.content));
        }
    }

    public static void removeMask(ViewGroup viewGroup) {
        View viewFindViewWithTag = viewGroup.findViewWithTag("mastView");
        if (viewFindViewWithTag != null) {
            viewGroup.removeView(viewFindViewWithTag);
        }
    }

    private static boolean ShareDataUIState() {
        try {
            return new JSONObject(AssetsReadUtils.parseFile("dialog_config.json")).optBoolean("backgroundBlur", false);
        } catch (Exception unused) {
            return false;
        }
    }

    private static float component2() {
        try {
            return new JSONObject(AssetsReadUtils.parseFile("dialog_config.json")).optInt("backgroundBlurLevel", 18);
        } catch (Exception unused) {
            return 18.0f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.app.Activity copydefault(android.content.Context r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            goto L1a
        L4:
            boolean r1 = r3 instanceof android.app.Activity
            if (r1 == 0) goto Lb
            android.app.Activity r3 = (android.app.Activity) r3
            goto L1b
        Lb:
            boolean r1 = r3 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L1a
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            android.app.Activity r3 = copydefault(r3)
            goto L1b
        L1a:
            r3 = r0
        L1b:
            if (r3 != 0) goto L1e
            return r0
        L1e:
            boolean r0 = component3(r3)
            if (r0 == 0) goto L3f
            java.util.List r0 = com.blankj.utilcode.util.ActivityUtils.getActivityList()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = component3(r1)
            if (r2 != 0) goto L2c
            r3 = r1
        L3f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.util.MaskBlurUtils.copydefault(android.content.Context):android.app.Activity");
    }

    private static boolean component3(Activity activity) {
        if (((ViewGroup) activity.findViewById(R.id.content)).getChildCount() == 0) {
            return true;
        }
        return translucentActivityNames.contains(activity.getClass().getSimpleName());
    }
}
