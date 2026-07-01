package com.huawei.digitalpayment.consumer.sfcui.profile.support;

import com.alibaba.ariver.resource.api.prepare.PrepareException;
import com.huawei.digitalpayment.consumer.sfc.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u0006J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\b¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/support/SupportItems;", "", "<init>", "()V", "ASK_ZURI", "Lkotlin/Pair;", "", "getASK_ZURI", "()Lkotlin/Pair;", "CALL_SUPPORT", "getCALL_SUPPORT", "FAQS", "getFAQS", "SAF_WEBSITE", "getSAF_WEBSITE", "FACEBOOK", "getFACEBOOK", "TWITTER_X", "getTWITTER_X", "YOUTUBE", "getYOUTUBE", "RATE_US_ON_GOOGLE_PLAY", "getRATE_US_ON_GOOGLE_PLAY", "TERMS_AND_CONDITIONS", "getTERMS_AND_CONDITIONS", "PRIVACY_POLICY", "getPRIVACY_POLICY", "createSupportItems", "", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/support/SupportBean;", "customerType", "createAboutItems", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportItems {
    public static final int $stable = 0;
    private static int ArtificialStackFrames = 1;
    private static int getShareableDataState = 0;
    private static int hashCode = 0;
    private static int toString = 1;
    public static final SupportItems INSTANCE = new SupportItems();
    private static final Pair<String, String> component2 = new Pair<>("1", "Ask Zuri");
    private static final Pair<String, String> copydefault = new Pair<>("2", "Call Support");
    private static final Pair<String, String> component3 = new Pair<>("3", "Frequently Asked Questions");
    private static final Pair<String, String> component4 = new Pair<>("4", "Safaricom Website");
    private static final Pair<String, String> component1 = new Pair<>("5", "Facebook");
    private static final Pair<String, String> copy = new Pair<>("6", "X");
    private static final Pair<String, String> equals = new Pair<>("7", "YouTube");
    private static final Pair<String, String> getRequestBeneficiariesState = new Pair<>(PrepareException.ERROR_AUTH_FAIL, "Rate us on Google Play");
    private static final Pair<String, String> getAsAtTimestamp = new Pair<>(PrepareException.ERROR_OFFLINE_APP, "Terms and Conditions");
    private static final Pair<String, String> ShareDataUIState = new Pair<>("10", "Privacy Policy");

    private SupportItems() {
    }

    static {
        int i = toString + 19;
        getShareableDataState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final Pair<String, String> getASK_ZURI() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 55;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        Pair<String, String> pair = component2;
        int i5 = i3 + 109;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return pair;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getCALL_SUPPORT() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 87;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        Pair<String, String> pair = copydefault;
        int i5 = i3 + 87;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return pair;
    }

    public final Pair<String, String> getFAQS() {
        int i = 2 % 2;
        int i2 = hashCode + 21;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Pair<String, String> pair = component3;
        int i4 = i3 + 29;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return pair;
    }

    public final Pair<String, String> getSAF_WEBSITE() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 33;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        Pair<String, String> pair = component4;
        int i5 = i3 + 101;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return pair;
        }
        throw null;
    }

    public final Pair<String, String> getFACEBOOK() {
        Pair<String, String> pair;
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 53;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            pair = component1;
            int i4 = 67 / 0;
        } else {
            pair = component1;
        }
        int i5 = i2 + 1;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return pair;
    }

    public final Pair<String, String> getTWITTER_X() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 123;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return copy;
        }
        throw null;
    }

    public final Pair<String, String> getYOUTUBE() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 11;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return equals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getRATE_US_ON_GOOGLE_PLAY() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 75;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        Pair<String, String> pair = getRequestBeneficiariesState;
        int i5 = i3 + 9;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return pair;
    }

    public final Pair<String, String> getTERMS_AND_CONDITIONS() {
        Pair<String, String> pair;
        int i = 2 % 2;
        int i2 = hashCode + 51;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 == 0) {
            pair = getAsAtTimestamp;
            int i4 = 9 / 0;
        } else {
            pair = getAsAtTimestamp;
        }
        int i5 = i3 + 113;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return pair;
    }

    public final Pair<String, String> getPRIVACY_POLICY() {
        int i = 2 % 2;
        int i2 = hashCode + 11;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return ShareDataUIState;
        }
        throw null;
    }

    public static List createSupportItems$default(SupportItems supportItems, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = hashCode + 81;
        int i4 = i3 % 128;
        ArtificialStackFrames = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 91;
            hashCode = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            str = "Prepaid";
        }
        return supportItems.createSupportItems(str);
    }

    public final List<SupportBean> createSupportItems(String customerType) {
        String str;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(customerType, "");
        SupportBean[] supportBeanArr = new SupportBean[7];
        Pair<String, String> pair = component2;
        supportBeanArr[0] = new SupportBean(pair.getFirst(), R.drawable.image_zuri_logo, pair.getSecond(), null, 8, null);
        Pair<String, String> pair2 = copydefault;
        String first = pair2.getFirst();
        String second = pair2.getSecond();
        int i2 = R.drawable.ic_support_call;
        if (!(!StringsKt.equals(customerType, "Prepaid", true))) {
            int i3 = hashCode + 69;
            ArtificialStackFrames = i3 % 128;
            int i4 = i3 % 2;
            str = "tel:100";
        } else {
            str = "tel:200";
        }
        supportBeanArr[1] = new SupportBean(first, i2, second, str);
        Pair<String, String> pair3 = component3;
        supportBeanArr[2] = new SupportBean(pair3.getFirst(), R.drawable.ic_faqs, pair3.getSecond(), null, 8, null);
        Pair<String, String> pair4 = component4;
        supportBeanArr[3] = new SupportBean(pair4.getFirst(), R.drawable.ic_saf_support, pair4.getSecond(), "https://www.safaricom.co.ke/");
        Pair<String, String> pair5 = component1;
        supportBeanArr[4] = new SupportBean(pair5.getFirst(), R.drawable.ic_facebook, pair5.getSecond(), "https://www.facebook.com/SafaricomPLC/");
        Pair<String, String> pair6 = copy;
        supportBeanArr[5] = new SupportBean(pair6.getFirst(), R.drawable.ic_twitter_x, pair6.getSecond(), "https://x.com/SafaricomPLC/");
        Pair<String, String> pair7 = equals;
        supportBeanArr[6] = new SupportBean(pair7.getFirst(), R.drawable.ic_youtube, pair7.getSecond(), "https://www.youtube.com/@safaricomplc/");
        List<SupportBean> listListOf = CollectionsKt.listOf((Object[]) supportBeanArr);
        int i5 = ArtificialStackFrames + 25;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return listListOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<SupportBean> createAboutItems() {
        int i = 2 % 2;
        Pair<String, String> pair = getRequestBeneficiariesState;
        SupportBean supportBean = new SupportBean(pair.getFirst(), R.drawable.ic_rate_star, pair.getSecond(), null, 8, null);
        Pair<String, String> pair2 = getAsAtTimestamp;
        SupportBean supportBean2 = new SupportBean(pair2.getFirst(), R.drawable.ic_about_terms, pair2.getSecond(), "https://www.safaricom.co.ke/");
        Pair<String, String> pair3 = ShareDataUIState;
        List<SupportBean> listListOf = CollectionsKt.listOf((Object[]) new SupportBean[]{supportBean, supportBean2, new SupportBean(pair3.getFirst(), R.drawable.ic_about_privacy, pair3.getSecond(), "https://www.safaricom.co.ke/")});
        int i2 = hashCode + 15;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
        return listListOf;
    }
}
