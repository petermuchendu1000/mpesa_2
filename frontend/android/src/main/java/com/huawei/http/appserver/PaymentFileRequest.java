package com.huawei.http.appserver;

import com.huawei.arouter.RouteUtils;
import com.huawei.http.FileRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH\u0014¨\u0006\u000b"}, d2 = {"Lcom/huawei/http/appserver/PaymentFileRequest;", "Lcom/huawei/http/FileRequest;", "pathName", "", "needUnzip", "", "<init>", "(Ljava/lang/String;Z)V", "getInterceptors", "", "Lokhttp3/Interceptor;", "HttpLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class PaymentFileRequest extends FileRequest {
    public PaymentFileRequest(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentFileRequest(String str, boolean z) {
        super(str, z, false, 4, null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override
    public List<Interceptor> getInterceptors() {
        IAppServerHttpConfig iAppServerHttpConfig = (IAppServerHttpConfig) RouteUtils.getService(IAppServerHttpConfig.class);
        if (iAppServerHttpConfig != null) {
            return iAppServerHttpConfig.getInterceptors();
        }
        return null;
    }
}
