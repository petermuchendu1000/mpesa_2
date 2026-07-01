package com.safaricom.sharedui.compose.confirmation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/GifDisplayShape;", "", "<init>", "(Ljava/lang/String;I)V", "VERTICAL_RECT", "HORIZONTAL_RECT", "SQUARED", "Companion", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GifDisplayShape {
    private static final EnumEntries $ENTRIES;
    private static final GifDisplayShape[] $VALUES;

    public static final Companion INSTANCE;
    public static final GifDisplayShape VERTICAL_RECT = new GifDisplayShape("VERTICAL_RECT", 0);
    public static final GifDisplayShape HORIZONTAL_RECT = new GifDisplayShape("HORIZONTAL_RECT", 1);
    public static final GifDisplayShape SQUARED = new GifDisplayShape("SQUARED", 2);

    private GifDisplayShape(String str, int i) {
    }

    static {
        GifDisplayShape[] gifDisplayShapeArr$values = $values();
        $VALUES = gifDisplayShapeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(gifDisplayShapeArr$values);
        INSTANCE = new Companion(null);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/GifDisplayShape$Companion;", "", "<init>", "()V", "from", "Lcom/safaricom/sharedui/compose/confirmation/GifDisplayShape;", "name", "", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final GifDisplayShape from(String name) {
            GifDisplayShape gifDisplayShapeValueOf;
            if (name != null) {
                try {
                    gifDisplayShapeValueOf = GifDisplayShape.valueOf(name);
                } catch (Exception unused) {
                    gifDisplayShapeValueOf = GifDisplayShape.SQUARED;
                }
                if (gifDisplayShapeValueOf != null) {
                    return gifDisplayShapeValueOf;
                }
            }
            return GifDisplayShape.SQUARED;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static GifDisplayShape valueOf(String str) {
        return (GifDisplayShape) Enum.valueOf(GifDisplayShape.class, str);
    }

    public static GifDisplayShape[] values() {
        return (GifDisplayShape[]) $VALUES.clone();
    }

    private static final GifDisplayShape[] $values() {
        return new GifDisplayShape[]{VERTICAL_RECT, HORIZONTAL_RECT, SQUARED};
    }

    public static EnumEntries<GifDisplayShape> getEntries() {
        return $ENTRIES;
    }
}
