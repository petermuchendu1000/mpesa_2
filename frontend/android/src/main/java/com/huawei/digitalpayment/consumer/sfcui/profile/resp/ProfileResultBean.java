package com.huawei.digitalpayment.consumer.sfcui.profile.resp;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH×\u0003J\t\u0010\u001e\u001a\u00020\u001fH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/resp/ProfileResultBean;", "Ljava/io/Serializable;", "status", "", "title", "content", "buttonText", "isPuk", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "getTitle", "getContent", "getButtonText", "()Z", "setPuk", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProfileResultBean implements Serializable {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 41 % 128;
    private static int copydefault;
    private final String buttonText;
    private final String content;
    private boolean isPuk;
    private String status;
    private final String title;

    public ProfileResultBean(String str, String str2, String str3, String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.status = str;
        this.title = str2;
        this.content = str3;
        this.buttonText = str4;
        this.isPuk = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProfileResultBean(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 16) != 0) {
            int i2 = component2;
            int i3 = i2 + 29;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 67;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = false;
        }
        this(str, str2, str3, str4, z);
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.status;
        }
        throw null;
    }

    public final void setStatus(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.status = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
        int i3 = copydefault + 29;
        component2 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 99;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getContent() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.content;
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return str;
    }

    public final String getButtonText() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.buttonText;
            int i4 = 74 / 0;
        } else {
            str = this.buttonText;
        }
        int i5 = i2 + 85;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return str;
    }

    public final boolean isPuk() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 93;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.isPuk;
        int i4 = i2 + 25;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final void setPuk(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.isPuk = z;
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
    }

    static {
        int i = 41 % 2;
    }

    public static ProfileResultBean copy$default(ProfileResultBean profileResultBean, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 7;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str = profileResultBean.status;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            int i5 = component2 + 55;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str2 = profileResultBean.title;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = profileResultBean.content;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = profileResultBean.buttonText;
            int i7 = copydefault + 5;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            z = profileResultBean.isPuk;
        }
        return profileResultBean.copy(str5, str6, str7, str8, z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.status;
        int i5 = i3 + 103;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 11;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 51;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.content;
        int i5 = i3 + 71;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.buttonText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 33;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isPuk;
        int i5 = i2 + 123;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return z;
    }

    public final ProfileResultBean copy(String status, String title, String content, String buttonText, boolean isPuk) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(status, "");
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(content, "");
        Intrinsics.checkNotNullParameter(buttonText, "");
        ProfileResultBean profileResultBean = new ProfileResultBean(status, title, content, buttonText, isPuk);
        int i2 = component2 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return profileResultBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 9;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ProfileResultBean)) {
            return false;
        }
        ProfileResultBean profileResultBean = (ProfileResultBean) other;
        if (!Intrinsics.areEqual(this.status, profileResultBean.status)) {
            int i4 = component2 + 61;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 41 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.title, profileResultBean.title)) {
            int i6 = component2 + 49;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.content, profileResultBean.content)) {
            return false;
        }
        if (Intrinsics.areEqual(this.buttonText, profileResultBean.buttonText)) {
            return this.isPuk == profileResultBean.isPuk;
        }
        int i8 = component2 + 51;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.status.hashCode() * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + Boolean.hashCode(this.isPuk);
        int i4 = copydefault + 21;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ProfileResultBean(status=" + this.status + ", title=" + this.title + ", content=" + this.content + ", buttonText=" + this.buttonText + ", isPuk=" + this.isPuk + ")";
        int i2 = component2 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
