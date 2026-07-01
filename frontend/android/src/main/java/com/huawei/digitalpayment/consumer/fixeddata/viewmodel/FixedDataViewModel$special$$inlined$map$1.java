package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import com.alibaba.griver.image.photo.meta.PhotoMenu;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007¸\u0006\t"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", PhotoMenu.TAG_COLLECT, "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FixedDataViewModel$special$$inlined$map$1 implements Flow<AccountState> {
    public static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    public static int copydefault;
    final Flow component1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements FlowCollector {
        private static int ShareDataUIState = 1;
        private static int component3;
        final FlowCollector component2;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$special$$inlined$map$1$2", f = "FixedDataViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
        public static final class AnonymousClass1 extends ContinuationImpl {
            private static int component1 = 1;
            private static int copydefault;
            Object L$0;
            int label;
            Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = copydefault + 49;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object obj2 = null;
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                if (i3 == 0) {
                    anonymousClass2.emit(null, this);
                    obj2.hashCode();
                    throw null;
                }
                Object objEmit = anonymousClass2.emit(null, this);
                int i4 = component1 + 111;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return objEmit;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
            /*
                Method dump skipped, instruction units count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public AnonymousClass2(FlowCollector flowCollector) {
            this.component2 = flowCollector;
        }
    }

    public FixedDataViewModel$special$$inlined$map$1(Flow flow) {
        this.component1 = flow;
    }

    @Override
    public Object collect(FlowCollector<? super AccountState> flowCollector, Continuation continuation) {
        int i = 2 % 2;
        Object objCollect = this.component1.collect(new AnonymousClass2(flowCollector), continuation);
        Object obj = null;
        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i2 = component2 + 25;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return objCollect;
            }
            obj.hashCode();
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i3 = component3 + 23;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static int ShareDataUIState() {
        int i = ShareDataUIState;
        int i2 = i % 7545550;
        ShareDataUIState = i + 1;
        if (i2 != 0) {
            return copydefault;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        copydefault = i3;
        return i3;
    }
}
