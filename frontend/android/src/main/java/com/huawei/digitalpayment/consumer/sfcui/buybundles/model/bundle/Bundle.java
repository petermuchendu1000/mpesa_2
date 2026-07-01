package com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.IRecipientType;
import com.safaricom.consumer.commons.util.TextResource;
import com.safaricom.designsystem.components.payment.PaymentOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\u000bHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003Jã\u0001\u0010Q\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u0005HÇ\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010UH×\u0003J\t\u0010V\u001a\u00020\u0003H×\u0001J\t\u0010W\u001a\u00020\u0005H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0011\u0010\u001d\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010%R\u0011\u0010\u001f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010%¨\u0006X"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/Bundle;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundle;", "icon", "", GriverCacheDao.COLUMN_CACHE_ID, "", "name", "description", "amount", "", "units", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;", "validity", "Lcom/safaricom/consumer/commons/util/TextResource;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleCategory;", "paymentTypes", "", "Lcom/safaricom/designsystem/components/payment/PaymentOption;", "recipientTypes", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/recipient/IRecipientType;", "tag", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/BundleTag;", "packageId", "packageCategory", "bundleType", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleType;", "bundleTypeStr", "productTypeStr", "validityStr", "packageName", "balanceCode", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FLcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;Lcom/safaricom/consumer/commons/util/TextResource;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleCategory;Ljava/util/List;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/BundleTag;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()I", "getId", "()Ljava/lang/String;", "getName", "getDescription", "getAmount", "()Ljava/lang/Float;", "getUnits", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;", "getValidity", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getCategory", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleCategory;", "getPaymentTypes", "()Ljava/util/List;", "getRecipientTypes", "getTag", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/BundleTag;", "getPackageId", "getPackageCategory", "getBundleType", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleType;", "getBundleTypeStr", "getProductTypeStr", "getValidityStr", "getPackageName", "getBalanceCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Bundle implements IBundle {
    public static final int $stable = 8;

    private static int f2725a = 1;

    private static int f2726b = 0;

    private static int f2727c = 1;
    private static int getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final List<PaymentOption> ArtificialStackFrames;
    private final CounterUnits CoroutineDebuggingKt;
    private final String ShareDataUIState;
    private final BundleTag accessartificialFrame;
    private final IBundleType component1;
    private final float component2;
    private final String component3;
    private final String component4;
    private final int copy;
    private final IBundleCategory copydefault;
    private final String coroutineBoundary;
    private final TextResource coroutineCreation;
    private final String equals;
    private final String getAsAtTimestamp;
    private final String getRequestBeneficiariesState;
    private final String getShareableDataState;
    private final List<IRecipientType> getSponsorBeneficiariesState;
    private final String hashCode;
    private final String toString;

    /* JADX WARN: Multi-variable type inference failed */
    public Bundle(int i, String str, String str2, String str3, float f, CounterUnits counterUnits, TextResource textResource, IBundleCategory iBundleCategory, List<? extends PaymentOption> list, List<? extends IRecipientType> list2, BundleTag bundleTag, String str4, String str5, IBundleType iBundleType, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(counterUnits, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.copy = i;
        this.component4 = str;
        this.equals = str2;
        this.getRequestBeneficiariesState = str3;
        this.component2 = f;
        this.CoroutineDebuggingKt = counterUnits;
        this.coroutineCreation = textResource;
        this.copydefault = iBundleCategory;
        this.ArtificialStackFrames = list;
        this.getSponsorBeneficiariesState = list2;
        this.accessartificialFrame = bundleTag;
        this.getShareableDataState = str4;
        this.getAsAtTimestamp = str5;
        this.component1 = iBundleType;
        this.ShareDataUIState = str6;
        this.toString = str7;
        this.coroutineBoundary = str8;
        this.hashCode = str9;
        this.component3 = str10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Bundle(int i, String str, String str2, String str3, float f, CounterUnits counterUnits, TextResource textResource, IBundleCategory iBundleCategory, List list, List list2, BundleTag bundleTag, String str4, String str5, IBundleType iBundleType, String str6, String str7, String str8, String str9, String str10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        BundleTag bundleTag2;
        String str11;
        String str12;
        String str13;
        String str14;
        Object obj = null;
        TextResource textResource2 = (i2 & 64) != 0 ? null : textResource;
        IBundleCategory iBundleCategory2 = (i2 & 128) != 0 ? null : iBundleCategory;
        if ((i2 & 1024) != 0) {
            int i3 = f2726b + 45;
            f2725a = i3 % 128;
            int i4 = i3 % 2;
            bundleTag2 = null;
        } else {
            bundleTag2 = bundleTag;
        }
        String str15 = (i2 & 2048) != 0 ? null : str4;
        if ((i2 & 4096) != 0) {
            int i5 = f2725a + 71;
            f2726b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str11 = null;
        } else {
            str11 = str5;
        }
        IBundleType iBundleType2 = (i2 & 8192) != 0 ? null : iBundleType;
        if ((i2 & 16384) != 0) {
            int i7 = f2726b;
            int i8 = i7 + 115;
            f2725a = i8 % 128;
            if (i8 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i9 = i7 + 73;
            f2725a = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            str12 = null;
        } else {
            str12 = str6;
        }
        if ((32768 & i2) != 0) {
            int i12 = f2726b + 107;
            int i13 = i12 % 128;
            f2725a = i13;
            int i14 = i12 % 2;
            int i15 = i13 + 97;
            f2726b = i15 % 128;
            int i16 = i15 % 2;
            int i17 = 2 % 2;
            str13 = null;
        } else {
            str13 = str7;
        }
        String str16 = (65536 & i2) != 0 ? "" : str8;
        if ((131072 & i2) != 0) {
            int i18 = 2 % 2;
            str14 = "";
        } else {
            str14 = str9;
        }
        this(i, str, str2, str3, f, counterUnits, textResource2, iBundleCategory2, list, list2, bundleTag2, str15, str11, iBundleType2, str12, str13, str16, str14, (i2 & 262144) != 0 ? "" : str10);
    }

    @Override
    public int getIcon() {
        int i = 2 % 2;
        int i2 = f2725a;
        int i3 = i2 + 111;
        f2726b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.copy;
        int i5 = i2 + 13;
        f2726b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return i4;
    }

    @Override
    public String getId() {
        int i = 2 % 2;
        int i2 = f2725a + 51;
        int i3 = i2 % 128;
        f2726b = i3;
        int i4 = i2 % 2;
        String str = this.component4;
        int i5 = i3 + 105;
        f2725a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return str;
    }

    @Override
    public String getName() {
        int i = 2 % 2;
        int i2 = f2726b;
        int i3 = i2 + 57;
        f2725a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.equals;
        int i5 = i2 + 9;
        f2725a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return str;
    }

    @Override
    public String getDescription() {
        int i = 2 % 2;
        int i2 = f2726b + 81;
        f2725a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return str;
    }

    @Override
    public Float getAmount() {
        int i = 2 % 2;
        int i2 = f2726b + 11;
        f2725a = i2 % 128;
        int i3 = i2 % 2;
        Float fValueOf = Float.valueOf(this.component2);
        int i4 = f2725a + 55;
        f2726b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return fValueOf;
    }

    @Override
    public CounterUnits getUnits() {
        CounterUnits counterUnits;
        int i = 2 % 2;
        int i2 = f2726b;
        int i3 = i2 + 91;
        f2725a = i3 % 128;
        if (i3 % 2 == 0) {
            counterUnits = this.CoroutineDebuggingKt;
            int i4 = 16 / 0;
        } else {
            counterUnits = this.CoroutineDebuggingKt;
        }
        int i5 = i2 + 47;
        f2725a = i5 % 128;
        int i6 = i5 % 2;
        return counterUnits;
    }

    @Override
    public TextResource getValidity() {
        int i = 2 % 2;
        int i2 = f2726b + 69;
        f2725a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.coroutineCreation;
        }
        throw null;
    }

    @Override
    public IBundleCategory getCategory() {
        int i = 2 % 2;
        int i2 = f2726b + 55;
        int i3 = i2 % 128;
        f2725a = i3;
        int i4 = i2 % 2;
        IBundleCategory iBundleCategory = this.copydefault;
        int i5 = i3 + 117;
        f2726b = i5 % 128;
        int i6 = i5 % 2;
        return iBundleCategory;
    }

    @Override
    public List<PaymentOption> getPaymentTypes() {
        int i = 2 % 2;
        int i2 = f2726b + 67;
        int i3 = i2 % 128;
        f2725a = i3;
        int i4 = i2 % 2;
        List<PaymentOption> list = this.ArtificialStackFrames;
        int i5 = i3 + 117;
        f2726b = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @Override
    public List<IRecipientType> getRecipientTypes() {
        int i = 2 % 2;
        int i2 = f2725a;
        int i3 = i2 + 69;
        f2726b = i3 % 128;
        int i4 = i3 % 2;
        List<IRecipientType> list = this.getSponsorBeneficiariesState;
        int i5 = i2 + 109;
        f2726b = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    @Override
    public BundleTag getTag() {
        int i = 2 % 2;
        int i2 = f2725a + 71;
        int i3 = i2 % 128;
        f2726b = i3;
        int i4 = i2 % 2;
        BundleTag bundleTag = this.accessartificialFrame;
        int i5 = i3 + 25;
        f2725a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return bundleTag;
    }

    @Override
    public String getPackageId() {
        int i = 2 % 2;
        int i2 = f2725a;
        int i3 = i2 + 19;
        f2726b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getShareableDataState;
        int i5 = i2 + 53;
        f2726b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public String getPackageCategory() {
        int i = 2 % 2;
        int i2 = f2725a;
        int i3 = i2 + 105;
        f2726b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i2 + 119;
        f2726b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public IBundleType getBundleType() {
        int i = 2 % 2;
        int i2 = f2726b;
        int i3 = i2 + 33;
        f2725a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        IBundleType iBundleType = this.component1;
        int i4 = i2 + 101;
        f2725a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return iBundleType;
    }

    public final String getBundleTypeStr() {
        int i = 2 % 2;
        int i2 = f2725a;
        int i3 = i2 + 65;
        f2726b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 25;
        f2726b = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getProductTypeStr() {
        int i = 2 % 2;
        int i2 = f2725a + 7;
        int i3 = i2 % 128;
        f2726b = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.toString;
        int i4 = i3 + 79;
        f2725a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return str;
    }

    public final String getValidityStr() {
        int i = 2 % 2;
        int i2 = f2725a;
        int i3 = i2 + 45;
        f2726b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.coroutineBoundary;
        int i4 = i2 + 27;
        f2726b = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getPackageName() {
        int i = 2 % 2;
        int i2 = f2726b + 19;
        f2725a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.hashCode;
        }
        throw null;
    }

    public final String getBalanceCode() {
        int i = 2 % 2;
        int i2 = f2726b + 97;
        int i3 = i2 % 128;
        f2725a = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.component3;
        int i4 = i3 + 21;
        f2726b = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = 1 + 105;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bundle copy$default(Bundle bundle, int i, String str, String str2, String str3, float f, CounterUnits counterUnits, TextResource textResource, IBundleCategory iBundleCategory, List list, List list2, BundleTag bundleTag, String str4, String str5, IBundleType iBundleType, String str6, String str7, String str8, String str9, String str10, int i2, Object obj) {
        CounterUnits counterUnits2;
        List list3;
        IBundleType iBundleType2;
        int i3 = 2 % 2;
        int i4 = f2726b;
        int i5 = i4 + 63;
        f2725a = i5 % 128;
        int i6 = (i5 % 2 != 0 ? (i2 & 1) == 0 : (i2 & 1) == 0) ? i : bundle.copy;
        String str11 = (i2 & 2) != 0 ? bundle.component4 : str;
        String str12 = (i2 & 4) != 0 ? bundle.equals : str2;
        String str13 = (i2 & 8) != 0 ? bundle.getRequestBeneficiariesState : str3;
        float f2 = (i2 & 16) != 0 ? bundle.component2 : f;
        Object obj2 = null;
        if ((i2 & 32) != 0) {
            int i7 = i4 + 113;
            f2725a = i7 % 128;
            if (i7 % 2 == 0) {
                CounterUnits counterUnits3 = bundle.CoroutineDebuggingKt;
                obj2.hashCode();
                throw null;
            }
            counterUnits2 = bundle.CoroutineDebuggingKt;
        } else {
            counterUnits2 = counterUnits;
        }
        TextResource textResource2 = (i2 & 64) != 0 ? bundle.coroutineCreation : textResource;
        IBundleCategory iBundleCategory2 = (i2 & 128) != 0 ? bundle.copydefault : iBundleCategory;
        if ((i2 & 256) != 0) {
            int i8 = i4 + 103;
            f2725a = i8 % 128;
            if (i8 % 2 == 0) {
                List<PaymentOption> list4 = bundle.ArtificialStackFrames;
                throw null;
            }
            list3 = bundle.ArtificialStackFrames;
        } else {
            list3 = list;
        }
        List list5 = (i2 & 512) != 0 ? bundle.getSponsorBeneficiariesState : list2;
        BundleTag bundleTag2 = (i2 & 1024) != 0 ? bundle.accessartificialFrame : bundleTag;
        String str14 = (i2 & 2048) != 0 ? bundle.getShareableDataState : str4;
        String str15 = (i2 & 4096) != 0 ? bundle.getAsAtTimestamp : str5;
        if ((i2 & 8192) != 0) {
            int i9 = i4 + 33;
            f2725a = i9 % 128;
            if (i9 % 2 == 0) {
                IBundleType iBundleType3 = bundle.component1;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            iBundleType2 = bundle.component1;
        } else {
            iBundleType2 = iBundleType;
        }
        return bundle.copy(i6, str11, str12, str13, f2, counterUnits2, textResource2, iBundleCategory2, list3, list5, bundleTag2, str14, str15, iBundleType2, (i2 & 16384) != 0 ? bundle.ShareDataUIState : str6, (i2 & 32768) != 0 ? bundle.toString : str7, (i2 & 65536) != 0 ? bundle.coroutineBoundary : str8, (i2 & 131072) != 0 ? bundle.hashCode : str9, (i2 & 262144) != 0 ? bundle.component3 : str10);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = f2725a + 83;
        int i3 = i2 % 128;
        f2726b = i3;
        int i4 = i2 % 2;
        int i5 = this.copy;
        int i6 = i3 + 87;
        f2725a = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final List<IRecipientType> component10() {
        int i = 2 % 2;
        int i2 = f2726b + 61;
        f2725a = i2 % 128;
        int i3 = i2 % 2;
        List<IRecipientType> list = this.getSponsorBeneficiariesState;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return list;
    }

    public final BundleTag component11() {
        int i = 2 % 2;
        int i2 = f2726b;
        int i3 = i2 + 3;
        f2725a = i3 % 128;
        int i4 = i3 % 2;
        BundleTag bundleTag = this.accessartificialFrame;
        int i5 = i2 + 3;
        f2725a = i5 % 128;
        if (i5 % 2 != 0) {
            return bundleTag;
        }
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = f2725a + 91;
        f2726b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getShareableDataState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component13() {
        String str;
        int i = 2 % 2;
        int i2 = f2725a + 105;
        int i3 = i2 % 128;
        f2726b = i3;
        if (i2 % 2 != 0) {
            str = this.getAsAtTimestamp;
            int i4 = 50 / 0;
        } else {
            str = this.getAsAtTimestamp;
        }
        int i5 = i3 + 69;
        f2725a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final IBundleType component14() {
        int i = 2 % 2;
        int i2 = f2725a + 125;
        f2726b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = f2725a;
        int i3 = i2 + 75;
        f2726b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 63;
        f2726b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = f2725a;
        int i3 = i2 + 121;
        f2726b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.toString;
        int i5 = i2 + 39;
        f2726b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = f2725a;
        int i3 = i2 + 49;
        f2726b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.coroutineBoundary;
        int i5 = i2 + 105;
        f2726b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = f2726b;
        int i3 = i2 + 99;
        f2725a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.hashCode;
        int i4 = i2 + 35;
        f2725a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component19() {
        int i = 2 % 2;
        int i2 = f2725a + 79;
        f2726b = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = f2726b + 5;
        int i3 = i2 % 128;
        f2725a = i3;
        int i4 = i2 % 2;
        String str = this.component4;
        int i5 = i3 + 109;
        f2726b = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = f2726b + 109;
        f2725a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.equals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = f2726b;
        int i3 = i2 + 77;
        f2725a = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.getRequestBeneficiariesState;
        int i4 = i2 + 33;
        f2725a = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final float component5() {
        float f;
        int i = 2 % 2;
        int i2 = f2725a + 71;
        int i3 = i2 % 128;
        f2726b = i3;
        if (i2 % 2 != 0) {
            f = this.component2;
            int i4 = 38 / 0;
        } else {
            f = this.component2;
        }
        int i5 = i3 + 117;
        f2725a = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final CounterUnits component6() {
        int i = 2 % 2;
        int i2 = f2726b + 61;
        f2725a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.CoroutineDebuggingKt;
        }
        throw null;
    }

    public final TextResource component7() {
        int i = 2 % 2;
        int i2 = f2725a;
        int i3 = i2 + 37;
        f2726b = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextResource textResource = this.coroutineCreation;
        int i4 = i2 + 79;
        f2726b = i4 % 128;
        int i5 = i4 % 2;
        return textResource;
    }

    public final IBundleCategory component8() {
        int i = 2 % 2;
        int i2 = f2726b + 5;
        f2725a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final List<PaymentOption> component9() {
        int i = 2 % 2;
        int i2 = f2725a + 1;
        f2726b = i2 % 128;
        int i3 = i2 % 2;
        List<PaymentOption> list = this.ArtificialStackFrames;
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return list;
    }

    public final Bundle copy(int icon, String id, String name, String description, float amount, CounterUnits units, TextResource validity, IBundleCategory category, List<? extends PaymentOption> paymentTypes, List<? extends IRecipientType> recipientTypes, BundleTag tag, String packageId, String packageCategory, IBundleType bundleType, String bundleTypeStr, String productTypeStr, String validityStr, String packageName, String balanceCode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(description, "");
        Intrinsics.checkNotNullParameter(units, "");
        Intrinsics.checkNotNullParameter(paymentTypes, "");
        Intrinsics.checkNotNullParameter(recipientTypes, "");
        Intrinsics.checkNotNullParameter(validityStr, "");
        Intrinsics.checkNotNullParameter(packageName, "");
        Intrinsics.checkNotNullParameter(balanceCode, "");
        Bundle bundle = new Bundle(icon, id, name, description, amount, units, validity, category, paymentTypes, recipientTypes, tag, packageId, packageCategory, bundleType, bundleTypeStr, productTypeStr, validityStr, packageName, balanceCode);
        int i2 = f2726b + 103;
        f2725a = i2 % 128;
        int i3 = i2 % 2;
        return bundle;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = f2725a;
        int i3 = i2 + 51;
        f2726b = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 121;
            f2726b = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof Bundle)) {
            int i6 = i2 + 13;
            f2726b = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        Bundle bundle = (Bundle) other;
        if (this.copy != bundle.copy || !Intrinsics.areEqual(this.component4, bundle.component4) || !Intrinsics.areEqual(this.equals, bundle.equals) || !Intrinsics.areEqual(this.getRequestBeneficiariesState, bundle.getRequestBeneficiariesState) || Float.compare(this.component2, bundle.component2) != 0 || this.CoroutineDebuggingKt != bundle.CoroutineDebuggingKt) {
            return false;
        }
        if (!Intrinsics.areEqual(this.coroutineCreation, bundle.coroutineCreation)) {
            int i8 = f2725a + 65;
            f2726b = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, bundle.copydefault)) {
            int i10 = f2726b + 49;
            f2725a = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.ArtificialStackFrames, bundle.ArtificialStackFrames) && Intrinsics.areEqual(this.getSponsorBeneficiariesState, bundle.getSponsorBeneficiariesState) && Intrinsics.areEqual(this.accessartificialFrame, bundle.accessartificialFrame) && Intrinsics.areEqual(this.getShareableDataState, bundle.getShareableDataState) && !(!Intrinsics.areEqual(this.getAsAtTimestamp, bundle.getAsAtTimestamp))) {
            if (Intrinsics.areEqual(this.component1, bundle.component1)) {
                return Intrinsics.areEqual(this.ShareDataUIState, bundle.ShareDataUIState) && Intrinsics.areEqual(this.toString, bundle.toString) && Intrinsics.areEqual(this.coroutineBoundary, bundle.coroutineBoundary) && !(Intrinsics.areEqual(this.hashCode, bundle.hashCode) ^ true) && Intrinsics.areEqual(this.component3, bundle.component3);
            }
            int i12 = f2725a + 55;
            f2726b = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i;
        int i2 = 2 % 2;
        int iHashCode4 = Integer.hashCode(this.copy);
        int iHashCode5 = this.component4.hashCode();
        int iHashCode6 = this.equals.hashCode();
        int iHashCode7 = this.getRequestBeneficiariesState.hashCode();
        int iHashCode8 = Float.hashCode(this.component2);
        int iHashCode9 = this.CoroutineDebuggingKt.hashCode();
        TextResource textResource = this.coroutineCreation;
        if (textResource == null) {
            int i3 = f2725a + 105;
            f2726b = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = textResource.hashCode();
        }
        IBundleCategory iBundleCategory = this.copydefault;
        if (iBundleCategory == null) {
            int i5 = f2726b + 45;
            f2725a = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = iBundleCategory.hashCode();
        }
        int iHashCode10 = this.ArtificialStackFrames.hashCode();
        int iHashCode11 = this.getSponsorBeneficiariesState.hashCode();
        BundleTag bundleTag = this.accessartificialFrame;
        int iHashCode12 = bundleTag == null ? 0 : bundleTag.hashCode();
        String str = this.getShareableDataState;
        int iHashCode13 = str == null ? 0 : str.hashCode();
        String str2 = this.getAsAtTimestamp;
        if (str2 == null) {
            int i7 = f2725a + 91;
            f2726b = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str2.hashCode();
        }
        IBundleType iBundleType = this.component1;
        int iHashCode14 = iBundleType == null ? 0 : iBundleType.hashCode();
        String str3 = this.ShareDataUIState;
        int iHashCode15 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.toString;
        if (str4 == null) {
            i = 0;
        } else {
            int iHashCode16 = str4.hashCode();
            int i9 = f2726b + 9;
            f2725a = i9 % 128;
            int i10 = i9 % 2;
            i = iHashCode16;
        }
        return (((((((((((((((((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode3) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + i) * 31) + this.coroutineBoundary.hashCode()) * 31) + this.hashCode.hashCode()) * 31) + this.component3.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Bundle(icon=" + this.copy + ", id=" + this.component4 + ", name=" + this.equals + ", description=" + this.getRequestBeneficiariesState + ", amount=" + this.component2 + ", units=" + this.CoroutineDebuggingKt + ", validity=" + this.coroutineCreation + ", category=" + this.copydefault + ", paymentTypes=" + this.ArtificialStackFrames + ", recipientTypes=" + this.getSponsorBeneficiariesState + ", tag=" + this.accessartificialFrame + ", packageId=" + this.getShareableDataState + ", packageCategory=" + this.getAsAtTimestamp + ", bundleType=" + this.component1 + ", bundleTypeStr=" + this.ShareDataUIState + ", productTypeStr=" + this.toString + ", validityStr=" + this.coroutineBoundary + ", packageName=" + this.hashCode + ", balanceCode=" + this.component3 + ")";
        int i2 = f2725a + 103;
        f2726b = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
