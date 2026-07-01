package com.huawei.digitalpayment.consumer.home.ui.compose;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsCategory;
import com.huawei.digitalpayment.consumer.sfcui.utils.QuickAction;
import com.huawei.digitalpayment.consumer.sfcui.utils.QuickActionSection;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003Ja\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\nHÇ\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010$\u001a\u00020%H×\u0001J\t\u0010&\u001a\u00020\bH×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0016¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsState;", "", "allQuickActions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickActionSection;", "currentSelectedQuickActions", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/QuickAction;", "searchQuery", "", "isInEditMode", "", "filterOptions", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory;", "currentFilter", GriverMonitorConstants.KEY_IS_LOADING, "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;ZLkotlinx/collections/immutable/ImmutableList;Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory;Z)V", "getAllQuickActions", "()Lkotlinx/collections/immutable/ImmutableList;", "getCurrentSelectedQuickActions", "getSearchQuery", "()Ljava/lang/String;", "()Z", "getFilterOptions", "getCurrentFilter", "()Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionsCategory;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickActionsState {
    public static final int $stable;
    private static int copy;
    private static int equals;
    private final ImmutableList<QuickActionSection> ShareDataUIState;
    private final QuickActionsCategory component1;
    private final ImmutableList<QuickAction> component2;
    private final ImmutableList<QuickActionsCategory> component3;
    private final String component4;
    private final boolean copydefault;
    private final boolean getAsAtTimestamp;
    private static final byte[] $$c = {94, -53, Ascii.FS, -60};
    private static final int $$f = 50;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {120, -62, 63, 57, 10, -4, -65, TarHeader.LF_CONTIG, 6, -2, -10, 3, -9, -57, TarHeader.LF_CHR, 13, 5, -11, 2, -7, -67, 68, -13, 3, -5, -63, 67, 0, -21, Ascii.DLE, -10, -9, -57, 17, 34, Ascii.FF, -48, Ascii.SUB, Ascii.NAK, -48, Ascii.ETB, 0, -67, Ascii.VT, 19, -9, Ascii.SI, -15, -35, Ascii.ESC, 17, -21, -14, -14, 8, Ascii.US, -21, 17, -17};
    private static final int $$e = 140;
    private static final byte[] $$a = {120, -62, 63, 57, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -40, 39, Ascii.US, 7, 38, 34};
    private static final int $$b = 171;
    private static int getSponsorBeneficiariesState = 0;
    private static int getShareableDataState = 1;
    private static int getRequestBeneficiariesState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r5, byte r6, short r7) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 1
            int r5 = r5 * 4
            int r5 = 4 - r5
            int r7 = r7 * 4
            int r7 = 65 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsState.$$c
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L16
            r7 = r5
            r3 = r6
            goto L29
        L16:
            r4 = r7
            r7 = r5
            r5 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r0[r2] = r3
            if (r2 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L27:
            r3 = r1[r7]
        L29:
            int r3 = -r3
            int r5 = r5 + r3
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsState.$$g(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r0 = 10 - r7
            int r6 = r6 * 2
            int r6 = 101 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsState.$$a
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r7 = 9 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r8 = r8 + r4
            int r8 = r8 + (-27)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsState.a(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsState.$$d
            int r8 = r8 * 25
            int r1 = r8 + 16
            int r6 = r6 * 40
            int r6 = 44 - r6
            byte[] r1 = new byte[r1]
            int r8 = r8 + 15
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r6
            int r6 = r7 + 1
            int r7 = r3 + 2
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsState.c(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuickActionsState(ImmutableList<QuickActionSection> immutableList, ImmutableList<QuickAction> immutableList2, String str, boolean z, ImmutableList<? extends QuickActionsCategory> immutableList3, QuickActionsCategory quickActionsCategory, boolean z2) {
        Intrinsics.checkNotNullParameter(immutableList, "");
        Intrinsics.checkNotNullParameter(immutableList2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(immutableList3, "");
        Intrinsics.checkNotNullParameter(quickActionsCategory, "");
        this.ShareDataUIState = immutableList;
        this.component2 = immutableList2;
        this.component4 = str;
        this.copydefault = z;
        this.component3 = immutableList3;
        this.component1 = quickActionsCategory;
        this.getAsAtTimestamp = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickActionsState(ImmutableList immutableList, ImmutableList immutableList2, String str, boolean z, ImmutableList immutableList3, QuickActionsCategory quickActionsCategory, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        PersistentList persistentListPersistentListOf;
        PersistentList persistentListPersistentListOf2;
        PersistentList persistentListPersistentListOf3;
        QuickActionsCategory.All all;
        if ((i & 1) != 0) {
            persistentListPersistentListOf = ExtensionsKt.persistentListOf();
            int i2 = getSponsorBeneficiariesState + 85;
            getShareableDataState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
        } else {
            persistentListPersistentListOf = immutableList;
        }
        if ((i & 2) != 0) {
            persistentListPersistentListOf2 = ExtensionsKt.persistentListOf();
            int i4 = getSponsorBeneficiariesState + 17;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } else {
            persistentListPersistentListOf2 = immutableList2;
        }
        String str2 = (i & 4) != 0 ? "" : str;
        boolean z3 = (i & 8) != 0 ? false : z;
        if ((i & 16) != 0) {
            int i7 = getShareableDataState + 53;
            getSponsorBeneficiariesState = i7 % 128;
            if (i7 % 2 != 0) {
                persistentListPersistentListOf3 = ExtensionsKt.persistentListOf();
                int i8 = 90 / 0;
            } else {
                persistentListPersistentListOf3 = ExtensionsKt.persistentListOf();
            }
        } else {
            persistentListPersistentListOf3 = immutableList3;
        }
        if ((i & 32) != 0) {
            all = QuickActionsCategory.All.INSTANCE;
            int i9 = getSponsorBeneficiariesState + 29;
            getShareableDataState = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 5 / 2;
            } else {
                int i11 = 2 % 2;
            }
        } else {
            all = quickActionsCategory;
        }
        this(persistentListPersistentListOf, persistentListPersistentListOf2, str2, z3, persistentListPersistentListOf3, all, (i & 64) == 0 ? z2 : false);
    }

    public final ImmutableList<QuickActionSection> getAllQuickActions() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 99;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final ImmutableList<QuickAction> getCurrentSelectedQuickActions() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 33;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ImmutableList<QuickAction> immutableList = this.component2;
        int i4 = i2 + 83;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return immutableList;
    }

    public final String getSearchQuery() {
        String str;
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 77;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component4;
            int i4 = 46 / 0;
        } else {
            str = this.component4;
        }
        int i5 = i2 + 55;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean isInEditMode() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 123;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copydefault;
        int i5 = i2 + 61;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final ImmutableList<QuickActionsCategory> getFilterOptions() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 67;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        ImmutableList<QuickActionsCategory> immutableList = this.component3;
        int i5 = i3 + 69;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return immutableList;
    }

    public final QuickActionsCategory getCurrentFilter() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 97;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 67;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.getAsAtTimestamp;
        int i4 = i2 + 55;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
            int i5 = $10 + 57;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(copy)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 3784, ExpandableListView.getPackedPositionGroup(0L) + 38, (char) (26861 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 2015799920, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 7407, 15 - Process.getGidForName(""), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            char[] cArr4 = new char[i];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                int i8 = $11 + 43;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 7406, TextUtils.indexOf("", "") + 16, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.collections.immutable.ImmutableList<com.huawei.digitalpayment.consumer.sfcui.utils.QuickAction> component2() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.compose.QuickActionsState.component2():kotlinx.collections.immutable.ImmutableList");
    }

    static {
        equals = 1;
        ShareDataUIState();
        $stable = QuickAction.$stable | QuickActionSection.$stable;
        int i = getRequestBeneficiariesState + 45;
        equals = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public QuickActionsState() {
        this(null, null, null, false, null, null, false, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static QuickActionsState copy$default(QuickActionsState quickActionsState, ImmutableList immutableList, ImmutableList immutableList2, String str, boolean z, ImmutableList immutableList3, QuickActionsCategory quickActionsCategory, boolean z2, int i, Object obj) {
        ImmutableList immutableList4;
        boolean z3;
        ImmutableList immutableList5;
        int i2 = 2 % 2;
        int i3 = getSponsorBeneficiariesState + 79;
        int i4 = i3 % 128;
        getShareableDataState = i4;
        ImmutableList immutableList6 = (i3 % 2 != 0 ? (i & 1) == 0 : (i & 1) == 0) ? immutableList : quickActionsState.ShareDataUIState;
        if ((i & 2) != 0) {
            int i5 = i4 + 119;
            getSponsorBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            immutableList4 = quickActionsState.component2;
        } else {
            immutableList4 = immutableList2;
        }
        String str2 = (i & 4) != 0 ? quickActionsState.component4 : str;
        if ((i & 8) != 0) {
            int i7 = i4 + 47;
            getSponsorBeneficiariesState = i7 % 128;
            if (i7 % 2 != 0) {
                boolean z4 = quickActionsState.copydefault;
                throw null;
            }
            z3 = quickActionsState.copydefault;
        } else {
            z3 = z;
        }
        if ((i & 16) != 0) {
            int i8 = i4 + 113;
            getSponsorBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            immutableList5 = quickActionsState.component3;
        } else {
            immutableList5 = immutableList3;
        }
        return quickActionsState.copy(immutableList6, immutableList4, str2, z3, immutableList5, (i & 32) != 0 ? quickActionsState.component1 : quickActionsCategory, (i & 64) != 0 ? quickActionsState.getAsAtTimestamp : z2);
    }

    public final ImmutableList<QuickActionSection> component1() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 99;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 59;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component4;
        }
        throw null;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 49;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ImmutableList<QuickActionsCategory> component5() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 53;
        getSponsorBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        ImmutableList<QuickActionsCategory> immutableList = this.component3;
        int i4 = i2 + 73;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return immutableList;
        }
        obj.hashCode();
        throw null;
    }

    public final QuickActionsCategory component6() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 119;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 101;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.getAsAtTimestamp;
        int i4 = i2 + 59;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final QuickActionsState copy(ImmutableList<QuickActionSection> allQuickActions, ImmutableList<QuickAction> currentSelectedQuickActions, String searchQuery, boolean isInEditMode, ImmutableList<? extends QuickActionsCategory> filterOptions, QuickActionsCategory currentFilter, boolean isLoading) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(allQuickActions, "");
        Intrinsics.checkNotNullParameter(currentSelectedQuickActions, "");
        Intrinsics.checkNotNullParameter(searchQuery, "");
        Intrinsics.checkNotNullParameter(filterOptions, "");
        Intrinsics.checkNotNullParameter(currentFilter, "");
        QuickActionsState quickActionsState = new QuickActionsState(allQuickActions, currentSelectedQuickActions, searchQuery, isInEditMode, filterOptions, currentFilter, isLoading);
        int i2 = getSponsorBeneficiariesState + 99;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        return quickActionsState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 35;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickActionsState)) {
            int i5 = i3 + 25;
            getShareableDataState = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        QuickActionsState quickActionsState = (QuickActionsState) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, quickActionsState.ShareDataUIState) || !Intrinsics.areEqual(this.component2, quickActionsState.component2)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component4, quickActionsState.component4)) {
            int i6 = getSponsorBeneficiariesState + 1;
            getShareableDataState = i6 % 128;
            return i6 % 2 == 0;
        }
        if (this.copydefault != quickActionsState.copydefault) {
            int i7 = getShareableDataState + 9;
            getSponsorBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, quickActionsState.component3)) {
            int i9 = getSponsorBeneficiariesState + 67;
            getShareableDataState = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, quickActionsState.component1) || this.getAsAtTimestamp != quickActionsState.getAsAtTimestamp) {
            return false;
        }
        int i11 = getShareableDataState + 99;
        getSponsorBeneficiariesState = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 79;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.ShareDataUIState.hashCode() * 31) + this.component2.hashCode()) * 31) + this.component4.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + this.component3.hashCode()) * 31) + this.component1.hashCode()) * 31) + Boolean.hashCode(this.getAsAtTimestamp);
        int i4 = getShareableDataState + 87;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QuickActionsState(allQuickActions=" + this.ShareDataUIState + ", currentSelectedQuickActions=" + this.component2 + ", searchQuery=" + this.component4 + ", isInEditMode=" + this.copydefault + ", filterOptions=" + this.component3 + ", currentFilter=" + this.component1 + ", isLoading=" + this.getAsAtTimestamp + ")";
        int i2 = getSponsorBeneficiariesState + 77;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static void ShareDataUIState() {
        copy = -890926393;
    }
}
