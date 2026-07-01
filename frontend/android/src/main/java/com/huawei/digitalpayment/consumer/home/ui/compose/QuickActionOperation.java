package com.huawei.digitalpayment.consumer.home.ui.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionOperation;", "", "<init>", "()V", "Add", "Remove", "None", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionOperation$Add;", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionOperation$None;", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionOperation$Remove;", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QuickActionOperation {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component3;

    private QuickActionOperation() {
    }

    static {
        int i = 1 + 21;
        component3 = i % 128;
        if (i % 2 != 0) {
            int i2 = 35 / 0;
        }
    }

    public QuickActionOperation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionOperation$Add;", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionOperation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Add extends QuickActionOperation {
        public static final int $stable = 0;
        public static final Add INSTANCE = new Add();
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int copydefault;

        private Add() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 39;
            copydefault = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 37;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof Add) {
                return true;
            }
            int i5 = i2 + 45;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 5;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 97;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
            }
            return -1705439504;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 13;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 83;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return "Add";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionOperation$Remove;", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionOperation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Remove extends QuickActionOperation {
        public static final int $stable = 0;
        public static final Remove INSTANCE = new Remove();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int copydefault = 1;

        private Remove() {
            super(null);
        }

        static {
            int i = copydefault + 73;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 15;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (other instanceof Remove) {
                return true;
            }
            int i3 = component1 + 11;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 117;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 95;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 == 0) {
                int i4 = 93 / 0;
            }
            int i5 = i3 + 3;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return -1092121643;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 67;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 39;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return "Remove";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionOperation$None;", "Lcom/huawei/digitalpayment/consumer/home/ui/compose/QuickActionOperation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends QuickActionOperation {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;

        private None() {
            super(null);
        }

        static {
            int i = copydefault + 19;
            component1 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 21;
            component2 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this != other) {
                if (!(other instanceof None)) {
                    return false;
                }
                return true;
            }
            int i4 = i2 + 63;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 91;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 41;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return -1328618807;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 109;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = i2 + 91;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return "None";
            }
            throw null;
        }
    }
}
