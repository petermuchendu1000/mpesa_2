package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils;

import com.alibaba.ariver.engine.common.track.recovery.DeepRecoverARiverProxy;
import com.alibaba.griver.image.photo.utils.PhotoUtil;
import com.alipay.mobile.common.rpc.RpcException;
import com.blankj.utilcode.constant.CacheConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u0015\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010\tR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/BandsDecoder;", "", "<init>", "()V", "bandToFrequency", "", "", "getFrequencyForBand", "bandNumber", "(I)Ljava/lang/Integer;", "nrBandToFrequency", "getNrBandToFrequency", "()Ljava/util/Map;", "getFrequencyForNrBand", "band", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BandsDecoder {
    public static final int $stable;
    public static final BandsDecoder INSTANCE = new BandsDecoder();
    private static int ShareDataUIState = 0;
    private static final Map<Integer, Integer> component1;
    private static int component2 = 1;
    private static final Map<Integer, Integer> component3;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;

    private BandsDecoder() {
    }

    static {
        Pair pair = TuplesKt.to(1, 2100);
        Pair pair2 = TuplesKt.to(2, 1900);
        Pair pair3 = TuplesKt.to(3, 1800);
        Pair pair4 = TuplesKt.to(4, 1700);
        Pair pair5 = TuplesKt.to(5, 850);
        Integer numValueOf = Integer.valueOf(PhotoUtil.MAX_WIDTH);
        component1 = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, TuplesKt.to(6, numValueOf), TuplesKt.to(7, 2600), TuplesKt.to(8, 900), TuplesKt.to(9, 1800), TuplesKt.to(10, 1700), TuplesKt.to(11, 1500), TuplesKt.to(12, 700), TuplesKt.to(13, 700), TuplesKt.to(14, 700), TuplesKt.to(17, 700), TuplesKt.to(18, 850), TuplesKt.to(19, 850), TuplesKt.to(20, numValueOf), TuplesKt.to(21, 1500), TuplesKt.to(22, 3500), TuplesKt.to(23, 2000), TuplesKt.to(24, 1600), TuplesKt.to(25, 1900), TuplesKt.to(26, 850), TuplesKt.to(27, numValueOf), TuplesKt.to(28, 700), TuplesKt.to(29, 700), TuplesKt.to(30, 2300), TuplesKt.to(31, 450), TuplesKt.to(32, 1500), TuplesKt.to(33, 1900), TuplesKt.to(34, 2000), TuplesKt.to(35, 1900), TuplesKt.to(36, 1900), TuplesKt.to(37, 1900), TuplesKt.to(38, 2600), TuplesKt.to(39, 1900), TuplesKt.to(40, 2300), TuplesKt.to(41, 2500), TuplesKt.to(42, 3500), TuplesKt.to(43, 3700), TuplesKt.to(44, 700), TuplesKt.to(66, 1700), TuplesKt.to(71, 600));
        component3 = MapsKt.mapOf(TuplesKt.to(1, 2100), TuplesKt.to(2, 1900), TuplesKt.to(3, 1800), TuplesKt.to(5, 850), TuplesKt.to(7, 2600), TuplesKt.to(8, 900), TuplesKt.to(12, 700), TuplesKt.to(14, 700), TuplesKt.to(18, 850), TuplesKt.to(20, numValueOf), TuplesKt.to(25, 1900), TuplesKt.to(26, 850), TuplesKt.to(28, 700), TuplesKt.to(29, 700), TuplesKt.to(30, 2300), TuplesKt.to(34, 2000), TuplesKt.to(38, 2600), TuplesKt.to(39, 1900), TuplesKt.to(40, 2300), TuplesKt.to(41, 2500), TuplesKt.to(46, 5200), TuplesKt.to(48, Integer.valueOf(CacheConstants.HOUR)), TuplesKt.to(50, 1500), TuplesKt.to(51, 1500), TuplesKt.to(53, 1500), TuplesKt.to(65, 2100), TuplesKt.to(66, 1700), TuplesKt.to(70, 2000), TuplesKt.to(71, 600), TuplesKt.to(74, 1500), TuplesKt.to(75, 1500), TuplesKt.to(76, 1500), TuplesKt.to(77, 3700), TuplesKt.to(78, 3500), TuplesKt.to(79, 4200), TuplesKt.to(80, 4400), TuplesKt.to(81, 4400), TuplesKt.to(82, 4500), TuplesKt.to(83, 4500), TuplesKt.to(84, 4600), TuplesKt.to(86, Integer.valueOf(RpcException.ErrorCode.SERVER_UNKNOWERROR)), TuplesKt.to(89, 5100), TuplesKt.to(90, 5200), TuplesKt.to(91, 5300), TuplesKt.to(92, 5400), TuplesKt.to(93, 5500), TuplesKt.to(94, 5600), TuplesKt.to(95, 5700), TuplesKt.to(96, 6400), TuplesKt.to(257, 28500), TuplesKt.to(Integer.valueOf(DeepRecoverARiverProxy.TYPE_ENTITY_TEMPLATE), 26500), TuplesKt.to(Integer.valueOf(DeepRecoverARiverProxy.TYPE_ENTITY_TA_PAGE), 39000), TuplesKt.to(Integer.valueOf(DeepRecoverARiverProxy.TYPE_ENTITY_ONLINE_PAGE), 28000));
        $stable = 8;
        int i = component2 + 75;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getFrequencyForBand(int bandNumber) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            component1.get(Integer.valueOf(bandNumber));
            obj.hashCode();
            throw null;
        }
        Integer num = component1.get(Integer.valueOf(bandNumber));
        int i3 = getAsAtTimestamp + 51;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final Map<Integer, Integer> getNrBandToFrequency() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Map<Integer, Integer> map = component3;
        int i5 = i2 + 27;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Integer getFrequencyForNrBand(int band) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            component3.get(Integer.valueOf(band));
            throw null;
        }
        Integer num = component3.get(Integer.valueOf(band));
        int i3 = getAsAtTimestamp + 13;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 16 / 0;
        }
        return num;
    }
}
