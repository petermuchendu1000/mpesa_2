package com.safaricom.designsystem.components.image;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b\u001bJ\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JF\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÇ\u0001¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010%\u001a\u00020&H×\u0001J\t\u0010'\u001a\u00020(H×\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lcom/safaricom/designsystem/components/image/ImageConfiguration;", "", "aspectRatio", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "shape", "Landroidx/compose/ui/graphics/Shape;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "<init>", "(Ljava/lang/Float;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAspectRatio", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getBackgroundColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "component1", "component2", "component2-QN2ZGVo", "component3", "component4", "component5", "copy", "copy-ZLcQsz0", "(Ljava/lang/Float;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/foundation/layout/PaddingValues;)Lcom/safaricom/designsystem/components/image/ImageConfiguration;", "equals", "", "other", "hashCode", "", "toString", "", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageConfiguration {
    public static final int $stable = 0;
    private final PaddingValues ShareDataUIState;
    private final Shape component1;
    private final Color component2;
    private final ContentScale component3;
    private final Float copydefault;

    private ImageConfiguration(Float f, Color color, Shape shape, ContentScale contentScale, PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(shape, "");
        Intrinsics.checkNotNullParameter(contentScale, "");
        Intrinsics.checkNotNullParameter(paddingValues, "");
        this.copydefault = f;
        this.component2 = color;
        this.component1 = shape;
        this.component3 = contentScale;
        this.ShareDataUIState = paddingValues;
    }

    public final Float getAspectRatio() {
        return this.copydefault;
    }

    public final Color m12558getBackgroundColorQN2ZGVo() {
        return this.component2;
    }

    public ImageConfiguration(Float f, Color color, Shape shape, ContentScale contentScale, PaddingValues paddingValues, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : color, (i & 4) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i & 8) != 0 ? ContentScale.INSTANCE.getCrop() : contentScale, (i & 16) != 0 ? PaddingKt.m1154PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : paddingValues, null);
    }

    public final Shape getShape() {
        return this.component1;
    }

    public final ContentScale getContentScale() {
        return this.component3;
    }

    public final PaddingValues getContentPadding() {
        return this.ShareDataUIState;
    }

    public ImageConfiguration(Float f, Color color, Shape shape, ContentScale contentScale, PaddingValues paddingValues, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, color, shape, contentScale, paddingValues);
    }

    public static ImageConfiguration m12555copyZLcQsz0$default(ImageConfiguration imageConfiguration, Float f, Color color, Shape shape, ContentScale contentScale, PaddingValues paddingValues, int i, Object obj) {
        if ((i & 1) != 0) {
            f = imageConfiguration.copydefault;
        }
        if ((i & 2) != 0) {
            color = imageConfiguration.component2;
        }
        Color color2 = color;
        if ((i & 4) != 0) {
            shape = imageConfiguration.component1;
        }
        Shape shape2 = shape;
        if ((i & 8) != 0) {
            contentScale = imageConfiguration.component3;
        }
        ContentScale contentScale2 = contentScale;
        if ((i & 16) != 0) {
            paddingValues = imageConfiguration.ShareDataUIState;
        }
        return imageConfiguration.m12557copyZLcQsz0(f, color2, shape2, contentScale2, paddingValues);
    }

    public final Float getCopydefault() {
        return this.copydefault;
    }

    public final Color getComponent2() {
        return this.component2;
    }

    public final Shape getComponent1() {
        return this.component1;
    }

    public final ContentScale getComponent3() {
        return this.component3;
    }

    public final PaddingValues getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final ImageConfiguration m12557copyZLcQsz0(Float aspectRatio, Color backgroundColor, Shape shape, ContentScale contentScale, PaddingValues contentPadding) {
        Intrinsics.checkNotNullParameter(shape, "");
        Intrinsics.checkNotNullParameter(contentScale, "");
        Intrinsics.checkNotNullParameter(contentPadding, "");
        return new ImageConfiguration(aspectRatio, backgroundColor, shape, contentScale, contentPadding, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageConfiguration)) {
            return false;
        }
        ImageConfiguration imageConfiguration = (ImageConfiguration) other;
        return Intrinsics.areEqual((Object) this.copydefault, (Object) imageConfiguration.copydefault) && Intrinsics.areEqual(this.component2, imageConfiguration.component2) && Intrinsics.areEqual(this.component1, imageConfiguration.component1) && Intrinsics.areEqual(this.component3, imageConfiguration.component3) && Intrinsics.areEqual(this.ShareDataUIState, imageConfiguration.ShareDataUIState);
    }

    public int hashCode() {
        Float f = this.copydefault;
        int iHashCode = f == null ? 0 : f.hashCode();
        Color color = this.component2;
        return (((((((iHashCode * 31) + (color != null ? Color.m6061hashCodeimpl(color.m6064unboximpl()) : 0)) * 31) + this.component1.hashCode()) * 31) + this.component3.hashCode()) * 31) + this.ShareDataUIState.hashCode();
    }

    public String toString() {
        return "ImageConfiguration(aspectRatio=" + this.copydefault + ", backgroundColor=" + this.component2 + ", shape=" + this.component1 + ", contentScale=" + this.component3 + ", contentPadding=" + this.ShareDataUIState + ")";
    }
}
