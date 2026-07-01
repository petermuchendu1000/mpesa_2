package com.safaricom.aipay.scantopay.sdk.core.data;

import com.huawei.digitalpayment.checkout.resp.ReceiptTypes;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/core/data/TransactionType;", "", "displayName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "BUY_GOODS", "PAYBILL", "SEND_MONEY", "WITHDRAW_CASH", "POCHI_LA_BIASHARA", "AGENT", "UNKNOWN", "Companion", "scan-to-pay-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final class TransactionType {
    private static final EnumEntries $ENTRIES;
    private static final TransactionType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    public static final Companion INSTANCE;
    private final String displayName;
    public static final TransactionType BUY_GOODS = new TransactionType("BUY_GOODS", 0, ReceiptTypes.BUYGOODS_NAME);
    public static final TransactionType PAYBILL = new TransactionType("PAYBILL", 1, "Paybill");
    public static final TransactionType SEND_MONEY = new TransactionType("SEND_MONEY", 2, ReceiptTypes.SENDMONEY_NAME);
    public static final TransactionType WITHDRAW_CASH = new TransactionType("WITHDRAW_CASH", 3, "Withdraw Cash");
    public static final TransactionType POCHI_LA_BIASHARA = new TransactionType("POCHI_LA_BIASHARA", 4, "Pochi la Biashara");
    public static final TransactionType AGENT = new TransactionType("AGENT", 5, "Agent");
    public static final TransactionType UNKNOWN = new TransactionType("UNKNOWN", 6, "na");

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/core/data/TransactionType$Companion;", "", "<init>", "()V", "fromString", "Lcom/safaricom/aipay/scantopay/sdk/core/data/TransactionType;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "scan-to-pay-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final KSerializer get$cachedSerializer() {
            return (KSerializer) TransactionType.$cachedSerializer$delegate.getValue();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
            java.lang.UnsupportedOperationException
            	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
            	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
            */
        public final com.safaricom.aipay.scantopay.sdk.core.data.TransactionType fromString(java.lang.String r2) {
            /*
                Method dump skipped, instruction units count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.safaricom.aipay.scantopay.sdk.core.data.TransactionType.Companion.fromString(java.lang.String):com.safaricom.aipay.scantopay.sdk.core.data.TransactionType");
        }

        public final KSerializer<TransactionType> serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    static {
        TransactionType[] transactionTypeArr$values = $values();
        $VALUES = transactionTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(transactionTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() {
            @Override
            public final Object invoke() {
                return TransactionType._init_$_anonymous_();
            }
        });
    }

    private TransactionType(String str, int i, String str2) {
        this.displayName = str2;
    }

    public static final KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.safaricom.aipay.scantopay.sdk.core.data.TransactionType", values());
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    private static final TransactionType[] $values() {
        return new TransactionType[]{BUY_GOODS, PAYBILL, SEND_MONEY, WITHDRAW_CASH, POCHI_LA_BIASHARA, AGENT, UNKNOWN};
    }

    public static EnumEntries<TransactionType> getEntries() {
        return $ENTRIES;
    }
}
