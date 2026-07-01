package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails;

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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\u0089\u0001\u00101\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÇ\u0001J\b\u00102\u001a\u00020\u0006H\u0007J\u0013\u00103\u001a\u00020\"2\b\u00104\u001a\u0004\u0018\u000105H×\u0003J\t\u00106\u001a\u00020\u0006H×\u0001J\t\u00107\u001a\u00020\bH×\u0001J\u0018\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0006H\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b!\u0010#¨\u0006="}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/amountdetails/SelectionDetailsState;", "Landroid/os/Parcelable;", "sourceOfFundsSelection", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/amountdetails/SelectionItem;", "selectedSourceOfFundsIndex", "", "otherSourceOfFunds", "", "purposeOfFundsSelection", "selectedPurposeOfFundsIndex", "otherPurposeOfFunds", "selectedCountry", "selectedCountryIso", "selectedCountryFlag", "currencySelection", "selectedCurrencyIndex", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;ILjava/lang/String;Lkotlinx/collections/immutable/ImmutableList;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;I)V", "getSourceOfFundsSelection", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedSourceOfFundsIndex", "()I", "getOtherSourceOfFunds", "()Ljava/lang/String;", "getPurposeOfFundsSelection", "getSelectedPurposeOfFundsIndex", "getOtherPurposeOfFunds", "getSelectedCountry", "getSelectedCountryIso", "getSelectedCountryFlag", "getCurrencySelection", "getSelectedCurrencyIndex", "isButtonEnabled", "", "()Z", "isSourceOfFundsValid", "isPurposeOfFundsValid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectionDetailsState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SelectionDetailsState> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private final ImmutableList<SelectionItem> currencySelection;
    private final String otherPurposeOfFunds;
    private final String otherSourceOfFunds;
    private final ImmutableList<SelectionItem> purposeOfFundsSelection;
    private final String selectedCountry;
    private final String selectedCountryFlag;
    private final String selectedCountryIso;
    private final int selectedCurrencyIndex;
    private final int selectedPurposeOfFundsIndex;
    private final int selectedSourceOfFundsIndex;
    private final ImmutableList<SelectionItem> sourceOfFundsSelection;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectionDetailsState> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SelectionDetailsState createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(SelectionItem.CREATOR.createFromParcel(parcel));
            }
            PersistentList persistentList = ExtensionsKt.toPersistentList(arrayList);
            int i4 = parcel.readInt();
            String string = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i5);
            int i6 = component2 + 45;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            for (int i8 = 0; i8 != i5; i8++) {
                int i9 = component2 + 115;
                component1 = i9 % 128;
                int i10 = i9 % 2;
                arrayList2.add(SelectionItem.CREATOR.createFromParcel(parcel));
            }
            PersistentList persistentList2 = ExtensionsKt.toPersistentList(arrayList2);
            int i11 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList3.add(SelectionItem.CREATOR.createFromParcel(parcel));
            }
            return new SelectionDetailsState(persistentList, i4, string, persistentList2, i11, string2, string3, string4, string5, ExtensionsKt.toPersistentList(arrayList3), parcel.readInt());
        }

        @Override
        public SelectionDetailsState createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 53;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SelectionDetailsState[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 3;
            component1 = i3 % 128;
            SelectionDetailsState[] selectionDetailsStateArr = new SelectionDetailsState[i];
            if (i3 % 2 == 0) {
                int i4 = 96 / 0;
            }
            return selectionDetailsStateArr;
        }

        @Override
        public SelectionDetailsState[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 89;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            SelectionDetailsState[] selectionDetailsStateArrNewArray = newArray(i);
            int i5 = component2 + 41;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return selectionDetailsStateArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public SelectionDetailsState(ImmutableList<SelectionItem> immutableList, int i, String str, ImmutableList<SelectionItem> immutableList2, int i2, String str2, String str3, String str4, String str5, ImmutableList<SelectionItem> immutableList3, int i3) {
        Intrinsics.checkNotNullParameter(immutableList, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(immutableList2, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(immutableList3, "");
        this.sourceOfFundsSelection = immutableList;
        this.selectedSourceOfFundsIndex = i;
        this.otherSourceOfFunds = str;
        this.purposeOfFundsSelection = immutableList2;
        this.selectedPurposeOfFundsIndex = i2;
        this.otherPurposeOfFunds = str2;
        this.selectedCountry = str3;
        this.selectedCountryIso = str4;
        this.selectedCountryFlag = str5;
        this.currencySelection = immutableList3;
        this.selectedCurrencyIndex = i3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SelectionDetailsState(ImmutableList immutableList, int i, String str, ImmutableList immutableList2, int i2, String str2, String str3, String str4, String str5, ImmutableList immutableList3, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        PersistentList persistentListPersistentListOf;
        int i5;
        String str7;
        String str8;
        PersistentList persistentListPersistentListOf2 = (i4 & 1) != 0 ? ExtensionsKt.persistentListOf() : immutableList;
        int i6 = (i4 & 2) != 0 ? 0 : i;
        Object obj = null;
        if ((i4 & 4) != 0) {
            int i7 = component1 + 117;
            component3 = i7 % 128;
            if (i7 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str6 = "";
        } else {
            str6 = str;
        }
        if ((i4 & 8) != 0) {
            int i8 = component3 + 9;
            component1 = i8 % 128;
            if (i8 % 2 != 0) {
                persistentListPersistentListOf = ExtensionsKt.persistentListOf();
                int i9 = 0 / 0;
            } else {
                persistentListPersistentListOf = ExtensionsKt.persistentListOf();
            }
        } else {
            persistentListPersistentListOf = immutableList2;
        }
        if ((i4 & 16) != 0) {
            int i10 = component3 + 29;
            int i11 = i10 % 128;
            component1 = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 93;
            component3 = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i4 & 32) != 0) {
            int i16 = 2 % 2;
            str7 = "";
        } else {
            str7 = str2;
        }
        String str9 = (i4 & 64) != 0 ? "" : str3;
        if ((i4 & 128) != 0) {
            int i17 = component1 + 69;
            component3 = i17 % 128;
            if (i17 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str8 = "";
        } else {
            str8 = str4;
        }
        this(persistentListPersistentListOf2, i6, str6, persistentListPersistentListOf, i5, str7, str9, str8, (i4 & 256) == 0 ? str5 : "", (i4 & 512) != 0 ? ExtensionsKt.persistentListOf() : immutableList3, (i4 & 1024) == 0 ? i3 : 0);
    }

    public final ImmutableList<SelectionItem> getSourceOfFundsSelection() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ImmutableList<SelectionItem> immutableList = this.sourceOfFundsSelection;
        int i4 = i3 + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return immutableList;
    }

    public final int getSelectedSourceOfFundsIndex() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 67;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.selectedSourceOfFundsIndex;
        int i5 = i2 + 63;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String getOtherSourceOfFunds() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 123;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.otherSourceOfFunds;
        int i5 = i2 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ImmutableList<SelectionItem> getPurposeOfFundsSelection() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.purposeOfFundsSelection;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getSelectedPurposeOfFundsIndex() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.selectedPurposeOfFundsIndex;
        if (i3 != 0) {
            int i5 = 89 / 0;
        }
        return i4;
    }

    public final String getOtherPurposeOfFunds() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.otherPurposeOfFunds;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSelectedCountry() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.selectedCountry;
        int i5 = i3 + 69;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public final String getSelectedCountryIso() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.selectedCountryIso;
        int i5 = i2 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSelectedCountryFlag() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.selectedCountryFlag;
        int i5 = i3 + 97;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ImmutableList<SelectionItem> getCurrencySelection() {
        ImmutableList<SelectionItem> immutableList;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            immutableList = this.currencySelection;
            int i4 = 54 / 0;
        } else {
            immutableList = this.currencySelection;
        }
        int i5 = i2 + 69;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return immutableList;
    }

    public final int getSelectedCurrencyIndex() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.selectedCurrencyIndex;
        int i5 = i3 + 115;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return i4;
    }

    public final boolean isButtonEnabled() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (isSourceOfFundsValid()) {
            int i4 = component1 + 61;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            if (!(!isPurposeOfFundsValid())) {
                return true;
            }
        }
        return false;
    }

    private final boolean isSourceOfFundsValid() {
        int i = 2 % 2;
        boolean z = true;
        if (this.selectedSourceOfFundsIndex == CollectionsKt.getLastIndex(this.sourceOfFundsSelection) && this.otherSourceOfFunds.length() == 0) {
            int i2 = component1 + 83;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                z = false;
            }
        }
        int i3 = component1 + 89;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return z;
    }

    private final boolean isPurposeOfFundsValid() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (this.selectedPurposeOfFundsIndex != CollectionsKt.getLastIndex(this.purposeOfFundsSelection) || this.otherPurposeOfFunds.length() != 0) {
            return true;
        }
        int i4 = component1 + 93;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    static {
        int i = ShareDataUIState + 9;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 15 / 0;
        }
    }

    public SelectionDetailsState() {
        this(null, 0, null, null, 0, null, null, null, null, null, 0, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SelectionDetailsState copy$default(SelectionDetailsState selectionDetailsState, ImmutableList immutableList, int i, String str, ImmutableList immutableList2, int i2, String str2, String str3, String str4, String str5, ImmutableList immutableList3, int i3, int i4, Object obj) {
        int i5;
        String str6;
        ImmutableList immutableList4;
        int i6;
        int i7;
        int i8 = 2 % 2;
        ImmutableList immutableList5 = (i4 & 1) != 0 ? selectionDetailsState.sourceOfFundsSelection : immutableList;
        if ((i4 & 2) != 0) {
            int i9 = component1 + 63;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            i5 = selectionDetailsState.selectedSourceOfFundsIndex;
        } else {
            i5 = i;
        }
        if ((i4 & 4) != 0) {
            int i11 = component1 + 27;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            str6 = selectionDetailsState.otherSourceOfFunds;
        } else {
            str6 = str;
        }
        if ((i4 & 8) != 0) {
            int i13 = component1 + 75;
            component3 = i13 % 128;
            int i14 = i13 % 2;
            immutableList4 = selectionDetailsState.purposeOfFundsSelection;
        } else {
            immutableList4 = immutableList2;
        }
        if ((i4 & 16) != 0) {
            int i15 = component1 + 105;
            component3 = i15 % 128;
            int i16 = i15 % 2;
            i6 = selectionDetailsState.selectedPurposeOfFundsIndex;
        } else {
            i6 = i2;
        }
        String str7 = (i4 & 32) != 0 ? selectionDetailsState.otherPurposeOfFunds : str2;
        String str8 = (i4 & 64) != 0 ? selectionDetailsState.selectedCountry : str3;
        String str9 = (i4 & 128) != 0 ? selectionDetailsState.selectedCountryIso : str4;
        String str10 = (i4 & 256) != 0 ? selectionDetailsState.selectedCountryFlag : str5;
        ImmutableList immutableList6 = (i4 & 512) != 0 ? selectionDetailsState.currencySelection : immutableList3;
        if ((i4 & 1024) != 0) {
            int i17 = component1 + 31;
            component3 = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = selectionDetailsState.selectedCurrencyIndex;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i7 = selectionDetailsState.selectedCurrencyIndex;
        } else {
            i7 = i3;
        }
        return selectionDetailsState.copy(immutableList5, i5, str6, immutableList4, i6, str7, str8, str9, str10, immutableList6, i7);
    }

    public final ImmutableList<SelectionItem> component1() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        ImmutableList<SelectionItem> immutableList = this.sourceOfFundsSelection;
        int i5 = i3 + 45;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return immutableList;
    }

    public final ImmutableList<SelectionItem> component10() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 75;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ImmutableList<SelectionItem> immutableList = this.currencySelection;
        int i5 = i2 + 1;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return immutableList;
    }

    public final int component11() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.selectedCurrencyIndex;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.selectedSourceOfFundsIndex;
        if (i3 == 0) {
            int i5 = 52 / 0;
        }
        return i4;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 41;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.otherSourceOfFunds;
        int i5 = i2 + 97;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return str;
    }

    public final ImmutableList<SelectionItem> component4() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        ImmutableList<SelectionItem> immutableList = this.purposeOfFundsSelection;
        int i5 = i3 + 23;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return immutableList;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.selectedPurposeOfFundsIndex;
        int i6 = i3 + 63;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.otherPurposeOfFunds;
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.selectedCountry;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.selectedCountryIso;
        int i5 = i3 + 35;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.selectedCountryFlag;
        int i5 = i3 + 91;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SelectionDetailsState copy(ImmutableList<SelectionItem> sourceOfFundsSelection, int selectedSourceOfFundsIndex, String otherSourceOfFunds, ImmutableList<SelectionItem> purposeOfFundsSelection, int selectedPurposeOfFundsIndex, String otherPurposeOfFunds, String selectedCountry, String selectedCountryIso, String selectedCountryFlag, ImmutableList<SelectionItem> currencySelection, int selectedCurrencyIndex) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sourceOfFundsSelection, "");
        Intrinsics.checkNotNullParameter(otherSourceOfFunds, "");
        Intrinsics.checkNotNullParameter(purposeOfFundsSelection, "");
        Intrinsics.checkNotNullParameter(otherPurposeOfFunds, "");
        Intrinsics.checkNotNullParameter(selectedCountry, "");
        Intrinsics.checkNotNullParameter(selectedCountryIso, "");
        Intrinsics.checkNotNullParameter(selectedCountryFlag, "");
        Intrinsics.checkNotNullParameter(currencySelection, "");
        SelectionDetailsState selectionDetailsState = new SelectionDetailsState(sourceOfFundsSelection, selectedSourceOfFundsIndex, otherSourceOfFunds, purposeOfFundsSelection, selectedPurposeOfFundsIndex, otherPurposeOfFunds, selectedCountry, selectedCountryIso, selectedCountryFlag, currencySelection, selectedCurrencyIndex);
        int i2 = component3 + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return selectionDetailsState;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionDetailsState)) {
            int i2 = component1 + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        SelectionDetailsState selectionDetailsState = (SelectionDetailsState) other;
        if (!Intrinsics.areEqual(this.sourceOfFundsSelection, selectionDetailsState.sourceOfFundsSelection)) {
            return false;
        }
        if (this.selectedSourceOfFundsIndex != selectionDetailsState.selectedSourceOfFundsIndex) {
            int i4 = component3 + 35;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.otherSourceOfFunds, selectionDetailsState.otherSourceOfFunds)) {
            int i6 = component1 + 93;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.purposeOfFundsSelection, selectionDetailsState.purposeOfFundsSelection) || this.selectedPurposeOfFundsIndex != selectionDetailsState.selectedPurposeOfFundsIndex || !Intrinsics.areEqual(this.otherPurposeOfFunds, selectionDetailsState.otherPurposeOfFunds) || !Intrinsics.areEqual(this.selectedCountry, selectionDetailsState.selectedCountry) || !Intrinsics.areEqual(this.selectedCountryIso, selectionDetailsState.selectedCountryIso)) {
            return false;
        }
        if (Intrinsics.areEqual(this.selectedCountryFlag, selectionDetailsState.selectedCountryFlag)) {
            return Intrinsics.areEqual(this.currencySelection, selectionDetailsState.currencySelection) && this.selectedCurrencyIndex == selectionDetailsState.selectedCurrencyIndex;
        }
        int i8 = component1 + 45;
        component3 = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((this.sourceOfFundsSelection.hashCode() * 31) + Integer.hashCode(this.selectedSourceOfFundsIndex)) * 31) + this.otherSourceOfFunds.hashCode()) * 31) + this.purposeOfFundsSelection.hashCode()) * 31) + Integer.hashCode(this.selectedPurposeOfFundsIndex)) * 31) + this.otherPurposeOfFunds.hashCode()) * 31) + this.selectedCountry.hashCode()) * 31) + this.selectedCountryIso.hashCode()) * 31) + this.selectedCountryFlag.hashCode()) * 31) + this.currencySelection.hashCode()) * 31) + Integer.hashCode(this.selectedCurrencyIndex);
        int i4 = component1 + 73;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SelectionDetailsState(sourceOfFundsSelection=" + this.sourceOfFundsSelection + ", selectedSourceOfFundsIndex=" + this.selectedSourceOfFundsIndex + ", otherSourceOfFunds=" + this.otherSourceOfFunds + ", purposeOfFundsSelection=" + this.purposeOfFundsSelection + ", selectedPurposeOfFundsIndex=" + this.selectedPurposeOfFundsIndex + ", otherPurposeOfFunds=" + this.otherPurposeOfFunds + ", selectedCountry=" + this.selectedCountry + ", selectedCountryIso=" + this.selectedCountryIso + ", selectedCountryFlag=" + this.selectedCountryFlag + ", currencySelection=" + this.currencySelection + ", selectedCurrencyIndex=" + this.selectedCurrencyIndex + ')';
        int i2 = component3 + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        ImmutableList<SelectionItem> immutableList = this.sourceOfFundsSelection;
        dest.writeInt(immutableList.size());
        Iterator<SelectionItem> it = immutableList.iterator();
        while (it.hasNext()) {
            int i2 = component1 + 37;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                it.next().writeToParcel(dest, flags);
                int i3 = 17 / 0;
            } else {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.selectedSourceOfFundsIndex);
        dest.writeString(this.otherSourceOfFunds);
        ImmutableList<SelectionItem> immutableList2 = this.purposeOfFundsSelection;
        dest.writeInt(immutableList2.size());
        Iterator<SelectionItem> it2 = immutableList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
            int i4 = component1 + 29;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 2;
            }
        }
        dest.writeInt(this.selectedPurposeOfFundsIndex);
        dest.writeString(this.otherPurposeOfFunds);
        dest.writeString(this.selectedCountry);
        dest.writeString(this.selectedCountryIso);
        dest.writeString(this.selectedCountryFlag);
        ImmutableList<SelectionItem> immutableList3 = this.currencySelection;
        dest.writeInt(immutableList3.size());
        Iterator<SelectionItem> it3 = immutableList3.iterator();
        while (!(!it3.hasNext())) {
            it3.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.selectedCurrencyIndex);
        int i6 = component3 + 125;
        component1 = i6 % 128;
        int i7 = i6 % 2;
    }
}
