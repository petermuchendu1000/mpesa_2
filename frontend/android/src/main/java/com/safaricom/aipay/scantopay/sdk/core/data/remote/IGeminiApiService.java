package com.safaricom.aipay.scantopay.sdk.core.data.remote;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/core/data/remote/IGeminiApiService;", "", "sendImageForAnalysis", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/content/Context;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseResult", "content", "scan-to-pay-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IGeminiApiService {
    String parseResult(String content);

    Object sendImageForAnalysis(Context context, Bitmap bitmap, Continuation<? super String> continuation);
}
