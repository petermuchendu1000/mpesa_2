package com.huawei.digitalpayment.home.theme.data.remote;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.WindowInfoFieldGroup;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.griver.ui.ant.api.AUAttrsConstant;
import com.huawei.digitalpayment.common.theme.constants.ThemeConstants;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.home.data.source.remote.RemoteHomeFunction;
import com.huawei.http.BaseResp;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0003\b\u008d\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bï\u0005\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010+\u001a\u00020\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010@\u001a\u00020\u0017\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bI\u0010JJ\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0097\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010\u0099\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010\u009a\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010\u009d\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0017HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010¨\u0001\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010®\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010±\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010´\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¶\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\n\u0010·\u0001\u001a\u00020\u0003HÆ\u0003J\u0011\u0010¸\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\u0011\u0010¼\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010½\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010¾\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010/HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010<HÆ\u0003J\u0011\u0010Æ\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010Ç\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010È\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\n\u0010É\u0001\u001a\u00020\u0017HÆ\u0003J\u0011\u0010Ê\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010Ë\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010Ì\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010Í\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010Î\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010Ï\u0001\u001a\u0004\u0018\u00010GHÆ\u0003J\f\u0010Ð\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jø\u0005\u0010Ñ\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010+\u001a\u00020\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010/2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010@\u001a\u00020\u00172\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010Ò\u0001J\u0016\u0010Ó\u0001\u001a\u00020\u00172\n\u0010Ô\u0001\u001a\u0005\u0018\u00010Õ\u0001HÖ\u0003J\n\u0010Ö\u0001\u001a\u00020\bHÖ\u0001J\n\u0010×\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010LR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010LR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010LR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\bP\u0010QR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\bS\u0010QR\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\bT\u0010QR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\bU\u0010QR\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\bV\u0010QR\u0015\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\bW\u0010QR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\bX\u0010QR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u0010LR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010LR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010LR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010LR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010LR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010LR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010LR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010LR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010LR\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010LR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010LR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010LR\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010LR\u0015\u0010!\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\bj\u0010QR\u0015\u0010\"\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\bk\u0010QR\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010LR\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010LR\u0015\u0010%\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\bn\u0010QR\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010LR\u0013\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010LR\u0015\u0010(\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\bq\u0010QR\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010LR\u0015\u0010*\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\bs\u0010QR\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bt\u0010LR\u0015\u0010,\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\bu\u0010QR\u0013\u0010-\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0013\u0010.\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bx\u0010yR\u0013\u00100\u001a\u0004\u0018\u00010/¢\u0006\b\n\u0000\u001a\u0004\bz\u0010yR\u0015\u00101\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\b{\u0010QR\u0015\u00102\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\b|\u0010QR\u0015\u00103\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010R\u001a\u0004\b}\u0010QR\u0013\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b~\u0010LR\u0013\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010LR\u0014\u00106\u001a\u0004\u0018\u00010/¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010yR\u0014\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010LR\u0014\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010LR\u0015\u00109\u001a\u0004\u0018\u00010:¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0015\u0010;\u001a\u0004\u0018\u00010<¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010=\u001a\u0004\u0018\u00010\b¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u0087\u0001\u0010QR\u0016\u0010>\u001a\u0004\u0018\u00010\b¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u0088\u0001\u0010QR\u0016\u0010?\u001a\u0004\u0018\u00010\b¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u0089\u0001\u0010QR\u0012\u0010@\u001a\u00020\u0017¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010aR\u0016\u0010A\u001a\u0004\u0018\u00010\b¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u008b\u0001\u0010QR\u0016\u0010B\u001a\u0004\u0018\u00010\b¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u008c\u0001\u0010QR\u0016\u0010C\u001a\u0004\u0018\u00010\b¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u008d\u0001\u0010QR\u0016\u0010D\u001a\u0004\u0018\u00010\b¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u008e\u0001\u0010QR\u0016\u0010E\u001a\u0004\u0018\u00010\b¢\u0006\u000b\n\u0002\u0010R\u001a\u0005\b\u008f\u0001\u0010QR\u0015\u0010F\u001a\u0004\u0018\u00010G¢\u0006\n\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0014\u0010H\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010L¨\u0006Ø\u0001"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/remote/ConfigValue;", "Lcom/huawei/http/BaseResp;", "componentType", "", "template", "backgroundColor", "backgroundUrl", "roundCorner", "", "marginTop", "marginBottom", "marginStart", "marginEnd", "width", "height", "indicatorStyle", "indicatorPosition", "pageIcon", "pageName", "pageIconActive", CdpConstants.CONTENT_TEXT_COLOR, "selectTextColor", "enableRefresh", "", "refreshBackgroundColor", "iconStyle", "functions", "", "Lcom/huawei/digitalpayment/home/data/source/remote/RemoteHomeFunction;", "title", "subTitle", RVParams.AROME_SUB_TITLE_COLOR, "itemBackgroundColor", "itemRoundCorner", "maxCount", "subTitleExecute", "style", "strokeWidth", "strokeColor", "text", AUAttrsConstant.TV_TEXTSIZE, "textGravity", WindowInfoFieldGroup.FIELD_STATUS_BAR_HEIGHT, KeysConstants.KEY_EXECUTE, "type", ThemeConstants.INDICA_POSITION_CENTER, "rightIcon", "Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteIconConfig;", "leftIcon", "avatarWidth", "avatarHeight", "avatarRound", "titleTextColor", "subtitleTextColor", "icon", "url", "titleColor", "banner", "Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteBannerComponent;", "itemArea", "Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteItemAreaComponent;", "columnCount", "maxLineCount", "avatarRoundCorner", "canHide", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "indicatorMargin", "topSearch", "Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteComponent;", "bannerType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/huawei/digitalpayment/home/theme/data/remote/ConfigValue;Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteIconConfig;Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteIconConfig;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteIconConfig;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteBannerComponent;Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteItemAreaComponent;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteComponent;Ljava/lang/String;)V", "getComponentType", "()Ljava/lang/String;", "getTemplate", "getBackgroundColor", "getBackgroundUrl", "getRoundCorner", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarginTop", "getMarginBottom", "getMarginStart", "getMarginEnd", "getWidth", "getHeight", "getIndicatorStyle", "getIndicatorPosition", "getPageIcon", "getPageName", "getPageIconActive", "getTextColor", "getSelectTextColor", "getEnableRefresh", "()Z", "getRefreshBackgroundColor", "getIconStyle", "getFunctions", "()Ljava/util/List;", "getTitle", "getSubTitle", "getSubTitleColor", "getItemBackgroundColor", "getItemRoundCorner", "getMaxCount", "getSubTitleExecute", "getStyle", "getStrokeWidth", "getStrokeColor", "getText", "getTextSize", "getTextGravity", "getStatusBarHeight", "getExecute", "getType", "getCenter", "()Lcom/huawei/digitalpayment/home/theme/data/remote/ConfigValue;", "getRightIcon", "()Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteIconConfig;", "getLeftIcon", "getAvatarWidth", "getAvatarHeight", "getAvatarRound", "getTitleTextColor", "getSubtitleTextColor", "getIcon", "getUrl", "getTitleColor", "getBanner", "()Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteBannerComponent;", "getItemArea", "()Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteItemAreaComponent;", "getColumnCount", "getMaxLineCount", "getAvatarRoundCorner", "getCanHide", "getPaddingTop", "getPaddingBottom", "getPaddingStart", "getPaddingEnd", "getIndicatorMargin", "getTopSearch", "()Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteComponent;", "getBannerType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lcom/huawei/digitalpayment/home/theme/data/remote/ConfigValue;Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteIconConfig;Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteIconConfig;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteIconConfig;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteBannerComponent;Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteItemAreaComponent;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteComponent;Ljava/lang/String;)Lcom/huawei/digitalpayment/home/theme/data/remote/ConfigValue;", "equals", "other", "", "hashCode", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfigValue extends BaseResp {
    private static int component3 = 1;
    private static int copydefault;
    private final Integer avatarHeight;
    private final Integer avatarRound;
    private final Integer avatarRoundCorner;
    private final Integer avatarWidth;
    private final String backgroundColor;
    private final String backgroundUrl;
    private final RemoteBannerComponent banner;
    private final String bannerType;
    private final boolean canHide;
    private final ConfigValue center;
    private final Integer columnCount;
    private final String componentType;
    private final boolean enableRefresh;
    private final String execute;
    private final List<RemoteHomeFunction> functions;
    private final Integer height;
    private final RemoteIconConfig icon;
    private final String iconStyle;
    private final Integer indicatorMargin;
    private final String indicatorPosition;
    private final String indicatorStyle;
    private final RemoteItemAreaComponent itemArea;
    private final String itemBackgroundColor;
    private final Integer itemRoundCorner;
    private final RemoteIconConfig leftIcon;
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
    private final String refreshBackgroundColor;
    private final RemoteIconConfig rightIcon;
    private final Integer roundCorner;
    private final String selectTextColor;
    private final Integer statusBarHeight;
    private final String strokeColor;
    private final Integer strokeWidth;
    private final String style;
    private final String subTitle;
    private final String subTitleColor;
    private final String subTitleExecute;
    private final String subtitleTextColor;
    private final String template;
    private final String text;
    private final String textColor;
    private final String textGravity;
    private final Integer textSize;
    private final String title;
    private final String titleColor;
    private final String titleTextColor;
    private final RemoteComponent topSearch;
    private final Integer type;
    private final String url;
    private final Integer width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfigValue(String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, String str13, List list, String str14, String str15, String str16, String str17, Integer num8, Integer num9, String str18, String str19, Integer num10, String str20, String str21, Integer num11, String str22, Integer num12, String str23, Integer num13, ConfigValue configValue, RemoteIconConfig remoteIconConfig, RemoteIconConfig remoteIconConfig2, Integer num14, Integer num15, Integer num16, String str24, String str25, RemoteIconConfig remoteIconConfig3, String str26, String str27, RemoteBannerComponent remoteBannerComponent, RemoteItemAreaComponent remoteItemAreaComponent, Integer num17, Integer num18, Integer num19, boolean z2, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, RemoteComponent remoteComponent, String str28, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num25;
        Integer num26;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        Integer num27;
        String str39;
        String str40;
        String str41;
        String str42;
        Integer num28;
        Integer num29;
        Integer num30;
        String str43;
        Integer num31;
        RemoteIconConfig remoteIconConfig4;
        int i3;
        String str44;
        RemoteItemAreaComponent remoteItemAreaComponent2;
        Object obj;
        Object obj2;
        String str45 = (i & 1) != 0 ? null : str;
        String str46 = (i & 2) != 0 ? null : str2;
        String str47 = (i & 4) != 0 ? null : str3;
        String str48 = (i & 8) != 0 ? null : str4;
        Integer num32 = (i & 16) != 0 ? null : num;
        if ((i & 32) != 0) {
            int i4 = copydefault + 109;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            num25 = null;
        } else {
            num25 = num2;
        }
        Integer num33 = (i & 64) != 0 ? null : num3;
        if ((i & 128) != 0) {
            int i6 = component3 + 15;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            num26 = null;
        } else {
            num26 = num4;
        }
        Integer num34 = (i & 256) != 0 ? null : num5;
        Integer num35 = (i & 512) != 0 ? null : num6;
        Integer num36 = (i & 1024) != 0 ? null : num7;
        String str49 = (i & 2048) != 0 ? null : str5;
        String str50 = (i & 4096) != 0 ? null : str6;
        String str51 = (i & 8192) != 0 ? "" : str7;
        if ((i & 16384) != 0) {
            int i8 = copydefault;
            str29 = str50;
            int i9 = i8 + 103;
            str30 = str49;
            component3 = i9 % 128;
            if (i9 % 2 == 0) {
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            int i10 = i8 + 29;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            str31 = "";
        } else {
            str29 = str50;
            str30 = str49;
            str31 = str8;
        }
        String str52 = (i & 32768) != 0 ? "" : str9;
        String str53 = (i & 65536) != 0 ? null : str10;
        String str54 = (i & 131072) != 0 ? null : str11;
        boolean z3 = (i & 262144) != 0 ? false : z;
        String str55 = (i & 524288) != 0 ? null : str12;
        String str56 = (i & 1048576) != 0 ? null : str13;
        List list2 = (i & 2097152) != 0 ? null : list;
        if ((i & 4194304) != 0) {
            int i13 = component3 + 43;
            str32 = str52;
            copydefault = i13 % 128;
            int i14 = i13 % 2;
            str33 = null;
        } else {
            str32 = str52;
            str33 = str14;
        }
        String str57 = (8388608 & i) != 0 ? null : str15;
        if ((i & 16777216) != 0) {
            str35 = str57;
            int i15 = component3 + 11;
            str34 = str33;
            copydefault = i15 % 128;
            str36 = null;
            if (i15 % 2 != 0) {
                str36.hashCode();
                throw null;
            }
        } else {
            str34 = str33;
            str35 = str57;
            str36 = str16;
        }
        String str58 = (33554432 & i) != 0 ? null : str17;
        Integer num37 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : num8;
        Integer num38 = (i & 134217728) != 0 ? null : num9;
        String str59 = (i & 268435456) != 0 ? null : str18;
        String str60 = (i & 536870912) != 0 ? null : str19;
        if ((i & 1073741824) != 0) {
            str38 = str58;
            int i16 = component3 + 43;
            str37 = str36;
            copydefault = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 26 / 0;
            }
            num27 = null;
        } else {
            str37 = str36;
            str38 = str58;
            num27 = num10;
        }
        String str61 = (i & Integer.MIN_VALUE) != 0 ? null : str20;
        String str62 = (i2 & 1) != 0 ? null : str21;
        Integer num39 = (i2 & 2) != 0 ? null : num11;
        if ((i2 & 4) != 0) {
            str40 = str62;
            int i18 = component3 + 115;
            str39 = str61;
            copydefault = i18 % 128;
            int i19 = i18 % 2;
            str41 = null;
        } else {
            str39 = str61;
            str40 = str62;
            str41 = str22;
        }
        Integer num40 = (i2 & 8) != 0 ? null : num12;
        String str63 = (i2 & 16) == 0 ? str23 : "";
        if ((i2 & 32) != 0) {
            num28 = num40;
            int i20 = component3 + 3;
            str42 = str41;
            copydefault = i20 % 128;
            int i21 = i20 % 2;
            num29 = null;
        } else {
            str42 = str41;
            num28 = num40;
            num29 = num13;
        }
        ConfigValue configValue2 = (i2 & 64) != 0 ? null : configValue;
        RemoteIconConfig remoteIconConfig5 = (i2 & 128) != 0 ? null : remoteIconConfig;
        RemoteIconConfig remoteIconConfig6 = (i2 & 256) != 0 ? null : remoteIconConfig2;
        if ((i2 & 512) != 0) {
            int i22 = 2 % 2;
            num30 = null;
        } else {
            num30 = num14;
        }
        Integer num41 = num30;
        Integer num42 = (i2 & 1024) != 0 ? null : num15;
        Integer num43 = (i2 & 2048) != 0 ? null : num16;
        if ((i2 & 4096) != 0) {
            int i23 = 2 % 2;
            str43 = null;
        } else {
            str43 = str24;
        }
        String str64 = str43;
        String str65 = (i2 & 8192) != 0 ? null : str25;
        RemoteIconConfig remoteIconConfig7 = (i2 & 16384) != 0 ? null : remoteIconConfig3;
        String str66 = (i2 & 32768) != 0 ? null : str26;
        String str67 = (i2 & 65536) != 0 ? null : str27;
        RemoteBannerComponent remoteBannerComponent2 = (i2 & 131072) != 0 ? null : remoteBannerComponent;
        if ((i2 & 262144) != 0) {
            remoteIconConfig4 = remoteIconConfig7;
            int i24 = component3 + 101;
            num31 = num29;
            copydefault = i24 % 128;
            i3 = 2;
            if (i24 % 2 != 0) {
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            str44 = null;
            remoteItemAreaComponent2 = null;
        } else {
            num31 = num29;
            remoteIconConfig4 = remoteIconConfig7;
            i3 = 2;
            str44 = null;
            remoteItemAreaComponent2 = remoteItemAreaComponent;
        }
        if ((i2 & 524288) != 0) {
            int i25 = i3 % i3;
            obj = str44;
        } else {
            obj = num17;
        }
        Object obj5 = (i2 & 1048576) != 0 ? str44 : num18;
        Object obj6 = (i2 & 2097152) != 0 ? str44 : num19;
        boolean z4 = (i2 & 4194304) == 0 ? z2 : false;
        Object obj7 = (i2 & 8388608) != 0 ? str44 : num20;
        Object obj8 = (i2 & 16777216) != 0 ? str44 : num21;
        Object obj9 = (i2 & 33554432) != 0 ? str44 : num22;
        Object obj10 = (i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? str44 : num23;
        if ((i2 & 134217728) != 0) {
            int i26 = 2 % 2;
            obj2 = str44;
        } else {
            obj2 = num24;
        }
        this(str45, str46, str47, str48, num32, num25, num33, num26, num34, num35, num36, str30, str29, str51, str31, str32, str53, str54, z3, str55, str56, list2, str34, str35, str37, str38, num37, num38, str59, str60, num27, str39, str40, num39, str42, num28, str63, num31, configValue2, remoteIconConfig5, remoteIconConfig6, num41, num42, num43, str64, str65, remoteIconConfig4, str66, str67, remoteBannerComponent2, remoteItemAreaComponent2, obj, obj5, obj6, z4, obj7, obj8, obj9, obj10, obj2, (i2 & 268435456) != 0 ? str44 : remoteComponent, (i2 & 536870912) == 0 ? str28 : str44);
    }

    public final String getComponentType() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 63;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.componentType;
        int i5 = i2 + 73;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getTemplate() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.template;
        int i4 = i3 + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getBackgroundColor() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 33;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.backgroundColor;
        int i5 = i2 + 45;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBackgroundUrl() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.backgroundUrl;
        int i5 = i3 + 123;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getRoundCorner() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.roundCorner;
        int i5 = i3 + 13;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return num;
    }

    public final Integer getMarginTop() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginTop;
        int i5 = i2 + 47;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer getMarginBottom() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.marginBottom;
        int i5 = i3 + 87;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getMarginStart() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.marginStart;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getMarginEnd() {
        Integer num;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 37;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.marginEnd;
            int i4 = 68 / 0;
        } else {
            num = this.marginEnd;
        }
        int i5 = i2 + 117;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getWidth() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 81;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.width;
        int i5 = i2 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getHeight() {
        Integer num;
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            num = this.height;
            int i4 = 71 / 0;
        } else {
            num = this.height;
        }
        int i5 = i3 + 65;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final String getIndicatorStyle() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.indicatorStyle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIndicatorPosition() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.indicatorPosition;
        int i5 = i3 + 99;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getPageIcon() {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.pageIcon;
        int i4 = i3 + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getPageName() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.pageName;
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return str;
    }

    public final String getPageIconActive() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.pageIconActive;
        if (i3 == 0) {
            int i4 = 4 / 0;
        }
        return str;
    }

    public final String getTextColor() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.textColor;
        }
        throw null;
    }

    public final String getSelectTextColor() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.selectTextColor;
        int i5 = i3 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getEnableRefresh() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 15;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.enableRefresh;
        int i5 = i2 + 121;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final String getRefreshBackgroundColor() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.refreshBackgroundColor;
        int i5 = i3 + 95;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getIconStyle() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iconStyle;
        int i5 = i2 + 13;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<RemoteHomeFunction> getFunctions() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<RemoteHomeFunction> list = this.functions;
        int i5 = i3 + 1;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSubTitle() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.subTitle;
        int i4 = i2 + 93;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSubTitleColor() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subTitleColor;
        int i5 = i2 + 107;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getItemBackgroundColor() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.itemBackgroundColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getItemRoundCorner() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 103;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.itemRoundCorner;
        int i5 = i2 + 91;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getMaxCount() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.maxCount;
        int i5 = i3 + 123;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return num;
    }

    public final String getSubTitleExecute() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.subTitleExecute;
        int i5 = i3 + 65;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getStyle() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.style;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getStrokeWidth() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.strokeWidth;
        }
        throw null;
    }

    public final String getStrokeColor() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.strokeColor;
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return str;
    }

    public final String getText() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 39;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.text;
        int i5 = i2 + 27;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer getTextSize() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.textSize;
        int i4 = i2 + 47;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return num;
    }

    public final String getTextGravity() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.textGravity;
        int i5 = i3 + 11;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getStatusBarHeight() {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.statusBarHeight;
        int i4 = i3 + 63;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return num;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.execute;
        int i5 = i3 + 39;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getType() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.type;
        }
        throw null;
    }

    public final ConfigValue getCenter() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConfigValue configValue = this.center;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return configValue;
    }

    public final RemoteIconConfig getRightIcon() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.rightIcon;
        }
        throw null;
    }

    public final RemoteIconConfig getLeftIcon() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        RemoteIconConfig remoteIconConfig = this.leftIcon;
        int i5 = i2 + 97;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return remoteIconConfig;
        }
        throw null;
    }

    public final Integer getAvatarWidth() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Integer num = this.avatarWidth;
        int i4 = i3 + 7;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return num;
    }

    public final Integer getAvatarHeight() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.avatarHeight;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return num;
    }

    public final Integer getAvatarRound() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.avatarRound;
        int i5 = i3 + 109;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getTitleTextColor() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.titleTextColor;
        int i4 = i3 + 57;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSubtitleTextColor() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.subtitleTextColor;
        int i4 = i3 + 37;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return str;
    }

    public final RemoteIconConfig getIcon() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        RemoteIconConfig remoteIconConfig = this.icon;
        int i5 = i2 + 125;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return remoteIconConfig;
    }

    public final String getUrl() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.url;
            int i4 = 32 / 0;
        } else {
            str = this.url;
        }
        int i5 = i2 + 91;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTitleColor() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.titleColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RemoteBannerComponent getBanner() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        RemoteBannerComponent remoteBannerComponent = this.banner;
        int i5 = i3 + 105;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return remoteBannerComponent;
    }

    public final RemoteItemAreaComponent getItemArea() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        RemoteItemAreaComponent remoteItemAreaComponent = this.itemArea;
        int i5 = i3 + 49;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return remoteItemAreaComponent;
    }

    public final Integer getColumnCount() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 123;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.columnCount;
        int i5 = i2 + 17;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getMaxLineCount() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 51;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Integer num = this.maxLineCount;
        int i4 = i2 + 51;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer getAvatarRoundCorner() {
        Integer num;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 41;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.avatarRoundCorner;
            int i4 = 78 / 0;
        } else {
            num = this.avatarRoundCorner;
        }
        int i5 = i2 + 9;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final boolean getCanHide() {
        boolean z;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 83;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.canHide;
            int i4 = 8 / 0;
        } else {
            z = this.canHide;
        }
        int i5 = i2 + 17;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Integer getPaddingTop() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 41;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.paddingTop;
        int i5 = i2 + 87;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getPaddingBottom() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 5;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.paddingBottom;
        int i5 = i2 + 77;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getPaddingStart() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.paddingStart;
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return num;
    }

    public final Integer getPaddingEnd() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.paddingEnd;
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        return num;
    }

    public final Integer getIndicatorMargin() {
        Integer num;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 69;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.indicatorMargin;
            int i4 = 95 / 0;
        } else {
            num = this.indicatorMargin;
        }
        int i5 = i2 + 7;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final RemoteComponent getTopSearch() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        RemoteComponent remoteComponent = this.topSearch;
        int i4 = i3 + 35;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return remoteComponent;
    }

    public final String getBannerType() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 21;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bannerType;
        int i5 = i2 + 103;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ConfigValue(String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, String str13, List<RemoteHomeFunction> list, String str14, String str15, String str16, String str17, Integer num8, Integer num9, String str18, String str19, Integer num10, String str20, String str21, Integer num11, String str22, Integer num12, String str23, Integer num13, ConfigValue configValue, RemoteIconConfig remoteIconConfig, RemoteIconConfig remoteIconConfig2, Integer num14, Integer num15, Integer num16, String str24, String str25, RemoteIconConfig remoteIconConfig3, String str26, String str27, RemoteBannerComponent remoteBannerComponent, RemoteItemAreaComponent remoteItemAreaComponent, Integer num17, Integer num18, Integer num19, boolean z2, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, RemoteComponent remoteComponent, String str28) {
        Intrinsics.checkNotNullParameter(str23, "");
        this.componentType = str;
        this.template = str2;
        this.backgroundColor = str3;
        this.backgroundUrl = str4;
        this.roundCorner = num;
        this.marginTop = num2;
        this.marginBottom = num3;
        this.marginStart = num4;
        this.marginEnd = num5;
        this.width = num6;
        this.height = num7;
        this.indicatorStyle = str5;
        this.indicatorPosition = str6;
        this.pageIcon = str7;
        this.pageName = str8;
        this.pageIconActive = str9;
        this.textColor = str10;
        this.selectTextColor = str11;
        this.enableRefresh = z;
        this.refreshBackgroundColor = str12;
        this.iconStyle = str13;
        this.functions = list;
        this.title = str14;
        this.subTitle = str15;
        this.subTitleColor = str16;
        this.itemBackgroundColor = str17;
        this.itemRoundCorner = num8;
        this.maxCount = num9;
        this.subTitleExecute = str18;
        this.style = str19;
        this.strokeWidth = num10;
        this.strokeColor = str20;
        this.text = str21;
        this.textSize = num11;
        this.textGravity = str22;
        this.statusBarHeight = num12;
        this.execute = str23;
        this.type = num13;
        this.center = configValue;
        this.rightIcon = remoteIconConfig;
        this.leftIcon = remoteIconConfig2;
        this.avatarWidth = num14;
        this.avatarHeight = num15;
        this.avatarRound = num16;
        this.titleTextColor = str24;
        this.subtitleTextColor = str25;
        this.icon = remoteIconConfig3;
        this.url = str26;
        this.titleColor = str27;
        this.banner = remoteBannerComponent;
        this.itemArea = remoteItemAreaComponent;
        this.columnCount = num17;
        this.maxLineCount = num18;
        this.avatarRoundCorner = num19;
        this.canHide = z2;
        this.paddingTop = num20;
        this.paddingBottom = num21;
        this.paddingStart = num22;
        this.paddingEnd = num23;
        this.indicatorMargin = num24;
        this.topSearch = remoteComponent;
        this.bannerType = str28;
    }

    public ConfigValue() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ConfigValue copy$default(ConfigValue configValue, String str, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, String str13, List list, String str14, String str15, String str16, String str17, Integer num8, Integer num9, String str18, String str19, Integer num10, String str20, String str21, Integer num11, String str22, Integer num12, String str23, Integer num13, ConfigValue configValue2, RemoteIconConfig remoteIconConfig, RemoteIconConfig remoteIconConfig2, Integer num14, Integer num15, Integer num16, String str24, String str25, RemoteIconConfig remoteIconConfig3, String str26, String str27, RemoteBannerComponent remoteBannerComponent, RemoteItemAreaComponent remoteItemAreaComponent, Integer num17, Integer num18, Integer num19, boolean z2, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, RemoteComponent remoteComponent, String str28, int i, int i2, Object obj) {
        Integer num25;
        Integer num26;
        Integer num27;
        String str29;
        String str30;
        boolean z3;
        boolean z4;
        String str31;
        String str32;
        String str33;
        String str34;
        Integer num28;
        String str35;
        String str36;
        String str37;
        Integer num29;
        Integer num30;
        RemoteIconConfig remoteIconConfig4;
        String str38;
        String str39;
        boolean z5;
        Integer num31;
        int i3 = 2 % 2;
        String str40 = (i & 1) != 0 ? configValue.componentType : str;
        String str41 = (i & 2) != 0 ? configValue.template : str2;
        String str42 = (i & 4) != 0 ? configValue.backgroundColor : str3;
        String str43 = (i & 8) != 0 ? configValue.backgroundUrl : str4;
        Object obj2 = null;
        if ((i & 16) != 0) {
            int i4 = component3 + 99;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                Integer num32 = configValue.roundCorner;
                throw null;
            }
            num25 = configValue.roundCorner;
        } else {
            num25 = num;
        }
        Integer num33 = (i & 32) != 0 ? configValue.marginTop : num2;
        Integer num34 = (i & 64) != 0 ? configValue.marginBottom : num3;
        if ((i & 128) != 0) {
            int i5 = copydefault + 65;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                Integer num35 = configValue.marginStart;
                obj2.hashCode();
                throw null;
            }
            num26 = configValue.marginStart;
        } else {
            num26 = num4;
        }
        Integer num36 = (i & 256) != 0 ? configValue.marginEnd : num5;
        Integer num37 = (i & 512) != 0 ? configValue.width : num6;
        if ((i & 1024) != 0) {
            int i6 = copydefault + 41;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            num27 = configValue.height;
        } else {
            num27 = num7;
        }
        String str44 = (i & 2048) != 0 ? configValue.indicatorStyle : str5;
        String str45 = (i & 4096) != 0 ? configValue.indicatorPosition : str6;
        String str46 = (i & 8192) != 0 ? configValue.pageIcon : str7;
        String str47 = (i & 16384) != 0 ? configValue.pageName : str8;
        String str48 = (i & 32768) != 0 ? configValue.pageIconActive : str9;
        String str49 = (i & 65536) != 0 ? configValue.textColor : str10;
        String str50 = (i & 131072) != 0 ? configValue.selectTextColor : str11;
        if ((i & 262144) != 0) {
            str29 = str50;
            int i8 = copydefault + 59;
            str30 = str44;
            component3 = i8 % 128;
            if (i8 % 2 == 0) {
                boolean z6 = configValue.enableRefresh;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            z3 = configValue.enableRefresh;
        } else {
            str29 = str50;
            str30 = str44;
            z3 = z;
        }
        String str51 = (i & 524288) != 0 ? configValue.refreshBackgroundColor : str12;
        String str52 = (i & 1048576) != 0 ? configValue.iconStyle : str13;
        List list2 = (i & 2097152) != 0 ? configValue.functions : list;
        String str53 = (i & 4194304) != 0 ? configValue.title : str14;
        String str54 = (i & 8388608) != 0 ? configValue.subTitle : str15;
        if ((i & 16777216) != 0) {
            str31 = str54;
            int i9 = copydefault + 113;
            z4 = z3;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            str32 = configValue.subTitleColor;
        } else {
            z4 = z3;
            str31 = str54;
            str32 = str16;
        }
        String str55 = (33554432 & i) != 0 ? configValue.itemBackgroundColor : str17;
        Integer num38 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? configValue.itemRoundCorner : num8;
        Integer num39 = (i & 134217728) != 0 ? configValue.maxCount : num9;
        String str56 = (i & 268435456) != 0 ? configValue.subTitleExecute : str18;
        String str57 = (i & 536870912) != 0 ? configValue.style : str19;
        if ((i & 1073741824) != 0) {
            str34 = str57;
            int i11 = copydefault + 57;
            str33 = str32;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            num28 = configValue.strokeWidth;
            if (i12 == 0) {
                int i13 = 96 / 0;
            }
        } else {
            str33 = str32;
            str34 = str57;
            num28 = num10;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            int i14 = copydefault + 3;
            component3 = i14 % 128;
            int i15 = i14 % 2;
            str35 = configValue.strokeColor;
        } else {
            str35 = str20;
        }
        String str58 = (i2 & 1) != 0 ? configValue.text : str21;
        Integer num40 = (i2 & 2) != 0 ? configValue.textSize : num11;
        String str59 = (i2 & 4) != 0 ? configValue.textGravity : str22;
        if ((i2 & 8) != 0) {
            str37 = str59;
            int i16 = component3 + 23;
            str36 = str35;
            copydefault = i16 % 128;
            int i17 = i16 % 2;
            num29 = configValue.statusBarHeight;
        } else {
            str36 = str35;
            str37 = str59;
            num29 = num12;
        }
        String str60 = (i2 & 16) != 0 ? configValue.execute : str23;
        Integer num41 = (i2 & 32) != 0 ? configValue.type : num13;
        ConfigValue configValue3 = (i2 & 64) != 0 ? configValue.center : configValue2;
        RemoteIconConfig remoteIconConfig5 = (i2 & 128) != 0 ? configValue.rightIcon : remoteIconConfig;
        RemoteIconConfig remoteIconConfig6 = (i2 & 256) != 0 ? configValue.leftIcon : remoteIconConfig2;
        Integer num42 = (i2 & 512) != 0 ? configValue.avatarWidth : num14;
        Integer num43 = (i2 & 1024) != 0 ? configValue.avatarHeight : num15;
        Integer num44 = (i2 & 2048) != 0 ? configValue.avatarRound : num16;
        String str61 = (i2 & 4096) != 0 ? configValue.titleTextColor : str24;
        String str62 = (i2 & 8192) != 0 ? configValue.subtitleTextColor : str25;
        RemoteIconConfig remoteIconConfig7 = (i2 & 16384) != 0 ? configValue.icon : remoteIconConfig3;
        if ((i2 & 32768) != 0) {
            remoteIconConfig4 = remoteIconConfig7;
            int i18 = component3 + 39;
            num30 = num29;
            copydefault = i18 % 128;
            int i19 = i18 % 2;
            str38 = configValue.url;
        } else {
            num30 = num29;
            remoteIconConfig4 = remoteIconConfig7;
            str38 = str26;
        }
        String str63 = (i2 & 65536) != 0 ? configValue.titleColor : str27;
        RemoteBannerComponent remoteBannerComponent2 = (i2 & 131072) != 0 ? configValue.banner : remoteBannerComponent;
        RemoteItemAreaComponent remoteItemAreaComponent2 = (i2 & 262144) != 0 ? configValue.itemArea : remoteItemAreaComponent;
        Integer num45 = (i2 & 524288) != 0 ? configValue.columnCount : num17;
        Integer num46 = (i2 & 1048576) != 0 ? configValue.maxLineCount : num18;
        Integer num47 = (i2 & 2097152) != 0 ? configValue.avatarRoundCorner : num19;
        boolean z7 = (i2 & 4194304) != 0 ? configValue.canHide : z2;
        if ((i2 & 8388608) != 0) {
            z5 = z7;
            int i20 = copydefault + 37;
            str39 = str38;
            component3 = i20 % 128;
            int i21 = i20 % 2;
            num31 = configValue.paddingTop;
        } else {
            str39 = str38;
            z5 = z7;
            num31 = num20;
        }
        return configValue.copy(str40, str41, str42, str43, num25, num33, num34, num26, num36, num37, num27, str30, str45, str46, str47, str48, str49, str29, z4, str51, str52, list2, str53, str31, str33, str55, num38, num39, str56, str34, num28, str36, str58, num40, str37, num30, str60, num41, configValue3, remoteIconConfig5, remoteIconConfig6, num42, num43, num44, str61, str62, remoteIconConfig4, str39, str63, remoteBannerComponent2, remoteItemAreaComponent2, num45, num46, num47, z5, num31, (16777216 & i2) != 0 ? configValue.paddingBottom : num21, (i2 & 33554432) != 0 ? configValue.paddingStart : num22, (i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? configValue.paddingEnd : num23, (i2 & 134217728) != 0 ? configValue.indicatorMargin : num24, (i2 & 268435456) != 0 ? configValue.topSearch : remoteComponent, (i2 & 536870912) != 0 ? configValue.bannerType : str28);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.componentType;
        int i5 = i2 + 45;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    public final Integer component10() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.width;
        int i5 = i3 + 117;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component11() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.height;
        int i4 = i3 + 37;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return num;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.indicatorStyle;
        int i5 = i3 + 117;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component13() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 47;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.indicatorPosition;
            int i4 = 93 / 0;
        } else {
            str = this.indicatorPosition;
        }
        int i5 = i2 + 59;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.pageIcon;
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.pageName;
        int i5 = i3 + 49;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 121;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pageIconActive;
        int i5 = i2 + 13;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.textColor;
        int i5 = i3 + 29;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.selectTextColor;
        }
        throw null;
    }

    public final boolean component19() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.enableRefresh;
        int i4 = i3 + 7;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.template;
        int i5 = i3 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component20() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.refreshBackgroundColor;
        int i5 = i3 + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component21() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.iconStyle;
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return str;
    }

    public final List<RemoteHomeFunction> component22() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 35;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<RemoteHomeFunction> list = this.functions;
        int i5 = i2 + 105;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component23() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 7;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 7;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component24() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 29;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subTitle;
        int i5 = i2 + 29;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component25() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.subTitleColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component26() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.itemBackgroundColor;
            int i4 = 58 / 0;
        } else {
            str = this.itemBackgroundColor;
        }
        int i5 = i3 + 109;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer component27() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.itemRoundCorner;
        int i5 = i2 + 73;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component28() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.maxCount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component29() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 125;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subTitleExecute;
        int i5 = i2 + 35;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.backgroundColor;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return str;
    }

    public final String component30() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.style;
        int i5 = i2 + 3;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component31() {
        Integer num;
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            num = this.strokeWidth;
            int i4 = 2 / 0;
        } else {
            num = this.strokeWidth;
        }
        int i5 = i3 + 23;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component32() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.strokeColor;
        int i5 = i3 + 101;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component33() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.text;
        int i5 = i3 + 71;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Integer component34() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.textSize;
        int i5 = i3 + 107;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component35() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.textGravity;
            int i4 = 20 / 0;
        } else {
            str = this.textGravity;
        }
        int i5 = i2 + 35;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component36() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.statusBarHeight;
        int i4 = i3 + 107;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final String component37() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 39;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component38() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 83;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.type;
        int i5 = i2 + 7;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ConfigValue component39() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 57;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        ConfigValue configValue = this.center;
        int i5 = i2 + 17;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return configValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.backgroundUrl;
        int i5 = i3 + 47;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final RemoteIconConfig component40() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RemoteIconConfig remoteIconConfig = this.rightIcon;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return remoteIconConfig;
    }

    public final RemoteIconConfig component41() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.leftIcon;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component42() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 25;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.avatarWidth;
        int i4 = i2 + 3;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer component43() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.avatarHeight;
        int i5 = i2 + 53;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final Integer component44() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.avatarRound;
        int i5 = i3 + 97;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final String component45() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.titleTextColor;
        int i5 = i2 + 3;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component46() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 19;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.subtitleTextColor;
        int i4 = i2 + 21;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final RemoteIconConfig component47() {
        RemoteIconConfig remoteIconConfig;
        int i = 2 % 2;
        int i2 = copydefault + 67;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            remoteIconConfig = this.icon;
            int i4 = 11 / 0;
        } else {
            remoteIconConfig = this.icon;
        }
        int i5 = i3 + 47;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return remoteIconConfig;
        }
        throw null;
    }

    public final String component48() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 117;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 47;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public final String component49() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.titleColor;
        int i5 = i3 + 13;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 95;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.roundCorner;
        int i5 = i2 + 63;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final RemoteBannerComponent component50() {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        RemoteBannerComponent remoteBannerComponent = this.banner;
        int i4 = i3 + 125;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return remoteBannerComponent;
        }
        throw null;
    }

    public final RemoteItemAreaComponent component51() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 75;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RemoteItemAreaComponent remoteItemAreaComponent = this.itemArea;
        int i4 = i2 + 37;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return remoteItemAreaComponent;
    }

    public final Integer component52() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Integer num = this.columnCount;
        int i4 = i2 + 33;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return num;
    }

    public final Integer component53() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.maxLineCount;
        int i5 = i3 + 33;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component54() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 91;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.avatarRoundCorner;
        int i5 = i2 + 99;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component55() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.canHide;
        int i4 = i3 + 79;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final Integer component56() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.paddingTop;
        int i5 = i2 + 9;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component57() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 43;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.paddingBottom;
        int i5 = i2 + 63;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer component58() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.paddingStart;
        }
        throw null;
    }

    public final Integer component59() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.paddingEnd;
        int i5 = i3 + 45;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return num;
    }

    public final Integer component6() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginTop;
        int i5 = i2 + 49;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component60() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.indicatorMargin;
        int i5 = i3 + 71;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final RemoteComponent component61() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        RemoteComponent remoteComponent = this.topSearch;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return remoteComponent;
    }

    public final String component62() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 63;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bannerType;
        int i5 = i2 + 21;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    public final Integer component7() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginBottom;
        int i5 = i2 + 33;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component8() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Integer num = this.marginStart;
        int i4 = i3 + 3;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    public final Integer component9() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.marginEnd;
        }
        throw null;
    }

    public final ConfigValue copy(String componentType, String template, String backgroundColor, String backgroundUrl, Integer roundCorner, Integer marginTop, Integer marginBottom, Integer marginStart, Integer marginEnd, Integer width, Integer height, String indicatorStyle, String indicatorPosition, String pageIcon, String pageName, String pageIconActive, String textColor, String selectTextColor, boolean enableRefresh, String refreshBackgroundColor, String iconStyle, List<RemoteHomeFunction> functions, String title, String subTitle, String subTitleColor, String itemBackgroundColor, Integer itemRoundCorner, Integer maxCount, String subTitleExecute, String style, Integer strokeWidth, String strokeColor, String text, Integer textSize, String textGravity, Integer statusBarHeight, String execute, Integer type, ConfigValue center, RemoteIconConfig rightIcon, RemoteIconConfig leftIcon, Integer avatarWidth, Integer avatarHeight, Integer avatarRound, String titleTextColor, String subtitleTextColor, RemoteIconConfig icon, String url, String titleColor, RemoteBannerComponent banner, RemoteItemAreaComponent itemArea, Integer columnCount, Integer maxLineCount, Integer avatarRoundCorner, boolean canHide, Integer paddingTop, Integer paddingBottom, Integer paddingStart, Integer paddingEnd, Integer indicatorMargin, RemoteComponent topSearch, String bannerType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(execute, "");
        ConfigValue configValue = new ConfigValue(componentType, template, backgroundColor, backgroundUrl, roundCorner, marginTop, marginBottom, marginStart, marginEnd, width, height, indicatorStyle, indicatorPosition, pageIcon, pageName, pageIconActive, textColor, selectTextColor, enableRefresh, refreshBackgroundColor, iconStyle, functions, title, subTitle, subTitleColor, itemBackgroundColor, itemRoundCorner, maxCount, subTitleExecute, style, strokeWidth, strokeColor, text, textSize, textGravity, statusBarHeight, execute, type, center, rightIcon, leftIcon, avatarWidth, avatarHeight, avatarRound, titleTextColor, subtitleTextColor, icon, url, titleColor, banner, itemArea, columnCount, maxLineCount, avatarRoundCorner, canHide, paddingTop, paddingBottom, paddingStart, paddingEnd, indicatorMargin, topSearch, bannerType);
        int i2 = copydefault + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return configValue;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigValue)) {
            return false;
        }
        ConfigValue configValue = (ConfigValue) other;
        if (!Intrinsics.areEqual(this.componentType, configValue.componentType) || !Intrinsics.areEqual(this.template, configValue.template) || !Intrinsics.areEqual(this.backgroundColor, configValue.backgroundColor) || !Intrinsics.areEqual(this.backgroundUrl, configValue.backgroundUrl) || !Intrinsics.areEqual(this.roundCorner, configValue.roundCorner)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.marginTop, configValue.marginTop)) {
            int i2 = component3 + 83;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.marginBottom, configValue.marginBottom) || !Intrinsics.areEqual(this.marginStart, configValue.marginStart) || !Intrinsics.areEqual(this.marginEnd, configValue.marginEnd) || !Intrinsics.areEqual(this.width, configValue.width) || !Intrinsics.areEqual(this.height, configValue.height) || !Intrinsics.areEqual(this.indicatorStyle, configValue.indicatorStyle) || !Intrinsics.areEqual(this.indicatorPosition, configValue.indicatorPosition) || !Intrinsics.areEqual(this.pageIcon, configValue.pageIcon) || !Intrinsics.areEqual(this.pageName, configValue.pageName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.pageIconActive, configValue.pageIconActive)) {
            int i4 = component3 + 75;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.textColor, configValue.textColor) || !Intrinsics.areEqual(this.selectTextColor, configValue.selectTextColor) || this.enableRefresh != configValue.enableRefresh) {
            return false;
        }
        if (!Intrinsics.areEqual(this.refreshBackgroundColor, configValue.refreshBackgroundColor)) {
            int i6 = copydefault + 29;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.iconStyle, configValue.iconStyle) || !Intrinsics.areEqual(this.functions, configValue.functions) || !Intrinsics.areEqual(this.title, configValue.title) || !Intrinsics.areEqual(this.subTitle, configValue.subTitle) || !Intrinsics.areEqual(this.subTitleColor, configValue.subTitleColor) || (!Intrinsics.areEqual(this.itemBackgroundColor, configValue.itemBackgroundColor)) || !Intrinsics.areEqual(this.itemRoundCorner, configValue.itemRoundCorner) || !Intrinsics.areEqual(this.maxCount, configValue.maxCount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.subTitleExecute, configValue.subTitleExecute)) {
            int i8 = copydefault + 91;
            component3 = i8 % 128;
            return i8 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.style, configValue.style) || !Intrinsics.areEqual(this.strokeWidth, configValue.strokeWidth) || !Intrinsics.areEqual(this.strokeColor, configValue.strokeColor) || !Intrinsics.areEqual(this.text, configValue.text)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.textSize, configValue.textSize)) {
            int i9 = copydefault + 93;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.textGravity, configValue.textGravity) || !Intrinsics.areEqual(this.statusBarHeight, configValue.statusBarHeight) || !Intrinsics.areEqual(this.execute, configValue.execute) || !Intrinsics.areEqual(this.type, configValue.type) || !Intrinsics.areEqual(this.center, configValue.center) || !Intrinsics.areEqual(this.rightIcon, configValue.rightIcon) || !Intrinsics.areEqual(this.leftIcon, configValue.leftIcon)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.avatarWidth, configValue.avatarWidth)) {
            int i11 = copydefault + 81;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.avatarHeight, configValue.avatarHeight) || !Intrinsics.areEqual(this.avatarRound, configValue.avatarRound) || !Intrinsics.areEqual(this.titleTextColor, configValue.titleTextColor) || !Intrinsics.areEqual(this.subtitleTextColor, configValue.subtitleTextColor)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.icon, configValue.icon)) {
            int i13 = copydefault + 87;
            component3 = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.url, configValue.url) || !Intrinsics.areEqual(this.titleColor, configValue.titleColor) || !Intrinsics.areEqual(this.banner, configValue.banner) || !Intrinsics.areEqual(this.itemArea, configValue.itemArea) || !Intrinsics.areEqual(this.columnCount, configValue.columnCount) || !Intrinsics.areEqual(this.maxLineCount, configValue.maxLineCount) || !Intrinsics.areEqual(this.avatarRoundCorner, configValue.avatarRoundCorner)) {
            return false;
        }
        if (this.canHide != configValue.canHide) {
            int i15 = copydefault + 111;
            component3 = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.paddingTop, configValue.paddingTop) || !Intrinsics.areEqual(this.paddingBottom, configValue.paddingBottom) || !Intrinsics.areEqual(this.paddingStart, configValue.paddingStart)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.paddingEnd, configValue.paddingEnd)) {
            int i17 = copydefault + 1;
            component3 = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.indicatorMargin, configValue.indicatorMargin) || !Intrinsics.areEqual(this.topSearch, configValue.topSearch)) {
            return false;
        }
        if (Intrinsics.areEqual(this.bannerType, configValue.bannerType)) {
            return true;
        }
        int i19 = copydefault + 15;
        component3 = i19 % 128;
        if (i19 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i;
        int iHashCode4;
        int i2;
        int i3;
        int iHashCode5;
        int i4;
        int iHashCode6;
        int i5;
        int iHashCode7;
        int i6;
        int i7;
        int i8;
        int iHashCode8;
        int i9 = 2 % 2;
        String str = this.componentType;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.template;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.backgroundColor;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.backgroundUrl;
        int iHashCode12 = str4 == null ? 0 : str4.hashCode();
        Integer num = this.roundCorner;
        int iHashCode13 = num == null ? 0 : num.hashCode();
        Integer num2 = this.marginTop;
        int iHashCode14 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.marginBottom;
        if (num3 == null) {
            int i10 = copydefault + 11;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num3.hashCode();
        }
        Integer num4 = this.marginStart;
        int iHashCode15 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.marginEnd;
        int iHashCode16 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.width;
        if (num6 == null) {
            int i12 = copydefault + 11;
            component3 = i12 % 128;
            iHashCode2 = i12 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = num6.hashCode();
        }
        Integer num7 = this.height;
        if (num7 == null) {
            int i13 = component3 + 73;
            copydefault = i13 % 128;
            int i14 = i13 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = num7.hashCode();
        }
        String str5 = this.indicatorStyle;
        int iHashCode17 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.indicatorPosition;
        int iHashCode18 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.pageIcon;
        if (str7 == null) {
            int i15 = copydefault + 71;
            i = iHashCode18;
            component3 = i15 % 128;
            int i16 = i15 % 2;
            iHashCode4 = 0;
        } else {
            i = iHashCode18;
            iHashCode4 = str7.hashCode();
        }
        String str8 = this.pageName;
        if (str8 == null) {
            i2 = 0;
        } else {
            int iHashCode19 = str8.hashCode();
            int i17 = component3 + 73;
            copydefault = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 5 / 4;
            }
            i2 = iHashCode19;
        }
        String str9 = this.pageIconActive;
        int iHashCode20 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.textColor;
        int iHashCode21 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.selectTextColor;
        int iHashCode22 = str11 == null ? 0 : str11.hashCode();
        int iHashCode23 = Boolean.hashCode(this.enableRefresh);
        String str12 = this.refreshBackgroundColor;
        int iHashCode24 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.iconStyle;
        int iHashCode25 = str13 == null ? 0 : str13.hashCode();
        List<RemoteHomeFunction> list = this.functions;
        int iHashCode26 = list == null ? 0 : list.hashCode();
        String str14 = this.title;
        int iHashCode27 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.subTitle;
        int iHashCode28 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.subTitleColor;
        int iHashCode29 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.itemBackgroundColor;
        if (str17 == null) {
            int i19 = copydefault + 111;
            i3 = i2;
            component3 = i19 % 128;
            int i20 = i19 % 2;
            iHashCode5 = 0;
        } else {
            i3 = i2;
            iHashCode5 = str17.hashCode();
        }
        Integer num8 = this.itemRoundCorner;
        int iHashCode30 = num8 == null ? 0 : num8.hashCode();
        Integer num9 = this.maxCount;
        int iHashCode31 = num9 == null ? 0 : num9.hashCode();
        String str18 = this.subTitleExecute;
        if (str18 == null) {
            int i21 = component3 + 125;
            i4 = iHashCode5;
            copydefault = i21 % 128;
            int i22 = i21 % 2;
            iHashCode6 = 0;
        } else {
            i4 = iHashCode5;
            iHashCode6 = str18.hashCode();
        }
        String str19 = this.style;
        int iHashCode32 = str19 == null ? 0 : str19.hashCode();
        Integer num10 = this.strokeWidth;
        int iHashCode33 = num10 == null ? 0 : num10.hashCode();
        String str20 = this.strokeColor;
        int iHashCode34 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.text;
        int iHashCode35 = str21 == null ? 0 : str21.hashCode();
        Integer num11 = this.textSize;
        int iHashCode36 = num11 == null ? 0 : num11.hashCode();
        String str22 = this.textGravity;
        int iHashCode37 = str22 == null ? 0 : str22.hashCode();
        Integer num12 = this.statusBarHeight;
        if (num12 == null) {
            int i23 = component3 + 17;
            i5 = iHashCode6;
            copydefault = i23 % 128;
            int i24 = i23 % 2;
            iHashCode7 = 0;
        } else {
            i5 = iHashCode6;
            iHashCode7 = num12.hashCode();
        }
        int iHashCode38 = this.execute.hashCode();
        Integer num13 = this.type;
        int iHashCode39 = num13 == null ? 0 : num13.hashCode();
        ConfigValue configValue = this.center;
        int iHashCode40 = configValue == null ? 0 : configValue.hashCode();
        RemoteIconConfig remoteIconConfig = this.rightIcon;
        int iHashCode41 = remoteIconConfig == null ? 0 : remoteIconConfig.hashCode();
        RemoteIconConfig remoteIconConfig2 = this.leftIcon;
        int iHashCode42 = remoteIconConfig2 == null ? 0 : remoteIconConfig2.hashCode();
        Integer num14 = this.avatarWidth;
        int iHashCode43 = num14 == null ? 0 : num14.hashCode();
        Integer num15 = this.avatarHeight;
        int iHashCode44 = num15 == null ? 0 : num15.hashCode();
        Integer num16 = this.avatarRound;
        int iHashCode45 = num16 == null ? 0 : num16.hashCode();
        String str23 = this.titleTextColor;
        int iHashCode46 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.subtitleTextColor;
        int iHashCode47 = str24 == null ? 0 : str24.hashCode();
        RemoteIconConfig remoteIconConfig3 = this.icon;
        int iHashCode48 = remoteIconConfig3 == null ? 0 : remoteIconConfig3.hashCode();
        String str25 = this.url;
        int iHashCode49 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.titleColor;
        int iHashCode50 = str26 == null ? 0 : str26.hashCode();
        RemoteBannerComponent remoteBannerComponent = this.banner;
        if (remoteBannerComponent == null) {
            i6 = iHashCode7;
            i7 = 0;
        } else {
            int iHashCode51 = remoteBannerComponent.hashCode();
            int i25 = copydefault + 117;
            i6 = iHashCode7;
            component3 = i25 % 128;
            int i26 = i25 % 2;
            i7 = iHashCode51;
        }
        RemoteItemAreaComponent remoteItemAreaComponent = this.itemArea;
        int iHashCode52 = remoteItemAreaComponent == null ? 0 : remoteItemAreaComponent.hashCode();
        Integer num17 = this.columnCount;
        int iHashCode53 = num17 == null ? 0 : num17.hashCode();
        Integer num18 = this.maxLineCount;
        int iHashCode54 = num18 == null ? 0 : num18.hashCode();
        Integer num19 = this.avatarRoundCorner;
        int iHashCode55 = num19 == null ? 0 : num19.hashCode();
        int iHashCode56 = Boolean.hashCode(this.canHide);
        Integer num20 = this.paddingTop;
        int iHashCode57 = num20 == null ? 0 : num20.hashCode();
        Integer num21 = this.paddingBottom;
        int iHashCode58 = num21 == null ? 0 : num21.hashCode();
        Integer num22 = this.paddingStart;
        if (num22 == null) {
            int i27 = component3 + 65;
            i8 = i7;
            copydefault = i27 % 128;
            int i28 = i27 % 2;
            iHashCode8 = 0;
        } else {
            i8 = i7;
            iHashCode8 = num22.hashCode();
        }
        Integer num23 = this.paddingEnd;
        int iHashCode59 = num23 == null ? 0 : num23.hashCode();
        Integer num24 = this.indicatorMargin;
        int iHashCode60 = num24 == null ? 0 : num24.hashCode();
        RemoteComponent remoteComponent = this.topSearch;
        int iHashCode61 = remoteComponent == null ? 0 : remoteComponent.hashCode();
        String str27 = this.bannerType;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode9 * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode17) * 31) + i) * 31) + iHashCode4) * 31) + i3) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + i4) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + i5) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + i6) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + i8) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode8) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + (str27 == null ? 0 : str27.hashCode());
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ConfigValue(componentType=" + this.componentType + ", template=" + this.template + ", backgroundColor=" + this.backgroundColor + ", backgroundUrl=" + this.backgroundUrl + ", roundCorner=" + this.roundCorner + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", width=" + this.width + ", height=" + this.height + ", indicatorStyle=" + this.indicatorStyle + ", indicatorPosition=" + this.indicatorPosition + ", pageIcon=" + this.pageIcon + ", pageName=" + this.pageName + ", pageIconActive=" + this.pageIconActive + ", textColor=" + this.textColor + ", selectTextColor=" + this.selectTextColor + ", enableRefresh=" + this.enableRefresh + ", refreshBackgroundColor=" + this.refreshBackgroundColor + ", iconStyle=" + this.iconStyle + ", functions=" + this.functions + ", title=" + this.title + ", subTitle=" + this.subTitle + ", subTitleColor=" + this.subTitleColor + ", itemBackgroundColor=" + this.itemBackgroundColor + ", itemRoundCorner=" + this.itemRoundCorner + ", maxCount=" + this.maxCount + ", subTitleExecute=" + this.subTitleExecute + ", style=" + this.style + ", strokeWidth=" + this.strokeWidth + ", strokeColor=" + this.strokeColor + ", text=" + this.text + ", textSize=" + this.textSize + ", textGravity=" + this.textGravity + ", statusBarHeight=" + this.statusBarHeight + ", execute=" + this.execute + ", type=" + this.type + ", center=" + this.center + ", rightIcon=" + this.rightIcon + ", leftIcon=" + this.leftIcon + ", avatarWidth=" + this.avatarWidth + ", avatarHeight=" + this.avatarHeight + ", avatarRound=" + this.avatarRound + ", titleTextColor=" + this.titleTextColor + ", subtitleTextColor=" + this.subtitleTextColor + ", icon=" + this.icon + ", url=" + this.url + ", titleColor=" + this.titleColor + ", banner=" + this.banner + ", itemArea=" + this.itemArea + ", columnCount=" + this.columnCount + ", maxLineCount=" + this.maxLineCount + ", avatarRoundCorner=" + this.avatarRoundCorner + ", canHide=" + this.canHide + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", indicatorMargin=" + this.indicatorMargin + ", topSearch=" + this.topSearch + ", bannerType=" + this.bannerType + ")";
        int i2 = copydefault + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
