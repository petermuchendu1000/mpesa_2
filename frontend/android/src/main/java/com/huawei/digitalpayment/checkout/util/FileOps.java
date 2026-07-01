package com.huawei.digitalpayment.checkout.util;

import android.content.Context;
import com.safaricom.mpesa.logging.L;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/checkout/util/FileOps;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "writeFileToCacheFolder", "", "fileName", "byteArray", "", "readFileFromCacheFolder", "Ljava/io/File;", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FileOps {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final Context component1;

    public FileOps(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.component1 = context;
    }

    public final Context getContext() {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    public final String writeFileToCacheFolder(String fileName, byte[] byteArray) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fileName, "");
        Intrinsics.checkNotNullParameter(byteArray, "");
        Date time = Calendar.getInstance().getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        String date = DateExtensionsKt.formatDate(time, "yyyyMMdd");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strSubstring = string.substring(0, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        String str = fileName + "_" + date + "_" + strSubstring + ".pdf";
        try {
            File file = new File(this.component1.getCacheDir(), str);
            if (!file.exists()) {
                int i2 = ShareDataUIState + 101;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    file.createNewFile();
                    throw null;
                }
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byteArray);
            fileOutputStream.close();
            return str;
        } catch (Exception e) {
            L.INSTANCE.d("Error Creating File from Byte Array", new Object[0]);
            String message = e.getMessage();
            if (message != null) {
                L.INSTANCE.d(message, new Object[0]);
                int i3 = copydefault + 69;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = copydefault + 105;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return "";
        }
    }

    public final File readFileFromCacheFolder(String fileName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fileName, "");
        File file = new File(this.component1.getCacheDir(), fileName);
        if (!file.exists()) {
            return null;
        }
        int i2 = ShareDataUIState + 93;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return file;
        }
        int i3 = 5 % 4;
        return file;
    }

    static {
        int i = 1 + 81;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
