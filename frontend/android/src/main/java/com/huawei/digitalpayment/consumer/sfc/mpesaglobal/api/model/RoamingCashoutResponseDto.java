package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import com.alibaba.ariver.permission.PermissionConstant;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.alibaba.griver.core.GriverParams;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto;", "Landroid/os/Parcelable;", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response;)V", "getResponse", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Response", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutResponseDto implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RoamingCashoutResponseDto> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("Response")
    private final Response response;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RoamingCashoutResponseDto> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutResponseDto createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RoamingCashoutResponseDto roamingCashoutResponseDto = new RoamingCashoutResponseDto(Response.CREATOR.createFromParcel(parcel));
            int i2 = component2 + 27;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return roamingCashoutResponseDto;
        }

        @Override
        public RoamingCashoutResponseDto createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 113;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            RoamingCashoutResponseDto roamingCashoutResponseDtoCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 76 / 0;
            }
            int i5 = copydefault + 5;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 0 / 0;
            }
            return roamingCashoutResponseDtoCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutResponseDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 51;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            RoamingCashoutResponseDto[] roamingCashoutResponseDtoArr = new RoamingCashoutResponseDto[i];
            int i6 = i4 + 49;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return roamingCashoutResponseDtoArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public RoamingCashoutResponseDto[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 5;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public RoamingCashoutResponseDto(Response response) {
        Intrinsics.checkNotNullParameter(response, "");
        this.response = response;
    }

    public final Response getResponse() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 97;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Response response = this.response;
        int i5 = i2 + 65;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return response;
    }

    static {
        int i = ShareDataUIState + 111;
        component1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static RoamingCashoutResponseDto copy$default(RoamingCashoutResponseDto roamingCashoutResponseDto, Response response, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 71;
        component2 = i4 % 128;
        int i5 = i & 1;
        if (i4 % 2 == 0 ? i5 != 0 : i5 != 0) {
            response = roamingCashoutResponseDto.response;
            int i6 = i3 + 29;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        return roamingCashoutResponseDto.copy(response);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0018H×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response;", "Landroid/os/Parcelable;", GriverParams.ShareParams.DESC, "", "lineItem", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$LineItem;", "name", "parts", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts;", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$LineItem;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts;)V", "getDesc", "()Ljava/lang/String;", "getLineItem", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$LineItem;", "getName", "getParts", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LineItem", "Parts", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Response implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Response> CREATOR = new Creator();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;

        @SerializedName(GriverParams.ShareParams.DESC)
        private final String desc;

        @SerializedName("lineItem")
        private final LineItem lineItem;

        @SerializedName("name")
        private final String name;

        @SerializedName("parts")
        private final Parts parts;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Response> {
            private static int component1 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Response createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Response response = new Response(parcel.readString(), LineItem.CREATOR.createFromParcel(parcel), parcel.readString(), Parts.CREATOR.createFromParcel(parcel));
                int i2 = component1 + 61;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return response;
            }

            @Override
            public Response createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 123;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Response responseCreateFromParcel = createFromParcel(parcel);
                int i4 = copydefault + 39;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return responseCreateFromParcel;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Response[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 95;
                component1 = i3 % 128;
                Response[] responseArr = new Response[i];
                if (i3 % 2 == 0) {
                    int i4 = 89 / 0;
                }
                return responseArr;
            }

            @Override
            public Response[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 103;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Response[] responseArrNewArray = newArray(i);
                int i5 = component1 + 27;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 17 / 0;
                }
                return responseArrNewArray;
            }
        }

        public Response(String str, LineItem lineItem, String str2, Parts parts) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(lineItem, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(parts, "");
            this.desc = str;
            this.lineItem = lineItem;
            this.name = str2;
            this.parts = parts;
        }

        public final String getDesc() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 91;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.desc;
            int i5 = i2 + 21;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final LineItem getLineItem() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 73;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            LineItem lineItem = this.lineItem;
            if (i3 == 0) {
                int i4 = 50 / 0;
            }
            return lineItem;
        }

        public final String getName() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 21;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.name;
            }
            throw null;
        }

        public final Parts getParts() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 39;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Parts parts = this.parts;
            int i5 = i2 + 39;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return parts;
        }

        static {
            int i = component3 + 43;
            component2 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public static Response copy$default(Response response, String str, LineItem lineItem, String str2, Parts parts, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                str = response.desc;
            }
            if ((i & 2) != 0) {
                int i3 = ShareDataUIState + 125;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    lineItem = response.lineItem;
                    int i4 = 9 / 0;
                } else {
                    lineItem = response.lineItem;
                }
            }
            if ((i & 4) != 0) {
                str2 = response.name;
            }
            if ((i & 8) != 0) {
                parts = response.parts;
            }
            Response responseCopy = response.copy(str, lineItem, str2, parts);
            int i5 = component1 + 95;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return responseCopy;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\fH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$LineItem;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$LineItem$Id;", "<init>", "(Ljava/util/List;)V", "getId", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Id", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class LineItem implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<LineItem> CREATOR = new Creator();
            private static int ShareDataUIState = 0;
            private static int component1 = 1;
            private static int component2 = 0;
            private static int copydefault = 1;

            @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
            private final List<Id> id;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LineItem> {
                private static int ShareDataUIState = 1;
                private static int component2;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final LineItem createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    int i2 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i2);
                    int i3 = ShareDataUIState + 37;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = 0;
                    while (i5 != i2) {
                        int i6 = ShareDataUIState + 25;
                        component2 = i6 % 128;
                        if (i6 % 2 != 0) {
                            arrayList.add(Id.CREATOR.createFromParcel(parcel));
                            i5 += 38;
                        } else {
                            arrayList.add(Id.CREATOR.createFromParcel(parcel));
                            i5++;
                        }
                    }
                    return new LineItem(arrayList);
                }

                @Override
                public LineItem createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 9;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    LineItem lineItemCreateFromParcel = createFromParcel(parcel);
                    int i4 = component2 + 5;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 != 0) {
                        return lineItemCreateFromParcel;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final LineItem[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = component2 + 39;
                    int i4 = i3 % 128;
                    ShareDataUIState = i4;
                    int i5 = i3 % 2;
                    LineItem[] lineItemArr = new LineItem[i];
                    int i6 = i4 + 115;
                    component2 = i6 % 128;
                    if (i6 % 2 == 0) {
                        return lineItemArr;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public LineItem[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = component2 + 7;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    LineItem[] lineItemArrNewArray = newArray(i);
                    int i5 = component2 + 23;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    return lineItemArrNewArray;
                }
            }

            public LineItem(List<Id> list) {
                Intrinsics.checkNotNullParameter(list, "");
                this.id = list;
            }

            public final List<Id> getId() {
                int i = 2 % 2;
                int i2 = ShareDataUIState;
                int i3 = i2 + 119;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                List<Id> list = this.id;
                int i5 = i2 + 97;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return list;
            }

            static {
                int i = component2 + 97;
                component1 = i % 128;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$LineItem$Id;", "Landroid/os/Parcelable;", "schemeName", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSchemeName", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Id implements Parcelable {
                public static final int $stable = 0;
                public static final Parcelable.Creator<Id> CREATOR = new Creator();
                private static int ShareDataUIState = 0;
                private static int component1 = 0;
                private static int component2 = 1;
                private static int copydefault = 1;

                @SerializedName("schemeName")
                private final String schemeName;

                @SerializedName("value")
                private final String value;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Id> {
                    private static int ShareDataUIState = 0;
                    private static int component1 = 1;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override
                    public final Id createFromParcel(Parcel parcel) {
                        int i = 2 % 2;
                        Intrinsics.checkNotNullParameter(parcel, "");
                        Id id = new Id(parcel.readString(), parcel.readString());
                        int i2 = ShareDataUIState + 29;
                        component1 = i2 % 128;
                        int i3 = i2 % 2;
                        return id;
                    }

                    @Override
                    public Id createFromParcel(Parcel parcel) {
                        int i = 2 % 2;
                        int i2 = component1 + 25;
                        ShareDataUIState = i2 % 128;
                        if (i2 % 2 == 0) {
                            return createFromParcel(parcel);
                        }
                        createFromParcel(parcel);
                        throw null;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override
                    public final Id[] newArray(int i) {
                        int i2 = 2 % 2;
                        int i3 = ShareDataUIState + 5;
                        int i4 = i3 % 128;
                        component1 = i4;
                        int i5 = i3 % 2;
                        Id[] idArr = new Id[i];
                        int i6 = i4 + 51;
                        ShareDataUIState = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 45 / 0;
                        }
                        return idArr;
                    }

                    @Override
                    public Id[] newArray(int i) {
                        int i2 = 2 % 2;
                        int i3 = ShareDataUIState + 79;
                        component1 = i3 % 128;
                        int i4 = i3 % 2;
                        Id[] idArrNewArray = newArray(i);
                        int i5 = component1 + 123;
                        ShareDataUIState = i5 % 128;
                        int i6 = i5 % 2;
                        return idArrNewArray;
                    }
                }

                public Id(String str, String str2) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    this.schemeName = str;
                    this.value = str2;
                }

                public final String getSchemeName() {
                    int i = 2 % 2;
                    int i2 = component2 + 123;
                    int i3 = i2 % 128;
                    component1 = i3;
                    int i4 = i2 % 2;
                    String str = this.schemeName;
                    int i5 = i3 + 13;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return str;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final String getValue() {
                    int i = 2 % 2;
                    int i2 = component1 + 87;
                    int i3 = i2 % 128;
                    component2 = i3;
                    int i4 = i2 % 2;
                    String str = this.value;
                    int i5 = i3 + 37;
                    component1 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 40 / 0;
                    }
                    return str;
                }

                static {
                    int i = ShareDataUIState + 5;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
                        int i2 = 41 / 0;
                    }
                }

                public static Id copy$default(Id id, String str, String str2, int i, Object obj) {
                    int i2 = 2 % 2;
                    int i3 = component1 + 65;
                    int i4 = i3 % 128;
                    component2 = i4;
                    int i5 = i3 % 2;
                    if ((i & 1) != 0) {
                        str = id.schemeName;
                    }
                    if ((i & 2) != 0) {
                        int i6 = i4 + 59;
                        component1 = i6 % 128;
                        int i7 = i6 % 2;
                        str2 = id.value;
                    }
                    return id.copy(str, str2);
                }

                public final String component1() {
                    int i = 2 % 2;
                    int i2 = component1 + 91;
                    int i3 = i2 % 128;
                    component2 = i3;
                    int i4 = i2 % 2;
                    String str = this.schemeName;
                    int i5 = i3 + 97;
                    component1 = i5 % 128;
                    if (i5 % 2 == 0) {
                        return str;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final String component2() {
                    int i = 2 % 2;
                    int i2 = component1 + 95;
                    int i3 = i2 % 128;
                    component2 = i3;
                    int i4 = i2 % 2;
                    String str = this.value;
                    int i5 = i3 + 115;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                }

                public final Id copy(String schemeName, String value) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(schemeName, "");
                    Intrinsics.checkNotNullParameter(value, "");
                    Id id = new Id(schemeName, value);
                    int i2 = component2 + 9;
                    component1 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 17 / 0;
                    }
                    return id;
                }

                @Override
                public final int describeContents() {
                    int i = 2 % 2;
                    int i2 = component1;
                    int i3 = i2 + 19;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 119;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return 0;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
                
                    if ((r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id) != false) goto L13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
                
                    return false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
                
                    r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id) r6;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
                
                    if (kotlin.jvm.internal.Intrinsics.areEqual(r5.schemeName, r6.schemeName) != false) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
                
                    return false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
                
                    if (kotlin.jvm.internal.Intrinsics.areEqual(r5.value, r6.value) != false) goto L20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
                
                    r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id.component1 + 61;
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id.component2 = r6 % 128;
                    r6 = r6 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
                
                    return false;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
                
                    r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id.component1 + 35;
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id.component2 = r6 % 128;
                    r6 = r6 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
                
                    return true;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
                
                    if (r5 == r6) goto L8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
                
                    if (r5 == r6) goto L8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
                
                    r2 = r2 + 47;
                    com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id.component1 = r2 % 128;
                    r2 = r2 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
                
                    return true;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public boolean equals(java.lang.Object r6) {
                    /*
                        r5 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id.component1
                        int r1 = r1 + 3
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id.component2 = r2
                        int r1 = r1 % r0
                        r3 = 1
                        r4 = 0
                        if (r1 != 0) goto L16
                        r1 = 66
                        int r1 = r1 / r4
                        if (r5 != r6) goto L20
                        goto L18
                    L16:
                        if (r5 != r6) goto L20
                    L18:
                        int r2 = r2 + 47
                        int r6 = r2 % 128
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id.component1 = r6
                        int r2 = r2 % r0
                        return r3
                    L20:
                        boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id
                        if (r1 != 0) goto L25
                        return r4
                    L25:
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto$Response$LineItem$Id r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id) r6
                        java.lang.String r1 = r5.schemeName
                        java.lang.String r2 = r6.schemeName
                        boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                        if (r1 != 0) goto L32
                        return r4
                    L32:
                        java.lang.String r1 = r5.value
                        java.lang.String r6 = r6.value
                        boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
                        if (r6 != 0) goto L46
                        int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id.component1
                        int r6 = r6 + 61
                        int r1 = r6 % 128
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id.component2 = r1
                        int r6 = r6 % r0
                        return r4
                    L46:
                        int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id.component1
                        int r6 = r6 + 35
                        int r1 = r6 % 128
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id.component2 = r1
                        int r6 = r6 % r0
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.LineItem.Id.equals(java.lang.Object):boolean");
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = component1 + 107;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    int iHashCode = this.schemeName.hashCode();
                    return i3 == 0 ? (iHashCode - 94) % this.value.hashCode() : (iHashCode * 31) + this.value.hashCode();
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "Id(schemeName=" + this.schemeName + ", value=" + this.value + ')';
                    int i2 = component2 + 57;
                    component1 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return str;
                    }
                    throw null;
                }

                @Override
                public final void writeToParcel(Parcel dest, int flags) {
                    int i = 2 % 2;
                    int i2 = component1 + 45;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(dest, "");
                    dest.writeString(this.schemeName);
                    dest.writeString(this.value);
                    if (i3 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static LineItem copy$default(LineItem lineItem, List list, int i, Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 19;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0 && (i & 1) != 0) {
                    list = lineItem.id;
                }
                LineItem lineItemCopy = lineItem.copy(list);
                int i4 = copydefault + 65;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return lineItemCopy;
            }

            public final List<Id> component1() {
                int i = 2 % 2;
                int i2 = ShareDataUIState;
                int i3 = i2 + 43;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                List<Id> list = this.id;
                int i5 = i2 + 21;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return list;
            }

            public final LineItem copy(List<Id> id) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(id, "");
                LineItem lineItem = new LineItem(id);
                int i2 = copydefault + 117;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return lineItem;
            }

            @Override
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = copydefault + 23;
                int i3 = i2 % 128;
                ShareDataUIState = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 107;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return 0;
                }
                throw null;
            }

            public boolean equals(Object other) {
                int i = 2 % 2;
                int i2 = copydefault;
                int i3 = i2 + 123;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                Object obj = null;
                if (i3 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (this == other) {
                    int i5 = i4 + 121;
                    copydefault = i5 % 128;
                    return i5 % 2 != 0;
                }
                if (other instanceof LineItem) {
                    if (!Intrinsics.areEqual(this.id, ((LineItem) other).id)) {
                        return false;
                    }
                    int i6 = copydefault + 89;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                    return true;
                }
                int i8 = i2 + 73;
                ShareDataUIState = i8 % 128;
                if (i8 % 2 == 0) {
                    return false;
                }
                obj.hashCode();
                throw null;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = copydefault + 21;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = this.id.hashCode();
                if (i3 != 0) {
                    int i4 = 65 / 0;
                }
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "LineItem(id=" + this.id + ')';
                int i2 = copydefault + 111;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 55;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(dest, "");
                List<Id> list = this.id;
                dest.writeInt(list.size());
                Iterator<Id> it = list.iterator();
                while (it.hasNext()) {
                    int i4 = ShareDataUIState + 123;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        it.next().writeToParcel(dest, flags);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    it.next().writeToParcel(dest, flags);
                    int i5 = ShareDataUIState + 103;
                    copydefault = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 2 / 2;
                    }
                }
                int i7 = copydefault + 111;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
            }
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 111;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            String str = this.desc;
            int i5 = i3 + 11;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final LineItem component2() {
            int i = 2 % 2;
            int i2 = component1 + 105;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return this.lineItem;
            }
            throw null;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 125;
            int i3 = i2 % 128;
            component1 = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.name;
            int i4 = i3 + 53;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final Parts component4() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 19;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Parts parts = this.parts;
            int i5 = i2 + 103;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return parts;
        }

        public final Response copy(String desc, LineItem lineItem, String name, Parts parts) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(desc, "");
            Intrinsics.checkNotNullParameter(lineItem, "");
            Intrinsics.checkNotNullParameter(name, "");
            Intrinsics.checkNotNullParameter(parts, "");
            Response response = new Response(desc, lineItem, name, parts);
            int i2 = component1 + 79;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return response;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 77;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                int i2 = component1 + 101;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            Response response = (Response) other;
            if (!Intrinsics.areEqual(this.desc, response.desc)) {
                int i4 = ShareDataUIState + 87;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.lineItem, response.lineItem)) {
                int i6 = ShareDataUIState + 13;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.name, response.name)) {
                return Intrinsics.areEqual(this.parts, response.parts);
            }
            int i8 = ShareDataUIState + 93;
            component1 = i8 % 128;
            return i8 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 73;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.desc.hashCode();
            return i3 == 0 ? (((((iHashCode >>> 30) + this.lineItem.hashCode()) >>> 13) << this.name.hashCode()) >>> 83) >>> this.parts.hashCode() : (((((iHashCode * 31) + this.lineItem.hashCode()) * 31) + this.name.hashCode()) * 31) + this.parts.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Response(desc=" + this.desc + ", lineItem=" + this.lineItem + ", name=" + this.name + ", parts=" + this.parts + ')';
            int i2 = component1 + 85;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) throws Throwable {
            int i = 2 % 2;
            int i2 = component1 + 3;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.desc);
            this.lineItem.writeToParcel(dest, flags);
            dest.writeString(this.name);
            this.parts.writeToParcel(dest, flags);
            int i4 = ShareDataUIState + 17;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts;", "Landroid/os/Parcelable;", "paymentMethod", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$PaymentMethod;", PermissionConstant.ACTION_REQUEST, "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$PaymentMethod;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request;)V", "getPaymentMethod", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$PaymentMethod;", "getRequest", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentMethod", "Request", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Parts implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Parts> CREATOR = new Creator();
            private static int ShareDataUIState = 0;
            private static int component1 = 1;
            private static int component2 = 0;
            private static int copydefault = 1;

            @SerializedName("paymentMethod")
            private final PaymentMethod paymentMethod;

            @SerializedName(PermissionConstant.ACTION_REQUEST)
            private final Request request;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Parts> {
                private static int component1 = 0;
                private static int component3 = 1;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final Parts createFromParcel(Parcel parcel) {
                    Request requestCreateFromParcel;
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    PaymentMethod paymentMethodCreateFromParcel = PaymentMethod.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() == 0) {
                        requestCreateFromParcel = null;
                    } else {
                        requestCreateFromParcel = Request.CREATOR.createFromParcel(parcel);
                        int i2 = component3 + 87;
                        component1 = i2 % 128;
                        int i3 = i2 % 2;
                    }
                    Parts parts = new Parts(paymentMethodCreateFromParcel, requestCreateFromParcel);
                    int i4 = component3 + 119;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return parts;
                    }
                    throw null;
                }

                @Override
                public Parts createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = component1 + 17;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Parts partsCreateFromParcel = createFromParcel(parcel);
                    int i4 = component1 + 37;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return partsCreateFromParcel;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final Parts[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = component3 + 1;
                    int i4 = i3 % 128;
                    component1 = i4;
                    Parts[] partsArr = new Parts[i];
                    if (i3 % 2 != 0) {
                        int i5 = 52 / 0;
                    }
                    int i6 = i4 + 109;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                    return partsArr;
                }

                @Override
                public Parts[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = component3 + 117;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    Parts[] partsArrNewArray = newArray(i);
                    int i5 = component1 + 123;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    return partsArrNewArray;
                }
            }

            public Parts(PaymentMethod paymentMethod, Request request) {
                Intrinsics.checkNotNullParameter(paymentMethod, "");
                this.paymentMethod = paymentMethod;
                this.request = request;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Parts(PaymentMethod paymentMethod, Request request, int i, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i & 2) != 0) {
                    int i2 = ShareDataUIState + 35;
                    int i3 = i2 % 128;
                    copydefault = i3;
                    Object obj = null;
                    if (i2 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i4 = i3 + 19;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = 2 % 2;
                    request = null;
                }
                this(paymentMethod, request);
            }

            public final PaymentMethod getPaymentMethod() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 65;
                int i3 = i2 % 128;
                copydefault = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                PaymentMethod paymentMethod = this.paymentMethod;
                int i4 = i3 + 89;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return paymentMethod;
                }
                throw null;
            }

            public final Request getRequest() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 109;
                int i3 = i2 % 128;
                copydefault = i3;
                int i4 = i2 % 2;
                Request request = this.request;
                int i5 = i3 + 47;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return request;
            }

            static {
                int i = component2 + 105;
                component1 = i % 128;
                int i2 = i % 2;
            }

            public static Parts copy$default(Parts parts, PaymentMethod paymentMethod, Request request, int i, Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 89;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
                    int i5 = i3 + 39;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    paymentMethod = parts.paymentMethod;
                }
                if ((i & 2) != 0) {
                    int i7 = i3 + 7;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                    request = parts.request;
                }
                return parts.copy(paymentMethod, request);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$PaymentMethod;", "Landroid/os/Parcelable;", "channel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$PaymentMethod$Channel;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$PaymentMethod$Channel;)V", "getChannel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$PaymentMethod$Channel;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Channel", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class PaymentMethod implements Parcelable {
                public static final int $stable = 0;
                public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();
                private static int ShareDataUIState = 1;
                private static int component1 = 1;
                private static int component2;
                private static int component3;

                @SerializedName("channel")
                private final Channel channel;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<PaymentMethod> {
                    private static int component1 = 1;
                    private static int component3;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override
                    public final PaymentMethod createFromParcel(Parcel parcel) {
                        int i = 2 % 2;
                        Intrinsics.checkNotNullParameter(parcel, "");
                        PaymentMethod paymentMethod = new PaymentMethod(Channel.CREATOR.createFromParcel(parcel));
                        int i2 = component3 + 69;
                        component1 = i2 % 128;
                        int i3 = i2 % 2;
                        return paymentMethod;
                    }

                    @Override
                    public PaymentMethod createFromParcel(Parcel parcel) {
                        int i = 2 % 2;
                        int i2 = component1 + 23;
                        component3 = i2 % 128;
                        if (i2 % 2 != 0) {
                            createFromParcel(parcel);
                            throw null;
                        }
                        PaymentMethod paymentMethodCreateFromParcel = createFromParcel(parcel);
                        int i3 = component1 + 31;
                        component3 = i3 % 128;
                        int i4 = i3 % 2;
                        return paymentMethodCreateFromParcel;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override
                    public final PaymentMethod[] newArray(int i) {
                        int i2 = 2 % 2;
                        int i3 = component3;
                        int i4 = i3 + 1;
                        component1 = i4 % 128;
                        PaymentMethod[] paymentMethodArr = new PaymentMethod[i];
                        if (i4 % 2 == 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        int i5 = i3 + 29;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        return paymentMethodArr;
                    }

                    @Override
                    public PaymentMethod[] newArray(int i) {
                        int i2 = 2 % 2;
                        int i3 = component1 + 99;
                        component3 = i3 % 128;
                        int i4 = i3 % 2;
                        PaymentMethod[] paymentMethodArrNewArray = newArray(i);
                        int i5 = component3 + 5;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        return paymentMethodArrNewArray;
                    }
                }

                public PaymentMethod(Channel channel) {
                    Intrinsics.checkNotNullParameter(channel, "");
                    this.channel = channel;
                }

                public final Channel getChannel() {
                    int i = 2 % 2;
                    int i2 = component1;
                    int i3 = i2 + 95;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    Channel channel = this.channel;
                    int i5 = i2 + 21;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 6 / 0;
                    }
                    return channel;
                }

                static {
                    int i = component3 + 39;
                    ShareDataUIState = i % 128;
                    if (i % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$PaymentMethod$Channel;", "Landroid/os/Parcelable;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Channel implements Parcelable {
                    public static final int $stable = 0;
                    public static final Parcelable.Creator<Channel> CREATOR;
                    private static int component1;
                    private static long component3;

                    @SerializedName("name")
                    private final String name;
                    private static final byte[] $$c = {TarHeader.LF_SYMLINK, -82, -81, 124};
                    private static final int $$d = 140;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$a = {111, -17, Ascii.VT, -125, 38, Ascii.CAN, Ascii.GS, Ascii.EM, Ascii.EM, 17, 35, 32, -39};
                    private static final int $$b = 20;
                    private static int ShareDataUIState = 0;
                    private static int copydefault = 1;
                    private static int component2 = 0;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Channel> {
                        private static int component3 = 0;
                        private static int copydefault = 1;

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override
                        public final Channel createFromParcel(Parcel parcel) {
                            int i = 2 % 2;
                            Intrinsics.checkNotNullParameter(parcel, "");
                            Channel channel = new Channel(parcel.readString());
                            int i2 = component3 + 59;
                            copydefault = i2 % 128;
                            int i3 = i2 % 2;
                            return channel;
                        }

                        @Override
                        public Channel createFromParcel(Parcel parcel) {
                            int i = 2 % 2;
                            int i2 = copydefault + 95;
                            component3 = i2 % 128;
                            if (i2 % 2 == 0) {
                                return createFromParcel(parcel);
                            }
                            createFromParcel(parcel);
                            throw null;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override
                        public final Channel[] newArray(int i) {
                            int i2 = 2 % 2;
                            int i3 = component3 + 47;
                            int i4 = i3 % 128;
                            copydefault = i4;
                            Channel[] channelArr = new Channel[i];
                            if (i3 % 2 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            int i5 = i4 + 39;
                            component3 = i5 % 128;
                            int i6 = i5 % 2;
                            return channelArr;
                        }

                        @Override
                        public Channel[] newArray(int i) {
                            int i2 = 2 % 2;
                            int i3 = copydefault + 123;
                            component3 = i3 % 128;
                            int i4 = i3 % 2;
                            Channel[] channelArrNewArray = newArray(i);
                            int i5 = copydefault + 123;
                            component3 = i5 % 128;
                            if (i5 % 2 != 0) {
                                int i6 = 49 / 0;
                            }
                            return channelArrNewArray;
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private static java.lang.String $$e(byte r6, int r7, int r8) {
                        /*
                            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.Parts.PaymentMethod.Channel.$$c
                            int r7 = r7 * 3
                            int r7 = 105 - r7
                            int r8 = r8 + 4
                            int r6 = r6 * 2
                            int r1 = r6 + 1
                            byte[] r1 = new byte[r1]
                            r2 = 0
                            if (r0 != 0) goto L14
                            r3 = r8
                            r4 = r2
                            goto L2b
                        L14:
                            r3 = r2
                        L15:
                            int r8 = r8 + 1
                            byte r4 = (byte) r7
                            r1[r3] = r4
                            if (r3 != r6) goto L22
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            return r6
                        L22:
                            int r3 = r3 + 1
                            r4 = r0[r8]
                            r5 = r8
                            r8 = r7
                            r7 = r4
                            r4 = r3
                            r3 = r5
                        L2b:
                            int r7 = r7 + r8
                            r8 = r3
                            r3 = r4
                            goto L15
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.Parts.PaymentMethod.Channel.$$e(byte, int, int):java.lang.String");
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0034). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private static void b(int r6, int r7, short r8, java.lang.Object[] r9) {
                        /*
                            int r7 = r7 * 2
                            int r7 = 3 - r7
                            int r8 = r8 * 2
                            int r0 = 10 - r8
                            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.Parts.PaymentMethod.Channel.$$a
                            int r6 = r6 * 3
                            int r6 = r6 + 99
                            byte[] r0 = new byte[r0]
                            int r8 = 9 - r8
                            r2 = 0
                            if (r1 != 0) goto L18
                            r3 = r7
                            r4 = r2
                            goto L34
                        L18:
                            r3 = r2
                        L19:
                            r5 = r7
                            r7 = r6
                            r6 = r5
                            byte r4 = (byte) r7
                            r0[r3] = r4
                            int r6 = r6 + 1
                            if (r3 != r8) goto L2b
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r0, r2)
                            r9[r2] = r6
                            return
                        L2b:
                            int r3 = r3 + 1
                            r4 = r1[r6]
                            r5 = r7
                            r7 = r6
                            r6 = r4
                            r4 = r3
                            r3 = r5
                        L34:
                            int r3 = r3 + r6
                            int r6 = r3 + (-26)
                            r3 = r4
                            goto L19
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.Parts.PaymentMethod.Channel.b(int, int, short, java.lang.Object[]):void");
                    }

                    public Channel(String str) {
                        Intrinsics.checkNotNullParameter(str, "");
                        this.name = str;
                    }

                    public final String getName() {
                        String str;
                        int i = 2 % 2;
                        int i2 = copydefault + 27;
                        int i3 = i2 % 128;
                        ShareDataUIState = i3;
                        if (i2 % 2 != 0) {
                            str = this.name;
                            int i4 = 17 / 0;
                        } else {
                            str = this.name;
                        }
                        int i5 = i3 + 59;
                        copydefault = i5 % 128;
                        if (i5 % 2 != 0) {
                            return str;
                        }
                        throw null;
                    }

                    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
                        int i2 = 2 % 2;
                        notify notifyVar = new notify();
                        notifyVar.component3 = i;
                        int length = cArr.length;
                        long[] jArr = new long[length];
                        notifyVar.copydefault = 0;
                        while (notifyVar.copydefault < cArr.length) {
                            int i3 = $10 + 31;
                            $11 = i3 % 128;
                            int i4 = i3 % 2;
                            int i5 = notifyVar.copydefault;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                                if (objCopydefault == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = (byte) (b2 + 1);
                                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 3266, (ViewConfiguration.getEdgeSlop() >> 16) + 33, (char) (60268 - KeyEvent.getDeadChar(0, 0)), -834797019, false, $$e(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE, Object.class, Object.class});
                                }
                                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component3 ^ 5431355972723572778L);
                                try {
                                    Object[] objArr3 = {notifyVar, notifyVar};
                                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                                    if (objCopydefault2 == null) {
                                        byte b4 = (byte) 0;
                                        byte b5 = b4;
                                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 35 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (60373 - KeyEvent.normalizeMetaState(0)), -1969106284, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objCopydefault2).invoke(null, objArr3);
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        char[] cArr2 = new char[length];
                        notifyVar.copydefault = 0;
                        while (notifyVar.copydefault < cArr.length) {
                            int i6 = $11 + 87;
                            $10 = i6 % 128;
                            if (i6 % 2 != 0) {
                                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                                try {
                                    Object[] objArr4 = {notifyVar, notifyVar};
                                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                                    if (objCopydefault3 == null) {
                                        byte b6 = (byte) 0;
                                        byte b7 = b6;
                                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(686 - TextUtils.indexOf((CharSequence) "", '0', 0), 34 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 60372), -1969106284, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objCopydefault3).invoke(null, objArr4);
                                    int i7 = 67 / 0;
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 == null) {
                                        throw th3;
                                    }
                                    throw cause3;
                                }
                            } else {
                                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                                try {
                                    Object[] objArr5 = {notifyVar, notifyVar};
                                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                                    if (objCopydefault4 == null) {
                                        byte b8 = (byte) 0;
                                        byte b9 = b8;
                                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 34, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 60373), -1969106284, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objCopydefault4).invoke(null, objArr5);
                                } catch (Throwable th4) {
                                    Throwable cause4 = th4.getCause();
                                    if (cause4 == null) {
                                        throw th4;
                                    }
                                    throw cause4;
                                }
                            }
                        }
                        objArr[0] = new String(cArr2);
                    }

                    @Override
                    public final void writeToParcel(Parcel dest, int flags) throws Throwable {
                        int i = 2 % 2;
                        Intrinsics.checkNotNullParameter(dest, "");
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 67, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32, (char) (19695 - ExpandableListView.getPackedPositionChild(0L)), 520092524, false, "component2", null);
                        }
                        int i2 = ((Field) objCopydefault).getInt(null);
                        char c2 = '0';
                        Object[] objArr = new Object[1];
                        a(34602 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{58955, 24943, 59416, 29657, 64233, 17812, 52556, 21545, 57117, 9946, 41386, 10400, 45143, 15222, 33284, 3530, 38135, 8114, 26432, 61044, 26901, 61638}, objArr);
                        Class<?> cls = Class.forName((String) objArr[0]);
                        Object[] objArr2 = new Object[1];
                        a(22651 - TextUtils.indexOf("", "", 0), new char[]{58959, 48701, 22205, 61227, 34741, 23592, 62636, 36133, 9623, 64024, 37512, 11031, 50055, 39032, 12533}, objArr2);
                        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
                        long j = -1;
                        long j2 = j ^ 3464403500037954950L;
                        long jIdentityHashCode = System.identityHashCode(this);
                        long j3 = (((long) 303) * 3464403500037954950L) + (((long) (-301)) * 991319596568555375L) + (((long) (-302)) * ((((j2 | (jIdentityHashCode ^ j)) | 991319596568555375L) ^ j) | ((4455713611032821743L | jIdentityHashCode) ^ j))) + (((long) (-604)) * (((j2 | 991319596568555375L) | jIdentityHashCode) ^ j)) + (((long) 302) * ((((j ^ 991319596568555375L) | 3464403500037954950L) ^ j) | ((jIdentityHashCode | 991319596568555375L) ^ j)));
                        int i3 = 0;
                        while (true) {
                            int i4 = 8;
                            if (i3 != 10) {
                                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                                if (objCopydefault2 == null) {
                                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 37, TextUtils.indexOf("", c2, 0, 0) + 31, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 846241313, false, "copydefault", null);
                                }
                                int i5 = ((Field) objCopydefault2).getInt(null);
                                int i6 = 0;
                                long j4 = jLongValue;
                                while (true) {
                                    int i7 = 0;
                                    while (i7 != i4) {
                                        i5 = (((((int) (j4 >> i7)) & 255) + (i5 << 6)) + (i5 << 16)) - i5;
                                        i7++;
                                        i4 = 8;
                                    }
                                    if (i6 != 0) {
                                        break;
                                    }
                                    int i8 = copydefault + 75;
                                    int i9 = i8 % 128;
                                    ShareDataUIState = i9;
                                    int i10 = i8 % 2;
                                    i6++;
                                    int i11 = i9 + 3;
                                    copydefault = i11 % 128;
                                    int i12 = i11 % 2;
                                    j4 = j3;
                                    i4 = 8;
                                }
                                if (i5 == i2) {
                                    break;
                                }
                                jLongValue -= 1024;
                                i3++;
                                c2 = '0';
                            } else {
                                try {
                                    Object[] objArr3 = {-1008433143};
                                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                                    if (objCopydefault3 == null) {
                                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1663 - TextUtils.indexOf("", "", 0), 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1006506020, false, null, new Class[]{Integer.TYPE});
                                    }
                                    Object[] objArr4 = {Integer.valueOf(flags), 0, 2100545114, ((Constructor) objCopydefault3).newInstance(objArr3), false};
                                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                                    if (objCopydefault4 == null) {
                                        int fadingEdgeLength = 1454 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int defaultSize = View.getDefaultSize(0, 0) + 22;
                                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                                        byte b2 = (byte) 0;
                                        byte b3 = b2;
                                        Object[] objArr5 = new Object[1];
                                        b(b2, b3, b3, objArr5);
                                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, defaultSize, cCombineMeasuredStates, 1908380642, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 1591, 38 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) KeyEvent.getDeadChar(0, 0)), Boolean.TYPE});
                                    }
                                    Object[] objArr6 = (Object[]) ((Method) objCopydefault4).invoke(null, objArr4);
                                    int i13 = ((int[]) objArr6[2])[0];
                                    int i14 = ((int[]) objArr6[1])[0];
                                    if (i14 != i13) {
                                        ArrayList arrayList = new ArrayList();
                                        String[] strArr = (String[]) objArr6[3];
                                        if (strArr != null) {
                                            int i15 = copydefault;
                                            int i16 = i15 + 39;
                                            ShareDataUIState = i16 % 128;
                                            int i17 = i15 + 61;
                                            ShareDataUIState = i17 % 128;
                                            int i18 = i17 % 2;
                                            for (int i19 = (i16 % 2 != 0 ? 0 : 1) ^ 1; i19 < strArr.length; i19++) {
                                                arrayList.add(strArr[i19]);
                                            }
                                        }
                                        long j5 = -1;
                                        long j6 = 0;
                                        long j7 = (((long) (i13 ^ i14)) & ((j5 - ((j5 >> 63) << 32)) | (((long) 0) << 32))) | (((long) 1) << 32) | (j6 - ((j6 >> 63) << 32));
                                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                                        if (objCopydefault5 == null) {
                                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 42, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                                        }
                                        Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                                        Object[] objArr7 = {-1008433143, Long.valueOf(j7), arrayList, null, false, false};
                                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                                        if (objCopydefault6 == null) {
                                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 6562, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 56, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                                        }
                                        ((Method) objCopydefault6).invoke(objInvoke, objArr7);
                                        Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
                                    }
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                        }
                        dest.writeString(this.name);
                    }

                    static {
                        component1 = 1;
                        component2();
                        CREATOR = new Creator();
                        int i = component2 + 123;
                        component1 = i % 128;
                        int i2 = i % 2;
                    }

                    public static Channel copy$default(Channel channel, String str, int i, Object obj) {
                        int i2 = 2 % 2;
                        int i3 = copydefault;
                        int i4 = i3 + 5;
                        ShareDataUIState = i4 % 128;
                        if (i4 % 2 == 0 && (i & 1) != 0) {
                            int i5 = i3 + 47;
                            ShareDataUIState = i5 % 128;
                            int i6 = i5 % 2;
                            str = channel.name;
                            if (i6 != 0) {
                                int i7 = 66 / 0;
                            }
                        }
                        return channel.copy(str);
                    }

                    public final String component1() {
                        int i = 2 % 2;
                        int i2 = ShareDataUIState;
                        int i3 = i2 + 119;
                        copydefault = i3 % 128;
                        int i4 = i3 % 2;
                        String str = this.name;
                        int i5 = i2 + 69;
                        copydefault = i5 % 128;
                        if (i5 % 2 != 0) {
                            return str;
                        }
                        throw null;
                    }

                    public final Channel copy(String name) {
                        int i = 2 % 2;
                        Intrinsics.checkNotNullParameter(name, "");
                        Channel channel = new Channel(name);
                        int i2 = ShareDataUIState + 53;
                        copydefault = i2 % 128;
                        if (i2 % 2 != 0) {
                            return channel;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    @Override
                    public final int describeContents() {
                        int i = 2 % 2;
                        int i2 = ShareDataUIState + 9;
                        int i3 = i2 % 128;
                        copydefault = i3;
                        int i4 = i2 % 2;
                        int i5 = i3 + 87;
                        ShareDataUIState = i5 % 128;
                        int i6 = i5 % 2;
                        return 0;
                    }

                    public boolean equals(Object other) {
                        int i = 2 % 2;
                        int i2 = copydefault + 7;
                        int i3 = i2 % 128;
                        ShareDataUIState = i3;
                        int i4 = i2 % 2;
                        if (this == other) {
                            int i5 = i3 + 101;
                            copydefault = i5 % 128;
                            int i6 = i5 % 2;
                            return true;
                        }
                        if (!(other instanceof Channel)) {
                            return false;
                        }
                        if (Intrinsics.areEqual(this.name, ((Channel) other).name)) {
                            return true;
                        }
                        int i7 = copydefault + 1;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                        return false;
                    }

                    public int hashCode() {
                        int i = 2 % 2;
                        int i2 = copydefault + 11;
                        ShareDataUIState = i2 % 128;
                        if (i2 % 2 != 0) {
                            this.name.hashCode();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        int iHashCode = this.name.hashCode();
                        int i3 = copydefault + 113;
                        ShareDataUIState = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i4 = 1 / 0;
                        }
                        return iHashCode;
                    }

                    public String toString() {
                        int i = 2 % 2;
                        String str = "Channel(name=" + this.name + ')';
                        int i2 = copydefault + 1;
                        ShareDataUIState = i2 % 128;
                        int i3 = i2 % 2;
                        return str;
                    }

                    static void component2() {
                        component3 = 8046861696969696768L;
                    }
                }

                public static PaymentMethod copy$default(PaymentMethod paymentMethod, Channel channel, int i, Object obj) {
                    int i2 = 2 % 2;
                    if ((i & 1) != 0) {
                        int i3 = component1 + 117;
                        component2 = i3 % 128;
                        int i4 = i3 % 2;
                        channel = paymentMethod.channel;
                    }
                    PaymentMethod paymentMethodCopy = paymentMethod.copy(channel);
                    int i5 = component2 + 45;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    return paymentMethodCopy;
                }

                public final Channel component1() {
                    int i = 2 % 2;
                    int i2 = component1 + 117;
                    int i3 = i2 % 128;
                    component2 = i3;
                    int i4 = i2 % 2;
                    Channel channel = this.channel;
                    int i5 = i3 + 57;
                    component1 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return channel;
                    }
                    throw null;
                }

                public final PaymentMethod copy(Channel channel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(channel, "");
                    PaymentMethod paymentMethod = new PaymentMethod(channel);
                    int i2 = component1 + 31;
                    component2 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return paymentMethod;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public final int describeContents() {
                    int i = 2 % 2;
                    int i2 = component2;
                    int i3 = i2 + 71;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 111;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    return 0;
                }

                public boolean equals(Object other) {
                    int i = 2 % 2;
                    if (this == other) {
                        int i2 = component1 + 97;
                        component2 = i2 % 128;
                        return i2 % 2 == 0;
                    }
                    if (!(other instanceof PaymentMethod)) {
                        return false;
                    }
                    if (Intrinsics.areEqual(this.channel, ((PaymentMethod) other).channel)) {
                        return true;
                    }
                    int i3 = component2 + 63;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = component1 + 77;
                    component2 = i2 % 128;
                    if (i2 % 2 != 0) {
                        this.channel.hashCode();
                        throw null;
                    }
                    int iHashCode = this.channel.hashCode();
                    int i3 = component2 + 73;
                    component1 = i3 % 128;
                    if (i3 % 2 != 0) {
                        return iHashCode;
                    }
                    throw null;
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "PaymentMethod(channel=" + this.channel + ')';
                    int i2 = component1 + 41;
                    component2 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return str;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public final void writeToParcel(Parcel dest, int flags) throws Throwable {
                    int i = 2 % 2;
                    int i2 = component1 + 73;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(dest, "");
                    this.channel.writeToParcel(dest, flags);
                    int i4 = component1 + 15;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                }
            }

            public final PaymentMethod component1() {
                int i = 2 % 2;
                int i2 = ShareDataUIState;
                int i3 = i2 + 17;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                PaymentMethod paymentMethod = this.paymentMethod;
                int i5 = i2 + 107;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 18 / 0;
                }
                return paymentMethod;
            }

            public final Request component2() {
                Request request;
                int i = 2 % 2;
                int i2 = copydefault;
                int i3 = i2 + 101;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    request = this.request;
                    int i4 = 29 / 0;
                } else {
                    request = this.request;
                }
                int i5 = i2 + 43;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 64 / 0;
                }
                return request;
            }

            public final Parts copy(PaymentMethod paymentMethod, Request request) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(paymentMethod, "");
                Parts parts = new Parts(paymentMethod, request);
                int i2 = ShareDataUIState + 15;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return parts;
            }

            @Override
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 31;
                int i3 = i2 % 128;
                copydefault = i3;
                int i4 = (i2 % 2 == 0 ? 0 : 1) ^ 1;
                int i5 = i3 + 7;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }

            public boolean equals(Object other) {
                int i = 2 % 2;
                if (this == other) {
                    int i2 = ShareDataUIState + 83;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(other instanceof Parts)) {
                    return false;
                }
                Parts parts = (Parts) other;
                if (Intrinsics.areEqual(this.paymentMethod, parts.paymentMethod)) {
                    return Intrinsics.areEqual(this.request, parts.request);
                }
                int i4 = copydefault + 105;
                ShareDataUIState = i4 % 128;
                return i4 % 2 != 0;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int iHashCode2 = this.paymentMethod.hashCode();
                Request request = this.request;
                if (request == null) {
                    int i2 = copydefault + 19;
                    ShareDataUIState = i2 % 128;
                    iHashCode = i2 % 2 != 0 ? 1 : 0;
                } else {
                    iHashCode = request.hashCode();
                }
                int i3 = (iHashCode2 * 31) + iHashCode;
                int i4 = copydefault + 83;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return i3;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Parts(paymentMethod=" + this.paymentMethod + ", request=" + this.request + ')';
                int i2 = ShareDataUIState + 31;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) throws Throwable {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(dest, "");
                this.paymentMethod.writeToParcel(dest, flags);
                Request request = this.request;
                if (request == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    request.writeToParcel(dest, flags);
                    int i2 = copydefault + 57;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                }
                int i4 = copydefault + 111;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }

            @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\"#$B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0015H×\u0001J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006%"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request;", "Landroid/os/Parcelable;", "amount", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request$Amount;", "convertedAmount", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request$ConvertedAmount;", "taxAmount", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request$TaxAmount;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request$Amount;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request$ConvertedAmount;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request$TaxAmount;)V", "getAmount", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request$Amount;", "getConvertedAmount", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request$ConvertedAmount;", "getTaxAmount", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request$TaxAmount;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Amount", "ConvertedAmount", "TaxAmount", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Request implements Parcelable {
                public static final int $stable = 0;
                public static final Parcelable.Creator<Request> CREATOR = new Creator();
                private static int ShareDataUIState = 1;
                private static int component1 = 1;
                private static int component3;
                private static int copydefault;

                @SerializedName("amount")
                private final Amount amount;

                @SerializedName("convertedAmount")
                private final ConvertedAmount convertedAmount;

                @SerializedName("taxAmount")
                private final TaxAmount taxAmount;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Request> {
                    private static int component1 = 1;
                    private static int component2;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override
                    public final Request createFromParcel(Parcel parcel) {
                        int i = 2 % 2;
                        Intrinsics.checkNotNullParameter(parcel, "");
                        Request request = new Request(Amount.CREATOR.createFromParcel(parcel), ConvertedAmount.CREATOR.createFromParcel(parcel), TaxAmount.CREATOR.createFromParcel(parcel));
                        int i2 = component2 + 67;
                        component1 = i2 % 128;
                        if (i2 % 2 != 0) {
                            return request;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    @Override
                    public Request createFromParcel(Parcel parcel) {
                        int i = 2 % 2;
                        int i2 = component2 + 33;
                        component1 = i2 % 128;
                        if (i2 % 2 == 0) {
                            createFromParcel(parcel);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Request requestCreateFromParcel = createFromParcel(parcel);
                        int i3 = component1 + 39;
                        component2 = i3 % 128;
                        int i4 = i3 % 2;
                        return requestCreateFromParcel;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override
                    public final Request[] newArray(int i) {
                        int i2 = 2 % 2;
                        int i3 = component1 + 59;
                        int i4 = i3 % 128;
                        component2 = i4;
                        int i5 = i3 % 2;
                        Request[] requestArr = new Request[i];
                        int i6 = i4 + 21;
                        component1 = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 1 / 0;
                        }
                        return requestArr;
                    }

                    @Override
                    public Request[] newArray(int i) {
                        int i2 = 2 % 2;
                        int i3 = component1 + 111;
                        component2 = i3 % 128;
                        int i4 = i3 % 2;
                        Request[] requestArrNewArray = newArray(i);
                        if (i4 != 0) {
                            int i5 = 46 / 0;
                        }
                        return requestArrNewArray;
                    }
                }

                public Request(Amount amount, ConvertedAmount convertedAmount, TaxAmount taxAmount) {
                    Intrinsics.checkNotNullParameter(amount, "");
                    Intrinsics.checkNotNullParameter(convertedAmount, "");
                    Intrinsics.checkNotNullParameter(taxAmount, "");
                    this.amount = amount;
                    this.convertedAmount = convertedAmount;
                    this.taxAmount = taxAmount;
                }

                public final Amount getAmount() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 75;
                    component3 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return this.amount;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final ConvertedAmount getConvertedAmount() {
                    int i = 2 % 2;
                    int i2 = component3;
                    int i3 = i2 + 5;
                    ShareDataUIState = i3 % 128;
                    if (i3 % 2 == 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    ConvertedAmount convertedAmount = this.convertedAmount;
                    int i4 = i2 + 103;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return convertedAmount;
                }

                public final TaxAmount getTaxAmount() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState;
                    int i3 = i2 + 11;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    TaxAmount taxAmount = this.taxAmount;
                    int i5 = i2 + 75;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    return taxAmount;
                }

                static {
                    int i = copydefault + 59;
                    component1 = i % 128;
                    int i2 = i % 2;
                }

                public static Request copy$default(Request request, Amount amount, ConvertedAmount convertedAmount, TaxAmount taxAmount, int i, Object obj) {
                    int i2 = 2 % 2;
                    int i3 = component3 + 57;
                    int i4 = i3 % 128;
                    ShareDataUIState = i4;
                    int i5 = i3 % 2;
                    if ((i & 1) != 0) {
                        int i6 = i4 + 57;
                        component3 = i6 % 128;
                        int i7 = i6 % 2;
                        amount = request.amount;
                        if (i7 != 0) {
                            int i8 = 53 / 0;
                        }
                    }
                    if ((i & 2) != 0) {
                        int i9 = component3 + 103;
                        ShareDataUIState = i9 % 128;
                        int i10 = i9 % 2;
                        convertedAmount = request.convertedAmount;
                    }
                    if ((i & 4) != 0) {
                        taxAmount = request.taxAmount;
                    }
                    return request.copy(amount, convertedAmount, taxAmount);
                }

                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request$Amount;", "Landroid/os/Parcelable;", "currencyID", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrencyID", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Amount implements Parcelable {
                    public static final int $stable = 0;
                    public static final Parcelable.Creator<Amount> CREATOR = new Creator();
                    private static int ShareDataUIState = 1;
                    private static int component1 = 0;
                    private static int component2 = 0;
                    private static int component3 = 1;

                    @SerializedName("currencyID")
                    private final String currencyID;

                    @SerializedName("value")
                    private final String value;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<Amount> {
                        private static int ShareDataUIState = 0;
                        private static int component2 = 1;

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override
                        public final Amount createFromParcel(Parcel parcel) {
                            int i = 2 % 2;
                            Intrinsics.checkNotNullParameter(parcel, "");
                            Amount amount = new Amount(parcel.readString(), parcel.readString());
                            int i2 = ShareDataUIState + 125;
                            component2 = i2 % 128;
                            if (i2 % 2 != 0) {
                                return amount;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        @Override
                        public Amount createFromParcel(Parcel parcel) {
                            int i = 2 % 2;
                            int i2 = component2 + 15;
                            ShareDataUIState = i2 % 128;
                            int i3 = i2 % 2;
                            Amount amountCreateFromParcel = createFromParcel(parcel);
                            int i4 = ShareDataUIState + 35;
                            component2 = i4 % 128;
                            if (i4 % 2 != 0) {
                                return amountCreateFromParcel;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override
                        public final Amount[] newArray(int i) {
                            int i2 = 2 % 2;
                            int i3 = ShareDataUIState;
                            int i4 = i3 + 1;
                            component2 = i4 % 128;
                            Amount[] amountArr = new Amount[i];
                            if (i4 % 2 == 0) {
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            int i5 = i3 + 113;
                            component2 = i5 % 128;
                            int i6 = i5 % 2;
                            return amountArr;
                        }

                        @Override
                        public Amount[] newArray(int i) {
                            int i2 = 2 % 2;
                            int i3 = component2 + 65;
                            ShareDataUIState = i3 % 128;
                            int i4 = i3 % 2;
                            Amount[] amountArrNewArray = newArray(i);
                            int i5 = ShareDataUIState + 49;
                            component2 = i5 % 128;
                            int i6 = i5 % 2;
                            return amountArrNewArray;
                        }
                    }

                    public Amount(String str, String str2) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        this.currencyID = str;
                        this.value = str2;
                    }

                    public final String getCurrencyID() {
                        int i = 2 % 2;
                        int i2 = component1 + 21;
                        int i3 = i2 % 128;
                        component3 = i3;
                        int i4 = i2 % 2;
                        String str = this.currencyID;
                        int i5 = i3 + 31;
                        component1 = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 51 / 0;
                        }
                        return str;
                    }

                    public final String getValue() {
                        int i = 2 % 2;
                        int i2 = component3 + 51;
                        int i3 = i2 % 128;
                        component1 = i3;
                        int i4 = i2 % 2;
                        String str = this.value;
                        int i5 = i3 + 57;
                        component3 = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 56 / 0;
                        }
                        return str;
                    }

                    static {
                        int i = component2 + 81;
                        ShareDataUIState = i % 128;
                        int i2 = i % 2;
                    }

                    public static Amount copy$default(Amount amount, String str, String str2, int i, Object obj) {
                        int i2 = 2 % 2;
                        if ((i & 1) != 0) {
                            int i3 = component3 + 41;
                            component1 = i3 % 128;
                            if (i3 % 2 != 0) {
                                String str3 = amount.currencyID;
                                throw null;
                            }
                            str = amount.currencyID;
                        }
                        if ((i & 2) != 0) {
                            int i4 = component3;
                            int i5 = i4 + 65;
                            component1 = i5 % 128;
                            int i6 = i5 % 2;
                            String str4 = amount.value;
                            int i7 = i4 + 79;
                            component1 = i7 % 128;
                            int i8 = i7 % 2;
                            str2 = str4;
                        }
                        return amount.copy(str, str2);
                    }

                    public final String component1() {
                        int i = 2 % 2;
                        int i2 = component3;
                        int i3 = i2 + 109;
                        component1 = i3 % 128;
                        Object obj = null;
                        if (i3 % 2 != 0) {
                            throw null;
                        }
                        String str = this.currencyID;
                        int i4 = i2 + 15;
                        component1 = i4 % 128;
                        if (i4 % 2 == 0) {
                            return str;
                        }
                        obj.hashCode();
                        throw null;
                    }

                    public final String component2() {
                        int i = 2 % 2;
                        int i2 = component3;
                        int i3 = i2 + 101;
                        component1 = i3 % 128;
                        int i4 = i3 % 2;
                        String str = this.value;
                        int i5 = i2 + 113;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        return str;
                    }

                    public final Amount copy(String currencyID, String value) {
                        int i = 2 % 2;
                        Intrinsics.checkNotNullParameter(currencyID, "");
                        Intrinsics.checkNotNullParameter(value, "");
                        Amount amount = new Amount(currencyID, value);
                        int i2 = component1 + 105;
                        component3 = i2 % 128;
                        int i3 = i2 % 2;
                        return amount;
                    }

                    @Override
                    public final int describeContents() {
                        int i = 2 % 2;
                        int i2 = component3 + 117;
                        component1 = i2 % 128;
                        int i3 = i2 % 2;
                        return 0;
                    }

                    public boolean equals(Object other) {
                        int i = 2 % 2;
                        int i2 = component1 + 31;
                        component3 = i2 % 128;
                        if (i2 % 2 == 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Amount)) {
                            return false;
                        }
                        Amount amount = (Amount) other;
                        if (!Intrinsics.areEqual(this.currencyID, amount.currencyID)) {
                            return false;
                        }
                        if (Intrinsics.areEqual(this.value, amount.value)) {
                            return true;
                        }
                        int i3 = component1;
                        int i4 = i3 + 43;
                        component3 = i4 % 128;
                        int i5 = i4 % 2;
                        int i6 = i3 + 95;
                        component3 = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 73 / 0;
                        }
                        return false;
                    }

                    public int hashCode() {
                        int i = 2 % 2;
                        int i2 = component3 + 37;
                        component1 = i2 % 128;
                        int i3 = i2 % 2;
                        int iHashCode = (this.currencyID.hashCode() * 31) + this.value.hashCode();
                        int i4 = component3 + 109;
                        component1 = i4 % 128;
                        if (i4 % 2 == 0) {
                            return iHashCode;
                        }
                        throw null;
                    }

                    public String toString() {
                        int i = 2 % 2;
                        String str = "Amount(currencyID=" + this.currencyID + ", value=" + this.value + ')';
                        int i2 = component1 + 103;
                        component3 = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i3 = 98 / 0;
                        }
                        return str;
                    }

                    @Override
                    public final void writeToParcel(Parcel dest, int flags) {
                        int i = 2 % 2;
                        int i2 = component1 + 47;
                        component3 = i2 % 128;
                        int i3 = i2 % 2;
                        Intrinsics.checkNotNullParameter(dest, "");
                        dest.writeString(this.currencyID);
                        dest.writeString(this.value);
                        int i4 = component1 + 47;
                        component3 = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 59 / 0;
                        }
                    }
                }

                public final Amount component1() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState;
                    int i3 = i2 + 23;
                    component3 = i3 % 128;
                    if (i3 % 2 != 0) {
                        throw null;
                    }
                    Amount amount = this.amount;
                    int i4 = i2 + 23;
                    component3 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 0 / 0;
                    }
                    return amount;
                }

                public final ConvertedAmount component2() {
                    int i = 2 % 2;
                    int i2 = component3 + 123;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    ConvertedAmount convertedAmount = this.convertedAmount;
                    if (i3 == 0) {
                        int i4 = 95 / 0;
                    }
                    return convertedAmount;
                }

                public final TaxAmount component3() {
                    int i = 2 % 2;
                    int i2 = component3 + 71;
                    ShareDataUIState = i2 % 128;
                    if (i2 % 2 != 0) {
                        return this.taxAmount;
                    }
                    throw null;
                }

                public final Request copy(Amount amount, ConvertedAmount convertedAmount, TaxAmount taxAmount) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(amount, "");
                    Intrinsics.checkNotNullParameter(convertedAmount, "");
                    Intrinsics.checkNotNullParameter(taxAmount, "");
                    Request request = new Request(amount, convertedAmount, taxAmount);
                    int i2 = ShareDataUIState + 109;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    return request;
                }

                @Override
                public final int describeContents() {
                    int i = 2 % 2;
                    int i2 = component3 + 7;
                    int i3 = i2 % 128;
                    ShareDataUIState = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 45;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    return 0;
                }

                public boolean equals(Object other) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 119;
                    int i3 = i2 % 128;
                    component3 = i3;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Request)) {
                        int i4 = i3 + 69;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                        return false;
                    }
                    Request request = (Request) other;
                    if (!Intrinsics.areEqual(this.amount, request.amount)) {
                        int i6 = component3 + 5;
                        ShareDataUIState = i6 % 128;
                        int i7 = i6 % 2;
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.convertedAmount, request.convertedAmount)) {
                        int i8 = ShareDataUIState + 51;
                        component3 = i8 % 128;
                        int i9 = i8 % 2;
                        return false;
                    }
                    if (Intrinsics.areEqual(this.taxAmount, request.taxAmount)) {
                        return true;
                    }
                    int i10 = component3 + 109;
                    ShareDataUIState = i10 % 128;
                    return !(i10 % 2 != 0);
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 3;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    int iHashCode = (((this.amount.hashCode() * 31) + this.convertedAmount.hashCode()) * 31) + this.taxAmount.hashCode();
                    int i4 = component3 + 23;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 != 0) {
                        return iHashCode;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request$ConvertedAmount;", "Landroid/os/Parcelable;", "currencyID", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrencyID", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class ConvertedAmount implements Parcelable {
                    public static final int $stable = 0;
                    public static final Parcelable.Creator<ConvertedAmount> CREATOR;
                    private static int ShareDataUIState;
                    private static int component1;
                    private static char[] component2;
                    private static boolean component3;
                    private static boolean copydefault;

                    @SerializedName("currencyID")
                    private final String currencyID;

                    @SerializedName("value")
                    private final String value;
                    private static final byte[] $$c = {89, 120, -98, -110};
                    private static final int $$f = 243;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$d = {Ascii.VT, -55, -20, -91, -17, -3, 58, -63, -18, Ascii.SI, -27, 13, -9, TarHeader.LF_FIFO, -59, -10, -3, -7, -16, Ascii.SO, -16, -9, 10, -29, 7, 3, -14, -11, 65, -58, -17, -4, -10, -7, 3, 3, -18, 63, -74, 8, -2, -23, 7, TarHeader.LF_FIFO, -74, 9, -18, -9, 8, 1, -7, -16, 2, -10, 59, -61, -17, Ascii.FF, -11, -11, 3, -14, -11, 65, -26, -49, -4, 3, -8, -14, 0, 37, -42, 2, -18, 2, -3, 13, -23, -18, -9, 8, 1, -7, Ascii.DLE, -30, -10, 35, -49, Ascii.FF, -11, -11, 3, -14, -11, 75, PSSSigner.TRAILER_IMPLICIT, -17, -3, -8, -4, -4, 4, -14, -11, 62, -17, -3, -8, -4, -4, 4, -14, -11, 62};
                    private static final int $$e = 249;
                    private static final byte[] $$a = {84, 79, Ascii.SYN, 41, -2, Ascii.SI, -51, TarHeader.LF_SYMLINK, -50, TarHeader.LF_CHR, -32, Ascii.NAK, 4, -8, Ascii.SO, 1, -19, Ascii.FF, 3, -2, Ascii.SI, -34, 19, Ascii.FF, 4, -16, Ascii.SO, 1, -50, 35, 9, -9, 1, 3, -6, 6, -8, 17, -9, -4, Ascii.SO, -32, 33, -19, 19, -15, Ascii.FF, 1, 9};
                    private static final int $$b = 240;
                    private static int copy = 0;
                    private static int equals = 1;
                    private static int component4 = 1;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<ConvertedAmount> {
                        private static int component1 = 1;
                        private static int component2;

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override
                        public final ConvertedAmount createFromParcel(Parcel parcel) {
                            int i = 2 % 2;
                            Intrinsics.checkNotNullParameter(parcel, "");
                            ConvertedAmount convertedAmount = new ConvertedAmount(parcel.readString(), parcel.readString());
                            int i2 = component1 + 47;
                            component2 = i2 % 128;
                            if (i2 % 2 == 0) {
                                return convertedAmount;
                            }
                            throw null;
                        }

                        @Override
                        public ConvertedAmount createFromParcel(Parcel parcel) {
                            int i = 2 % 2;
                            int i2 = component2 + 123;
                            component1 = i2 % 128;
                            int i3 = i2 % 2;
                            ConvertedAmount convertedAmountCreateFromParcel = createFromParcel(parcel);
                            int i4 = component2 + 85;
                            component1 = i4 % 128;
                            int i5 = i4 % 2;
                            return convertedAmountCreateFromParcel;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override
                        public final ConvertedAmount[] newArray(int i) {
                            int i2 = 2 % 2;
                            int i3 = component1 + 103;
                            component2 = i3 % 128;
                            ConvertedAmount[] convertedAmountArr = new ConvertedAmount[i];
                            if (i3 % 2 != 0) {
                                int i4 = 3 / 0;
                            }
                            return convertedAmountArr;
                        }

                        @Override
                        public ConvertedAmount[] newArray(int i) {
                            int i2 = 2 % 2;
                            int i3 = component2 + 15;
                            component1 = i3 % 128;
                            int i4 = i3 % 2;
                            ConvertedAmount[] convertedAmountArrNewArray = newArray(i);
                            int i5 = component1 + 101;
                            component2 = i5 % 128;
                            if (i5 % 2 == 0) {
                                return convertedAmountArrNewArray;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private static java.lang.String $$g(int r6, short r7, byte r8) {
                        /*
                            int r7 = r7 * 3
                            int r7 = 3 - r7
                            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.Parts.Request.ConvertedAmount.$$c
                            int r8 = r8 * 5
                            int r8 = r8 + 68
                            int r6 = r6 * 3
                            int r1 = 1 - r6
                            byte[] r1 = new byte[r1]
                            r2 = 0
                            int r6 = 0 - r6
                            if (r0 != 0) goto L18
                            r3 = r6
                            r4 = r2
                            goto L2e
                        L18:
                            r3 = r2
                        L19:
                            int r7 = r7 + 1
                            byte r4 = (byte) r8
                            r1[r3] = r4
                            if (r3 != r6) goto L26
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            return r6
                        L26:
                            int r3 = r3 + 1
                            r4 = r0[r7]
                            r5 = r3
                            r3 = r8
                            r8 = r4
                            r4 = r5
                        L2e:
                            int r8 = -r8
                            int r8 = r8 + r3
                            r3 = r4
                            goto L19
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.Parts.Request.ConvertedAmount.$$g(int, short, byte):java.lang.String");
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private static void a(byte r5, byte r6, short r7, java.lang.Object[] r8) {
                        /*
                            int r7 = r7 * 4
                            int r7 = 103 - r7
                            int r6 = r6 * 3
                            int r6 = 46 - r6
                            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.Parts.Request.ConvertedAmount.$$a
                            int r5 = r5 * 12
                            int r1 = r5 + 4
                            byte[] r1 = new byte[r1]
                            int r5 = r5 + 3
                            r2 = 0
                            if (r0 != 0) goto L18
                            r4 = r5
                            r3 = r2
                            goto L2a
                        L18:
                            r3 = r2
                        L19:
                            byte r4 = (byte) r7
                            r1[r3] = r4
                            if (r3 != r5) goto L26
                            java.lang.String r5 = new java.lang.String
                            r5.<init>(r1, r2)
                            r8[r2] = r5
                            return
                        L26:
                            r4 = r0[r6]
                            int r3 = r3 + 1
                        L2a:
                            int r7 = r7 + r4
                            int r6 = r6 + 1
                            goto L19
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.Parts.Request.ConvertedAmount.a(byte, byte, short, java.lang.Object[]):void");
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
                        /*
                            int r7 = r7 * 93
                            int r0 = 103 - r7
                            int r6 = r6 * 2
                            int r6 = r6 + 99
                            int r8 = r8 * 102
                            int r8 = 106 - r8
                            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.Parts.Request.ConvertedAmount.$$d
                            byte[] r0 = new byte[r0]
                            int r7 = 102 - r7
                            r2 = 0
                            if (r1 != 0) goto L19
                            r6 = r7
                            r3 = r8
                            r4 = r2
                            goto L2f
                        L19:
                            r3 = r2
                        L1a:
                            byte r4 = (byte) r6
                            r0[r3] = r4
                            if (r3 != r7) goto L27
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r0, r2)
                            r9[r2] = r6
                            return
                        L27:
                            r4 = r1[r8]
                            int r3 = r3 + 1
                            r5 = r3
                            r3 = r8
                            r8 = r4
                            r4 = r5
                        L2f:
                            int r8 = -r8
                            int r3 = r3 + 1
                            int r6 = r6 + r8
                            int r6 = r6 + (-5)
                            r8 = r3
                            r3 = r4
                            goto L1a
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto.Response.Parts.Request.ConvertedAmount.c(int, byte, short, java.lang.Object[]):void");
                    }

                    public ConvertedAmount(String str, String str2) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        this.currencyID = str;
                        this.value = str2;
                    }

                    public final String getCurrencyID() {
                        int i = 2 % 2;
                        int i2 = copy;
                        int i3 = i2 + 17;
                        equals = i3 % 128;
                        int i4 = i3 % 2;
                        String str = this.currencyID;
                        int i5 = i2 + 35;
                        equals = i5 % 128;
                        int i6 = i5 % 2;
                        return str;
                    }

                    private static void b(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
                        int i2;
                        char[] cArr2;
                        int i3 = 2 % 2;
                        cancel cancelVar = new cancel();
                        char[] cArr3 = component2;
                        int i4 = 0;
                        if (cArr3 != null) {
                            int length = cArr3.length;
                            char[] cArr4 = new char[length];
                            int i5 = 0;
                            while (i5 < length) {
                                try {
                                    Object[] objArr2 = new Object[1];
                                    objArr2[i4] = Integer.valueOf(cArr3[i5]);
                                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                                    if (objCopydefault == null) {
                                        byte b2 = (byte) i4;
                                        byte b3 = b2;
                                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", i4) + 24, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), -1670574543, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                                    }
                                    cArr4[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                                    i5++;
                                    i4 = 0;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            cArr3 = cArr4;
                        }
                        try {
                            Object[] objArr3 = {Integer.valueOf(component1)};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
                            if (objCopydefault2 == null) {
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7140 - KeyEvent.normalizeMetaState(0), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.SO, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
                            }
                            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                            int i6 = 689978476;
                            if (component3) {
                                int i7 = $10 + 117;
                                $11 = i7 % 128;
                                if (i7 % 2 == 0) {
                                    cancelVar.component1 = bArr.length;
                                    cArr2 = new char[cancelVar.component1];
                                    i2 = 0;
                                } else {
                                    i2 = 0;
                                    cancelVar.component1 = bArr.length;
                                    cArr2 = new char[cancelVar.component1];
                                }
                                cancelVar.component3 = i2;
                                while (cancelVar.component3 < cancelVar.component1) {
                                    cArr2[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                                    Object[] objArr4 = {cancelVar, cancelVar};
                                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i6);
                                    if (objCopydefault3 == null) {
                                        byte b4 = (byte) 0;
                                        byte b5 = b4;
                                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.MeasureSpec.getMode(0) + 19, (char) (7644 - (ViewConfiguration.getTapTimeout() >> 16)), -327556343, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objCopydefault3).invoke(null, objArr4);
                                    i6 = 689978476;
                                }
                                objArr[0] = new String(cArr2);
                                return;
                            }
                            if (copydefault) {
                                cancelVar.component1 = cArr.length;
                                char[] cArr5 = new char[cancelVar.component1];
                                cancelVar.component3 = 0;
                                while (cancelVar.component3 < cancelVar.component1) {
                                    int i8 = $11 + 41;
                                    $10 = i8 % 128;
                                    int i9 = i8 % 2;
                                    cArr5[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                                    Object[] objArr5 = {cancelVar, cancelVar};
                                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                                    if (objCopydefault4 == null) {
                                        byte b6 = (byte) 0;
                                        byte b7 = b6;
                                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 2748, 19 - ExpandableListView.getPackedPositionType(0L), (char) (7644 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), -327556343, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objCopydefault4).invoke(null, objArr5);
                                }
                                objArr[0] = new String(cArr5);
                                return;
                            }
                            cancelVar.component1 = iArr.length;
                            char[] cArr6 = new char[cancelVar.component1];
                            cancelVar.component3 = 0;
                            int i10 = $10 + 65;
                            $11 = i10 % 128;
                            while (true) {
                                int i11 = i10 % 2;
                                if (cancelVar.component3 >= cancelVar.component1) {
                                    objArr[0] = new String(cArr6);
                                    return;
                                }
                                int i12 = $11 + 13;
                                $10 = i12 % 128;
                                int i13 = i12 % 2;
                                cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                                cancelVar.component3++;
                                i10 = $10 + 123;
                                $11 = i10 % 128;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }

                    public final String getValue() throws Throwable {
                        Object[] objArr;
                        int i = 2 % 2;
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
                        if (objCopydefault == null) {
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1115;
                            int scrollBarSize = 22 - (ViewConfiguration.getScrollBarSize() >> 8);
                            char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            byte b2 = $$a[15];
                            Object[] objArr2 = new Object[1];
                            a(b2, r1[14], (byte) (b2 - 1), objArr2);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity, scrollBarSize, c2, -1308762862, false, (String) objArr2[0], null);
                        }
                        long j = ((Field) objCopydefault).getLong(null);
                        Object[] objArr3 = new Object[1];
                        b(null, View.resolveSizeAndState(0, 0, 0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        b(null, Color.green(0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, null, objArr4);
                        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
                        if (objCopydefault2 == null) {
                            Object[] objArr5 = new Object[1];
                            a((byte) (-$$a[4]), r17[30], (byte) (r17[15] - 1), objArr5);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1115 - View.MeasureSpec.getSize(0), 22 - TextUtils.indexOf("", "", 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), -206681338, false, (String) objArr5[0], null);
                        }
                        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
                            if (objCopydefault3 == null) {
                                int i2 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1114;
                                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 22;
                                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                byte b3 = $$a[15];
                                byte b4 = (byte) (b3 - 1);
                                Object[] objArr6 = new Object[1];
                                a(b4, b4, b3, objArr6);
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i2, iCombineMeasuredStates, threadPriority, 44744436, false, (String) objArr6[0], null);
                            }
                            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
                            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                            int iIdentityHashCode = System.identityHashCode(this);
                            int i3 = ~iIdentityHashCode;
                            int i4 = ((176141959 + (((~((-464211645) | i3)) | (~(iIdentityHashCode | (-271014157)))) * 333)) + (((~(iIdentityHashCode | (-464211645))) | (~(i3 | (-271014157)))) * 333)) - 271905253;
                            int i5 = (i4 << 13) ^ i4;
                            int i6 = i5 ^ (i5 >>> 17);
                            ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
                        } else {
                            Object[] objArr8 = new Object[1];
                            b(null, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, null, objArr8);
                            Class<?> cls2 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            b(null, 127 - TextUtils.indexOf("", "", 0), new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, null, objArr9);
                            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                            int i7 = equals + 11;
                            copy = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 3 % 2;
                            }
                            try {
                                Object[] objArr10 = {Integer.valueOf(iIntValue), -271905253};
                                byte[] bArr = $$d;
                                byte b5 = bArr[70];
                                Object[] objArr11 = new Object[1];
                                c(b5, b5, bArr[49], objArr11);
                                Class<?> cls3 = Class.forName((String) objArr11[0]);
                                byte b6 = bArr[70];
                                Object[] objArr12 = new Object[1];
                                c(b6, bArr[49], b6, objArr12);
                                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
                                if (objCopydefault4 == null) {
                                    int iResolveSize = View.resolveSize(0, 0) + 1115;
                                    int iIndexOf = TextUtils.indexOf("", "", 0) + 22;
                                    char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                    byte b7 = $$a[15];
                                    byte b8 = (byte) (b7 - 1);
                                    Object[] objArr13 = new Object[1];
                                    a(b8, b8, b7, objArr13);
                                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, iIndexOf, packedPositionChild, 44744436, false, (String) objArr13[0], null);
                                }
                                ((Field) objCopydefault4).set(null, objArr);
                                try {
                                    Object[] objArr14 = new Object[1];
                                    b(null, TextUtils.indexOf("", "", 0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, objArr14);
                                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                                    Object[] objArr15 = new Object[1];
                                    b(null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, null, objArr15);
                                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
                                    if (objCopydefault5 == null) {
                                        int longPressTimeout = 1115 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                        int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0');
                                        char cGreen = (char) Color.green(0);
                                        byte[] bArr2 = $$a;
                                        Object[] objArr16 = new Object[1];
                                        a((byte) (-bArr2[4]), bArr2[30], (byte) (bArr2[15] - 1), objArr16);
                                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(longPressTimeout, iLastIndexOf, cGreen, -206681338, false, (String) objArr16[0], null);
                                    }
                                    ((Field) objCopydefault5).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
                                    if (objCopydefault6 == null) {
                                        int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 1115;
                                        int i9 = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                        char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                        byte b9 = $$a[15];
                                        Object[] objArr17 = new Object[1];
                                        a(b9, r2[14], (byte) (b9 - 1), objArr17);
                                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(longPressTimeout2, i9, c3, -1308762862, false, (String) objArr17[0], null);
                                    }
                                    ((Field) objCopydefault6).set(null, lValueOf2);
                                } catch (Exception unused) {
                                    throw new RuntimeException();
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        int i10 = ((int[]) objArr[1])[0];
                        int i11 = ((int[]) objArr[2])[0];
                        if (i11 == i10) {
                            int i12 = ((int[]) objArr[0])[0];
                            Object[] objArr18 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                            int iMyUid = Process.myUid();
                            int i13 = (-115378143) + ((iMyUid | 308261352) * (-50));
                            int i14 = ~((-268698049) | iMyUid);
                            int i15 = ~iMyUid;
                            int i16 = i12 + i13 + ((i14 | (~(383761912 | i15))) * 50) + (((~(i15 | 308261352)) | (~(115063864 | i15)) | (-383761913)) * 50);
                            int i17 = (i16 << 13) ^ i16;
                            int i18 = i17 ^ (i17 >>> 17);
                            ((int[]) objArr18[0])[0] = i18 ^ (i18 << 5);
                            int i19 = ((int[]) objArr18[0])[0];
                            Object[] objArr19 = {new int[1], new int[]{((int[]) objArr18[1])[0]}, new int[]{((int[]) objArr18[2])[0]}, (String[]) objArr18[3]};
                            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                            int i20 = i19 + ((((-1259514989) + (((~(542975881 | iFreeMemory)) | (-736173370)) * (-948))) + ((~((~iFreeMemory) | (-195041329))) * (-948))) - 439355116);
                            int i21 = (i20 << 13) ^ i20;
                            int i22 = i21 ^ (i21 >>> 17);
                            ((int[]) objArr19[0])[0] = i22 ^ (i22 << 5);
                            int i23 = equals + 15;
                            copy = i23 % 128;
                            int i24 = i23 % 2;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr[3];
                            if (strArr != null) {
                                int i25 = equals + 115;
                                copy = i25 % 128;
                                int i26 = i25 % 2;
                                for (String str : strArr) {
                                    arrayList.add(str);
                                }
                            }
                            long j2 = -1;
                            long j3 = ((long) (i10 ^ i11)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
                            long j4 = 0;
                            long j5 = j3 | (((long) 6) << 32) | (j4 - ((j4 >> 63) << 32));
                            try {
                                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                                if (objCopydefault7 == null) {
                                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.getTrimmedLength(""), 42 - ExpandableListView.getPackedPositionType(0L), (char) TextUtils.indexOf("", "", 0), 428292935, false, "ShareDataUIState", new Class[0]);
                                }
                                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                                Object[] objArr20 = {2101408493, Long.valueOf(j5), arrayList, null, false, false};
                                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                                if (objCopydefault8 == null) {
                                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(0L) + 6562, 56 - TextUtils.indexOf("", "", 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                                }
                                ((Method) objCopydefault8).invoke(objInvoke, objArr20);
                                int i27 = ((int[]) objArr[0])[0];
                                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                                int iIdentityHashCode2 = System.identityHashCode(this);
                                int i28 = ~iIdentityHashCode2;
                                int i29 = i27 + (-1292050458) + (((~((-456166418) | i28)) | (-262968930)) * 519) + (((~(i28 | (-186680322))) | (~((-76288609) | iIdentityHashCode2))) * (-519)) + (((~(iIdentityHashCode2 | (-262968930))) | 456166417) * 519);
                                int i30 = (i29 << 13) ^ i29;
                                int i31 = i30 ^ (i30 >>> 17);
                                ((int[]) objArr21[0])[0] = i31 ^ (i31 << 5);
                                Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
                                int i32 = ((int[]) objArr21[0])[0];
                                Object[] objArr22 = {new int[1], new int[]{((int[]) objArr21[1])[0]}, new int[]{((int[]) objArr21[2])[0]}, (String[]) objArr21[3]};
                                int i33 = ~System.identityHashCode(this);
                                int i34 = i32 + (-64397876) + (((~(412718362 | i33)) | (-605915851)) * (-983)) + (((~(i33 | (-605915851))) | 1671178) * 983);
                                int i35 = (i34 << 13) ^ i34;
                                int i36 = i35 ^ (i35 >>> 17);
                                ((int[]) objArr22[0])[0] = i36 ^ (i36 << 5);
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        }
                        return this.value;
                    }

                    static {
                        ShareDataUIState = 0;
                        copydefault();
                        CREATOR = new Creator();
                        int i = component4 + 19;
                        ShareDataUIState = i % 128;
                        if (i % 2 != 0) {
                            int i2 = 87 / 0;
                        }
                    }

                    public static ConvertedAmount copy$default(ConvertedAmount convertedAmount, String str, String str2, int i, Object obj) {
                        int i2 = 2 % 2;
                        if ((i & 1) != 0) {
                            int i3 = equals + 79;
                            copy = i3 % 128;
                            if (i3 % 2 != 0) {
                                String str3 = convertedAmount.currencyID;
                                throw null;
                            }
                            str = convertedAmount.currencyID;
                        }
                        if ((i & 2) != 0) {
                            str2 = convertedAmount.value;
                            int i4 = copy + 83;
                            equals = i4 % 128;
                            int i5 = i4 % 2;
                        }
                        return convertedAmount.copy(str, str2);
                    }

                    public final String component1() {
                        int i = 2 % 2;
                        int i2 = equals + 5;
                        int i3 = i2 % 128;
                        copy = i3;
                        int i4 = i2 % 2;
                        String str = this.currencyID;
                        int i5 = i3 + 13;
                        equals = i5 % 128;
                        int i6 = i5 % 2;
                        return str;
                    }

                    public final String component2() {
                        int i = 2 % 2;
                        int i2 = equals + 1;
                        int i3 = i2 % 128;
                        copy = i3;
                        int i4 = i2 % 2;
                        String str = this.value;
                        int i5 = i3 + 89;
                        equals = i5 % 128;
                        if (i5 % 2 != 0) {
                            return str;
                        }
                        throw null;
                    }

                    public final ConvertedAmount copy(String currencyID, String value) {
                        int i = 2 % 2;
                        Intrinsics.checkNotNullParameter(currencyID, "");
                        Intrinsics.checkNotNullParameter(value, "");
                        ConvertedAmount convertedAmount = new ConvertedAmount(currencyID, value);
                        int i2 = copy + 5;
                        equals = i2 % 128;
                        if (i2 % 2 != 0) {
                            return convertedAmount;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    @Override
                    public final int describeContents() {
                        int i = 2 % 2;
                        int i2 = equals + 81;
                        int i3 = i2 % 128;
                        copy = i3;
                        int i4 = i2 % 2;
                        int i5 = i3 + 81;
                        equals = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 90 / 0;
                        }
                        return 0;
                    }

                    public boolean equals(Object other) {
                        int i = 2 % 2;
                        int i2 = equals;
                        int i3 = i2 + 53;
                        int i4 = i3 % 128;
                        copy = i4;
                        int i5 = i3 % 2;
                        if (this == other) {
                            int i6 = i4 + 47;
                            equals = i6 % 128;
                            int i7 = i6 % 2;
                            return true;
                        }
                        if (other instanceof ConvertedAmount) {
                            ConvertedAmount convertedAmount = (ConvertedAmount) other;
                            return Intrinsics.areEqual(this.currencyID, convertedAmount.currencyID) && Intrinsics.areEqual(this.value, convertedAmount.value);
                        }
                        int i8 = i2 + 3;
                        copy = i8 % 128;
                        int i9 = i8 % 2;
                        return false;
                    }

                    public int hashCode() {
                        int i = 2 % 2;
                        int i2 = equals + 119;
                        copy = i2 % 128;
                        int i3 = i2 % 2;
                        int iHashCode = (this.currencyID.hashCode() * 31) + this.value.hashCode();
                        int i4 = copy + 1;
                        equals = i4 % 128;
                        if (i4 % 2 != 0) {
                            return iHashCode;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    public String toString() {
                        int i = 2 % 2;
                        String str = "ConvertedAmount(currencyID=" + this.currencyID + ", value=" + this.value + ')';
                        int i2 = equals + 21;
                        copy = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 64 / 0;
                        }
                        return str;
                    }

                    @Override
                    public final void writeToParcel(Parcel dest, int flags) {
                        int i = 2 % 2;
                        int i2 = equals + 89;
                        copy = i2 % 128;
                        int i3 = i2 % 2;
                        Intrinsics.checkNotNullParameter(dest, "");
                        if (i3 != 0) {
                            dest.writeString(this.currencyID);
                            dest.writeString(this.value);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        dest.writeString(this.currencyID);
                        dest.writeString(this.value);
                        int i4 = equals + 107;
                        copy = i4 % 128;
                        int i5 = i4 % 2;
                    }

                    static void copydefault() {
                        component2 = new char[]{30708, 30699, 30705, 30695, 30698, 30700, 30635, 30694, 30598, 30684, 30689, 30704, 30696, 30614, 30697, 30710, 30702, 30693, 30599, 30703, 30691, 30706, 30605, 30701};
                        component1 = 321287765;
                        copydefault = true;
                        component3 = true;
                    }
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "Request(amount=" + this.amount + ", convertedAmount=" + this.convertedAmount + ", taxAmount=" + this.taxAmount + ')';
                    int i2 = component3 + 29;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    return str;
                }

                @Override
                public final void writeToParcel(Parcel dest, int flags) {
                    int i = 2 % 2;
                    int i2 = component3 + 115;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(dest, "");
                    if (i3 == 0) {
                        this.amount.writeToParcel(dest, flags);
                        this.convertedAmount.writeToParcel(dest, flags);
                        this.taxAmount.writeToParcel(dest, flags);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    this.amount.writeToParcel(dest, flags);
                    this.convertedAmount.writeToParcel(dest, flags);
                    this.taxAmount.writeToParcel(dest, flags);
                    int i4 = ShareDataUIState + 55;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                }

                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$Parts$Request$TaxAmount;", "Landroid/os/Parcelable;", "currencyID", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrencyID", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class TaxAmount implements Parcelable {
                    public static final int $stable = 0;
                    public static final Parcelable.Creator<TaxAmount> CREATOR = new Creator();
                    private static int ShareDataUIState = 1;
                    private static int component1 = 1;
                    private static int component2;
                    private static int copydefault;

                    @SerializedName("currencyID")
                    private final String currencyID;

                    @SerializedName("value")
                    private final String value;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<TaxAmount> {
                        private static int ShareDataUIState = 1;
                        private static int component2;

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override
                        public final TaxAmount createFromParcel(Parcel parcel) {
                            int i = 2 % 2;
                            Intrinsics.checkNotNullParameter(parcel, "");
                            TaxAmount taxAmount = new TaxAmount(parcel.readString(), parcel.readString());
                            int i2 = component2 + 19;
                            ShareDataUIState = i2 % 128;
                            if (i2 % 2 != 0) {
                                return taxAmount;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        @Override
                        public TaxAmount createFromParcel(Parcel parcel) {
                            int i = 2 % 2;
                            int i2 = component2 + 111;
                            ShareDataUIState = i2 % 128;
                            int i3 = i2 % 2;
                            TaxAmount taxAmountCreateFromParcel = createFromParcel(parcel);
                            int i4 = ShareDataUIState + 101;
                            component2 = i4 % 128;
                            int i5 = i4 % 2;
                            return taxAmountCreateFromParcel;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override
                        public final TaxAmount[] newArray(int i) {
                            int i2 = 2 % 2;
                            int i3 = ShareDataUIState + 125;
                            int i4 = i3 % 128;
                            component2 = i4;
                            int i5 = i3 % 2;
                            TaxAmount[] taxAmountArr = new TaxAmount[i];
                            int i6 = i4 + 121;
                            ShareDataUIState = i6 % 128;
                            if (i6 % 2 != 0) {
                                return taxAmountArr;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }

                        @Override
                        public TaxAmount[] newArray(int i) {
                            int i2 = 2 % 2;
                            int i3 = component2 + 85;
                            ShareDataUIState = i3 % 128;
                            int i4 = i3 % 2;
                            TaxAmount[] taxAmountArrNewArray = newArray(i);
                            int i5 = component2 + 77;
                            ShareDataUIState = i5 % 128;
                            int i6 = i5 % 2;
                            return taxAmountArrNewArray;
                        }
                    }

                    public TaxAmount(String str, String str2) {
                        Intrinsics.checkNotNullParameter(str, "");
                        Intrinsics.checkNotNullParameter(str2, "");
                        this.currencyID = str;
                        this.value = str2;
                    }

                    public final String getCurrencyID() {
                        String str;
                        int i = 2 % 2;
                        int i2 = component2 + 81;
                        int i3 = i2 % 128;
                        component1 = i3;
                        if (i2 % 2 == 0) {
                            str = this.currencyID;
                            int i4 = 30 / 0;
                        } else {
                            str = this.currencyID;
                        }
                        int i5 = i3 + 21;
                        component2 = i5 % 128;
                        int i6 = i5 % 2;
                        return str;
                    }

                    public final String getValue() {
                        int i = 2 % 2;
                        int i2 = component2;
                        int i3 = i2 + 15;
                        component1 = i3 % 128;
                        if (i3 % 2 == 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        String str = this.value;
                        int i4 = i2 + 31;
                        component1 = i4 % 128;
                        int i5 = i4 % 2;
                        return str;
                    }

                    static {
                        int i = ShareDataUIState + 83;
                        copydefault = i % 128;
                        if (i % 2 != 0) {
                            throw null;
                        }
                    }

                    public static TaxAmount copy$default(TaxAmount taxAmount, String str, String str2, int i, Object obj) {
                        int i2 = 2 % 2;
                        int i3 = component1 + 23;
                        component2 = i3 % 128;
                        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
                            str = taxAmount.currencyID;
                        }
                        if ((i & 2) != 0) {
                            str2 = taxAmount.value;
                        }
                        TaxAmount taxAmountCopy = taxAmount.copy(str, str2);
                        int i4 = component1 + 81;
                        component2 = i4 % 128;
                        if (i4 % 2 == 0) {
                            return taxAmountCopy;
                        }
                        throw null;
                    }

                    public final String component1() {
                        int i = 2 % 2;
                        int i2 = component1 + 69;
                        int i3 = i2 % 128;
                        component2 = i3;
                        int i4 = i2 % 2;
                        String str = this.currencyID;
                        int i5 = i3 + 25;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        return str;
                    }

                    public final String component2() {
                        int i = 2 % 2;
                        int i2 = component1;
                        int i3 = i2 + 73;
                        component2 = i3 % 128;
                        int i4 = i3 % 2;
                        String str = this.value;
                        int i5 = i2 + 41;
                        component2 = i5 % 128;
                        int i6 = i5 % 2;
                        return str;
                    }

                    public final TaxAmount copy(String currencyID, String value) {
                        int i = 2 % 2;
                        Intrinsics.checkNotNullParameter(currencyID, "");
                        Intrinsics.checkNotNullParameter(value, "");
                        TaxAmount taxAmount = new TaxAmount(currencyID, value);
                        int i2 = component1 + 59;
                        component2 = i2 % 128;
                        if (i2 % 2 == 0) {
                            return taxAmount;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    @Override
                    public final int describeContents() {
                        int i = 2 % 2;
                        int i2 = component2 + 111;
                        component1 = i2 % 128;
                        return i2 % 2 == 0 ? 1 : 0;
                    }

                    public boolean equals(Object other) {
                        int i = 2 % 2;
                        if (this == other) {
                            int i2 = component1 + 111;
                            component2 = i2 % 128;
                            int i3 = i2 % 2;
                            return true;
                        }
                        if (!(other instanceof TaxAmount)) {
                            return false;
                        }
                        TaxAmount taxAmount = (TaxAmount) other;
                        if (Intrinsics.areEqual(this.currencyID, taxAmount.currencyID)) {
                            return Intrinsics.areEqual(this.value, taxAmount.value);
                        }
                        int i4 = component1 + 91;
                        component2 = i4 % 128;
                        int i5 = i4 % 2;
                        return false;
                    }

                    public int hashCode() {
                        int iHashCode;
                        String str;
                        int i = 2 % 2;
                        int i2 = component1 + 61;
                        component2 = i2 % 128;
                        if (i2 % 2 != 0) {
                            iHashCode = this.currencyID.hashCode() - 32;
                            str = this.value;
                        } else {
                            iHashCode = this.currencyID.hashCode() * 31;
                            str = this.value;
                        }
                        int iHashCode2 = iHashCode + str.hashCode();
                        int i3 = component2 + 47;
                        component1 = i3 % 128;
                        int i4 = i3 % 2;
                        return iHashCode2;
                    }

                    public String toString() {
                        int i = 2 % 2;
                        String str = "TaxAmount(currencyID=" + this.currencyID + ", value=" + this.value + ')';
                        int i2 = component2 + 107;
                        component1 = i2 % 128;
                        int i3 = i2 % 2;
                        return str;
                    }

                    @Override
                    public final void writeToParcel(Parcel dest, int flags) {
                        int i = 2 % 2;
                        int i2 = component2 + 23;
                        component1 = i2 % 128;
                        int i3 = i2 % 2;
                        Intrinsics.checkNotNullParameter(dest, "");
                        if (i3 == 0) {
                            dest.writeString(this.currencyID);
                            dest.writeString(this.value);
                            throw null;
                        }
                        dest.writeString(this.currencyID);
                        dest.writeString(this.value);
                        int i4 = component1 + 19;
                        component2 = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 42 / 0;
                        }
                    }
                }
            }
        }
    }

    public final Response component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Response response = this.response;
        int i4 = i2 + 95;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return response;
        }
        throw null;
    }

    public final RoamingCashoutResponseDto copy(Response response) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(response, "");
        RoamingCashoutResponseDto roamingCashoutResponseDto = new RoamingCashoutResponseDto(response);
        int i2 = copydefault + 63;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 61 / 0;
        }
        return roamingCashoutResponseDto;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 121;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 85;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(other instanceof RoamingCashoutResponseDto)) {
            int i3 = component2 + 61;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.response, ((RoamingCashoutResponseDto) other).response)) {
            return true;
        }
        int i5 = copydefault + 31;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.response.hashCode();
        int i4 = copydefault + 43;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RoamingCashoutResponseDto(response=" + this.response + ')';
        int i2 = component2 + 65;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) throws Throwable {
        int i = 2 % 2;
        int i2 = component2 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            this.response.writeToParcel(dest, flags);
            int i4 = 25 / 0;
        } else {
            this.response.writeToParcel(dest, flags);
        }
        int i5 = copydefault + 11;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }
}
