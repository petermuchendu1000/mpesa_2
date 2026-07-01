package com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics;

import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.iap.ac.android.acs.operation.log.LogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0001¨\u0006\n"}, d2 = {"showVisibly", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/GuiElements;", LogConstants.Oauth.MODE, "", "editMode", "elementMode", "Lcom/huawei/digitalpayment/consumer/loginModule/register/model/dynamics/ElementMode;", "toElement", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "ConsumerLoginModule_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GuiElementsKt {
    private static int component3 = 0;
    private static int copydefault = 1;

    public static boolean showVisibly$default(GuiElements guiElements, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 7;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 45;
            int i7 = i6 % 128;
            component3 = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 41;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        }
        return showVisibly(guiElements, str, z);
    }

    public static final boolean showVisibly(GuiElements guiElements, String str, boolean z) {
        ElementMode elementMode;
        int i = 2 % 2;
        int i2 = component3 + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(guiElements, "");
        if (z) {
            int i4 = component3 + 61;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                elementMode = ElementMode.EDIT;
                int i5 = 94 / 0;
            } else {
                elementMode = ElementMode.EDIT;
            }
        } else {
            elementMode = ElementMode.CREATE;
        }
        return showVisibly(guiElements, str, elementMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean showVisibly(com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.GuiElements r3, java.lang.String r4, com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.ElementMode r5) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.GuiElementsKt.showVisibly(com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.GuiElements, java.lang.String, com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.ElementMode):boolean");
    }

    public static DynamicsElement toElement$default(GuiElements guiElements, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 67;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 85;
            copydefault = i6 % 128;
            z = !(i6 % 2 == 0);
        }
        return toElement(guiElements, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement toElement(com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.GuiElements r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.GuiElementsKt.toElement(com.huawei.digitalpayment.consumer.loginModule.register.model.dynamics.GuiElements, boolean):com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement");
    }
}
