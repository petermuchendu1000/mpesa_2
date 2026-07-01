package com.safaricom.mpesa.logging;

import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.constants.HttpConstants;
import com.safaricom.mpesa.logging.L;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J'\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/safaricom/mpesa/logging/FileLogger;", "", "filesDirectory", "Ljava/io/File;", "fileName", "", "(Ljava/io/File;Ljava/lang/String;)V", "file", "getFile$Logging_release", "()Ljava/io/File;", "setFile$Logging_release", "(Ljava/io/File;)V", "logFile", "", "logLevel", "Lcom/safaricom/mpesa/logging/L$LogLevel;", "tag", "text", "logFile$Logging_release", "Companion", "Logging_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileLogger {
    private static final String ShareDataUIState = "logfile.txt";
    private static final String component2 = "logs";
    private File copydefault;

    public FileLogger(File file, String str) {
        File file2;
        Intrinsics.checkNotNullParameter(file, "");
        if (L.INSTANCE.isEnabled()) {
            File file3 = new File(file, component2);
            if (!file3.exists()) {
                file3.mkdir();
            }
            File file4 = new File(file3, str == null ? ShareDataUIState : str);
            this.copydefault = file4;
            try {
                if (file4.exists() || (file2 = this.copydefault) == null) {
                    return;
                }
                file2.createNewFile();
            } catch (Exception e) {
                L.INSTANCE.e("Error creating logs file. Error was=" + e.getMessage(), new Object[0]);
            }
        }
    }

    public FileLogger(File file, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? null : str);
    }

    public final File getCopydefault() {
        return this.copydefault;
    }

    public final void setFile$Logging_release(File file) {
        this.copydefault = file;
    }

    public final void logFile$Logging_release(L.LogLevel logLevel, String tag, String text) {
        Intrinsics.checkNotNullParameter(logLevel, "");
        Intrinsics.checkNotNullParameter(text, "");
        if (this.copydefault != null) {
            Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.copydefault, true), Charsets.UTF_8);
            BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
            try {
                BufferedWriter bufferedWriter2 = bufferedWriter;
                bufferedWriter2.append((CharSequence) (new SimpleDateFormat("HH:mm:ss.S", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())) + ' ' + logLevel.name() + '/' + tag + HttpConstants.HEADER_VALUE_DELIMITER + text));
                Intrinsics.checkNotNullExpressionValue(bufferedWriter2.append('\n'), "");
                bufferedWriter2.flush();
                bufferedWriter2.close();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedWriter, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedWriter, th);
                    throw th2;
                }
            }
        }
    }
}
