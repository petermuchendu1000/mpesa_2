package com.huawei.common.util;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.blankj.utilcode.util.CloseUtils;
import com.huawei.secure.android.common.util.IOUtil;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils {
    public static final String MIME_TYPE_PDF = "application/pdf";

    @FunctionalInterface
    public interface FileOperation {
        void writeTo(OutputStream outputStream) throws IOException;
    }

    public static Uri savePdf(Context context, PdfDocument pdfDocument) {
        return savePdf(context, pdfDocument, Environment.DIRECTORY_DOCUMENTS, null, System.currentTimeMillis() + ".pdf");
    }

    public static Uri savePdf(Context context, final PdfDocument pdfDocument, String str, String str2, String str3) {
        return saveFile(context, str, str2, str3, MIME_TYPE_PDF, new FileOperation() {
            @Override
            public final void writeTo(OutputStream outputStream) throws IOException {
                FileUtils.copydefault(pdfDocument, outputStream);
            }
        });
    }

    static void copydefault(PdfDocument pdfDocument, OutputStream outputStream) throws IOException {
        pdfDocument.writeTo(outputStream);
        pdfDocument.close();
    }

    public static Uri saveFile(Context context, final InputStream inputStream, String str, String str2, String str3, String str4) {
        return saveFile(context, str, str2, str3, str4, new FileOperation() {
            @Override
            public final void writeTo(OutputStream outputStream) throws IOException {
                FileUtils.component2(inputStream, outputStream);
            }
        });
    }

    static void component2(InputStream inputStream, OutputStream outputStream) throws IOException {
        IOUtil.copy(inputStream, outputStream);
        CloseUtils.closeIO(inputStream);
    }

    public static Uri saveFile(Context context, String str, String str2, String str3, String str4, FileOperation fileOperation) {
        if (!isExternalStorageEnable()) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return saveFileUsingMediaStore(context, str, str2, str3, str4, fileOperation);
        }
        return saveFile2Storage(str, str2, str3, fileOperation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Uri saveFileUsingMediaStore(Context context, String str, String str2, String str3, String str4, FileOperation fileOperation) throws Throwable {
        Exception e;
        OutputStream outputStreamOpenOutputStream;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str3);
        contentValues.put("mime_type", str4);
        if (!TextUtils.isEmpty(str2)) {
            str = str + File.separator + str2;
        }
        contentValues.put("relative_path", str);
        Uri uriInsert = context.getContentResolver().insert(MediaStore.Files.getContentUri("external"), contentValues);
        Context context2 = null;
        if (uriInsert == null) {
            return null;
        }
        try {
            try {
                outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert);
                try {
                    fileOperation.writeTo(outputStreamOpenOutputStream);
                    CloseUtils.closeIO(outputStreamOpenOutputStream);
                    return uriInsert;
                } catch (Exception e2) {
                    e = e2;
                    L.d(e.getMessage());
                    CloseUtils.closeIO(outputStreamOpenOutputStream);
                    return null;
                }
            } catch (Throwable th) {
                context2 = context;
                th = th;
                CloseUtils.closeIO(context2);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            outputStreamOpenOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CloseUtils.closeIO(context2);
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x004b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:22:0x004b */
    public static Uri saveFile2Storage(String str, String str2, String str3, FileOperation fileOperation) throws Throwable {
        FileOutputStream fileOutputStream;
        Closeable closeable;
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str);
        if (!TextUtils.isEmpty(str2)) {
            externalStoragePublicDirectory = new File(externalStoragePublicDirectory, str2);
        }
        Closeable closeable2 = null;
        if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
            return null;
        }
        File file = new File(externalStoragePublicDirectory, str3);
        if (file.exists() && !file.delete()) {
            return null;
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOperation.writeTo(fileOutputStream);
                    fileOutputStream.flush();
                    Uri uriFromFile = Uri.fromFile(file);
                    CloseUtils.closeIO(fileOutputStream);
                    return uriFromFile;
                } catch (IOException e) {
                    e = e;
                    L.e(e.getMessage());
                    CloseUtils.closeIO(fileOutputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                CloseUtils.closeIO(closeable2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            CloseUtils.closeIO(closeable2);
            throw th;
        }
    }

    public static boolean isExternalStorageEnable() {
        return TextUtils.equals("mounted", Environment.getExternalStorageState());
    }
}
