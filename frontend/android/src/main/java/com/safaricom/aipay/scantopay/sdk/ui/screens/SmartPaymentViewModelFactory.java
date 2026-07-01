package com.safaricom.aipay.scantopay.sdk.ui.screens;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.ariver.engine.common.track.watchdog.ARiverTrackWatchDogEventConstant;
import com.safaricom.aipay.scantopay.sdk.core.data.remote.IGeminiApiService;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/ui/screens/SmartPaymentViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "geminiApiService", "Lcom/safaricom/aipay/scantopay/sdk/core/data/remote/IGeminiApiService;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "<init>", "(Lcom/safaricom/aipay/scantopay/sdk/core/data/remote/IGeminiApiService;Ljava/util/concurrent/ExecutorService;)V", ARiverTrackWatchDogEventConstant.FLAG_START_UP_CREATE, "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "scan-to-pay-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SmartPaymentViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final ExecutorService ShareDataUIState;
    private final IGeminiApiService copydefault;

    public SmartPaymentViewModelFactory(IGeminiApiService iGeminiApiService, ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(iGeminiApiService, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        this.copydefault = iGeminiApiService;
        this.ShareDataUIState = executorService;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "");
        if (modelClass.isAssignableFrom(SmartPaymentViewModel.class)) {
            return new SmartPaymentViewModel(this.copydefault, this.ShareDataUIState);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
