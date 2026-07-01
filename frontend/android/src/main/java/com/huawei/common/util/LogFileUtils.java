package com.huawei.common.util;

import android.content.Context;
import com.blankj.utilcode.util.CloseUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;

public final class LogFileUtils {
    private static final String ShareDataUIState = "crash.temp";
    private static final long component1 = 10485760;
    private static final String component2 = "log_last.temp";
    private static long component4 = 0;
    private static Context equals = null;
    private static final String getAsAtTimestamp = "log.temp";
    private static final Calendar copydefault = Calendar.getInstance();
    private static final StringBuffer component3 = new StringBuffer();

    public static void init(Context context) {
        equals = context.getApplicationContext();
    }

    public static void logToFile(String str, String str2) {
        if (equals == null) {
            return;
        }
        synchronized (LogFileUtils.class) {
            OutputStream outputStreamShareDataUIState = ShareDataUIState();
            if (outputStreamShareDataUIState == null) {
                CloseUtils.closeIO(outputStreamShareDataUIState);
                return;
            }
            try {
                if (component4 < component1) {
                    component3(outputStreamShareDataUIState, component2(str, str2).getBytes(StandardCharsets.UTF_8), true);
                    CloseUtils.closeIO(outputStreamShareDataUIState);
                } else {
                    CloseUtils.closeIO(outputStreamShareDataUIState);
                    if (component1()) {
                        logToFile(str, str2);
                    }
                    CloseUtils.closeIO(outputStreamShareDataUIState);
                }
            } catch (Throwable th) {
                CloseUtils.closeIO(outputStreamShareDataUIState);
                throw th;
            }
        }
    }

    private static void component3(OutputStream outputStream, byte[] bArr, boolean z) {
        OutputStream outputStreamShareDataUIState;
        try {
            try {
                outputStream.write(bArr);
                outputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));
                outputStream.flush();
                component4 += (long) bArr.length;
                CloseUtils.closeIO(outputStream);
            } catch (IOException unused) {
                if (!z) {
                    CloseUtils.closeIO(outputStream);
                    return;
                }
                CloseUtils.closeIO(outputStream);
                try {
                    outputStreamShareDataUIState = ShareDataUIState();
                } catch (Exception e) {
                    L.d("LogFileUtils", "logSe: " + e.getMessage());
                }
                if (outputStreamShareDataUIState != null) {
                    try {
                        component3(outputStreamShareDataUIState, bArr, false);
                        if (outputStreamShareDataUIState != null) {
                            outputStreamShareDataUIState.close();
                        }
                        CloseUtils.closeIO(outputStream);
                        return;
                    } catch (Throwable th) {
                        if (outputStreamShareDataUIState != null) {
                            try {
                                outputStreamShareDataUIState.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (outputStreamShareDataUIState != null) {
                    outputStreamShareDataUIState.close();
                }
                CloseUtils.closeIO(outputStream);
            }
        } catch (Throwable th3) {
            CloseUtils.closeIO(outputStream);
            throw th3;
        }
    }

    public static void crashToFile(String str) {
        OutputStream outputStreamComponent3;
        if (equals == null) {
            return;
        }
        synchronized (LogFileUtils.class) {
            try {
                outputStreamComponent3 = component3();
            } catch (IOException e) {
                L.e("LogFileUtils", "saveCrashToFile: " + e.getMessage());
            }
            if (outputStreamComponent3 == null) {
                if (outputStreamComponent3 != null) {
                    outputStreamComponent3.close();
                }
                return;
            }
            try {
                outputStreamComponent3.write(component2("Crash", str).getBytes(StandardCharsets.UTF_8));
                outputStreamComponent3.write("\r\n".getBytes(StandardCharsets.UTF_8));
                outputStreamComponent3.flush();
                if (outputStreamComponent3 != null) {
                    outputStreamComponent3.close();
                }
            } catch (Throwable th) {
                if (outputStreamComponent3 != null) {
                    try {
                        outputStreamComponent3.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    private static OutputStream component3() {
        File file = new File(equals.getExternalFilesDir(null), getPackageFile());
        File file2 = new File(file, ShareDataUIState);
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file2.exists()) {
                return new FileOutputStream(file2, true);
            }
            return new FileOutputStream(file2);
        } catch (Exception e) {
            L.d("LogFileUtils", "openCrashFileOutStream: " + e.getMessage());
            return null;
        }
    }

    private static OutputStream ShareDataUIState() {
        if (equals == null) {
            return null;
        }
        File file = new File(equals.getExternalFilesDir(null), getPackageFile());
        File file2 = new File(file, getAsAtTimestamp);
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file2.exists()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file2, true);
                component4 = file2.length();
                return fileOutputStream;
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            component4 = 0L;
            return fileOutputStream2;
        } catch (FileNotFoundException e) {
            L.d("LogFileUtils", "getLogFileOutStream: " + e.getMessage());
            return null;
        }
    }

    private static boolean component1() {
        synchronized (LogFileUtils.class) {
            File file = new File(equals.getExternalFilesDir(null), getPackageFile());
            File file2 = new File(file, getAsAtTimestamp);
            File file3 = new File(file, component2);
            if (file3.exists()) {
                file3.delete();
            }
            file2.renameTo(file3);
            if (!file2.exists()) {
                return true;
            }
            return file2.delete();
        }
    }

    public static String getPackageFile() {
        return equals.getPackageName();
    }

    private static String component2(String str, String str2) {
        Calendar calendar = copydefault;
        calendar.setTimeInMillis(System.currentTimeMillis());
        StringBuffer stringBuffer = component3;
        stringBuffer.setLength(0);
        stringBuffer.append("[");
        stringBuffer.append(str);
        stringBuffer.append(" : ");
        stringBuffer.append(calendar.get(2) + 1);
        stringBuffer.append("-");
        stringBuffer.append(calendar.get(5));
        stringBuffer.append(" ");
        stringBuffer.append(calendar.get(11));
        stringBuffer.append(":");
        stringBuffer.append(calendar.get(12));
        stringBuffer.append(":");
        stringBuffer.append(calendar.get(13));
        stringBuffer.append(":");
        stringBuffer.append(calendar.get(14));
        stringBuffer.append("] ");
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }
}
