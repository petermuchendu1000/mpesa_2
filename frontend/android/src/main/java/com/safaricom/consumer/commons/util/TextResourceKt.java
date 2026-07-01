package com.safaricom.consumer.commons.util;

import android.content.Context;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.safaricom.consumer.commons.util.TextResource;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001¢\u0006\u0002\u0010\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001¢\u0006\u0002\u0010\t\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\b2\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\u000f"}, d2 = {"getStringRes", "", "Landroid/content/Context;", GriverCacheDao.COLUMN_CACHE_ID, "", "formatArgs", "", "(Landroid/content/Context;I[Ljava/lang/String;)Ljava/lang/String;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;I[Ljava/lang/String;)Ljava/lang/String;", "text", "Lcom/safaricom/consumer/commons/util/TextResource;", "setText", "", "Landroid/widget/TextView;", "ConsumerSfcCommons_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextResourceKt {
    public static final String getStringRes(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        return TextResource.Companion.invoke$default(TextResource.INSTANCE, i, false, 2, (Object) null).getValue(context);
    }

    public static final String getStringRes(Fragment fragment, int i) {
        Intrinsics.checkNotNullParameter(fragment, "");
        TextResource textResourceInvoke$default = TextResource.Companion.invoke$default(TextResource.INSTANCE, i, false, 2, (Object) null);
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return textResourceInvoke$default.getValue(contextRequireContext);
    }

    public static final String getStringRes(Fragment fragment, int i, String... strArr) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return getStringRes(contextRequireContext, i, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final String getStringRes(Fragment fragment, TextResource textResource) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(textResource, "");
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return textResource.getValue(contextRequireContext);
    }

    public static final String getStringRes(Context context, TextResource textResource) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(textResource, "");
        return textResource.getValue(context);
    }

    public static final void setText(TextView textView, TextResource textResource) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(textResource, "");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(textResource.getValue(context));
    }

    public static final String getStringRes(Context context, int i, String... strArr) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TextResource.Companion.invoke$default(TextResource.INSTANCE, str, false, 2, (Object) null));
        }
        TextResource[] textResourceArr = (TextResource[]) arrayList.toArray(new TextResource[0]);
        return TextResource.Companion.invoke$default(TextResource.INSTANCE, i, (TextResource[]) Arrays.copyOf(textResourceArr, textResourceArr.length), false, 4, null).getValue(context);
    }
}
