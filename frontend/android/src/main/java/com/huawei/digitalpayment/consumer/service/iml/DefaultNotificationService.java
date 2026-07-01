package com.huawei.digitalpayment.consumer.service.iml;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.service.INotificationService;
import com.huawei.digitalpayment.consumer.service.UnreadState;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u001e\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0004J\b\u0010 \u001a\u00020\u000fH\u0004J\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u001dH\u0004J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u000bH\u0004J\b\u0010#\u001a\u00020\u001aH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006%"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/iml/DefaultNotificationService;", "Lcom/huawei/digitalpayment/consumer/service/INotificationService;", "<init>", "()V", "unreadState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/digitalpayment/consumer/service/UnreadState;", "getUnreadState", "()Landroidx/lifecycle/MutableLiveData;", "readStateCache", "", "", "getReadStateCache", "()Ljava/util/Set;", "loadUnreadNumFromLocal", "", "reportMsgReadStatus", "queryUnreadNum", "markMessageRead", GriverCacheDao.COLUMN_CACHE_ID, "setMessagesRead", "idList", "", "type", "setMessageRead", "isMessageRead", "", "Landroidx/lifecycle/LiveData;", "getCountValue", "", "value", "subValue", "saveUnreadNum", "count", "getUnreadNum", "isReadStatusCacheEmpty", "Companion", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DefaultNotificationService implements INotificationService {

    public static final Companion INSTANCE = new Companion(null);
    public static final String NOTIFICATION_COUNT = "notification_count";
    public static final String PUSH_TYPE_PROMOTION = "2";
    public static final String PUSH_TYPE_SYSTEM = "0";
    public static final String PUSH_TYPE_TRANSACTION = "1";
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private static int equals = 1;
    private final MutableLiveData<UnreadState> ShareDataUIState = new MutableLiveData<>(new UnreadState(0, 0, 0, 0, 15, null));
    private final Set<String> component1 = new LinkedHashSet();

    public DefaultNotificationService() {
        component3();
    }

    public final MutableLiveData<UnreadState> getUnreadState() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 121;
        equals = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<UnreadState> mutableLiveData = this.ShareDataUIState;
        int i5 = i2 + 59;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public final Set<String> getReadStateCache() {
        int i = 2 % 2;
        int i2 = equals + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Set<String> set = this.component1;
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return set;
    }

    private final void component3() {
        int i = 2 % 2;
        int unreadNum = getUnreadNum("0");
        int unreadNum2 = getUnreadNum("1");
        int unreadNum3 = getUnreadNum("2");
        this.ShareDataUIState.setValue(new UnreadState(unreadNum + unreadNum2 + unreadNum3, unreadNum, unreadNum2, unreadNum3));
        int i2 = equals + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void markMessageRead(String id) {
        int i = 2 % 2;
        int i2 = equals + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        this.component1.add(id);
        int i4 = equals + 123;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override
    public void setMessagesRead(List<String> idList, String type) {
        UnreadState value;
        int i = 2 % 2;
        int i2 = component3 + 23;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(idList, "");
            Intrinsics.checkNotNullParameter(type, "");
            this.component1.addAll(idList);
            value = this.ShareDataUIState.getValue();
            int i3 = 18 / 0;
            if (value == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(idList, "");
            Intrinsics.checkNotNullParameter(type, "");
            this.component1.addAll(idList);
            value = this.ShareDataUIState.getValue();
            if (value == null) {
                return;
            }
        }
        int size = idList.size();
        switch (type.hashCode()) {
            case 48:
                if (type.equals("0")) {
                    value.setSystem(getCountValue(value.getSystem(), size));
                }
                break;
            case 49:
                if (type.equals("1")) {
                    value.setTransaction(getCountValue(value.getTransaction(), size));
                    int i4 = equals + 41;
                    component3 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 2 / 5;
                    }
                }
                break;
            case 50:
                if (type.equals("2")) {
                    value.setPromotion(getCountValue(value.getPromotion(), size));
                }
                break;
        }
        value.setTotal(getCountValue(value.getTotal(), size));
        this.ShareDataUIState.setValue(value);
    }

    @Override
    public void setMessageRead(String id, String type) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(id, "");
            Intrinsics.checkNotNullParameter(type, "");
            setMessagesRead(CollectionsKt.listOf(id), type);
        } else {
            Intrinsics.checkNotNullParameter(id, "");
            Intrinsics.checkNotNullParameter(type, "");
            setMessagesRead(CollectionsKt.listOf(id), type);
            int i3 = 41 / 0;
        }
    }

    @Override
    public boolean isMessageRead(String id) {
        int i = 2 % 2;
        int i2 = equals + 39;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(id, "");
            this.component1.contains(id);
            throw null;
        }
        Intrinsics.checkNotNullParameter(id, "");
        boolean zContains = this.component1.contains(id);
        int i3 = equals + 49;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return zContains;
        }
        throw null;
    }

    @Override
    public LiveData<UnreadState> unreadState() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 97;
        equals = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<UnreadState> mutableLiveData = this.ShareDataUIState;
        int i5 = i2 + 119;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public final void saveUnreadNum() {
        UnreadState value;
        int i = 2 % 2;
        int i2 = component3 + 85;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            value = this.ShareDataUIState.getValue();
            int i3 = 35 / 0;
            if (value == null) {
                return;
            }
        } else {
            value = this.ShareDataUIState.getValue();
            if (value == null) {
                return;
            }
        }
        saveUnreadNum("0", value.getSystem());
        saveUnreadNum("1", value.getTransaction());
        saveUnreadNum("2", value.getPromotion());
        int i4 = equals + 41;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
    }

    protected final void saveUnreadNum(String type, int count) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(type, "");
        SPUtils.getInstance().put("notification_count_" + type, count);
        int i2 = equals + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    protected final int getUnreadNum(String type) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(type, "");
        int i2 = SPUtils.getInstance().getInt("notification_count_" + type, 0);
        int i3 = component3 + 9;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean isReadStatusCacheEmpty() {
        int i = 2 % 2;
        int i2 = equals + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsEmpty = this.component1.isEmpty();
        int i4 = equals + 81;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return zIsEmpty;
    }

    static {
        int i = component2 + 23;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/iml/DefaultNotificationService$Companion;", "", "<init>", "()V", "NOTIFICATION_COUNT", "", "PUSH_TYPE_SYSTEM", "PUSH_TYPE_TRANSACTION", "PUSH_TYPE_PROMOTION", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    protected final int getCountValue(int value, int subValue) {
        int i = 2 % 2;
        int i2 = component3 + 45;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            int i4 = value >>> subValue;
            if (i4 >= 0) {
                return i4;
            }
        } else {
            int i5 = value - subValue;
            if (i5 >= 0) {
                return i5;
            }
        }
        int i6 = i3 + 11;
        component3 = i6 % 128;
        return 1 ^ (i6 % 2 != 0 ? 0 : 1);
    }

    @Override
    public void queryUnreadNum() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void reportMsgReadStatus() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }
}
