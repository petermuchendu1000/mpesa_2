package com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent;", "", "<init>", "()V", "OnSortTypeSelected", "OnSortTypeUnSelected", "OnClearAll", "OnApply", "OnDialogDismissed", "OnShowDialog", "OnSearchInput", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent$OnApply;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent$OnClearAll;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent$OnDialogDismissed;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent$OnSearchInput;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent$OnShowDialog;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent$OnSortTypeSelected;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent$OnSortTypeUnSelected;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SearchBundlesEvent {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int copydefault = 73 % 128;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent$OnSortTypeUnSelected;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent;", "sortFilterType", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/ISortFilterType;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/ISortFilterType;)V", "getSortFilterType", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/ISortFilterType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSortTypeUnSelected extends SearchBundlesEvent {
        public static final int $stable = 8;
        private static char[] component1;
        private static boolean component2;
        private static boolean component3;
        private static int component4;
        private static int copydefault;
        private final ISortFilterType ShareDataUIState;
        private static final byte[] $$c = {TarHeader.LF_CHR, -113, 92, 4};
        private static final int $$f = 0;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {41, -64, -63, -4, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39};
        private static final int $$e = 68;
        private static final byte[] $$a = {99, TarHeader.LF_DIR, 44, 107, 7, -23, 19, -25, 72, -55, -17, -9, 7, -6, 3, 63, -71, 1, 9, 0, TarHeader.LF_CHR, -39, -20, 0, -17, Ascii.VT, -17, 39, -28, -22, 36, -31, 9, 0};
        private static final int $$b = 56;
        private static int getRequestBeneficiariesState = 0;
        private static int getAsAtTimestamp = 1;
        private static int copy = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(byte r6, short r7, short r8) {
            /*
                int r7 = r7 * 5
                int r7 = r7 + 68
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesEvent.OnSortTypeUnSelected.$$c
                int r6 = r6 * 2
                int r1 = 1 - r6
                int r8 = r8 * 3
                int r8 = r8 + 4
                byte[] r1 = new byte[r1]
                r2 = 0
                int r6 = 0 - r6
                if (r0 != 0) goto L18
                r3 = r8
                r4 = r2
                goto L2c
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2c:
                int r7 = r7 + r8
                int r8 = r3 + 1
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesEvent.OnSortTypeUnSelected.$$g(byte, short, short):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 4
                int r6 = 106 - r6
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesEvent.OnSortTypeUnSelected.$$a
                int r8 = r8 * 3
                int r8 = r8 + 4
                int r7 = r7 * 4
                int r1 = r7 + 31
                byte[] r1 = new byte[r1]
                int r7 = r7 + 30
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r8
                r4 = r2
                goto L2e
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2e:
                int r8 = -r8
                int r6 = r6 + r8
                int r8 = r3 + 1
                int r6 = r6 + (-2)
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesEvent.OnSortTypeUnSelected.a(byte, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(short r5, byte r6, int r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesEvent.OnSortTypeUnSelected.$$d
                int r6 = r6 + 97
                int r5 = r5 * 9
                int r5 = r5 + 4
                int r7 = r7 * 9
                int r1 = 10 - r7
                byte[] r1 = new byte[r1]
                int r7 = 9 - r7
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r7
                r3 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L24:
                int r3 = r3 + 1
                r4 = r0[r5]
            L28:
                int r6 = r6 + r4
                int r6 = r6 + (-27)
                int r5 = r5 + 1
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesEvent.OnSortTypeUnSelected.b(short, byte, int, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            cancel cancelVar = new cancel();
            char[] cArr2 = component1;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = $11 + 37;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 19;
                    $10 = i7 % 128;
                    int i8 = i7 % i2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 3761;
                            int i10 = 25 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)));
                            byte b2 = (byte) $$f;
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i9, i10, c2, -1670574543, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i6++;
                        i2 = 2;
                        j = 0;
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
            Object[] objArr3 = {Integer.valueOf(copydefault)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i11 = 689978476;
            if (component3) {
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault3 == null) {
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2748;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 19;
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 7645);
                        int i12 = $$f;
                        byte b4 = (byte) i12;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, edgeSlop, bitsPerPixel, -327556343, false, $$g(b4, (byte) (b4 + 1), (byte) i12), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                }
                String str = new String(cArr4);
                int i13 = $10 + 33;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                objArr[0] = str;
                return;
            }
            if (!component2) {
                cancelVar.component1 = iArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                int i15 = $11 + 101;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    cancelVar.component3++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            cancelVar.component1 = cArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i11);
                if (objCopydefault4 == null) {
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2748;
                    int offsetBefore = 19 - TextUtils.getOffsetBefore("", 0);
                    char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7643);
                    int i17 = $$f;
                    byte b5 = (byte) i17;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(jumpTapTimeout, offsetBefore, c3, -327556343, false, $$g(b5, (byte) (b5 + 1), (byte) i17), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                i11 = 689978476;
            }
            objArr[0] = new String(cArr6);
        }

        public final ISortFilterType getSortFilterType() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp;
            int i3 = i2 + 3;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            ISortFilterType iSortFilterType = this.ShareDataUIState;
            int i5 = i2 + 105;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return iSortFilterType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSortTypeUnSelected(ISortFilterType iSortFilterType) {
            super(null);
            Intrinsics.checkNotNullParameter(iSortFilterType, "");
            this.ShareDataUIState = iSortFilterType;
        }

        static {
            component4 = 1;
            component3();
            int i = copy + 43;
            component4 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public static OnSortTypeUnSelected copy$default(OnSortTypeUnSelected onSortTypeUnSelected, ISortFilterType iSortFilterType, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = getRequestBeneficiariesState;
            int i4 = i3 + 19;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 11;
                getAsAtTimestamp = i6 % 128;
                int i7 = i6 % 2;
                iSortFilterType = onSortTypeUnSelected.ShareDataUIState;
                if (i7 == 0) {
                    int i8 = 74 / 0;
                }
            }
            OnSortTypeUnSelected onSortTypeUnSelectedCopy = onSortTypeUnSelected.copy(iSortFilterType);
            int i9 = getRequestBeneficiariesState + 41;
            getAsAtTimestamp = i9 % 128;
            if (i9 % 2 != 0) {
                return onSortTypeUnSelectedCopy;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final ISortFilterType component1() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 75;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ISortFilterType iSortFilterType = this.ShareDataUIState;
            int i4 = i3 + 93;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return iSortFilterType;
        }

        public final OnSortTypeUnSelected copy(ISortFilterType sortFilterType) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(sortFilterType, "");
            OnSortTypeUnSelected onSortTypeUnSelected = new OnSortTypeUnSelected(sortFilterType);
            int i2 = getRequestBeneficiariesState + 27;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 55 / 0;
            }
            return onSortTypeUnSelected;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 59;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnSortTypeUnSelected)) {
                int i5 = i2 + 33;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.ShareDataUIState, ((OnSortTypeUnSelected) other).ShareDataUIState)) {
                int i7 = getRequestBeneficiariesState + 29;
                getAsAtTimestamp = i7 % 128;
                return i7 % 2 == 0;
            }
            int i8 = getAsAtTimestamp + 47;
            getRequestBeneficiariesState = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 19 / 0;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 99;
            getAsAtTimestamp = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                this.ShareDataUIState.hashCode();
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.ShareDataUIState.hashCode();
            int i3 = getRequestBeneficiariesState + 119;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnSortTypeUnSelected(sortFilterType=" + this.ShareDataUIState + ")";
            int i2 = getAsAtTimestamp + 61;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:137:0x08ab, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x08ac, code lost:
        
            r1 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x08b0, code lost:
        
            if (r1 != null) goto L140;
         */
        /* JADX WARN: Code restructure failed: missing block: B:140:0x08b2, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:141:0x08b3, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0525, code lost:
        
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x052c, code lost:
        
            if (r0 != null) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x052e, code lost:
        
            r1 = android.view.KeyEvent.getDeadChar(0, 0) + 1342;
            r24 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33;
            r0 = (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 6425);
            r4 = (byte) 0;
            r6 = (byte) (r4 + 2);
            r9 = new java.lang.Object[1];
            b(r4, r6, (byte) (r6 - 2), r9);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r24, r0, 1443979249, false, (java.lang.String) r9[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x056a, code lost:
        
            ((java.lang.reflect.Field) r0).set(null, r11);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0577, code lost:
        
            if (r0 != null) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0579, code lost:
        
            r6 = (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1342;
            r7 = (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32;
            r8 = (char) ((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 6424);
            r1 = (byte) 0;
            r3 = (byte) (r1 + 2);
            r12 = new java.lang.Object[1];
            b(r1, r3, (byte) (r3 - 2), r12);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r6, r7, r8, 1443979249, false, (java.lang.String) r12[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x05bb, code lost:
        
            r3 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r0).get(null)};
            r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x05d0, code lost:
        
            if (r4 != null) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x05d2, code lost:
        
            r7 = 1343 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1));
            r8 = 33 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            r9 = (char) (android.text.TextUtils.indexOf("", "", 0) + 6425);
            r1 = (byte) 1;
            r4 = (byte) (r1 + 2);
            r12 = new java.lang.Object[1];
            b(r1, r4, (byte) (r4 - 2), r12);
            r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r7, r8, r9, -181198845, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x060e, code lost:
        
            ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r3)).longValue();
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:128:0x0838  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x04e2  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x04f0  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x04fb A[PHI: r3
  0x04fb: PHI (r3v130 int) = (r3v129 int), (r3v138 int) binds: [B:72:0x04f9, B:69:0x04ed] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r6v27 */
        /* JADX WARN: Type inference failed for: r6v53, types: [char[], int[], java.lang.Class[], java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v83 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int ShareDataUIState(java.util.List r30) {
            /*
                Method dump skipped, instruction units count: 2392
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesEvent.OnSortTypeUnSelected.ShareDataUIState(java.util.List):int");
        }

        static void component3() {
            component1 = new char[]{30264, 30401, 30252, 30452, 30266, 30260, 30271, 30256, 30269, 30268, 30403, 30258, 30421, 30270, 30263, 30402, 30265, 30259, 30420, 30416, 30253, 30418, 30249, 30262, 30422, 30261};
            copydefault = 321287846;
            component2 = true;
            component3 = true;
        }
    }

    private SearchBundlesEvent() {
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent$OnSortTypeSelected;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent;", "sortFilterType", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/ISortFilterType;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/ISortFilterType;)V", "getSortFilterType", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/ISortFilterType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSortTypeSelected extends SearchBundlesEvent {
        public static final int $stable = 8;
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;
        private final ISortFilterType component1;

        public final ISortFilterType getSortFilterType() {
            int i = 2 % 2;
            int i2 = copydefault + 67;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            ISortFilterType iSortFilterType = this.component1;
            if (i3 != 0) {
                int i4 = 67 / 0;
            }
            return iSortFilterType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSortTypeSelected(ISortFilterType iSortFilterType) {
            super(null);
            Intrinsics.checkNotNullParameter(iSortFilterType, "");
            this.component1 = iSortFilterType;
        }

        static {
            int i = 1 + 7;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public static OnSortTypeSelected copy$default(OnSortTypeSelected onSortTypeSelected, ISortFilterType iSortFilterType, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault + 67;
            int i4 = i3 % 128;
            component3 = i4;
            if (i3 % 2 == 0 && (i & 1) != 0) {
                int i5 = i4 + 85;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                iSortFilterType = onSortTypeSelected.component1;
            }
            OnSortTypeSelected onSortTypeSelectedCopy = onSortTypeSelected.copy(iSortFilterType);
            int i7 = component3 + 37;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return onSortTypeSelectedCopy;
        }

        public final ISortFilterType component1() {
            int i = 2 % 2;
            int i2 = component3 + 67;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ISortFilterType iSortFilterType = this.component1;
            if (i3 == 0) {
                int i4 = 14 / 0;
            }
            return iSortFilterType;
        }

        public final OnSortTypeSelected copy(ISortFilterType sortFilterType) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(sortFilterType, "");
            OnSortTypeSelected onSortTypeSelected = new OnSortTypeSelected(sortFilterType);
            int i2 = component3 + 121;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 87 / 0;
            }
            return onSortTypeSelected;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copydefault + 123;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof OnSortTypeSelected) {
                return Intrinsics.areEqual(this.component1, ((OnSortTypeSelected) other).component1);
            }
            int i4 = i3 + 7;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 75;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component1.hashCode();
            int i4 = component3 + 39;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnSortTypeSelected(sortFilterType=" + this.component1 + ")";
            int i2 = component3 + 99;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    static {
        int i = 73 % 2;
    }

    public SearchBundlesEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent$OnClearAll;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnClearAll extends SearchBundlesEvent {
        public static final int $stable = 0;
        public static final OnClearAll INSTANCE = new OnClearAll();
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault;

        private OnClearAll() {
            super(null);
        }

        static {
            int i = component3 + 43;
            component2 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 21;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof OnClearAll) {
                return true;
            }
            int i4 = i2 + 5;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 45;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 107;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return 1307045156;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault + 31;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return "OnClearAll";
            }
            int i3 = 6 / 0;
            return "OnClearAll";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent$OnApply;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnApply extends SearchBundlesEvent {
        public static final int $stable = 0;
        public static final OnApply INSTANCE = new OnApply();
        private static int ShareDataUIState = 1;
        private static int component2 = 1;
        private static int component3;
        private static int copydefault;

        private OnApply() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 73;
            component3 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 55;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof OnApply)) {
                int i4 = component2 + 51;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = component2 + 123;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 87;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 111;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return -1806680994;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2 + 39;
            int i3 = i2 % 128;
            copydefault = i3;
            if (i2 % 2 != 0) {
                int i4 = 62 / 0;
            }
            int i5 = i3 + 15;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return "OnApply";
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent$OnDialogDismissed;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnDialogDismissed extends SearchBundlesEvent {
        public static final int $stable = 0;
        public static final OnDialogDismissed INSTANCE = new OnDialogDismissed();
        private static int ShareDataUIState = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault;

        private OnDialogDismissed() {
            super(null);
        }

        static {
            int i = component2 + 23;
            component3 = i % 128;
            if (i % 2 == 0) {
                int i2 = 1 / 0;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = ShareDataUIState + 61;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof OnDialogDismissed)) {
                int i4 = ShareDataUIState + 95;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = copydefault + 61;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 53;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return -1768676047;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 81;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 41;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 7 / 0;
            }
            return "OnDialogDismissed";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent$OnShowDialog;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnShowDialog extends SearchBundlesEvent {
        public static final int $stable = 0;
        public static final OnShowDialog INSTANCE = new OnShowDialog();
        private static int ShareDataUIState = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault;

        private OnShowDialog() {
            super(null);
        }

        static {
            int i = component2 + 109;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 9;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof OnShowDialog)) {
                int i4 = component3 + 53;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = copydefault + 25;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 13;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 109;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return -1251266635;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3 + 33;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return "OnShowDialog";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent$OnSearchInput;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SearchBundlesEvent;", "searchInput", "", "<init>", "(Ljava/lang/String;)V", "getSearchInput", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnSearchInput extends SearchBundlesEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3;
        private final String copydefault;

        public final String getSearchInput() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 105;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.copydefault;
            int i4 = i2 + 55;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSearchInput(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        static {
            int i = 1 + 43;
            component3 = i % 128;
            if (i % 2 != 0) {
                int i2 = 16 / 0;
            }
        }

        public static OnSearchInput copy$default(OnSearchInput onSearchInput, String str, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = ShareDataUIState + 31;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    String str2 = onSearchInput.copydefault;
                    throw null;
                }
                str = onSearchInput.copydefault;
            }
            OnSearchInput onSearchInputCopy = onSearchInput.copy(str);
            int i4 = ShareDataUIState + 13;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return onSearchInputCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 107;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 33;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 96 / 0;
            }
            return str;
        }

        public final OnSearchInput copy(String searchInput) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(searchInput, "");
            OnSearchInput onSearchInput = new OnSearchInput(searchInput);
            int i2 = component1 + 81;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return onSearchInput;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 29;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnSearchInput)) {
                return false;
            }
            if (Intrinsics.areEqual(this.copydefault, ((OnSearchInput) other).copydefault)) {
                return true;
            }
            int i4 = ShareDataUIState + 101;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 123;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.copydefault.hashCode();
            int i4 = ShareDataUIState + 71;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnSearchInput(searchInput=" + this.copydefault + ")";
            int i2 = ShareDataUIState + 33;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }
}
