package com.huawei.digitalpayment.consumer.base.database.entities.mtandao;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyAirtimeTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b¸\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u0082\u00022\u00020\u00012\u00020\u0002:\u0004\u0081\u0002\u0082\u0002BÇ\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010'\u001a\u00020%\u0012\b\b\u0002\u0010(\u001a\u00020%\u0012\b\b\u0002\u0010)\u001a\u00020%\u0012\b\b\u0002\u0010*\u001a\u00020%\u0012\b\b\u0002\u0010+\u001a\u00020\u0004\u0012\b\b\u0002\u0010,\u001a\u00020\u0004\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010/\u001a\u00020\u0004\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b1\u00102BÏ\u0003\b\u0010\u0012\u0006\u00103\u001a\u000204\u0012\u0006\u00105\u001a\u000204\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020%\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\b\u00100\u001a\u0004\u0018\u00010\u0004\u0012\b\u00106\u001a\u0004\u0018\u000107¢\u0006\u0004\b1\u00108J\n\u0010Á\u0001\u001a\u00020\u0004HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Í\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Î\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ò\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ó\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Õ\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ö\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010×\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ù\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ú\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Û\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Ý\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010à\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010á\u0001\u001a\u00020%HÆ\u0003J\n\u0010â\u0001\u001a\u00020%HÆ\u0003J\n\u0010ã\u0001\u001a\u00020%HÆ\u0003J\n\u0010ä\u0001\u001a\u00020%HÆ\u0003J\n\u0010å\u0001\u001a\u00020%HÆ\u0003J\n\u0010æ\u0001\u001a\u00020%HÆ\u0003J\n\u0010ç\u0001\u001a\u00020\u0004HÆ\u0003J\n\u0010è\u0001\u001a\u00020\u0004HÆ\u0003J\f\u0010é\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010ê\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010ë\u0001\u001a\u00020\u0004HÆ\u0003J\f\u0010ì\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003JÊ\u0003\u0010í\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020%2\b\b\u0002\u0010)\u001a\u00020%2\b\b\u0002\u0010*\u001a\u00020%2\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0007\u0010î\u0001\u001a\u000204J\u0017\u0010ï\u0001\u001a\u00030ð\u00012\n\u0010ñ\u0001\u001a\u0005\u0018\u00010ò\u0001HÖ\u0003J\n\u0010ó\u0001\u001a\u000204HÖ\u0001J\n\u0010ô\u0001\u001a\u00020\u0004HÖ\u0001J\u001b\u0010õ\u0001\u001a\u00030ö\u00012\b\u0010÷\u0001\u001a\u00030ø\u00012\u0007\u0010ù\u0001\u001a\u000204J-\u0010ú\u0001\u001a\u00030ö\u00012\u0007\u0010û\u0001\u001a\u00020\u00002\b\u0010ü\u0001\u001a\u00030ý\u00012\b\u0010þ\u0001\u001a\u00030ÿ\u0001H\u0001¢\u0006\u0003\b\u0080\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R&\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b?\u0010:\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R$\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bB\u0010:\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>R$\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bE\u0010:\u001a\u0004\bF\u0010<\"\u0004\bG\u0010>R$\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bH\u0010:\u001a\u0004\bI\u0010<\"\u0004\bJ\u0010>R$\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bK\u0010:\u001a\u0004\bL\u0010<\"\u0004\bM\u0010>R$\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bN\u0010:\u001a\u0004\bO\u0010<\"\u0004\bP\u0010>R$\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bQ\u0010:\u001a\u0004\bR\u0010<\"\u0004\bS\u0010>R$\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bT\u0010:\u001a\u0004\bU\u0010<\"\u0004\bV\u0010>R$\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bW\u0010:\u001a\u0004\bX\u0010<\"\u0004\bY\u0010>R$\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bZ\u0010:\u001a\u0004\b[\u0010<\"\u0004\b\\\u0010>R$\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b]\u0010:\u001a\u0004\b^\u0010<\"\u0004\b_\u0010>R$\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b`\u0010:\u001a\u0004\ba\u0010<\"\u0004\bb\u0010>R$\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bc\u0010:\u001a\u0004\bd\u0010<\"\u0004\be\u0010>R$\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bf\u0010:\u001a\u0004\bg\u0010<\"\u0004\bh\u0010>R$\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bi\u0010:\u001a\u0004\bj\u0010<\"\u0004\bk\u0010>R$\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bl\u0010:\u001a\u0004\bm\u0010<\"\u0004\bn\u0010>R$\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bo\u0010:\u001a\u0004\bp\u0010<\"\u0004\bq\u0010>R$\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\br\u0010:\u001a\u0004\bs\u0010<\"\u0004\bt\u0010>R$\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bu\u0010:\u001a\u0004\bv\u0010<\"\u0004\bw\u0010>R$\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bx\u0010:\u001a\u0004\by\u0010<\"\u0004\bz\u0010>R$\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b{\u0010:\u001a\u0004\b|\u0010<\"\u0004\b}\u0010>R%\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0015\n\u0000\u0012\u0004\b~\u0010:\u001a\u0004\b\u007f\u0010<\"\u0005\b\u0080\u0001\u0010>R&\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0000\u0012\u0005\b\u0081\u0001\u0010:\u001a\u0004\b\u001b\u0010<\"\u0005\b\u0082\u0001\u0010>R'\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0083\u0001\u0010:\u001a\u0005\b\u0084\u0001\u0010<\"\u0005\b\u0085\u0001\u0010>R'\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0086\u0001\u0010:\u001a\u0005\b\u0087\u0001\u0010<\"\u0005\b\u0088\u0001\u0010>R'\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0089\u0001\u0010:\u001a\u0005\b\u008a\u0001\u0010<\"\u0005\b\u008b\u0001\u0010>R'\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u008c\u0001\u0010:\u001a\u0005\b\u008d\u0001\u0010<\"\u0005\b\u008e\u0001\u0010>R'\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u008f\u0001\u0010:\u001a\u0005\b\u0090\u0001\u0010<\"\u0005\b\u0091\u0001\u0010>R'\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0092\u0001\u0010:\u001a\u0005\b\u0093\u0001\u0010<\"\u0005\b\u0094\u0001\u0010>R'\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0095\u0001\u0010:\u001a\u0005\b\u0096\u0001\u0010<\"\u0005\b\u0097\u0001\u0010>R'\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0098\u0001\u0010:\u001a\u0005\b\u0099\u0001\u0010<\"\u0005\b\u009a\u0001\u0010>R)\u0010$\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u0019\n\u0000\u0012\u0005\b\u009b\u0001\u0010:\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R)\u0010&\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u0019\n\u0000\u0012\u0005\b \u0001\u0010:\u001a\u0006\b¡\u0001\u0010\u009d\u0001\"\u0006\b¢\u0001\u0010\u009f\u0001R)\u0010'\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u0019\n\u0000\u0012\u0005\b£\u0001\u0010:\u001a\u0006\b¤\u0001\u0010\u009d\u0001\"\u0006\b¥\u0001\u0010\u009f\u0001R)\u0010(\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u0019\n\u0000\u0012\u0005\b¦\u0001\u0010:\u001a\u0006\b§\u0001\u0010\u009d\u0001\"\u0006\b¨\u0001\u0010\u009f\u0001R)\u0010)\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u0019\n\u0000\u0012\u0005\b©\u0001\u0010:\u001a\u0006\bª\u0001\u0010\u009d\u0001\"\u0006\b«\u0001\u0010\u009f\u0001R)\u0010*\u001a\u00020%8\u0006@\u0006X\u0087\u000e¢\u0006\u0019\n\u0000\u0012\u0005\b¬\u0001\u0010:\u001a\u0006\b\u00ad\u0001\u0010\u009d\u0001\"\u0006\b®\u0001\u0010\u009f\u0001R'\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b¯\u0001\u0010:\u001a\u0005\b°\u0001\u0010<\"\u0005\b±\u0001\u0010>R'\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b²\u0001\u0010:\u001a\u0005\b³\u0001\u0010<\"\u0005\b´\u0001\u0010>R)\u0010-\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\bµ\u0001\u0010:\u001a\u0005\b¶\u0001\u0010<\"\u0005\b·\u0001\u0010>R)\u0010.\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b¸\u0001\u0010:\u001a\u0005\b¹\u0001\u0010<\"\u0005\bº\u0001\u0010>R'\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b»\u0001\u0010:\u001a\u0005\b¼\u0001\u0010<\"\u0005\b½\u0001\u0010>R)\u00100\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b¾\u0001\u0010:\u001a\u0005\b¿\u0001\u0010<\"\u0005\bÀ\u0001\u0010>¨\u0006\u0083\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/UserData;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "datasessionId", "", "subscriberNo", "dataTimestamp", "mtandaoType", "uniquedevID", "appVersion", "androidVersion", "devBrand", "devModel", "devManu", "devName", "devSocManuf", "devSocModel", "devBoard", "devFirmware", "devTags", "bType", "bProduct", "hardware", "bLoader", "buildId", "devBuildDisp", "supportedArchitec", "isDeviceRooted", "simName1", "simName2", "mostUsedApps", "lastusedapps", "mostUsedDataMobileRx", "mostUsedDataMobileTx", "mostUsedDataWifiRx", "mostUsedDataWifiTx", "totalDataRxMobile", "", "totalDataTxMobile", "totalDataRxWifi", "totalDataTxWifi", "totalDataRxHotspot", "totalDataTxHotspot", "simSerial1", "simSerial2", "imei", "imsi", "airplaneMode", "browsingExp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "seen1", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDatasessionId$annotations", "()V", "getDatasessionId", "()Ljava/lang/String;", "setDatasessionId", "(Ljava/lang/String;)V", "getSubscriberNo$annotations", "getSubscriberNo", "setSubscriberNo", "getDataTimestamp$annotations", "getDataTimestamp", "setDataTimestamp", "getMtandaoType$annotations", "getMtandaoType", "setMtandaoType", "getUniquedevID$annotations", "getUniquedevID", "setUniquedevID", "getAppVersion$annotations", "getAppVersion", "setAppVersion", "getAndroidVersion$annotations", "getAndroidVersion", "setAndroidVersion", "getDevBrand$annotations", "getDevBrand", "setDevBrand", "getDevModel$annotations", "getDevModel", "setDevModel", "getDevManu$annotations", "getDevManu", "setDevManu", "getDevName$annotations", "getDevName", "setDevName", "getDevSocManuf$annotations", "getDevSocManuf", "setDevSocManuf", "getDevSocModel$annotations", "getDevSocModel", "setDevSocModel", "getDevBoard$annotations", "getDevBoard", "setDevBoard", "getDevFirmware$annotations", "getDevFirmware", "setDevFirmware", "getDevTags$annotations", "getDevTags", "setDevTags", "getBType$annotations", "getBType", "setBType", "getBProduct$annotations", "getBProduct", "setBProduct", "getHardware$annotations", "getHardware", "setHardware", "getBLoader$annotations", "getBLoader", "setBLoader", "getBuildId$annotations", "getBuildId", "setBuildId", "getDevBuildDisp$annotations", "getDevBuildDisp", "setDevBuildDisp", "getSupportedArchitec$annotations", "getSupportedArchitec", "setSupportedArchitec", "isDeviceRooted$annotations", "setDeviceRooted", "getSimName1$annotations", "getSimName1", "setSimName1", "getSimName2$annotations", "getSimName2", "setSimName2", "getMostUsedApps$annotations", "getMostUsedApps", "setMostUsedApps", "getLastusedapps$annotations", "getLastusedapps", "setLastusedapps", "getMostUsedDataMobileRx$annotations", "getMostUsedDataMobileRx", "setMostUsedDataMobileRx", "getMostUsedDataMobileTx$annotations", "getMostUsedDataMobileTx", "setMostUsedDataMobileTx", "getMostUsedDataWifiRx$annotations", "getMostUsedDataWifiRx", "setMostUsedDataWifiRx", "getMostUsedDataWifiTx$annotations", "getMostUsedDataWifiTx", "setMostUsedDataWifiTx", "getTotalDataRxMobile$annotations", "getTotalDataRxMobile", "()J", "setTotalDataRxMobile", "(J)V", "getTotalDataTxMobile$annotations", "getTotalDataTxMobile", "setTotalDataTxMobile", "getTotalDataRxWifi$annotations", "getTotalDataRxWifi", "setTotalDataRxWifi", "getTotalDataTxWifi$annotations", "getTotalDataTxWifi", "setTotalDataTxWifi", "getTotalDataRxHotspot$annotations", "getTotalDataRxHotspot", "setTotalDataRxHotspot", "getTotalDataTxHotspot$annotations", "getTotalDataTxHotspot", "setTotalDataTxHotspot", "getSimSerial1$annotations", "getSimSerial1", "setSimSerial1", "getSimSerial2$annotations", "getSimSerial2", "setSimSerial2", "getImei$annotations", "getImei", "setImei", "getImsi$annotations", "getImsi", "setImsi", "getAirplaneMode$annotations", "getAirplaneMode", "setAirplaneMode", "getBrowsingExp$annotations", "getBrowsingExp", "setBrowsingExp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "write$Self", BuyAirtimeTypes.SELF, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ConsumerBaseUi_release", "$serializer", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final class UserData implements java.io.Serializable, Parcelable {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private String airplaneMode;
    private String androidVersion;
    private String appVersion;
    private String bLoader;
    private String bProduct;
    private String bType;
    private String browsingExp;
    private String buildId;
    private String dataTimestamp;
    private String datasessionId;
    private String devBoard;
    private String devBrand;
    private String devBuildDisp;
    private String devFirmware;
    private String devManu;
    private String devModel;
    private String devName;
    private String devSocManuf;
    private String devSocModel;
    private String devTags;
    private String hardware;
    private String imei;
    private String imsi;
    private String isDeviceRooted;
    private String lastusedapps;
    private String mostUsedApps;
    private String mostUsedDataMobileRx;
    private String mostUsedDataMobileTx;
    private String mostUsedDataWifiRx;
    private String mostUsedDataWifiTx;
    private String mtandaoType;
    private String simName1;
    private String simName2;
    private String simSerial1;
    private String simSerial2;
    private String subscriberNo;
    private String supportedArchitec;
    private long totalDataRxHotspot;
    private long totalDataRxMobile;
    private long totalDataRxWifi;
    private long totalDataTxHotspot;
    private long totalDataTxMobile;
    private long totalDataTxWifi;
    private String uniquedevID;

    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<UserData> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserData> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UserData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            UserData userData = new UserData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 93;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return userData;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public UserData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 5;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            UserData userDataCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 41 / 0;
            }
            return userDataCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UserData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 73;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            UserData[] userDataArr = new UserData[i];
            int i6 = i4 + 29;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 84 / 0;
            }
            return userDataArr;
        }

        @Override
        public UserData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 79;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            UserData[] userDataArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 31 / 0;
            }
            int i6 = component3 + 23;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                return userDataArrNewArray;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/UserData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/UserData;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 1;
        private static int component2;

        public final KSerializer<UserData> serializer() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 65;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            UserData$$serializer userData$$serializer = UserData$$serializer.INSTANCE;
            int i4 = component2 + 13;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return userData$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserData(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, long j, long j2, long j3, long j4, long j5, long j6, String str33, String str34, String str35, String str36, String str37, String str38, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.datasessionId = "";
        } else {
            this.datasessionId = str;
        }
        Object obj = null;
        if ((i & 2) == 0) {
            this.subscriberNo = null;
        } else {
            this.subscriberNo = str2;
        }
        if ((i & 4) == 0) {
            this.dataTimestamp = "";
        } else {
            this.dataTimestamp = str3;
        }
        if ((i & 8) == 0) {
            this.mtandaoType = "";
        } else {
            this.mtandaoType = str4;
        }
        if ((i & 16) == 0) {
            this.uniquedevID = "";
        } else {
            this.uniquedevID = str5;
        }
        if ((i & 32) == 0) {
            this.appVersion = "";
        } else {
            this.appVersion = str6;
        }
        if ((i & 64) == 0) {
            this.androidVersion = "";
        } else {
            this.androidVersion = str7;
        }
        if ((i & 128) == 0) {
            this.devBrand = "";
        } else {
            this.devBrand = str8;
        }
        if ((i & 256) == 0) {
            this.devModel = "";
        } else {
            this.devModel = str9;
        }
        if ((i & 512) == 0) {
            this.devManu = "";
        } else {
            this.devManu = str10;
        }
        if ((i & 1024) == 0) {
            int i3 = component3 + 85;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            this.devName = "";
            if (i4 == 0) {
                throw null;
            }
        } else {
            this.devName = str11;
        }
        if ((i & 2048) == 0) {
            this.devSocManuf = "";
        } else {
            this.devSocManuf = str12;
        }
        if ((i & 4096) == 0) {
            this.devSocModel = "";
        } else {
            this.devSocModel = str13;
            int i5 = 2 % 2;
        }
        if ((i & 8192) == 0) {
            this.devBoard = "";
        } else {
            this.devBoard = str14;
        }
        if ((i & 16384) == 0) {
            this.devFirmware = "";
        } else {
            this.devFirmware = str15;
        }
        if ((32768 & i) == 0) {
            this.devTags = "";
            int i6 = 2 % 2;
        } else {
            this.devTags = str16;
        }
        if ((65536 & i) == 0) {
            int i7 = component1 + 57;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            this.bType = "";
        } else {
            this.bType = str17;
        }
        if ((131072 & i) == 0) {
            this.bProduct = "";
        } else {
            this.bProduct = str18;
        }
        if ((262144 & i) == 0) {
            this.hardware = "";
        } else {
            this.hardware = str19;
        }
        if ((524288 & i) == 0) {
            int i9 = component1 + 21;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            this.bLoader = "";
        } else {
            this.bLoader = str20;
        }
        if ((1048576 & i) == 0) {
            int i11 = component3 + 119;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            this.buildId = "";
            if (i12 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            this.buildId = str21;
        }
        if ((2097152 & i) == 0) {
            this.devBuildDisp = "";
        } else {
            this.devBuildDisp = str22;
        }
        if ((4194304 & i) == 0) {
            this.supportedArchitec = "";
        } else {
            this.supportedArchitec = str23;
        }
        if ((8388608 & i) == 0) {
            int i13 = component1 + 113;
            component3 = i13 % 128;
            int i14 = i13 % 2;
            this.isDeviceRooted = "";
            if (i14 != 0) {
                throw null;
            }
        } else {
            this.isDeviceRooted = str24;
        }
        if ((16777216 & i) == 0) {
            this.simName1 = "";
        } else {
            this.simName1 = str25;
        }
        if ((33554432 & i) == 0) {
            this.simName2 = "";
        } else {
            this.simName2 = str26;
        }
        if ((67108864 & i) == 0) {
            this.mostUsedApps = "";
        } else {
            this.mostUsedApps = str27;
        }
        if ((134217728 & i) == 0) {
            this.lastusedapps = "";
        } else {
            this.lastusedapps = str28;
        }
        if ((268435456 & i) == 0) {
            this.mostUsedDataMobileRx = "";
        } else {
            this.mostUsedDataMobileRx = str29;
        }
        if ((536870912 & i) == 0) {
            this.mostUsedDataMobileTx = "";
        } else {
            this.mostUsedDataMobileTx = str30;
        }
        if ((1073741824 & i) == 0) {
            int i15 = component1 + 69;
            component3 = i15 % 128;
            int i16 = i15 % 2;
            this.mostUsedDataWifiRx = "";
        } else {
            this.mostUsedDataWifiRx = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.mostUsedDataWifiTx = "";
        } else {
            this.mostUsedDataWifiTx = str32;
        }
        long j7 = 0;
        if ((i2 & 1) == 0) {
            int i17 = component3 + 97;
            component1 = i17 % 128;
            int i18 = i17 % 2;
            this.totalDataRxMobile = 0L;
            int i19 = 2 % 2;
        } else {
            this.totalDataRxMobile = j;
        }
        if ((i2 & 2) == 0) {
            this.totalDataTxMobile = 0L;
        } else {
            this.totalDataTxMobile = j2;
        }
        if ((i2 & 4) == 0) {
            this.totalDataRxWifi = 0L;
        } else {
            this.totalDataRxWifi = j3;
        }
        if ((i2 & 8) == 0) {
            int i20 = component3 + 21;
            component1 = i20 % 128;
            int i21 = i20 % 2;
            this.totalDataTxWifi = 0L;
        } else {
            this.totalDataTxWifi = j4;
        }
        int i22 = 2 % 2;
        if ((i2 & 16) == 0) {
            this.totalDataRxHotspot = 0L;
        } else {
            this.totalDataRxHotspot = j5;
        }
        if ((i2 & 32) == 0) {
            int i23 = component3 + 123;
            component1 = i23 % 128;
            int i24 = i23 % 2;
        } else {
            j7 = j6;
        }
        this.totalDataTxHotspot = j7;
        if ((i2 & 64) == 0) {
            this.simSerial1 = "";
        } else {
            this.simSerial1 = str33;
        }
        if ((i2 & 128) == 0) {
            int i25 = component3 + 95;
            component1 = i25 % 128;
            int i26 = i25 % 2;
            this.simSerial2 = "";
            if (i26 == 0) {
                int i27 = 4 / 0;
            }
        } else {
            this.simSerial2 = str34;
        }
        if ((i2 & 256) == 0) {
            this.imei = null;
        } else {
            this.imei = str35;
        }
        if ((i2 & 512) == 0) {
            this.imsi = null;
        } else {
            this.imsi = str36;
        }
        if ((i2 & 1024) == 0) {
            this.airplaneMode = "";
        } else {
            this.airplaneMode = str37;
        }
        if ((i2 & 2048) == 0) {
            this.browsingExp = "";
        } else {
            this.browsingExp = str38;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03fb  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self$ConsumerBaseUi_release(com.huawei.digitalpayment.consumer.base.database.entities.mtandao.UserData r8, kotlinx.serialization.encoding.CompositeEncoder r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            Method dump skipped, instruction units count: 1055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.entities.mtandao.UserData.write$Self$ConsumerBaseUi_release(com.huawei.digitalpayment.consumer.base.database.entities.mtandao.UserData, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public UserData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, long j, long j2, long j3, long j4, long j5, long j6, String str33, String str34, String str35, String str36, String str37, String str38) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str37, "");
        this.datasessionId = str;
        this.subscriberNo = str2;
        this.dataTimestamp = str3;
        this.mtandaoType = str4;
        this.uniquedevID = str5;
        this.appVersion = str6;
        this.androidVersion = str7;
        this.devBrand = str8;
        this.devModel = str9;
        this.devManu = str10;
        this.devName = str11;
        this.devSocManuf = str12;
        this.devSocModel = str13;
        this.devBoard = str14;
        this.devFirmware = str15;
        this.devTags = str16;
        this.bType = str17;
        this.bProduct = str18;
        this.hardware = str19;
        this.bLoader = str20;
        this.buildId = str21;
        this.devBuildDisp = str22;
        this.supportedArchitec = str23;
        this.isDeviceRooted = str24;
        this.simName1 = str25;
        this.simName2 = str26;
        this.mostUsedApps = str27;
        this.lastusedapps = str28;
        this.mostUsedDataMobileRx = str29;
        this.mostUsedDataMobileTx = str30;
        this.mostUsedDataWifiRx = str31;
        this.mostUsedDataWifiTx = str32;
        this.totalDataRxMobile = j;
        this.totalDataTxMobile = j2;
        this.totalDataRxWifi = j3;
        this.totalDataTxWifi = j4;
        this.totalDataRxHotspot = j5;
        this.totalDataTxHotspot = j6;
        this.simSerial1 = str33;
        this.simSerial2 = str34;
        this.imei = str35;
        this.imsi = str36;
        this.airplaneMode = str37;
        this.browsingExp = str38;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UserData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, long j, long j2, long j3, long j4, long j5, long j6, String str33, String str34, String str35, String str36, String str37, String str38, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        int i3;
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        String str52;
        long j7;
        long j8;
        String str53;
        String str54;
        String str55;
        String str56 = (i & 1) != 0 ? "" : str;
        Object obj = null;
        String str57 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i4 = component3 + 57;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str39 = "";
        } else {
            str39 = str3;
        }
        String str58 = (i & 8) != 0 ? "" : str4;
        String str59 = (i & 16) != 0 ? "" : str5;
        String str60 = (i & 32) != 0 ? "" : str6;
        if ((i & 64) != 0) {
            int i7 = component1 + 29;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            str40 = "";
        } else {
            str40 = str7;
        }
        String str61 = (i & 128) != 0 ? "" : str8;
        if ((i & 256) != 0) {
            int i8 = component1 + 35;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str41 = "";
        } else {
            str41 = str9;
        }
        if ((i & 512) != 0) {
            int i9 = component1 + 55;
            component3 = i9 % 128;
            if (i9 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str42 = "";
        } else {
            str42 = str10;
        }
        String str62 = (i & 1024) != 0 ? "" : str11;
        String str63 = (i & 2048) != 0 ? "" : str12;
        if ((i & 4096) != 0) {
            int i10 = component3 + 115;
            str43 = "";
            component1 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 / 4;
            } else {
                int i12 = 2 % 2;
            }
            str44 = str43;
        } else {
            str43 = "";
            str44 = str13;
        }
        String str64 = (i & 8192) != 0 ? str43 : str14;
        String str65 = (i & 16384) != 0 ? str43 : str15;
        String str66 = (i & 32768) != 0 ? str43 : str16;
        String str67 = (i & 65536) != 0 ? str43 : str17;
        String str68 = (i & 131072) != 0 ? str43 : str18;
        String str69 = (i & 262144) != 0 ? str43 : str19;
        String str70 = (i & 524288) != 0 ? str43 : str20;
        String str71 = (i & 1048576) != 0 ? str43 : str21;
        String str72 = (i & 2097152) != 0 ? str43 : str22;
        String str73 = (i & 4194304) != 0 ? str43 : str23;
        String str74 = (i & 8388608) != 0 ? str43 : str24;
        String str75 = (i & 16777216) != 0 ? str43 : str25;
        String str76 = (i & 33554432) != 0 ? str43 : str26;
        if ((i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            str46 = str65;
            int i13 = component1 + 71;
            str45 = str44;
            component3 = i13 % 128;
            i3 = 2;
            if (i13 % 2 == 0) {
                int i14 = 2 % 2;
            }
            str47 = str43;
        } else {
            str45 = str44;
            str46 = str65;
            i3 = 2;
            str47 = str27;
        }
        if ((i & 134217728) != 0) {
            int i15 = i3 % i3;
            str48 = str43;
        } else {
            str48 = str28;
        }
        String str77 = (i & 268435456) != 0 ? str43 : str29;
        if ((i & 536870912) != 0) {
            str49 = str48;
            int i16 = component3 + 73;
            str50 = str47;
            component1 = i16 % 128;
            if (i16 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str51 = str43;
        } else {
            str49 = str48;
            str50 = str47;
            str51 = str30;
        }
        String str78 = (i & 1073741824) != 0 ? str43 : str31;
        String str79 = (i & Integer.MIN_VALUE) != 0 ? str43 : str32;
        if ((i2 & 1) != 0) {
            int i17 = component3 + 93;
            str52 = str79;
            component1 = i17 % 128;
            j7 = i17 % 2 == 0 ? 1L : 0L;
        } else {
            str52 = str79;
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            int i18 = component3 + 49;
            component1 = i18 % 128;
            int i19 = i18 % 2;
            j8 = 0;
        } else {
            j8 = j2;
        }
        long j9 = (i2 & 4) != 0 ? 0L : j3;
        long j10 = (i2 & 8) != 0 ? 0L : j4;
        long j11 = (i2 & 16) != 0 ? 0L : j5;
        long j12 = (i2 & 32) == 0 ? j6 : 0L;
        String str80 = (i2 & 64) != 0 ? str43 : str33;
        String str81 = (i2 & 128) != 0 ? str43 : str34;
        if ((i2 & 256) != 0) {
            int i20 = 2 % 2;
            str53 = null;
        } else {
            str53 = str35;
        }
        String str82 = str53;
        String str83 = (i2 & 512) != 0 ? null : str36;
        if ((i2 & 1024) != 0) {
            int i21 = component3 + 53;
            str54 = str80;
            component1 = i21 % 128;
            int i22 = i21 % 2;
            str55 = str43;
        } else {
            str54 = str80;
            str55 = str37;
        }
        this(str56, str57, str39, str58, str59, str60, str40, str61, str41, str42, str62, str63, str45, str64, str46, str66, str67, str68, str69, str70, str71, str72, str73, str74, str75, str76, str50, str49, str77, str51, str78, str52, j7, j8, j9, j10, j11, j12, str54, str81, str82, str83, str55, (i2 & 2048) != 0 ? str43 : str38);
    }

    public final String getDatasessionId() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.datasessionId;
        int i5 = i3 + 61;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setDatasessionId(String str) {
        int i = 2 % 2;
        int i2 = component1 + 123;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.datasessionId = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.datasessionId = str;
        int i3 = component3 + 25;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String getSubscriberNo() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.subscriberNo;
        int i5 = i3 + 81;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
        return str;
    }

    public final void setSubscriberNo(String str) {
        int i = 2 % 2;
        int i2 = component3 + 103;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.subscriberNo = str;
        if (i4 == 0) {
            int i5 = 71 / 0;
        }
        int i6 = i3 + 89;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final String getDataTimestamp() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 111;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.dataTimestamp;
            int i4 = 81 / 0;
        } else {
            str = this.dataTimestamp;
        }
        int i5 = i3 + 101;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setDataTimestamp(String str) {
        int i = 2 % 2;
        int i2 = component3 + 27;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.dataTimestamp = str;
            int i3 = 14 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.dataTimestamp = str;
        }
        int i4 = component3 + 45;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getMtandaoType() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 115;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.mtandaoType;
        int i5 = i2 + 7;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setMtandaoType(String str) {
        int i = 2 % 2;
        int i2 = component3 + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.mtandaoType = str;
        int i4 = component3 + 111;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getUniquedevID() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.uniquedevID;
        int i4 = i3 + 123;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setUniquedevID(String str) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.uniquedevID = str;
        int i4 = component3 + 73;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    public final String getAppVersion() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appVersion;
        int i5 = i2 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setAppVersion(String str) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.appVersion = str;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.appVersion = str;
        int i3 = component3 + 107;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String getAndroidVersion() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.androidVersion;
        int i5 = i3 + 33;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setAndroidVersion(String str) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.androidVersion = str;
        int i4 = component3 + 67;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String getDevBrand() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.devBrand;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return str;
    }

    public final void setDevBrand(String str) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.devBrand = str;
        int i4 = component1 + 39;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
    }

    public final String getDevModel() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.devModel;
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return str;
    }

    public final void setDevModel(String str) {
        int i = 2 % 2;
        int i2 = component1 + 5;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.devModel = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.devModel = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String getDevManu() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 67;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.devManu;
        int i5 = i2 + 81;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setDevManu(String str) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.devManu = str;
            int i3 = 4 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.devManu = str;
        }
        int i4 = component3 + 101;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getDevName() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.devName;
            int i4 = 53 / 0;
        } else {
            str = this.devName;
        }
        int i5 = i3 + 85;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setDevName(String str) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.devName = str;
        int i4 = component3 + 95;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getDevSocManuf() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.devSocManuf;
            int i4 = 8 / 0;
        } else {
            str = this.devSocManuf;
        }
        int i5 = i2 + 75;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDevSocManuf(String str) {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.devSocManuf = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.devSocManuf = str;
        int i3 = component3 + 41;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 25 / 0;
        }
    }

    public final String getDevSocModel() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.devSocModel;
        int i5 = i3 + 119;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDevSocModel(String str) {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.devSocModel = str;
        int i4 = component1 + 103;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    public final String getDevBoard() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.devBoard;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDevBoard(String str) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.devBoard = str;
        int i4 = component1 + 85;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
    }

    public final String getDevFirmware() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.devFirmware;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDevFirmware(String str) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.devFirmware = str;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.devFirmware = str;
        int i3 = component1 + 77;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String getDevTags() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.devTags;
        int i5 = i2 + 47;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setDevTags(String str) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.devTags = str;
        int i4 = component1 + 13;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBType() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.bType;
        int i5 = i3 + 15;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return str;
    }

    public final void setBType(String str) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.bType = str;
        int i4 = component1 + 95;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getBProduct() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bProduct;
        int i5 = i2 + 27;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setBProduct(String str) {
        int i = 2 % 2;
        int i2 = component1 + 97;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.bProduct = str;
            int i3 = 23 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.bProduct = str;
        }
        int i4 = component1 + 61;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getHardware() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.hardware;
        int i5 = i3 + 57;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setHardware(String str) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.hardware = str;
        int i4 = component3 + 1;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String getBLoader() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bLoader;
        int i5 = i2 + 115;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setBLoader(String str) {
        int i = 2 % 2;
        int i2 = component1 + 65;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.bLoader = str;
            int i3 = 44 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.bLoader = str;
        }
        int i4 = component1 + 95;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBuildId() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.buildId;
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        return str;
    }

    public final void setBuildId(String str) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.buildId = str;
        int i4 = component1 + 109;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
    }

    public final String getDevBuildDisp() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.devBuildDisp;
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return str;
    }

    public final void setDevBuildDisp(String str) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.devBuildDisp = str;
        int i4 = component1 + 33;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSupportedArchitec() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.supportedArchitec;
        int i5 = i3 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setSupportedArchitec(String str) {
        int i = 2 % 2;
        int i2 = component3 + 5;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.supportedArchitec = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.supportedArchitec = str;
        int i3 = component1 + 41;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String isDeviceRooted() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 81;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.isDeviceRooted;
        int i5 = i2 + 37;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setDeviceRooted(String str) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.isDeviceRooted = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.isDeviceRooted = str;
        int i3 = component1 + 111;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String getSimName1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 43;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.simName1;
        int i5 = i2 + 69;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setSimName1(String str) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.simName1 = str;
        int i4 = component3 + 91;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getSimName2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 83;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.simName2;
        int i5 = i2 + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setSimName2(String str) {
        int i = 2 % 2;
        int i2 = component1 + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.simName2 = str;
        int i4 = component3 + 87;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getMostUsedApps() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 107;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.mostUsedApps;
        int i5 = i2 + 79;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setMostUsedApps(String str) {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.mostUsedApps = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.mostUsedApps = str;
        int i3 = component3 + 51;
        component1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getLastusedapps() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lastusedapps;
        int i5 = i2 + 49;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setLastusedapps(String str) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.lastusedapps = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.lastusedapps = str;
        int i3 = component3 + 29;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 27 / 0;
        }
    }

    public final String getMostUsedDataMobileRx() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.mostUsedDataMobileRx;
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return str;
    }

    public final void setMostUsedDataMobileRx(String str) {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.mostUsedDataMobileRx = str;
        int i4 = component1 + 49;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getMostUsedDataMobileTx() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.mostUsedDataMobileTx;
            int i4 = 82 / 0;
        } else {
            str = this.mostUsedDataMobileTx;
        }
        int i5 = i3 + 79;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setMostUsedDataMobileTx(String str) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.mostUsedDataMobileTx = str;
        int i4 = component1 + 41;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMostUsedDataWifiRx() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.mostUsedDataWifiRx;
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return str;
    }

    public final void setMostUsedDataWifiRx(String str) {
        int i = 2 % 2;
        int i2 = component3 + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.mostUsedDataWifiRx = str;
        int i4 = component1 + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getMostUsedDataWifiTx() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.mostUsedDataWifiTx;
        }
        int i3 = 2 / 0;
        return this.mostUsedDataWifiTx;
    }

    public final void setMostUsedDataWifiTx(String str) {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.mostUsedDataWifiTx = str;
        int i4 = component3 + 71;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final long getTotalDataRxMobile() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.totalDataRxMobile;
        }
        int i3 = 20 / 0;
        return this.totalDataRxMobile;
    }

    public final void setTotalDataRxMobile(long j) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.totalDataRxMobile = j;
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
    }

    public final long getTotalDataTxMobile() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        long j = this.totalDataTxMobile;
        int i5 = i3 + 117;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return j;
    }

    public final void setTotalDataTxMobile(long j) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 43;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.totalDataTxMobile = j;
        int i5 = i2 + 41;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final long getTotalDataRxWifi() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.totalDataRxWifi;
        }
        int i3 = 15 / 0;
        return this.totalDataRxWifi;
    }

    public final void setTotalDataRxWifi(long j) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 43;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.totalDataRxWifi = j;
        int i5 = i2 + 113;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long getTotalDataTxWifi() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 41;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        long j = this.totalDataTxWifi;
        int i5 = i2 + 9;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final void setTotalDataTxWifi(long j) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.totalDataTxWifi = j;
        int i5 = i3 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final long getTotalDataRxHotspot() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.totalDataRxHotspot;
        }
        throw null;
    }

    public final void setTotalDataRxHotspot(long j) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 43;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.totalDataRxHotspot = j;
        if (i4 != 0) {
            int i5 = 56 / 0;
        }
        int i6 = i2 + 81;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final long getTotalDataTxHotspot() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 103;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        long j = this.totalDataTxHotspot;
        int i5 = i2 + 7;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final void setTotalDataTxHotspot(long j) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.totalDataTxHotspot = j;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 53;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getSimSerial1() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.simSerial1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSimSerial1(String str) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.simSerial1 = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.simSerial1 = str;
        int i3 = component3 + 7;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String getSimSerial2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 75;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.simSerial2;
        int i5 = i2 + 71;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSimSerial2(String str) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.simSerial2 = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.simSerial2 = str;
            throw null;
        }
    }

    public final String getImei() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 33;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.imei;
            int i4 = 61 / 0;
        } else {
            str = this.imei;
        }
        int i5 = i3 + 37;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setImei(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.imei = str;
        int i5 = i2 + 35;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getImsi() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 15;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.imsi;
            int i4 = 97 / 0;
        } else {
            str = this.imsi;
        }
        int i5 = i3 + 99;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    public final void setImsi(String str) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.imsi = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 113;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String getAirplaneMode() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.airplaneMode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAirplaneMode(String str) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.airplaneMode = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.airplaneMode = str;
        int i3 = component1 + 101;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 1 / 0;
        }
    }

    public final String getBrowsingExp() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.browsingExp;
        }
        throw null;
    }

    public final void setBrowsingExp(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 81;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.browsingExp = str;
        if (i4 != 0) {
            int i5 = 90 / 0;
        }
        int i6 = i2 + 65;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    static {
        int i = ShareDataUIState + 45;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public UserData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 4095, (DefaultConstructorMarker) null);
    }

    public static UserData copy$default(UserData userData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, long j, long j2, long j3, long j4, long j5, long j6, String str33, String str34, String str35, String str36, String str37, String str38, int i, int i2, Object obj) {
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        String str55;
        long j7;
        String str56;
        int i3 = 2 % 2;
        if ((i & 1) != 0) {
            int i4 = component3 + 15;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            str39 = userData.datasessionId;
        } else {
            str39 = str;
        }
        String str57 = (i & 2) != 0 ? userData.subscriberNo : str2;
        String str58 = (i & 4) != 0 ? userData.dataTimestamp : str3;
        String str59 = (i & 8) != 0 ? userData.mtandaoType : str4;
        String str60 = (i & 16) != 0 ? userData.uniquedevID : str5;
        if ((i & 32) != 0) {
            int i6 = component3 + 101;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str40 = userData.appVersion;
        } else {
            str40 = str6;
        }
        String str61 = (i & 64) != 0 ? userData.androidVersion : str7;
        String str62 = (i & 128) != 0 ? userData.devBrand : str8;
        String str63 = (i & 256) != 0 ? userData.devModel : str9;
        if ((i & 512) != 0) {
            int i8 = component3 + 15;
            component1 = i8 % 128;
            if (i8 % 2 == 0) {
                String str64 = userData.devManu;
                throw null;
            }
            str41 = userData.devManu;
        } else {
            str41 = str10;
        }
        String str65 = (i & 1024) != 0 ? userData.devName : str11;
        if ((i & 2048) != 0) {
            int i9 = component3 + 67;
            str42 = str65;
            component1 = i9 % 128;
            if (i9 % 2 == 0) {
                String str66 = userData.devSocManuf;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str43 = userData.devSocManuf;
        } else {
            str42 = str65;
            str43 = str12;
        }
        String str67 = (i & 4096) != 0 ? userData.devSocModel : str13;
        if ((i & 8192) != 0) {
            int i10 = component3 + 49;
            str44 = str67;
            component1 = i10 % 128;
            if (i10 % 2 == 0) {
                String str68 = userData.devBoard;
                throw null;
            }
            str45 = userData.devBoard;
        } else {
            str44 = str67;
            str45 = str14;
        }
        String str69 = (i & 16384) != 0 ? userData.devFirmware : str15;
        if ((i & 32768) != 0) {
            str47 = str69;
            int i11 = component1 + 125;
            str46 = str45;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            str48 = userData.devTags;
            if (i12 != 0) {
                int i13 = 49 / 0;
            }
        } else {
            str46 = str45;
            str47 = str69;
            str48 = str16;
        }
        String str70 = (65536 & i) != 0 ? userData.bType : str17;
        String str71 = (i & 131072) != 0 ? userData.bProduct : str18;
        String str72 = (i & 262144) != 0 ? userData.hardware : str19;
        String str73 = (i & 524288) != 0 ? userData.bLoader : str20;
        String str74 = (i & 1048576) != 0 ? userData.buildId : str21;
        String str75 = (i & 2097152) != 0 ? userData.devBuildDisp : str22;
        String str76 = (i & 4194304) != 0 ? userData.supportedArchitec : str23;
        String str77 = (i & 8388608) != 0 ? userData.isDeviceRooted : str24;
        String str78 = (i & 16777216) != 0 ? userData.simName1 : str25;
        String str79 = (i & 33554432) != 0 ? userData.simName2 : str26;
        String str80 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? userData.mostUsedApps : str27;
        if ((i & 134217728) != 0) {
            str50 = str80;
            String str81 = userData.lastusedapps;
            int i14 = component1 + 39;
            str49 = str48;
            component3 = i14 % 128;
            int i15 = i14 % 2;
            str51 = str81;
        } else {
            str49 = str48;
            str50 = str80;
            str51 = str28;
        }
        if ((268435456 & i) != 0) {
            int i16 = component1 + 125;
            str52 = str51;
            component3 = i16 % 128;
            int i17 = i16 % 2;
            str53 = userData.mostUsedDataMobileRx;
            if (i17 != 0) {
                int i18 = 56 / 0;
            }
        } else {
            str52 = str51;
            str53 = str29;
        }
        if ((536870912 & i) != 0) {
            int i19 = component3 + 21;
            str54 = str53;
            component1 = i19 % 128;
            if (i19 % 2 == 0) {
                String str82 = userData.mostUsedDataMobileTx;
                throw null;
            }
            str55 = userData.mostUsedDataMobileTx;
        } else {
            str54 = str53;
            str55 = str30;
        }
        String str83 = (1073741824 & i) != 0 ? userData.mostUsedDataWifiRx : str31;
        String str84 = (i & Integer.MIN_VALUE) != 0 ? userData.mostUsedDataWifiTx : str32;
        String str85 = str43;
        String str86 = str83;
        long j8 = (i2 & 1) != 0 ? userData.totalDataRxMobile : j;
        long j9 = (i2 & 2) != 0 ? userData.totalDataTxMobile : j2;
        long j10 = (i2 & 4) != 0 ? userData.totalDataRxWifi : j3;
        long j11 = (i2 & 8) != 0 ? userData.totalDataTxWifi : j4;
        long j12 = (i2 & 16) != 0 ? userData.totalDataRxHotspot : j5;
        long j13 = (i2 & 32) != 0 ? userData.totalDataTxHotspot : j6;
        if ((i2 & 64) != 0) {
            j7 = j13;
            int i20 = component3 + 43;
            component1 = i20 % 128;
            int i21 = i20 % 2;
            str56 = userData.simSerial1;
        } else {
            j7 = j13;
            str56 = str33;
        }
        return userData.copy(str39, str57, str58, str59, str60, str40, str61, str62, str63, str41, str42, str85, str44, str46, str47, str49, str70, str71, str72, str73, str74, str75, str76, str77, str78, str79, str50, str52, str54, str55, str86, str84, j8, j9, j10, j11, j12, j7, str56, (i2 & 128) != 0 ? userData.simSerial2 : str34, (i2 & 256) != 0 ? userData.imei : str35, (i2 & 512) != 0 ? userData.imsi : str36, (i2 & 1024) != 0 ? userData.airplaneMode : str37, (i2 & 2048) != 0 ? userData.browsingExp : str38);
    }

    @SerialName("airplanemode")
    public static void getAirplaneMode$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @SerialName("androidversion")
    public static void getAndroidVersion$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 56 / 0;
        }
    }

    @SerialName("appversion")
    public static void getAppVersion$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
    }

    @SerialName("bloader")
    public static void getBLoader$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("bproduct")
    public static void getBProduct$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @SerialName("btype")
    public static void getBType$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
    }

    @SerialName("browsingexp")
    public static void getBrowsingExp$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("buildid")
    public static void getBuildId$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @SerialName("datatimestamp")
    public static void getDataTimestamp$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @SerialName("datasessionid")
    public static void getDatasessionId$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @SerialName("devboard")
    public static void getDevBoard$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("devbrand")
    public static void getDevBrand$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
        }
    }

    @SerialName("devbuilddisp")
    public static void getDevBuildDisp$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
    }

    @SerialName("devfirmware")
    public static void getDevFirmware$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("devmanu")
    public static void getDevManu$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @SerialName("devmodel")
    public static void getDevModel$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("devname")
    public static void getDevName$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
    }

    @SerialName("devsocmanuf")
    public static void getDevSocManuf$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @SerialName("devsocmodel")
    public static void getDevSocModel$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("devtags")
    public static void getDevTags$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("hardware")
    public static void getHardware$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @SerialName("imei")
    public static void getImei$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @SerialName("imsi")
    public static void getImsi$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 21;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @SerialName("lastusedapps")
    public static void getLastusedapps$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @SerialName("mostusedapps")
    public static void getMostUsedApps$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @SerialName("mostuseddatamobilerx")
    public static void getMostUsedDataMobileRx$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("mostuseddatamobiletx")
    public static void getMostUsedDataMobileTx$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @SerialName("mostuseddatawifirx")
    public static void getMostUsedDataWifiRx$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @SerialName("mostuseddatawifitx")
    public static void getMostUsedDataWifiTx$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("mtandaotype")
    public static void getMtandaoType$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
    }

    @SerialName("simname1")
    public static void getSimName1$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
        }
    }

    @SerialName("simname2")
    public static void getSimName2$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 66 / 0;
        }
    }

    @SerialName("simserial1")
    public static void getSimSerial1$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
        }
    }

    @SerialName("simserial2")
    public static void getSimSerial2$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("subscriberno")
    public static void getSubscriberNo$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("supportedarchitec")
    public static void getSupportedArchitec$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("totaldatarxhotspot")
    public static void getTotalDataRxHotspot$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @SerialName("totaldatarxmobile")
    public static void getTotalDataRxMobile$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @SerialName("totaldatarxwifi")
    public static void getTotalDataRxWifi$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @SerialName("totaldatatxhotspot")
    public static void getTotalDataTxHotspot$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("totaldatatxmobile")
    public static void getTotalDataTxMobile$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("totaldatatxwifi")
    public static void getTotalDataTxWifi$annotations() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("uniquedevid")
    public static void getUniquedevID$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @SerialName("isdevicerooted")
    public static void isDeviceRooted$annotations() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.datasessionId;
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.devManu;
        int i5 = i2 + 3;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 103;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.devName;
        int i5 = i2 + 105;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 35;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.devSocManuf;
        int i4 = i2 + 67;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.devSocModel;
        int i5 = i2 + 53;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.devBoard;
        int i5 = i2 + 67;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.devFirmware;
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.devTags;
        int i5 = i3 + 65;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.bType;
        int i4 = i3 + 29;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return str;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 87;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bProduct;
        int i5 = i2 + 107;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component19() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.hardware;
        int i5 = i3 + 103;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 35;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.subscriberNo;
            int i4 = 59 / 0;
        } else {
            str = this.subscriberNo;
        }
        int i5 = i2 + 85;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component20() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.bLoader;
        }
        throw null;
    }

    public final String component21() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.buildId;
        int i5 = i2 + 71;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component22() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.devBuildDisp;
        int i5 = i2 + 87;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component23() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.supportedArchitec;
        int i5 = i2 + 35;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component24() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 29;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.isDeviceRooted;
        int i5 = i2 + 5;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component25() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.simName1;
        }
        throw null;
    }

    public final String component26() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.simName2;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return str;
    }

    public final String component27() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 13;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.mostUsedApps;
        int i4 = i2 + 73;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component28() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.lastusedapps;
        int i5 = i3 + 23;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return str;
    }

    public final String component29() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.mostUsedDataMobileRx;
        int i5 = i3 + 47;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.dataTimestamp;
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return str;
    }

    public final String component30() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 59;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.mostUsedDataMobileTx;
        int i5 = i2 + 41;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component31() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.mostUsedDataWifiRx;
        int i4 = i3 + 89;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component32() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.mostUsedDataWifiTx;
        }
        throw null;
    }

    public final long component33() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.totalDataRxMobile;
        }
        int i3 = 18 / 0;
        return this.totalDataRxMobile;
    }

    public final long component34() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        long j = this.totalDataTxMobile;
        int i5 = i3 + 61;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long component35() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        long j = this.totalDataRxWifi;
        int i5 = i2 + 105;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long component36() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        long j = this.totalDataTxWifi;
        int i5 = i3 + 15;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long component37() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        long j = this.totalDataRxHotspot;
        int i5 = i3 + 31;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long component38() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 41;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        long j = this.totalDataTxHotspot;
        int i5 = i2 + 23;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final String component39() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 37;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.simSerial1;
            int i4 = 10 / 0;
        } else {
            str = this.simSerial1;
        }
        int i5 = i3 + 71;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.mtandaoType;
        int i4 = i3 + 43;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return str;
    }

    public final String component40() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.simSerial2;
        int i4 = i3 + 49;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component41() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.imei;
        int i5 = i3 + 33;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component42() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.imsi;
        int i5 = i3 + 11;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component43() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.airplaneMode;
        int i5 = i3 + 31;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component44() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.browsingExp;
        int i5 = i3 + 15;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.uniquedevID;
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 37;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appVersion;
        int i5 = i2 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 115;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.androidVersion;
        int i5 = i2 + 115;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 51;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.devBrand;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.devModel;
        int i5 = i2 + 47;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return str;
    }

    public final UserData copy(String datasessionId, String subscriberNo, String dataTimestamp, String mtandaoType, String uniquedevID, String appVersion, String androidVersion, String devBrand, String devModel, String devManu, String devName, String devSocManuf, String devSocModel, String devBoard, String devFirmware, String devTags, String bType, String bProduct, String hardware, String bLoader, String buildId, String devBuildDisp, String supportedArchitec, String isDeviceRooted, String simName1, String simName2, String mostUsedApps, String lastusedapps, String mostUsedDataMobileRx, String mostUsedDataMobileTx, String mostUsedDataWifiRx, String mostUsedDataWifiTx, long totalDataRxMobile, long totalDataTxMobile, long totalDataRxWifi, long totalDataTxWifi, long totalDataRxHotspot, long totalDataTxHotspot, String simSerial1, String simSerial2, String imei, String imsi, String airplaneMode, String browsingExp) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(datasessionId, "");
        Intrinsics.checkNotNullParameter(dataTimestamp, "");
        Intrinsics.checkNotNullParameter(mtandaoType, "");
        Intrinsics.checkNotNullParameter(uniquedevID, "");
        Intrinsics.checkNotNullParameter(appVersion, "");
        Intrinsics.checkNotNullParameter(androidVersion, "");
        Intrinsics.checkNotNullParameter(devBrand, "");
        Intrinsics.checkNotNullParameter(devModel, "");
        Intrinsics.checkNotNullParameter(devManu, "");
        Intrinsics.checkNotNullParameter(devName, "");
        Intrinsics.checkNotNullParameter(devSocManuf, "");
        Intrinsics.checkNotNullParameter(devSocModel, "");
        Intrinsics.checkNotNullParameter(devBoard, "");
        Intrinsics.checkNotNullParameter(devFirmware, "");
        Intrinsics.checkNotNullParameter(devTags, "");
        Intrinsics.checkNotNullParameter(bType, "");
        Intrinsics.checkNotNullParameter(bProduct, "");
        Intrinsics.checkNotNullParameter(hardware, "");
        Intrinsics.checkNotNullParameter(bLoader, "");
        Intrinsics.checkNotNullParameter(buildId, "");
        Intrinsics.checkNotNullParameter(devBuildDisp, "");
        Intrinsics.checkNotNullParameter(supportedArchitec, "");
        Intrinsics.checkNotNullParameter(isDeviceRooted, "");
        Intrinsics.checkNotNullParameter(simName1, "");
        Intrinsics.checkNotNullParameter(simName2, "");
        Intrinsics.checkNotNullParameter(mostUsedApps, "");
        Intrinsics.checkNotNullParameter(lastusedapps, "");
        Intrinsics.checkNotNullParameter(mostUsedDataMobileRx, "");
        Intrinsics.checkNotNullParameter(mostUsedDataMobileTx, "");
        Intrinsics.checkNotNullParameter(mostUsedDataWifiRx, "");
        Intrinsics.checkNotNullParameter(mostUsedDataWifiTx, "");
        Intrinsics.checkNotNullParameter(simSerial1, "");
        Intrinsics.checkNotNullParameter(simSerial2, "");
        Intrinsics.checkNotNullParameter(airplaneMode, "");
        UserData userData = new UserData(datasessionId, subscriberNo, dataTimestamp, mtandaoType, uniquedevID, appVersion, androidVersion, devBrand, devModel, devManu, devName, devSocManuf, devSocModel, devBoard, devFirmware, devTags, bType, bProduct, hardware, bLoader, buildId, devBuildDisp, supportedArchitec, isDeviceRooted, simName1, simName2, mostUsedApps, lastusedapps, mostUsedDataMobileRx, mostUsedDataMobileTx, mostUsedDataWifiRx, mostUsedDataWifiTx, totalDataRxMobile, totalDataTxMobile, totalDataRxWifi, totalDataTxWifi, totalDataRxHotspot, totalDataTxHotspot, simSerial1, simSerial2, imei, imsi, airplaneMode, browsingExp);
        int i2 = component3 + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return userData;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 81;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserData)) {
            return false;
        }
        UserData userData = (UserData) other;
        if (!Intrinsics.areEqual(this.datasessionId, userData.datasessionId)) {
            int i2 = component3 + 23;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.subscriberNo, userData.subscriberNo) || !Intrinsics.areEqual(this.dataTimestamp, userData.dataTimestamp) || (!Intrinsics.areEqual(this.mtandaoType, userData.mtandaoType)) || !Intrinsics.areEqual(this.uniquedevID, userData.uniquedevID) || !Intrinsics.areEqual(this.appVersion, userData.appVersion) || !Intrinsics.areEqual(this.androidVersion, userData.androidVersion) || !Intrinsics.areEqual(this.devBrand, userData.devBrand)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.devModel, userData.devModel)) {
            int i4 = component3 + 65;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.devManu, userData.devManu) || !Intrinsics.areEqual(this.devName, userData.devName) || !Intrinsics.areEqual(this.devSocManuf, userData.devSocManuf) || !Intrinsics.areEqual(this.devSocModel, userData.devSocModel) || !Intrinsics.areEqual(this.devBoard, userData.devBoard)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.devFirmware, userData.devFirmware)) {
            int i6 = component1 + 93;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.devTags, userData.devTags)) {
            int i8 = component3 + 113;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.bType, userData.bType)) {
            int i10 = component3 + 89;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.bProduct, userData.bProduct) || !Intrinsics.areEqual(this.hardware, userData.hardware) || !Intrinsics.areEqual(this.bLoader, userData.bLoader) || !Intrinsics.areEqual(this.buildId, userData.buildId) || !Intrinsics.areEqual(this.devBuildDisp, userData.devBuildDisp) || !Intrinsics.areEqual(this.supportedArchitec, userData.supportedArchitec)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.isDeviceRooted, userData.isDeviceRooted)) {
            int i12 = component1 + 119;
            component3 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.simName1, userData.simName1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.simName2, userData.simName2)) {
            int i14 = component3 + 7;
            component1 = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.mostUsedApps, userData.mostUsedApps) || !Intrinsics.areEqual(this.lastusedapps, userData.lastusedapps) || !Intrinsics.areEqual(this.mostUsedDataMobileRx, userData.mostUsedDataMobileRx) || !Intrinsics.areEqual(this.mostUsedDataMobileTx, userData.mostUsedDataMobileTx) || !Intrinsics.areEqual(this.mostUsedDataWifiRx, userData.mostUsedDataWifiRx) || !Intrinsics.areEqual(this.mostUsedDataWifiTx, userData.mostUsedDataWifiTx) || this.totalDataRxMobile != userData.totalDataRxMobile || this.totalDataTxMobile != userData.totalDataTxMobile || this.totalDataRxWifi != userData.totalDataRxWifi) {
            return false;
        }
        if (this.totalDataTxWifi != userData.totalDataTxWifi) {
            int i16 = component1 + 111;
            component3 = i16 % 128;
            return i16 % 2 != 0;
        }
        if (this.totalDataRxHotspot != userData.totalDataRxHotspot) {
            return false;
        }
        if (this.totalDataTxHotspot != userData.totalDataTxHotspot) {
            int i17 = component1 + 21;
            component3 = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.simSerial1, userData.simSerial1)) {
            return false;
        }
        if (Intrinsics.areEqual(this.simSerial2, userData.simSerial2)) {
            return Intrinsics.areEqual(this.imei, userData.imei) && Intrinsics.areEqual(this.imsi, userData.imsi) && Intrinsics.areEqual(this.airplaneMode, userData.airplaneMode) && Intrinsics.areEqual(this.browsingExp, userData.browsingExp);
        }
        int i19 = component3 + 107;
        component1 = i19 % 128;
        int i20 = i19 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[PHI: r2 r4
  0x0027: PHI (r2v94 int) = (r2v5 int), (r2v96 int) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0027: PHI (r4v3 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r2
  0x0025: PHI (r2v6 int) = (r2v5 int), (r2v96 int) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.entities.mtandao.UserData.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UserData(datasessionId=" + this.datasessionId + ", subscriberNo=" + this.subscriberNo + ", dataTimestamp=" + this.dataTimestamp + ", mtandaoType=" + this.mtandaoType + ", uniquedevID=" + this.uniquedevID + ", appVersion=" + this.appVersion + ", androidVersion=" + this.androidVersion + ", devBrand=" + this.devBrand + ", devModel=" + this.devModel + ", devManu=" + this.devManu + ", devName=" + this.devName + ", devSocManuf=" + this.devSocManuf + ", devSocModel=" + this.devSocModel + ", devBoard=" + this.devBoard + ", devFirmware=" + this.devFirmware + ", devTags=" + this.devTags + ", bType=" + this.bType + ", bProduct=" + this.bProduct + ", hardware=" + this.hardware + ", bLoader=" + this.bLoader + ", buildId=" + this.buildId + ", devBuildDisp=" + this.devBuildDisp + ", supportedArchitec=" + this.supportedArchitec + ", isDeviceRooted=" + this.isDeviceRooted + ", simName1=" + this.simName1 + ", simName2=" + this.simName2 + ", mostUsedApps=" + this.mostUsedApps + ", lastusedapps=" + this.lastusedapps + ", mostUsedDataMobileRx=" + this.mostUsedDataMobileRx + ", mostUsedDataMobileTx=" + this.mostUsedDataMobileTx + ", mostUsedDataWifiRx=" + this.mostUsedDataWifiRx + ", mostUsedDataWifiTx=" + this.mostUsedDataWifiTx + ", totalDataRxMobile=" + this.totalDataRxMobile + ", totalDataTxMobile=" + this.totalDataTxMobile + ", totalDataRxWifi=" + this.totalDataRxWifi + ", totalDataTxWifi=" + this.totalDataTxWifi + ", totalDataRxHotspot=" + this.totalDataRxHotspot + ", totalDataTxHotspot=" + this.totalDataTxHotspot + ", simSerial1=" + this.simSerial1 + ", simSerial2=" + this.simSerial2 + ", imei=" + this.imei + ", imsi=" + this.imsi + ", airplaneMode=" + this.airplaneMode + ", browsingExp=" + this.browsingExp + ")";
        int i2 = component3 + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.datasessionId);
        dest.writeString(this.subscriberNo);
        dest.writeString(this.dataTimestamp);
        dest.writeString(this.mtandaoType);
        dest.writeString(this.uniquedevID);
        dest.writeString(this.appVersion);
        dest.writeString(this.androidVersion);
        dest.writeString(this.devBrand);
        dest.writeString(this.devModel);
        dest.writeString(this.devManu);
        dest.writeString(this.devName);
        dest.writeString(this.devSocManuf);
        dest.writeString(this.devSocModel);
        dest.writeString(this.devBoard);
        dest.writeString(this.devFirmware);
        dest.writeString(this.devTags);
        dest.writeString(this.bType);
        dest.writeString(this.bProduct);
        dest.writeString(this.hardware);
        dest.writeString(this.bLoader);
        dest.writeString(this.buildId);
        dest.writeString(this.devBuildDisp);
        dest.writeString(this.supportedArchitec);
        dest.writeString(this.isDeviceRooted);
        dest.writeString(this.simName1);
        dest.writeString(this.simName2);
        dest.writeString(this.mostUsedApps);
        dest.writeString(this.lastusedapps);
        dest.writeString(this.mostUsedDataMobileRx);
        dest.writeString(this.mostUsedDataMobileTx);
        dest.writeString(this.mostUsedDataWifiRx);
        dest.writeString(this.mostUsedDataWifiTx);
        dest.writeLong(this.totalDataRxMobile);
        dest.writeLong(this.totalDataTxMobile);
        dest.writeLong(this.totalDataRxWifi);
        dest.writeLong(this.totalDataTxWifi);
        dest.writeLong(this.totalDataRxHotspot);
        dest.writeLong(this.totalDataTxHotspot);
        dest.writeString(this.simSerial1);
        dest.writeString(this.simSerial2);
        dest.writeString(this.imei);
        dest.writeString(this.imsi);
        dest.writeString(this.airplaneMode);
        dest.writeString(this.browsingExp);
        int i4 = component3 + 79;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
    }
}
