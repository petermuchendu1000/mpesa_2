package com.safaricom.designsystem.components.tabs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$TabsContainerKt {
    public static final ComposableSingletons$TabsContainerKt INSTANCE = new ComposableSingletons$TabsContainerKt();

    public static Function2<Composer, Integer, Unit> f790lambda1 = ComposableLambdaKt.composableLambdaInstance(1216916732, false, component1.component2);

    public static Function2<Composer, Integer, Unit> f791lambda2 = ComposableLambdaKt.composableLambdaInstance(-731039850, false, component2.copydefault);

    public static Function2<Composer, Integer, Unit> f792lambda3 = ComposableLambdaKt.composableLambdaInstance(-1112952849, false, component3.ShareDataUIState);

    public static Function2<Composer, Integer, Unit> f793lambda4 = ComposableLambdaKt.composableLambdaInstance(-1696413682, false, copydefault.ShareDataUIState);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function2<Composer, Integer, Unit> {
        public static final component1 component2 = new component1();

        public final void ShareDataUIState(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            ShareDataUIState(composer, num.intValue());
            return Unit.INSTANCE;
        }

        component1() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        public static final component2 copydefault = new component2();

        public final void ShareDataUIState(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            ShareDataUIState(composer, num.intValue());
            return Unit.INSTANCE;
        }

        component2() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Function2<Composer, Integer, Unit> {
        public static final component3 ShareDataUIState = new component3();

        public final void component1(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            component1(composer, num.intValue());
            return Unit.INSTANCE;
        }

        component3() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        public static final copydefault ShareDataUIState = new copydefault();

        public final void copydefault(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            copydefault(composer, num.intValue());
            return Unit.INSTANCE;
        }

        copydefault() {
        }
    }

    public final Function2<Composer, Integer, Unit> m12683getLambda1$DesignSystem_release() {
        return f790lambda1;
    }

    public final Function2<Composer, Integer, Unit> m12684getLambda2$DesignSystem_release() {
        return f791lambda2;
    }

    public final Function2<Composer, Integer, Unit> m12685getLambda3$DesignSystem_release() {
        return f792lambda3;
    }

    public final Function2<Composer, Integer, Unit> m12686getLambda4$DesignSystem_release() {
        return f793lambda4;
    }
}
