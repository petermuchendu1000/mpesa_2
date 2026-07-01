package com.huawei.digitalpayment.home.theme.data.local;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.WindowInfoFieldGroup;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.griver.ui.ant.api.AUAttrsConstant;
import com.huawei.digitalpayment.common.theme.constants.ThemeConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.http.BaseResp;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u009f\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B÷\u0005\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010-\u001a\u00020\u0004\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010C\u001a\u00020\u001a\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bK\u0010LJ\u000b\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0004H\u0016J\u000b\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0004H\u0016J\t\u0010\u009a\u0001\u001a\u00020\u0007H\u0016J\t\u0010\u009b\u0001\u001a\u00020\u0007H\u0016J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010 \u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010¡\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010¢\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010£\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010¤\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0010\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000fHÆ\u0003J\u0011\u0010¦\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010§\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0007HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u001aHÆ\u0003J\u0011\u0010°\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\n\u0010±\u0001\u001a\u00020\u001aHÆ\u0003J\u0010\u0010²\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000fHÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010µ\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010¶\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010·\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010¸\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010»\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010¼\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010¾\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010À\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\n\u0010Á\u0001\u001a\u00020\u0004HÆ\u0003J\u0011\u0010Â\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010Ã\u0001\u001a\u0004\u0018\u000100HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\u0011\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010È\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010É\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010Ë\u0001\u001a\u0004\u0018\u000102HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010Í\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010Î\u0001\u001a\u0004\u0018\u00010=HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010?HÆ\u0003J\u0011\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010Ò\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\n\u0010Ó\u0001\u001a\u00020\u001aHÆ\u0003J\u0011\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010×\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0080\u0006\u0010Û\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010-\u001a\u00020\u00042\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00109\u001a\u0004\u0018\u0001022\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010C\u001a\u00020\u001a2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0003\u0010Ü\u0001J\u0016\u0010Ý\u0001\u001a\u00020\u001a2\n\u0010Þ\u0001\u001a\u0005\u0018\u00010ß\u0001HÖ\u0003J\n\u0010à\u0001\u001a\u00020\u0007HÖ\u0001J\n\u0010á\u0001\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010NR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bP\u0010QR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010NR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bT\u0010QR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bU\u0010QR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bV\u0010QR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bW\u0010QR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bX\u0010QR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\b[\u0010QR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\b\\\u0010QR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010NR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010NR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010NR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010NR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010NR\u0011\u0010\u0017\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bd\u0010cR\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bg\u0010QR\u0011\u0010\u001c\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010fR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010Z\"\u0004\bi\u0010jR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010NR\u0013\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010NR\u0015\u0010!\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bm\u0010QR\u0015\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bn\u0010QR\u0015\u0010#\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bo\u0010QR\u0015\u0010$\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bp\u0010QR\u0013\u0010%\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010NR\u0013\u0010&\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010NR\u0015\u0010'\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bs\u0010QR\u0015\u0010(\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bt\u0010QR\u0013\u0010)\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010NR\u0015\u0010*\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bv\u0010QR\u0013\u0010+\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010NR\u0015\u0010,\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bx\u0010QR\u0011\u0010-\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010NR\u0015\u0010.\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010R\u001a\u0004\bz\u0010QR\u0013\u0010/\u001a\u0004\u0018\u000100¢\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0013\u00101\u001a\u0004\u0018\u000102¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0013\u00103\u001a\u0004\u0018\u000102¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010~R\u0016\u00104\u001a\u0004\u0018\u00010\u0007¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u0080\u0001\u0010QR\u0016\u00105\u001a\u0004\u0018\u00010\u0007¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u0081\u0001\u0010QR\u0016\u00106\u001a\u0004\u0018\u00010\u0007¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u0082\u0001\u0010QR\u0016\u00107\u001a\u0004\u0018\u00010\u0007¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u0083\u0001\u0010QR\u0016\u00108\u001a\u0004\u0018\u00010\u0007¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u0084\u0001\u0010QR\u0014\u00109\u001a\u0004\u0018\u000102¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010~R\u0014\u0010:\u001a\u0004\u0018\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010NR\u0016\u0010;\u001a\u0004\u0018\u00010\u0007¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u0087\u0001\u0010QR\u0015\u0010<\u001a\u0004\u0018\u00010=¢\u0006\n\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0015\u0010>\u001a\u0004\u0018\u00010?¢\u0006\n\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010@\u001a\u0004\u0018\u00010\u0007¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u008c\u0001\u0010QR\u0016\u0010A\u001a\u0004\u0018\u00010\u0007¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u008d\u0001\u0010QR\u0016\u0010B\u001a\u0004\u0018\u00010\u0007¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u008e\u0001\u0010QR\u0012\u0010C\u001a\u00020\u001a¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010fR\u0016\u0010D\u001a\u0004\u0018\u00010\u0007¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u0090\u0001\u0010QR\u0016\u0010E\u001a\u0004\u0018\u00010\u0007¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u0091\u0001\u0010QR\u0016\u0010F\u001a\u0004\u0018\u00010\u0007¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u0092\u0001\u0010QR\u0016\u0010G\u001a\u0004\u0018\u00010\u0007¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u0093\u0001\u0010QR\u0016\u0010H\u001a\u0004\u0018\u00010\u0007¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u0094\u0001\u0010QR\u0015\u0010I\u001a\u0004\u0018\u00010\u0000¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0014\u0010J\u001a\u0004\u0018\u00010\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010N¨\u0006â\u0001"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/local/LocalComponent;", "Lcom/huawei/digitalpayment/home/theme/data/local/NavigationConfig;", "Lcom/huawei/http/BaseResp;", "componentType", "", "template", "backgroundColor", "", "backgroundUrl", "roundCorner", "marginTop", "marginBottom", "marginStart", "marginEnd", "components", "", "width", "height", "indicatorStyle", "indicatorPosition", "pageIcon", "pageName", "pageIconActive", CdpConstants.CONTENT_TEXT_COLOR, "selectTextColor", "enableRefresh", "", "refreshBackgroundColor", "isLightIcon", "functions", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "title", "subTitle", RVParams.AROME_SUB_TITLE_COLOR, "itemBackgroundColor", "itemRoundCorner", "maxCount", "subTitleExecute", "style", "strokeWidth", "strokeColor", "text", AUAttrsConstant.TV_TEXTSIZE, "textGravity", WindowInfoFieldGroup.FIELD_STATUS_BAR_HEIGHT, KeysConstants.KEY_EXECUTE, "type", ThemeConstants.INDICA_POSITION_CENTER, "Lcom/huawei/digitalpayment/home/theme/data/local/SearchCenter;", "rightIcon", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalIconConfig;", "leftIcon", "avatarWidth", "avatarHeight", "avatarRound", "titleTextColor", "subtitleTextColor", "icon", "url", "titleColor", "banner", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalBannerComponent;", "itemArea", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalItemAreaComponent;", "columnCount", "maxLineCount", "avatarRoundCorner", "canHide", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "indicatorMargin", "topSearch", "bannerType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/Integer;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/huawei/digitalpayment/home/theme/data/local/SearchCenter;Lcom/huawei/digitalpayment/home/theme/data/local/LocalIconConfig;Lcom/huawei/digitalpayment/home/theme/data/local/LocalIconConfig;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/huawei/digitalpayment/home/theme/data/local/LocalIconConfig;Ljava/lang/String;Ljava/lang/Integer;Lcom/huawei/digitalpayment/home/theme/data/local/LocalBannerComponent;Lcom/huawei/digitalpayment/home/theme/data/local/LocalItemAreaComponent;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/huawei/digitalpayment/home/theme/data/local/LocalComponent;Ljava/lang/String;)V", "getComponentType", "()Ljava/lang/String;", "getTemplate", "getBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundUrl", "getRoundCorner", "getMarginTop", "getMarginBottom", "getMarginStart", "getMarginEnd", "getComponents", "()Ljava/util/List;", "getWidth", "getHeight", "getIndicatorStyle", "getIndicatorPosition", "getPageIcon", "getPageName", "getPageIconActive", "getTextColor", "()I", "getSelectTextColor", "getEnableRefresh", "()Z", "getRefreshBackgroundColor", "getFunctions", "setFunctions", "(Ljava/util/List;)V", "getTitle", "getSubTitle", "getSubTitleColor", "getItemBackgroundColor", "getItemRoundCorner", "getMaxCount", "getSubTitleExecute", "getStyle", "getStrokeWidth", "getStrokeColor", "getText", "getTextSize", "getTextGravity", "getStatusBarHeight", "getExecute", "getType", "getCenter", "()Lcom/huawei/digitalpayment/home/theme/data/local/SearchCenter;", "getRightIcon", "()Lcom/huawei/digitalpayment/home/theme/data/local/LocalIconConfig;", "getLeftIcon", "getAvatarWidth", "getAvatarHeight", "getAvatarRound", "getTitleTextColor", "getSubtitleTextColor", "getIcon", "getUrl", "getTitleColor", "getBanner", "()Lcom/huawei/digitalpayment/home/theme/data/local/LocalBannerComponent;", "getItemArea", "()Lcom/huawei/digitalpayment/home/theme/data/local/LocalItemAreaComponent;", "getColumnCount", "getMaxLineCount", "getAvatarRoundCorner", "getCanHide", "getPaddingTop", "getPaddingBottom", "getPaddingStart", "getPaddingEnd", "getIndicatorMargin", "getTopSearch", "()Lcom/huawei/digitalpayment/home/theme/data/local/LocalComponent;", "getBannerType", "getFunIcon", "getFunIconSelected", "getNavTextColor", "getNavSelectTextColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/Integer;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/huawei/digitalpayment/home/theme/data/local/SearchCenter;Lcom/huawei/digitalpayment/home/theme/data/local/LocalIconConfig;Lcom/huawei/digitalpayment/home/theme/data/local/LocalIconConfig;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/huawei/digitalpayment/home/theme/data/local/LocalIconConfig;Ljava/lang/String;Ljava/lang/Integer;Lcom/huawei/digitalpayment/home/theme/data/local/LocalBannerComponent;Lcom/huawei/digitalpayment/home/theme/data/local/LocalItemAreaComponent;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/huawei/digitalpayment/home/theme/data/local/LocalComponent;Ljava/lang/String;)Lcom/huawei/digitalpayment/home/theme/data/local/LocalComponent;", "equals", "other", "", "hashCode", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalComponent extends BaseResp implements NavigationConfig {
    private static int component1 = 1;
    private static int component3;
    private final Integer avatarHeight;
    private final Integer avatarRound;
    private final Integer avatarRoundCorner;
    private final Integer avatarWidth;
    private final Integer backgroundColor;
    private final String backgroundUrl;
    private final LocalBannerComponent banner;
    private final String bannerType;
    private final boolean canHide;
    private final SearchCenter center;
    private final Integer columnCount;
    private final String componentType;
    private final List<LocalComponent> components;
    private final boolean enableRefresh;
    private final String execute;
    private List<LocalHomeFunction> functions;
    private final Integer height;
    private final LocalIconConfig icon;
    private final Integer indicatorMargin;
    private final String indicatorPosition;
    private final String indicatorStyle;
    private final boolean isLightIcon;
    private final LocalItemAreaComponent itemArea;
    private final Integer itemBackgroundColor;
    private final Integer itemRoundCorner;
    private final LocalIconConfig leftIcon;
    private final Integer marginBottom;
    private final Integer marginEnd;
    private final Integer marginStart;
    private final Integer marginTop;
    private final Integer maxCount;
    private final Integer maxLineCount;
    private final Integer paddingBottom;
    private final Integer paddingEnd;
    private final Integer paddingStart;
    private final Integer paddingTop;
    private final String pageIcon;
    private final String pageIconActive;
    private final String pageName;
    private final Integer refreshBackgroundColor;
    private final LocalIconConfig rightIcon;
    private final Integer roundCorner;
    private final int selectTextColor;
    private final Integer statusBarHeight;
    private final Integer strokeColor;
    private final Integer strokeWidth;
    private final String style;
    private final String subTitle;
    private final Integer subTitleColor;
    private final String subTitleExecute;
    private final Integer subtitleTextColor;
    private final String template;
    private final String text;
    private final int textColor;
    private final String textGravity;
    private final Integer textSize;
    private final String title;
    private final Integer titleColor;
    private final Integer titleTextColor;
    private final LocalComponent topSearch;
    private final Integer type;
    private final String url;
    private final Integer width;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalComponent(String str, String str2, Integer num, String str3, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List list, Integer num7, Integer num8, String str4, String str5, String str6, String str7, String str8, int i, int i2, boolean z, Integer num9, boolean z2, List list2, String str9, String str10, Integer num10, Integer num11, Integer num12, Integer num13, String str11, String str12, Integer num14, Integer num15, String str13, Integer num16, String str14, Integer num17, String str15, Integer num18, SearchCenter searchCenter, LocalIconConfig localIconConfig, LocalIconConfig localIconConfig2, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, LocalIconConfig localIconConfig3, String str16, Integer num24, LocalBannerComponent localBannerComponent, LocalItemAreaComponent localItemAreaComponent, Integer num25, Integer num26, Integer num27, boolean z3, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, LocalComponent localComponent, String str17, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        String str18;
        Integer num33;
        Integer num34;
        Integer num35;
        String str19;
        String str20;
        List listEmptyList;
        List list3;
        String str21;
        Integer num36;
        Integer num37;
        Integer num38;
        Integer num39;
        Integer num40;
        String str22;
        Integer num41;
        Integer num42;
        String str23;
        Integer num43;
        Integer num44;
        Integer num45;
        LocalItemAreaComponent localItemAreaComponent2;
        LocalItemAreaComponent localItemAreaComponent3;
        Integer num46;
        Integer num47;
        Integer num48;
        Integer num49;
        Integer num50;
        String str24 = (i3 & 1) != 0 ? null : str;
        if ((i3 & 2) != 0) {
            int i5 = 2 % 2;
            str18 = null;
        } else {
            str18 = str2;
        }
        Integer num51 = (i3 & 4) != 0 ? null : num;
        String str25 = (i3 & 8) != 0 ? null : str3;
        if ((i3 & 16) != 0) {
            int i6 = 2 % 2;
            num33 = null;
        } else {
            num33 = num2;
        }
        Integer num52 = (i3 & 32) != 0 ? null : num3;
        if ((i3 & 64) != 0) {
            int i7 = component3 + 97;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            num34 = null;
        } else {
            num34 = num4;
        }
        Integer num53 = (i3 & 128) != 0 ? null : num5;
        Integer num54 = (i3 & 256) != 0 ? null : num6;
        List listEmptyList2 = (i3 & 512) != 0 ? CollectionsKt.emptyList() : list;
        Integer num55 = (i3 & 1024) != 0 ? null : num7;
        if ((i3 & 2048) != 0) {
            int i9 = component3 + 103;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            num35 = null;
        } else {
            num35 = num8;
        }
        String str26 = (i3 & 4096) != 0 ? null : str4;
        String str27 = (i3 & 8192) != 0 ? null : str5;
        String str28 = (i3 & 16384) != 0 ? "" : str6;
        String str29 = (i3 & 32768) != 0 ? "" : str7;
        String str30 = (i3 & 65536) != 0 ? "" : str8;
        int i11 = (i3 & 131072) != 0 ? 0 : i;
        int i12 = (i3 & 262144) != 0 ? 0 : i2;
        boolean z4 = (i3 & 524288) != 0 ? false : z;
        Integer num56 = (i3 & 1048576) != 0 ? null : num9;
        boolean z5 = (i3 & 2097152) != 0 ? true : z2;
        if ((i3 & 4194304) != 0) {
            str19 = str28;
            int i13 = component3 + 43;
            str20 = str26;
            component1 = i13 % 128;
            if (i13 % 2 == 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
            int i14 = 2 % 2;
        } else {
            str19 = str28;
            str20 = str26;
            listEmptyList = list2;
        }
        String str31 = (8388608 & i3) != 0 ? null : str9;
        String str32 = (i3 & 16777216) != 0 ? null : str10;
        Integer num57 = (i3 & 33554432) != 0 ? null : num10;
        if ((i3 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            str21 = str31;
            int i15 = component1 + 7;
            list3 = listEmptyList;
            component3 = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 2 % 2;
            }
            num36 = null;
        } else {
            list3 = listEmptyList;
            str21 = str31;
            num36 = num11;
        }
        Integer num58 = (134217728 & i3) != 0 ? null : num12;
        if ((i3 & 268435456) != 0) {
            num38 = num58;
            int i17 = component1 + 49;
            num37 = num36;
            component3 = i17 % 128;
            int i18 = i17 % 2;
            num39 = null;
        } else {
            num37 = num36;
            num38 = num58;
            num39 = num13;
        }
        String str33 = (536870912 & i3) != 0 ? null : str11;
        String str34 = (i3 & 1073741824) != 0 ? null : str12;
        Integer num59 = (i3 & Integer.MIN_VALUE) != 0 ? null : num14;
        Integer num60 = (i4 & 1) != 0 ? null : num15;
        String str35 = (i4 & 2) != 0 ? null : str13;
        if ((i4 & 4) != 0) {
            num40 = num59;
            int i19 = component1 + 83;
            str22 = str33;
            component3 = i19 % 128;
            int i20 = i19 % 2;
            num41 = null;
        } else {
            num40 = num59;
            str22 = str33;
            num41 = num16;
        }
        String str36 = (i4 & 8) != 0 ? null : str14;
        Integer num61 = (i4 & 16) != 0 ? null : num17;
        String str37 = (i4 & 32) == 0 ? str15 : "";
        if ((i4 & 64) != 0) {
            str23 = str36;
            int i21 = component1 + 25;
            num42 = num41;
            component3 = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 16 / 0;
            }
            num43 = null;
        } else {
            num42 = num41;
            str23 = str36;
            num43 = num18;
        }
        SearchCenter searchCenter2 = (i4 & 128) != 0 ? null : searchCenter;
        LocalIconConfig localIconConfig4 = (i4 & 256) != 0 ? null : localIconConfig;
        LocalIconConfig localIconConfig5 = (i4 & 512) != 0 ? null : localIconConfig2;
        Integer num62 = (i4 & 1024) != 0 ? null : num19;
        Integer num63 = (i4 & 2048) != 0 ? null : num20;
        Integer num64 = (i4 & 4096) != 0 ? null : num21;
        Integer num65 = (i4 & 8192) != 0 ? null : num22;
        Integer num66 = (i4 & 16384) != 0 ? null : num23;
        LocalIconConfig localIconConfig6 = (i4 & 32768) != 0 ? null : localIconConfig3;
        String str38 = (i4 & 65536) != 0 ? null : str16;
        Integer num67 = (i4 & 131072) != 0 ? null : num24;
        LocalBannerComponent localBannerComponent2 = (i4 & 262144) != 0 ? null : localBannerComponent;
        if ((i4 & 524288) != 0) {
            num45 = num66;
            int i23 = component1 + 73;
            num44 = num43;
            component3 = i23 % 128;
            int i24 = i23 % 2;
            localItemAreaComponent2 = null;
        } else {
            num44 = num43;
            num45 = num66;
            localItemAreaComponent2 = localItemAreaComponent;
        }
        Integer num68 = (1048576 & i4) != 0 ? null : num25;
        Integer num69 = (i4 & 2097152) != 0 ? null : num26;
        if ((i4 & 4194304) != 0) {
            num46 = num68;
            int i25 = component1 + 33;
            localItemAreaComponent3 = localItemAreaComponent2;
            component3 = i25 % 128;
            num47 = null;
            if (i25 % 2 != 0) {
                num47.hashCode();
                throw null;
            }
            num48 = null;
        } else {
            localItemAreaComponent3 = localItemAreaComponent2;
            num46 = num68;
            num47 = null;
            num48 = num27;
        }
        boolean z6 = (i4 & 8388608) == 0 ? z3 : false;
        Integer num70 = (i4 & 16777216) != 0 ? num47 : num28;
        Integer num71 = (i4 & 33554432) != 0 ? num47 : num29;
        if ((i4 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            int i26 = component1 + 101;
            num49 = num48;
            component3 = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 2 % 2;
            }
            num50 = null;
        } else {
            num49 = num48;
            num50 = num30;
        }
        this(str24, str18, num51, str25, num33, num52, num34, num53, num54, listEmptyList2, num55, num35, str20, str27, str19, str29, str30, i11, i12, z4, num56, z5, list3, str21, str32, num57, num37, num38, num39, str22, str34, num40, num60, str35, num42, str23, num61, str37, num44, searchCenter2, localIconConfig4, localIconConfig5, num62, num63, num64, num65, num45, localIconConfig6, str38, num67, localBannerComponent2, localItemAreaComponent3, num46, num69, num49, z6, num70, num71, num50, (134217728 & i4) != 0 ? null : num31, (i4 & 268435456) != 0 ? null : num32, (i4 & 536870912) != 0 ? null : localComponent, (i4 & 1073741824) != 0 ? null : str17);
    }

    public final String getComponentType() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.componentType;
        int i5 = i3 + 53;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTemplate() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.template;
        int i4 = i3 + 113;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer getBackgroundColor() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.backgroundColor;
        int i5 = i2 + 19;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getBackgroundUrl() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.backgroundUrl;
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return str;
    }

    public final Integer getRoundCorner() {
        Integer num;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.roundCorner;
            int i4 = 21 / 0;
        } else {
            num = this.roundCorner;
        }
        int i5 = i2 + 117;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final Integer getMarginTop() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 105;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginTop;
        int i5 = i2 + 11;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return num;
    }

    public final Integer getMarginBottom() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.marginBottom;
        int i5 = i3 + 125;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getMarginStart() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.marginStart;
        int i5 = i3 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getMarginEnd() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.marginEnd;
        }
        throw null;
    }

    public final List<LocalComponent> getComponents() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.components;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getWidth() {
        Integer num;
        int i = 2 % 2;
        int i2 = component1 + 97;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            num = this.width;
            int i4 = 3 / 0;
        } else {
            num = this.width;
        }
        int i5 = i3 + 57;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return num;
    }

    public final Integer getHeight() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.height;
        int i5 = i2 + 77;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIndicatorStyle() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.indicatorStyle;
        int i4 = i2 + 99;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return str;
    }

    public final String getIndicatorPosition() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.indicatorPosition;
        int i5 = i2 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPageIcon() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 99;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pageIcon;
        int i5 = i2 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPageName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pageName;
        int i5 = i2 + 19;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPageIconActive() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 23;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.pageIconActive;
            int i4 = 76 / 0;
        } else {
            str = this.pageIconActive;
        }
        int i5 = i2 + 97;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getTextColor() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.textColor;
        int i6 = i3 + 39;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final int getSelectTextColor() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.selectTextColor;
        int i6 = i2 + 97;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getEnableRefresh() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.enableRefresh;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getRefreshBackgroundColor() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.refreshBackgroundColor;
        int i5 = i3 + 27;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final boolean isLightIcon() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.isLightIcon;
        int i5 = i3 + 49;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final List<LocalHomeFunction> getFunctions() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<LocalHomeFunction> list = this.functions;
        int i5 = i3 + 69;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final void setFunctions(List<LocalHomeFunction> list) {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        this.functions = list;
        int i4 = component3 + 115;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 95;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSubTitle() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.subTitle;
        int i4 = i3 + 119;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer getSubTitleColor() {
        Integer num;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            num = this.subTitleColor;
            int i4 = 96 / 0;
        } else {
            num = this.subTitleColor;
        }
        int i5 = i2 + 109;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer getItemBackgroundColor() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.itemBackgroundColor;
        int i5 = i3 + 91;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getItemRoundCorner() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.itemRoundCorner;
        int i4 = i3 + 59;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer getMaxCount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.maxCount;
        int i5 = i2 + 55;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSubTitleExecute() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.subTitleExecute;
        int i5 = i3 + 73;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getStyle() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.style;
        }
        throw null;
    }

    public final Integer getStrokeWidth() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 33;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.strokeWidth;
        int i5 = i2 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getStrokeColor() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.strokeColor;
        int i5 = i3 + 97;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final String getText() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 11;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.text;
        int i5 = i2 + 111;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getTextSize() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.textSize;
        int i5 = i3 + 45;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return num;
    }

    public final String getTextGravity() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.textGravity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getStatusBarHeight() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Integer num = this.statusBarHeight;
        int i4 = i2 + 59;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 115;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer getType() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 91;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.type;
        int i5 = i2 + 43;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final SearchCenter getCenter() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        SearchCenter searchCenter = this.center;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return searchCenter;
    }

    public final LocalIconConfig getRightIcon() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        LocalIconConfig localIconConfig = this.rightIcon;
        int i4 = i2 + 89;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return localIconConfig;
        }
        throw null;
    }

    public final LocalIconConfig getLeftIcon() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        LocalIconConfig localIconConfig = this.leftIcon;
        int i5 = i3 + 109;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return localIconConfig;
        }
        throw null;
    }

    public final Integer getAvatarWidth() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.avatarWidth;
        }
        throw null;
    }

    public final Integer getAvatarHeight() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.avatarHeight;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getAvatarRound() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.avatarRound;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final Integer getTitleTextColor() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.titleTextColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getSubtitleTextColor() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.subtitleTextColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LocalIconConfig getIcon() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.icon;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUrl() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.url;
        int i5 = i3 + 21;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return str;
    }

    public final Integer getTitleColor() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.titleColor;
        int i5 = i2 + 93;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final LocalBannerComponent getBanner() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        LocalBannerComponent localBannerComponent = this.banner;
        int i5 = i3 + 109;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return localBannerComponent;
        }
        throw null;
    }

    public final LocalItemAreaComponent getItemArea() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        LocalItemAreaComponent localItemAreaComponent = this.itemArea;
        int i5 = i3 + 77;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return localItemAreaComponent;
    }

    public final Integer getColumnCount() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Integer num = this.columnCount;
        int i4 = i3 + 83;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer getMaxLineCount() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.maxLineCount;
        int i5 = i3 + 85;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getAvatarRoundCorner() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.avatarRoundCorner;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getCanHide() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.canHide;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getPaddingTop() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.paddingTop;
        int i5 = i3 + 115;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getPaddingBottom() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.paddingBottom;
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return num;
    }

    public final Integer getPaddingStart() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 55;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Integer num = this.paddingStart;
        int i4 = i2 + 21;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer getPaddingEnd() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.paddingEnd;
        int i5 = i3 + 79;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getIndicatorMargin() {
        Integer num;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 95;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            num = this.indicatorMargin;
            int i4 = 7 / 0;
        } else {
            num = this.indicatorMargin;
        }
        int i5 = i2 + 81;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final LocalComponent getTopSearch() {
        LocalComponent localComponent;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 23;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            localComponent = this.topSearch;
            int i4 = 0 / 0;
        } else {
            localComponent = this.topSearch;
        }
        int i5 = i2 + 49;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return localComponent;
        }
        throw null;
    }

    public final String getBannerType() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 111;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bannerType;
        int i5 = i2 + 89;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public LocalComponent(String str, String str2, Integer num, String str3, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List<LocalComponent> list, Integer num7, Integer num8, String str4, String str5, String str6, String str7, String str8, int i, int i2, boolean z, Integer num9, boolean z2, List<LocalHomeFunction> list2, String str9, String str10, Integer num10, Integer num11, Integer num12, Integer num13, String str11, String str12, Integer num14, Integer num15, String str13, Integer num16, String str14, Integer num17, String str15, Integer num18, SearchCenter searchCenter, LocalIconConfig localIconConfig, LocalIconConfig localIconConfig2, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, LocalIconConfig localIconConfig3, String str16, Integer num24, LocalBannerComponent localBannerComponent, LocalItemAreaComponent localItemAreaComponent, Integer num25, Integer num26, Integer num27, boolean z3, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, LocalComponent localComponent, String str17) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str15, "");
        this.componentType = str;
        this.template = str2;
        this.backgroundColor = num;
        this.backgroundUrl = str3;
        this.roundCorner = num2;
        this.marginTop = num3;
        this.marginBottom = num4;
        this.marginStart = num5;
        this.marginEnd = num6;
        this.components = list;
        this.width = num7;
        this.height = num8;
        this.indicatorStyle = str4;
        this.indicatorPosition = str5;
        this.pageIcon = str6;
        this.pageName = str7;
        this.pageIconActive = str8;
        this.textColor = i;
        this.selectTextColor = i2;
        this.enableRefresh = z;
        this.refreshBackgroundColor = num9;
        this.isLightIcon = z2;
        this.functions = list2;
        this.title = str9;
        this.subTitle = str10;
        this.subTitleColor = num10;
        this.itemBackgroundColor = num11;
        this.itemRoundCorner = num12;
        this.maxCount = num13;
        this.subTitleExecute = str11;
        this.style = str12;
        this.strokeWidth = num14;
        this.strokeColor = num15;
        this.text = str13;
        this.textSize = num16;
        this.textGravity = str14;
        this.statusBarHeight = num17;
        this.execute = str15;
        this.type = num18;
        this.center = searchCenter;
        this.rightIcon = localIconConfig;
        this.leftIcon = localIconConfig2;
        this.avatarWidth = num19;
        this.avatarHeight = num20;
        this.avatarRound = num21;
        this.titleTextColor = num22;
        this.subtitleTextColor = num23;
        this.icon = localIconConfig3;
        this.url = str16;
        this.titleColor = num24;
        this.banner = localBannerComponent;
        this.itemArea = localItemAreaComponent;
        this.columnCount = num25;
        this.maxLineCount = num26;
        this.avatarRoundCorner = num27;
        this.canHide = z3;
        this.paddingTop = num28;
        this.paddingBottom = num29;
        this.paddingStart = num30;
        this.paddingEnd = num31;
        this.indicatorMargin = num32;
        this.topSearch = localComponent;
        this.bannerType = str17;
    }

    @Override
    public String getFunIcon() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.pageIcon;
        }
        throw null;
    }

    @Override
    public String getFunIconSelected() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.pageIconActive;
        int i5 = i3 + 63;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public int getNavTextColor() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.textColor;
        int i6 = i3 + 111;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override
    public int getNavSelectTextColor() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.selectTextColor;
        int i6 = i3 + 63;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public LocalComponent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -1, Integer.MAX_VALUE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LocalComponent copy$default(LocalComponent localComponent, String str, String str2, Integer num, String str3, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List list, Integer num7, Integer num8, String str4, String str5, String str6, String str7, String str8, int i, int i2, boolean z, Integer num9, boolean z2, List list2, String str9, String str10, Integer num10, Integer num11, Integer num12, Integer num13, String str11, String str12, Integer num14, Integer num15, String str13, Integer num16, String str14, Integer num17, String str15, Integer num18, SearchCenter searchCenter, LocalIconConfig localIconConfig, LocalIconConfig localIconConfig2, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, LocalIconConfig localIconConfig3, String str16, Integer num24, LocalBannerComponent localBannerComponent, LocalItemAreaComponent localItemAreaComponent, Integer num25, Integer num26, Integer num27, boolean z3, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, LocalComponent localComponent2, String str17, int i3, int i4, Object obj) {
        String str18;
        Integer num33;
        Integer num34;
        String str19;
        Integer num35;
        String str20;
        String str21;
        String str22;
        int i5;
        String str23;
        Integer num36;
        Integer num37;
        Integer num38;
        Integer num39;
        Integer num40;
        LocalIconConfig localIconConfig4;
        LocalIconConfig localIconConfig5;
        Integer num41;
        boolean z4;
        int i6 = 2 % 2;
        int i7 = component3 + 49;
        int i8 = i7 % 128;
        component1 = i8;
        int i9 = i7 % 2;
        if ((i3 & 1) != 0) {
            int i10 = i8 + 41;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            str18 = localComponent.componentType;
        } else {
            str18 = str;
        }
        String str24 = (i3 & 2) != 0 ? localComponent.template : str2;
        Integer num42 = (i3 & 4) != 0 ? localComponent.backgroundColor : num;
        String str25 = (i3 & 8) != 0 ? localComponent.backgroundUrl : str3;
        Integer num43 = (i3 & 16) != 0 ? localComponent.roundCorner : num2;
        Integer num44 = (i3 & 32) != 0 ? localComponent.marginTop : num3;
        if ((i3 & 64) != 0) {
            int i12 = component3 + 65;
            component1 = i12 % 128;
            if (i12 % 2 == 0) {
                num33 = localComponent.marginBottom;
                int i13 = 7 / 0;
            } else {
                num33 = localComponent.marginBottom;
            }
        } else {
            num33 = num4;
        }
        if ((i3 & 128) != 0) {
            int i14 = component3 + 113;
            component1 = i14 % 128;
            if (i14 % 2 == 0) {
                Integer num45 = localComponent.marginStart;
                throw null;
            }
            num34 = localComponent.marginStart;
        } else {
            num34 = num5;
        }
        Integer num46 = (i3 & 256) != 0 ? localComponent.marginEnd : num6;
        List list3 = (i3 & 512) != 0 ? localComponent.components : list;
        Integer num47 = (i3 & 1024) != 0 ? localComponent.width : num7;
        Integer num48 = (i3 & 2048) != 0 ? localComponent.height : num8;
        String str26 = (i3 & 4096) != 0 ? localComponent.indicatorStyle : str4;
        String str27 = (i3 & 8192) != 0 ? localComponent.indicatorPosition : str5;
        String str28 = (i3 & 16384) != 0 ? localComponent.pageIcon : str6;
        if ((i3 & 32768) != 0) {
            str19 = str28;
            int i15 = component1 + 35;
            num35 = num48;
            component3 = i15 % 128;
            if (i15 % 2 != 0) {
                String str29 = localComponent.pageName;
                throw null;
            }
            str20 = localComponent.pageName;
        } else {
            str19 = str28;
            num35 = num48;
            str20 = str7;
        }
        String str30 = (i3 & 65536) != 0 ? localComponent.pageIconActive : str8;
        if ((i3 & 131072) != 0) {
            str22 = str30;
            int i16 = component1 + 83;
            str21 = str20;
            component3 = i16 % 128;
            int i17 = i16 % 2;
            i5 = localComponent.textColor;
            if (i17 != 0) {
                int i18 = 39 / 0;
            }
        } else {
            str21 = str20;
            str22 = str30;
            i5 = i;
        }
        int i19 = (i3 & 262144) != 0 ? localComponent.selectTextColor : i2;
        boolean z5 = (i3 & 524288) != 0 ? localComponent.enableRefresh : z;
        Integer num49 = (i3 & 1048576) != 0 ? localComponent.refreshBackgroundColor : num9;
        boolean z6 = (i3 & 2097152) != 0 ? localComponent.isLightIcon : z2;
        List list4 = (i3 & 4194304) != 0 ? localComponent.functions : list2;
        String str31 = (i3 & 8388608) != 0 ? localComponent.title : str9;
        String str32 = (i3 & 16777216) != 0 ? localComponent.subTitle : str10;
        Integer num50 = (i3 & 33554432) != 0 ? localComponent.subTitleColor : num10;
        Integer num51 = (i3 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? localComponent.itemBackgroundColor : num11;
        Integer num52 = (i3 & 134217728) != 0 ? localComponent.itemRoundCorner : num12;
        Integer num53 = (i3 & 268435456) != 0 ? localComponent.maxCount : num13;
        String str33 = (i3 & 536870912) != 0 ? localComponent.subTitleExecute : str11;
        String str34 = (i3 & 1073741824) != 0 ? localComponent.style : str12;
        Integer num54 = (i3 & Integer.MIN_VALUE) != 0 ? localComponent.strokeWidth : num14;
        Integer num55 = (i4 & 1) != 0 ? localComponent.strokeColor : num15;
        String str35 = (i4 & 2) != 0 ? localComponent.text : str13;
        Integer num56 = (i4 & 4) != 0 ? localComponent.textSize : num16;
        String str36 = (i4 & 8) != 0 ? localComponent.textGravity : str14;
        if ((i4 & 16) != 0) {
            Integer num57 = localComponent.statusBarHeight;
            int i20 = component1 + 117;
            str23 = str34;
            component3 = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 5 / 2;
            }
            num36 = num57;
        } else {
            str23 = str34;
            num36 = num17;
        }
        String str37 = (i4 & 32) != 0 ? localComponent.execute : str15;
        Integer num58 = (i4 & 64) != 0 ? localComponent.type : num18;
        SearchCenter searchCenter2 = (i4 & 128) != 0 ? localComponent.center : searchCenter;
        LocalIconConfig localIconConfig6 = (i4 & 256) != 0 ? localComponent.rightIcon : localIconConfig;
        LocalIconConfig localIconConfig7 = (i4 & 512) != 0 ? localComponent.leftIcon : localIconConfig2;
        Integer num59 = (i4 & 1024) != 0 ? localComponent.avatarWidth : num19;
        Integer num60 = (i4 & 2048) != 0 ? localComponent.avatarHeight : num20;
        if ((i4 & 4096) != 0) {
            int i22 = component1 + 23;
            num37 = num36;
            component3 = i22 % 128;
            int i23 = i22 % 2;
            num38 = localComponent.avatarRound;
        } else {
            num37 = num36;
            num38 = num21;
        }
        Integer num61 = (i4 & 8192) != 0 ? localComponent.titleTextColor : num22;
        Integer num62 = (i4 & 16384) != 0 ? localComponent.subtitleTextColor : num23;
        if ((i4 & 32768) != 0) {
            num40 = num62;
            int i24 = component3 + 99;
            num39 = num38;
            component1 = i24 % 128;
            int i25 = i24 % 2;
            localIconConfig4 = localComponent.icon;
        } else {
            num39 = num38;
            num40 = num62;
            localIconConfig4 = localIconConfig3;
        }
        String str38 = (65536 & i4) != 0 ? localComponent.url : str16;
        Integer num63 = (i4 & 131072) != 0 ? localComponent.titleColor : num24;
        LocalBannerComponent localBannerComponent2 = (i4 & 262144) != 0 ? localComponent.banner : localBannerComponent;
        LocalItemAreaComponent localItemAreaComponent2 = (i4 & 524288) != 0 ? localComponent.itemArea : localItemAreaComponent;
        Integer num64 = (i4 & 1048576) != 0 ? localComponent.columnCount : num25;
        Integer num65 = (i4 & 2097152) != 0 ? localComponent.maxLineCount : num26;
        Integer num66 = (i4 & 4194304) != 0 ? localComponent.avatarRoundCorner : num27;
        if ((i4 & 8388608) != 0) {
            num41 = num66;
            int i26 = component1 + 105;
            localIconConfig5 = localIconConfig4;
            component3 = i26 % 128;
            int i27 = i26 % 2;
            z4 = localComponent.canHide;
        } else {
            localIconConfig5 = localIconConfig4;
            num41 = num66;
            z4 = z3;
        }
        return localComponent.copy(str18, str24, num42, str25, num43, num44, num33, num34, num46, list3, num47, num35, str26, str27, str19, str21, str22, i5, i19, z5, num49, z6, list4, str31, str32, num50, num51, num52, num53, str33, str23, num54, num55, str35, num56, str36, num37, str37, num58, searchCenter2, localIconConfig6, localIconConfig7, num59, num60, num39, num61, num40, localIconConfig5, str38, num63, localBannerComponent2, localItemAreaComponent2, num64, num65, num41, z4, (16777216 & i4) != 0 ? localComponent.paddingTop : num28, (i4 & 33554432) != 0 ? localComponent.paddingBottom : num29, (i4 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? localComponent.paddingStart : num30, (i4 & 134217728) != 0 ? localComponent.paddingEnd : num31, (i4 & 268435456) != 0 ? localComponent.indicatorMargin : num32, (i4 & 536870912) != 0 ? localComponent.topSearch : localComponent2, (i4 & 1073741824) != 0 ? localComponent.bannerType : str17);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 103;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.componentType;
            int i4 = 24 / 0;
        } else {
            str = this.componentType;
        }
        int i5 = i2 + 1;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<LocalComponent> component10() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<LocalComponent> list = this.components;
        int i5 = i3 + 109;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component11() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.width;
        int i5 = i2 + 29;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final Integer component12() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.height;
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        return num;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.indicatorStyle;
        int i5 = i3 + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.indicatorPosition;
        int i4 = i3 + 19;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.pageIcon;
        int i5 = i3 + 71;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.pageName;
        int i4 = i3 + 5;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return str;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 35;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pageIconActive;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int component18() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.textColor;
        int i5 = i2 + 17;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final int component19() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.selectTextColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.template;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return str;
    }

    public final boolean component20() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 31;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.enableRefresh;
        int i5 = i2 + 95;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Integer component21() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.refreshBackgroundColor;
        int i5 = i2 + 99;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return num;
    }

    public final boolean component22() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.isLightIcon;
        int i5 = i3 + 61;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final List<LocalHomeFunction> component23() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<LocalHomeFunction> list = this.functions;
        int i5 = i3 + 35;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return list;
    }

    public final String component24() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 9;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component25() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.subTitle;
        }
        throw null;
    }

    public final Integer component26() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Integer num = this.subTitleColor;
        int i4 = i2 + 65;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer component27() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 23;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Integer num = this.itemBackgroundColor;
        int i4 = i2 + 81;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer component28() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.itemRoundCorner;
        }
        throw null;
    }

    public final Integer component29() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 69;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.maxCount;
        int i5 = i2 + 49;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return num;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.backgroundColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component30() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 37;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.subTitleExecute;
        int i4 = i2 + 77;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component31() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 43;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.style;
            int i4 = 93 / 0;
        } else {
            str = this.style;
        }
        int i5 = i3 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component32() {
        int i = 2 % 2;
        int i2 = component3 + 119;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.strokeWidth;
        int i5 = i3 + 37;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component33() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.strokeColor;
        int i5 = i3 + 123;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component34() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.text;
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        return str;
    }

    public final Integer component35() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.textSize;
        int i5 = i3 + 53;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component36() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 5;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.textGravity;
            int i4 = 61 / 0;
        } else {
            str = this.textGravity;
        }
        int i5 = i2 + 5;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return str;
    }

    public final Integer component37() {
        Integer num;
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            num = this.statusBarHeight;
            int i4 = 80 / 0;
        } else {
            num = this.statusBarHeight;
        }
        int i5 = i3 + 55;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component38() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.execute;
        int i5 = i3 + 75;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component39() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Integer num = this.type;
        int i4 = i3 + 85;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return num;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.backgroundUrl;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final SearchCenter component40() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        SearchCenter searchCenter = this.center;
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return searchCenter;
    }

    public final LocalIconConfig component41() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        LocalIconConfig localIconConfig = this.rightIcon;
        int i4 = i2 + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return localIconConfig;
    }

    public final LocalIconConfig component42() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        LocalIconConfig localIconConfig = this.leftIcon;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return localIconConfig;
    }

    public final Integer component43() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 33;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.avatarWidth;
        int i5 = i2 + 41;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component44() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.avatarHeight;
        int i5 = i3 + 23;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return num;
    }

    public final Integer component45() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.avatarRound;
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return num;
    }

    public final Integer component46() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.titleTextColor;
        int i5 = i3 + 9;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component47() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.subtitleTextColor;
        int i5 = i3 + 67;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final LocalIconConfig component48() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 87;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LocalIconConfig localIconConfig = this.icon;
        int i4 = i2 + 53;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return localIconConfig;
    }

    public final String component49() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.url;
        int i5 = i3 + 17;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component5() {
        Integer num;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 105;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.roundCorner;
            int i4 = 47 / 0;
        } else {
            num = this.roundCorner;
        }
        int i5 = i2 + 85;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final Integer component50() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.titleColor;
        int i5 = i3 + 65;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final LocalBannerComponent component51() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        LocalBannerComponent localBannerComponent = this.banner;
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return localBannerComponent;
    }

    public final LocalItemAreaComponent component52() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        LocalItemAreaComponent localItemAreaComponent = this.itemArea;
        int i5 = i3 + 75;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return localItemAreaComponent;
        }
        throw null;
    }

    public final Integer component53() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 47;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.columnCount;
        int i5 = i2 + 53;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component54() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 117;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.maxLineCount;
        int i5 = i2 + 49;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final Integer component55() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.avatarRoundCorner;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        return num;
    }

    public final boolean component56() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.canHide;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return z;
    }

    public final Integer component57() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.paddingTop;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component58() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.paddingBottom;
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return num;
    }

    public final Integer component59() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.paddingStart;
        int i5 = i2 + 41;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component6() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.marginTop;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return num;
    }

    public final Integer component60() {
        Integer num;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 53;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            num = this.paddingEnd;
            int i4 = 48 / 0;
        } else {
            num = this.paddingEnd;
        }
        int i5 = i2 + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component61() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 119;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.indicatorMargin;
        int i5 = i2 + 7;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LocalComponent component62() {
        int i = 2 % 2;
        int i2 = component1 + 107;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        LocalComponent localComponent = this.topSearch;
        int i4 = i3 + 41;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return localComponent;
    }

    public final String component63() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.bannerType;
        int i5 = i3 + 41;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component7() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.marginBottom;
        int i5 = i3 + 79;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component8() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.marginStart;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component9() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.marginEnd;
        int i4 = i3 + 117;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    public final LocalComponent copy(String componentType, String template, Integer backgroundColor, String backgroundUrl, Integer roundCorner, Integer marginTop, Integer marginBottom, Integer marginStart, Integer marginEnd, List<LocalComponent> components, Integer width, Integer height, String indicatorStyle, String indicatorPosition, String pageIcon, String pageName, String pageIconActive, int textColor, int selectTextColor, boolean enableRefresh, Integer refreshBackgroundColor, boolean isLightIcon, List<LocalHomeFunction> functions, String title, String subTitle, Integer subTitleColor, Integer itemBackgroundColor, Integer itemRoundCorner, Integer maxCount, String subTitleExecute, String style, Integer strokeWidth, Integer strokeColor, String text, Integer textSize, String textGravity, Integer statusBarHeight, String execute, Integer type, SearchCenter center, LocalIconConfig rightIcon, LocalIconConfig leftIcon, Integer avatarWidth, Integer avatarHeight, Integer avatarRound, Integer titleTextColor, Integer subtitleTextColor, LocalIconConfig icon, String url, Integer titleColor, LocalBannerComponent banner, LocalItemAreaComponent itemArea, Integer columnCount, Integer maxLineCount, Integer avatarRoundCorner, boolean canHide, Integer paddingTop, Integer paddingBottom, Integer paddingStart, Integer paddingEnd, Integer indicatorMargin, LocalComponent topSearch, String bannerType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(components, "");
        Intrinsics.checkNotNullParameter(functions, "");
        Intrinsics.checkNotNullParameter(execute, "");
        LocalComponent localComponent = new LocalComponent(componentType, template, backgroundColor, backgroundUrl, roundCorner, marginTop, marginBottom, marginStart, marginEnd, components, width, height, indicatorStyle, indicatorPosition, pageIcon, pageName, pageIconActive, textColor, selectTextColor, enableRefresh, refreshBackgroundColor, isLightIcon, functions, title, subTitle, subTitleColor, itemBackgroundColor, itemRoundCorner, maxCount, subTitleExecute, style, strokeWidth, strokeColor, text, textSize, textGravity, statusBarHeight, execute, type, center, rightIcon, leftIcon, avatarWidth, avatarHeight, avatarRound, titleTextColor, subtitleTextColor, icon, url, titleColor, banner, itemArea, columnCount, maxLineCount, avatarRoundCorner, canHide, paddingTop, paddingBottom, paddingStart, paddingEnd, indicatorMargin, topSearch, bannerType);
        int i2 = component1 + 75;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return localComponent;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 11;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof LocalComponent)) {
            return false;
        }
        LocalComponent localComponent = (LocalComponent) other;
        if (!Intrinsics.areEqual(this.componentType, localComponent.componentType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.template, localComponent.template)) {
            int i4 = component1 + 15;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.backgroundColor, localComponent.backgroundColor) || !Intrinsics.areEqual(this.backgroundUrl, localComponent.backgroundUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.roundCorner, localComponent.roundCorner)) {
            int i6 = component1 + 45;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.marginTop, localComponent.marginTop) || !Intrinsics.areEqual(this.marginBottom, localComponent.marginBottom) || !Intrinsics.areEqual(this.marginStart, localComponent.marginStart) || !Intrinsics.areEqual(this.marginEnd, localComponent.marginEnd) || !Intrinsics.areEqual(this.components, localComponent.components) || !Intrinsics.areEqual(this.width, localComponent.width) || !Intrinsics.areEqual(this.height, localComponent.height) || !Intrinsics.areEqual(this.indicatorStyle, localComponent.indicatorStyle)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.indicatorPosition, localComponent.indicatorPosition)) {
            int i8 = component1 + 11;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.pageIcon, localComponent.pageIcon) || !Intrinsics.areEqual(this.pageName, localComponent.pageName) || !Intrinsics.areEqual(this.pageIconActive, localComponent.pageIconActive) || this.textColor != localComponent.textColor || this.selectTextColor != localComponent.selectTextColor || this.enableRefresh != localComponent.enableRefresh || !Intrinsics.areEqual(this.refreshBackgroundColor, localComponent.refreshBackgroundColor) || this.isLightIcon != localComponent.isLightIcon || !Intrinsics.areEqual(this.functions, localComponent.functions) || !Intrinsics.areEqual(this.title, localComponent.title)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.subTitle, localComponent.subTitle)) {
            int i10 = component3 + 99;
            component1 = i10 % 128;
            return i10 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.subTitleColor, localComponent.subTitleColor) || !Intrinsics.areEqual(this.itemBackgroundColor, localComponent.itemBackgroundColor)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.itemRoundCorner, localComponent.itemRoundCorner)) {
            int i11 = component3 + 85;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.maxCount, localComponent.maxCount) || !Intrinsics.areEqual(this.subTitleExecute, localComponent.subTitleExecute) || !Intrinsics.areEqual(this.style, localComponent.style) || !Intrinsics.areEqual(this.strokeWidth, localComponent.strokeWidth) || !Intrinsics.areEqual(this.strokeColor, localComponent.strokeColor) || !Intrinsics.areEqual(this.text, localComponent.text) || !Intrinsics.areEqual(this.textSize, localComponent.textSize) || !Intrinsics.areEqual(this.textGravity, localComponent.textGravity) || !Intrinsics.areEqual(this.statusBarHeight, localComponent.statusBarHeight) || !Intrinsics.areEqual(this.execute, localComponent.execute) || !Intrinsics.areEqual(this.type, localComponent.type) || !Intrinsics.areEqual(this.center, localComponent.center)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.rightIcon, localComponent.rightIcon)) {
            int i13 = component3 + 57;
            component1 = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.leftIcon, localComponent.leftIcon) || !Intrinsics.areEqual(this.avatarWidth, localComponent.avatarWidth)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.avatarHeight, localComponent.avatarHeight)) {
            int i15 = component3 + 91;
            component1 = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.avatarRound, localComponent.avatarRound) || !Intrinsics.areEqual(this.titleTextColor, localComponent.titleTextColor) || !Intrinsics.areEqual(this.subtitleTextColor, localComponent.subtitleTextColor) || !Intrinsics.areEqual(this.icon, localComponent.icon) || !Intrinsics.areEqual(this.url, localComponent.url) || !Intrinsics.areEqual(this.titleColor, localComponent.titleColor) || !Intrinsics.areEqual(this.banner, localComponent.banner) || !Intrinsics.areEqual(this.itemArea, localComponent.itemArea) || !Intrinsics.areEqual(this.columnCount, localComponent.columnCount) || !Intrinsics.areEqual(this.maxLineCount, localComponent.maxLineCount) || !Intrinsics.areEqual(this.avatarRoundCorner, localComponent.avatarRoundCorner) || this.canHide != localComponent.canHide || !Intrinsics.areEqual(this.paddingTop, localComponent.paddingTop) || !Intrinsics.areEqual(this.paddingBottom, localComponent.paddingBottom) || !Intrinsics.areEqual(this.paddingStart, localComponent.paddingStart) || !Intrinsics.areEqual(this.paddingEnd, localComponent.paddingEnd)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.indicatorMargin, localComponent.indicatorMargin)) {
            int i17 = component1 + 67;
            component3 = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.topSearch, localComponent.topSearch)) {
            return false;
        }
        if (Intrinsics.areEqual(this.bannerType, localComponent.bannerType)) {
            return true;
        }
        int i19 = component3 + 23;
        component1 = i19 % 128;
        int i20 = i19 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int iHashCode;
        int i2;
        int iHashCode2;
        int i3;
        int iHashCode3;
        int i4;
        int iHashCode4;
        int i5;
        int iHashCode5;
        int i6;
        int iHashCode6;
        int i7;
        int iHashCode7;
        int i8;
        int iHashCode8;
        int i9;
        int i10;
        int iHashCode9;
        int i11 = 2 % 2;
        String str = this.componentType;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        String str2 = this.template;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.backgroundColor;
        int iHashCode12 = num == null ? 0 : num.hashCode();
        String str3 = this.backgroundUrl;
        int iHashCode13 = str3 == null ? 0 : str3.hashCode();
        Integer num2 = this.roundCorner;
        int iHashCode14 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.marginTop;
        int iHashCode15 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.marginBottom;
        int iHashCode16 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.marginStart;
        int iHashCode17 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.marginEnd;
        int iHashCode18 = num6 == null ? 0 : num6.hashCode();
        int iHashCode19 = this.components.hashCode();
        Integer num7 = this.width;
        int iHashCode20 = num7 == null ? 0 : num7.hashCode();
        Integer num8 = this.height;
        int iHashCode21 = num8 == null ? 0 : num8.hashCode();
        String str4 = this.indicatorStyle;
        int iHashCode22 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.indicatorPosition;
        int iHashCode23 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.pageIcon;
        int iHashCode24 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.pageName;
        int iHashCode25 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.pageIconActive;
        int iHashCode26 = str8 == null ? 0 : str8.hashCode();
        int iHashCode27 = Integer.hashCode(this.textColor);
        int iHashCode28 = Integer.hashCode(this.selectTextColor);
        int iHashCode29 = Boolean.hashCode(this.enableRefresh);
        Integer num9 = this.refreshBackgroundColor;
        int iHashCode30 = num9 == null ? 0 : num9.hashCode();
        int iHashCode31 = Boolean.hashCode(this.isLightIcon);
        int iHashCode32 = this.functions.hashCode();
        String str9 = this.title;
        if (str9 == null) {
            int i12 = component3 + 119;
            i = iHashCode23;
            component1 = i12 % 128;
            int i13 = i12 % 2;
            iHashCode = 0;
        } else {
            i = iHashCode23;
            iHashCode = str9.hashCode();
        }
        String str10 = this.subTitle;
        int iHashCode33 = str10 == null ? 0 : str10.hashCode();
        Integer num10 = this.subTitleColor;
        int iHashCode34 = num10 == null ? 0 : num10.hashCode();
        Integer num11 = this.itemBackgroundColor;
        int iHashCode35 = num11 == null ? 0 : num11.hashCode();
        Integer num12 = this.itemRoundCorner;
        int iHashCode36 = num12 == null ? 0 : num12.hashCode();
        Integer num13 = this.maxCount;
        int iHashCode37 = num13 == null ? 0 : num13.hashCode();
        String str11 = this.subTitleExecute;
        int iHashCode38 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.style;
        int iHashCode39 = str12 == null ? 0 : str12.hashCode();
        Integer num14 = this.strokeWidth;
        if (num14 == null) {
            int i14 = component3 + 71;
            i2 = iHashCode;
            component1 = i14 % 128;
            int i15 = i14 % 2;
            iHashCode2 = 0;
        } else {
            i2 = iHashCode;
            iHashCode2 = num14.hashCode();
        }
        Integer num15 = this.strokeColor;
        int iHashCode40 = 1;
        if (num15 == null) {
            int i16 = component3 + 35;
            i3 = iHashCode2;
            component1 = i16 % 128;
            iHashCode3 = i16 % 2 == 0 ? 1 : 0;
        } else {
            i3 = iHashCode2;
            iHashCode3 = num15.hashCode();
        }
        String str13 = this.text;
        if (str13 == null) {
            int i17 = component1 + 23;
            i4 = iHashCode3;
            component3 = i17 % 128;
            int i18 = i17 % 2;
            iHashCode4 = 0;
        } else {
            i4 = iHashCode3;
            iHashCode4 = str13.hashCode();
        }
        Integer num16 = this.textSize;
        int iHashCode41 = num16 == null ? 0 : num16.hashCode();
        String str14 = this.textGravity;
        if (str14 == null) {
            int i19 = component3 + 37;
            i5 = iHashCode4;
            component1 = i19 % 128;
            int i20 = i19 % 2;
            iHashCode5 = 0;
        } else {
            i5 = iHashCode4;
            iHashCode5 = str14.hashCode();
        }
        Integer num17 = this.statusBarHeight;
        int iHashCode42 = num17 == null ? 0 : num17.hashCode();
        int iHashCode43 = this.execute.hashCode();
        Integer num18 = this.type;
        if (num18 == null) {
            int i21 = component3 + 85;
            i6 = iHashCode5;
            component1 = i21 % 128;
            int i22 = i21 % 2;
            iHashCode6 = 0;
        } else {
            i6 = iHashCode5;
            iHashCode6 = num18.hashCode();
        }
        SearchCenter searchCenter = this.center;
        int iHashCode44 = searchCenter == null ? 0 : searchCenter.hashCode();
        LocalIconConfig localIconConfig = this.rightIcon;
        int iHashCode45 = localIconConfig == null ? 0 : localIconConfig.hashCode();
        LocalIconConfig localIconConfig2 = this.leftIcon;
        if (localIconConfig2 == null) {
            int i23 = component3 + 67;
            i7 = iHashCode6;
            component1 = i23 % 128;
            int i24 = i23 % 2;
            iHashCode7 = 0;
        } else {
            i7 = iHashCode6;
            iHashCode7 = localIconConfig2.hashCode();
        }
        Integer num19 = this.avatarWidth;
        int iHashCode46 = num19 == null ? 0 : num19.hashCode();
        Integer num20 = this.avatarHeight;
        int iHashCode47 = num20 == null ? 0 : num20.hashCode();
        Integer num21 = this.avatarRound;
        int iHashCode48 = num21 == null ? 0 : num21.hashCode();
        Integer num22 = this.titleTextColor;
        int iHashCode49 = num22 == null ? 0 : num22.hashCode();
        Integer num23 = this.subtitleTextColor;
        int iHashCode50 = num23 == null ? 0 : num23.hashCode();
        LocalIconConfig localIconConfig3 = this.icon;
        int iHashCode51 = localIconConfig3 == null ? 0 : localIconConfig3.hashCode();
        String str15 = this.url;
        int iHashCode52 = str15 == null ? 0 : str15.hashCode();
        Integer num24 = this.titleColor;
        int iHashCode53 = num24 == null ? 0 : num24.hashCode();
        LocalBannerComponent localBannerComponent = this.banner;
        int iHashCode54 = localBannerComponent == null ? 0 : localBannerComponent.hashCode();
        LocalItemAreaComponent localItemAreaComponent = this.itemArea;
        if (localItemAreaComponent == null) {
            int i25 = component3 + 7;
            i8 = iHashCode7;
            component1 = i25 % 128;
            int i26 = i25 % 2;
            iHashCode8 = 0;
        } else {
            i8 = iHashCode7;
            iHashCode8 = localItemAreaComponent.hashCode();
        }
        Integer num25 = this.columnCount;
        int iHashCode55 = num25 == null ? 0 : num25.hashCode();
        Integer num26 = this.maxLineCount;
        int iHashCode56 = num26 == null ? 0 : num26.hashCode();
        Integer num27 = this.avatarRoundCorner;
        int iHashCode57 = num27 == null ? 0 : num27.hashCode();
        int iHashCode58 = Boolean.hashCode(this.canHide);
        Integer num28 = this.paddingTop;
        if (num28 == null) {
            int i27 = component1 + 65;
            i9 = iHashCode8;
            component3 = i27 % 128;
            if (i27 % 2 == 0) {
                iHashCode40 = 0;
            }
        } else {
            i9 = iHashCode8;
            iHashCode40 = num28.hashCode();
        }
        Integer num29 = this.paddingBottom;
        int iHashCode59 = num29 == null ? 0 : num29.hashCode();
        Integer num30 = this.paddingStart;
        int iHashCode60 = num30 == null ? 0 : num30.hashCode();
        Integer num31 = this.paddingEnd;
        int iHashCode61 = num31 == null ? 0 : num31.hashCode();
        Integer num32 = this.indicatorMargin;
        if (num32 == null) {
            int i28 = component3 + 99;
            i10 = iHashCode59;
            component1 = i28 % 128;
            int i29 = i28 % 2;
            iHashCode9 = 0;
        } else {
            i10 = iHashCode59;
            iHashCode9 = num32.hashCode();
        }
        LocalComponent localComponent = this.topSearch;
        int iHashCode62 = localComponent == null ? 0 : localComponent.hashCode();
        String str16 = this.bannerType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode10 * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + i) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + i2) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + iHashCode41) * 31) + i6) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + i7) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + i8) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + i9) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode40) * 31) + i10) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode9) * 31) + iHashCode62) * 31) + (str16 == null ? 0 : str16.hashCode());
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalComponent(componentType=" + this.componentType + ", template=" + this.template + ", backgroundColor=" + this.backgroundColor + ", backgroundUrl=" + this.backgroundUrl + ", roundCorner=" + this.roundCorner + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", components=" + this.components + ", width=" + this.width + ", height=" + this.height + ", indicatorStyle=" + this.indicatorStyle + ", indicatorPosition=" + this.indicatorPosition + ", pageIcon=" + this.pageIcon + ", pageName=" + this.pageName + ", pageIconActive=" + this.pageIconActive + ", textColor=" + this.textColor + ", selectTextColor=" + this.selectTextColor + ", enableRefresh=" + this.enableRefresh + ", refreshBackgroundColor=" + this.refreshBackgroundColor + ", isLightIcon=" + this.isLightIcon + ", functions=" + this.functions + ", title=" + this.title + ", subTitle=" + this.subTitle + ", subTitleColor=" + this.subTitleColor + ", itemBackgroundColor=" + this.itemBackgroundColor + ", itemRoundCorner=" + this.itemRoundCorner + ", maxCount=" + this.maxCount + ", subTitleExecute=" + this.subTitleExecute + ", style=" + this.style + ", strokeWidth=" + this.strokeWidth + ", strokeColor=" + this.strokeColor + ", text=" + this.text + ", textSize=" + this.textSize + ", textGravity=" + this.textGravity + ", statusBarHeight=" + this.statusBarHeight + ", execute=" + this.execute + ", type=" + this.type + ", center=" + this.center + ", rightIcon=" + this.rightIcon + ", leftIcon=" + this.leftIcon + ", avatarWidth=" + this.avatarWidth + ", avatarHeight=" + this.avatarHeight + ", avatarRound=" + this.avatarRound + ", titleTextColor=" + this.titleTextColor + ", subtitleTextColor=" + this.subtitleTextColor + ", icon=" + this.icon + ", url=" + this.url + ", titleColor=" + this.titleColor + ", banner=" + this.banner + ", itemArea=" + this.itemArea + ", columnCount=" + this.columnCount + ", maxLineCount=" + this.maxLineCount + ", avatarRoundCorner=" + this.avatarRoundCorner + ", canHide=" + this.canHide + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", indicatorMargin=" + this.indicatorMargin + ", topSearch=" + this.topSearch + ", bannerType=" + this.bannerType + ")";
        int i2 = component3 + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
