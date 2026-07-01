package com.safaricom.aipay.scantopay.sdk.core.data;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/core/data/QrCodeResult;", "", "value", "", "boundingBox", "Landroid/graphics/Rect;", "<init>", "(Ljava/lang/String;Landroid/graphics/Rect;)V", "getValue", "()Ljava/lang/String;", "getBoundingBox", "()Landroid/graphics/Rect;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "scan-to-pay-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QrCodeResult {
    private final Rect boundingBox;
    private final String value;

    public QrCodeResult(String str, Rect rect) {
        this.value = str;
        this.boundingBox = rect;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final String getValue() {
        return this.value;
    }

    public static QrCodeResult copy$default(QrCodeResult qrCodeResult, String str, Rect rect, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qrCodeResult.value;
        }
        if ((i & 2) != 0) {
            rect = qrCodeResult.boundingBox;
        }
        return qrCodeResult.copy(str, rect);
    }

    public final String getValue() {
        return this.value;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final QrCodeResult copy(String value, Rect boundingBox) {
        return new QrCodeResult(value, boundingBox);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrCodeResult)) {
            return false;
        }
        QrCodeResult qrCodeResult = (QrCodeResult) other;
        return Intrinsics.areEqual(this.value, qrCodeResult.value) && Intrinsics.areEqual(this.boundingBox, qrCodeResult.boundingBox);
    }

    public int hashCode() {
        String str = this.value;
        int iHashCode = str == null ? 0 : str.hashCode();
        Rect rect = this.boundingBox;
        return (iHashCode * 31) + (rect != null ? rect.hashCode() : 0);
    }

    public String toString() {
        return "QrCodeResult(value=" + this.value + ", boundingBox=" + this.boundingBox + ")";
    }
}
