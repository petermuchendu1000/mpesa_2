package com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.engine.common.track.recovery.DeepRecoverARiverProxy;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.CharUtils;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110\rHÆ\u0003J\u0094\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rHÇ\u0001¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020\bH\u0007J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H×\u0003J\t\u00105\u001a\u00020\bH×\u0001J\t\u00106\u001a\u00020\u0003H×\u0001J\u0018\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001aR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 ¨\u0006<"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/model/MiniApp;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "antId", "name", "description", "color", "", "iconUrl", "featuredUrl", "order", "discoveryCategories", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/model/DiscoveryCategory;", "promotedOrder", "miniAppOrderPerCategory", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/model/MiniAppOrderInDiscoveryCategory;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getAntId", "getName", "getDescription", "getColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIconUrl", "getFeaturedUrl", "getOrder", "getDiscoveryCategories", "()Ljava/util/List;", "getPromotedOrder", "getMiniAppOrderPerCategory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;)Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/model/MiniApp;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniApp implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MiniApp> CREATOR;
    private static int component1;
    private static int component3;
    private final String antId;
    private final Integer color;
    private final String description;
    private final List<DiscoveryCategory> discoveryCategories;
    private final String featuredUrl;
    private final String iconUrl;
    private final String id;
    private final List<MiniAppOrderInDiscoveryCategory> miniAppOrderPerCategory;
    private final String name;
    private final Integer order;
    private final Integer promotedOrder;
    private static final byte[] $$c = {79, 7, -80, -125};
    private static final int $$d = 198;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {112, 44, -46, -27, -38, -24, -29, -25, -25, -17, -35, -32, 39};
    private static final int $$b = 83;
    private static int copydefault = 0;
    private static int component2 = 1;
    private static int ShareDataUIState = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MiniApp> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MiniApp createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer num;
            Integer numValueOf2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Object obj = null;
            if (parcel.readInt() == 0) {
                int i2 = component3 + 21;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = ShareDataUIState + 17;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                num = null;
            } else {
                Integer numValueOf3 = Integer.valueOf(parcel.readInt());
                int i6 = component3 + 37;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                num = numValueOf3;
            }
            int i8 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i8);
            for (int i9 = 0; i9 != i8; i9++) {
                int i10 = ShareDataUIState + 35;
                component3 = i10 % 128;
                int i11 = i10 % 2;
                arrayList.add(DiscoveryCategory.CREATOR.createFromParcel(parcel));
            }
            ArrayList arrayList2 = arrayList;
            if (parcel.readInt() == 0) {
                int i12 = component3 + 41;
                ShareDataUIState = i12 % 128;
                if (i12 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList3.add(MiniAppOrderInDiscoveryCategory.CREATOR.createFromParcel(parcel));
            }
            return new MiniApp(string, string2, string3, string4, numValueOf, string5, string6, num, arrayList2, numValueOf2, arrayList3);
        }

        @Override
        public MiniApp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 37;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            MiniApp miniAppCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 67;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return miniAppCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MiniApp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 65;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            Object obj = null;
            MiniApp[] miniAppArr = new MiniApp[i];
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 47;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return miniAppArr;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public MiniApp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 115;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            MiniApp[] miniAppArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 107;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return miniAppArrNewArray;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r7, int r8, byte r9) {
        /*
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r9 = r9 * 4
            int r9 = 65 - r9
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.MiniApp.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.MiniApp.$$e(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.MiniApp.$$a
            int r8 = r8 * 2
            int r8 = 99 - r8
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r1 = 10 - r6
            byte[] r1 = new byte[r1]
            int r6 = 9 - r6
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L30
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-26)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.MiniApp.b(byte, short, byte, java.lang.Object[]):void");
    }

    public MiniApp(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, List<DiscoveryCategory> list, Integer num3, List<MiniAppOrderInDiscoveryCategory> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.id = str;
        this.antId = str2;
        this.name = str3;
        this.description = str4;
        this.color = num;
        this.iconUrl = str5;
        this.featuredUrl = str6;
        this.order = num2;
        this.discoveryCategories = list;
        this.promotedOrder = num3;
        this.miniAppOrderPerCategory = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MiniApp(String str, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, List list, Integer num3, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num4;
        String str7;
        String str8;
        String str9 = (i & 8) != 0 ? null : str4;
        if ((i & 16) != 0) {
            int i2 = component2 + 11;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 75;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i & 32) != 0) {
            int i7 = 2 % 2;
            str7 = null;
        } else {
            str7 = str5;
        }
        if ((i & 64) != 0) {
            int i8 = copydefault + 61;
            component2 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
            str8 = null;
        } else {
            str8 = str6;
        }
        this(str, str2, str3, str9, num4, str7, str8, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? CollectionsKt.emptyList() : list, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.id;
        }
        throw null;
    }

    public final String getAntId() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.antId;
        int i4 = i3 + 91;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.name;
        }
        throw null;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.description;
        int i5 = i3 + 117;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getColor() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 3;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.color;
        int i5 = i2 + 1;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getIconUrl() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.iconUrl;
        int i5 = i3 + 61;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return str;
    }

    public final String getFeaturedUrl() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.featuredUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getOrder() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Integer num = this.order;
        int i4 = i2 + 63;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final List<DiscoveryCategory> getDiscoveryCategories() {
        List<DiscoveryCategory> list;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 29;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.discoveryCategories;
            int i4 = 67 / 0;
        } else {
            list = this.discoveryCategories;
        }
        int i5 = i2 + 83;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    private static void a(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
            int i5 = $11 + 109;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 3784, (ViewConfiguration.getTouchSlop() >> 8) + 38, (char) (26860 - (KeyEvent.getMaxKeyCode() >> 16)), 2015799920, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7405, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i - iTrustedWebActivityServiceStub.component1);
            int i8 = $10 + 41;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (!(!z)) {
            char[] cArr4 = new char[i];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - TextUtils.getOffsetBefore("", 0), TextUtils.indexOf("", "", 0, 0) + 16, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final Integer getPromotedOrder() throws Throwable {
        long j;
        long j2;
        int i;
        int i2 = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 67, 34 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 19696), 520092524, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a(23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 12 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22}, 258 - KeyEvent.normalizeMetaState(0), true, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(TextUtils.getOffsetAfter("", 0) + 15, 2 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, CharUtils.CR, 2}, 262 - View.getDefaultSize(0, 0), false, objArr2);
        long j3 = 220;
        int i4 = i3;
        long j4 = -1;
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long jIdentityHashCode = System.identityHashCode(this);
        long j5 = jIdentityHashCode ^ j4;
        long j6 = (((long) 221) * 3411824833202398939L) + (((long) (-219)) * 1043898263404111386L) + (((((j4 ^ 3411824833202398939L) | (j4 ^ 1043898263404111386L)) ^ j4) | ((j5 | 3422102380722513627L) ^ j4)) * j3) + (((long) (-440)) * (((j5 | 1043898263404111386L) ^ j4) | 3411824833202398939L)) + (j3 * (3422102380722513627L | jIdentityHashCode));
        int i5 = 0;
        while (true) {
            if (i5 != 10) {
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') - 11, 29 - TextUtils.lastIndexOf("", '0', 0, 0), (char) TextUtils.getTrimmedLength(""), 846241313, false, "copydefault", null);
                }
                int i6 = ((Field) objCopydefault2).getInt(null);
                int i7 = 0;
                long j7 = jLongValue;
                while (true) {
                    int i8 = 0;
                    while (i8 != 8) {
                        int i9 = component2 + 33;
                        int i10 = i9 % 128;
                        copydefault = i10;
                        if (i9 % 2 != 0) {
                            j2 = j6;
                            i = (((((int) (j7 << i8)) & 10679) % (i6 >>> 19)) << (i6 + 10)) % i6;
                            i8 += 9;
                        } else {
                            j2 = j6;
                            i = (((((int) (j7 >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                            i8++;
                        }
                        i6 = i;
                        int i11 = i10 + 63;
                        component2 = i11 % 128;
                        int i12 = i11 % 2;
                        j6 = j2;
                    }
                    j = j6;
                    if (i7 != 0) {
                        break;
                    }
                    int i13 = copydefault + 85;
                    component2 = i13 % 128;
                    i7 = i13 % 2 == 0 ? i7 + 50 : i7 + 1;
                    j7 = j;
                    j6 = j7;
                }
                int i14 = i4;
                if (i6 == i14) {
                    break;
                }
                jLongValue -= 1024;
                i5++;
                i4 = i14;
                j6 = j;
            } else {
                Object[] objArr3 = new Object[1];
                a(16 - (ViewConfiguration.getJumpTapTimeout() >> 16), 10 - View.MeasureSpec.getSize(0), new char[]{65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n'}, TextUtils.getCapsMode("", 0, 0) + 257, false, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(16 - TextUtils.getTrimmedLength(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6, new char[]{65531, CharUtils.CR, 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506}, KeyEvent.getDeadChar(0, 0) + DeepRecoverARiverProxy.TYPE_ENTITY_ONLINE_PAGE, false, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {-1579877376};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1663 - Color.argb(0, 0, 0, 0), 10 - TextUtils.getTrimmedLength(""), (char) TextUtils.getCapsMode("", 0, 0), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 513467982, ((Constructor) objCopydefault3).newInstance(objArr5), false};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault4 == null) {
                        int iRed = 1454 - Color.red(0);
                        int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0');
                        char cResolveSize = (char) View.resolveSize(0, 0);
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        Object[] objArr7 = new Object[1];
                        b(b2, b3, (byte) (b3 + 1), objArr7);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iRed, iLastIndexOf, cResolveSize, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 1591, 39 - Color.green(0), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objCopydefault4).invoke(null, objArr6);
                    int i15 = ((int[]) objArr8[2])[0];
                    int i16 = ((int[]) objArr8[1])[0];
                    if (i16 != i15) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[3];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        long j8 = -1;
                        long j9 = 0;
                        long j10 = (((long) (i16 ^ i15)) & ((j8 - ((j8 >> 63) << 32)) | (((long) 0) << 32))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
                        try {
                            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                            if (objCopydefault5 == null) {
                                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6617 - ((byte) KeyEvent.getModifierMetaStateMask()), 43 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
                            }
                            Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                            Object[] objArr9 = {-1579877376, Long.valueOf(j10), arrayList, null, false, false};
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                            if (objCopydefault6 == null) {
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 56, (char) ((-1) - Process.getGidForName("")), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                            }
                            ((Method) objCopydefault6).invoke(objInvoke, objArr9);
                            throw new RuntimeException(String.valueOf(i16));
                        } catch (Throwable th) {
                            th = th;
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return this.promotedOrder;
    }

    public final List<MiniAppOrderInDiscoveryCategory> getMiniAppOrderPerCategory() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 35;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<MiniAppOrderInDiscoveryCategory> list = this.miniAppOrderPerCategory;
        int i5 = i2 + 51;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        component1 = 0;
        ShareDataUIState();
        CREATOR = new Creator();
        int i = ShareDataUIState + 45;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MiniApp copy$default(MiniApp miniApp, String str, String str2, String str3, String str4, Integer num, String str5, String str6, Integer num2, List list, Integer num3, List list2, int i, Object obj) {
        String str7;
        String str8;
        String str9;
        List list3;
        Integer num4;
        int i2 = 2 % 2;
        String str10 = (i & 1) != 0 ? miniApp.id : str;
        String str11 = (i & 2) != 0 ? miniApp.antId : str2;
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i3 = component2 + 59;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                String str12 = miniApp.name;
                throw null;
            }
            str7 = miniApp.name;
        } else {
            str7 = str3;
        }
        if ((i & 8) != 0) {
            int i4 = component2 + 31;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                String str13 = miniApp.description;
                throw null;
            }
            str8 = miniApp.description;
        } else {
            str8 = str4;
        }
        Integer num5 = (i & 16) != 0 ? miniApp.color : num;
        String str14 = (i & 32) != 0 ? miniApp.iconUrl : str5;
        if ((i & 64) != 0) {
            int i5 = component2 + 27;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                String str15 = miniApp.featuredUrl;
                obj2.hashCode();
                throw null;
            }
            str9 = miniApp.featuredUrl;
        } else {
            str9 = str6;
        }
        Integer num6 = (i & 128) != 0 ? miniApp.order : num2;
        if ((i & 256) != 0) {
            int i6 = copydefault + 9;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                List<DiscoveryCategory> list4 = miniApp.discoveryCategories;
                obj2.hashCode();
                throw null;
            }
            list3 = miniApp.discoveryCategories;
        } else {
            list3 = list;
        }
        if ((i & 512) != 0) {
            int i7 = copydefault + 67;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            num4 = miniApp.promotedOrder;
            if (i8 == 0) {
                int i9 = 39 / 0;
            }
        } else {
            num4 = num3;
        }
        return miniApp.copy(str10, str11, str7, str8, num5, str14, str9, num6, list3, num4, (i & 1024) != 0 ? miniApp.miniAppOrderPerCategory : list2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 63;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 113;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return str;
    }

    public final Integer component10() {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.promotedOrder;
        int i4 = i3 + 97;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final List<MiniAppOrderInDiscoveryCategory> component11() {
        List<MiniAppOrderInDiscoveryCategory> list;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 93;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.miniAppOrderPerCategory;
            int i4 = 34 / 0;
        } else {
            list = this.miniAppOrderPerCategory;
        }
        int i5 = i2 + 43;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 37;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.antId;
        int i5 = i2 + 121;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.name;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.description;
        int i4 = i3 + 121;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.color;
        int i5 = i3 + 107;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 107;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.iconUrl;
        int i5 = i3 + 1;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.featuredUrl;
        int i4 = i3 + 61;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final Integer component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Integer num = this.order;
        int i4 = i2 + 67;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final List<DiscoveryCategory> component9() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 3;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<DiscoveryCategory> list = this.discoveryCategories;
        int i5 = i2 + 13;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MiniApp copy(String id, String antId, String name, String description, Integer color, String iconUrl, String featuredUrl, Integer order, List<DiscoveryCategory> discoveryCategories, Integer promotedOrder, List<MiniAppOrderInDiscoveryCategory> miniAppOrderPerCategory) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(antId, "");
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(discoveryCategories, "");
        Intrinsics.checkNotNullParameter(miniAppOrderPerCategory, "");
        MiniApp miniApp = new MiniApp(id, antId, name, description, color, iconUrl, featuredUrl, order, discoveryCategories, promotedOrder, miniAppOrderPerCategory);
        int i2 = component2 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return miniApp;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 35;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniApp)) {
            int i2 = component2 + 105;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        MiniApp miniApp = (MiniApp) other;
        if (!Intrinsics.areEqual(this.id, miniApp.id)) {
            int i4 = copydefault + 69;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.antId, miniApp.antId) || (!Intrinsics.areEqual(this.name, miniApp.name)) || !Intrinsics.areEqual(this.description, miniApp.description) || (!Intrinsics.areEqual(this.color, miniApp.color)) || !Intrinsics.areEqual(this.iconUrl, miniApp.iconUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.featuredUrl, miniApp.featuredUrl)) {
            int i6 = component2 + 87;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.order, miniApp.order)) {
            int i8 = component2 + 17;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.discoveryCategories, miniApp.discoveryCategories)) {
            return false;
        }
        if (Intrinsics.areEqual(this.promotedOrder, miniApp.promotedOrder)) {
            return Intrinsics.areEqual(this.miniAppOrderPerCategory, miniApp.miniAppOrderPerCategory);
        }
        int i10 = copydefault + 73;
        component2 = i10 % 128;
        return i10 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.id.hashCode();
        int iHashCode4 = this.antId.hashCode();
        int iHashCode5 = this.name.hashCode();
        String str = this.description;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        Integer num = this.color;
        if (num == null) {
            int i2 = copydefault + 69;
            component2 = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = num.hashCode();
        }
        String str2 = this.iconUrl;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.featuredUrl;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        Integer num2 = this.order;
        if (num2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = num2.hashCode();
            int i3 = copydefault + 23;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        }
        int iHashCode9 = this.discoveryCategories.hashCode();
        Integer num3 = this.promotedOrder;
        return (((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + (num3 != null ? num3.hashCode() : 0)) * 31) + this.miniAppOrderPerCategory.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiniApp(id=" + this.id + ", antId=" + this.antId + ", name=" + this.name + ", description=" + this.description + ", color=" + this.color + ", iconUrl=" + this.iconUrl + ", featuredUrl=" + this.featuredUrl + ", order=" + this.order + ", discoveryCategories=" + this.discoveryCategories + ", promotedOrder=" + this.promotedOrder + ", miniAppOrderPerCategory=" + this.miniAppOrderPerCategory + ")";
        int i2 = copydefault + 123;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 74 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.id);
        dest.writeString(this.antId);
        dest.writeString(this.name);
        dest.writeString(this.description);
        Integer num = this.color;
        if (num == null) {
            int i4 = component2 + 77;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.iconUrl);
        dest.writeString(this.featuredUrl);
        Integer num2 = this.order;
        if (num2 == null) {
            int i6 = copydefault + 91;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        List<DiscoveryCategory> list = this.discoveryCategories;
        dest.writeInt(list.size());
        Iterator<DiscoveryCategory> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        Integer num3 = this.promotedOrder;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        List<MiniAppOrderInDiscoveryCategory> list2 = this.miniAppOrderPerCategory;
        dest.writeInt(list2.size());
        Iterator<MiniAppOrderInDiscoveryCategory> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }

    static void ShareDataUIState() {
        component3 = -890926586;
    }
}
