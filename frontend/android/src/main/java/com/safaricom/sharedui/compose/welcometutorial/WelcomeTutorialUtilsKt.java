package com.safaricom.sharedui.compose.welcometutorial;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.WindowInfoFieldGroup;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f\u001a\u0014\u0010\r\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0004H\u0000¨\u0006\u0013"}, d2 = {"getCoordinatesInWindow", "", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "getWidthAndHeight", "", "getHighlightRect", "Landroidx/compose/ui/geometry/Rect;", "toggleVisibility", "", "isVisible", "", "getEncompassingRect", "rects", "", "Landroidx/compose/ui/layout/LayoutCoordinates;", WindowInfoFieldGroup.FIELD_STATUS_BAR_HEIGHT, "", "SharedUiCompose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WelcomeTutorialUtilsKt {
    private static final float[] ShareDataUIState(View view, Activity activity) {
        view.getLocationInWindow(new int[2]);
        return new float[]{r1[0], r1[1] - statusBarHeight(activity)};
    }

    private static final float[] copydefault(List<? extends View> list, Activity activity) {
        if (list.size() == 1) {
            return new float[]{((View) CollectionsKt.first((List) list)).getWidth(), ((View) CollectionsKt.first((List) list)).getHeight()};
        }
        float f = ShareDataUIState((View) CollectionsKt.first((List) list), activity)[1];
        float f2 = ShareDataUIState((View) CollectionsKt.last((List) list), activity)[1];
        float height = ((View) CollectionsKt.last((List) list)).getHeight();
        Iterator<T> it = list.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(fMax, ((View) it.next()).getWidth());
        }
        return new float[]{fMax, (f2 - f) + height};
    }

    private static final float[] component3(List<? extends View> list, Activity activity) {
        return ShareDataUIState((View) CollectionsKt.first((List) list), activity);
    }

    public static final Rect getHighlightRect(List<? extends View> list, Activity activity) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(activity, "");
        float[] fArrCopydefault = copydefault(list, activity);
        float f = fArrCopydefault[0];
        float f2 = fArrCopydefault[1];
        float[] fArrComponent3 = component3(list, activity);
        float f3 = fArrComponent3[0];
        float f4 = fArrComponent3[1];
        return new Rect(f3, f4, f + f3, f2 + f4);
    }

    public static final void toggleVisibility(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "");
        view.setVisibility(z ? 0 : 4);
    }

    public static final Rect getEncompassingRect(Collection<Rect> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("List of rects cannot be empty");
        }
        Collection<Rect> collection2 = collection;
        Iterator<T> it = collection2.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float left = ((Rect) it.next()).getLeft();
        while (it.hasNext()) {
            left = Math.min(left, ((Rect) it.next()).getLeft());
        }
        Iterator<T> it2 = collection2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float top = ((Rect) it2.next()).getTop();
        while (it2.hasNext()) {
            top = Math.min(top, ((Rect) it2.next()).getTop());
        }
        Iterator<T> it3 = collection2.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float bottom = ((Rect) it3.next()).getBottom();
        while (it3.hasNext()) {
            bottom = Math.max(bottom, ((Rect) it3.next()).getBottom());
        }
        Iterator<T> it4 = collection2.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        Rect rect = (Rect) it4.next();
        float right = rect.getRight() - rect.getLeft();
        while (it4.hasNext()) {
            Rect rect2 = (Rect) it4.next();
            right = Math.max(right, rect2.getRight() - rect2.getLeft());
        }
        return new Rect(left, top, right + left, bottom);
    }

    public static final Rect getHighlightRect(LayoutCoordinates layoutCoordinates, Activity activity) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "");
        Intrinsics.checkNotNullParameter(activity, "");
        long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(layoutCoordinates);
        long jMo7480getSizeYbymL2g = layoutCoordinates.mo7480getSizeYbymL2g();
        long j = -1;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & jPositionInWindow)) + statusBarHeight(activity);
        int i = (int) (jPositionInWindow >> 32);
        long j2 = -1;
        return new Rect(Float.intBitsToFloat(i), fIntBitsToFloat, ((int) (jMo7480getSizeYbymL2g >> 32)) + Float.intBitsToFloat(i), ((int) (jMo7480getSizeYbymL2g & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))))) + fIntBitsToFloat);
    }

    public static final int statusBarHeight(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        android.graphics.Rect rect = new android.graphics.Rect();
        Window window = activity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "");
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }
}
