package com.safaricom.sharedui.compose.welcometutorial;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialDirection;", "", "<init>", "(Ljava/lang/String;I)V", "FORWARD", "REVERSE", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WelcomeTutorialDirection {
    private static final EnumEntries $ENTRIES;
    private static final WelcomeTutorialDirection[] $VALUES;
    public static final WelcomeTutorialDirection FORWARD = new WelcomeTutorialDirection("FORWARD", 0);
    public static final WelcomeTutorialDirection REVERSE = new WelcomeTutorialDirection("REVERSE", 1);

    private WelcomeTutorialDirection(String str, int i) {
    }

    static {
        WelcomeTutorialDirection[] welcomeTutorialDirectionArr$values = $values();
        $VALUES = welcomeTutorialDirectionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(welcomeTutorialDirectionArr$values);
    }

    public static WelcomeTutorialDirection valueOf(String str) {
        return (WelcomeTutorialDirection) Enum.valueOf(WelcomeTutorialDirection.class, str);
    }

    public static WelcomeTutorialDirection[] values() {
        return (WelcomeTutorialDirection[]) $VALUES.clone();
    }

    private static final WelcomeTutorialDirection[] $values() {
        return new WelcomeTutorialDirection[]{FORWARD, REVERSE};
    }

    public static EnumEntries<WelcomeTutorialDirection> getEntries() {
        return $ENTRIES;
    }
}
