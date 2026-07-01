package com.huawei.digitalpayment.consumer.basic.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.ColorUtils;
import com.google.common.base.Ascii;
import com.huawei.biometric.BiometricUtil;
import com.huawei.biometric.LocalAuthenticationUtils;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.widget.SingleRadioButton;
import com.huawei.digitalpayment.consumer.baselib.util.IdentityPinUtils;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.basic.R;
import com.huawei.digitalpayment.consumer.basic.databinding.ActivityPaySettingBinding;
import com.huawei.digitalpayment.consumer.basicUi.viewmodel.PayOperator;
import com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingUiState;
import com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0006\u0010\u000f\u001a\u00020\tJ\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\tH\u0002J\b\u0010\u0019\u001a\u00020\tH\u0014J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u000bH\u0002R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/ui/activity/PaySettingActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/basic/databinding/ActivityPaySettingBinding;", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/PaySettingViewModel;", "<init>", "()V", "getLayoutId", "", "initToolbar", "", "title", "", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "identifyPin", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPaySettingClick", "view", "Lcom/huawei/common/widget/SingleRadioButton;", "payOperator", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/PayOperator;", "observe", "onResume", "updateUi", "data", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/PaySettingUiState;", "getExtraKey", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class PaySettingActivity extends Hilt_PaySettingActivity<ActivityPaySettingBinding, PaySettingViewModel> {
    public static final int $stable = 8;
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char[] component3;
    private static int copy;
    private static char copydefault;
    private ActivityResultLauncher<Intent> launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 25;
            ShareDataUIState = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                PaySettingActivity.$r8$lambda$clz3MfAlp3mbIGbuLxynwjB4ilQ(this.f$0, (ActivityResult) obj);
                obj2.hashCode();
                throw null;
            }
            PaySettingActivity.$r8$lambda$clz3MfAlp3mbIGbuLxynwjB4ilQ(this.f$0, (ActivityResult) obj);
            int i3 = ShareDataUIState + 51;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }
    });
    private static final byte[] $$d = {102, Ascii.GS, -34, 39};
    private static final int $$e = 29;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component4 = 1;
    private static int getRequestBeneficiariesState = 0;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(short r5, short r6, int r7) {
        /*
            int r5 = r5 * 4
            int r5 = 3 - r5
            int r7 = r7 + 110
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            int r5 = r5 + 1
            r3 = r1[r5]
        L26:
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity.$$f(short, short, int):java.lang.String");
    }

    public static final ViewModel access$getViewModel$p(PaySettingActivity paySettingActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 43;
        equals = i2 % 128;
        int i3 = i2 % 2;
        VM vm = paySettingActivity.viewModel;
        if (i3 != 0) {
            return vm;
        }
        throw null;
    }

    public static final void access$updateUi(PaySettingActivity paySettingActivity, PaySettingUiState paySettingUiState) {
        int i = 2 % 2;
        int i2 = equals + 93;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        paySettingActivity.updateUi(paySettingUiState);
        int i4 = equals + 45;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 1;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_pay_setting;
        int i5 = getRequestBeneficiariesState + 25;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 73;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.biometric_setting_title4));
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[PHI: r7
  0x0063: PHI (r7v2 android.content.Intent) = (r7v1 android.content.Intent), (r7v6 android.content.Intent) binds: [B:22:0x0061, B:19:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void launcher$lambda$0(com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity r6, androidx.activity.result.ActivityResult r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity.equals
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            if (r1 != 0) goto L79
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            int r1 = r7.getResultCode()
            r4 = -1
            if (r1 != r4) goto L78
            android.content.Intent r1 = r7.getData()
            if (r1 == 0) goto L78
            android.content.Intent r1 = r7.getData()
            java.lang.String r4 = "encryptPin2"
            if (r1 == 0) goto L45
            int r2 = com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity.equals
            int r2 = r2 + 31
            int r5 = r2 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity.getRequestBeneficiariesState = r5
            int r2 = r2 % r0
            if (r2 == 0) goto L40
            java.lang.String r1 = r1.getStringExtra(r4)
            r2 = 8
            int r2 = r2 / 0
            goto L44
        L40:
            java.lang.String r1 = r1.getStringExtra(r4)
        L44:
            r2 = r1
        L45:
            if (r2 == 0) goto L78
            int r1 = com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity.getRequestBeneficiariesState
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity.equals = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L5d
            android.content.Intent r7 = r7.getData()
            r0 = 70
            int r0 = r0 / 0
            if (r7 == 0) goto L6b
            goto L63
        L5d:
            android.content.Intent r7 = r7.getData()
            if (r7 == 0) goto L6b
        L63:
            java.lang.String r7 = r7.getStringExtra(r4)
            if (r7 != 0) goto L6a
            goto L6b
        L6a:
            r3 = r7
        L6b:
            VM extends androidx.lifecycle.ViewModel r6 = r6.viewModel
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingViewModel r6 = (com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingViewModel) r6
            com.huawei.baselibs2.utils.encrypt.EncryptManager r7 = com.huawei.baselibs2.utils.encrypt.EncryptManager.INSTANCE
            java.lang.String r7 = r7.decrypt(r3)
            r6.dispatcherOperator(r7)
        L78:
            return
        L79:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            r7.getResultCode()
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity.launcher$lambda$0(com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity, androidx.activity.result.ActivityResult):void");
    }

    public final void identifyPin() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 21;
        equals = i2 % 128;
        int i3 = i2 % 2;
        ActivityResultLauncher<Intent> activityResultLauncher = this.launcher;
        Intent identityPinIntent = IdentityPinUtils.getIdentityPinIntent();
        Intrinsics.checkNotNullExpressionValue(identityPinIntent, "");
        activityResultLauncher.launch(identityPinIntent);
        int i4 = equals + 19;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 123;
            $10 = i5 % 128;
            int i6 = 58224;
            if (i5 % i3 != 0) {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3];
                i2 = 1;
            } else {
                cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                int i7 = $11 + 63;
                $10 = i7 % 128;
                int i8 = i7 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i9 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) component2) ^ 4374495167426960553L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ShareDataUIState);
                    objArr2[i3] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - View.getDefaultSize(0, 0), 32 - TextUtils.getOffsetBefore("", 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23250), 592652048, false, $$f(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 844, 31 - TextUtils.lastIndexOf("", '0', 0), (char) (23251 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 592652048, false, $$f(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 465, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 48, (char) KeyEvent.keyCodeFromString(""), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i11 = $11 + 53;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            i3 = 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity$observe$1", f = "PaySettingActivity.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        int copydefault;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity$observe$1$1", f = "PaySettingActivity.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 1;
            private static int copydefault;
            final PaySettingActivity component1;
            int component2;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "data", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/PaySettingUiState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity$observe$1$1$1", f = "PaySettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<PaySettingUiState, Continuation<? super Unit>, Object> {
                private static int component1 = 1;
                private static int component3;
                Object ShareDataUIState;
                final PaySettingActivity component2;
                int copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.copydefault != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = component3 + 95;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    ResultKt.throwOnFailure(obj);
                    PaySettingActivity.access$updateUi(this.component2, (PaySettingUiState) this.ShareDataUIState);
                    Unit unit = Unit.INSTANCE;
                    int i4 = component1 + 63;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PaySettingActivity paySettingActivity, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.component2 = paySettingActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.component2, continuation);
                    anonymousClass1.ShareDataUIState = obj;
                    AnonymousClass1 anonymousClass12 = anonymousClass1;
                    int i2 = component3 + 63;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass12;
                }

                public final Object ShareDataUIState(PaySettingUiState paySettingUiState, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 79;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(paySettingUiState, continuation);
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        anonymousClass1.invokeSuspend(unit);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Object objInvokeSuspend = anonymousClass1.invokeSuspend(unit);
                    int i4 = component1 + 51;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                @Override
                public Object invoke(PaySettingUiState paySettingUiState, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 91;
                    component3 = i2 % 128;
                    Object obj = null;
                    PaySettingUiState paySettingUiState2 = paySettingUiState;
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i2 % 2 != 0) {
                        ShareDataUIState(paySettingUiState2, continuation2);
                        obj.hashCode();
                        throw null;
                    }
                    Object objShareDataUIState = ShareDataUIState(paySettingUiState2, continuation2);
                    int i3 = component1 + 87;
                    component3 = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objShareDataUIState;
                    }
                    throw null;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component2;
                if (i2 != 0) {
                    int i3 = ShareDataUIState;
                    int i4 = i3 + 55;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = i3 + 85;
                    copydefault = i6 % 128;
                    if (i6 % 2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        throw null;
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.component2 = 1;
                    if (FlowKt.collect(FlowKt.onEach(((PaySettingViewModel) PaySettingActivity.access$getViewModel$p(this.component1)).uiState(), new AnonymousClass1(this.component1, null)), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i7 = copydefault + 17;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PaySettingActivity paySettingActivity, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.component1 = paySettingActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component1, continuation);
                int i2 = copydefault + 79;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass2;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 103;
                ShareDataUIState = i2 % 128;
                Object obj = null;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 == 0) {
                    copydefault(coroutineScope2, continuation2);
                    obj.hashCode();
                    throw null;
                }
                Object objCopydefault = copydefault(coroutineScope2, continuation2);
                int i3 = copydefault + 37;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    return objCopydefault;
                }
                throw null;
            }

            public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 83;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = copydefault + 101;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 69;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.copydefault;
            Object obj2 = null;
            if (i4 != 0) {
                int i5 = component3 + 77;
                component1 = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.copydefault = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(PaySettingActivity.this, Lifecycle.State.STARTED, new AnonymousClass2(PaySettingActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i6 = component1 + 105;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = PaySettingActivity.this.new component3(continuation);
            int i2 = component3 + 103;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 6 / 0;
            }
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 83;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = component1 + 13;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return objComponent1;
            }
            throw null;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = component3 + 5;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component3 component3Var = (component3) create(coroutineScope, continuation);
            if (i3 != 0) {
                objInvokeSuspend = component3Var.invokeSuspend(Unit.INSTANCE);
                int i4 = 28 / 0;
            } else {
                objInvokeSuspend = component3Var.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = component1 + 101;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        int i = 2 % 2;
        int i2 = equals + 91;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        d(new byte[]{1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{0, 18, 28, 0}, true, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        e(5 - View.resolveSize(0, 0), new char[]{42660, 30782, 50398, 57659, 17313, 15133}, objArr2);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr3 = new Object[1];
                e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952754_res_0x7f130472).substring(2, 3).length() + 25, new char[]{11798, 11214, 29694, 22956, 15701, 36823, 52536, 46894, 56602, 49692, 63359, 8998, 4793, 59896, 22855, 44830, 36676, 6319, 51925, 45804, 39210, 59857, 38191, 55783, 48292, 23405}, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952810_res_0x7f1304aa).substring(9, 10).codePointAt(0) - 14, new char[]{29068, 52858, 41277, 42004, 57239, 51229, 17262, 60112, 31582, 32906, 14096, 17038, 22628, 39710, 22855, 44830, 61514, 2029}, objArr4);
                baseContext = (Context) cls2.getMethod((String) objArr4[0], new Class[0]).invoke(null, null);
                int i4 = getRequestBeneficiariesState + 75;
                equals = i4 % 128;
                int i5 = i4 % 2;
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                    int i6 = getRequestBeneficiariesState + 77;
                    equals = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(0L) + 6618, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, (char) (ViewConfiguration.getScrollBarSize() >> 8), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    d(new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1}, new int[]{18, 48, 0, 28}, true, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    e(64 - TextUtils.indexOf("", ""), new char[]{5389, 53181, 23066, 37136, 26613, 63734, 48635, 52306, 64413, 29950, 48500, 9805, 17243, 26991, 48635, 52306, 30808, 820, 21894, 58187, 65478, 12519, 13278, 57269, 8256, 60641, 28939, 19067, 58106, 39921, 51353, 22400, 55515, 9464, 46162, 36295, 5705, 5946, 40201, 41341, 9271, 6124, 52883, 30242, 45801, 50240, 37042, 10238, 1012, 25878, 19266, 29242, 15490, 5722, 18564, 6419, 26794, 4978, 47693, 38785, 44957, 38602, 5347, 44080}, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 33, new char[]{65478, 12519, 44765, 34577, 52785, 34292, 6943, 58572, 44311, 14185, 9012, 42740, 43327, 37595, 12226, 19951, 40022, 48125, 24356, 26467, 34095, 11522, 26347, 39910, 626, 17613, 26794, 4978, 28939, 19067, 17873, 32515, 7836, 35278, 63073, 59900, 65273, 54584, 16448, 59878, 30443, 13042, 48078, 65330, 36909, 43810, 57337, 4979, 30497, 41992, 6195, 2450, 18022, 51798, 9838, 31426, 9811, 39235, 1796, 36536, 35114, 61637, 42917, 18777}, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 43, new char[]{36533, 50681, 2946, 21970, 7947, 33201, 55174, 51640, 629, 43256, 43935, 30558, 17873, 32515, 36046, 6840, 52785, 34292, 6534, 22156, 44943, 14754, 46162, 36295, 41328, 25742, 48713, 36889, 27675, 62945, 61613, 38656, 2706, 64786, 41240, 37454, 23973, 25545, 36693, 41701, 1497, 9864, 65020, 34427, 36693, 41701, 13652, 30140, 5236, 20297, 57758, 57197, 56602, 49692, 31881, 156, 4347, 27216, 44947, 23348, 35378, 59556, 30383, 43345, 31873, 60834, 31635, 38913, 57239, 51229, 12731, 52680}, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    d(new byte[]{1, 1, 1, 1, 0, 1}, new int[]{66, 6, 0, 6}, false, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952781_res_0x7f13048d).substring(14, 15).codePointAt(0) + 4, new char[]{135, 44420, 23730, 29393, 25265, 46487, 17202, 44608, 43453, 5238, 55515, 9464, 39698, 50261, 36046, 6840, 57782, 50914, 51267, 16147, 23522, 1303, 22286, 62869, 48780, 38921, 7510, 35482, 31182, 10364, 17243, 26991, 39866, 35055, 43327, 37595}, objArr10);
                    Object[] objArr11 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr10[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getFadingEdgeLength() >> 16), 56 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        super.onCreate(savedInstanceState);
        getWindow().setBackgroundDrawable(new ColorDrawable(ColorUtils.getColor(R.color.colorBackgroundFloating)));
        SingleRadioButton singleRadioButton = ((ActivityPaySettingBinding) this.binding).cbNone;
        Intrinsics.checkNotNullExpressionValue(singleRadioButton, "");
        onPaySettingClick(singleRadioButton, PayOperator.NONE);
        SingleRadioButton singleRadioButton2 = ((ActivityPaySettingBinding) this.binding).cbFacePayment;
        Intrinsics.checkNotNullExpressionValue(singleRadioButton2, "");
        onPaySettingClick(singleRadioButton2, PayOperator.FACE_ID);
        SingleRadioButton singleRadioButton3 = ((ActivityPaySettingBinding) this.binding).cbFingerprintPayment;
        Intrinsics.checkNotNullExpressionValue(singleRadioButton3, "");
        onPaySettingClick(singleRadioButton3, PayOperator.FINGERPRINT);
        observe();
    }

    private static void d(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = component3;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = $11 + 3;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 13, (char) (View.MeasureSpec.getMode(0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i8++;
                    int i9 = $10 + 117;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i11 = $10 + 75;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i13 = $10 + 43;
                $11 = i13 % 128;
                if (i13 % 2 != 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != 1 : bArr[iTrustedWebActivityService_Parcel.copydefault] != 0) {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3580, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 1180380354, false, $$f(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i15 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4503 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 36 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (27896 - ExpandableListView.getPackedPositionChild(0L)), -1464227204, false, $$f(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i15] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                try {
                    Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1859 - Color.red(0), 33 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 80302927, false, $$f(b6, b6, (byte) $$d.length), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i16 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i16, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i17 = $11 + 9;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private final void onPaySettingClick(final SingleRadioButton view, final PayOperator payOperator) {
        int i = 2 % 2;
        view.setOnClickListener(new SingleRadioButton.OnClickListener() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onClick(View v, int status, boolean isCheck) {
                boolean z;
                int i2 = 2 % 2;
                if (view.isChecked()) {
                    return;
                }
                if ((payOperator != PayOperator.FINGERPRINT || BiometricUtil.isEnrolledBiometric()) && (payOperator != PayOperator.FACE_ID || LocalAuthenticationUtils.isEnrolled())) {
                    ((PaySettingViewModel) PaySettingActivity.access$getViewModel$p(this)).setOperator(payOperator);
                    this.identifyPin();
                    return;
                }
                if (payOperator == PayOperator.FINGERPRINT) {
                    int i3 = component1 + 113;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    z = true;
                } else {
                    int i5 = component1 + 13;
                    component3 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 5 / 4;
                    }
                    z = false;
                }
                BiometricUtil.jumpSystemBiometricSetting(z);
                int i7 = component3 + 19;
                component1 = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        view.setOnClickListener(new FilterFastClickListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void onFilterClick(View v) {
                int i2 = 2 % 2;
                int i3 = component3 + 99;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(v, "");
                int i5 = component3 + 3;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = equals + 81;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void observe() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component3(null), 3, null);
        int i2 = getRequestBeneficiariesState + 125;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateUi(com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingUiState r9) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity.updateUi(com.huawei.digitalpayment.consumer.basicUi.viewmodel.PaySettingUiState):void");
    }

    private final String getExtraKey() {
        int i = 2 % 2;
        String str = "_" + PhoneUtils.getRecentLoginPhone();
        int i2 = getRequestBeneficiariesState + 5;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0092  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.PaySettingActivity.onPause():void");
    }

    @Override
    public void attachBaseContext(Context context) throws Throwable {
        Context applicationContext = context;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object[] objArr = new Object[1];
        d(new byte[]{1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{0, 18, 28, 0}, true, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        e(5 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{42660, 30782, 50398, 57659, 17313, 15133}, objArr2);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext();
            }
            if (applicationContext != null) {
                int i2 = equals + 93;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 6618, (ViewConfiguration.getJumpTapTimeout() >> 16) + 42, (char) TextUtils.getCapsMode("", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = new Object[1];
                    d(new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1}, new int[]{18, 48, 0, 28}, true, objArr3);
                    String str = (String) objArr3[0];
                    Object[] objArr4 = new Object[1];
                    e(64 - View.MeasureSpec.getMode(0), new char[]{5389, 53181, 23066, 37136, 26613, 63734, 48635, 52306, 64413, 29950, 48500, 9805, 17243, 26991, 48635, 52306, 30808, 820, 21894, 58187, 65478, 12519, 13278, 57269, 8256, 60641, 28939, 19067, 58106, 39921, 51353, 22400, 55515, 9464, 46162, 36295, 5705, 5946, 40201, 41341, 9271, 6124, 52883, 30242, 45801, 50240, 37042, 10238, 1012, 25878, 19266, 29242, 15490, 5722, 18564, 6419, 26794, 4978, 47693, 38785, 44957, 38602, 5347, 44080}, objArr4);
                    String str2 = (String) objArr4[0];
                    Object[] objArr5 = new Object[1];
                    e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952719_res_0x7f13044f).substring(6, 7).length() + 63, new char[]{65478, 12519, 44765, 34577, 52785, 34292, 6943, 58572, 44311, 14185, 9012, 42740, 43327, 37595, 12226, 19951, 40022, 48125, 24356, 26467, 34095, 11522, 26347, 39910, 626, 17613, 26794, 4978, 28939, 19067, 17873, 32515, 7836, 35278, 63073, 59900, 65273, 54584, 16448, 59878, 30443, 13042, 48078, 65330, 36909, 43810, 57337, 4979, 30497, 41992, 6195, 2450, 18022, 51798, 9838, 31426, 9811, 39235, 1796, 36536, 35114, 61637, 42917, 18777}, objArr5);
                    String str3 = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    e(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 43, new char[]{36533, 50681, 2946, 21970, 7947, 33201, 55174, 51640, 629, 43256, 43935, 30558, 17873, 32515, 36046, 6840, 52785, 34292, 6534, 22156, 44943, 14754, 46162, 36295, 41328, 25742, 48713, 36889, 27675, 62945, 61613, 38656, 2706, 64786, 41240, 37454, 23973, 25545, 36693, 41701, 1497, 9864, 65020, 34427, 36693, 41701, 13652, 30140, 5236, 20297, 57758, 57197, 56602, 49692, 31881, 156, 4347, 27216, 44947, 23348, 35378, 59556, 30383, 43345, 31873, 60834, 31635, 38913, 57239, 51229, 12731, 52680}, objArr6);
                    String str4 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    d(new byte[]{1, 1, 1, 1, 0, 1}, new int[]{66, 6, 0, 6}, false, objArr7);
                    String str5 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(TextUtils.lastIndexOf("", '0', 0) + 37, new char[]{135, 44420, 23730, 29393, 25265, 46487, 17202, 44608, 43453, 5238, 55515, 9464, 39698, 50261, 36046, 6840, 57782, 50914, 51267, 16147, 23522, 1303, 22286, 62869, 48780, 38921, 7510, 35482, 31182, 10364, 17243, 26991, 39866, 35055, 43327, 37595}, objArr8);
                    Object[] objArr9 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr8[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - ((Process.getThreadPriority(0) + 20) >> 6), 55 - ImageFormat.getBitsPerPixel(0), (char) TextUtils.indexOf("", "", 0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr9);
                    int i4 = equals + 47;
                    getRequestBeneficiariesState = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
    }

    public static void $r8$lambda$clz3MfAlp3mbIGbuLxynwjB4ilQ(PaySettingActivity paySettingActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = equals + 5;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        launcher$lambda$0(paySettingActivity, activityResult);
        int i4 = getRequestBeneficiariesState + 41;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
    }

    static {
        copy = 0;
        component2();
        int i = component4 + 117;
        copy = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 101;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
    }

    static void component2() {
        component3 = new char[]{33432, 33360, 33367, 33375, 33370, 33363, 33442, 33412, 33459, 33362, 33461, 33466, 33373, 33367, 33363, 33368, 33370, 33372, 33477, 33426, 33424, 33513, 33427, 33426, 33515, 33429, 33428, 33514, 33516, 33430, 33427, 33426, 33427, 33513, 33510, 33512, 33427, 33430, 33429, 33467, 33426, 33513, 33425, 33428, 33514, 33426, 33470, 33428, 33514, 33514, 33515, 33517, 33517, 33514, 33428, 33469, 33425, 33514, 33518, 33519, 33431, 33468, 33466, 33465, 33468, 33470, 33475, 33516, 33520, 33517, 33518, 33519};
        component1 = (char) 5075;
        copydefault = (char) 44701;
        component2 = (char) 33704;
        ShareDataUIState = (char) 28039;
    }
}
