package com.safaricom.designsystem.components.bubble;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/safaricom/designsystem/components/bubble/ArrowAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "None", "LeftTop", "LeftCenter", "LeftBottom", "RightTop", "RightCenter", "RightBottom", "BottomLeft", "BottomCenter", "BottomRight", "TopLeft", "TopCenter", "TopRight", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ArrowAlignment {
    private static final EnumEntries $ENTRIES;
    private static final ArrowAlignment[] $VALUES;
    public static final ArrowAlignment None = new ArrowAlignment("None", 0);
    public static final ArrowAlignment LeftTop = new ArrowAlignment("LeftTop", 1);
    public static final ArrowAlignment LeftCenter = new ArrowAlignment("LeftCenter", 2);
    public static final ArrowAlignment LeftBottom = new ArrowAlignment("LeftBottom", 3);
    public static final ArrowAlignment RightTop = new ArrowAlignment("RightTop", 4);
    public static final ArrowAlignment RightCenter = new ArrowAlignment("RightCenter", 5);
    public static final ArrowAlignment RightBottom = new ArrowAlignment("RightBottom", 6);
    public static final ArrowAlignment BottomLeft = new ArrowAlignment("BottomLeft", 7);
    public static final ArrowAlignment BottomCenter = new ArrowAlignment("BottomCenter", 8);
    public static final ArrowAlignment BottomRight = new ArrowAlignment("BottomRight", 9);
    public static final ArrowAlignment TopLeft = new ArrowAlignment("TopLeft", 10);
    public static final ArrowAlignment TopCenter = new ArrowAlignment("TopCenter", 11);
    public static final ArrowAlignment TopRight = new ArrowAlignment("TopRight", 12);

    private ArrowAlignment(String str, int i) {
    }

    static {
        ArrowAlignment[] arrowAlignmentArr$values = $values();
        $VALUES = arrowAlignmentArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(arrowAlignmentArr$values);
    }

    public static ArrowAlignment valueOf(String str) {
        return (ArrowAlignment) Enum.valueOf(ArrowAlignment.class, str);
    }

    public static ArrowAlignment[] values() {
        return (ArrowAlignment[]) $VALUES.clone();
    }

    private static final ArrowAlignment[] $values() {
        return new ArrowAlignment[]{None, LeftTop, LeftCenter, LeftBottom, RightTop, RightCenter, RightBottom, BottomLeft, BottomCenter, BottomRight, TopLeft, TopCenter, TopRight};
    }

    public static EnumEntries<ArrowAlignment> getEntries() {
        return $ENTRIES;
    }
}
