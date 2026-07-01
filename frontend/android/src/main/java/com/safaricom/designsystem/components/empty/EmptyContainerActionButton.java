package com.safaricom.designsystem.components.empty;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/safaricom/designsystem/components/empty/EmptyContainerActionButton;", "", "NoAction", "Primary", "PrimaryWide", "Secondary", "Lcom/safaricom/designsystem/components/empty/EmptyContainerActionButton$NoAction;", "Lcom/safaricom/designsystem/components/empty/EmptyContainerActionButton$Primary;", "Lcom/safaricom/designsystem/components/empty/EmptyContainerActionButton$PrimaryWide;", "Lcom/safaricom/designsystem/components/empty/EmptyContainerActionButton$Secondary;", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EmptyContainerActionButton {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/safaricom/designsystem/components/empty/EmptyContainerActionButton$NoAction;", "Lcom/safaricom/designsystem/components/empty/EmptyContainerActionButton;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoAction implements EmptyContainerActionButton {
        public static final int $stable = 0;
        public static final NoAction INSTANCE = new NoAction();

        public int hashCode() {
            return -1356617865;
        }

        private NoAction() {
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoAction)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return "NoAction";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/safaricom/designsystem/components/empty/EmptyContainerActionButton$Primary;", "Lcom/safaricom/designsystem/components/empty/EmptyContainerActionButton;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Primary implements EmptyContainerActionButton {
        public static final int $stable = 0;
        private final String component3;

        public Primary(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
        }

        public Primary(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        public final String getText() {
            return this.component3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Primary() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static Primary copy$default(Primary primary, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = primary.component3;
            }
            return primary.copy(str);
        }

        public final String getComponent3() {
            return this.component3;
        }

        public final Primary copy(String text) {
            Intrinsics.checkNotNullParameter(text, "");
            return new Primary(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Primary) && Intrinsics.areEqual(this.component3, ((Primary) other).component3);
        }

        public int hashCode() {
            return this.component3.hashCode();
        }

        public String toString() {
            return "Primary(text=" + this.component3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/safaricom/designsystem/components/empty/EmptyContainerActionButton$PrimaryWide;", "Lcom/safaricom/designsystem/components/empty/EmptyContainerActionButton;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PrimaryWide implements EmptyContainerActionButton {
        public static final int $stable = 0;
        private final String component3;

        public PrimaryWide(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
        }

        public PrimaryWide(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        public final String getText() {
            return this.component3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PrimaryWide() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static PrimaryWide copy$default(PrimaryWide primaryWide, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = primaryWide.component3;
            }
            return primaryWide.copy(str);
        }

        public final String getComponent3() {
            return this.component3;
        }

        public final PrimaryWide copy(String text) {
            Intrinsics.checkNotNullParameter(text, "");
            return new PrimaryWide(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PrimaryWide) && Intrinsics.areEqual(this.component3, ((PrimaryWide) other).component3);
        }

        public int hashCode() {
            return this.component3.hashCode();
        }

        public String toString() {
            return "PrimaryWide(text=" + this.component3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/safaricom/designsystem/components/empty/EmptyContainerActionButton$Secondary;", "Lcom/safaricom/designsystem/components/empty/EmptyContainerActionButton;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Secondary implements EmptyContainerActionButton {
        public static final int $stable = 0;
        private final String component1;

        public Secondary(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component1 = str;
        }

        public Secondary(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        public final String getText() {
            return this.component1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Secondary() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static Secondary copy$default(Secondary secondary, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = secondary.component1;
            }
            return secondary.copy(str);
        }

        public final String getComponent1() {
            return this.component1;
        }

        public final Secondary copy(String text) {
            Intrinsics.checkNotNullParameter(text, "");
            return new Secondary(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Secondary) && Intrinsics.areEqual(this.component1, ((Secondary) other).component1);
        }

        public int hashCode() {
            return this.component1.hashCode();
        }

        public String toString() {
            return "Secondary(text=" + this.component1 + ")";
        }
    }
}
