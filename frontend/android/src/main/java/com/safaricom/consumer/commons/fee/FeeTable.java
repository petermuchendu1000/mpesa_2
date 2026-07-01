package com.safaricom.consumer.commons.fee;

import com.safaricom.consumer.commons.withdraw.WithdrawFeesMethod;
import java.lang.Enum;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0016\u0018\u0000 \u000f*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u000fB#\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eR \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/safaricom/consumer/commons/fee/FeeTable;", "SubType", "", "Lcom/safaricom/consumer/commons/withdraw/WithdrawFeesMethod;", "feeMap", "", "", "Lcom/safaricom/consumer/commons/fee/FeeCharge;", "<init>", "(Ljava/util/Map;)V", "retrieveFeeCharge", "", "value", "subtype", "(DLjava/lang/Enum;)D", "Companion", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class FeeTable<SubType extends Enum<SubType>> implements WithdrawFeesMethod<SubType> {

    public static final Companion INSTANCE = new Companion(null);
    private final Map<SubType, List<FeeCharge>> component3;

    /* JADX WARN: Multi-variable type inference failed */
    public FeeTable(Map<SubType, ? extends List<? extends FeeCharge>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.component3 = map;
    }

    public FeeTable(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u0007¨\u0006\b"}, d2 = {"Lcom/safaricom/consumer/commons/fee/FeeTable$Companion;", "", "<init>", "()V", "emptyFeeTable", "Lcom/safaricom/consumer/commons/fee/FeeTable;", "SubType", "", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <SubType extends Enum<SubType>> FeeTable<SubType> emptyFeeTable() {
            return new FeeTable<>(null, 1, 0 == true ? 1 : 0);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override
    public double retrieveFeeCharge(double value, SubType subtype) {
        Intrinsics.checkNotNullParameter(subtype, "");
        List<FeeCharge> list = this.component3.get(subtype);
        if (list != null) {
            Object obj = null;
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((FeeCharge) next).getMaxAmount() >= value) {
                        obj = next;
                        break;
                    }
                }
                FeeCharge feeCharge = (FeeCharge) obj;
                if (feeCharge == null) {
                    feeCharge = (FeeCharge) CollectionsKt.last((List) list);
                }
                return feeCharge.getFee(value);
            }
        }
        return 0.0d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeeTable() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
