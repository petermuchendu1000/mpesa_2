package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel;
import com.huawei.digitalpayment.consumer.miniapps.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancelNotification;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataTopUpActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "fixedDataViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "getFixedDataViewModel", "()Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "setFixedDataViewModel", "(Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcFixedData_release", "uiState", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FixedDataUiState;", "amount", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FixedDataTopUpActivity extends Hilt_FixedDataTopUpActivity {
    public static final int $stable = 8;
    private static char ShareDataUIState;
    private static long component1;
    private static long component2;
    private static int component3;
    private static char[] copydefault;
    private static int getAsAtTimestamp;

    @Inject
    public FixedDataViewModel fixedDataViewModel;
    private static final byte[] $$c = {Ascii.SI, -74, 84, -51};
    private static final int $$f = 103;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {69, -50, 81, 75, Ascii.FF, -59, 74, -7, 2, 8, Ascii.ETB, -5, 19, -11, Ascii.EM, PSSSigner.TRAILER_IMPLICIT, 65, Ascii.VT, Ascii.FF, -9, 19, 2, -7, 17, -56, 71, 7, -5, 19, -11, Ascii.EM, 1, 9, 7, -63, 71, -7, Ascii.ETB, -8, 19, 10, -15, 7, Ascii.DLE, -1, -49, 39, Ascii.EM, Ascii.ETB, -8, 19, 10, -15, 7, Ascii.DLE, -1, -8, Ascii.CAN, Ascii.VT, -4, 17, Ascii.SO, -47, TarHeader.LF_CHR, Ascii.FF, -1, -4, 3, Ascii.ETB, 13, -79, 69, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, Ascii.DC2, 7, Ascii.SI, -15, 7, 7, 1, Ascii.SUB, -3, Ascii.SO, Ascii.DC2, 4, -57, 76, -12, Ascii.EM, 0, 5, 7, 4, 8, -59, 78, -7, 2, Ascii.CAN, -1, -9, Ascii.FF, 4, 19, -8, 17, Ascii.VT, 5, -4, Ascii.VT, -4, Ascii.VT, 0, 4, Ascii.EM, 1, 9, -62, 42, -40, 78, -5, Ascii.RS, -4, Ascii.FF, 5, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, Ascii.DC2, 4, -57, SignedBytes.MAX_POWER_OF_TWO, 19, -14, Ascii.FS, -12, 10, -53, 60, Ascii.VT, 4, 8, 17, -13, 17, 10, -9, Ascii.RS, -6, -2, Ascii.SI, Ascii.FF, -64, 59, Ascii.DC2, 5, Ascii.VT, 8, -2, -2, 19, -62, 75, -7, 3, -47, 69, 9, -5, 20, -12, Ascii.FF, Ascii.VT, 9, -7, 5, 17, -56, 75, -8, Ascii.SI, -4, Ascii.SYN, 1, 4, 8, -7, 13, 9, -1, -49, 43, Ascii.CAN, Ascii.SI, -4, -10, 33, -28, 40, -7, 13, 9, -1, -30, 40, Ascii.ETB, -5, 19, -7, 17, Ascii.VT, -79, 69, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -60, Ascii.DC2, 4, -57, 57, 17, 3, -1, 5, 7, 5, -45, 57, Ascii.ETB, -3, 19, -11, 19, -62, 57, Ascii.NAK, 6, -60, Ascii.EM, TarHeader.LF_DIR, 6, -28, 39, -5, 7, -59, 20, -8, 19};
    private static final int $$h = 53;
    private static final byte[] $$a = {104, -2, Ascii.CAN, -74, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 137;
    private static int getRequestBeneficiariesState = 0;
    private static int equals = 1;
    private static int component4 = 1;

    private static String $$i(byte b2, short s, int i) {
        byte[] bArr = $$c;
        int i2 = (b2 * 4) + 4;
        int i3 = s * 4;
        int i4 = 122 - i;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i4 = i2 + i4;
            i2++;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            int i7 = i4;
            i5 = i6;
            i4 = bArr[i2] + i7;
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = 28 - r8
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r9 = 99 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L13:
            r3 = r2
        L14:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-8)
            r9 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.c(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 245 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.$$g
            int r7 = r7 * 6
            int r7 = 105 - r7
            int r8 = r8 + 10
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2c
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-6)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.d(int, byte, byte, java.lang.Object[]):void");
    }

    public final FixedDataViewModel getFixedDataViewModel() {
        int i = 2 % 2;
        FixedDataViewModel fixedDataViewModel = this.fixedDataViewModel;
        if (fixedDataViewModel != null) {
            int i2 = equals + 117;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return fixedDataViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = getRequestBeneficiariesState + 57;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setFixedDataViewModel(FixedDataViewModel fixedDataViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 17;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
            this.fixedDataViewModel = fixedDataViewModel;
        } else {
            Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
            this.fixedDataViewModel = fixedDataViewModel;
            int i3 = 58 / 0;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int component1 = 0;
        private static int component3 = 1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 1;
            private static int component1;
            final FixedDataTopUpActivity component3;

            public static Object ShareDataUIState(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
                int i7 = i6 | i2;
                int i8 = ~i2;
                int i9 = ~i4;
                int i10 = ~(i8 | i9);
                int i11 = ~i6;
                int i12 = i10 | (~(i11 | i4));
                int i13 = ~(i9 | i6);
                int i14 = i12 | i13;
                int i15 = (~(i4 | i11 | i2)) | i13;
                int i16 = i6 + i2 + i + (1881146393 * i3) + ((-1035018111) * i5);
                int i17 = i16 * i16;
                int i18 = ((i6 * (-1924067824)) - 304087040) + ((-1924067824) * i2) + (i7 * (-674303503)) + ((-674303503) * i14) + (674303503 * i15) + (1696595968 * i) + (1612709888 * i3) + ((-182452224) * i5) + ((-1611137024) * i17);
                int i19 = (i6 * (-928100048)) + 945860906 + (i2 * (-928100048)) + (i7 * (-189)) + (i14 * (-189)) + (i15 * WSContextConstant.HANDSHAKE_SEND_SIZE) + (i * (-928100237)) + (i3 * (-1331189957)) + (i5 * 1329932787) + (i17 * 1550319616);
                return i18 + ((i19 * i19) * 1690828800) != 1 ? component1(objArr) : ShareDataUIState(objArr);
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 15;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ShareDataUIState(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 23;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final MutableState ShareDataUIState() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 43;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                int i4 = component1 + 67;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return mutableStateMutableStateOf$default;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
            
                if (r39.getSkipping() == false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
            
                r39.skipToGroupEnd();
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
            
                if (r39.getSkipping() == false) goto L13;
             */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ShareDataUIState(androidx.compose.runtime.Composer r39, int r40) {
                /*
                    Method dump skipped, instruction units count: 295
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.copydefault.AnonymousClass1.ShareDataUIState(androidx.compose.runtime.Composer, int):void");
            }

            private static Object ShareDataUIState(Object[] objArr) {
                MutableState mutableState = (MutableState) objArr[0];
                String str = (String) objArr[1];
                int i = 2 % 2;
                int i2 = component1 + 119;
                ShareDataUIState = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(mutableState, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    ShareDataUIState((MutableState<String>) mutableState, str);
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(mutableState, "");
                Intrinsics.checkNotNullParameter(str, "");
                ShareDataUIState((MutableState<String>) mutableState, str);
                Unit unit2 = Unit.INSTANCE;
                int i3 = ShareDataUIState + 99;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return unit2;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static final kotlin.Unit component3(com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel r25, com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity r26, com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType r27, androidx.compose.runtime.MutableState r28, androidx.compose.runtime.State r29) {
                /*
                    Method dump skipped, instruction units count: 241
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.copydefault.AnonymousClass1.component3(com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel, com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity, com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType, androidx.compose.runtime.MutableState, androidx.compose.runtime.State):kotlin.Unit");
            }

            private static final Unit ShareDataUIState(FixedDataTopUpActivity fixedDataTopUpActivity) {
                Unit unit;
                int i = 2 % 2;
                int i2 = component1 + 69;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(fixedDataTopUpActivity, "");
                    fixedDataTopUpActivity.getOnBackPressedDispatcher().onBackPressed();
                    unit = Unit.INSTANCE;
                    int i3 = 96 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(fixedDataTopUpActivity, "");
                    fixedDataTopUpActivity.getOnBackPressedDispatcher().onBackPressed();
                    unit = Unit.INSTANCE;
                }
                int i4 = component1 + 101;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final FixedDataUiState component1(State<FixedDataUiState> state) {
                int i = 2 % 2;
                int i2 = component1 + 41;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                FixedDataUiState value = state.getValue();
                int i4 = ShareDataUIState + 71;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return value;
            }

            private static final String component2(MutableState<String> mutableState) {
                String value;
                int i = 2 % 2;
                int i2 = component1 + 91;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    value = mutableState.getValue();
                    int i3 = 52 / 0;
                } else {
                    value = mutableState.getValue();
                }
                int i4 = component1 + 11;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return value;
            }

            private static final void ShareDataUIState(MutableState<String> mutableState, String str) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 63;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                mutableState.setValue(str);
                if (i3 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = ShareDataUIState + 121;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }

            public static Unit ShareDataUIState(AccountDetailsUiModel accountDetailsUiModel, FixedDataTopUpActivity fixedDataTopUpActivity, FixedDataType fixedDataType, MutableState mutableState, State state) {
                int iCopydefault = R.mipmap.copydefault();
                return (Unit) ShareDataUIState(R.mipmap.copydefault(), -772394009, new Object[]{accountDetailsUiModel, fixedDataTopUpActivity, fixedDataType, mutableState, state}, R.mipmap.copydefault(), iCopydefault, R.mipmap.copydefault(), 772394009);
            }

            public static MutableState copydefault() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 45;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                MutableState mutableStateShareDataUIState = ShareDataUIState();
                int i4 = ShareDataUIState + 35;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 68 / 0;
                }
                return mutableStateShareDataUIState;
            }

            public static Unit component2(FixedDataTopUpActivity fixedDataTopUpActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 1;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    return ShareDataUIState(fixedDataTopUpActivity);
                }
                ShareDataUIState(fixedDataTopUpActivity);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component2(MutableState mutableState, String str) {
                int i = 2 % 2;
                int i2 = component1 + 99;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                int iCopydefault = R.mipmap.copydefault();
                Unit unit = (Unit) ShareDataUIState(R.mipmap.copydefault(), 1376726268, new Object[]{mutableState, str}, R.mipmap.copydefault(), iCopydefault, R.mipmap.copydefault(), -1376726267);
                int i4 = component1 + 75;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            AnonymousClass1(FixedDataTopUpActivity fixedDataTopUpActivity) {
                this.component3 = fixedDataTopUpActivity;
            }

            private static final Unit component3(MutableState mutableState, String str) {
                int iCopydefault = R.mipmap.copydefault();
                return (Unit) ShareDataUIState(R.mipmap.copydefault(), 1376726268, new Object[]{mutableState, str}, R.mipmap.copydefault(), iCopydefault, R.mipmap.copydefault(), -1376726267);
            }

            private static Object component1(Object[] objArr) {
                AccountDetailsUiModel accountDetailsUiModel = (AccountDetailsUiModel) objArr[0];
                FixedDataTopUpActivity fixedDataTopUpActivity = (FixedDataTopUpActivity) objArr[1];
                FixedDataType fixedDataType = (FixedDataType) objArr[2];
                MutableState mutableState = (MutableState) objArr[3];
                State state = (State) objArr[4];
                int i = 2 % 2;
                int i2 = component1 + 121;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3(accountDetailsUiModel, fixedDataTopUpActivity, fixedDataType, mutableState, state);
                if (i3 == 0) {
                    int i4 = 75 / 0;
                }
                int i5 = component1 + 113;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitComponent3;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 55;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component1(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 63 / 0;
            }
            int i5 = component3 + 119;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            if (r11.getSkipping() == false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        
            r12 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.copydefault.component3 + 3;
            com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.copydefault.component1 = r12 % 128;
            r12 = r12 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
        
            r11.skipToGroupEnd();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        
            if (r11.getSkipping() == false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component1(androidx.compose.runtime.Composer r11, int r12) {
            /*
                r10 = this;
                r0 = 2
                int r1 = r0 % r0
                r12 = r12 & 11
                if (r12 != r0) goto L31
                int r12 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.copydefault.component1
                int r12 = r12 + 77
                int r1 = r12 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.copydefault.component3 = r1
                int r12 = r12 % r0
                if (r12 != 0) goto L1d
                boolean r12 = r11.getSkipping()
                r1 = 59
                int r1 = r1 / 0
                if (r12 != 0) goto L2d
                goto L23
            L1d:
                boolean r12 = r11.getSkipping()
                if (r12 != 0) goto L2d
            L23:
                int r12 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.copydefault.component3
                int r12 = r12 + 3
                int r1 = r12 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.copydefault.component1 = r1
                int r12 = r12 % r0
                goto L31
            L2d:
                r11.skipToGroupEnd()
                goto L53
            L31:
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity$copydefault$1 r12 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity$copydefault$1
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity r6 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.this
                r12.<init>(r6)
                r6 = 54
                r7 = -2110794957(0xffffffff822fd333, float:-1.2917581E-37)
                r8 = 1
                androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r7, r8, r12, r11, r6)
                r6 = r12
                kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
                r8 = 1572864(0x180000, float:2.204052E-39)
                r9 = 63
                r7 = r11
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.copydefault.component1(androidx.compose.runtime.Composer, int):void");
        }

        copydefault() {
        }
    }

    private static void a(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = $11 + 67;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(copydefault[i + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 1758, (ViewConfiguration.getScrollBarSize() >> 8) + 34, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 1159210934, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component1), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3609 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 29, (char) (7170 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1951385784, false, $$i(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 4013, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27761), -1529629956, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4012, View.resolveSize(0, 0) + 24, (char) (27760 - TextUtils.lastIndexOf("", '0', 0)), -1529629956, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i7 = $11 + 5;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    private static void b(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i4 = $11 + 59;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - Color.red(0), (ViewConfiguration.getTouchSlop() >> 8) + 31, (char) (19180 - TextUtils.indexOf((CharSequence) "", '0', 0)), 1912513118, false, $$i(b2, b3, (byte) (b3 | Ascii.ETB)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 12, (char) (AndroidCharacter.getMirror('0') - '0'), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.red(0) + 28, (char) TextUtils.getOffsetAfter("", 0), 931716605, false, $$i(b4, b5, (byte) (b5 | Ascii.CAN)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7566 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.resolveSize(0, 0) + 11, (char) (ViewConfiguration.getTapTimeout() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr2[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 85;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:306:0x2575  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x2576  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0280  */
    /* JADX WARN: Type inference failed for: r4v252, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i2 = equals + 105;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 97), KeyEvent.keyCodeFromString(""), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(12) - 83, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(19) - 46), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952790_res_0x7f130496).substring(7, 8).codePointAt(0) - 6, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(22) - 84, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = getRequestBeneficiariesState + 29;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i5 = getRequestBeneficiariesState + 125;
            equals = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 42, (char) TextUtils.indexOf("", "", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 57 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i7 = equals + 73;
                getRequestBeneficiariesState = i7 % 128;
                int i8 = i7 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0126  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(48:958|251|(0)|254|278|(3:930|279|(0)(0))|462|(9:962|463|(0)|466|(0)(0)|498|(1:499)|981|533)|559|(0)|562|(0)(0)|586|(0)(0)|604|(0)|607|(0)(0)|611|(0)(0)|617|638|(0)(0)|656|891|657|(0)|660|(0)|663|(0)(0)|701|(1:702)|986|755|(0)|758|(0)(0)|764|779|(0)|789|(0)|792|(0)(0)|798|816|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x3246, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x3247, code lost:
    
        r8 = new java.lang.Object[1];
        b(new char[]{59614, 6541, 49010, 19407}, ((android.content.Context) java.lang.Class.forName(r15).getMethod(r33, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131955137_res_0x7f130dc1).substring(0, 3).codePointAt(2) - 32, new char[]{43048, 44794, 29811, 20949, 18232, 56576, 39870, 55361, 46595, 50553}, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), new char[]{7128, 59724, 47838, 2556}, r8);
        r4 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x32a8, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r3);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x32bf, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x32c3, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r4);
        r12 = -1;
        r4 = ((long) 1) & ((((long) 0) << 32) | (r12 - ((r12 >> 63) << 32)));
        r12 = 0;
        r4 = r4 | ((((long) 19) << 32) | (r12 - ((r12 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x32ee, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x32f2, code lost:
    
        if (r6 == null) goto L751;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x32f4, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.view.View.resolveSizeAndState(0, 0, 0), 42 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:752:0x331f, code lost:
    
        r6 = ((java.lang.reflect.Method) r6).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x3326, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.equals + 109;
        com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.getRequestBeneficiariesState = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x3331, code lost:
    
        r8 = new java.lang.Object[]{156026729, java.lang.Long.valueOf(r4), r3, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6562 - android.view.KeyEvent.normalizeMetaState(0), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 56, (char) android.graphics.Color.red(0));
        r4 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.$$g;
        r10 = new java.lang.Object[1];
        d((short) 112, r4[31], r4[97], r10);
        r1.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r6, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0aac A[Catch: all -> 0x066b, TryCatch #33 {all -> 0x066b, blocks: (B:456:0x1aa8, B:458:0x1aae, B:459:0x1ad9, B:783:0x3628, B:785:0x362e, B:786:0x3659, B:820:0x396b, B:822:0x3971, B:823:0x3996, B:800:0x37a5, B:802:0x37c8, B:803:0x381e, B:749:0x32ee, B:751:0x32f4, B:752:0x331f, B:648:0x2c15, B:650:0x2c1b, B:651:0x2c46, B:653:0x2c80, B:654:0x2cc6, B:619:0x28b0, B:621:0x28c5, B:622:0x28f1, B:624:0x2925, B:625:0x29a3, B:596:0x2528, B:598:0x252e, B:599:0x255a, B:601:0x2594, B:602:0x25e3, B:569:0x226d, B:571:0x2282, B:572:0x22b5, B:553:0x2060, B:555:0x2066, B:556:0x2090, B:272:0x12ed, B:274:0x12f3, B:275:0x131b, B:226:0x105c, B:228:0x1062, B:229:0x1091, B:118:0x0aa6, B:120:0x0aac, B:121:0x0ad8, B:19:0x02b3, B:21:0x02b9, B:22:0x02e4, B:24:0x05dc, B:26:0x060e, B:27:0x0665), top: B:910:0x02b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0c1c A[Catch: all -> 0x0fbb, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x0fbb, blocks: (B:125:0x0b62, B:131:0x0bb5, B:171:0x0e5e, B:172:0x0e62, B:175:0x0e71, B:178:0x0e8c, B:140:0x0c1c, B:158:0x0d37, B:162:0x0d86, B:167:0x0dfc, B:170:0x0e56), top: B:880:0x0b62 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0e71 A[Catch: all -> 0x0fbb, TryCatch #17 {all -> 0x0fbb, blocks: (B:125:0x0b62, B:131:0x0bb5, B:171:0x0e5e, B:172:0x0e62, B:175:0x0e71, B:178:0x0e8c, B:140:0x0c1c, B:158:0x0d37, B:162:0x0d86, B:167:0x0dfc, B:170:0x0e56), top: B:880:0x0b62 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x1062 A[Catch: all -> 0x066b, TryCatch #33 {all -> 0x066b, blocks: (B:456:0x1aa8, B:458:0x1aae, B:459:0x1ad9, B:783:0x3628, B:785:0x362e, B:786:0x3659, B:820:0x396b, B:822:0x3971, B:823:0x3996, B:800:0x37a5, B:802:0x37c8, B:803:0x381e, B:749:0x32ee, B:751:0x32f4, B:752:0x331f, B:648:0x2c15, B:650:0x2c1b, B:651:0x2c46, B:653:0x2c80, B:654:0x2cc6, B:619:0x28b0, B:621:0x28c5, B:622:0x28f1, B:624:0x2925, B:625:0x29a3, B:596:0x2528, B:598:0x252e, B:599:0x255a, B:601:0x2594, B:602:0x25e3, B:569:0x226d, B:571:0x2282, B:572:0x22b5, B:553:0x2060, B:555:0x2066, B:556:0x2090, B:272:0x12ed, B:274:0x12f3, B:275:0x131b, B:226:0x105c, B:228:0x1062, B:229:0x1091, B:118:0x0aa6, B:120:0x0aac, B:121:0x0ad8, B:19:0x02b3, B:21:0x02b9, B:22:0x02e4, B:24:0x05dc, B:26:0x060e, B:27:0x0665), top: B:910:0x02b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x111b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x113e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x1155 A[Catch: all -> 0x1218, TryCatch #61 {all -> 0x1218, blocks: (B:247:0x1140, B:249:0x1155, B:250:0x1187), top: B:963:0x1140, outer: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x119a A[Catch: all -> 0x120e, TryCatch #58 {all -> 0x120e, blocks: (B:251:0x118d, B:253:0x119a, B:254:0x1206), top: B:958:0x118d, outer: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x13f6 A[Catch: all -> 0x19f4, PHI: r3
  0x13f6: PHI (r3v610 java.lang.Object) = (r3v605 java.lang.Object), (r3v609 java.lang.Object) binds: [B:280:0x13a6, B:281:0x13a8] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #44 {all -> 0x19f4, blocks: (B:279:0x13a2, B:285:0x13f6), top: B:930:0x13a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x1477  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x1491  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x14f1  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x1879  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x1aae A[Catch: all -> 0x066b, TryCatch #33 {all -> 0x066b, blocks: (B:456:0x1aa8, B:458:0x1aae, B:459:0x1ad9, B:783:0x3628, B:785:0x362e, B:786:0x3659, B:820:0x396b, B:822:0x3971, B:823:0x3996, B:800:0x37a5, B:802:0x37c8, B:803:0x381e, B:749:0x32ee, B:751:0x32f4, B:752:0x331f, B:648:0x2c15, B:650:0x2c1b, B:651:0x2c46, B:653:0x2c80, B:654:0x2cc6, B:619:0x28b0, B:621:0x28c5, B:622:0x28f1, B:624:0x2925, B:625:0x29a3, B:596:0x2528, B:598:0x252e, B:599:0x255a, B:601:0x2594, B:602:0x25e3, B:569:0x226d, B:571:0x2282, B:572:0x22b5, B:553:0x2060, B:555:0x2066, B:556:0x2090, B:272:0x12ed, B:274:0x12f3, B:275:0x131b, B:226:0x105c, B:228:0x1062, B:229:0x1091, B:118:0x0aa6, B:120:0x0aac, B:121:0x0ad8, B:19:0x02b3, B:21:0x02b9, B:22:0x02e4, B:24:0x05dc, B:26:0x060e, B:27:0x0665), top: B:910:0x02b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x1b66 A[Catch: all -> 0x1f96, TryCatch #60 {all -> 0x1f96, blocks: (B:463:0x1b60, B:465:0x1b66, B:466:0x1bae, B:468:0x1bbb, B:470:0x1bc4, B:471:0x1c06, B:524:0x1f68, B:526:0x1f6e, B:527:0x1f6f, B:529:0x1f71, B:531:0x1f78, B:532:0x1f79, B:472:0x1c13, B:484:0x1d0d, B:486:0x1d13, B:487:0x1d56, B:537:0x1f83, B:539:0x1f8a, B:540:0x1f8b, B:542:0x1f8d, B:544:0x1f94, B:545:0x1f95, B:520:0x1ee4, B:515:0x1ea8, B:517:0x1eae, B:518:0x1edc, B:479:0x1c81, B:481:0x1c96, B:482:0x1d01, B:474:0x1c33, B:476:0x1c48, B:477:0x1c7a), top: B:962:0x1b60, inners: #30, #38, #51, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:468:0x1bbb A[Catch: all -> 0x1f96, TryCatch #60 {all -> 0x1f96, blocks: (B:463:0x1b60, B:465:0x1b66, B:466:0x1bae, B:468:0x1bbb, B:470:0x1bc4, B:471:0x1c06, B:524:0x1f68, B:526:0x1f6e, B:527:0x1f6f, B:529:0x1f71, B:531:0x1f78, B:532:0x1f79, B:472:0x1c13, B:484:0x1d0d, B:486:0x1d13, B:487:0x1d56, B:537:0x1f83, B:539:0x1f8a, B:540:0x1f8b, B:542:0x1f8d, B:544:0x1f94, B:545:0x1f95, B:520:0x1ee4, B:515:0x1ea8, B:517:0x1eae, B:518:0x1edc, B:479:0x1c81, B:481:0x1c96, B:482:0x1d01, B:474:0x1c33, B:476:0x1c48, B:477:0x1c7a), top: B:962:0x1b60, inners: #30, #38, #51, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x1c13 A[Catch: all -> 0x1f96, TRY_LEAVE, TryCatch #60 {all -> 0x1f96, blocks: (B:463:0x1b60, B:465:0x1b66, B:466:0x1bae, B:468:0x1bbb, B:470:0x1bc4, B:471:0x1c06, B:524:0x1f68, B:526:0x1f6e, B:527:0x1f6f, B:529:0x1f71, B:531:0x1f78, B:532:0x1f79, B:472:0x1c13, B:484:0x1d0d, B:486:0x1d13, B:487:0x1d56, B:537:0x1f83, B:539:0x1f8a, B:540:0x1f8b, B:542:0x1f8d, B:544:0x1f94, B:545:0x1f95, B:520:0x1ee4, B:515:0x1ea8, B:517:0x1eae, B:518:0x1edc, B:479:0x1c81, B:481:0x1c96, B:482:0x1d01, B:474:0x1c33, B:476:0x1c48, B:477:0x1c7a), top: B:962:0x1b60, inners: #30, #38, #51, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x1e34  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x2066 A[Catch: all -> 0x066b, TryCatch #33 {all -> 0x066b, blocks: (B:456:0x1aa8, B:458:0x1aae, B:459:0x1ad9, B:783:0x3628, B:785:0x362e, B:786:0x3659, B:820:0x396b, B:822:0x3971, B:823:0x3996, B:800:0x37a5, B:802:0x37c8, B:803:0x381e, B:749:0x32ee, B:751:0x32f4, B:752:0x331f, B:648:0x2c15, B:650:0x2c1b, B:651:0x2c46, B:653:0x2c80, B:654:0x2cc6, B:619:0x28b0, B:621:0x28c5, B:622:0x28f1, B:624:0x2925, B:625:0x29a3, B:596:0x2528, B:598:0x252e, B:599:0x255a, B:601:0x2594, B:602:0x25e3, B:569:0x226d, B:571:0x2282, B:572:0x22b5, B:553:0x2060, B:555:0x2066, B:556:0x2090, B:272:0x12ed, B:274:0x12f3, B:275:0x131b, B:226:0x105c, B:228:0x1062, B:229:0x1091, B:118:0x0aa6, B:120:0x0aac, B:121:0x0ad8, B:19:0x02b3, B:21:0x02b9, B:22:0x02e4, B:24:0x05dc, B:26:0x060e, B:27:0x0665), top: B:910:0x02b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x2118  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x2167  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x224e  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x23f3  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x24dd  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x2717  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x2780  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x27c9  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x27df  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x2892  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x2ae1  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x2bcb  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x2dbb A[Catch: all -> 0x3246, TryCatch #23 {all -> 0x3246, blocks: (B:657:0x2db5, B:659:0x2dbb, B:660:0x2dfa, B:662:0x2e21, B:663:0x2e66, B:665:0x2e79, B:667:0x2e82, B:668:0x2ec8, B:701:0x310a, B:702:0x310e, B:704:0x3114, B:707:0x312c, B:710:0x3139, B:712:0x313c, B:724:0x3220, B:726:0x3226, B:727:0x3227, B:729:0x3229, B:731:0x3230, B:732:0x3231, B:671:0x2ed7, B:673:0x2edb, B:677:0x2ee7, B:679:0x2eed, B:691:0x2ff8, B:693:0x2ffe, B:694:0x303e, B:696:0x3068, B:697:0x30ad, B:699:0x30c3, B:700:0x3104, B:734:0x3233, B:736:0x323a, B:737:0x323b, B:739:0x323d, B:741:0x3244, B:742:0x3245, B:715:0x3168, B:717:0x316e, B:718:0x319b, B:686:0x2f5d, B:688:0x2f7c, B:689:0x2fec, B:681:0x2f0d, B:683:0x2f22, B:684:0x2f56, B:720:0x31a3), top: B:891:0x2db5, outer: #20, inners: #4, #11, #19, #64 }] */
    /* JADX WARN: Removed duplicated region for block: B:662:0x2e21 A[Catch: all -> 0x3246, TryCatch #23 {all -> 0x3246, blocks: (B:657:0x2db5, B:659:0x2dbb, B:660:0x2dfa, B:662:0x2e21, B:663:0x2e66, B:665:0x2e79, B:667:0x2e82, B:668:0x2ec8, B:701:0x310a, B:702:0x310e, B:704:0x3114, B:707:0x312c, B:710:0x3139, B:712:0x313c, B:724:0x3220, B:726:0x3226, B:727:0x3227, B:729:0x3229, B:731:0x3230, B:732:0x3231, B:671:0x2ed7, B:673:0x2edb, B:677:0x2ee7, B:679:0x2eed, B:691:0x2ff8, B:693:0x2ffe, B:694:0x303e, B:696:0x3068, B:697:0x30ad, B:699:0x30c3, B:700:0x3104, B:734:0x3233, B:736:0x323a, B:737:0x323b, B:739:0x323d, B:741:0x3244, B:742:0x3245, B:715:0x3168, B:717:0x316e, B:718:0x319b, B:686:0x2f5d, B:688:0x2f7c, B:689:0x2fec, B:681:0x2f0d, B:683:0x2f22, B:684:0x2f56, B:720:0x31a3), top: B:891:0x2db5, outer: #20, inners: #4, #11, #19, #64 }] */
    /* JADX WARN: Removed duplicated region for block: B:665:0x2e79 A[Catch: all -> 0x3246, TryCatch #23 {all -> 0x3246, blocks: (B:657:0x2db5, B:659:0x2dbb, B:660:0x2dfa, B:662:0x2e21, B:663:0x2e66, B:665:0x2e79, B:667:0x2e82, B:668:0x2ec8, B:701:0x310a, B:702:0x310e, B:704:0x3114, B:707:0x312c, B:710:0x3139, B:712:0x313c, B:724:0x3220, B:726:0x3226, B:727:0x3227, B:729:0x3229, B:731:0x3230, B:732:0x3231, B:671:0x2ed7, B:673:0x2edb, B:677:0x2ee7, B:679:0x2eed, B:691:0x2ff8, B:693:0x2ffe, B:694:0x303e, B:696:0x3068, B:697:0x30ad, B:699:0x30c3, B:700:0x3104, B:734:0x3233, B:736:0x323a, B:737:0x323b, B:739:0x323d, B:741:0x3244, B:742:0x3245, B:715:0x3168, B:717:0x316e, B:718:0x319b, B:686:0x2f5d, B:688:0x2f7c, B:689:0x2fec, B:681:0x2f0d, B:683:0x2f22, B:684:0x2f56, B:720:0x31a3), top: B:891:0x2db5, outer: #20, inners: #4, #11, #19, #64 }] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x2ed3  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x3114 A[Catch: all -> 0x3246, TryCatch #23 {all -> 0x3246, blocks: (B:657:0x2db5, B:659:0x2dbb, B:660:0x2dfa, B:662:0x2e21, B:663:0x2e66, B:665:0x2e79, B:667:0x2e82, B:668:0x2ec8, B:701:0x310a, B:702:0x310e, B:704:0x3114, B:707:0x312c, B:710:0x3139, B:712:0x313c, B:724:0x3220, B:726:0x3226, B:727:0x3227, B:729:0x3229, B:731:0x3230, B:732:0x3231, B:671:0x2ed7, B:673:0x2edb, B:677:0x2ee7, B:679:0x2eed, B:691:0x2ff8, B:693:0x2ffe, B:694:0x303e, B:696:0x3068, B:697:0x30ad, B:699:0x30c3, B:700:0x3104, B:734:0x3233, B:736:0x323a, B:737:0x323b, B:739:0x323d, B:741:0x3244, B:742:0x3245, B:715:0x3168, B:717:0x316e, B:718:0x319b, B:686:0x2f5d, B:688:0x2f7c, B:689:0x2fec, B:681:0x2f0d, B:683:0x2f22, B:684:0x2f56, B:720:0x31a3), top: B:891:0x2db5, outer: #20, inners: #4, #11, #19, #64 }] */
    /* JADX WARN: Removed duplicated region for block: B:757:0x33b1  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x3400  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x345d  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x3609  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x36e5  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x3735  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x3787  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x394b  */
    /* JADX WARN: Removed duplicated region for block: B:865:0x0b68 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:912:0x141f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:921:0x13a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:994:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v91, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v236 */
    /* JADX WARN: Type inference failed for: r13v143 */
    /* JADX WARN: Type inference failed for: r13v144 */
    /* JADX WARN: Type inference failed for: r13v145 */
    /* JADX WARN: Type inference failed for: r13v150 */
    /* JADX WARN: Type inference failed for: r13v151 */
    /* JADX WARN: Type inference failed for: r13v152 */
    /* JADX WARN: Type inference failed for: r13v153 */
    /* JADX WARN: Type inference failed for: r13v164 */
    /* JADX WARN: Type inference failed for: r13v168 */
    /* JADX WARN: Type inference failed for: r13v169 */
    /* JADX WARN: Type inference failed for: r13v173 */
    /* JADX WARN: Type inference failed for: r13v174 */
    /* JADX WARN: Type inference failed for: r13v175 */
    /* JADX WARN: Type inference failed for: r13v176 */
    /* JADX WARN: Type inference failed for: r13v177 */
    /* JADX WARN: Type inference failed for: r13v178 */
    /* JADX WARN: Type inference failed for: r13v179 */
    /* JADX WARN: Type inference failed for: r13v88 */
    /* JADX WARN: Type inference failed for: r13v89 */
    /* JADX WARN: Type inference failed for: r13v90 */
    /* JADX WARN: Type inference failed for: r13v91, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v92 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v112 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v114 */
    /* JADX WARN: Type inference failed for: r15v115 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v89 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v100 */
    /* JADX WARN: Type inference failed for: r25v101 */
    /* JADX WARN: Type inference failed for: r25v102 */
    /* JADX WARN: Type inference failed for: r25v104 */
    /* JADX WARN: Type inference failed for: r25v105 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v110 */
    /* JADX WARN: Type inference failed for: r25v113 */
    /* JADX WARN: Type inference failed for: r25v114 */
    /* JADX WARN: Type inference failed for: r25v115 */
    /* JADX WARN: Type inference failed for: r25v118 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v120 */
    /* JADX WARN: Type inference failed for: r25v121 */
    /* JADX WARN: Type inference failed for: r25v122 */
    /* JADX WARN: Type inference failed for: r25v123 */
    /* JADX WARN: Type inference failed for: r25v128 */
    /* JADX WARN: Type inference failed for: r25v129 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v131 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v141 */
    /* JADX WARN: Type inference failed for: r25v142 */
    /* JADX WARN: Type inference failed for: r25v143 */
    /* JADX WARN: Type inference failed for: r25v144 */
    /* JADX WARN: Type inference failed for: r25v145 */
    /* JADX WARN: Type inference failed for: r25v146 */
    /* JADX WARN: Type inference failed for: r25v147 */
    /* JADX WARN: Type inference failed for: r25v148 */
    /* JADX WARN: Type inference failed for: r25v149 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v150 */
    /* JADX WARN: Type inference failed for: r25v151 */
    /* JADX WARN: Type inference failed for: r25v152 */
    /* JADX WARN: Type inference failed for: r25v153 */
    /* JADX WARN: Type inference failed for: r25v154 */
    /* JADX WARN: Type inference failed for: r25v155 */
    /* JADX WARN: Type inference failed for: r25v156 */
    /* JADX WARN: Type inference failed for: r25v157 */
    /* JADX WARN: Type inference failed for: r25v158 */
    /* JADX WARN: Type inference failed for: r25v159 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v160 */
    /* JADX WARN: Type inference failed for: r25v161 */
    /* JADX WARN: Type inference failed for: r25v162 */
    /* JADX WARN: Type inference failed for: r25v163 */
    /* JADX WARN: Type inference failed for: r25v164 */
    /* JADX WARN: Type inference failed for: r25v165 */
    /* JADX WARN: Type inference failed for: r25v168 */
    /* JADX WARN: Type inference failed for: r25v169 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v170 */
    /* JADX WARN: Type inference failed for: r25v171 */
    /* JADX WARN: Type inference failed for: r25v172 */
    /* JADX WARN: Type inference failed for: r25v173 */
    /* JADX WARN: Type inference failed for: r25v174 */
    /* JADX WARN: Type inference failed for: r25v175 */
    /* JADX WARN: Type inference failed for: r25v176 */
    /* JADX WARN: Type inference failed for: r25v177 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v55 */
    /* JADX WARN: Type inference failed for: r25v58 */
    /* JADX WARN: Type inference failed for: r25v59 */
    /* JADX WARN: Type inference failed for: r25v60 */
    /* JADX WARN: Type inference failed for: r25v63 */
    /* JADX WARN: Type inference failed for: r25v64 */
    /* JADX WARN: Type inference failed for: r25v65 */
    /* JADX WARN: Type inference failed for: r25v66 */
    /* JADX WARN: Type inference failed for: r25v67 */
    /* JADX WARN: Type inference failed for: r25v70 */
    /* JADX WARN: Type inference failed for: r25v71 */
    /* JADX WARN: Type inference failed for: r25v72 */
    /* JADX WARN: Type inference failed for: r25v73 */
    /* JADX WARN: Type inference failed for: r25v74 */
    /* JADX WARN: Type inference failed for: r25v75 */
    /* JADX WARN: Type inference failed for: r25v78 */
    /* JADX WARN: Type inference failed for: r25v79 */
    /* JADX WARN: Type inference failed for: r25v81 */
    /* JADX WARN: Type inference failed for: r25v82 */
    /* JADX WARN: Type inference failed for: r25v88 */
    /* JADX WARN: Type inference failed for: r25v89 */
    /* JADX WARN: Type inference failed for: r25v90 */
    /* JADX WARN: Type inference failed for: r25v91 */
    /* JADX WARN: Type inference failed for: r25v92 */
    /* JADX WARN: Type inference failed for: r25v93 */
    /* JADX WARN: Type inference failed for: r25v94 */
    /* JADX WARN: Type inference failed for: r25v96 */
    /* JADX WARN: Type inference failed for: r25v98 */
    /* JADX WARN: Type inference failed for: r25v99 */
    /* JADX WARN: Type inference failed for: r32v23 */
    /* JADX WARN: Type inference failed for: r32v24 */
    /* JADX WARN: Type inference failed for: r32v25 */
    /* JADX WARN: Type inference failed for: r32v26 */
    /* JADX WARN: Type inference failed for: r32v27 */
    /* JADX WARN: Type inference failed for: r32v31 */
    /* JADX WARN: Type inference failed for: r32v42 */
    /* JADX WARN: Type inference failed for: r32v43 */
    /* JADX WARN: Type inference failed for: r32v44 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v8 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v527 */
    /* JADX WARN: Type inference failed for: r4v528 */
    /* JADX WARN: Type inference failed for: r4v540 */
    /* JADX WARN: Type inference failed for: r4v541 */
    /* JADX WARN: Type inference failed for: r8v254, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v255 */
    /* JADX WARN: Type inference failed for: r8v256 */
    /* JADX WARN: Type inference failed for: r8v257 */
    /* JADX WARN: Type inference failed for: r8v258 */
    /* JADX WARN: Type inference failed for: r8v276 */
    /* JADX WARN: Type inference failed for: r8v277 */
    /* JADX WARN: Type inference failed for: r8v279 */
    /* JADX WARN: Type inference failed for: r8v280 */
    /* JADX WARN: Type inference failed for: r9v107, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v118 */
    /* JADX WARN: Type inference failed for: r9v124, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v128 */
    /* JADX WARN: Type inference failed for: r9v129 */
    /* JADX WARN: Type inference failed for: r9v130 */
    /* JADX WARN: Type inference failed for: r9v131 */
    /* JADX WARN: Type inference failed for: r9v136 */
    /* JADX WARN: Type inference failed for: r9v137 */
    /* JADX WARN: Type inference failed for: r9v230 */
    /* JADX WARN: Type inference failed for: r9v231 */
    /* JADX WARN: Type inference failed for: r9v232 */
    /* JADX WARN: Type inference failed for: r9v70, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v75 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataTopUpActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        getAsAtTimestamp = 0;
        ShareDataUIState();
        int i = component4 + 73;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 27;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getRequestBeneficiariesState + 37;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void ShareDataUIState() {
        component2 = -4434442924106326231L;
        component3 = 1386857713;
        ShareDataUIState = (char) 50417;
        copydefault = new char[]{3095, 15920, 26690, 39548, 50361, 63191, 8418, 21312, 40279, 53102, 63894, 11232, 21975, 32797, 45618, 64583, 11904, 22711, 35538, 46327, 59138, 4438, 17268, 36235, 49111, 59898, 3093, 15915, 26708, 39548, 50355, 63184, 8434, 21295, 40262, 53102, 63882, 11175, 22005, 32799, 45618, 64583, 11929, 22704, 3095, 15975, 26647, 39528, 50400, 63113, 8421, 21259, 40198, 53117, 63952, 11255, 21935, 32845, 45603, 64536, 11924, 22767, 35475, 46267, 59191, 4365, 17200, 36235, 49026, 59814, 5120, 18042, 28788, 41631, 60576, 7880, 18707, 31551, 42262, 55103, 484, 13191, 32229, 43023, 55808, 1066, 14038, 24827, 37538, 56649, 3954, 14668, 3140, 15930, 26645, 39487, 50406, 63114, 8421, 21261, 40196, 53112, 63959, 11258, 21935, 32840, 45605, 64589, 11973, 22766, 35486, 46316, 59238, 4440, 17206, 36317, 49038, 59901, 5122, 18045, 28704, 41670, 60656, 7884, 18758, 31590, 42309, 55148, 435, 13274, 32183, 43021, 55893, 1062, 14047, 24831, 37616, 56651, 3955, 14623, 27538, 38380, 51143, 61932, 15457, 28166, 39008, 51926, 62592, 9901, 20831, 33654, 52517, 65479, 10736, 23447, 29374, 16522, 5874, 58590, 47621, 34852, 24073, 11745, 58272, 45451, 34686, 21849, 11013, 65208, 52434, 33467, 20583, 9800, 62516, 51740, 39362, 28585, 15813, 62252, 49464, 38730, 27310, 14492, 3795, 56383, 37394, 24685, 14263, 1421, 56306, 43392, 32529, 19819, 839, 54972, 42226, 31437, 18487, 7707, 60503, 41900, 29059, 18336, 5429, 60177, 47467, 36609, 17047, 4334, 59087, 46177, 35455, 22608, 12193, 64907, 46021, 33066, 22345, 9592, 63716, 52945, 40163, 21208, Typography.ndash, 63088, 50258, 39869, 3151, 15984, 26647, 39482, 50424, 63117, 3090, 15983, 26695, 39480, 50402, 63117, 8420, 21336, 40219, 53038, 63958, 11254, 21926, 32851, 45682, 64539, 11971, 22760, 35467, 46319, 59234, 4366, 17252, 36291, 49024, 59899, 5202, 17963, 28718, 41674, 60671, 7832, 18711, 31594, 42257, 55102, 477, 13304, 25985, 38818, 51552, 64277, 11568, 24277, 37052, 49853, 62551, 9828, 22551, 36307, 49120, 61833, 18088, 29839, 8957, 53443, 36358, 48232, 27229, 6655, 55270, 34258, 45943, 24866, 8016, 51890, 63629, 46836, 25636, 4642, 49269, 65118, 44426, 23530, 49200, 61969, 42084, 22109, 2182, 15096, 60609, 40735, 20848, 860, 13737, 59289, 39388, 19504, 32256, 3150, 15979, 26654, 39479, 50415, 63117, 8370, 21339, 40207, 53036, 3150, 15983, 26640, 39486, 50402, 63117, 8369, 21334, 40192, 53036, 63954};
        component1 = 6351938381201817182L;
    }
}
