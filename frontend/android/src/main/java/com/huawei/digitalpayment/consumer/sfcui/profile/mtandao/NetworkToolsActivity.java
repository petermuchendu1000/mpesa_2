package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.common.base.Ascii;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.base.util.PhoneDataSender;
import com.huawei.digitalpayment.consumer.base.util.ThemeUtils;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityMtandaoCombinedLayoutBinding;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData;
import com.huawei.digitalpayment.consumer.sfcui.ui.adapter.TabViewAdapter;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u001a\u001a\u00020\u0007H\u0014J\u0012\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0018H\u0003J\u001a\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020 H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/NetworkToolsActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityMtandaoCombinedLayoutBinding;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "currentPosition", "", "titles", "", "", "phoneDataSender", "Lcom/huawei/digitalpayment/consumer/base/util/PhoneDataSender;", "getPhoneDataSender", "()Lcom/huawei/digitalpayment/consumer/base/util/PhoneDataSender;", "setPhoneDataSender", "(Lcom/huawei/digitalpayment/consumer/base/util/PhoneDataSender;)V", "connectionLiveData", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;", "getConnectionLiveData", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;", "setConnectionLiveData", "(Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;)V", "initToolbar", "", "title", "getLayoutId", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "initView", "needSoftFix", "", "initTab", "updateTabView", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "selected", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class NetworkToolsActivity extends Hilt_NetworkToolsActivity<ActivityMtandaoCombinedLayoutBinding, ViewModel> {
    public static final int $stable = 8;
    private static char[] ShareDataUIState;
    private static char[] component3;
    private static int copy;
    private static char copydefault;

    @Inject
    public ConnectionLiveData connectionLiveData;
    private int currentPosition;

    @Inject
    public PhoneDataSender phoneDataSender;
    private List<String> titles;
    private static final byte[] $$l = {120, Ascii.VT, 65, 93};
    private static final int $$o = 169;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {TarHeader.LF_SYMLINK, -82, -81, 124, 5, 6, -7, -2, 6, Ascii.VT, -73, TarHeader.LF_FIFO, 13, 4, -2, 7, 0, -10, 6, -8, Ascii.SI, PSSSigner.TRAILER_IMPLICIT, TarHeader.LF_CONTIG, 2, -2, 20, -13, -56, 60, 6, 7, -14, Ascii.SO, -3, -12, Ascii.FF, -61, Ascii.ETB, 34, -2, 20, -13, -35, 45, 4, -2, 7, 0, -10, 6, -8, -27, 38, -7, 10, -37, 37, 4, -3, -71, TarHeader.LF_NORMAL, Ascii.SYN, -6, Ascii.DC2, -12, -32, Ascii.RS, 20, -18, -11, -11, Ascii.VT, 34, -18, 20, -14, 13, -1, 4, 0, 0, -8, 10, 7, -65, 13, -1, 4, 0, 0, -8, 10, 7, -64, 13, -1, -62, 58, 3, Ascii.FF, -11, Ascii.SO, -18, -51, TarHeader.LF_DIR, 0, Ascii.DC2, 3, -14, 7, 9, -15, -52, 67, -11, 3, 17, -12, -3, 19, -17, Ascii.SO, -67, 72, 0, -10, 4, -61, 35, Ascii.DC2, 7, -1, -17, Ascii.ETB, Ascii.DC2, -20, -33, Ascii.US, Ascii.FF, -8, 19, -8, -10, 20, -4, 4};
    private static final int $$t = 149;
    private static final byte[] $$d = {81, 99, 107, 124, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 38;
    private static int component4 = 1;
    private static int component2 = 0;
    private static int component1 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r6, int r7, byte r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.$$l
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r6 = r6 * 4
            int r1 = r6 + 1
            int r8 = 119 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.$$r(byte, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = 99 - r8
            int r7 = 28 - r7
            int r9 = r9 * 2
            int r9 = r9 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-8)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.i(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 9
            int r7 = r7 + 4
            int r5 = r5 * 8
            int r5 = 107 - r5
            int r0 = 73 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.$$s
            byte[] r0 = new byte[r0]
            int r6 = 72 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r5
            r5 = r6
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
        L29:
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            int r7 = r7 + 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.j(int, int, short, java.lang.Object[]):void");
    }

    public static final void access$setCurrentPosition$p(NetworkToolsActivity networkToolsActivity, int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 3;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        networkToolsActivity.currentPosition = i;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 69;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 73 / 0;
        }
    }

    public static final void access$updateTabView(NetworkToolsActivity networkToolsActivity, TabLayout.Tab tab, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        networkToolsActivity.updateTabView(tab, z);
        int i4 = component2 + 123;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
    }

    public final PhoneDataSender getPhoneDataSender() {
        int i = 2 % 2;
        int i2 = component2 + 107;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        PhoneDataSender phoneDataSender = this.phoneDataSender;
        Object obj = null;
        if (phoneDataSender != null) {
            int i5 = i3 + 119;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return phoneDataSender;
            }
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i6 = component2 + 83;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void setPhoneDataSender(PhoneDataSender phoneDataSender) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(phoneDataSender, "");
        this.phoneDataSender = phoneDataSender;
        int i4 = component2 + 125;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        r1 = 64 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r4 = r4 + 21;
        com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.component1 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if ((r4 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 47;
        r4 = r1 % 128;
        com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.component2 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData getConnectionLiveData() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.component1
            int r2 = r1 + 69
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.component2 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L18
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData r2 = r5.connectionLiveData
            r4 = 68
            int r4 = r4 / 0
            if (r2 == 0) goto L37
            goto L1c
        L18:
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData r2 = r5.connectionLiveData
            if (r2 == 0) goto L37
        L1c:
            int r1 = r1 + 47
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.component2 = r4
            int r1 = r1 % r0
            if (r1 == 0) goto L29
            r1 = 64
            int r1 = r1 / 0
        L29:
            int r4 = r4 + 21
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.component1 = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L33
            return r2
        L33:
            r3.hashCode()
            throw r3
        L37:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.getConnectionLiveData():com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData");
    }

    public final void setConnectionLiveData(ConnectionLiveData connectionLiveData) {
        int i = 2 % 2;
        int i2 = component2 + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(connectionLiveData, "");
        this.connectionLiveData = connectionLiveData;
        int i4 = component2 + 117;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = component1 + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.help_improve_your_network));
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i;
        int i2 = 2 % 2;
        int i3 = component1 + 15;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.activity_mtandao_combined_layout;
            int i4 = 65 / 0;
        } else {
            i = R.layout.activity_mtandao_combined_layout;
        }
        int i5 = component2 + 123;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i;
    }

    private static void h(byte[] bArr, boolean z, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2;
        int i3 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = component3;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 91;
                $10 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - Color.alpha(0), (KeyEvent.getMaxKeyCode() >> 16) + 14, (char) (65118 - View.MeasureSpec.getMode(0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i11 = $11 + 73;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr = new char[i5];
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                cArr = new char[i5];
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4502 - ((Process.getThreadPriority(0) + 20) >> 6), 37 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (TextUtils.getOffsetBefore("", 0) + 27897), -1464227204, false, $$r(b2, b3, (byte) (b3 | 9)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i12] = ((Character) ((Method) objCopydefault2).invoke(obj, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 3580, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27, (char) Color.alpha(0), 1180380354, false, $$r(b4, b4, (byte) $$l.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1859 - KeyEvent.normalizeMetaState(0), 35 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 80302927, false, $$r(b5, b6, (byte) (b6 + 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                obj = null;
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i14 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i14, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i14);
        }
        if (z) {
            int i15 = $11 + 107;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr6 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i17 = $11 + 97;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i5 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            int i19 = $11 + 1;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i21 = $11 + 107;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] << iArr[3]);
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
                int i22 = $10 + 79;
                $11 = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r31, char[] r32, byte r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.g(int, char[], byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d4  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.onCreate(android.os.Bundle):void");
    }

    private final void initView() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ((ActivityMtandaoCombinedLayoutBinding) this.binding).viewPager.setCurrentItem(0);
        int i4 = component1 + 1;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void initTab$lambda$0(NetworkToolsActivity networkToolsActivity, TabLayout.Tab tab, int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 11;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(networkToolsActivity, "");
        View viewInflate = LayoutInflater.from(networkToolsActivity).inflate(R.layout.custom_tab, (ViewGroup) null);
        RoundTextView roundTextView = (RoundTextView) viewInflate.findViewById(R.id.tv_title);
        List<String> list = networkToolsActivity.titles;
        Intrinsics.checkNotNull(list);
        roundTextView.setText(list.get(i));
        Intrinsics.checkNotNull(tab);
        tab.setCustomView(viewInflate);
        int i5 = component1 + 107;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void initTab() {
        int i = 2 % 2;
        ((ActivityMtandaoCombinedLayoutBinding) this.binding).viewPager.setAdapter(new TabViewAdapter(this, CollectionsKt.listOf((Object[]) new Fragment[]{new ReportNetworkIssuesFragment(), new SpeedTestFragment()})));
        ((ActivityMtandaoCombinedLayoutBinding) this.binding).viewPager.setOffscreenPageLimit(2);
        ((ActivityMtandaoCombinedLayoutBinding) this.binding).viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void onPageSelected(int position) {
                int i2 = 2 % 2;
                int i3 = copydefault + 109;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    NetworkToolsActivity.access$setCurrentPosition$p(NetworkToolsActivity.this, position);
                    int i4 = 58 / 0;
                } else {
                    NetworkToolsActivity.access$setCurrentPosition$p(NetworkToolsActivity.this, position);
                }
                int i5 = copydefault + 61;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ArrayList arrayList = new ArrayList();
        this.titles = arrayList;
        Intrinsics.checkNotNull(arrayList);
        arrayList.add(getString(R.string.report_network_issues));
        List<String> list = this.titles;
        Intrinsics.checkNotNull(list);
        list.add(getString(R.string.speed_test));
        new TabLayoutMediator(((ActivityMtandaoCombinedLayoutBinding) this.binding).tabLayout, ((ActivityMtandaoCombinedLayoutBinding) this.binding).viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final void onConfigureTab(TabLayout.Tab tab, int i2) {
                int i3 = 2 % 2;
                int i4 = component2 + 15;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                NetworkToolsActivity.$r8$lambda$I8QePDjntjCQkvnsjezeXl7AjOA(this.f$0, tab, i2);
                if (i5 != 0) {
                    throw null;
                }
            }
        }).attach();
        ((ActivityMtandaoCombinedLayoutBinding) this.binding).tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int i2 = 2 % 2;
                int i3 = component1 + 115;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(tab, "");
                NetworkToolsActivity.access$updateTabView(NetworkToolsActivity.this, tab, true);
                int i5 = component2 + 39;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                NetworkToolsActivity networkToolsActivity;
                boolean z;
                int i2 = 2 % 2;
                int i3 = component2 + 39;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(tab, "");
                    networkToolsActivity = NetworkToolsActivity.this;
                    z = true;
                } else {
                    Intrinsics.checkNotNullParameter(tab, "");
                    networkToolsActivity = NetworkToolsActivity.this;
                    z = false;
                }
                NetworkToolsActivity.access$updateTabView(networkToolsActivity, tab, z);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                int i2 = 2 % 2;
                int i3 = component2 + 123;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        updateTabView(((ActivityMtandaoCombinedLayoutBinding) this.binding).tabLayout.getTabAt(0), true);
        int i2 = component1 + 5;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void updateTabView(TabLayout.Tab tab, boolean selected) {
        int i = 2 % 2;
        View customView = tab != null ? tab.getCustomView() : null;
        Intrinsics.checkNotNull(customView);
        RoundTextView roundTextView = (RoundTextView) customView.findViewById(R.id.tv_title);
        if (!selected) {
            if (!ThemeUtils.INSTANCE.isDarkModeEnabled()) {
                roundTextView.setBackgroundColor(getColor(R.color.color_f7f7f7_light));
                roundTextView.setTextColor(getColor(R.color.color_303030_light));
                return;
            }
            int i2 = component2 + 53;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                roundTextView.setBackgroundColor(getColor(R.color.color_component_background_dark));
                roundTextView.setTextColor(getColor(R.color.text_color_dark));
                int i3 = 9 / 0;
                return;
            } else {
                roundTextView.setBackgroundColor(getColor(R.color.color_component_background_dark));
                roundTextView.setTextColor(getColor(R.color.text_color_dark));
                return;
            }
        }
        int i4 = component2 + 29;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            roundTextView.setBackgroundColor(getColor(R.color.color_35a839));
            roundTextView.setTextColor(getColor(R.color.white));
            int i5 = 17 / 0;
        } else {
            roundTextView.setBackgroundColor(getColor(R.color.color_35a839));
            roundTextView.setTextColor(getColor(R.color.white));
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = component2 + 29;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr = new Object[1];
                g((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25, new char[]{'\"', 17, 18, 3, 23, '\"', 16, '-', ' ', '\n', '\t', '.', '/', 19, AbstractJsonLexerKt.COMMA, ' ', '%', 28, AbstractJsonLexerKt.COMMA, 11, '!', 15, 2, 18, Typography.amp, 24}, (byte) (74 - TextUtils.lastIndexOf("", '0')), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952810_res_0x7f1304aa).substring(9, 10).length() + 17, new char[]{19, '(', 13817, 13817, 17, 14, '/', '\'', 13819, 13819, 29, 31, '\n', '!', AbstractJsonLexerKt.COMMA, ' ', '\"', 27}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 12), objArr2);
                baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                    int i3 = component1 + 15;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 6618, 42 - TextUtils.getTrimmedLength(""), (char) View.combineMeasuredStates(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6561, (Process.myTid() >> 22) + 56, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            super.onResume();
            return;
        }
        getBaseContext();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b6  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(67:0|2|(2:4|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|772|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0))(0)|31|763|32|(2:801|34)|38|39|(5:808|(5:41|42|(1:44)|45|46)(21:47|48|745|49|(3:51|741|52)|56|57|809|58|(2:779|60)|64|65|66|(2:68|69)|70|71|72|(1:74)|75|(1:77)|78)|79|(4:82|(3:819|84|822)(12:818|85|(3:87|(3:90|91|88)|823)|92|795|93|(1:95)|96|97|783|98|821)|820|80)|817)|139|775|140|(1:142)|143|(1:145)|146|(3:148|(1:150)|151)(6:152|(2:154|(1:160)(1:159))(1:161)|(18:163|759|164|(1:166)|167|168|747|169|(1:171)|172|173|174|(1:176)|177|(1:179)|180|(1:182)|183)(45:238|807|239|(1:241)|242|243|(4:245|246|(1:248)|249)(19:250|251|791|252|(1:254)|255|256|781|257|(1:259)|260|261|262|(1:264)|265|(1:267)|268|(1:270)|271)|272|(4:275|(3:830|277|833)(12:829|278|(3:280|(3:283|284|281)|834)|285|765|286|(1:288)|289|290|751|291|832)|831|273)|828|304|(27:806|329|(3:331|332|(2:334|336)(1:335))(1:336)|373|778|374|(1:376)|377|(3:379|(1:381)|382)(14:384|385|767|386|(1:388)|389|390|391|(1:393)|394|(1:396)(1:397)|398|(1:400)|401)|383|402|(9:405|753|406|(1:408)|409|410|411|738|412)|442|(1:444)|445|(1:447)|448|(3:450|(1:452)|453)(16:455|456|(1:458)|459|(1:461)|462|463|(1:465)|466|776|467|468|(1:470)|471|(1:473)|474)|454|475|(1:477)(9:478|(3:480|(2:483|481)|853)|484|485|(1:487)|488|(1:490)|491|492)|493|(1:495)|496|(3:498|(1:500)|501)(14:502|503|(1:505)|506|507|(1:509)|510|769|511|512|(1:514)|515|(1:517)|518)|519|(25:521|771|522|(1:524)|525|(1:527)|528|(3:530|(1:532)|533)(17:534|(2:536|(1:542)(1:541))|(19:544|545|757|546|(1:548)|549|550|743|551|(1:553)|554|555|556|(1:558)|559|(1:561)|562|(1:564)|565)|628|(1:630)|631|(3:633|(1:635)|636)(13:638|785|639|640|(1:642)|643|797|644|645|(1:647)|648|(1:650)|651)|637|652|(6:655|656|(1:658)|659|660|661)|662|(1:664)|665|(3:667|(1:669)|670)(14:672|673|(1:675)|676|677|(1:679)|680|811|681|682|(1:684)|685|(1:687)|688)|671|689|(1:854)(7:692|693|(1:695)|696|697|698|699))|566|(4:569|(3:840|571|(3:838|573|845)(12:837|577|(3:579|(4:582|(3:848|584|851)(4:847|585|586|850)|849|580)|846)|587|813|588|(1:590)|591|592|799|593|844))(3:836|574|(3:839|576|843)(12:841|577|(0)|587|813|588|(0)|591|592|799|593|844))|842|567)|835|628|(0)|631|(0)(0)|637|652|(0)|662|(0)|665|(0)(0)|671|689|(0)(0))(10:709|(3:711|(2:714|712)|852)|715|716|(1:718)|719|(1:721)|722|723|724))(1:340)|341|773|342|(1:344)|345|761|346|(1:348)|349|373|778|374|(0)|377|(0)(0)|383|402|(0)|442|(0)|445|(0)|448|(0)(0)|454|475|(0)(0)|493|(0)|496|(0)(0)|519|(0)(0))|729|730|(1:732)(1:733))|184|(4:187|(2:189|826)(11:190|(3:192|(3:195|196|193)|827)|197|815|198|(1:200)|201|202|802|203|825)|204|185)|824|238|807|239|(0)|242|243|(0)(0)|272|(1:273)|828|304|(0)(0)|341|773|342|(0)|345|761|346|(0)|349|373|778|374|(0)|377|(0)(0)|383|402|(0)|442|(0)|445|(0)|448|(0)(0)|454|475|(0)(0)|493|(0)|496|(0)(0)|519|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0e3d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0e3e, code lost:
    
        r7 = new java.lang.Object[1];
        g((android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 10, new char[]{'+', 24, '*', 3, '(', 27, '+', kotlin.text.Typography.amp, '.', kotlin.text.Typography.amp, 13757}, (byte) (((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2), r7);
        r4 = (java.lang.String) r7[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0e81, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r2);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0e98, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0e9c, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r4);
        r14 = -1;
        r4 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r4 = r4 | ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0eca, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0ece, code lost:
    
        if (r1 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0ed0, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 6618, 42 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) android.view.View.combineMeasuredStates(0, 0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0efb, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0f03, code lost:
    
        r9 = new java.lang.Object[]{238210898, java.lang.Long.valueOf(r4), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.widget.ExpandableListView.getPackedPositionGroup(0) + 6562, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 56, (char) android.widget.ExpandableListView.getPackedPositionGroup(0));
        r5 = (byte) (-com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.$$s[77]);
        r10 = new java.lang.Object[1];
        j(r5, (byte) (r5 | 62), r4[110(0x6e, float:1.54E-43)], r10);
        r2.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x1399, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x139a, code lost:
    
        r6 = new java.lang.Object[1];
        h(new byte[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}, true, new int[]{159, 11, 0, 10}, r6);
        r2 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x13b7, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r4);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r4.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x13ce, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x13d2, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r1);
        r4.add(r2);
        r14 = -1;
        r5 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r1 = ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32))) | r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x1402, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x1406, code lost:
    
        if (r5 == null) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x1408, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 6618, android.widget.ExpandableListView.getPackedPositionChild(0) + 43, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x1433, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x143b, code lost:
    
        r9 = new java.lang.Object[]{238210898, java.lang.Long.valueOf(r1), r4, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 6562, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 57, (char) android.graphics.Color.blue(0));
        r4 = (byte) (-com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.$$s[77]);
        r10 = new java.lang.Object[1];
        j(r4, (byte) (r4 | 62), r2[110(0x6e, float:1.54E-43)], r10);
        r1.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x1a82, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x1a83, code lost:
    
        r10 = new java.lang.Object[1];
        g(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952832_res_0x7f1304c0).substring(0, 1).length() + 10, new char[]{'\f', 27, '\f', 27, '#', '%', '(', '#', '\b', ')', 13802}, (byte) (((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131955137_res_0x7f130dc1).substring(0, 3).length() + 57), r10);
        r4 = (java.lang.String) r10[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x1af6, code lost:
    
        r5 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r5);
        r0.printStackTrace(r6);
        r6.close();
        r2 = r5.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x1b0d, code lost:
    
        r2 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x1b11, code lost:
    
        r5 = new java.util.ArrayList(2);
        r5.add(r2);
        r5.add(r4);
        r14 = -1;
        r6 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r6 = r6 | ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x1b40, code lost:
    
        r2 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x1b44, code lost:
    
        if (r2 == null) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x1b46, code lost:
    
        r2 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6619 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), 42 - android.view.View.resolveSize(0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x1b73, code lost:
    
        r2 = ((java.lang.reflect.Method) r2).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x1b7b, code lost:
    
        r10 = new java.lang.Object[]{238210898, java.lang.Long.valueOf(r6), r5, null, false};
        r4 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6563 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), android.text.TextUtils.lastIndexOf("", '0', 0) + 57, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
        r6 = (byte) (-com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.$$s[77]);
        r11 = new java.lang.Object[1];
        j(r6, (byte) (r6 | 62), r5[110(0x6e, float:1.54E-43)], r11);
        r4.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r2, r10);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0808 A[Catch: all -> 0x033d, TryCatch #18 {all -> 0x033d, blocks: (B:656:0x2f6c, B:658:0x2f72, B:659:0x2f99, B:693:0x32c8, B:695:0x32ce, B:696:0x32f9, B:673:0x3100, B:675:0x3123, B:676:0x3181, B:622:0x2c23, B:624:0x2c29, B:625:0x2c54, B:716:0x33e1, B:718:0x33e7, B:719:0x3415, B:721:0x344f, B:722:0x3497, B:503:0x246c, B:505:0x2481, B:506:0x24b6, B:485:0x212f, B:487:0x2135, B:488:0x2160, B:490:0x219a, B:491:0x21e5, B:456:0x1db4, B:458:0x1dc9, B:459:0x1dfb, B:461:0x1e2f, B:462:0x1eb0, B:436:0x1b40, B:438:0x1b46, B:439:0x1b73, B:367:0x1660, B:369:0x1666, B:370:0x168e, B:321:0x1402, B:323:0x1408, B:324:0x1433, B:232:0x0eca, B:234:0x0ed0, B:235:0x0efb, B:133:0x0802, B:135:0x0808, B:136:0x0836, B:19:0x011d, B:21:0x0123, B:22:0x0149, B:24:0x02ab, B:26:0x02dd, B:27:0x0337), top: B:772:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x08c1 A[Catch: all -> 0x0e3d, TryCatch #20 {all -> 0x0e3d, blocks: (B:140:0x08bb, B:142:0x08c1, B:143:0x090a, B:145:0x0931, B:146:0x0978, B:148:0x098f, B:150:0x0998, B:151:0x09e2, B:184:0x0cf8, B:185:0x0cfc, B:187:0x0d02, B:190:0x0d1c, B:193:0x0d28, B:195:0x0d2b, B:207:0x0e17, B:209:0x0e1d, B:210:0x0e1e, B:212:0x0e20, B:214:0x0e27, B:215:0x0e28, B:154:0x09f4, B:156:0x09f8, B:163:0x0a0c, B:174:0x0bdc, B:176:0x0be2, B:177:0x0c29, B:179:0x0c53, B:180:0x0c98, B:182:0x0cae, B:183:0x0cf2, B:217:0x0e2a, B:219:0x0e31, B:220:0x0e32, B:222:0x0e34, B:224:0x0e3b, B:225:0x0e3c, B:160:0x0a04, B:169:0x0b2e, B:171:0x0b52, B:172:0x0bd0, B:164:0x0ae5, B:166:0x0af9, B:167:0x0b27, B:203:0x0d97, B:198:0x0d59, B:200:0x0d5f, B:201:0x0d8f), top: B:775:0x08bb, outer: #1, inners: #5, #11, #35, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0931 A[Catch: all -> 0x0e3d, TryCatch #20 {all -> 0x0e3d, blocks: (B:140:0x08bb, B:142:0x08c1, B:143:0x090a, B:145:0x0931, B:146:0x0978, B:148:0x098f, B:150:0x0998, B:151:0x09e2, B:184:0x0cf8, B:185:0x0cfc, B:187:0x0d02, B:190:0x0d1c, B:193:0x0d28, B:195:0x0d2b, B:207:0x0e17, B:209:0x0e1d, B:210:0x0e1e, B:212:0x0e20, B:214:0x0e27, B:215:0x0e28, B:154:0x09f4, B:156:0x09f8, B:163:0x0a0c, B:174:0x0bdc, B:176:0x0be2, B:177:0x0c29, B:179:0x0c53, B:180:0x0c98, B:182:0x0cae, B:183:0x0cf2, B:217:0x0e2a, B:219:0x0e31, B:220:0x0e32, B:222:0x0e34, B:224:0x0e3b, B:225:0x0e3c, B:160:0x0a04, B:169:0x0b2e, B:171:0x0b52, B:172:0x0bd0, B:164:0x0ae5, B:166:0x0af9, B:167:0x0b27, B:203:0x0d97, B:198:0x0d59, B:200:0x0d5f, B:201:0x0d8f), top: B:775:0x08bb, outer: #1, inners: #5, #11, #35, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x098f A[Catch: all -> 0x0e3d, TryCatch #20 {all -> 0x0e3d, blocks: (B:140:0x08bb, B:142:0x08c1, B:143:0x090a, B:145:0x0931, B:146:0x0978, B:148:0x098f, B:150:0x0998, B:151:0x09e2, B:184:0x0cf8, B:185:0x0cfc, B:187:0x0d02, B:190:0x0d1c, B:193:0x0d28, B:195:0x0d2b, B:207:0x0e17, B:209:0x0e1d, B:210:0x0e1e, B:212:0x0e20, B:214:0x0e27, B:215:0x0e28, B:154:0x09f4, B:156:0x09f8, B:163:0x0a0c, B:174:0x0bdc, B:176:0x0be2, B:177:0x0c29, B:179:0x0c53, B:180:0x0c98, B:182:0x0cae, B:183:0x0cf2, B:217:0x0e2a, B:219:0x0e31, B:220:0x0e32, B:222:0x0e34, B:224:0x0e3b, B:225:0x0e3c, B:160:0x0a04, B:169:0x0b2e, B:171:0x0b52, B:172:0x0bd0, B:164:0x0ae5, B:166:0x0af9, B:167:0x0b27, B:203:0x0d97, B:198:0x0d59, B:200:0x0d5f, B:201:0x0d8f), top: B:775:0x08bb, outer: #1, inners: #5, #11, #35, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0d02 A[Catch: all -> 0x0e3d, TryCatch #20 {all -> 0x0e3d, blocks: (B:140:0x08bb, B:142:0x08c1, B:143:0x090a, B:145:0x0931, B:146:0x0978, B:148:0x098f, B:150:0x0998, B:151:0x09e2, B:184:0x0cf8, B:185:0x0cfc, B:187:0x0d02, B:190:0x0d1c, B:193:0x0d28, B:195:0x0d2b, B:207:0x0e17, B:209:0x0e1d, B:210:0x0e1e, B:212:0x0e20, B:214:0x0e27, B:215:0x0e28, B:154:0x09f4, B:156:0x09f8, B:163:0x0a0c, B:174:0x0bdc, B:176:0x0be2, B:177:0x0c29, B:179:0x0c53, B:180:0x0c98, B:182:0x0cae, B:183:0x0cf2, B:217:0x0e2a, B:219:0x0e31, B:220:0x0e32, B:222:0x0e34, B:224:0x0e3b, B:225:0x0e3c, B:160:0x0a04, B:169:0x0b2e, B:171:0x0b52, B:172:0x0bd0, B:164:0x0ae5, B:166:0x0af9, B:167:0x0b27, B:203:0x0d97, B:198:0x0d59, B:200:0x0d5f, B:201:0x0d8f), top: B:775:0x08bb, outer: #1, inners: #5, #11, #35, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0f86 A[Catch: all -> 0x1399, TryCatch #38 {all -> 0x1399, blocks: (B:239:0x0f80, B:241:0x0f86, B:242:0x0fce, B:246:0x0fe8, B:248:0x0fee, B:249:0x1034, B:272:0x1257, B:273:0x125b, B:275:0x1261, B:278:0x1279, B:281:0x1286, B:283:0x1289, B:295:0x136f, B:297:0x1375, B:298:0x1376, B:300:0x1378, B:302:0x137f, B:303:0x1380, B:250:0x103f, B:262:0x1133, B:264:0x1139, B:265:0x1182, B:267:0x11ac, B:268:0x11f4, B:270:0x120a, B:271:0x1251, B:306:0x1386, B:308:0x138d, B:309:0x138e, B:311:0x1390, B:313:0x1397, B:314:0x1398, B:291:0x12ee, B:286:0x12b6, B:288:0x12bc, B:289:0x12e6, B:257:0x10a6, B:259:0x10bb, B:260:0x1127, B:252:0x105f, B:254:0x1074, B:255:0x109f), top: B:807:0x0f80, outer: #1, inners: #7, #14, #24, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0fdb  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x103f A[Catch: all -> 0x1399, TRY_LEAVE, TryCatch #38 {all -> 0x1399, blocks: (B:239:0x0f80, B:241:0x0f86, B:242:0x0fce, B:246:0x0fe8, B:248:0x0fee, B:249:0x1034, B:272:0x1257, B:273:0x125b, B:275:0x1261, B:278:0x1279, B:281:0x1286, B:283:0x1289, B:295:0x136f, B:297:0x1375, B:298:0x1376, B:300:0x1378, B:302:0x137f, B:303:0x1380, B:250:0x103f, B:262:0x1133, B:264:0x1139, B:265:0x1182, B:267:0x11ac, B:268:0x11f4, B:270:0x120a, B:271:0x1251, B:306:0x1386, B:308:0x138d, B:309:0x138e, B:311:0x1390, B:313:0x1397, B:314:0x1398, B:291:0x12ee, B:286:0x12b6, B:288:0x12bc, B:289:0x12e6, B:257:0x10a6, B:259:0x10bb, B:260:0x1127, B:252:0x105f, B:254:0x1074, B:255:0x109f), top: B:807:0x0f80, outer: #1, inners: #7, #14, #24, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x1261 A[Catch: all -> 0x1399, TryCatch #38 {all -> 0x1399, blocks: (B:239:0x0f80, B:241:0x0f86, B:242:0x0fce, B:246:0x0fe8, B:248:0x0fee, B:249:0x1034, B:272:0x1257, B:273:0x125b, B:275:0x1261, B:278:0x1279, B:281:0x1286, B:283:0x1289, B:295:0x136f, B:297:0x1375, B:298:0x1376, B:300:0x1378, B:302:0x137f, B:303:0x1380, B:250:0x103f, B:262:0x1133, B:264:0x1139, B:265:0x1182, B:267:0x11ac, B:268:0x11f4, B:270:0x120a, B:271:0x1251, B:306:0x1386, B:308:0x138d, B:309:0x138e, B:311:0x1390, B:313:0x1397, B:314:0x1398, B:291:0x12ee, B:286:0x12b6, B:288:0x12bc, B:289:0x12e6, B:257:0x10a6, B:259:0x10bb, B:260:0x1127, B:252:0x105f, B:254:0x1074, B:255:0x109f), top: B:807:0x0f80, outer: #1, inners: #7, #14, #24, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x14dc  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x14f3 A[Catch: all -> 0x15bd, TryCatch #19 {all -> 0x15bd, blocks: (B:342:0x14de, B:344:0x14f3, B:345:0x1526), top: B:773:0x14de, outer: #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x1539 A[Catch: all -> 0x15b3, TryCatch #12 {all -> 0x15b3, blocks: (B:346:0x152c, B:348:0x1539, B:349:0x15ab), top: B:761:0x152c, outer: #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x1721 A[Catch: all -> 0x1a82, TryCatch #22 {all -> 0x1a82, blocks: (B:374:0x171b, B:376:0x1721, B:377:0x1767, B:379:0x1774, B:381:0x177d, B:382:0x17bd, B:402:0x1977, B:410:0x19e2, B:416:0x1a66, B:418:0x1a6c, B:419:0x1a6d, B:421:0x1a6f, B:423:0x1a76, B:424:0x1a77, B:384:0x17c9, B:391:0x1852, B:393:0x1858, B:394:0x189e, B:396:0x18c8, B:398:0x190f, B:400:0x1925, B:401:0x196d, B:426:0x1a79, B:428:0x1a80, B:429:0x1a81, B:412:0x19e8, B:406:0x19ab, B:408:0x19b1, B:409:0x19db, B:386:0x17e9, B:388:0x17fb, B:389:0x1846), top: B:778:0x171b, outer: #1, inners: #0, #8, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x1774 A[Catch: all -> 0x1a82, TryCatch #22 {all -> 0x1a82, blocks: (B:374:0x171b, B:376:0x1721, B:377:0x1767, B:379:0x1774, B:381:0x177d, B:382:0x17bd, B:402:0x1977, B:410:0x19e2, B:416:0x1a66, B:418:0x1a6c, B:419:0x1a6d, B:421:0x1a6f, B:423:0x1a76, B:424:0x1a77, B:384:0x17c9, B:391:0x1852, B:393:0x1858, B:394:0x189e, B:396:0x18c8, B:398:0x190f, B:400:0x1925, B:401:0x196d, B:426:0x1a79, B:428:0x1a80, B:429:0x1a81, B:412:0x19e8, B:406:0x19ab, B:408:0x19b1, B:409:0x19db, B:386:0x17e9, B:388:0x17fb, B:389:0x1846), top: B:778:0x171b, outer: #1, inners: #0, #8, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x17c9 A[Catch: all -> 0x1a82, TRY_LEAVE, TryCatch #22 {all -> 0x1a82, blocks: (B:374:0x171b, B:376:0x1721, B:377:0x1767, B:379:0x1774, B:381:0x177d, B:382:0x17bd, B:402:0x1977, B:410:0x19e2, B:416:0x1a66, B:418:0x1a6c, B:419:0x1a6d, B:421:0x1a6f, B:423:0x1a76, B:424:0x1a77, B:384:0x17c9, B:391:0x1852, B:393:0x1858, B:394:0x189e, B:396:0x18c8, B:398:0x190f, B:400:0x1925, B:401:0x196d, B:426:0x1a79, B:428:0x1a80, B:429:0x1a81, B:412:0x19e8, B:406:0x19ab, B:408:0x19b1, B:409:0x19db, B:386:0x17e9, B:388:0x17fb, B:389:0x1846), top: B:778:0x171b, outer: #1, inners: #0, #8, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x1989  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x1c02  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x1c6e  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x1ccc  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x1d96  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x1fe8  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x20ef  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x230e  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x2360  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x244b  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x25fc  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x2a9b  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x2ae5 A[Catch: all -> 0x2b9e, TryCatch #42 {all -> 0x2b9e, blocks: (B:588:0x2adf, B:590:0x2ae5, B:591:0x2b0f), top: B:813:0x2adf, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:630:0x2ce8  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x2d3a  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x2d92  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x2f4e  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x3035  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x308d  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x30e2  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x32a8  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x3394  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x352e  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x352f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00fa A[PHI: r12
  0x00fa: PHI (r12v87 char) = (r12v8 char), (r12v88 char) binds: [B:17:0x0118, B:5:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:806:0x14b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:854:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0100 A[PHI: r12
  0x0100: PHI (r12v8 char) = (r12v7 char), (r12v89 char) binds: [B:3:0x00f2, B:5:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v82 */
    /* JADX WARN: Type inference failed for: r12v83 */
    /* JADX WARN: Type inference failed for: r12v91 */
    /* JADX WARN: Type inference failed for: r12v92 */
    /* JADX WARN: Type inference failed for: r12v93 */
    /* JADX WARN: Type inference failed for: r12v94 */
    /* JADX WARN: Type inference failed for: r12v95 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.NetworkToolsActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$I8QePDjntjCQkvnsjezeXl7AjOA(NetworkToolsActivity networkToolsActivity, TabLayout.Tab tab, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        initTab$lambda$0(networkToolsActivity, tab, i);
        int i5 = component1 + 53;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        copy = 0;
        component3();
        int i = component4 + 73;
        copy = i % 128;
        int i2 = i % 2;
    }

    @Override
    public boolean needSoftFix() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 87;
        component2 = i3 % 128;
        boolean z = !(i3 % 2 != 0);
        int i4 = i2 + 71;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component2 + 119;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component3() {
        ShareDataUIState = new char[]{1973, 2003, 1961, 2026, 2034, 1952, 1978, 2029, 2033, 2041, 2023, 2032, 2019, 1969, 1964, 2035, 2021, 2020, 2005, 2024, 2030, 2022, 1972, 1963, 1968, 2018, 1975, 2031, 2028, 2004, 2025, 2017, 1962, 2037, 1967, 2038, 1976, 1965, 1960, 1974, 1985, 1977, 1954, 2000, 1966, 1971, 2036, 1970, 1955};
        copydefault = (char) 12829;
        component3 = new char[]{33436, 33455, 33415, 33414, 33415, 33414, 33453, 33368, 33370, 33458, 33419, 33419, 33414, 33453, 33454, 33415, 33457, 33457, 33414, 33415, 33416, 33411, 33412, 33413, 33453, 33453, 33453, 33457, 33419, 33458, 33455, 33416, 33456, 33455, 33416, 33456, 33456, 33415, 33454, 33455, 33414, 33412, 33412, 33415, 33416, 33414, 33455, 33367, 33368, 33456, 33417, 33416, 33453, 33367, 33368, 33455, 33414, 33416, 33415, 33416, 33457, 33453, 33452, 33456, 33475, 33516, 33520, 33517, 33518, 33519, 33441, 33425, 33374, 33426, 33419, 33422, 33441, 33420, 33417, 33422, 33418, 33373, 33422, 33373, 33420, 33429, 33440, 33426, 33422, 33441, 33429, 33420, 33421, 33421, 33422, 33429, 33426, 33418, 33426, 33426, 33429, 33420, 33440, 33423, 33422, 33420, 33515, 33464, 33459, 33411, 33415, 33455, 33458, 33416, 33468, 33446, 33454, 33454, 33451, 33459, 33464, 33462, 33518, 33462, 33458, 33416, 33415, 33462, 33459, 33452, 33449, 33465, 33439, 33423, 33454, 33425, 33430, 33465, 33459, 33455, 33460, 33462, 33464, 33465, 33366, 33737, 33739, 33737, 33728, 33733, 33741, 33750, 33750, 33742, 33739, 33729, 33731, 33734, 33736, 33476, 33512, 33514, 33515, 33513, 33512, 33513, 33513, 33514, 33516, 33517, 33478, 33515, 33513, 33512, 33513, 33513, 33514, 33516, 33514, 33512};
    }
}
