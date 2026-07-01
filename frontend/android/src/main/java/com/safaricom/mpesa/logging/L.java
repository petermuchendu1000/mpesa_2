package com.safaricom.mpesa.logging;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.griver.base.common.utils.ToastUtils;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u00013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0002J'\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001f\"\u00020\u0001¢\u0006\u0002\u0010 J/\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001f\"\u00020\u0001¢\u0006\u0002\u0010!J\"\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001d\u001a\u00020\u0016H\u0002J'\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001f\"\u00020\u0001¢\u0006\u0002\u0010 J3\u0010%\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u001f\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010!J9\u0010%\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'2\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001f\"\u00020\u0001H\u0007¢\u0006\u0002\u0010(J\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'J\b\u0010)\u001a\u0004\u0018\u00010*J'\u0010+\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001f\"\u00020\u0001¢\u0006\u0002\u0010 J/\u0010+\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001f\"\u00020\u0001¢\u0006\u0002\u0010!J\u001a\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020*2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0016J'\u0010/\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001f\"\u00020\u0001¢\u0006\u0002\u0010 J1\u0010/\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001f\"\u00020\u0001H\u0007¢\u0006\u0002\u0010!J'\u00100\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001f\"\u00020\u0001¢\u0006\u0002\u0010 J1\u00100\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001f\"\u00020\u00012\b\u00101\u001a\u0004\u0018\u00010'¢\u0006\u0002\u00102J/\u00100\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001f\"\u00020\u0001¢\u0006\u0002\u0010!J=\u00100\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010'2\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u001f\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010(J\u0016\u00100\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u000b0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u00064"}, d2 = {"Lcom/safaricom/mpesa/logging/L;", "", "()V", "ANONYMOUS_CLASS", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "CALL_STACK_INDEX", "", "MAX_LOG_SIZE", "MAX_TAG_LENGTH", "executor", "Ljava/util/concurrent/ExecutorService;", "fileLogger", "Lcom/safaricom/mpesa/logging/FileLogger;", "isDeveloperLogsEnabled", "", "()Z", "setDeveloperLogsEnabled", "(Z)V", "isEnabled", "setEnabled", "tag", "", "getTag", "()Ljava/lang/String;", "addLineNumber", "message", "d", "", "text", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "doLog", "logLevel", "Lcom/safaricom/mpesa/logging/L$LogLevel;", "e", "throwable", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V", "getLogsFile", "Ljava/io/File;", "i", "setFileLogger", "filesDir", "fileLogName", "v", "w", "t", "(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V", "LogLevel", "Logging_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class L {
    private static final int component1 = 2;
    private static final int component2 = 4000;
    private static final int component3 = 23;
    private static FileLogger equals;
    public static final L INSTANCE = new L();
    private static final Pattern copydefault = Pattern.compile("(\\$\\d+)+$");
    private static ExecutorService ShareDataUIState = Executors.newSingleThreadExecutor();
    private static boolean getRequestBeneficiariesState = true;
    private static boolean copy = true;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/mpesa/logging/L$LogLevel;", "", "(Ljava/lang/String;I)V", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "D", "I", ExifInterface.LONGITUDE_WEST, ExifInterface.LONGITUDE_EAST, "Logging_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LogLevel {
        V,
        D,
        I,
        W,
        E
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevel.values().length];
            try {
                iArr[LogLevel.D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevel.I.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevel.W.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevel.E.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevel.V.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private L() {
    }

    private final String ShareDataUIState() {
        if (!getRequestBeneficiariesState) {
            return "";
        }
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length <= 2) {
                return "";
            }
            String className = stackTrace[2].getClassName();
            Matcher matcher = copydefault.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            Intrinsics.checkNotNullExpressionValue(className, "");
            Intrinsics.checkNotNullExpressionValue(className, "");
            String strSubstring = className.substring(StringsKt.lastIndexOf$default((CharSequence) className, '.', 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            strSubstring.length();
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return strSubstring;
        } catch (Exception e) {
            e("Error while trying to extract class name", e);
            return "";
        }
    }

    public final boolean isEnabled() {
        return getRequestBeneficiariesState;
    }

    public final void setEnabled(boolean z) {
        getRequestBeneficiariesState = z;
    }

    public final boolean isDeveloperLogsEnabled() {
        return copy;
    }

    public final void setDeveloperLogsEnabled(boolean z) {
        copy = z;
    }

    @JvmStatic
    public static final void v(String tag, String message, Object... args) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(args, "");
        if (getRequestBeneficiariesState) {
            if (args.length != 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                message = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(message, "");
            }
            while (message.length() > 4000) {
                String strSubstring = message.substring(0, 4000);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                INSTANCE.component3(LogLevel.V, tag, strSubstring);
                message = message.substring(4000);
                Intrinsics.checkNotNullExpressionValue(message, "");
            }
            INSTANCE.component3(LogLevel.V, tag, message);
        }
    }

    public final void v(String text, Object... args) {
        Intrinsics.checkNotNullParameter(text, "");
        Intrinsics.checkNotNullParameter(args, "");
        v(ShareDataUIState(), text, Arrays.copyOf(args, args.length));
    }

    public final void d(String tag, String message, Object... args) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(args, "");
        if (getRequestBeneficiariesState) {
            if (args.length != 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                message = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(message, "");
            }
            while (message.length() > 4000) {
                String strSubstring = message.substring(0, 4000);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                component3(LogLevel.D, tag, strSubstring);
                message = message.substring(4000);
                Intrinsics.checkNotNullExpressionValue(message, "");
            }
            component3(LogLevel.D, tag, message);
        }
    }

    public final void d(String text, Object... args) {
        Intrinsics.checkNotNullParameter(text, "");
        Intrinsics.checkNotNullParameter(args, "");
        d(ShareDataUIState(), text, Arrays.copyOf(args, args.length));
    }

    public final void i(String tag, String message, Object... args) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(args, "");
        if (getRequestBeneficiariesState) {
            if (args.length != 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                message = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(message, "");
            }
            while (message.length() > 4000) {
                String strSubstring = message.substring(0, 4000);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                component3(LogLevel.I, tag, strSubstring);
                message = message.substring(4000);
                Intrinsics.checkNotNullExpressionValue(message, "");
            }
            component3(LogLevel.I, tag, message);
        }
    }

    public final void i(String text, Object... args) {
        Intrinsics.checkNotNullParameter(text, "");
        Intrinsics.checkNotNullParameter(args, "");
        i(ShareDataUIState(), text, Arrays.copyOf(args, args.length));
    }

    public final void w(String tag, String message, Object... args) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(args, "");
        if (getRequestBeneficiariesState) {
            if (args.length != 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                message = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(message, "");
            }
            while (message.length() > 4000) {
                String strSubstring = message.substring(0, 4000);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                component3(LogLevel.W, tag, strSubstring);
                message = message.substring(4000);
                Intrinsics.checkNotNullExpressionValue(message, "");
            }
            component3(LogLevel.W, tag, message);
        }
    }

    public final void w(String tag, String message, Throwable throwable, Object... args) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(args, "");
        if (getRequestBeneficiariesState) {
            if (args.length != 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                message = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(message, "");
            }
            component3(LogLevel.W, tag, message + ' ' + Log.getStackTraceString(throwable));
        }
    }

    public final void w(String text, Object[] args, Throwable t) {
        Intrinsics.checkNotNullParameter(text, "");
        Intrinsics.checkNotNullParameter(args, "");
        w(ShareDataUIState(), text, t, Arrays.copyOf(args, args.length));
    }

    public final void w(String text, Object... args) {
        Intrinsics.checkNotNullParameter(text, "");
        Intrinsics.checkNotNullParameter(args, "");
        w(ShareDataUIState(), text, Arrays.copyOf(args, args.length));
    }

    public final void w(String text, Throwable throwable) {
        Intrinsics.checkNotNullParameter(text, "");
        Intrinsics.checkNotNullParameter(throwable, "");
        w(ShareDataUIState(), text, throwable, new Object[0]);
    }

    public final void e(String tag, String message, Object... args) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(args, "");
        if (getRequestBeneficiariesState) {
            if (args.length != 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                message = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(message, "");
            }
            while (message.length() > 4000) {
                String strSubstring = message.substring(0, 4000);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                component3(LogLevel.E, tag, strSubstring);
                message = message.substring(4000);
                Intrinsics.checkNotNullExpressionValue(message, "");
            }
            component3(LogLevel.E, tag, message);
        }
    }

    public final void e(String text, Object... args) {
        Intrinsics.checkNotNullParameter(text, "");
        Intrinsics.checkNotNullParameter(args, "");
        e(ShareDataUIState(), text, Arrays.copyOf(args, args.length));
    }

    public final void e(String text, Throwable throwable) {
        Intrinsics.checkNotNullParameter(text, "");
        Intrinsics.checkNotNullParameter(throwable, "");
        e(ShareDataUIState(), text + ' ' + Log.getStackTraceString(throwable), new Object[0]);
    }

    @JvmStatic
    public static final void e(String tag, String message, Throwable throwable, Object... args) {
        String stackTraceString;
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(throwable, "");
        Intrinsics.checkNotNullParameter(args, "");
        if (getRequestBeneficiariesState) {
            if (args.length != 0) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                message = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(message, "");
            }
            try {
                stackTraceString = Log.getStackTraceString(throwable);
                Intrinsics.checkNotNullExpressionValue(stackTraceString, "");
            } catch (Exception e) {
                stackTraceString = "[no trace found, throwable=" + throwable + ToastUtils.TYPE.TYPE_EXCEPTION + e + AbstractJsonLexerKt.END_LIST;
            }
            INSTANCE.component3(LogLevel.E, tag, message + ' ' + stackTraceString);
        }
    }

    private final void component3(final LogLevel logLevel, final String str, final String str2) {
        String strComponent2 = copy ? component2(str2) : str2;
        int i = WhenMappings.$EnumSwitchMapping$0[logLevel.ordinal()];
        if (i == 1) {
            Log.d(str, strComponent2);
        } else if (i == 2) {
            Log.i(str, strComponent2);
        } else if (i == 3) {
            Log.w(str, strComponent2);
        } else if (i == 4) {
            Log.e(str, strComponent2);
        } else if (i == 5) {
            Log.v(str, strComponent2);
        }
        ShareDataUIState.submit(new Runnable() {
            @Override
            public final void run() {
                L.component1(logLevel, str, str2);
            }
        });
    }

    public static final void component1(LogLevel logLevel, String str, String str2) {
        Intrinsics.checkNotNullParameter(logLevel, "");
        Intrinsics.checkNotNullParameter(str2, "");
        FileLogger fileLogger = equals;
        if (fileLogger != null) {
            fileLogger.logFile$Logging_release(logLevel, str, str2);
        }
    }

    private final String component2(String str) {
        StackTraceElement stackTraceElement;
        String fileName;
        String methodName;
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        StackTraceElement[] stackTraceElementArr = stackTrace;
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTraceElementArr[i];
            StackTraceElement stackTraceElement2 = stackTraceElement;
            String string = stackTraceElement2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (!new Regex("Generated_for_debugger_class|logging|logger", RegexOption.IGNORE_CASE).containsMatchIn(string) && (fileName = stackTraceElement2.getFileName()) != null) {
                Intrinsics.checkNotNullExpressionValue(fileName, "");
                if (!new Regex("L.kt", RegexOption.IGNORE_CASE).containsMatchIn(fileName) && (methodName = stackTraceElement2.getMethodName()) != null) {
                    Intrinsics.checkNotNullExpressionValue(methodName, "");
                    if (!new Regex("v|d|i|w|e", RegexOption.IGNORE_CASE).matches(methodName)) {
                        break;
                    }
                }
            }
            i++;
        }
        StackTraceElement stackTraceElement3 = stackTraceElement;
        if (stackTraceElement3 == null) {
            return str;
        }
        String fileName2 = stackTraceElement3.getFileName();
        return ("(" + (fileName2 != null ? fileName2 : "") + AbstractJsonLexerKt.COLON + stackTraceElement3.getLineNumber() + ')') + "  " + str;
    }

    public final File getLogsFile() {
        FileLogger fileLogger = equals;
        if (fileLogger != null) {
            return fileLogger.getCopydefault();
        }
        return null;
    }

    public static void setFileLogger$default(L l, File file, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        l.setFileLogger(file, str);
    }

    public final void setFileLogger(File filesDir, String fileLogName) {
        Intrinsics.checkNotNullParameter(filesDir, "");
        equals = new FileLogger(filesDir, fileLogName);
    }
}
