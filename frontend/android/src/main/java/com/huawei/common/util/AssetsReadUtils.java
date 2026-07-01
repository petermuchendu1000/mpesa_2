package com.huawei.common.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.blankj.utilcode.util.Utils;
import io.ktor.http.HeadersKt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;

public class AssetsReadUtils {
    private static final String component2 = "AssetsReadUtils";

    public static String parseFile(String str) {
        return parseFile(Utils.getApp(), str);
    }

    public static String parseFile(Context context, String str) throws Throwable {
        AssetManager assets = context.getAssets();
        int length = str != null ? str.length() : 0;
        ArrayList arrayList = new ArrayList();
        int iComponent1 = HeadersKt.component1(arrayList);
        int i = iComponent1 ^ length;
        if (iComponent1 != 0) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (length ^ i)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 1) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - Color.argb(0, 0, 0, 0), 42 - View.MeasureSpec.getSize(0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr = {731190973, Long.valueOf(j3), arrayList, null, false, false};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (Process.myPid() >> 22), ExpandableListView.getPackedPositionChild(0L) + 57, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr);
                throw new RuntimeException(String.valueOf(length));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        StringBuilder sb = new StringBuilder();
        try {
            InputStream inputStreamOpen = assets.open(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    } finally {
                    }
                }
                bufferedReader.close();
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } finally {
                return sb.toString();
            }
        } catch (IOException e) {
            L.d(component2, "parseFile: " + e.getMessage());
        }
        return sb.toString();
    }
}
