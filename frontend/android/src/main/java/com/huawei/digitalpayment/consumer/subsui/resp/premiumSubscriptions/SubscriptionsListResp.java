package com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions;

import android.content.Context;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.griver.core.GriverParams;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÇ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u001aH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/resp/premiumSubscriptions/SubscriptionsListResp;", "Landroid/os/Parcelable;", "activeItems", "", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, GriverParams.ShareParams.IMAGE_URL, "platform", "subscriptions", "", "Lcom/huawei/digitalpayment/consumer/subsui/resp/premiumSubscriptions/Subscription;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getActiveItems", "()Ljava/lang/String;", "getCategory", "getImageUrl", "getPlatform", "getSubscriptions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubscriptionsListResp implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SubscriptionsListResp> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;

    @SerializedName("activeItems")
    private final String activeItems;

    @SerializedName(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY)
    private final String category;

    @SerializedName(GriverParams.ShareParams.IMAGE_URL)
    private final String imageUrl;

    @SerializedName("platform")
    private final String platform;

    @SerializedName("subscriptions")
    private final List<Subscription> subscriptions;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SubscriptionsListResp> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SubscriptionsListResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = component2 + 53;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(Subscription.CREATOR.createFromParcel(parcel));
                i3++;
                int i6 = component2 + 73;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 4;
                }
            }
            return new SubscriptionsListResp(string, string2, string3, string4, arrayList);
        }

        @Override
        public SubscriptionsListResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 91;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            SubscriptionsListResp subscriptionsListRespCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 103;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return subscriptionsListRespCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SubscriptionsListResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 91;
            component1 = i3 % 128;
            SubscriptionsListResp[] subscriptionsListRespArr = new SubscriptionsListResp[i];
            if (i3 % 2 != 0) {
                return subscriptionsListRespArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public SubscriptionsListResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 77;
            component1 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            SubscriptionsListResp[] subscriptionsListRespArrNewArray = newArray(i);
            int i4 = component1 + 49;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return subscriptionsListRespArrNewArray;
            }
            obj.hashCode();
            throw null;
        }
    }

    public SubscriptionsListResp(String str, String str2, String str3, String str4, List<Subscription> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.activeItems = str;
        this.category = str2;
        this.imageUrl = str3;
        this.platform = str4;
        this.subscriptions = list;
    }

    public final String getActiveItems() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.activeItems;
        }
        throw null;
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 115;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.category;
        int i5 = i2 + 61;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getImageUrl() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.imageUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPlatform() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.platform;
        int i5 = i3 + 1;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Subscription> getSubscriptions() throws Throwable {
        long j;
        int i;
        long j2;
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = component3 + 55;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - Color.green(0), Color.blue(0) + 33, (char) (19696 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 518907119, false, "component3", null);
            }
            int i7 = ((Field) objCopydefault).getInt(null);
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - Color.blue(0), 29 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) Color.red(0), 55511118, false, "component2", null);
            }
            i3 = ((Field) objCopydefault2).getInt(null);
            j = i3;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36, TextUtils.indexOf("", "") + 30, (char) (TextUtils.lastIndexOf("", '0') + 1), 58536393, false, "component3", null);
            }
            i = ((Field) objCopydefault3).getInt(null);
            long j3 = -712;
            long j4 = -1;
            long j5 = j4 ^ (-1239131581319754291L);
            long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
            long j6 = jMaxMemory ^ j4;
            long j7 = (j6 | 2031835034963958715L) ^ j4;
            j2 = (((long) (-711)) * 2031835034963958715L) + (((long) 713) * (-1239131581319754291L)) + ((((j5 | 2031835034963958715L) ^ j4) | j7) * j3) + (j3 * ((((j5 | j6) | 2031835034963958715L) ^ j4) | (j4 ^ ((-72128551234576385L) | jMaxMemory)))) + (((long) 712) * (j5 | j7));
            i2 = i7;
            i4 = 1;
        } else {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 67, 33 - KeyEvent.normalizeMetaState(0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 19696), 518907119, false, "component3", null);
            }
            int i8 = ((Field) objCopydefault4).getInt(null);
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault5 == null) {
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 30, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 55511118, false, "component2", null);
            }
            int i9 = ((Field) objCopydefault5).getInt(null);
            j = i9;
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 37, Color.blue(0) + 30, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 58536393, false, "component3", null);
            }
            i = ((Field) objCopydefault6).getInt(null);
            long j8 = -560;
            long jMyTid = Process.myTid();
            long j9 = -1;
            long j10 = jMyTid ^ j9;
            j2 = (((long) (-559)) * 4229910342462065765L) + (((long) 561) * (-3437206888817861341L)) + (((j10 | 4229910342462065765L) ^ j9) * j8) + (j8 * ((((j9 ^ (-3437206888817861341L)) | 4229910342462065765L) | jMyTid) ^ j9)) + (((long) 560) * ((j9 ^ (j10 | (-3437206888817861341L))) | (((4229910342462065765L ^ j9) | (-3437206888817861341L)) ^ j9)));
            i2 = i8;
            i3 = i9;
            i4 = 0;
        }
        while (true) {
            for (int i10 = 0; i10 != 8; i10++) {
                int i11 = component3 + 49;
                component2 = i11 % 128;
                int i12 = i11 % 2;
                i = (((((int) (j >> i10)) & 255) + (i << 6)) + (i << 16)) - i;
            }
            if (i4 != 0) {
                break;
            }
            i4++;
            j = j2;
        }
        if (i != i2) {
            int i13 = component3 + 47;
            component2 = i13 % 128;
            int i14 = i13 % 2;
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault7 == null) {
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 67, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32, (char) (19696 - Color.argb(0, 0, 0, 0)), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault7).get(null);
            long j11 = -1;
            long j12 = 0;
            long j13 = (((j11 - ((j11 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i2 ^ i3))) | (((long) 1) << 32) | (j12 - ((j12 >> 63) << 32));
            try {
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.indexOf("", "", 0, 0), 42 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault8).invoke(null, null);
                Object[] objArr = {1450519892, Long.valueOf(j13), obj, null, false, false};
                Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault9 == null) {
                    objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 56 - ((Process.getThreadPriority(0) + 20) >> 6), (char) Color.argb(0, 0, 0, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault9).invoke(objInvoke, objArr);
                Toast.makeText((Context) null, i3 / (((i3 - 1) * i3) % 2), 0).show();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return this.subscriptions;
    }

    static {
        int i = component1 + 13;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SubscriptionsListResp copy$default(SubscriptionsListResp subscriptionsListResp, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = subscriptionsListResp.activeItems;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            int i3 = component2 + 99;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str2 = subscriptionsListResp.category;
        }
        String str6 = str2;
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i5 = component2 + 23;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                String str7 = subscriptionsListResp.imageUrl;
                throw null;
            }
            str3 = subscriptionsListResp.imageUrl;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            int i6 = component3 + 115;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                String str9 = subscriptionsListResp.platform;
                obj2.hashCode();
                throw null;
            }
            str4 = subscriptionsListResp.platform;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            int i7 = component3 + 37;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            list = subscriptionsListResp.subscriptions;
            if (i8 == 0) {
                int i9 = 8 / 0;
            }
        }
        return subscriptionsListResp.copy(str5, str6, str8, str10, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.activeItems;
        int i5 = i3 + 109;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 103;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.category;
        int i4 = i2 + 73;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.imageUrl;
        int i5 = i3 + 113;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.platform;
        int i5 = i2 + 47;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Subscription> component5() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<Subscription> list = this.subscriptions;
        int i4 = i3 + 35;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final SubscriptionsListResp copy(String activeItems, String category, String imageUrl, String platform, List<Subscription> subscriptions) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(activeItems, "");
        Intrinsics.checkNotNullParameter(category, "");
        Intrinsics.checkNotNullParameter(imageUrl, "");
        Intrinsics.checkNotNullParameter(platform, "");
        Intrinsics.checkNotNullParameter(subscriptions, "");
        SubscriptionsListResp subscriptionsListResp = new SubscriptionsListResp(activeItems, category, imageUrl, platform, subscriptions);
        int i2 = component3 + 67;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 20 / 0;
        }
        return subscriptionsListResp;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 41;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 71;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 87;
            component2 = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!(other instanceof SubscriptionsListResp)) {
            return false;
        }
        SubscriptionsListResp subscriptionsListResp = (SubscriptionsListResp) other;
        if (!Intrinsics.areEqual(this.activeItems, subscriptionsListResp.activeItems)) {
            int i6 = component2 + 75;
            component3 = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.category, subscriptionsListResp.category)) {
            int i7 = component2 + 117;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.imageUrl, subscriptionsListResp.imageUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.platform, subscriptionsListResp.platform)) {
            int i9 = component2 + 109;
            component3 = i9 % 128;
            return i9 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.subscriptions, subscriptionsListResp.subscriptions)) {
            return true;
        }
        int i10 = component3 + 51;
        component2 = i10 % 128;
        return i10 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.activeItems.hashCode() * 31) + this.category.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.subscriptions.hashCode();
        int i4 = component3 + 91;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SubscriptionsListResp(activeItems=" + this.activeItems + ", category=" + this.category + ", imageUrl=" + this.imageUrl + ", platform=" + this.platform + ", subscriptions=" + this.subscriptions + ")";
        int i2 = component3 + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.activeItems);
        dest.writeString(this.category);
        dest.writeString(this.imageUrl);
        dest.writeString(this.platform);
        List<Subscription> list = this.subscriptions;
        dest.writeInt(list.size());
        Iterator<Subscription> it = list.iterator();
        while (it.hasNext()) {
            int i4 = component3 + 91;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            it.next().writeToParcel(dest, flags);
        }
    }
}
