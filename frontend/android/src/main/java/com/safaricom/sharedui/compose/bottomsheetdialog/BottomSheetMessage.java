package com.safaricom.sharedui.compose.bottomsheetdialog;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/safaricom/sharedui/compose/bottomsheetdialog/BottomSheetMessage;", "", "<init>", "()V", "Annotated", "Lcom/safaricom/sharedui/compose/bottomsheetdialog/BottomSheetMessage$Annotated;", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BottomSheetMessage {
    public static final int $stable = 0;

    private BottomSheetMessage() {
    }

    public BottomSheetMessage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/safaricom/sharedui/compose/bottomsheetdialog/BottomSheetMessage$Annotated;", "Lcom/safaricom/sharedui/compose/bottomsheetdialog/BottomSheetMessage;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;)V", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Annotated extends BottomSheetMessage {
        public static final int $stable = 0;
        private final AnnotatedString copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Annotated(AnnotatedString annotatedString) {
            super(null);
            Intrinsics.checkNotNullParameter(annotatedString, "");
            this.copydefault = annotatedString;
        }

        public final AnnotatedString getText() {
            return this.copydefault;
        }

        public static Annotated copy$default(Annotated annotated, AnnotatedString annotatedString, int i, Object obj) {
            if ((i & 1) != 0) {
                annotatedString = annotated.copydefault;
            }
            return annotated.copy(annotatedString);
        }

        public final AnnotatedString getCopydefault() {
            return this.copydefault;
        }

        public final Annotated copy(AnnotatedString text) {
            Intrinsics.checkNotNullParameter(text, "");
            return new Annotated(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Annotated) && Intrinsics.areEqual(this.copydefault, ((Annotated) other).copydefault);
        }

        public int hashCode() {
            return this.copydefault.hashCode();
        }

        public String toString() {
            return "Annotated(text=" + ((Object) this.copydefault) + ')';
        }
    }
}
