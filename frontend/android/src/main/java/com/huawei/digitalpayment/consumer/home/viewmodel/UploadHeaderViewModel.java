package com.huawei.digitalpayment.consumer.home.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.home.ui.repository.UploadHeaderRepository;
import com.huawei.digitalpayment.consumer.profile.model.remote.RemoteUploadAvatar;
import com.huawei.digitalpayment.consumer.profile.model.request.UploadAvatarParams;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/viewmodel/UploadHeaderViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "repository", "Lcom/huawei/digitalpayment/consumer/home/ui/repository/UploadHeaderRepository;", "data", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteUploadAvatar;", "getData", "Landroidx/lifecycle/LiveData;", "uploadHeader", "", "encodedBase64Image", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UploadHeaderViewModel extends ViewModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private static int equals = 1;
    private final MutableLiveData<Resource<RemoteUploadAvatar>> component1 = new MutableLiveData<>();
    private UploadHeaderRepository component2;

    public static final MutableLiveData access$getData$p(UploadHeaderViewModel uploadHeaderViewModel) {
        int i = 2 % 2;
        int i2 = component3 + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<RemoteUploadAvatar>> mutableLiveData = uploadHeaderViewModel.component1;
        if (i3 != 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LiveData<Resource<RemoteUploadAvatar>> getData() {
        int i = 2 % 2;
        int i2 = equals + 105;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<RemoteUploadAvatar>> mutableLiveData = this.component1;
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return mutableLiveData;
    }

    public final void uploadHeader(String encodedBase64Image) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(encodedBase64Image, "");
        this.component1.setValue(Resource.loading(null));
        UploadHeaderRepository uploadHeaderRepository = new UploadHeaderRepository(new UploadAvatarParams(encodedBase64Image));
        this.component2 = uploadHeaderRepository;
        Intrinsics.checkNotNull(uploadHeaderRepository);
        uploadHeaderRepository.sendRequest(new ApiCallback<RemoteUploadAvatar>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void onSuccess(RemoteUploadAvatar remoteUploadAvatar) {
                int i2 = 2 % 2;
                int i3 = component1 + 83;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(remoteUploadAvatar);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(RemoteUploadAvatar value) {
                int i2 = 2 % 2;
                int i3 = component3 + 79;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(value, "");
                UploadHeaderViewModel.access$getData$p(UploadHeaderViewModel.this).setValue(Resource.success(value));
                int i5 = component3 + 57;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 95;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                UploadHeaderViewModel.access$getData$p(UploadHeaderViewModel.this).setValue(Resource.error(e, null));
                int i5 = component1 + 51;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 / 0;
                }
            }
        });
        int i2 = component3 + 73;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    static {
        int i = 1 + 11;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
