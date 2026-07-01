package com.huawei.digitalpayment.consumer.push.model;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.griver.api.constants.GriverEvents;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/push/model/NotificationMessageBean;", "Lcom/huawei/http/BaseResp;", "<init>", "()V", "identityId", "", "getIdentityId", "()Ljava/lang/String;", "setIdentityId", "(Ljava/lang/String;)V", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "getCategory", "setCategory", "title", "getTitle", GriverEvents.EVENT_SET_TITLE, "content", "getContent", "setContent", "systemExecute", "getSystemExecute", "setSystemExecute", "sound", "getSound", "setSound", "soundText", "getSoundText", "setSoundText", "CustomerPushModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationMessageBean extends BaseResp {
    private static int component1 = 1;
    private static int component3;
    private String category = "";
    private String content;
    private String identityId;
    private String sound;
    private String soundText;
    private String systemExecute;
    private String title;

    public final String getIdentityId() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.identityId;
        int i5 = i3 + 47;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setIdentityId(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.identityId = str;
        int i5 = i2 + 35;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.category;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final void setCategory(String str) {
        int i = 2 % 2;
        int i2 = component1 + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.category = str;
        int i4 = component1 + 67;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.title;
        }
        throw null;
    }

    public final void setTitle(String str) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.title = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getContent() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.content;
        int i5 = i3 + 93;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 10 / 0;
        }
        return str;
    }

    public final void setContent(String str) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.content = str;
        int i5 = i3 + 87;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getSystemExecute() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.systemExecute;
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return str;
    }

    public final void setSystemExecute(String str) {
        int i = 2 % 2;
        int i2 = component3 + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.systemExecute = str;
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
    }

    public final String getSound() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.sound;
        int i4 = i2 + 59;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setSound(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 83;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.sound = str;
        int i5 = i2 + 97;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getSoundText() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 77;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.soundText;
        int i5 = i2 + 93;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSoundText(String str) {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.soundText = str;
        if (i3 == 0) {
            throw null;
        }
    }
}
