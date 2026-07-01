package com.huawei.digitalpayment.home.data;

import android.util.Log;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SecureGsonUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.util.sort.SortUtils;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeTips;
import com.huawei.digitalpayment.home.data.source.remote.RemoteHomeTips;
import com.huawei.digitalpayment.home.data.source.remote.RemoteHomeTipsKt;
import com.huawei.digitalpayment.home.util.FunctionUtils;
import com.huawei.http.BaseRequestParams;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.setIsEnabled;
import kotlin.setOnBackScope;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0016¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/home/data/TipsModel;", "Lcom/huawei/digitalpayment/home/data/ITipsModel;", "<init>", "()V", "getTips", "", "params", "Lcom/huawei/http/BaseRequestParams;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeTips;", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class TipsModel implements ITipsModel {
    private static int component1 = 1;
    private static int component3;

    @Inject
    public TipsModel() {
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"com/huawei/digitalpayment/home/data/TipsModel$getTips$1", "Lcom/huawei/digitalpayment/consumer/baselib/http/PaymentRequest;", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeTips;", "getApiPath", "", "convert", "origin", "Lcom/google/gson/JsonObject;", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends PaymentRequest<List<? extends LocalHomeTips>> {
        private static int component2 = 1;
        private static int component3;

        AnonymousClass1() {
        }

        @Override
        public Object convert(JsonObject jsonObject) {
            int i = 2 % 2;
            int i2 = component2 + 33;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            List<LocalHomeTips> listConvert = convert(jsonObject);
            int i4 = component2 + 119;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return listConvert;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public String getApiPath() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 25;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 9;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return "queryTips";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public List<LocalHomeTips> convert(JsonObject origin) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(origin, "");
            ArrayList arrayList = new ArrayList();
            try {
                List list = (List) SecureGsonUtils.fromJson(origin.get("configs").toString(), new TypeToken<List<? extends RemoteHomeTips>>() {
                }.getType());
                if (list != null) {
                    List listFilterByTimeRange = FunctionUtils.filterByTimeRange(list);
                    SortUtils.sortByOrder(listFilterByTimeRange);
                    Intrinsics.checkNotNull(listFilterByTimeRange);
                    ArrayList<RemoteHomeTips> arrayList2 = new ArrayList();
                    for (Object obj : listFilterByTimeRange) {
                        int i2 = component2 + 3;
                        component3 = i2 % 128;
                        int i3 = i2 % 2;
                        String bulletin = ((RemoteHomeTips) obj).getBulletin();
                        if (bulletin != null) {
                            int i4 = component3 + 39;
                            component2 = i4 % 128;
                            if (i4 % 2 == 0) {
                                StringsKt.isBlank(bulletin);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            if (!StringsKt.isBlank(bulletin)) {
                                arrayList2.add(obj);
                            }
                        }
                    }
                    for (RemoteHomeTips remoteHomeTips : arrayList2) {
                        int i5 = component2 + 37;
                        component3 = i5 % 128;
                        int i6 = i5 % 2;
                        Intrinsics.checkNotNull(remoteHomeTips);
                        arrayList.add(RemoteHomeTipsKt.toLocal(remoteHomeTips));
                        int i7 = component3 + 101;
                        component2 = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }
            } catch (Exception e) {
                Log.d(this.TAG, "convert: " + e.getMessage());
            }
            return arrayList;
        }

        public static void component2() {
            setOnBackScope.component3[0] = setIsEnabled.component2[0];
        }
    }

    @Override
    public void getTips(BaseRequestParams params, ApiCallback<List<LocalHomeTips>> callback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(callback, "");
        sendRequest(new AnonymousClass1(), callback);
        int i2 = component3 + 75;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
