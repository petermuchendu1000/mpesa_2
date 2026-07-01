package com.safaricom.aipay.scantopay.sdk.ui.screens;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.camera.core.ImageCapture;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import b.o;
import b.p;
import b.q;
import b.r;
import com.safaricom.aipay.scantopay.sdk.core.data.ScanResult;
import com.safaricom.aipay.scantopay.sdk.core.data.remote.IGeminiApiService;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b \u0010!J)\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000e¢\u0006\u0004\b$\u0010\u0013J\r\u0010%\u001a\u00020\u000e¢\u0006\u0004\b%\u0010\u0013J\r\u0010&\u001a\u00020\u000e¢\u0006\u0004\b&\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020*0-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/ui/screens/SmartPaymentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/safaricom/aipay/scantopay/sdk/core/data/remote/IGeminiApiService;", "geminiApiService", "Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "<init>", "(Lcom/safaricom/aipay/scantopay/sdk/core/data/remote/IGeminiApiService;Ljava/util/concurrent/ExecutorService;)V", "", "result", "", "timeTaken", "Lkotlin/Function1;", "Lcom/safaricom/aipay/scantopay/sdk/core/data/ScanResult;", "", "onResult", "handleImageProcessingResult", "(Ljava/lang/String;JLkotlin/jvm/functions/Function1;)V", "onCameraInitialized", "()V", "Landroid/content/Context;", "context", "Landroidx/camera/core/ImageCapture;", "imageCapture", "", "previewWidth", "previewHeight", "onScanResult", "onImageCaptured", "(Landroid/content/Context;Landroidx/camera/core/ImageCapture;FFLkotlin/jvm/functions/Function1;)V", "Landroid/net/Uri;", "uri", "onImageSelected", "(Landroid/net/Uri;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "processImage", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "dismissNoPaymentInfoMessage", "toggleFlash", "resetState", "Lcom/safaricom/aipay/scantopay/sdk/core/data/remote/IGeminiApiService;", "Ljava/util/concurrent/ExecutorService;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lb/o;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "scan-to-pay-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SmartPaymentViewModel extends ViewModel {
    public static final int $stable = 8;
    private final StateFlow<o> ShareDataUIState;
    private final MutableStateFlow<o> component1;
    private final IGeminiApiService component3;
    private final ExecutorService copydefault;

    public SmartPaymentViewModel(IGeminiApiService iGeminiApiService, ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(iGeminiApiService, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        this.component3 = iGeminiApiService;
        this.copydefault = executorService;
        MutableStateFlow<o> MutableStateFlow = StateFlowKt.MutableStateFlow(new o(false, 511));
        this.component1 = MutableStateFlow;
        this.ShareDataUIState = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0353  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ShareDataUIState(java.lang.String r28, long r29, kotlin.jvm.functions.Function1<? super com.safaricom.aipay.scantopay.sdk.core.data.ScanResult, kotlin.Unit> r31) {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.aipay.scantopay.sdk.ui.screens.SmartPaymentViewModel.ShareDataUIState(java.lang.String, long, kotlin.jvm.functions.Function1):void");
    }

    public final void dismissNoPaymentInfoMessage() {
        MutableStateFlow<o> mutableStateFlow = this.component1;
        mutableStateFlow.setValue(o.a(mutableStateFlow.getValue(), false, true, false, null, null, null, false, null, 403));
    }

    public final StateFlow<o> getUiState() {
        return this.ShareDataUIState;
    }

    public final void onCameraInitialized() {
        MutableStateFlow<o> mutableStateFlow = this.component1;
        mutableStateFlow.setValue(o.a(mutableStateFlow.getValue(), false, false, false, null, null, null, false, null, TypedValues.PositionType.TYPE_POSITION_TYPE));
    }

    public final void onImageCaptured(Context context, ImageCapture imageCapture, float previewWidth, float previewHeight, Function1<? super ScanResult, Unit> onScanResult) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(imageCapture, "");
        Intrinsics.checkNotNullParameter(onScanResult, "");
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new p(this, context, imageCapture, previewWidth, previewHeight, onScanResult, null), 3, null);
    }

    public final void onImageSelected(Uri uri, Context context, Function1<? super ScanResult, Unit> onResult) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(onResult, "");
        MutableStateFlow<o> mutableStateFlow = this.component1;
        mutableStateFlow.setValue(o.a(mutableStateFlow.getValue(), false, false, false, null, null, uri, false, null, 387));
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new q(this, context, onResult, null), 3, null);
    }

    public final void processImage(Context context, Function1<? super ScanResult, Unit> onScanResult) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(onScanResult, "");
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new r(this, context, onScanResult, null), 3, null);
    }

    public final void resetState() {
        Log.d("SmartPaymentViewModel", "Resetting state.");
        MutableStateFlow<o> mutableStateFlow = this.component1;
        mutableStateFlow.setValue(new o(mutableStateFlow.getValue().f902a, TypedValues.PositionType.TYPE_POSITION_TYPE));
    }

    public final void toggleFlash() {
        MutableStateFlow<o> mutableStateFlow = this.component1;
        mutableStateFlow.setValue(o.a(mutableStateFlow.getValue(), false, false, false, null, null, null, !this.component1.getValue().h, null, 383));
    }
}
