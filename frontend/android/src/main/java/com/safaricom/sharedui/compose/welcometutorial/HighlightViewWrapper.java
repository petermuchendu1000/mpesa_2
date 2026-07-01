package com.safaricom.sharedui.compose.welcometutorial;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0003H×\u0001J\t\u0010\u0019\u001a\u00020\u001aH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/safaricom/sharedui/compose/welcometutorial/HighlightViewWrapper;", "", "position", "", "data", "Lcom/safaricom/sharedui/compose/welcometutorial/HighlightViewData;", "rectProviders", "", "Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialRectProvider;", "<init>", "(ILcom/safaricom/sharedui/compose/welcometutorial/HighlightViewData;Ljava/util/List;)V", "getPosition", "()I", "getData", "()Lcom/safaricom/sharedui/compose/welcometutorial/HighlightViewData;", "getRectProviders", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HighlightViewWrapper {
    private final int ShareDataUIState;
    private final List<WelcomeTutorialRectProvider> component2;
    private final HighlightViewData copydefault;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final HighlightViewWrapper component3 = new HighlightViewWrapper(0, HighlightViewData.INSTANCE.getDEFAULT(), null, 4, null);
    private static final HighlightViewWrapper component1 = new HighlightViewWrapper(7, HighlightViewData.INSTANCE.getDEFAULT(), null, 4, null);

    public HighlightViewWrapper(int i, HighlightViewData highlightViewData, List<WelcomeTutorialRectProvider> list) {
        Intrinsics.checkNotNullParameter(highlightViewData, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.ShareDataUIState = i;
        this.copydefault = highlightViewData;
        this.component2 = list;
    }

    public final int getPosition() {
        return this.ShareDataUIState;
    }

    public final HighlightViewData getData() {
        return this.copydefault;
    }

    public HighlightViewWrapper(int i, HighlightViewData highlightViewData, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, highlightViewData, (i2 & 4) != 0 ? new ArrayList() : arrayList);
    }

    public final List<WelcomeTutorialRectProvider> getRectProviders() {
        return this.component2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/safaricom/sharedui/compose/welcometutorial/HighlightViewWrapper$Companion;", "", "<init>", "()V", "GREETING", "Lcom/safaricom/sharedui/compose/welcometutorial/HighlightViewWrapper;", "getGREETING", "()Lcom/safaricom/sharedui/compose/welcometutorial/HighlightViewWrapper;", "CLOSING", "getCLOSING", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final HighlightViewWrapper getGREETING() {
            return HighlightViewWrapper.component3;
        }

        public final HighlightViewWrapper getCLOSING() {
            return HighlightViewWrapper.component1;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HighlightViewWrapper copy$default(HighlightViewWrapper highlightViewWrapper, int i, HighlightViewData highlightViewData, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = highlightViewWrapper.ShareDataUIState;
        }
        if ((i2 & 2) != 0) {
            highlightViewData = highlightViewWrapper.copydefault;
        }
        if ((i2 & 4) != 0) {
            list = highlightViewWrapper.component2;
        }
        return highlightViewWrapper.copy(i, highlightViewData, list);
    }

    public final int getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final HighlightViewData getCopydefault() {
        return this.copydefault;
    }

    public final List<WelcomeTutorialRectProvider> component3() {
        return this.component2;
    }

    public final HighlightViewWrapper copy(int position, HighlightViewData data, List<WelcomeTutorialRectProvider> rectProviders) {
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(rectProviders, "");
        return new HighlightViewWrapper(position, data, rectProviders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightViewWrapper)) {
            return false;
        }
        HighlightViewWrapper highlightViewWrapper = (HighlightViewWrapper) other;
        return this.ShareDataUIState == highlightViewWrapper.ShareDataUIState && Intrinsics.areEqual(this.copydefault, highlightViewWrapper.copydefault) && Intrinsics.areEqual(this.component2, highlightViewWrapper.component2);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.ShareDataUIState) * 31) + this.copydefault.hashCode()) * 31) + this.component2.hashCode();
    }

    public String toString() {
        return "HighlightViewWrapper(position=" + this.ShareDataUIState + ", data=" + this.copydefault + ", rectProviders=" + this.component2 + ')';
    }
}
