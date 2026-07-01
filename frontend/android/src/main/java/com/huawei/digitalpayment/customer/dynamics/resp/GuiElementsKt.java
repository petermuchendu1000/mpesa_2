package com.huawei.digitalpayment.customer.dynamics.resp;

import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.huawei.digitalpayment.customer.dynamics.model.ElementMode;
import com.iap.ac.android.acs.operation.log.LogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0001¨\u0006\n"}, d2 = {"showVisibly", "", "Lcom/huawei/digitalpayment/customer/dynamics/resp/GuiElements;", LogConstants.Oauth.MODE, "", "editMode", "elementMode", "Lcom/huawei/digitalpayment/customer/dynamics/model/ElementMode;", "toElement", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "DynamicsView_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GuiElementsKt {
    private static int ShareDataUIState = 1;
    private static int component1;

    public static boolean showVisibly$default(GuiElements guiElements, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 113;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 43;
            ShareDataUIState = i6 % 128;
            z = i6 % 2 != 0;
        }
        return showVisibly(guiElements, str, z);
    }

    public static final boolean showVisibly(GuiElements guiElements, String str, boolean z) {
        ElementMode elementMode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(guiElements, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(guiElements, "");
        if (z) {
            elementMode = ElementMode.EDIT;
            int i3 = component1 + 47;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        } else {
            elementMode = ElementMode.CREATE;
        }
        return showVisibly(guiElements, str, elementMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r5
  0x0029: PHI (r5v3 java.lang.String) = (r5v2 java.lang.String), (r5v52 java.lang.String) binds: [B:8:0x0027, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean showVisibly(com.huawei.digitalpayment.customer.dynamics.resp.GuiElements r5, java.lang.String r6, com.huawei.digitalpayment.customer.dynamics.model.ElementMode r7) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.resp.GuiElementsKt.showVisibly(com.huawei.digitalpayment.customer.dynamics.resp.GuiElements, java.lang.String, com.huawei.digitalpayment.customer.dynamics.model.ElementMode):boolean");
    }

    public static DynamicsElement toElement$default(GuiElements guiElements, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 5;
        component1 = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            int i5 = i3 + 75;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        return toElement(guiElements, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064 A[PHI: r3 r5
  0x0064: PHI (r3v27 java.lang.String) = (r3v5 java.lang.String), (r3v29 java.lang.String) binds: [B:8:0x0051, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r5v12 boolean) = (r5v2 boolean), (r5v14 boolean) binds: [B:8:0x0051, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0053 A[PHI: r3 r5 r6
  0x0053: PHI (r3v6 java.lang.String) = (r3v5 java.lang.String), (r3v29 java.lang.String) binds: [B:8:0x0051, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r5v3 boolean) = (r5v2 boolean), (r5v14 boolean) binds: [B:8:0x0051, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r6v2 java.lang.Integer) = (r6v1 java.lang.Integer), (r6v12 java.lang.Integer) binds: [B:8:0x0051, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement toElement(com.huawei.digitalpayment.customer.dynamics.resp.GuiElements r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.resp.GuiElementsKt.toElement(com.huawei.digitalpayment.customer.dynamics.resp.GuiElements, boolean):com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement");
    }
}
