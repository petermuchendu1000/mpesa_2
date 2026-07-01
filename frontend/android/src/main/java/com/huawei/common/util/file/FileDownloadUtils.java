package com.huawei.common.util.file;

import com.blankj.utilcode.util.CloseUtils;
import com.blankj.utilcode.util.FileUtils;
import com.huawei.common.util.L;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class FileDownloadUtils {
    private static final long component1 = 104857600;
    private static final long component2 = 1000;
    private static final String copydefault = "FileDownloadUtils";

    public interface DownloadProgress {
        public static final int DOWNLOAD_PACKAGE = 2;
        public static final int QUERY_APP_INFO = 1;
        public static final int UNZIP_PACKAGE = 3;

        default void onFail() {
        }

        default void onProgress(long j) {
        }

        default void onStatusChange(int i) {
        }

        default void onSuccess() {
        }
    }

    public static void unzip(File file, File file2) throws IOException {
        Throwable th;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            try {
                ZipFile zipFile = new ZipFile(file);
                try {
                    ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
                    try {
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        byte[] bArr = new byte[1024];
                        long j = 0;
                        long jComponent1 = 0;
                        while (true) {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry != null) {
                                String name = nextEntry.getName();
                                if (name.contains("__MACOSX") || name.contains("..")) {
                                    zipInputStream.closeEntry();
                                } else {
                                    File file3 = new File(file2, name);
                                    if (component3(file3, file2)) {
                                        if (nextEntry.isDirectory()) {
                                            file3.mkdirs();
                                        } else {
                                            file3.getParentFile().mkdirs();
                                            long j2 = 1 + j;
                                            if (j2 <= 1000) {
                                                inputStream = zipFile.getInputStream(nextEntry);
                                                try {
                                                    jComponent1 += component1(file2, inputStream, bArr, name, jComponent1);
                                                    zipInputStream.closeEntry();
                                                    j = j2;
                                                    inputStream2 = inputStream;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    Throwable th3 = th;
                                                    try {
                                                        try {
                                                            zipInputStream.close();
                                                            throw th3;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            try {
                                                                zipFile.close();
                                                                throw th;
                                                            } catch (Throwable th5) {
                                                                th.addSuppressed(th5);
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th6) {
                                                        th3.addSuppressed(th6);
                                                        throw th3;
                                                    }
                                                }
                                            } else {
                                                zipInputStream.close();
                                                zipFile.close();
                                                CloseUtils.closeIO(inputStream2);
                                                return;
                                            }
                                        }
                                    }
                                }
                            } else {
                                zipInputStream.close();
                                zipFile.close();
                                CloseUtils.closeIO(inputStream2);
                                return;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        inputStream = inputStream2;
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (Throwable th9) {
                CloseUtils.closeIO(null);
                throw th9;
            }
        } catch (Exception e) {
            L.e(e.getMessage());
            CloseUtils.closeIO(null);
        }
    }

    private static boolean component3(File file, File file2) {
        try {
            return file.getCanonicalPath().startsWith(file2.getCanonicalPath());
        } catch (IOException e) {
            L.e(copydefault, e.getMessage());
            return false;
        }
    }

    private static long component1(File file, InputStream inputStream, byte[] bArr, String str, long j) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str));
        long j2 = 0;
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i < 0) {
                    fileOutputStream.flush();
                    inputStream.close();
                    fileOutputStream.close();
                    return j2;
                }
                long j3 = i;
                j2 += j3;
                j += j3;
                if (j > component1) {
                    throw new IOException("Zip Bomb! File size is too large. ...");
                }
                fileOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static Result stream2File(InputStream inputStream, String str, boolean z) {
        return stream2File(inputStream, str, z, true);
    }

    public static Result stream2File(InputStream inputStream, String str, boolean z, boolean z2) throws Throwable {
        FileOutputStream fileOutputStream;
        File file;
        File parentFile;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                file = new File(str);
                parentFile = file.getParentFile();
                if (z2) {
                    FileUtils.deleteAllInDir(parentFile);
                }
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i);
            }
            if (z) {
                unzip(file, parentFile);
            }
            Result result = new Result(true, "下载" + file.getName() + "成功");
            CloseUtils.closeIO(inputStream, fileOutputStream);
            return result;
        } catch (Exception e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            L.e(copydefault, e.toString());
            Result result2 = new Result(false, "下载失败：" + e.getMessage());
            CloseUtils.closeIO(inputStream, fileOutputStream2);
            return result2;
        } catch (Throwable th2) {
            th = th2;
            CloseUtils.closeIO(inputStream, fileOutputStream);
            throw th;
        }
    }

    public static class Result {
        public final String info;
        public final Boolean success;

        public Result(Boolean bool, String str) {
            this.success = bool;
            this.info = str;
        }
    }
}
