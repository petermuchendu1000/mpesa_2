package com.safaricom.sharedui.compose.welcometutorial;

import android.app.Activity;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialRectProvider;", "", "getHighlightRect", "Landroidx/compose/ui/geometry/Rect;", "activity", "Landroid/app/Activity;", "XmlRectProvider", "ComposeRectProvider", "Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialRectProvider$ComposeRectProvider;", "Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialRectProvider$XmlRectProvider;", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WelcomeTutorialRectProvider {
    Rect getHighlightRect(Activity activity);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialRectProvider$XmlRectProvider;", "Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialRectProvider;", "views", "", "Landroid/view/View;", "<init>", "(Ljava/util/List;)V", "getHighlightRect", "Landroidx/compose/ui/geometry/Rect;", "activity", "Landroid/app/Activity;", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class XmlRectProvider implements WelcomeTutorialRectProvider {
        public static final int $stable = 8;
        private final List<View> ShareDataUIState;

        /* JADX WARN: Multi-variable type inference failed */
        public XmlRectProvider(List<? extends View> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.ShareDataUIState = list;
        }

        @Override
        public Rect getHighlightRect(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            if (this.ShareDataUIState.isEmpty()) {
                return Rect.INSTANCE.getZero();
            }
            return WelcomeTutorialUtilsKt.getHighlightRect(this.ShareDataUIState, activity);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialRectProvider$ComposeRectProvider;", "Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialRectProvider;", "rect", "Landroidx/compose/ui/geometry/Rect;", "<init>", "(Landroidx/compose/ui/geometry/Rect;)V", "getHighlightRect", "activity", "Landroid/app/Activity;", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ComposeRectProvider implements WelcomeTutorialRectProvider {
        public static final int $stable = 0;
        private final Rect copydefault;

        public ComposeRectProvider(Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "");
            this.copydefault = rect;
        }

        @Override
        public Rect getHighlightRect(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            return this.copydefault;
        }
    }
}
