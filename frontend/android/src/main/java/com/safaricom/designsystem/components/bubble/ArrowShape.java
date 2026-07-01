package com.safaricom.designsystem.components.bubble;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/safaricom/designsystem/components/bubble/ArrowShape;", "", "<init>", "(Ljava/lang/String;I)V", "HalfTriangle", "FullTriangle", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ArrowShape {
    private static final EnumEntries $ENTRIES;
    private static final ArrowShape[] $VALUES;
    public static final ArrowShape HalfTriangle = new ArrowShape("HalfTriangle", 0);
    public static final ArrowShape FullTriangle = new ArrowShape("FullTriangle", 1);

    private ArrowShape(String str, int i) {
    }

    static {
        ArrowShape[] arrowShapeArr$values = $values();
        $VALUES = arrowShapeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(arrowShapeArr$values);
    }

    public static ArrowShape valueOf(String str) {
        return (ArrowShape) Enum.valueOf(ArrowShape.class, str);
    }

    public static ArrowShape[] values() {
        return (ArrowShape[]) $VALUES.clone();
    }

    private static final ArrowShape[] $values() {
        return new ArrowShape[]{HalfTriangle, FullTriangle};
    }

    public static EnumEntries<ArrowShape> getEntries() {
        return $ENTRIES;
    }
}
