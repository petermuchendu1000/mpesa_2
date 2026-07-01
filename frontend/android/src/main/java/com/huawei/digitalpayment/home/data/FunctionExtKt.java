package com.huawei.digitalpayment.home.data;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.common.util.image.UrlUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.util.sort.SortUtils;
import com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.digitalpayment.home.data.source.remote.RemoteFunctionGroup;
import com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction;
import com.huawei.http.BaseResp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.getCustom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.setViewModelStore;
import org.apache.commons.lang3.BooleanUtils;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a$\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000b*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u001a\u001a\u0010\f\u001a\u00020\r*\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002\u001a\u0016\u0010\u0011\u001a\u00020\u0012*\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u001a&\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00160\u000b\"\u0004\b\u0000\u0010\u0016*\n\u0012\u0004\u0012\u0002H\u0016\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u0017¨\u0006\u0018"}, d2 = {"toLocalFunctionDefine", "", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "Lcom/huawei/digitalpayment/home/data/source/remote/RemoteHomeFunction;", "toLocalFunction", "isLightIcon", "", "isFilterLoginSetting", "funcId", "toLocalHomeFunction", "", "toLocalFunctionGroup", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalFunctionGroup;", "Lcom/huawei/digitalpayment/home/data/source/remote/RemoteFunctionGroup;", "filterEmpty", "localHomeFunctions", "copeExtensionToOther", "", "Lcom/huawei/http/BaseResp;", TypedValues.TransitionType.S_TO, "maxCount", "T", "", "ConsumerHomeModule_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FunctionExtKt {
    private static int component1 = 0;
    private static int copydefault = 1;

    public static final Map<String, LocalHomeFunction> toLocalFunctionDefine(Map<String, RemoteHomeFunction> map) {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry<String, RemoteHomeFunction> entry : map.entrySet()) {
                int i2 = copydefault + 73;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                linkedHashMap.put(entry.getKey(), toLocalFunction$default(entry.getValue(), false, 1, null));
            }
        }
        int i4 = copydefault + 75;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return linkedHashMap;
    }

    public static LocalHomeFunction toLocalFunction$default(RemoteHomeFunction remoteHomeFunction, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 103;
        component1 = i3 % 128;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            z = true;
        }
        LocalHomeFunction localFunction = toLocalFunction(remoteHomeFunction, z);
        int i4 = component1 + 109;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return localFunction;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final LocalHomeFunction toLocalFunction(RemoteHomeFunction remoteHomeFunction, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(remoteHomeFunction, "");
            AppConfigManager.getAppConfig().getH5BaseUrl();
            remoteHomeFunction.getChildMenus();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(remoteHomeFunction, "");
        String h5BaseUrl = AppConfigManager.getAppConfig().getH5BaseUrl();
        List<RemoteHomeFunction> childMenus = remoteHomeFunction.getChildMenus();
        if (childMenus != null) {
            SortUtils.sortByOrder(childMenus);
        }
        List<LocalHomeFunction> localHomeFunction = toLocalHomeFunction(childMenus, z);
        String funcId = remoteHomeFunction.getFuncId();
        String funcName = remoteHomeFunction.getFuncName();
        String url = UrlUtils.getURL(h5BaseUrl, remoteHomeFunction.getIcon());
        String url2 = UrlUtils.getURL(h5BaseUrl, remoteHomeFunction.getBlackIcon());
        String url3 = UrlUtils.getURL(h5BaseUrl, remoteHomeFunction.getIconSelected());
        String execute = remoteHomeFunction.getExecute();
        String url4 = UrlUtils.getURL(h5BaseUrl, remoteHomeFunction.getMarker());
        boolean zAreEqual = Intrinsics.areEqual(BooleanUtils.TRUE, remoteHomeFunction.getEditEnable());
        String groupTag = remoteHomeFunction.getGroupTag();
        if (groupTag == null) {
            groupTag = "other";
        }
        LocalHomeFunction localHomeFunction2 = new LocalHomeFunction(funcId, funcName, url, url2, url3, execute, url4, null, zAreEqual, false, groupTag, remoteHomeFunction.getGroupName(), z, localHomeFunction, remoteHomeFunction.getExtraCondition(), 640, null);
        copeExtensionToOther(remoteHomeFunction, localHomeFunction2);
        int i3 = copydefault + 109;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return localHomeFunction2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean component3(java.lang.String r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.home.data.FunctionExtKt.copydefault
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.huawei.digitalpayment.home.data.FunctionExtKt.component1 = r2
            int r1 = r1 % r0
            com.huawei.digitalpayment.consumer.baselib.config.IAppConfig r1 = com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager.getAppConfig()
            boolean r1 = r1.isFilterLoginSettingMenu()
            r2 = 0
            if (r1 == 0) goto L41
            java.lang.String r1 = "login_setting"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r1 = 1
            r4 = r4 ^ r1
            if (r4 == r1) goto L41
            int r4 = com.huawei.digitalpayment.home.data.FunctionExtKt.component1
            int r4 = r4 + 87
            int r3 = r4 % 128
            com.huawei.digitalpayment.home.data.FunctionExtKt.copydefault = r3
            int r4 = r4 % r0
            if (r4 == 0) goto L39
            boolean r4 = com.huawei.biometric.LocalAuthenticationUtils.isSupport()
            if (r4 != 0) goto L41
            boolean r4 = com.huawei.biometric.BiometricUtil.isSupportBiometric()
            if (r4 != 0) goto L41
            goto L42
        L39:
            com.huawei.biometric.LocalAuthenticationUtils.isSupport()
            r4 = 0
            r4.hashCode()
            throw r4
        L41:
            r1 = r2
        L42:
            int r4 = com.huawei.digitalpayment.home.data.FunctionExtKt.component1
            int r4 = r4 + 69
            int r3 = r4 % 128
            com.huawei.digitalpayment.home.data.FunctionExtKt.copydefault = r3
            int r4 = r4 % r0
            if (r4 != 0) goto L50
            r4 = 63
            int r4 = r4 / r2
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.data.FunctionExtKt.component3(java.lang.String):boolean");
    }

    public static List toLocalHomeFunction$default(List list, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 41;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            int i5 = i4 + 123;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        List<LocalHomeFunction> localHomeFunction = toLocalHomeFunction(list, z);
        int i7 = copydefault + 39;
        component1 = i7 % 128;
        if (i7 % 2 == 0) {
            return localHomeFunction;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[EDGE_INSN: B:24:0x0073->B:20:0x0073 BREAK  A[LOOP:0: B:8:0x002a->B:27:0x002a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction> toLocalHomeFunction(java.util.List<com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction> r5, boolean r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            if (r5 == 0) goto L73
            int r2 = com.huawei.digitalpayment.home.data.FunctionExtKt.copydefault
            int r2 = r2 + 27
            int r3 = r2 % 128
            com.huawei.digitalpayment.home.data.FunctionExtKt.component1 = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L23
            com.huawei.digitalpayment.consumer.baselib.util.sort.SortUtils.sortByOrder(r5)
            java.util.Iterator r5 = r5.iterator()
            r2 = 50
            int r2 = r2 / 0
            goto L2a
        L23:
            com.huawei.digitalpayment.consumer.baselib.util.sort.SortUtils.sortByOrder(r5)
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L73
            int r2 = com.huawei.digitalpayment.home.data.FunctionExtKt.component1
            int r2 = r2 + 23
            int r3 = r2 % 128
            com.huawei.digitalpayment.home.data.FunctionExtKt.copydefault = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L4f
            java.lang.Object r2 = r5.next()
            com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction r2 = (com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction) r2
            java.lang.String r3 = r2.getFuncId()
            boolean r3 = component3(r3)
            r4 = 6
            int r4 = r4 / 0
            if (r3 == 0) goto L60
            goto L2a
        L4f:
            java.lang.Object r2 = r5.next()
            com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction r2 = (com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction) r2
            java.lang.String r3 = r2.getFuncId()
            boolean r3 = component3(r3)
            if (r3 == 0) goto L60
            goto L2a
        L60:
            com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction r2 = toLocalFunction(r2, r6)
            r1.add(r2)
            int r2 = r1.size()
            com.huawei.digitalpayment.home.util.MyServicesManager r3 = com.huawei.digitalpayment.home.util.MyServicesManager.INSTANCE
            int r3 = r3.getMaxCount()
            if (r2 < r3) goto L2a
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.data.FunctionExtKt.toLocalHomeFunction(java.util.List, boolean):java.util.List");
    }

    public static final List<LocalHomeFunction> toLocalHomeFunction(List<RemoteHomeFunction> list) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (list != null) {
            SortUtils.sortByOrder(list);
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<RemoteHomeFunction> it = list.iterator();
            int i3 = copydefault + 101;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            while (it.hasNext()) {
                arrayList.add(toLocalFunction$default(it.next(), false, 1, null));
            }
        }
        return arrayList;
    }

    public static List toLocalFunctionGroup$default(List list, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 69;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        List<LocalFunctionGroup> localFunctionGroup = toLocalFunctionGroup(list, z);
        int i5 = copydefault + 37;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return localFunctionGroup;
    }

    public static final List<LocalFunctionGroup> toLocalFunctionGroup(List<RemoteFunctionGroup> list, boolean z) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        SortUtils.sortByOrder(list);
        for (RemoteFunctionGroup remoteFunctionGroup : list) {
            int i2 = copydefault + 25;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            if (z) {
                int i4 = component1 + 103;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                List<RemoteHomeFunction> list2 = remoteFunctionGroup.getList();
                if (list2 == null || list2.isEmpty()) {
                }
            }
            List<LocalHomeFunction> localHomeFunction = toLocalHomeFunction(remoteFunctionGroup.getList());
            if (!(!z)) {
                int i6 = copydefault + 91;
                component1 = i6 % 128;
                if (i6 % 2 != 0) {
                    localHomeFunction.isEmpty();
                    throw null;
                }
                if (localHomeFunction.isEmpty()) {
                    int i7 = component1 + 27;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            arrayList.add(ShareDataUIState(remoteFunctionGroup, localHomeFunction));
        }
        return arrayList;
    }

    private static final LocalFunctionGroup ShareDataUIState(RemoteFunctionGroup remoteFunctionGroup, List<LocalHomeFunction> list) {
        int i = 2 % 2;
        LocalFunctionGroup localFunctionGroup = new LocalFunctionGroup(remoteFunctionGroup.getGroupId(), remoteFunctionGroup.getMenuType(), remoteFunctionGroup.getGroupName(), remoteFunctionGroup.getMenuName(), UrlUtils.getURL(AppConfigManager.getAppConfig().getH5BaseUrl(), remoteFunctionGroup.getMarker()), list);
        copeExtensionToOther(remoteFunctionGroup, localFunctionGroup);
        int i2 = copydefault + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return localFunctionGroup;
    }

    public static final void copeExtensionToOther(BaseResp baseResp, BaseResp baseResp2) {
        int i = 2 % 2;
        int i2 = component1 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (baseResp != null && baseResp2 != null && baseResp.getExtension() != null) {
            int i4 = copydefault + 79;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            baseResp2.setExtension(baseResp.getExtension());
            if (i5 != 0) {
                int i6 = 38 / 0;
            }
        }
        int i7 = copydefault + 119;
        component1 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public static final <T> List<T> maxCount(List<? extends T> list, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 77;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (list == null) {
            List<T> listEmptyList = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listEmptyList, "");
            return listEmptyList;
        }
        ArrayList arrayList = new ArrayList(list.subList(0, RangesKt.coerceAtMost(list.size(), i)));
        int i4 = copydefault + 119;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
        return arrayList;
    }

    public static void component2() {
        getCustom.ShareDataUIState[0] = setViewModelStore.copydefault[0];
    }
}
