package com.huawei.http;

import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import com.huawei.common.exception.BaseException;
import com.huawei.common.util.file.FileDownloadUtils;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.constants.MediaType;
import com.huawei.http.appserver.HttpErrorUtils;
import java.io.InputStream;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/http/FileRequest;", "Lcom/huawei/http/BaseRequest;", "Lcom/huawei/common/util/file/FileDownloadUtils$Result;", "pathName", "", "needUnzip", "", "deleteAllInDir", "<init>", "(Ljava/lang/String;ZZ)V", "responseConvert", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lokhttp3/Response;", "parseGenericClass", "Ljava/lang/reflect/Type;", "HttpLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class FileRequest extends BaseRequest<FileDownloadUtils.Result> {
    private final boolean ShareDataUIState;
    private final boolean component1;
    private final String copydefault;

    public FileRequest(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
    }

    public FileRequest(String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.ShareDataUIState = z;
        this.component1 = z2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public FileDownloadUtils.Result responseConvert(Response response) throws Throwable {
        InputStream inputStreamByteStream;
        if (response == null || !response.isSuccessful()) {
            throw new BaseException(response != null ? response.message() : null);
        }
        if (Intrinsics.areEqual(Response.header$default(response, "Content-Type", null, 2, null), MediaType.APPLICATION_JSON)) {
            String strString = response.peekBody(Long.MAX_VALUE).string();
            String responseCode = HttpErrorUtils.getResponseCode(strString);
            String str = responseCode;
            if (str != null && str.length() != 0 && !Intrinsics.areEqual("SYS00000", responseCode)) {
                throw new BaseException(HttpErrorUtils.getErrorMessage(strString));
            }
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody == null || (inputStreamByteStream = responseBodyBody.byteStream()) == null) {
            throw new BaseException("");
        }
        FileDownloadUtils.Result resultStream2File = FileDownloadUtils.stream2File(inputStreamByteStream, this.copydefault, this.ShareDataUIState, this.component1);
        Intrinsics.checkNotNullExpressionValue(resultStream2File, "");
        return resultStream2File;
    }

    @Override
    protected Type parseGenericClass() {
        return FileDownloadUtils.Result.class;
    }
}
