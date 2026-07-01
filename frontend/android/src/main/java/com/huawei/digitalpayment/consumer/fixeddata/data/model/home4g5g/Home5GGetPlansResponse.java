package com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000fHÆ\u0003J\u009f\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000fHÇ\u0001J\b\u0010-\u001a\u00020.H\u0007J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H×\u0003J\t\u00103\u001a\u00020.H×\u0001J\t\u00104\u001a\u00020\u0003H×\u0001J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006:"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home5GGetPlansResponse;", "Landroid/os/Parcelable;", "productID", "", "productName", "productCost", "productSpeed", "mainBundle", "mainSpeed", "bundleUnits", "speedUnits", "technology", "productLabel", "productDescription", "products", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getProductID", "()Ljava/lang/String;", "getProductName", "getProductCost", "getProductSpeed", "getMainBundle", "getMainSpeed", "getBundleUnits", "getSpeedUnits", "getTechnology", "getProductLabel", "getProductDescription", "getProducts", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Home5GGetPlansResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Home5GGetPlansResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("bundleUnits")
    private final String bundleUnits;

    @SerializedName("mainBundle")
    private final String mainBundle;

    @SerializedName("mainSpeed")
    private final String mainSpeed;

    @SerializedName("productCost")
    private final String productCost;

    @SerializedName("productDescription")
    private final String productDescription;

    @SerializedName("productID")
    private final String productID;

    @SerializedName("productLabel")
    private final String productLabel;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("productSpeed")
    private final String productSpeed;

    @SerializedName("products")
    private final List<Home5GGetPlansResponse> products;

    @SerializedName("speedUnits")
    private final String speedUnits;

    @SerializedName("technology")
    private final String technology;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Home5GGetPlansResponse> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home5GGetPlansResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel2, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = component2 + 77;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 4 % 3;
                }
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int i5 = 0;
                while (i5 != i4) {
                    arrayList2.add(Home5GGetPlansResponse.CREATOR.createFromParcel(parcel2));
                    i5++;
                    int i6 = component2 + 41;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                    parcel2 = parcel;
                }
                arrayList = arrayList2;
            }
            return new Home5GGetPlansResponse(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, arrayList);
        }

        @Override
        public Home5GGetPlansResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 59;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Home5GGetPlansResponse home5GGetPlansResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 59;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return home5GGetPlansResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home5GGetPlansResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 121;
            component2 = i3 % 128;
            Home5GGetPlansResponse[] home5GGetPlansResponseArr = new Home5GGetPlansResponse[i];
            if (i3 % 2 != 0) {
                return home5GGetPlansResponseArr;
            }
            throw null;
        }

        @Override
        public Home5GGetPlansResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 67;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            Home5GGetPlansResponse[] home5GGetPlansResponseArrNewArray = newArray(i);
            int i5 = component2 + 99;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return home5GGetPlansResponseArrNewArray;
        }
    }

    public Home5GGetPlansResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<Home5GGetPlansResponse> list) {
        this.productID = str;
        this.productName = str2;
        this.productCost = str3;
        this.productSpeed = str4;
        this.mainBundle = str5;
        this.mainSpeed = str6;
        this.bundleUnits = str7;
        this.speedUnits = str8;
        this.technology = str9;
        this.productLabel = str10;
        this.productDescription = str11;
        this.products = list;
    }

    public final String getProductID() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productID;
        int i5 = i3 + 41;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.productName;
        int i4 = i3 + 19;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getProductCost() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productCost;
        int i5 = i2 + 27;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductSpeed() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.productSpeed;
        int i4 = i3 + 71;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getMainBundle() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.mainBundle;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return str;
    }

    public final String getMainSpeed() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.mainSpeed;
        int i4 = i3 + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getBundleUnits() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 115;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.bundleUnits;
            int i4 = 17 / 0;
        } else {
            str = this.bundleUnits;
        }
        int i5 = i2 + 7;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSpeedUnits() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.speedUnits;
        int i5 = i2 + 99;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return str;
    }

    public final String getTechnology() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.technology;
        int i5 = i3 + 61;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductLabel() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.productLabel;
        int i5 = i3 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductDescription() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.productDescription;
        int i5 = i3 + 49;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
        return str;
    }

    public final List<Home5GGetPlansResponse> getProducts() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.products;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = ShareDataUIState + 115;
        component1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Home5GGetPlansResponse copy$default(Home5GGetPlansResponse home5GGetPlansResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, int i, Object obj) {
        String str12;
        String str13;
        String str14;
        String str15;
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        String str16 = (i & 1) != 0 ? home5GGetPlansResponse.productID : str;
        String str17 = (i & 2) != 0 ? home5GGetPlansResponse.productName : str2;
        String str18 = (i & 4) != 0 ? home5GGetPlansResponse.productCost : str3;
        String str19 = (i & 8) != 0 ? home5GGetPlansResponse.productSpeed : str4;
        String str20 = (i & 16) != 0 ? home5GGetPlansResponse.mainBundle : str5;
        if ((i & 32) != 0) {
            int i6 = i3 + 97;
            int i7 = i6 % 128;
            component3 = i7;
            int i8 = i6 % 2;
            str12 = home5GGetPlansResponse.mainSpeed;
            int i9 = i7 + 125;
            component2 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str12 = str6;
        }
        String str21 = (i & 64) != 0 ? home5GGetPlansResponse.bundleUnits : str7;
        if ((i & 128) != 0) {
            int i11 = component2 + 1;
            component3 = i11 % 128;
            if (i11 % 2 == 0) {
                str13 = home5GGetPlansResponse.speedUnits;
                int i12 = 75 / 0;
            } else {
                str13 = home5GGetPlansResponse.speedUnits;
            }
        } else {
            str13 = str8;
        }
        if ((i & 256) != 0) {
            int i13 = component2;
            int i14 = i13 + 15;
            component3 = i14 % 128;
            if (i14 % 2 == 0) {
                str14 = home5GGetPlansResponse.technology;
                int i15 = 52 / 0;
            } else {
                str14 = home5GGetPlansResponse.technology;
            }
            int i16 = i13 + 111;
            component3 = i16 % 128;
            int i17 = i16 % 2;
        } else {
            str14 = str9;
        }
        if ((i & 512) != 0) {
            int i18 = component3 + 45;
            component2 = i18 % 128;
            int i19 = i18 % 2;
            str15 = home5GGetPlansResponse.productLabel;
            if (i19 != 0) {
                int i20 = 53 / 0;
            }
        } else {
            str15 = str10;
        }
        return home5GGetPlansResponse.copy(str16, str17, str18, str19, str20, str12, str21, str13, str14, str15, (i & 1024) != 0 ? home5GGetPlansResponse.productDescription : str11, (i & 2048) != 0 ? home5GGetPlansResponse.products : list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 47;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productID;
        int i5 = i2 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 33;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productLabel;
        int i5 = i2 + 51;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productDescription;
        int i5 = i2 + 33;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<Home5GGetPlansResponse> component12() {
        List<Home5GGetPlansResponse> list;
        int i = 2 % 2;
        int i2 = component3 + 55;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            list = this.products;
            int i4 = 78 / 0;
        } else {
            list = this.products;
        }
        int i5 = i3 + 77;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productName;
        int i5 = i3 + 51;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 27;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.productCost;
        int i4 = i2 + 77;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productSpeed;
        int i5 = i2 + 105;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return str;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 33;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.mainBundle;
            int i4 = 90 / 0;
        } else {
            str = this.mainBundle;
        }
        int i5 = i3 + 13;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.mainSpeed;
        int i5 = i2 + 103;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.bundleUnits;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.speedUnits;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.technology;
        int i5 = i2 + 23;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Home5GGetPlansResponse copy(String productID, String productName, String productCost, String productSpeed, String mainBundle, String mainSpeed, String bundleUnits, String speedUnits, String technology, String productLabel, String productDescription, List<Home5GGetPlansResponse> products) {
        int i = 2 % 2;
        Home5GGetPlansResponse home5GGetPlansResponse = new Home5GGetPlansResponse(productID, productName, productCost, productSpeed, mainBundle, mainSpeed, bundleUnits, speedUnits, technology, productLabel, productDescription, products);
        int i2 = component3 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return home5GGetPlansResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        component3 = i5 % 128;
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
        if (!(other instanceof Home5GGetPlansResponse)) {
            return false;
        }
        Home5GGetPlansResponse home5GGetPlansResponse = (Home5GGetPlansResponse) other;
        if (!Intrinsics.areEqual(this.productID, home5GGetPlansResponse.productID)) {
            int i2 = component2 + 101;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.productName, home5GGetPlansResponse.productName)) {
            int i3 = component3 + 113;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.productCost, home5GGetPlansResponse.productCost)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.productSpeed, home5GGetPlansResponse.productSpeed)) {
            int i4 = component3 + 47;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.mainBundle, home5GGetPlansResponse.mainBundle) || !Intrinsics.areEqual(this.mainSpeed, home5GGetPlansResponse.mainSpeed) || !Intrinsics.areEqual(this.bundleUnits, home5GGetPlansResponse.bundleUnits)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.speedUnits, home5GGetPlansResponse.speedUnits)) {
            int i6 = component2 + 53;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 30 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.technology, home5GGetPlansResponse.technology) || !Intrinsics.areEqual(this.productLabel, home5GGetPlansResponse.productLabel)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.productDescription, home5GGetPlansResponse.productDescription)) {
            int i8 = component2 + 21;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.products, home5GGetPlansResponse.products)) {
            return true;
        }
        int i10 = component3 + 79;
        component2 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.productID;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.productName;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.productCost;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.productSpeed;
        if (str4 == null) {
            int i2 = component2 + 3;
            component3 = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str4.hashCode();
        }
        String str5 = this.mainBundle;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.mainSpeed;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.bundleUnits;
        if (str7 == null) {
            int i3 = component3 + 91;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str7.hashCode();
        }
        String str8 = this.speedUnits;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.technology;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.productLabel;
        if (str10 == null) {
            int i5 = component2 + 109;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str10.hashCode();
        }
        String str11 = this.productDescription;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        List<Home5GGetPlansResponse> list = this.products;
        return (((((((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode3) * 31) + iHashCode11) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Home5GGetPlansResponse(productID=" + this.productID + ", productName=" + this.productName + ", productCost=" + this.productCost + ", productSpeed=" + this.productSpeed + ", mainBundle=" + this.mainBundle + ", mainSpeed=" + this.mainSpeed + ", bundleUnits=" + this.bundleUnits + ", speedUnits=" + this.speedUnits + ", technology=" + this.technology + ", productLabel=" + this.productLabel + ", productDescription=" + this.productDescription + ", products=" + this.products + ")";
        int i2 = component3 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.productID);
        dest.writeString(this.productName);
        dest.writeString(this.productCost);
        dest.writeString(this.productSpeed);
        dest.writeString(this.mainBundle);
        dest.writeString(this.mainSpeed);
        dest.writeString(this.bundleUnits);
        dest.writeString(this.speedUnits);
        dest.writeString(this.technology);
        dest.writeString(this.productLabel);
        dest.writeString(this.productDescription);
        List<Home5GGetPlansResponse> list = this.products;
        if (list == null) {
            int i4 = component3 + 7;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<Home5GGetPlansResponse> it = list.iterator();
        while (it.hasNext()) {
            int i6 = component2 + 57;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                it.next().writeToParcel(dest, flags);
                int i7 = 57 / 0;
            } else {
                it.next().writeToParcel(dest, flags);
            }
        }
    }
}
