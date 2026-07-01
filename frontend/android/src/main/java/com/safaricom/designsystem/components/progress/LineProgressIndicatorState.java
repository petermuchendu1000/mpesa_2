package com.safaricom.designsystem.components.progress;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0086@¢\u0006\u0002\u0010\u0011R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/safaricom/designsystem/components/progress/LineProgressIndicatorState;", "", "initialProgress", "", "<init>", "(F)V", "animatableProgress", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "progress", "getProgress", "()F", "updateProgress", "", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DesignSystem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LineProgressIndicatorState {
    public static final int $stable = 0;
    private final Animatable<Float, AnimationVector1D> copydefault;

    public LineProgressIndicatorState(float f) {
        this.copydefault = AnimatableKt.Animatable$default(f, 0.0f, 2, null);
    }

    public LineProgressIndicatorState(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f);
    }

    public final float getProgress() {
        return this.copydefault.getValue().floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object updateProgress$default(LineProgressIndicatorState lineProgressIndicatorState, float f, AnimationSpec animationSpec, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = AnimationSpecKt.tween$default(3000, 0, null, 6, null);
        }
        return lineProgressIndicatorState.updateProgress(f, animationSpec, continuation);
    }

    public final Object updateProgress(float f, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = Animatable.animateTo$default(this.copydefault, Boxing.boxFloat(f), animationSpec, null, null, continuation, 12, null);
        return objAnimateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    public LineProgressIndicatorState() {
        this(0.0f, 1, null);
    }
}
