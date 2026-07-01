package com.huawei.digitalpayment.consumer.base.resp;

import com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00070\u0005\u001a\n\u0010\b\u001a\u00020\u0006*\u00020\u0007\u001a\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00020\u0005¨\u0006\n"}, d2 = {"toSfcLocalHomeFunction", "Lcom/huawei/digitalpayment/consumer/base/resp/SFCLocalHomeFunction;", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "toLocalHomeFunction", "toSfcGroupList", "", "Lcom/huawei/digitalpayment/consumer/base/resp/SFCLocalHomeFunctionGroup;", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalFunctionGroup;", "toSFCLocalHomeFunctionGroup", "toSfcList", "ConsumerBaseUi_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SFCLocalHomeFunctionKt {
    private static int component2 = 0;
    private static int component3 = 1;

    public static final SFCLocalHomeFunction toSfcLocalHomeFunction(LocalHomeFunction localHomeFunction) {
        String str;
        String str2;
        String str3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(localHomeFunction, "");
        String funcName = localHomeFunction.getFuncName();
        Object obj = null;
        if (funcName == null) {
            int i2 = component2 + 53;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str = "";
        } else {
            str = funcName;
        }
        String funIcon = localHomeFunction.getFunIcon();
        String str4 = funIcon == null ? "" : funIcon;
        String execute = localHomeFunction.getExecute();
        if (execute == null) {
            int i3 = component2 + 3;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            str2 = "";
        } else {
            str2 = execute;
        }
        String funcId = localHomeFunction.getFuncId();
        if (funcId == null) {
            int i4 = component3;
            int i5 = i4 + 55;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 81;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            str3 = "";
        } else {
            str3 = funcId;
        }
        return new SFCLocalHomeFunction(str, str4, str2, str3, false, 0, 0, null, 240, null);
    }

    public static final LocalHomeFunction toLocalHomeFunction(SFCLocalHomeFunction sFCLocalHomeFunction) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sFCLocalHomeFunction, "");
        LocalHomeFunction localHomeFunction = new LocalHomeFunction(sFCLocalHomeFunction.getFunctionId(), sFCLocalHomeFunction.getFunctionName(), sFCLocalHomeFunction.getFunIcon(), null, null, sFCLocalHomeFunction.getExecute(), null, null, false, false, null, null, false, null, null, 32728, null);
        int i2 = component2 + 97;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return localHomeFunction;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final List<SFCLocalHomeFunctionGroup> toSfcGroupList(List<LocalFunctionGroup> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<LocalFunctionGroup> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toSFCLocalHomeFunctionGroup(it.next()));
            int i2 = component2 + 87;
            component3 = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = component2 + 71;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    public static final SFCLocalHomeFunctionGroup toSFCLocalHomeFunctionGroup(LocalFunctionGroup localFunctionGroup) {
        ArrayList arrayList;
        String str = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(localFunctionGroup, "");
        String groupName = localFunctionGroup.getGroupName();
        if (groupName == null) {
            int i2 = component2 + 77;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } else {
            str = groupName;
        }
        List<LocalHomeFunction> list = localFunctionGroup.getList();
        if (list == null || (arrayList = toSfcList(list)) == null) {
            arrayList = new ArrayList();
            int i3 = component3 + 37;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        }
        return new SFCLocalHomeFunctionGroup(str, arrayList);
    }

    public static final List<SFCLocalHomeFunction> toSfcList(List<LocalHomeFunction> list) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<LocalHomeFunction> it = list.iterator();
        while (it.hasNext()) {
            int i2 = component2 + 111;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(toSfcLocalHomeFunction(it.next()));
        }
        int i4 = component2 + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }
}
