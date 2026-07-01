package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010,\u001a\u00020*H\u0002J\b\u0010-\u001a\u00020*H\u0002J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J¹\u0001\u0010=\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00062\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÇ\u0001J\b\u0010>\u001a\u00020\u0006H\u0007J\u0013\u0010?\u001a\u00020*2\b\u0010@\u001a\u0004\u0018\u00010AH×\u0003J\t\u0010B\u001a\u00020\u0006H×\u0001J\t\u0010C\u001a\u00020\bH×\u0001J\u0018\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u0006H\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b)\u0010+¨\u0006I"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/selectiondata/SelectionDetailsState;", "Landroid/os/Parcelable;", "sourceOfFundsSelection", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/selectiondata/SelectionItem;", "selectedSourceOfFundsIndex", "", "otherSourceOfFunds", "", "purposeOfFundsSelection", "selectedPurposeOfFundsIndex", "otherPurposeOfFunds", "selectedCountry", "selectedCountryIso", "selectedStateIso", "selectedCountryFlag", "selectedCountryDialingCode", "currencySelection", "selectedCurrencyIndex", "carrierSelection", "selectedCarrierIndex", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;ILjava/lang/String;Lkotlinx/collections/immutable/ImmutableList;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;ILkotlinx/collections/immutable/ImmutableList;I)V", "getSourceOfFundsSelection", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedSourceOfFundsIndex", "()I", "getOtherSourceOfFunds", "()Ljava/lang/String;", "getPurposeOfFundsSelection", "getSelectedPurposeOfFundsIndex", "getOtherPurposeOfFunds", "getSelectedCountry", "getSelectedCountryIso", "getSelectedStateIso", "getSelectedCountryFlag", "getSelectedCountryDialingCode", "getCurrencySelection", "getSelectedCurrencyIndex", "getCarrierSelection", "getSelectedCarrierIndex", "isButtonEnabled", "", "()Z", "isSourceOfFundsValid", "isPurposeOfFundsValid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectionDetailsState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SelectionDetailsState> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;
    private final ImmutableList<SelectionItem> carrierSelection;
    private final ImmutableList<SelectionItem> currencySelection;
    private final String otherPurposeOfFunds;
    private final String otherSourceOfFunds;
    private final ImmutableList<SelectionItem> purposeOfFundsSelection;
    private final int selectedCarrierIndex;
    private final String selectedCountry;
    private final String selectedCountryDialingCode;
    private final String selectedCountryFlag;
    private final String selectedCountryIso;
    private final int selectedCurrencyIndex;
    private final int selectedPurposeOfFundsIndex;
    private final int selectedSourceOfFundsIndex;
    private final String selectedStateIso;
    private final ImmutableList<SelectionItem> sourceOfFundsSelection;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectionDetailsState> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SelectionDetailsState createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                arrayList.add(SelectionItem.CREATOR.createFromParcel(parcel));
                i3++;
                int i4 = component3 + 121;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
            PersistentList persistentList = ExtensionsKt.toPersistentList(arrayList);
            int i6 = parcel.readInt();
            String string = parcel.readString();
            int i7 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList2.add(SelectionItem.CREATOR.createFromParcel(parcel));
            }
            PersistentList persistentList2 = ExtensionsKt.toPersistentList(arrayList2);
            int i9 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i10);
            int i11 = 0;
            while (i11 != i10) {
                int i12 = component2 + 75;
                int i13 = i10;
                component3 = i12 % 128;
                int i14 = i12 % 2;
                arrayList3.add(SelectionItem.CREATOR.createFromParcel(parcel));
                i11 = i14 != 0 ? i11 + 122 : i11 + 1;
                i10 = i13;
            }
            PersistentList persistentList3 = ExtensionsKt.toPersistentList(arrayList3);
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i16);
            int i17 = 0;
            while (i17 != i16) {
                int i18 = component2 + 75;
                int i19 = i16;
                component3 = i18 % 128;
                if (i18 % 2 != 0) {
                    arrayList4.add(SelectionItem.CREATOR.createFromParcel(parcel));
                    i17 += 81;
                } else {
                    arrayList4.add(SelectionItem.CREATOR.createFromParcel(parcel));
                    i17++;
                }
                i16 = i19;
            }
            SelectionDetailsState selectionDetailsState = new SelectionDetailsState(persistentList, i6, string, persistentList2, i9, string2, string3, string4, string5, string6, string7, persistentList3, i15, ExtensionsKt.toPersistentList(arrayList4), parcel.readInt());
            int i20 = component3 + 89;
            component2 = i20 % 128;
            if (i20 % 2 != 0) {
                return selectionDetailsState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public SelectionDetailsState createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 67;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SelectionDetailsState selectionDetailsStateCreateFromParcel = createFromParcel(parcel);
            int i3 = component2 + 103;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return selectionDetailsStateCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SelectionDetailsState[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 77;
            component3 = i3 % 128;
            SelectionDetailsState[] selectionDetailsStateArr = new SelectionDetailsState[i];
            if (i3 % 2 != 0) {
                int i4 = 98 / 0;
            }
            return selectionDetailsStateArr;
        }

        @Override
        public SelectionDetailsState[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 9;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public SelectionDetailsState(ImmutableList<SelectionItem> immutableList, int i, String str, ImmutableList<SelectionItem> immutableList2, int i2, String str2, String str3, String str4, String str5, String str6, String str7, ImmutableList<SelectionItem> immutableList3, int i3, ImmutableList<SelectionItem> immutableList4, int i4) {
        Intrinsics.checkNotNullParameter(immutableList, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(immutableList2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(immutableList3, "");
        Intrinsics.checkNotNullParameter(immutableList4, "");
        this.sourceOfFundsSelection = immutableList;
        this.selectedSourceOfFundsIndex = i;
        this.otherSourceOfFunds = str;
        this.purposeOfFundsSelection = immutableList2;
        this.selectedPurposeOfFundsIndex = i2;
        this.otherPurposeOfFunds = str2;
        this.selectedCountry = str3;
        this.selectedCountryIso = str4;
        this.selectedStateIso = str5;
        this.selectedCountryFlag = str6;
        this.selectedCountryDialingCode = str7;
        this.currencySelection = immutableList3;
        this.selectedCurrencyIndex = i3;
        this.carrierSelection = immutableList4;
        this.selectedCarrierIndex = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SelectionDetailsState(ImmutableList immutableList, int i, String str, ImmutableList immutableList2, int i2, String str2, String str3, String str4, String str5, String str6, String str7, ImmutableList immutableList3, int i3, ImmutableList immutableList4, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        int i6;
        PersistentList persistentListPersistentListOf;
        String str8;
        String str9;
        PersistentList persistentListPersistentListOf2 = (i5 & 1) != 0 ? ExtensionsKt.persistentListOf() : immutableList;
        int i7 = -1;
        if ((i5 & 2) != 0) {
            int i8 = ShareDataUIState + 49;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            i6 = -1;
        } else {
            i6 = i;
        }
        String str10 = (i5 & 4) != 0 ? "" : str;
        if ((i5 & 8) != 0) {
            int i11 = ShareDataUIState + 29;
            component1 = i11 % 128;
            if (i11 % 2 != 0) {
                ExtensionsKt.persistentListOf();
                throw null;
            }
            persistentListPersistentListOf = ExtensionsKt.persistentListOf();
            int i12 = component1 + 95;
            ShareDataUIState = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        } else {
            persistentListPersistentListOf = immutableList2;
        }
        if ((i5 & 16) != 0) {
            int i15 = 2 % 2;
        } else {
            i7 = i2;
        }
        String str11 = (i5 & 32) != 0 ? "" : str2;
        if ((i5 & 64) != 0) {
            int i16 = 2 % 2;
            str8 = "";
        } else {
            str8 = str3;
        }
        String str12 = (i5 & 128) != 0 ? "" : str4;
        String str13 = (i5 & 256) == 0 ? str5 : null;
        if ((i5 & 512) != 0) {
            int i17 = component1 + 27;
            ShareDataUIState = i17 % 128;
            int i18 = i17 % 2;
            str9 = "";
        } else {
            str9 = str6;
        }
        this(persistentListPersistentListOf2, i6, str10, persistentListPersistentListOf, i7, str11, str8, str12, str13, str9, (i5 & 1024) == 0 ? str7 : "", (i5 & 2048) != 0 ? ExtensionsKt.persistentListOf() : immutableList3, (i5 & 4096) != 0 ? 0 : i3, (i5 & 8192) != 0 ? ExtensionsKt.persistentListOf() : immutableList4, (i5 & 16384) == 0 ? i4 : 0);
    }

    public final ImmutableList<SelectionItem> getSourceOfFundsSelection() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 125;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        ImmutableList<SelectionItem> immutableList = this.sourceOfFundsSelection;
        int i5 = i2 + 35;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return immutableList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getSelectedSourceOfFundsIndex() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.selectedSourceOfFundsIndex;
        int i6 = i3 + 117;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getOtherSourceOfFunds() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 41;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.otherSourceOfFunds;
        int i5 = i2 + 5;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final ImmutableList<SelectionItem> getPurposeOfFundsSelection() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ImmutableList<SelectionItem> immutableList = this.purposeOfFundsSelection;
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return immutableList;
    }

    public final int getSelectedPurposeOfFundsIndex() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.selectedPurposeOfFundsIndex;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOtherPurposeOfFunds() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.otherPurposeOfFunds;
        int i5 = i3 + 113;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSelectedCountry() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.selectedCountry;
            int i4 = 77 / 0;
        } else {
            str = this.selectedCountry;
        }
        int i5 = i3 + 95;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSelectedCountryIso() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.selectedCountryIso;
        int i5 = i3 + 33;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSelectedStateIso() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 123;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.selectedStateIso;
        int i4 = i2 + 55;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSelectedCountryFlag() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 37;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.selectedCountryFlag;
        int i5 = i2 + 107;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getSelectedCountryDialingCode() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 95;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.selectedCountryDialingCode;
            int i4 = 46 / 0;
        } else {
            str = this.selectedCountryDialingCode;
        }
        int i5 = i2 + 103;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ImmutableList<SelectionItem> getCurrencySelection() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ImmutableList<SelectionItem> immutableList = this.currencySelection;
        int i4 = i3 + 23;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return immutableList;
        }
        throw null;
    }

    public final int getSelectedCurrencyIndex() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.selectedCurrencyIndex;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ImmutableList<SelectionItem> getCarrierSelection() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 55;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ImmutableList<SelectionItem> immutableList = this.carrierSelection;
        int i5 = i2 + 117;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return immutableList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getSelectedCarrierIndex() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.selectedCarrierIndex;
        if (i3 != 0) {
            int i5 = 1 / 0;
        }
        return i4;
    }

    public final boolean isButtonEnabled() {
        boolean z;
        int i = 2 % 2;
        int i2 = component1 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (isSourceOfFundsValid() && isPurposeOfFundsValid()) {
            int i4 = component1 + 121;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        int i6 = ShareDataUIState + 27;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 23 / 0;
        }
        return z;
    }

    private final boolean isSourceOfFundsValid() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.selectedSourceOfFundsIndex != CollectionsKt.getLastIndex(this.sourceOfFundsSelection) || this.otherSourceOfFunds.length() != 0) {
            return true;
        }
        int i4 = ShareDataUIState + 93;
        component1 = i4 % 128;
        return true ^ (i4 % 2 == 0);
    }

    private final boolean isPurposeOfFundsValid() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (this.selectedPurposeOfFundsIndex == CollectionsKt.getLastIndex(this.purposeOfFundsSelection)) {
            int i4 = component1 + 79;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 74 / 0;
                if (this.otherPurposeOfFunds.length() == 0) {
                    return false;
                }
            } else if (this.otherPurposeOfFunds.length() == 0) {
                return false;
            }
        }
        return true;
    }

    static {
        int i = copydefault + 97;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public SelectionDetailsState() {
        this(null, 0, null, null, 0, null, null, null, null, null, null, null, 0, null, 0, 32767, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SelectionDetailsState copy$default(SelectionDetailsState selectionDetailsState, ImmutableList immutableList, int i, String str, ImmutableList immutableList2, int i2, String str2, String str3, String str4, String str5, String str6, String str7, ImmutableList immutableList3, int i3, ImmutableList immutableList4, int i4, int i5, Object obj) {
        int i6;
        String str8;
        int i7;
        String str9;
        String str10;
        ImmutableList immutableList5;
        int i8;
        int i9 = 2 % 2;
        int i10 = component1;
        int i11 = i10 + 83;
        ShareDataUIState = i11 % 128;
        int i12 = i11 % 2;
        ImmutableList immutableList6 = (i5 & 1) != 0 ? selectionDetailsState.sourceOfFundsSelection : immutableList;
        if ((i5 & 2) != 0) {
            i6 = selectionDetailsState.selectedSourceOfFundsIndex;
            int i13 = i10 + 53;
            ShareDataUIState = i13 % 128;
            int i14 = i13 % 2;
        } else {
            i6 = i;
        }
        if ((i5 & 4) != 0) {
            int i15 = ShareDataUIState + 35;
            component1 = i15 % 128;
            int i16 = i15 % 2;
            str8 = selectionDetailsState.otherSourceOfFunds;
        } else {
            str8 = str;
        }
        ImmutableList immutableList7 = (i5 & 8) != 0 ? selectionDetailsState.purposeOfFundsSelection : immutableList2;
        if ((i5 & 16) != 0) {
            int i17 = ShareDataUIState + 63;
            component1 = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = selectionDetailsState.selectedPurposeOfFundsIndex;
                throw null;
            }
            i7 = selectionDetailsState.selectedPurposeOfFundsIndex;
        } else {
            i7 = i2;
        }
        String str11 = (i5 & 32) != 0 ? selectionDetailsState.otherPurposeOfFunds : str2;
        String str12 = (i5 & 64) != 0 ? selectionDetailsState.selectedCountry : str3;
        if ((i5 & 128) != 0) {
            int i19 = component1 + 33;
            ShareDataUIState = i19 % 128;
            if (i19 % 2 == 0) {
                String str13 = selectionDetailsState.selectedCountryIso;
                throw null;
            }
            str9 = selectionDetailsState.selectedCountryIso;
        } else {
            str9 = str4;
        }
        if ((i5 & 256) != 0) {
            int i20 = ShareDataUIState + 97;
            component1 = i20 % 128;
            int i21 = i20 % 2;
            str10 = selectionDetailsState.selectedStateIso;
        } else {
            str10 = str5;
        }
        String str14 = (i5 & 512) != 0 ? selectionDetailsState.selectedCountryFlag : str6;
        String str15 = (i5 & 1024) != 0 ? selectionDetailsState.selectedCountryDialingCode : str7;
        ImmutableList immutableList8 = (i5 & 2048) != 0 ? selectionDetailsState.currencySelection : immutableList3;
        int i22 = (i5 & 4096) != 0 ? selectionDetailsState.selectedCurrencyIndex : i3;
        ImmutableList immutableList9 = (i5 & 8192) != 0 ? selectionDetailsState.carrierSelection : immutableList4;
        if ((i5 & 16384) != 0) {
            int i23 = component1 + 59;
            immutableList5 = immutableList9;
            ShareDataUIState = i23 % 128;
            if (i23 % 2 == 0) {
                int i24 = selectionDetailsState.selectedCarrierIndex;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i8 = selectionDetailsState.selectedCarrierIndex;
        } else {
            immutableList5 = immutableList9;
            i8 = i4;
        }
        return selectionDetailsState.copy(immutableList6, i6, str8, immutableList7, i7, str11, str12, str9, str10, str14, str15, immutableList8, i22, immutableList5, i8);
    }

    public final ImmutableList<SelectionItem> component1() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ImmutableList<SelectionItem> immutableList = this.sourceOfFundsSelection;
        int i4 = i3 + 97;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return immutableList;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.selectedCountryFlag;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.selectedCountryDialingCode;
        int i5 = i3 + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ImmutableList<SelectionItem> component12() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 101;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        ImmutableList<SelectionItem> immutableList = this.currencySelection;
        int i5 = i2 + 83;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return immutableList;
        }
        throw null;
    }

    public final int component13() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.selectedCurrencyIndex;
        int i6 = i3 + 1;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ImmutableList<SelectionItem> component14() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ImmutableList<SelectionItem> immutableList = this.carrierSelection;
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return immutableList;
    }

    public final int component15() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 53;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.selectedCarrierIndex;
        int i6 = i2 + 9;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.selectedSourceOfFundsIndex;
        int i6 = i3 + 59;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 23;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.otherSourceOfFunds;
        int i5 = i2 + 7;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final ImmutableList<SelectionItem> component4() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ImmutableList<SelectionItem> immutableList = this.purposeOfFundsSelection;
        int i4 = i3 + 39;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return immutableList;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.selectedPurposeOfFundsIndex;
        int i6 = i3 + 67;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 15 / 0;
        }
        return i5;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.otherPurposeOfFunds;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.selectedCountry;
        int i5 = i3 + 69;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.selectedCountryIso;
        int i5 = i3 + 117;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.selectedStateIso;
        }
        throw null;
    }

    public final SelectionDetailsState copy(ImmutableList<SelectionItem> sourceOfFundsSelection, int selectedSourceOfFundsIndex, String otherSourceOfFunds, ImmutableList<SelectionItem> purposeOfFundsSelection, int selectedPurposeOfFundsIndex, String otherPurposeOfFunds, String selectedCountry, String selectedCountryIso, String selectedStateIso, String selectedCountryFlag, String selectedCountryDialingCode, ImmutableList<SelectionItem> currencySelection, int selectedCurrencyIndex, ImmutableList<SelectionItem> carrierSelection, int selectedCarrierIndex) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sourceOfFundsSelection, "");
        Intrinsics.checkNotNullParameter(otherSourceOfFunds, "");
        Intrinsics.checkNotNullParameter(purposeOfFundsSelection, "");
        Intrinsics.checkNotNullParameter(otherPurposeOfFunds, "");
        Intrinsics.checkNotNullParameter(selectedCountry, "");
        Intrinsics.checkNotNullParameter(selectedCountryIso, "");
        Intrinsics.checkNotNullParameter(selectedCountryFlag, "");
        Intrinsics.checkNotNullParameter(selectedCountryDialingCode, "");
        Intrinsics.checkNotNullParameter(currencySelection, "");
        Intrinsics.checkNotNullParameter(carrierSelection, "");
        SelectionDetailsState selectionDetailsState = new SelectionDetailsState(sourceOfFundsSelection, selectedSourceOfFundsIndex, otherSourceOfFunds, purposeOfFundsSelection, selectedPurposeOfFundsIndex, otherPurposeOfFunds, selectedCountry, selectedCountryIso, selectedStateIso, selectedCountryFlag, selectedCountryDialingCode, currencySelection, selectedCurrencyIndex, carrierSelection, selectedCarrierIndex);
        int i2 = ShareDataUIState + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return selectionDetailsState;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 47;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
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
        if (!(other instanceof SelectionDetailsState)) {
            return false;
        }
        SelectionDetailsState selectionDetailsState = (SelectionDetailsState) other;
        if (!(!Intrinsics.areEqual(this.sourceOfFundsSelection, selectionDetailsState.sourceOfFundsSelection))) {
            if (this.selectedSourceOfFundsIndex != selectionDetailsState.selectedSourceOfFundsIndex) {
                int i2 = component1 + 59;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.otherSourceOfFunds, selectionDetailsState.otherSourceOfFunds)) {
                if (!Intrinsics.areEqual(this.purposeOfFundsSelection, selectionDetailsState.purposeOfFundsSelection)) {
                    int i4 = component1 + 9;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                if (this.selectedPurposeOfFundsIndex != selectionDetailsState.selectedPurposeOfFundsIndex || !Intrinsics.areEqual(this.otherPurposeOfFunds, selectionDetailsState.otherPurposeOfFunds)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.selectedCountry, selectionDetailsState.selectedCountry)) {
                    int i6 = ShareDataUIState + 93;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.selectedCountryIso, selectionDetailsState.selectedCountryIso)) {
                    int i8 = component1 + 15;
                    ShareDataUIState = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.selectedStateIso, selectionDetailsState.selectedStateIso) || !Intrinsics.areEqual(this.selectedCountryFlag, selectionDetailsState.selectedCountryFlag) || !Intrinsics.areEqual(this.selectedCountryDialingCode, selectionDetailsState.selectedCountryDialingCode)) {
                    return false;
                }
                if (!(!Intrinsics.areEqual(this.currencySelection, selectionDetailsState.currencySelection))) {
                    if (this.selectedCurrencyIndex != selectionDetailsState.selectedCurrencyIndex || !Intrinsics.areEqual(this.carrierSelection, selectionDetailsState.carrierSelection)) {
                        return false;
                    }
                    if (this.selectedCarrierIndex == selectionDetailsState.selectedCarrierIndex) {
                        return true;
                    }
                    int i10 = ShareDataUIState + 93;
                    component1 = i10 % 128;
                    int i11 = i10 % 2;
                    return false;
                }
                int i12 = component1 + 125;
                ShareDataUIState = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = component1 + 77;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.sourceOfFundsSelection.hashCode();
        int iHashCode2 = Integer.hashCode(this.selectedSourceOfFundsIndex);
        int iHashCode3 = this.otherSourceOfFunds.hashCode();
        int iHashCode4 = this.purposeOfFundsSelection.hashCode();
        int iHashCode5 = Integer.hashCode(this.selectedPurposeOfFundsIndex);
        int iHashCode6 = this.otherPurposeOfFunds.hashCode();
        int iHashCode7 = this.selectedCountry.hashCode();
        int iHashCode8 = this.selectedCountryIso.hashCode();
        String str = this.selectedStateIso;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode9 = str.hashCode();
            int i5 = ShareDataUIState + 77;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode9;
        }
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + i) * 31) + this.selectedCountryFlag.hashCode()) * 31) + this.selectedCountryDialingCode.hashCode()) * 31) + this.currencySelection.hashCode()) * 31) + Integer.hashCode(this.selectedCurrencyIndex)) * 31) + this.carrierSelection.hashCode()) * 31) + Integer.hashCode(this.selectedCarrierIndex);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SelectionDetailsState(sourceOfFundsSelection=" + this.sourceOfFundsSelection + ", selectedSourceOfFundsIndex=" + this.selectedSourceOfFundsIndex + ", otherSourceOfFunds=" + this.otherSourceOfFunds + ", purposeOfFundsSelection=" + this.purposeOfFundsSelection + ", selectedPurposeOfFundsIndex=" + this.selectedPurposeOfFundsIndex + ", otherPurposeOfFunds=" + this.otherPurposeOfFunds + ", selectedCountry=" + this.selectedCountry + ", selectedCountryIso=" + this.selectedCountryIso + ", selectedStateIso=" + this.selectedStateIso + ", selectedCountryFlag=" + this.selectedCountryFlag + ", selectedCountryDialingCode=" + this.selectedCountryDialingCode + ", currencySelection=" + this.currencySelection + ", selectedCurrencyIndex=" + this.selectedCurrencyIndex + ", carrierSelection=" + this.carrierSelection + ", selectedCarrierIndex=" + this.selectedCarrierIndex + ')';
        int i2 = ShareDataUIState + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        ImmutableList<SelectionItem> immutableList = this.sourceOfFundsSelection;
        dest.writeInt(immutableList.size());
        Iterator<SelectionItem> it = immutableList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.selectedSourceOfFundsIndex);
        dest.writeString(this.otherSourceOfFunds);
        ImmutableList<SelectionItem> immutableList2 = this.purposeOfFundsSelection;
        dest.writeInt(immutableList2.size());
        Iterator<SelectionItem> it2 = immutableList2.iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                dest.writeInt(this.selectedPurposeOfFundsIndex);
                dest.writeString(this.otherPurposeOfFunds);
                dest.writeString(this.selectedCountry);
                dest.writeString(this.selectedCountryIso);
                dest.writeString(this.selectedStateIso);
                dest.writeString(this.selectedCountryFlag);
                dest.writeString(this.selectedCountryDialingCode);
                ImmutableList<SelectionItem> immutableList3 = this.currencySelection;
                dest.writeInt(immutableList3.size());
                Iterator<SelectionItem> it3 = immutableList3.iterator();
                while (it3.hasNext()) {
                    it3.next().writeToParcel(dest, flags);
                }
                dest.writeInt(this.selectedCurrencyIndex);
                ImmutableList<SelectionItem> immutableList4 = this.carrierSelection;
                dest.writeInt(immutableList4.size());
                Iterator<SelectionItem> it4 = immutableList4.iterator();
                while (it4.hasNext()) {
                    int i4 = component1 + 25;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        it4.next().writeToParcel(dest, flags);
                        obj.hashCode();
                        throw null;
                    }
                    it4.next().writeToParcel(dest, flags);
                }
                dest.writeInt(this.selectedCarrierIndex);
                return;
            }
            int i5 = ShareDataUIState + 21;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                it2.next().writeToParcel(dest, flags);
                obj.hashCode();
                throw null;
            }
            it2.next().writeToParcel(dest, flags);
        }
    }
}
