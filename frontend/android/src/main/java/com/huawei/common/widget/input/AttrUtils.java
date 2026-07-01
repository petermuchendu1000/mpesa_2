package com.huawei.common.widget.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.blankj.utilcode.util.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.common.util.skin.SkinManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\"\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0005J,\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0007H\u0007J\"\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/huawei/common/widget/input/AttrUtils;", "", "<init>", "()V", "TAG", "", "getDimensionOrInt", "", "ta", "Landroid/content/res/TypedArray;", "attr", "defaultValue", "getAttrValue", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "name", "getColor", "typedArray", FirebaseAnalytics.Param.INDEX, "defValue", "getString", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AttrUtils {
    public static final AttrUtils INSTANCE = new AttrUtils();
    private static final String component3 = "AttrUtils";

    private AttrUtils() {
    }

    public final int getDimensionOrInt(TypedArray ta, int attr, int defaultValue) {
        Intrinsics.checkNotNullParameter(ta, "");
        try {
            return ta.getDimensionPixelOffset(attr, defaultValue);
        } catch (Exception unused) {
            return ta.getInt(attr, defaultValue);
        }
    }

    public final String getAttrValue(Context context, AttributeSet attrs, String name) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(name, "");
        int attributeCount = attrs != null ? attrs.getAttributeCount() : 0;
        int i = 0;
        while (true) {
            if (i >= attributeCount) {
                break;
            }
            if (Intrinsics.areEqual(name, attrs != null ? attrs.getAttributeName(i) : null)) {
                String attributeValue = attrs.getAttributeValue(i);
                if (attributeValue == null) {
                    attributeValue = "";
                }
                if (StringsKt.startsWith$default(attributeValue, AUScreenAdaptTool.PREFIX_ID, false, 2, (Object) null)) {
                    String strSubstring = attributeValue.substring(1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    int realResourceId = SkinManager.INSTANCE.getRealResourceId(context, Integer.parseInt(strSubstring));
                    if (realResourceId != 0 && Intrinsics.areEqual(TypedValues.Custom.S_STRING, context.getResources().getResourceTypeName(realResourceId))) {
                        return StringUtils.getString(realResourceId);
                    }
                }
            } else {
                i++;
            }
        }
        return null;
    }

    public final int getColor(Context context, TypedArray typedArray, int index, int defValue) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(typedArray, "");
        return SkinManager.INSTANCE.getColor(context, typedArray, index, defValue);
    }

    public final String getString(Context context, TypedArray typedArray, int index) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(typedArray, "");
        try {
            int realResourceId = SkinManager.INSTANCE.getRealResourceId(context, typedArray.getResourceId(index, 0));
            if (Intrinsics.areEqual(TypedValues.Custom.S_STRING, context.getResources().getResourceTypeName(realResourceId)) && realResourceId != 0) {
                return context.getString(realResourceId);
            }
            return typedArray.getString(index);
        } catch (Exception unused) {
            return typedArray.getString(index);
        }
    }
}
