package com.huawei.common.util;

import android.graphics.pdf.PdfDocument;
import android.view.View;
import com.blankj.utilcode.util.ScreenUtils;

public class PdfUtils {
    public static PdfDocument view2Pdf(View view, boolean z) {
        if (z) {
            component1(view);
        }
        PdfDocument pdfDocument = new PdfDocument();
        PdfDocument.Page pageStartPage = pdfDocument.startPage(new PdfDocument.PageInfo.Builder(view.getMeasuredWidth(), view.getMeasuredHeight(), 1).create());
        view.draw(pageStartPage.getCanvas());
        pdfDocument.finishPage(pageStartPage);
        return pdfDocument;
    }

    private static void component1(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(ScreenUtils.getAppScreenWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
