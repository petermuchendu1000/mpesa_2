package com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiOperateMode;", "", "code", "", "modeName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getModeName", "ONLY_CREATE", "ONLY_EDIT", "CREATE_AND_EDIT", "ONLY_VIEW", "CREATE_AND_VIEW", "EDIT_AND_VIEW", "ALL", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuiOperateMode {
    private static final EnumEntries $ENTRIES;
    private static final GuiOperateMode[] $VALUES;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final String code;
    private final String modeName;
    public static final GuiOperateMode ONLY_CREATE = new GuiOperateMode("ONLY_CREATE", 0, "1", "only create mode");
    public static final GuiOperateMode ONLY_EDIT = new GuiOperateMode("ONLY_EDIT", 1, "2", "only edit mode");
    public static final GuiOperateMode CREATE_AND_EDIT = new GuiOperateMode("CREATE_AND_EDIT", 2, "3", "create and edit mode");
    public static final GuiOperateMode ONLY_VIEW = new GuiOperateMode("ONLY_VIEW", 3, "4", "only view mode");
    public static final GuiOperateMode CREATE_AND_VIEW = new GuiOperateMode("CREATE_AND_VIEW", 4, "5", "create and view mode");
    public static final GuiOperateMode EDIT_AND_VIEW = new GuiOperateMode("EDIT_AND_VIEW", 5, "6", "edit and view mode");
    public static final GuiOperateMode ALL = new GuiOperateMode("ALL", 6, "7", "all");

    private GuiOperateMode(String str, int i, String str2, String str3) {
        this.code = str2;
        this.modeName = str3;
    }

    public final String getCode() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.code;
        int i4 = i3 + 77;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getModeName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.modeName;
        int i5 = i2 + 41;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        GuiOperateMode[] guiOperateModeArr$values = $values();
        $VALUES = guiOperateModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(guiOperateModeArr$values);
        int i = copydefault + 113;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
        }
    }

    public static GuiOperateMode valueOf(String str) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return (GuiOperateMode) Enum.valueOf(GuiOperateMode.class, str);
        }
        throw null;
    }

    public static GuiOperateMode[] values() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        GuiOperateMode[] guiOperateModeArr = (GuiOperateMode[]) $VALUES.clone();
        int i4 = component2 + 93;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return guiOperateModeArr;
        }
        throw null;
    }

    private static final GuiOperateMode[] $values() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 119;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        GuiOperateMode[] guiOperateModeArr = {ONLY_CREATE, ONLY_EDIT, CREATE_AND_EDIT, ONLY_VIEW, CREATE_AND_VIEW, EDIT_AND_VIEW, ALL};
        int i5 = i2 + 65;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return guiOperateModeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<GuiOperateMode> getEntries() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }
}
