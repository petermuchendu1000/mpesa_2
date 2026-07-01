package com.huawei.digitalpayment.consumer.zuriui.components.imagevector;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.text.TextUtils;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathParser;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/components/imagevector/PathExtension;", "", "<init>", "()V", "toPath", "Landroidx/compose/ui/graphics/Path;", "", "size", "Landroidx/compose/ui/geometry/Size;", "pathDestination", "toPath-KUbW9oc", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PathExtension {
    public static final int $stable = 0;
    public static final PathExtension INSTANCE = new PathExtension();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;

    private PathExtension() {
    }

    public static Path m12189toPathKUbW9oc$default(PathExtension pathExtension, String str, Size size, Path path, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 123;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 75;
            component2 = i6 % 128;
            path = null;
            if (i6 % 2 == 0) {
                path.hashCode();
                throw null;
            }
        }
        return pathExtension.m12190toPathKUbW9oc(str, size, path);
    }

    public final Path m12190toPathKUbW9oc(String str, Size size, Path path) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        if (str != null && size != null) {
            int i5 = i3 + 9;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                size.m5850unboximpl();
                if (!TextUtils.isEmpty(str)) {
                    if (path == null) {
                        path = AndroidPath_androidKt.Path();
                    }
                    Matrix matrix = new Matrix();
                    RectF rectF = new RectF();
                    Path path2 = new PathParser().parsePathString(str).toPath(path);
                    Rect bounds = path2.getBounds();
                    android.graphics.Rect rect = new android.graphics.Rect((int) bounds.getLeft(), (int) bounds.getTop(), (int) bounds.getRight(), (int) bounds.getBottom());
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (size.m5850unboximpl() >> 32)) / rect.width();
                    long j = -1;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & size.m5850unboximpl())) / rect.height();
                    if (path2 instanceof AndroidPath) {
                        android.graphics.Path internalPath = ((AndroidPath) path2).getInternalPath();
                        matrix.setScale(fIntBitsToFloat, fIntBitsToFloat2, rectF.centerX(), rectF.centerY());
                        internalPath.computeBounds(rectF, true);
                        internalPath.transform(matrix);
                        return AndroidPath_androidKt.asComposePath(internalPath);
                    }
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
            } else {
                size.m5850unboximpl();
                TextUtils.isEmpty(str);
                throw null;
            }
        }
        int i6 = component2 + 69;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = ShareDataUIState + 3;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
