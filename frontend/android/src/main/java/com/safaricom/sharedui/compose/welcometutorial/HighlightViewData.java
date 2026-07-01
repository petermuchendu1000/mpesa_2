package com.safaricom.sharedui.compose.welcometutorial;

import com.safaricom.designsystem.components.bubble.ArrowAlignment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0005H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/safaricom/sharedui/compose/welcometutorial/HighlightViewData;", "", "arrowAlignment", "Lcom/safaricom/designsystem/components/bubble/ArrowAlignment;", "titleText", "", "contentText", "<init>", "(Lcom/safaricom/designsystem/components/bubble/ArrowAlignment;II)V", "getArrowAlignment", "()Lcom/safaricom/designsystem/components/bubble/ArrowAlignment;", "getTitleText", "()I", "getContentText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HighlightViewData {
    public static final int $stable = 0;

    public static final Companion INSTANCE = new Companion(null);
    private static final HighlightViewData component3 = new HighlightViewData(ArrowAlignment.TopLeft, -1, -1);
    private final ArrowAlignment ShareDataUIState;
    private final int component1;
    private final int copydefault;

    public HighlightViewData(ArrowAlignment arrowAlignment, int i, int i2) {
        Intrinsics.checkNotNullParameter(arrowAlignment, "");
        this.ShareDataUIState = arrowAlignment;
        this.copydefault = i;
        this.component1 = i2;
    }

    public final ArrowAlignment getArrowAlignment() {
        return this.ShareDataUIState;
    }

    public final int getTitleText() {
        return this.copydefault;
    }

    public final int getContentText() {
        return this.component1;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/sharedui/compose/welcometutorial/HighlightViewData$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/safaricom/sharedui/compose/welcometutorial/HighlightViewData;", "getDEFAULT", "()Lcom/safaricom/sharedui/compose/welcometutorial/HighlightViewData;", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final HighlightViewData getDEFAULT() {
            return HighlightViewData.component3;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static HighlightViewData copy$default(HighlightViewData highlightViewData, ArrowAlignment arrowAlignment, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            arrowAlignment = highlightViewData.ShareDataUIState;
        }
        if ((i3 & 2) != 0) {
            i = highlightViewData.copydefault;
        }
        if ((i3 & 4) != 0) {
            i2 = highlightViewData.component1;
        }
        return highlightViewData.copy(arrowAlignment, i, i2);
    }

    public final ArrowAlignment getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final int getCopydefault() {
        return this.copydefault;
    }

    public final int getComponent1() {
        return this.component1;
    }

    public final HighlightViewData copy(ArrowAlignment arrowAlignment, int titleText, int contentText) {
        Intrinsics.checkNotNullParameter(arrowAlignment, "");
        return new HighlightViewData(arrowAlignment, titleText, contentText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightViewData)) {
            return false;
        }
        HighlightViewData highlightViewData = (HighlightViewData) other;
        return this.ShareDataUIState == highlightViewData.ShareDataUIState && this.copydefault == highlightViewData.copydefault && this.component1 == highlightViewData.component1;
    }

    public int hashCode() {
        return (((this.ShareDataUIState.hashCode() * 31) + Integer.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.component1);
    }

    public String toString() {
        return "HighlightViewData(arrowAlignment=" + this.ShareDataUIState + ", titleText=" + this.copydefault + ", contentText=" + this.component1 + ')';
    }
}
