package com.huawei.digitalpayment.consumer.base.database.entities.mtandao;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyAirtimeTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.SerializationConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 72\u00020\u00012\u00020\u0002:\u000267B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J1\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\u0006\u0010#\u001a\u00020\u000bJ\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\t\u0010)\u001a\u00020\u0004HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u000bJ%\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R$\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u00068"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/ComplaintsData;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "datasessionId", "", "commentDateTime", "commentType", "commentVerbatim", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDatasessionId$annotations", "()V", "getDatasessionId", "()Ljava/lang/String;", "setDatasessionId", "(Ljava/lang/String;)V", "getCommentDateTime$annotations", "getCommentDateTime", "setCommentDateTime", "getCommentType$annotations", "getCommentType", "setCommentType", "getCommentVerbatim$annotations", "getCommentVerbatim", "setCommentVerbatim", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "write$Self", BuyAirtimeTypes.SELF, TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ConsumerBaseUi_release", "$serializer", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final class ComplaintsData implements java.io.Serializable, Parcelable {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;
    private String commentDateTime;
    private String commentType;
    private String commentVerbatim;
    private String datasessionId;

    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ComplaintsData> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ComplaintsData> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ComplaintsData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ComplaintsData complaintsData = new ComplaintsData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 77;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return complaintsData;
            }
            throw null;
        }

        @Override
        public ComplaintsData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 23;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ComplaintsData complaintsDataCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 91;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return complaintsDataCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ComplaintsData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 3;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            ComplaintsData[] complaintsDataArr = new ComplaintsData[i];
            int i6 = i3 + 125;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return complaintsDataArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public ComplaintsData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 87;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            ComplaintsData[] complaintsDataArrNewArray = newArray(i);
            int i5 = component2 + 115;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return complaintsDataArrNewArray;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/ComplaintsData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/ComplaintsData;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component3 = 1;
        private static int copydefault;

        public final KSerializer<ComplaintsData> serializer() {
            int i = 2 % 2;
            int i2 = copydefault + 79;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            ComplaintsData$$serializer complaintsData$$serializer = ComplaintsData$$serializer.INSTANCE;
            if (i3 != 0) {
                return complaintsData$$serializer;
            }
            throw null;
        }

        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ComplaintsData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.datasessionId = "";
        } else {
            this.datasessionId = str;
        }
        int i2 = 2 % 2;
        if ((i & 2) == 0) {
            int i3 = component1 + 31;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            this.commentDateTime = "";
            if (i4 != 0) {
                int i5 = 63 / 0;
            }
        } else {
            this.commentDateTime = str2;
        }
        if ((i & 4) == 0) {
            this.commentType = "";
        } else {
            this.commentType = str3;
        }
        if ((i & 8) != 0) {
            this.commentVerbatim = str4;
            return;
        }
        int i6 = ShareDataUIState + 45;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        this.commentVerbatim = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self$ConsumerBaseUi_release(com.huawei.digitalpayment.consumer.base.database.entities.mtandao.ComplaintsData r4, kotlinx.serialization.encoding.CompositeEncoder r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.database.entities.mtandao.ComplaintsData.component1
            int r1 = r1 + 71
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.database.entities.mtandao.ComplaintsData.ShareDataUIState = r2
            int r1 = r1 % r0
            r1 = 0
            boolean r2 = r5.shouldEncodeElementDefault(r6, r1)
            java.lang.String r3 = ""
            if (r2 == 0) goto L16
            goto L1e
        L16:
            java.lang.String r2 = r4.datasessionId
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L23
        L1e:
            java.lang.String r2 = r4.datasessionId
            r5.encodeStringElement(r6, r1, r2)
        L23:
            r1 = 1
            boolean r2 = r5.shouldEncodeElementDefault(r6, r1)
            if (r2 == 0) goto L2b
            goto L35
        L2b:
            java.lang.String r2 = r4.commentDateTime
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            r2 = r2 ^ r1
            if (r2 == r1) goto L35
            goto L3a
        L35:
            java.lang.String r2 = r4.commentDateTime
            r5.encodeStringElement(r6, r1, r2)
        L3a:
            boolean r1 = r5.shouldEncodeElementDefault(r6, r0)
            if (r1 == 0) goto L4a
            int r1 = com.huawei.digitalpayment.consumer.base.database.entities.mtandao.ComplaintsData.ShareDataUIState
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.database.entities.mtandao.ComplaintsData.component1 = r2
            int r1 = r1 % r0
            goto L52
        L4a:
            java.lang.String r1 = r4.commentType
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L57
        L52:
            java.lang.String r1 = r4.commentType
            r5.encodeStringElement(r6, r0, r1)
        L57:
            r1 = 3
            boolean r2 = r5.shouldEncodeElementDefault(r6, r1)
            if (r2 == 0) goto L68
            int r2 = com.huawei.digitalpayment.consumer.base.database.entities.mtandao.ComplaintsData.ShareDataUIState
            int r2 = r2 + 29
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.base.database.entities.mtandao.ComplaintsData.component1 = r3
            int r2 = r2 % r0
            goto L70
        L68:
            java.lang.String r0 = r4.commentVerbatim
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 != 0) goto L75
        L70:
            java.lang.String r4 = r4.commentVerbatim
            r5.encodeStringElement(r6, r1, r4)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.entities.mtandao.ComplaintsData.write$Self$ConsumerBaseUi_release(com.huawei.digitalpayment.consumer.base.database.entities.mtandao.ComplaintsData, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public ComplaintsData(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.datasessionId = str;
        this.commentDateTime = str2;
        this.commentType = str3;
        this.commentVerbatim = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ComplaintsData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 53;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = 2 % 2;
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i5 = ShareDataUIState + 121;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str3 = "";
        }
        this(str, str2, str3, (i & 8) != 0 ? "" : str4);
    }

    public final String getDatasessionId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.datasessionId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDatasessionId(String str) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.datasessionId = str;
        int i4 = component1 + 87;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getCommentDateTime() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.commentDateTime;
        int i5 = i2 + 121;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setCommentDateTime(String str) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.commentDateTime = str;
        int i4 = ShareDataUIState + 11;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
    }

    public final String getCommentType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.commentType;
        int i5 = i3 + 93;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setCommentType(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.commentType = str;
        int i4 = component1 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCommentVerbatim() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 81;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.commentVerbatim;
        int i5 = i2 + 65;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setCommentVerbatim(String str) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.commentVerbatim = str;
        int i4 = component1 + 51;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = component2 + 21;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public ComplaintsData() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static ComplaintsData copy$default(ComplaintsData complaintsData, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 35;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                str = complaintsData.datasessionId;
                int i4 = 62 / 0;
            } else {
                str = complaintsData.datasessionId;
            }
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState + 77;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str2 = complaintsData.commentDateTime;
        }
        if ((i & 4) != 0) {
            str3 = complaintsData.commentType;
        }
        if ((i & 8) != 0) {
            str4 = complaintsData.commentVerbatim;
            int i7 = component1 + 123;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        return complaintsData.copy(str, str2, str3, str4);
    }

    @SerialName("commentdatetime")
    public static void getCommentDateTime$annotations() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @SerialName("commenttype")
    public static void getCommentType$annotations() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
    }

    @SerialName("commentverbatim")
    public static void getCommentVerbatim$annotations() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @SerialName("datasessionid")
    public static void getDatasessionId$annotations() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 49;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.datasessionId;
        int i5 = i2 + 125;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.commentDateTime;
        int i5 = i3 + 111;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.commentType;
        int i5 = i2 + 111;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 73;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.commentVerbatim;
            int i4 = 94 / 0;
        } else {
            str = this.commentVerbatim;
        }
        int i5 = i3 + 37;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final ComplaintsData copy(String datasessionId, String commentDateTime, String commentType, String commentVerbatim) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(datasessionId, "");
        Intrinsics.checkNotNullParameter(commentDateTime, "");
        Intrinsics.checkNotNullParameter(commentType, "");
        Intrinsics.checkNotNullParameter(commentVerbatim, "");
        ComplaintsData complaintsData = new ComplaintsData(datasessionId, commentDateTime, commentType, commentVerbatim);
        int i2 = ShareDataUIState + 5;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
        return complaintsData;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 45;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 93;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComplaintsData)) {
            int i2 = component1 + 49;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        ComplaintsData complaintsData = (ComplaintsData) other;
        if (!Intrinsics.areEqual(this.datasessionId, complaintsData.datasessionId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.commentDateTime, complaintsData.commentDateTime)) {
            return Intrinsics.areEqual(this.commentType, complaintsData.commentType) && Intrinsics.areEqual(this.commentVerbatim, complaintsData.commentVerbatim);
        }
        int i4 = ShareDataUIState + 93;
        component1 = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.datasessionId.hashCode() * 31) + this.commentDateTime.hashCode()) * 31) + this.commentType.hashCode()) * 31) + this.commentVerbatim.hashCode();
        int i4 = component1 + 23;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ComplaintsData(datasessionId=" + this.datasessionId + ", commentDateTime=" + this.commentDateTime + ", commentType=" + this.commentType + ", commentVerbatim=" + this.commentVerbatim + ")";
        int i2 = component1 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        String str = this.datasessionId;
        if (i3 == 0) {
            dest.writeString(str);
            dest.writeString(this.commentDateTime);
            dest.writeString(this.commentType);
            dest.writeString(this.commentVerbatim);
            return;
        }
        dest.writeString(str);
        dest.writeString(this.commentDateTime);
        dest.writeString(this.commentType);
        dest.writeString(this.commentVerbatim);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
