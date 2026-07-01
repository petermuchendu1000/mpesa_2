package com.huawei.digitalpayment.consumer.profile.util;

import com.blankj.utilcode.util.CollectionUtils;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.model.remote.RemoteCustomer;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.huawei.digitalpayment.customer.dynamics.resp.GuiElements;
import com.huawei.digitalpayment.customer.dynamics.resp.GuiElementsKt;
import com.huawei.digitalpayment.customer.dynamics.resp.GuiGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/util/ModelMappingUtils;", "", "<init>", "()V", "toLocalCustomer", "Lcom/huawei/digitalpayment/consumer/profile/model/local/LocalCustomer;", "data", "Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteCustomer;", "toLocalElements", "", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "Lcom/huawei/digitalpayment/customer/dynamics/resp/GuiGroup;", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelMappingUtils {
    public static final ModelMappingUtils INSTANCE = new ModelMappingUtils();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    private ModelMappingUtils() {
    }

    @JvmStatic
    public static final LocalCustomer toLocalCustomer(RemoteCustomer data) {
        String avatar;
        String msisdn;
        int i = 2 % 2;
        int i2 = component3 + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String nickName = data != null ? data.getNickName() : null;
        if (data != null) {
            int i4 = component2 + 99;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                avatar = data.getAvatar();
                int i5 = 80 / 0;
            } else {
                avatar = data.getAvatar();
            }
        } else {
            avatar = null;
        }
        if (data != null) {
            msisdn = data.getMsisdn();
            int i6 = component3 + 51;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            msisdn = null;
        }
        return new LocalCustomer(nickName, avatar, msisdn, data != null ? data.getIdentityId() : null);
    }

    @JvmStatic
    public static final List<DynamicsElement> toLocalElements(GuiGroup data) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (data != null) {
            int i2 = component2 + 25;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            if (!CollectionUtils.isEmpty(data.getGuiElements())) {
                Iterator<GuiElements> it = data.getGuiElements().iterator();
                int i4 = component3 + 67;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                while (it.hasNext()) {
                    arrayList.add(GuiElementsKt.toElement$default(it.next(), false, 1, null));
                }
            }
        }
        return arrayList;
    }

    static {
        int i = component1 + 3;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
