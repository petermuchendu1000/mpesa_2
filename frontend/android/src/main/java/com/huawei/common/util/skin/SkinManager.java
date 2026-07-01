package com.huawei.common.util.skin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.blankj.utilcode.util.ColorUtils;
import com.dynatrace.android.agent.Global;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.common.R;
import com.huawei.common.widget.code.CodeWithErrorInputView;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u000bH\u0002J\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000bJ,\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\u000bH\u0007J\"\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u0019\u001a\u00060\u001aR\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/common/util/skin/SkinManager;", "", "<init>", "()V", "onCreateView", "", "view", "Landroid/view/View;", "attributeSet", "Landroid/util/AttributeSet;", "getColorByAttrValue", "", "context", "Landroid/content/Context;", IpcMessageConstants.EXTRA_ATTR_VALUE, "", "getColor", GriverCacheDao.COLUMN_CACHE_ID, "getRealResourceId", "resId", "typedArray", "Landroid/content/res/TypedArray;", FirebaseAnalytics.Param.INDEX, "defValue", "getAttrColor", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "resid", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SkinManager {
    public static final SkinManager INSTANCE = new SkinManager();

    private SkinManager() {
    }

    public final void onCreateView(View view, AttributeSet attributeSet) {
        boolean z;
        if (view == null || attributeSet == null || attributeSet.getAttributeCount() == 0 || view.getTag(R.id.is_replace_color) != null) {
            return;
        }
        view.setTag(R.id.is_replace_color, true);
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = attributeSet.getAttributeName(i);
            if (Intrinsics.areEqual(CdpConstants.CONTENT_TEXT_COLOR, attributeName) && (((z = view instanceof TextView)) || (view instanceof CodeWithErrorInputView))) {
                String attributeValue = attributeSet.getAttributeValue(i);
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                Intrinsics.checkNotNull(attributeValue);
                int colorByAttrValue = getColorByAttrValue(context, attributeValue);
                if (colorByAttrValue != -1) {
                    if (z) {
                        ((TextView) view).setTextColor(colorByAttrValue);
                    } else if (view instanceof CodeWithErrorInputView) {
                        ((CodeWithErrorInputView) view).getCodeInputView().setTextColor(colorByAttrValue);
                    }
                }
            } else if (Intrinsics.areEqual("textColorHint", attributeName) && (view instanceof TextView)) {
                String attributeValue2 = attributeSet.getAttributeValue(i);
                TextView textView = (TextView) view;
                Context context2 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                Intrinsics.checkNotNull(attributeValue2);
                int colorByAttrValue2 = getColorByAttrValue(context2, attributeValue2);
                if (colorByAttrValue2 != -1) {
                    textView.setHintTextColor(colorByAttrValue2);
                }
            } else if (Intrinsics.areEqual("drawableTint", attributeName) && (view instanceof TextView)) {
                String attributeValue3 = attributeSet.getAttributeValue(i);
                TextView textView2 = (TextView) view;
                Context context3 = textView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                Intrinsics.checkNotNull(attributeValue3);
                int colorByAttrValue3 = getColorByAttrValue(context3, attributeValue3);
                if (colorByAttrValue3 != -1) {
                    TextViewCompat.setCompoundDrawableTintList(textView2, ColorStateList.valueOf(colorByAttrValue3));
                }
            } else if (Intrinsics.areEqual("tint", attributeName) && (view instanceof ImageView)) {
                String attributeValue4 = attributeSet.getAttributeValue(i);
                ImageView imageView = (ImageView) view;
                Context context4 = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                Intrinsics.checkNotNull(attributeValue4);
                int colorByAttrValue4 = getColorByAttrValue(context4, attributeValue4);
                if (colorByAttrValue4 != -1) {
                    imageView.setImageTintList(ColorStateList.valueOf(colorByAttrValue4));
                }
            } else if (Intrinsics.areEqual("background", attributeName)) {
                String attributeValue5 = attributeSet.getAttributeValue(i);
                Context context5 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                Intrinsics.checkNotNull(attributeValue5);
                int colorByAttrValue5 = getColorByAttrValue(context5, attributeValue5);
                if (colorByAttrValue5 != -1) {
                    view.setBackground(new ColorDrawable(colorByAttrValue5));
                }
            }
        }
    }

    public final int getColorByAttrValue(Context context, String attrValue) {
        String resourceTypeName = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attrValue, "");
        int i = 0;
        if (!StringsKt.startsWith$default(attrValue, AUScreenAdaptTool.PREFIX_ID, false, 2, (Object) null) && !StringsKt.startsWith$default(attrValue, Global.QUESTION, false, 2, (Object) null)) {
            return -1;
        }
        try {
            String strSubstring = attrValue.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            i = Integer.parseInt(strSubstring);
        } catch (Exception unused) {
        }
        int realResourceId = getRealResourceId(context, i);
        if (realResourceId == 0) {
            return -1;
        }
        try {
            resourceTypeName = context.getResources().getResourceTypeName(realResourceId);
        } catch (Exception unused2) {
        }
        if (Intrinsics.areEqual("color", resourceTypeName)) {
            return component2(realResourceId);
        }
        if (!Intrinsics.areEqual("attr", resourceTypeName)) {
            return -1;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(realResourceId, typedValue, true);
        int realResourceId2 = getRealResourceId(context, typedValue.resourceId);
        if (realResourceId2 == 0) {
            return -1;
        }
        return component2(realResourceId2);
    }

    private final int component2(int i) {
        try {
            return ColorUtils.getColor(i);
        } catch (Exception unused) {
            return -1;
        }
    }

    public final int getRealResourceId(Context context, int resId) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            TypedValue typedValue = new TypedValue();
            context.getResources().getValue(resId, typedValue, true);
            return typedValue.resourceId;
        } catch (Exception unused) {
            return resId;
        }
    }

    public final int getColor(Context context, TypedArray typedArray, int index, int defValue) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(typedArray, "");
        try {
            int resourceId = typedArray.getResourceId(index, 0);
            if (resourceId == 0) {
                return typedArray.getColor(index, defValue);
            }
            TypedValue typedValue = new TypedValue();
            context.getResources().getValue(resourceId, typedValue, true);
            if (!Intrinsics.areEqual("color", context.getResources().getResourceTypeName(resourceId))) {
                return -1;
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence == null || charSequence.length() == 0) {
                return ColorUtils.getColor(typedValue.resourceId);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final int getAttrColor(Context context, Resources.Theme theme, int resid) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(theme, "");
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(resid, typedValue, true);
        int i = typedValue.data;
        int realResourceId = getRealResourceId(context, typedValue.resourceId);
        return realResourceId != 0 ? ColorUtils.getColor(realResourceId) : i;
    }
}
